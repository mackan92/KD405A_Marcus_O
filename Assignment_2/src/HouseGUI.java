import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouse;
	private int randomYear;
	private int randomSize;
	private Random random = new Random();
	private ArrayList<House> houselist = new ArrayList<House>();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 69, 389, 327);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		
		House house1 = new House(1926, 200);
		House house2 = new House(2012, 352);
		House house3 = new House(1992, 143);
		
		textArea.append("Uppgift 1.2"+"\n");
		textArea.append("Ett hus byggt "+ house1.getYearBuilt() + " som är "+ house1.getSize() + " kvm stort."+"\n" );
		textArea.append("Ett hus byggt "+ house2.getYearBuilt() + " som är "+ house2.getSize() + " kvm stort."+"\n" );
		textArea.append("Ett hus byggt "+ house3.getYearBuilt() + " som är "+ house3.getSize() + " kvm stort."+"\n");
		
		System.out.println("Ett hus byggt "+ house1.getYearBuilt() + " som är "+ house1.getSize() + " kvm stort." );
		System.out.println("Ett hus byggt "+ house2.getYearBuilt() + " som är "+ house2.getSize() + " kvm stort." );
		System.out.println("Ett hus byggt "+ house3.getYearBuilt() + " som är "+ house3.getSize() + " kvm stort." );
		
		textArea.append("Uppgift 1.3"+"\n");
		
		myHouse = new House[10];
		
		myHouse[0] = new House(2014, 400);
		myHouse[1] = new House(1912, 234);
		myHouse[2] = new House(1827, 679);
		myHouse[3] = new House(2075, 1200);
		myHouse[4] = new House(2001, 457);
		myHouse[5] = new House(1957, 231);
		myHouse[6] = new House(1905, 105);
		myHouse[7] = new House(1900, 203);
		myHouse[8] = new House(1992, 479);
		myHouse[9] = new House(2005, 157);
		
		for(int i = 0; i < myHouse.length; i++){
			textArea.append("Ett hus byggt "+ myHouse[i].getYearBuilt() + " som är "+ myHouse[i].getSize() + " kvm stort." + "\n");
		}
		
		textArea.append("Uppgift 1.4"+"\n");
		
		for(int i = 0; i < 100; i++){
			randomYear = random.nextInt((2015-1800) + 1) + 1800;
			randomSize = random.nextInt((1000-100) + 1) + 100;
			
			houselist.add(new House(randomYear, randomSize));
			
			System.out.println(houselist.get(i).getYearBuilt() + "\t" + houselist.get(i).getSize());
			textArea.append("Ett hus byggt " + houselist.get(i).getYearBuilt() +" som är " + houselist.get(i).getSize() + " kvm stort. " + "\n");
			
		}
		
		
		
	}
}
