package proiectbd;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class InserareAngajat extends JPanel {
	public void connection(String sql){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cti.ugal.ro:1521:db","cald33","oracle");
			Statement st =con.createStatement();
			
			st.executeUpdate(sql);
			
			
			con.close();
			}
			catch(Exception e){
				System.out.println(e);
				
			}}
	private JTextField textCodo;
	private JTextField textNume;
	private JTextField textPren;
	private JTextField textRang;

	/**
	 * Create the panel.
	 */
	public InserareAngajat() {
		setLayout(null);
		
		textCodo = new JTextField();
		textCodo.setBounds(10, 113, 86, 20);
		add(textCodo);
		textCodo.setColumns(10);
		
		JLabel lblCodOfiter = new JLabel("Cod Ofiter");
		lblCodOfiter.setBounds(10, 87, 86, 14);
		add(lblCodOfiter);
		
		textNume = new JTextField();
		textNume.setBounds(108, 113, 86, 20);
		add(textNume);
		textNume.setColumns(10);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setBounds(114, 87, 46, 14);
		add(lblNume);
		
		textPren = new JTextField();
		textPren.setBounds(204, 113, 86, 20);
		add(textPren);
		textPren.setColumns(10);
		
		JLabel lblPrenume = new JLabel("Prenume");
		lblPrenume.setBounds(212, 87, 46, 14);
		add(lblPrenume);
		
		textRang = new JTextField();
		textRang.setBounds(300, 113, 86, 20);
		add(textRang);
		textRang.setColumns(10);
		
		JLabel lblRang = new JLabel("Rang");
		lblRang.setBounds(298, 87, 46, 14);
		add(lblRang);
		
		JButton btnInserare = new JButton("Inserare");
		btnInserare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("INSERT INTO PERSONAL VALUES("+textCodo.getText()+",'"+textNume.getText()+"','"+textPren.getText()+"','"+textRang.getText()+"')");
				
			}
		});
		btnInserare.setBounds(157, 161, 89, 23);
		add(btnInserare);

	}

}
