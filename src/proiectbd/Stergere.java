package proiectbd;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Stergere extends JPanel {
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
	private JTextField txtCodp;
	private JTextField txtNume;
	private JTextField txtPren;
	private JTextField txtCnp;
	private JTextField txtCodm;
	private JTextField txtNumar;
	private JTextField txtCodv;
	private JTextField txtOrap;
	private JTextField txtOrav;

	/**
	 * Create the panel.
	 */
	public Stergere() {
		setLayout(null);
		
		JLabel lblPersoana = new JLabel("Persoana");
		lblPersoana.setBounds(10, 21, 46, 14);
		add(lblPersoana);
		
		txtCodp = new JTextField();
		txtCodp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("DELETE FROM PERSOANA WHERE CODP ="+txtCodp.getText());
			}
		});
		txtCodp.setText("CODP");
		txtCodp.setBounds(10, 46, 86, 20);
		add(txtCodp);
		txtCodp.setColumns(10);
		
		txtNume = new JTextField();
		txtNume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("DELETE FROM PERSOANA WHERE NUME ='"+txtNume.getText()+"'");
			}
		});
		txtNume.setText("NUME");
		txtNume.setBounds(10, 77, 86, 20);
		add(txtNume);
		txtNume.setColumns(10);
		
		txtPren = new JTextField();
		txtPren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("DELETE FROM PERSOANA WHERE PREN ='"+txtPren.getText()+"'");
			}
		});
		txtPren.setText("PREN");
		txtPren.setBounds(10, 112, 86, 20);
		add(txtPren);
		txtPren.setColumns(10);
		
		txtCnp = new JTextField();
		txtCnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("DELETE FROM PERSOANA WHERE CNP ='"+txtCnp.getText()+"'");
			}
		});
		txtCnp.setText("CNP");
		txtCnp.setBounds(10, 143, 86, 20);
		add(txtCnp);
		txtCnp.setColumns(10);
		
		JLabel lblMasina = new JLabel("Masina");
		lblMasina.setBounds(145, 21, 46, 14);
		add(lblMasina);
		
		txtCodm = new JTextField();
		txtCodm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("DELETE FROM MASINA WHERE CODM ="+txtCodm.getText());
			}
			
		});
		txtCodm.setText("CODM");
		txtCodm.setBounds(119, 46, 86, 20);
		add(txtCodm);
		txtCodm.setColumns(10);
		
		txtNumar = new JTextField();
		txtNumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("DELETE FROM MASINA WHERE NUMAR ='"+txtNumar.getText()+"'");
			}
		});
		txtNumar.setText("NUMAR");
		txtNumar.setBounds(119, 77, 86, 20);
		add(txtNumar);
		txtNumar.setColumns(10);
		
		JLabel lblVerificare = new JLabel("Verificare");
		lblVerificare.setBounds(270, 21, 46, 14);
		add(lblVerificare);
		
		txtCodv = new JTextField();
		txtCodv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("DELETE FROM VERIFICARE WHERE codv ="+txtCodv.getText());
			}
		});
		txtCodv.setText("CODV");
		txtCodv.setBounds(252, 46, 86, 20);
		add(txtCodv);
		txtCodv.setColumns(10);
		
		txtOrap = new JTextField();
		txtOrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("DELETE FROM VERIFICARE WHERE ORAP ='"+txtOrap.getText()+"'");
			}
		});
		txtOrap.setText("ORAP");
		txtOrap.setBounds(252, 77, 86, 20);
		add(txtOrap);
		txtOrap.setColumns(10);
		
		txtOrav = new JTextField();
		txtOrav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("DELETE FROM VERIFICARE WHERE ORAV ='"+txtOrav.getText()+"'");
			}
		});
		txtOrav.setText("ORAV");
		txtOrav.setBounds(252, 112, 86, 20);
		add(txtOrav);
		txtOrav.setColumns(10);

		
		
	}

}
