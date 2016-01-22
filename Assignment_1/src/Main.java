import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JMenuItem;

public class Main extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArkiv;
	private JMenu mnMedlem;
	private JMenu mnHjlp;
	private JTextField txtMarcusOlofsson;
	private JTextField txtxxxx;
	private JTextField txtGyllenpalmsgatan;
	private JTextField textField;
	private JTextField txtMolofssongmailcom;
	private JTextField textField_1;
	private JTextField txtMolofssongmailcom_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 463);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/Marcus/Documents/Programmering 2/KD405A_Marcus_O/Assignment_1/src/Images/logotyp-F24S_1000.jpg.png"));
		menuBar.add(lblNewLabel);
		
		mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		mnHjlp = new JMenu("Hjälp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOm = new JMenuItem("Om");
		mnHjlp.add(mntmOm);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 17, 173, 304);
		contentPane.add(scrollPane);
		
		JTextArea txtrMarcusOlofssonOleg = new JTextArea();
		txtrMarcusOlofssonOleg.setEditable(false);
		scrollPane.setColumnHeaderView(txtrMarcusOlofssonOleg);
		txtrMarcusOlofssonOleg.setText("Marcus Olofsson\nOleg Stevanovic\nMarcus Åkesson\nWilliam Andersson\nSimon Berghammar\nMiro Stevanovic\nKaspar Sjöberg\nAlexander Ljung\nAlexander Miletti\nKenny Östergren\nMarielle Andersson\nAnna Ruzicka\n");
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(378, 19, 61, 16);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnr = new JLabel("Personnr:");
		lblPersonnr.setBounds(378, 47, 61, 16);
		contentPane.add(lblPersonnr);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(378, 75, 61, 16);
		contentPane.add(lblAdress);
		
		JLabel lblTelefonr = new JLabel("Postnr:");
		lblTelefonr.setBounds(378, 103, 61, 16);
		contentPane.add(lblTelefonr);
		
		JLabel lblEpost = new JLabel("Ort:");
		lblEpost.setBounds(378, 131, 61, 16);
		contentPane.add(lblEpost);
		
		txtMarcusOlofsson = new JTextField();
		txtMarcusOlofsson.setText("Marcus Olofsson");
		txtMarcusOlofsson.setBounds(451, 14, 183, 26);
		contentPane.add(txtMarcusOlofsson);
		txtMarcusOlofsson.setColumns(10);
		
		txtxxxx = new JTextField();
		txtxxxx.setText("921019-XXXX");
		txtxxxx.setBounds(451, 42, 183, 26);
		contentPane.add(txtxxxx);
		txtxxxx.setColumns(10);
		
		txtGyllenpalmsgatan = new JTextField();
		txtGyllenpalmsgatan.setText("Gyllenpalmsgatan 3");
		txtGyllenpalmsgatan.setBounds(451, 70, 183, 26);
		contentPane.add(txtGyllenpalmsgatan);
		txtGyllenpalmsgatan.setColumns(10);
		
		textField = new JTextField();
		textField.setText("211 30");
		textField.setBounds(451, 98, 183, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtMolofssongmailcom = new JTextField();
		txtMolofssongmailcom.setText("Malmö");
		txtMolofssongmailcom.setBounds(451, 126, 183, 26);
		contentPane.add(txtMolofssongmailcom);
		txtMolofssongmailcom.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(517, 292, 117, 29);
		contentPane.add(btnSpara);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/Marcus/Documents/Programmering 2/KD405A_Marcus_O/Assignment_1/src/Images/IMG_0974.jpg"));
		lblNewLabel_1.setBounds(207, 14, 150, 211);
		contentPane.add(lblNewLabel_1);
		
		JButton btnndraBild = new JButton("Ändra bild...");
		btnndraBild.setBounds(199, 226, 117, 29);
		contentPane.add(btnndraBild);
		
		textField_1 = new JTextField();
		textField_1.setText("0735-444739");
		textField_1.setBounds(451, 155, 183, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtMolofssongmailcom_1 = new JTextField();
		txtMolofssongmailcom_1.setText("m.olofsson92@gmail.com");
		txtMolofssongmailcom_1.setColumns(10);
		txtMolofssongmailcom_1.setBounds(451, 185, 183, 26);
		contentPane.add(txtMolofssongmailcom_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefonnr:");
		lblNewLabel_2.setBounds(378, 160, 75, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEpost_1 = new JLabel("E-post:");
		lblEpost_1.setBounds(378, 190, 61, 16);
		contentPane.add(lblEpost_1);
	}
}
