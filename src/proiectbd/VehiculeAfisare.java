package proiectbd;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VehiculeAfisare extends JPanel
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VehiculeAfisare()
    {
        Vector<Object> columnNames = new Vector<Object>();
        Vector<Object> data = new Vector<Object>();

        try
        {
            //  Connect to an Access Database

            String driver = "oracle.jdbc.driver.OracleDriver";
//            String url = "jdbc:odbc:???";  // if using ODBC Data Source name
          
              
           
            Class.forName( driver );
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cti.ugal.ro:1521:db","cald33","oracle");

            //  Read data from a table

            String sql = "Select * from Masina";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            //  Get column names

            for (int i = 1; i <= columns; i++)
            {
                columnNames.addElement( md.getColumnName(i) );
            }

            //  Get row data

            while (rs.next())
            {
                Vector<Object> row = new Vector<Object>(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.addElement( rs.getObject(i) );
                }

                data.addElement( row );
            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println( e );
        }

        //  Create table with database data

        DefaultTableModel model = new DefaultTableModel(data, columnNames)
        {
        	/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };

		JTable table = new JTable( model );
        JScrollPane scrollPane = new JScrollPane( table );
        add( scrollPane );

        JPanel buttonPanel = new JPanel();
        add( buttonPanel, BorderLayout.SOUTH );
    }

    public static void main(String[] args)
    {
        TableFromDatabase frame = new TableFromDatabase();
        frame.setBounds(80, 80, 500, 500);
        frame.setVisible(true);
    }
}