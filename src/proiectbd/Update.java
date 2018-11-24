package proiectbd;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Update extends JPanel {
	private JTextField txtNume;
	private JTextField txtNumeNou;
	private JTextField txtPrenume;
	private JTextField txtPrenumeNou;
	private JTextField txtCnp;
	private JTextField txtCnpNou;
	private JTextField txtVarsta;
	private JTextField txtVarstaNoua;
	private JTextField txtNumar;
	private JTextField txtNumarNou;
	private JTextField txtCuloare;
	private JTextField txtCuloareNoua;
	private JTextField txtOraVenirii;
	private JTextField txtNouaOraA;
	private JTextField txtOraPlecarii;
	private JTextField txtNouaOraA_1;
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
	public Update() {
		
		setLayout(null);
		
		txtNume = new JTextField();
		txtNume.setText("Nume");
		txtNume.setBounds(13, 56, 86, 20);
		add(txtNume);
		txtNume.setColumns(10);
		
		
		
		JLabel lblPersoana = new JLabel("Persoana");
		lblPersoana.setBounds(78, 24, 46, 14);
		add(lblPersoana);
		
		txtNumeNou = new JTextField();
		txtNumeNou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("UPDATE PERSOANA SET NUME ='"+txtNumeNou.getText()+"' where NUME ='"+txtNume.getText()+"'");
			
			}
		});
		txtNumeNou.setText("Nume nou");
		txtNumeNou.setBounds(105, 56, 86, 20);
		add(txtNumeNou);
		txtNumeNou.setColumns(10);
		
		txtPrenume = new JTextField();
		txtPrenume.setText("Prenume");
		txtPrenume.setBounds(13, 87, 86, 20);
		add(txtPrenume);
		txtPrenume.setColumns(10);
		
		txtPrenumeNou = new JTextField();
		txtPrenumeNou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("UPDATE PERSOANA SET PREN ='"+txtPrenumeNou.getText()+"' where PREN ='"+txtPrenume.getText()+"'");
			}
		});
		txtPrenumeNou.setText("Prenume nou");
		txtPrenumeNou.setBounds(105, 87, 86, 20);
		add(txtPrenumeNou);
		txtPrenumeNou.setColumns(10);
		
		txtCnp = new JTextField();
		txtCnp.setText("CNP");
		txtCnp.setBounds(13, 118, 86, 20);
		add(txtCnp);
		txtCnp.setColumns(10);
		
		txtCnpNou = new JTextField();
		txtCnpNou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("UPDATE PERSOANA SET CNP ='"+txtCnpNou.getText()+"' where CNP ='"+txtCnp.getText()+"'");
			}
		});
		txtCnpNou.setText("CNP Nou");
		txtCnpNou.setBounds(105, 118, 86, 20);
		add(txtCnpNou);
		txtCnpNou.setColumns(10);
		
		txtVarsta = new JTextField();
		txtVarsta.setText("Varsta");
		txtVarsta.setBounds(13, 150, 86, 20);
		add(txtVarsta);
		txtVarsta.setColumns(10);
		
		txtVarstaNoua = new JTextField();
		txtVarstaNoua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("UPDATE PERSOANA SET Varsta ="+txtVarstaNoua.getText()+" where Varsta ="+txtVarsta.getText());
				
			}
		});
		txtVarstaNoua.setText("Varsta noua");
		txtVarstaNoua.setBounds(105, 150, 86, 20);
		add(txtVarstaNoua);
		txtVarstaNoua.setColumns(10);
		
		JLabel lblMasina = new JLabel("Masina");
		lblMasina.setBounds(272, 24, 46, 14);
		add(lblMasina);
		
		txtNumar = new JTextField();
		txtNumar.setText("Numar");
		txtNumar.setBounds(216, 56, 86, 20);
		add(txtNumar);
		txtNumar.setColumns(10);
		
		txtNumarNou = new JTextField();
		txtNumarNou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("UPDATE MASINA SET NUMAR ='"+txtNumarNou.getText()+"' where NUMAR ='"+txtNumar.getText()+"'");
			}
		});
		txtNumarNou.setText("Numar nou");
		txtNumarNou.setBounds(314, 56, 86, 20);
		add(txtNumarNou);
		txtNumarNou.setColumns(10);
		
		txtCuloare = new JTextField();
		txtCuloare.setText("Culoare");
		txtCuloare.setBounds(216, 87, 86, 20);
		add(txtCuloare);
		txtCuloare.setColumns(10);
		
		txtCuloareNoua = new JTextField();
		txtCuloareNoua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("UPDATE MASINA SET CULOARE ='"+txtCuloareNoua.getText()+"' where CULOARE ='"+txtCuloare.getText()+"'");
			}
		});
		txtCuloareNoua.setText("Culoare noua");
		txtCuloareNoua.setBounds(314, 87, 86, 20);
		add(txtCuloareNoua);
		txtCuloareNoua.setColumns(10);
		
		JLabel lblVerificare = new JLabel("Verificare");
		lblVerificare.setBounds(272, 137, 46, 14);
		add(lblVerificare);
		
		txtOraVenirii = new JTextField();
		txtOraVenirii.setText("Ora venirii");
		txtOraVenirii.setBounds(216, 175, 86, 20);
		add(txtOraVenirii);
		txtOraVenirii.setColumns(10);
		
		txtNouaOraA = new JTextField();
		txtNouaOraA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("UPDATE VERIFICARE SET ORAV ='"+txtNouaOraA.getText()+"' where ORAV ='"+txtOraVenirii.getText()+"'");
			}
		});
		txtNouaOraA.setText("Noua ora a venirii");
		txtNouaOraA.setBounds(314, 175, 101, 20);
		add(txtNouaOraA);
		txtNouaOraA.setColumns(10);
		
		txtOraPlecarii = new JTextField();
		txtOraPlecarii.setText("Ora plecarii");
		txtOraPlecarii.setBounds(216, 206, 86, 20);
		add(txtOraPlecarii);
		txtOraPlecarii.setColumns(10);
		
		txtNouaOraA_1 = new JTextField();
		txtNouaOraA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("UPDATE VERIFICARE SET ORAP ='"+txtNouaOraA_1.getText()+"' where ORAP ='"+txtOraPlecarii.getText()+"'");
			}
		});
		txtNouaOraA_1.setText("Noua ora a plecarii");
		txtNouaOraA_1.setBounds(314, 206, 101, 20);
		add(txtNouaOraA_1);
		txtNouaOraA_1.setColumns(10);
		
		
		

	}
}
