import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Human_Dog_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanField;
	private JTextField dogField;
	
	Human human1;
	Dog dog1;
	private String nameofHuman;
	private String nameofDog;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Human_Dog_GUI frame = new Human_Dog_GUI();
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
	public Human_Dog_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		humanField = new JTextField();
		humanField.setBounds(95, 34, 130, 26);
		contentPane.add(humanField);
		humanField.setColumns(10);
		
		dogField = new JTextField();
		dogField.setBounds(95, 72, 130, 26);
		contentPane.add(dogField);
		dogField.setColumns(10);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setBounds(159, 6, 121, 16);
		contentPane.add(lblHumansAndDogs);
		
		JTextArea infoArea = new JTextArea();
		infoArea.setBounds(24, 161, 395, 39);
		contentPane.add(infoArea);
		
		JTextArea errorArea = new JTextArea();
		errorArea.setBounds(24, 224, 395, 39);
		contentPane.add(errorArea);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setnameofHuman();
				String text = nameofHuman;
				
				if(nameofHuman.length() > 2){
					human1 = new Human(text);
					errorArea.setText("");
				}
				else{
					errorArea.setText("Namnet är för kort. Måste innehålla minst 3 bokstäver");
					infoArea.setText("");
				}
			}
		});
		btnNewHuman.setBounds(249, 34, 117, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setnameofDog();
				String textDog = nameofDog;
				
				human1.buyDog(new Dog(nameofDog));
				errorArea.setText("");
				infoArea.setText("");
			}
		});
		btnBuyDog.setBounds(249, 72, 117, 29);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoArea.setText(human1.getInfo());
				humanField.setText("");
				dogField.setText("");
				errorArea.setText("");
				
			}
		});
		btnPrintInfo.setBounds(180, 110, 117, 29);
		contentPane.add(btnPrintInfo);
		
		
		JLabel lblInfo = new JLabel("Info:");
		lblInfo.setBounds(24, 139, 61, 16);
		contentPane.add(lblInfo);
		
		JLabel lblErrormessage = new JLabel("ErrorMessage:");
		lblErrormessage.setBounds(24, 206, 88, 16);
		contentPane.add(lblErrormessage);
	}
	private void setnameofHuman(){
		nameofHuman = humanField.getText();
	}
	private void setnameofDog(){
		nameofDog = dogField.getText();
	}
}
