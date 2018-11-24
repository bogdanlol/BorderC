package proiectbd;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import org.omg.PortableServer.ServantRetentionPolicyValue;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class interfata {

	private JPanel panel = new JPanel();

	private JFrame frame;


	public void connection(String sql) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.cti.ugal.ro:1521:db", "cald33",
					"oracle");
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);

			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfata window = new interfata();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfata() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 599, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
				
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 583, 21);

		JMenu mnNewMenu = new JMenu("Afisare");
		menuBar.add(mnNewMenu);

		JMenuItem mntmBazaDeDate = new JMenuItem("Persoane");
		mntmBazaDeDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TableFromDatabase afisare = new TableFromDatabase();
				afisare.setBounds(5, 50, 700, 250);

				afisare.setVisible(true);
				panel.removeAll();
				panel.add(afisare, BorderLayout.CENTER);
				frame.setVisible(true);

			}
		});
		mnNewMenu.add(mntmBazaDeDate);

		JMenuItem mntmVehicule = new JMenuItem("Vehicule");
		mntmVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				VehiculeAfisare va = new VehiculeAfisare();
				va.setBounds(5, 1, 700, 250);

				panel.removeAll();
				panel.add(va, BorderLayout.CENTER);
				
				frame.setVisible(true);

			}
		});
		mnNewMenu.add(mntmVehicule);

		JMenuItem mntmOfiteri = new JMenuItem("Ofiteri");
		mntmOfiteri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonalAfisare PA = new PersonalAfisare();
				PA.setBounds(5, 1,700, 250);
				panel.removeAll();
				panel.add(PA, BorderLayout.CENTER);
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmOfiteri);

		JMenuItem mntmVerificari = new JMenuItem("Verificari");
		mntmVerificari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerificariAfisare VA = new VerificariAfisare();
				VA.setBounds(5, 1, 600, 200);
				panel.removeAll();
				panel.add(VA, BorderLayout.CENTER);
				
				frame.setVisible(true);

			}
		});
		mnNewMenu.add(mntmVerificari);

		JMenu mnInserare = new JMenu("Modificare");
		menuBar.add(mnInserare);

		JMenuItem mntmVenireNoua = new JMenuItem("Venire Noua");
		mntmVenireNoua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VenireNoua venireNoua = new VenireNoua();
				venireNoua.setBounds(80, 80, 400, 300);

				panel.removeAll();
				panel.add(venireNoua);
				frame.setVisible(true);

			}
		});

		mnInserare.add(mntmVenireNoua);
		
		JMenuItem mntmModificareDateExistente = new JMenuItem("Modificare date existente");
		mntmModificareDateExistente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update update = new Update();
				panel.removeAll();
				panel.add(update);
				frame.setVisible(true);
			}
		});
		mnInserare.add(mntmModificareDateExistente);
		
		JMenuItem mntmStergere = new JMenuItem("Stergere");
		mntmStergere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stergere stergere = new Stergere();
				panel.removeAll();
				panel.add(stergere);
				frame.setVisible(true);
			}
		});
		mnInserare.add(mntmStergere);
		
		JMenuItem mntmInserareVehicul = new JMenuItem("Inserare Separata");
		mntmInserareVehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InserareMasina inseraremasina =new InserareMasina();
				panel.removeAll();
				panel.add(inseraremasina);
				frame.setVisible(true);
			}
		});
		mnInserare.add(mntmInserareVehicul);
		
		JMenuItem mntmInserarePersonal = new JMenuItem("Inserare Personal");
		mntmInserarePersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InserareAngajat inserareAngajat = new InserareAngajat();
				panel.removeAll();
				panel.add(inserareAngajat);
				frame.setVisible(true);
			}
		});
		mnInserare.add(mntmInserarePersonal);

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 583, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 531, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		
		JMenuItem mntmCautare = new JMenuItem("Cautare");
		mntmCautare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cauta cautare = new Cauta();
				cautare.setBounds(85, 41, 512, 264);
				panel.removeAll();
				panel.add(cautare);
				frame.setVisible(true);
				
				
			}
		});
		menuBar.add(mntmCautare);
		panel.setLayout(new BorderLayout(0, 0));
		frame.getContentPane().setLayout(groupLayout);

	}
}
