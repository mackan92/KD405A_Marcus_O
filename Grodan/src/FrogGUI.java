import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class FrogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHej;
	private Frog[] myFrogs;
	
	private ArrayList<Frog> frogArmy = new ArrayList<Frog>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrogGUI frame = new FrogGUI();
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
	public FrogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Frog frog1 = new Frog(1, "Björn", 100);
		String frog1Name = frog1.getName();
		int frogAge = frog1.getAge();
		int frogSize = frog1.getSize();
		
		myFrogs = new Frog[3];
		
		myFrogs[0] = new Frog(70,"Joel", 1);
		myFrogs[1] = new Frog(20,"GrodanBoll", 40);
		myFrogs[2] = new Frog(10,"minigrodan", 1);
		
		for(int i = 0; i < 100; i++){
			frogArmy.add(new Frog(1, "identiskgroda", 200));
			
		}
		

		
		
		txtHej = new JTextField();
		txtHej.setText(frog1Name + " " + frogAge + " " + frogSize);
		txtHej.setBounds(110, 103, 405, 215);
		contentPane.add(txtHej);
		txtHej.setColumns(10);
		
		for(int i = 0; i < myFrogs.length; i++){
			txtHej.setText(myFrogs[i].getName() + " ");
		}
		
	}
}
