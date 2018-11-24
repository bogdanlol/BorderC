package proiectbd;

import javax.swing.JPanel;
import javax.swing.JTable;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;

public class Afisare extends JPanel {
	
	public Afisare() {
		setLayout(null);
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cti.ugal.ro:1521:db","cald33","oracle");
		Statement st =con.createStatement();
		String sql="select * from emp";
		ResultSet rs = st.executeQuery(sql);
		ListTableModel model = ListTableModel.createModelFromResultSet( rs );
		JTable table = new JTable( model );
		
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		


}
	


}