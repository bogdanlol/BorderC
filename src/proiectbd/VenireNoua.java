package proiectbd;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class VenireNoua extends JPanel {
	public JTextField txtNumar;
	public JTextField txtNume;
	public JTextField txtPrenume;
	public JTextField txtCnp;
	public JTextField txtVarsta;
	public JTextField txtCuloare;
	public JTextField txtOraVenirii;
	public JTextField txtOraPlecarii;
	private JTextField txtCountPersoana;
	private JTextField txtCountMasina;
	private JTextField txtCountVerif;
	private JTextField txtOfiterResponsabil;
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
	/**
	 * Create the panel.
	 */
	public VenireNoua() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Masina");
		lblNewLabel.setBounds(138, 0, 46, 14);
		add(lblNewLabel);
		
		JLabel lblPersoana = new JLabel("Persoana");
		lblPersoana.setBounds(10, 0, 46, 14);
		add(lblPersoana);
		
		txtNumar = new JTextField();
		txtNumar.setForeground(Color.LIGHT_GRAY);
		txtNumar.setText("Numar");
		txtNumar.setBounds(119, 20, 86, 20);
		add(txtNumar);
		txtNumar.setColumns(10);
		
		txtNume = new JTextField();
		txtNume.setForeground(Color.LIGHT_GRAY);
		txtNume.setText("Nume");
		txtNume.setBounds(0, 25, 86, 20);
		add(txtNume);
		txtNume.setColumns(10);
		
		txtPrenume = new JTextField();
		txtPrenume.setText("Prenume");
		txtPrenume.setForeground(Color.LIGHT_GRAY);
		txtPrenume.setColumns(10);
		txtPrenume.setBounds(0, 56, 86, 20);
		add(txtPrenume);
		
		txtCnp = new JTextField();
		txtCnp.setText("CNP");
		txtCnp.setForeground(Color.LIGHT_GRAY);
		txtCnp.setColumns(10);
		txtCnp.setBounds(0, 87, 86, 20);
		add(txtCnp);
		
		txtVarsta = new JTextField();
		txtVarsta.setText("Varsta");
		txtVarsta.setForeground(Color.LIGHT_GRAY);
		txtVarsta.setColumns(10);
		txtVarsta.setBounds(0, 118, 86, 20);
		add(txtVarsta);
		
		txtCuloare = new JTextField();
		txtCuloare.setText("Culoare");
		txtCuloare.setForeground(Color.LIGHT_GRAY);
		txtCuloare.setColumns(10);
		txtCuloare.setBounds(119, 56, 86, 20);
		add(txtCuloare);
		
		JLabel lblVerificare = new JLabel("Verificare");
		lblVerificare.setBounds(264, 0, 46, 14);
		add(lblVerificare);
		
		txtOraVenirii = new JTextField();
		txtOraVenirii.setText("Ora Venirii");
		txtOraVenirii.setForeground(Color.LIGHT_GRAY);
		txtOraVenirii.setColumns(10);
		txtOraVenirii.setBounds(253, 20, 86, 20);
		add(txtOraVenirii);
		
		txtOraPlecarii = new JTextField();
		txtOraPlecarii.setText("Ora Plecarii");
		txtOraPlecarii.setForeground(Color.LIGHT_GRAY);
		txtOraPlecarii.setColumns(10);
		txtOraPlecarii.setBounds(253, 56, 86, 20);
		add(txtOraPlecarii);
		
		
		
		txtCountPersoana = new JTextField();
		txtCountPersoana.setForeground(Color.LIGHT_GRAY);
		txtCountPersoana.setText("Count Persoana");
		txtCountPersoana.setBounds(10, 232, 86, 20);
		add(txtCountPersoana);
		txtCountPersoana.setColumns(10);
		
		txtCountMasina = new JTextField();
		txtCountMasina.setForeground(Color.LIGHT_GRAY);
		txtCountMasina.setText("Count Masina");
		txtCountMasina.setBounds(119, 232, 86, 20);
		add(txtCountMasina);
		txtCountMasina.setColumns(10);
		
		txtCountVerif = new JTextField();
		txtCountVerif.setForeground(Color.LIGHT_GRAY);
		txtCountVerif.setText("Count Verif");
		txtCountVerif.setBounds(253, 232, 86, 20);
		add(txtCountVerif);
		txtCountVerif.setColumns(10);
		
		txtOfiterResponsabil = new JTextField();
		txtOfiterResponsabil.setText("Ofiter responsabil");
		txtOfiterResponsabil.setForeground(Color.LIGHT_GRAY);
		txtOfiterResponsabil.setBounds(119, 263, 108, 20);
		add(txtOfiterResponsabil);
		txtOfiterResponsabil.setColumns(10);
		
		JButton btnInserare = new JButton("Inserare");
		btnInserare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				connection("INSERT INTO MASINA(codm,numar,culoare) values("+txtCountMasina.getText()+","+"'"+txtNumar.getText()+"'"+","+"'"+txtCuloare.getText()+"'"+")");
				connection("INSERT INTO PERSOANA(codp,nume,pren,varsta,CNP,codm) values("+txtCountPersoana.getText()+","+"'"+txtNume.getText()+"'"+","+"'"+txtPrenume.getText()+"'"+","+txtVarsta.getText()+","+"'"+txtCnp.getText()+"'"+","+txtCountMasina.getText()+")");
				connection("INSERT INTO VERIFICARE(codv,codp,codm,codo,orav,orap)  values("+txtCountVerif.getText()+","+txtCountPersoana.getText()+","+txtCountMasina.getText()+","+txtOfiterResponsabil.getText()+","+"'"+txtOraVenirii.getText()+"'"+","+"'"+txtOraPlecarii.getText()+"'"+")");	
				
				
				
}
		});
		btnInserare.setBounds(138, 178, 89, 23);
		add(btnInserare);
		
		

	}
}
