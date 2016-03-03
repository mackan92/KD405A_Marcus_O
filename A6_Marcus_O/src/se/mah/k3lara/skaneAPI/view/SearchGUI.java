package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class SearchGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JButton searchButton;
	private JTextArea searchArea;
	private JLabel lblSkResa;
	private JLabel lblFrn;
	private JTextField departureField;
	private JLabel lblTill;
	private JTextField destinationField;
	private JButton travelButton;
	private JScrollPane scrollPane_1;
	private JTextArea travelArea;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchGUI frame = new SearchGUI();
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
	public SearchGUI() {
		setTitle("Skånetrafiken");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(27, 41, 130, 26);
		contentPane.add(searchField);
		searchField.setColumns(10);
		
		JLabel lblSkHllplats = new JLabel("Sök hållplats:");
		lblSkHllplats.setBounds(27, 13, 101, 16);
		contentPane.add(lblSkHllplats);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 89, 449, 95);
		contentPane.add(scrollPane);
		
		searchArea = new JTextArea();
		scrollPane.setViewportView(searchArea);
		
		searchButton = new JButton("Sök");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new stationThread().start();
		}
		}
			);
		searchButton.setBounds(162, 41, 80, 29);
		contentPane.add(searchButton);
		
		lblSkResa = new JLabel("Sök resa:");
		lblSkResa.setBounds(27, 196, 70, 16);
		contentPane.add(lblSkResa);
		
		lblFrn = new JLabel("Från:");
		lblFrn.setBounds(27, 234, 31, 16);
		contentPane.add(lblFrn);
		
		departureField = new JTextField();
		departureField.setBounds(70, 229, 130, 26);
		contentPane.add(departureField);
		departureField.setColumns(10);
		
		lblTill = new JLabel("Till:");
		lblTill.setBounds(216, 234, 31, 16);
		contentPane.add(lblTill);
		
		destinationField = new JTextField();
		destinationField.setBounds(259, 229, 130, 26);
		contentPane.add(destinationField);
		destinationField.setColumns(10);
		
		travelButton = new JButton("Sök");
		travelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new journeyThread().start();
			}
		});
		travelButton.setBounds(404, 229, 80, 29);
		contentPane.add(travelButton);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(27, 272, 449, 103);
		contentPane.add(scrollPane_1);
		
		travelArea = new JTextArea();
		scrollPane_1.setViewportView(travelArea);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/Marcus/Documents/Programmering 2/KD405A_Marcus_O/A6_Marcus_O/src/se/mah/k3lara/skaneAPI/view/logo_skanetrafiken.png"));
		lblNewLabel.setBounds(274, 13, 205, 42);
		contentPane.add(lblNewLabel);
		
		
	}
	
	 public class stationThread extends Thread {
		 @Override
		public void run() {
			 ArrayList<Station> searchStations = new ArrayList<Station>();
				searchStations.addAll(Parser.getStationsFromURL(searchField.getText()));
				searchArea.setText("");
				for (Station s: searchStations){
				searchArea.append(s.getStationName() +" number:" +s.getStationNbr() + "\n");
				}
				
				
		 }
	 }
	
	public class journeyThread extends Thread {
		 @Override
		public void run() {
			 
			 String searchURL = Constants.getURL(departureField.getText(),destinationField.getText(),1);
				Journeys journeys = Parser.getJourneys(searchURL);
				for (Journey journey : journeys.getJourneys()) {
					travelArea.setText("");
					String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
					travelArea.append(" Departs to " + journey.getStartStation() + " - " + journey.getEndStation() + " " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late" + "\n");
				} 
				
				
			}
		 

		 }
	}


