package proiectbd;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InserareMasina extends JPanel {
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
	private JTextField txtCodm;
	private JTextField txtNumar;
	private JTextField txtCuloare;
	private JLabel lblCodMasina;
	private JLabel lblNumarMasina;
	private JLabel lblNewLabel;
	private JLabel lblCodPersoana;
	private JTextField txtCodp;
	private JLabel lblNume;
	private JTextField txtNume;
	private JLabel lblPrenume;
	private JTextField txtPrenume;
	private JLabel lblCnp;
	private JTextField txtCnp;
	private JLabel lblVarsta;
	private JLabel lblCodm;
	private JTextField txtVarsta;
	private JTextField txtCodm_1;
	private JButton btnNewButton;
	private JLabel lblCodv;
	private JTextField TxtCodVerificare;
	private JLabel lblCodp;
	private JTextField TxtCodPersoana;
	private JTextField TxtCodMasina;
	private JLabel lblCodm_1;
	private JLabel lblCodo;
	private JTextField TxtCodOfiter;
	private JTextField TxtOraVenirii;
	private JLabel lblOraVenirii;
	private JTextField TxtOraPlecarii;
	private JLabel lblOraPlecarii;
	private JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */
	public InserareMasina() {
		setLayout(null);
		
		txtCodm = new JTextField();
		txtCodm.setText("CODM");
		txtCodm.setBounds(34, 29, 86, 20);
		add(txtCodm);
		txtCodm.setColumns(10);
		
		txtNumar = new JTextField();
		txtNumar.setText("NUMAR");
		txtNumar.setBounds(131, 29, 86, 20);
		add(txtNumar);
		txtNumar.setColumns(10);
		
		txtCuloare = new JTextField();
		txtCuloare.setText("CULOARE");
		txtCuloare.setBounds(227, 29, 86, 20);
		add(txtCuloare);
		txtCuloare.setColumns(10);
		
		JButton btnInsereaza = new JButton("Insereaza Masina");
		btnInsereaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("INSERT INTO MASINA VALUES("+txtCodm.getText()+",'"+txtNumar.getText()+"','"+txtCuloare.getText()+"')");
				
			}
		});
		btnInsereaza.setBounds(131, 70, 129, 23);
		add(btnInsereaza);
		
		lblCodMasina = new JLabel("Cod Masina");
		lblCodMasina.setBounds(34, 11, 86, 14);
		add(lblCodMasina);
		
		lblNumarMasina = new JLabel("Numar Masina");
		lblNumarMasina.setBounds(131, 11, 86, 14);
		add(lblNumarMasina);
		
		lblNewLabel = new JLabel("Culoare");
		lblNewLabel.setBounds(227, 11, 86, 14);
		add(lblNewLabel);
		
		lblCodPersoana = new JLabel("Cod Persoana");
		lblCodPersoana.setBounds(0, 99, 67, 14);
		add(lblCodPersoana);
		
		txtCodp = new JTextField();
		txtCodp.setText("Codp");
		txtCodp.setBounds(0, 124, 43, 20);
		add(txtCodp);
		txtCodp.setColumns(10);
		
		lblNume = new JLabel("Nume");
		lblNume.setBounds(77, 99, 46, 14);
		add(lblNume);
		
		txtNume = new JTextField();
		txtNume.setText("Nume");
		txtNume.setBounds(64, 124, 59, 20);
		add(txtNume);
		txtNume.setColumns(10);
		
		lblPrenume = new JLabel("Prenume");
		lblPrenume.setBounds(131, 99, 46, 14);
		add(lblPrenume);
		
		txtPrenume = new JTextField();
		txtPrenume.setText("Prenume");
		txtPrenume.setBounds(131, 124, 53, 20);
		add(txtPrenume);
		txtPrenume.setColumns(10);
		
		lblCnp = new JLabel("CNP");
		lblCnp.setBounds(214, 99, 46, 14);
		add(lblCnp);
		
		txtCnp = new JTextField();
		txtCnp.setText("CNP");
		txtCnp.setBounds(194, 124, 86, 20);
		add(txtCnp);
		txtCnp.setColumns(10);
		
		lblVarsta = new JLabel("Varsta");
		lblVarsta.setBounds(294, 99, 46, 14);
		add(lblVarsta);
		
		lblCodm = new JLabel("CODM");
		lblCodm.setBounds(356, 99, 46, 14);
		add(lblCodm);
		
		txtVarsta = new JTextField();
		txtVarsta.setText("Varsta");
		txtVarsta.setBounds(290, 124, 43, 20);
		add(txtVarsta);
		txtVarsta.setColumns(10);
		
		txtCodm_1 = new JTextField();
		txtCodm_1.setText("CODM");
		txtCodm_1.setBounds(343, 124, 46, 20);
		add(txtCodm_1);
		txtCodm_1.setColumns(10);
		
		btnNewButton = new JButton("Insereaza Persoana");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("INSERT INTO PERSOANA(codp,nume,pren,varsta,CNP,codm) values("+txtCodp.getText()+","+"'"+txtNume.getText()+"'"+","+"'"+txtPrenume.getText()+"'"+","+txtVarsta.getText()+","+"'"+txtCnp.getText()+"'"+","+txtCodm_1.getText()+")");
			}
		});
		btnNewButton.setBounds(131, 165, 129, 23);
		add(btnNewButton);
		
		lblCodv = new JLabel("CODV");
		lblCodv.setBounds(0, 204, 46, 14);
		add(lblCodv);
		
		TxtCodVerificare = new JTextField();
		TxtCodVerificare.setBounds(0, 229, 28, 20);
		add(TxtCodVerificare);
		TxtCodVerificare.setColumns(10);
		
		lblCodp = new JLabel("CODP");
		lblCodp.setBounds(42, 204, 46, 14);
		add(lblCodp);
		
		TxtCodPersoana = new JTextField();
		TxtCodPersoana.setBounds(34, 229, 33, 20);
		add(TxtCodPersoana);
		TxtCodPersoana.setColumns(10);
		
		TxtCodMasina = new JTextField();
		TxtCodMasina.setBounds(77, 229, 28, 20);
		add(TxtCodMasina);
		TxtCodMasina.setColumns(10);
		
		lblCodm_1 = new JLabel("Codm");
		lblCodm_1.setBounds(77, 204, 28, 14);
		add(lblCodm_1);
		
		lblCodo = new JLabel("CODO");
		lblCodo.setBounds(115, 204, 46, 14);
		add(lblCodo);
		
		TxtCodOfiter = new JTextField();
		TxtCodOfiter.setBounds(115, 229, 28, 20);
		add(TxtCodOfiter);
		TxtCodOfiter.setColumns(10);
		
		TxtOraVenirii = new JTextField();
		TxtOraVenirii.setBounds(152, 229, 86, 20);
		add(TxtOraVenirii);
		TxtOraVenirii.setColumns(10);
		
		lblOraVenirii = new JLabel("Ora Venirii");
		lblOraVenirii.setBounds(171, 204, 65, 14);
		add(lblOraVenirii);
		
		TxtOraPlecarii = new JTextField();
		TxtOraPlecarii.setBounds(248, 229, 86, 20);
		add(TxtOraPlecarii);
		TxtOraPlecarii.setColumns(10);
		
		lblOraPlecarii = new JLabel("Ora Plecarii");
		lblOraPlecarii.setBounds(255, 204, 76, 14);
		add(lblOraPlecarii);
		
		btnNewButton_1 = new JButton("Insereaza Verificare");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connection("INSERT INTO VERIFICARE(codv,codp,codm,codo,orav,orap)  values("+TxtCodVerificare.getText()+","+TxtCodPersoana.getText()+","+TxtCodMasina.getText()+","+TxtCodOfiter.getText()+","+"'"+TxtOraVenirii.getText()+"'"+","+"'"+TxtOraPlecarii.getText()+"'"+")");
				
				
			}
		});
		btnNewButton_1.setBounds(131, 266, 129, 23);
		add(btnNewButton_1);
		

	}
}
