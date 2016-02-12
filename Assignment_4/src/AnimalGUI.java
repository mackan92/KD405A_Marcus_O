import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private ArrayList<Animal> animalList; { 
		animalList = new ArrayList<Animal>();{
			animalList.add(new Dog1("Canis lupus familiaris", 3, false, "Anna"));
			animalList.add(new Dog1("Canis lupus familiaris", 3, true, "Puck"));
			animalList.add(new Dog1("Canis lupus familiaris", 3, false, "Asta"));
			animalList.add(new Cat("Felis catus", 5, 9, "Luna"));
			animalList.add(new Cat("Felis catus", 5, 5, "Anki"));
			animalList.add(new Cat("Felis catus", 5, 7, "Missan"));
			animalList.add(new Snake ("Naja naja", true));
			animalList.add(new Snake ("Boa constrictor", true));
			animalList.add(new Snake ("Python bivittatus", false));
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 28, 679, 326);
		contentPane.add(textArea);


		JLabel lblDjurlista = new JLabel("Djurlista:");
		lblDjurlista.setBounds(6, 6, 61, 16);
		contentPane.add(lblDjurlista);
		
		String s = "";
		for (Animal all : animalList){
			s = s + all.getInfo() + "\n";
		}
		textArea.setText(s);
	}
}
