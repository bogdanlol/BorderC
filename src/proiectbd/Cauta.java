package proiectbd;

import javax.swing.JPanel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cauta extends JPanel {
	private JTextField txtCodp;
	private JTextField txtNume;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JTextField txtCnp;
	private JTextField txtVarsta;
	private JTextField txtNumar;
	private JTextField txtCuloare;
	private JTextField txtOrav;
	private JTextField txtOrap;
	private JLabel lblVerificare;
	private JTextField txtOfiterulResponsabil;
	private JTextField txtCodm;
	public void connection(String sql){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cti.ugal.ro:1521:db","cald33","oracle");
			Statement st =con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()){
			textArea.append(rs.getString(1)+rs.getString(2));
			}
			
			con.close();
			}
			catch(Exception e){
				System.out.println(e);
				
			}}
	/**
	 * Create the panel.
	 */
	public Cauta() {
		setLayout(null);
		
		JLabel lblPersoana = new JLabel("Persoana");
		lblPersoana.setBounds(21, 8, 45, 14);
		add(lblPersoana);

		
		txtCodp = new JTextField();
		txtCodp.setBounds(76, 5, 86, 20);
		txtCodp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				CautareTabel cautare=new CautareTabel("select * from persoana where persoana.codp in ("+txtCodp.getText()+")");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
				
				
				
			
				
			}
		});
		txtCodp.setText("CODP");
		add(txtCodp);
		txtCodp.setColumns(10);
		
		txtNume = new JTextField();
		txtNume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CautareTabel cautare=new CautareTabel("select * from persoana where persoana.nume in ('"+txtNume.getText()+"')");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
			}
		});
		txtNume.setBounds(172, 5, 86, 20);
		txtNume.setText("NUME");
		add(txtNume);
		txtNume.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 512, 264);
		add(scrollPane);
		
		txtCnp = new JTextField();
		txtCnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CautareTabel cautare=new CautareTabel("select * from persoana where persoana.cnp in ('"+txtCnp.getText()+"')");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
				
			}
		});
		txtCnp.setText("CNP");
		txtCnp.setBounds(268, 5, 86, 20);
		add(txtCnp);
		txtCnp.setColumns(10);
		
		txtVarsta = new JTextField();
		txtVarsta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CautareTabel cautare=new CautareTabel("select * from persoana where persoana.varsta in ("+txtVarsta.getText()+")");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
				
			}
		});
		txtVarsta.setText("VARSTA");
		txtVarsta.setBounds(364, 5, 86, 20);
		add(txtVarsta);
		txtVarsta.setColumns(10);
		
		JLabel lblMasina = new JLabel("Masina");
		lblMasina.setBounds(20, 313, 46, 14);
		add(lblMasina);
		
		txtNumar = new JTextField();
		txtNumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CautareTabel cautare=new CautareTabel("select * from masina where masina.numar in ('"+txtNumar.getText()+"')");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
				
			}
		});
		txtNumar.setText("NUMAR");
		txtNumar.setBounds(76, 310, 86, 20);
		add(txtNumar);
		txtNumar.setColumns(10);
		
		txtCuloare = new JTextField();
		txtCuloare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CautareTabel cautare=new CautareTabel("select * from masina where masina.culoare in ('"+txtCuloare.getText()+"')");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
				
			}
		});
		txtCuloare.setText("CULOARE");
		txtCuloare.setBounds(172, 310, 86, 20);
		add(txtCuloare);
		txtCuloare.setColumns(10);
		
		txtOrav = new JTextField();
		txtOrav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CautareTabel cautare=new CautareTabel("select * from verificare where verificare.orav in ('"+txtOrav.getText()+"')");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
			}
		});
		txtOrav.setText("ORAV");
		txtOrav.setBounds(76, 340, 86, 20);
		add(txtOrav);
		txtOrav.setColumns(10);
		
		txtOrap = new JTextField();
		txtOrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CautareTabel cautare=new CautareTabel("select * from verificare where verificare.orap in ('"+txtOrap.getText()+"')");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
			}
		});
		txtOrap.setText("ORAP");
		txtOrap.setBounds(172, 340, 86, 20);
		add(txtOrap);
		txtOrap.setColumns(10);
		
		lblVerificare = new JLabel("Verificare");
		lblVerificare.setBounds(10, 343, 46, 14);
		add(lblVerificare);
		
		txtOfiterulResponsabil = new JTextField();
		txtOfiterulResponsabil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CautareTabel cautare=new CautareTabel("select * from verificare where verificare.codo in ("+txtOfiterulResponsabil.getText()+")");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
			}
		});
		txtOfiterulResponsabil.setText("Ofiterul Responsabil");
		txtOfiterulResponsabil.setBounds(268, 340, 105, 20);
		add(txtOfiterulResponsabil);
		txtOfiterulResponsabil.setColumns(10);
		
		txtCodm = new JTextField();
		txtCodm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CautareTabel cautare=new CautareTabel("select * from masina where masina.codm in ("+txtCodm.getText()+")");
				cautare.setVisible(true);
				cautare.setBounds(0,0,512,264);
				
				scrollPane.removeAll();
				scrollPane.revalidate();
				scrollPane.repaint();
				
				scrollPane.add(cautare);
				
				setVisible(true);
			}
		});
		txtCodm.setText("CODM");
		txtCodm.setBounds(268, 310, 86, 20);
		add(txtCodm);
		txtCodm.setColumns(10);
		
		

	}
}
