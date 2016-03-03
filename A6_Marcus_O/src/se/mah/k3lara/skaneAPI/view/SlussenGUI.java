package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class SlussenGUI extends JFrame {

	private JPanel contentPane;
	private JButton timeButton;
	private JLabel tidLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SlussenGUI frame = new SlussenGUI();
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
	public SlussenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		timeButton = new JButton("Hämta tid");
		timeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchURL = Constants.getURL("80112","80000",1);
				Journeys journeys = Parser.getJourneys(searchURL);
				for (Journey journey : journeys.getJourneys()) {
					String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
					tidLabel.setText(time);
			}
		}
		}
		);
		
		tidLabel = new JLabel("");
		tidLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tidLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		tidLabel.setBounds(144, 111, 149, 40);
		contentPane.add(tidLabel);
		
		timeButton.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		timeButton.setBounds(169, 163, 99, 40);
		contentPane.add(timeButton);
		
		JLabel lblNewLabel = new JLabel("Nästa buss från Malmö Slussen:");
		lblNewLabel.setFont(new Font("Myriad Hebrew", Font.PLAIN, 16));
		lblNewLabel.setBounds(114, 70, 209, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/Marcus/Documents/Programmering 2/KD405A_Marcus_O/A6_Marcus_O/src/se/mah/k3lara/skaneAPI/view/logo_skanetrafiken.png"));
		lblNewLabel_1.setBounds(114, 22, 200, 36);
		contentPane.add(lblNewLabel_1);
	}
}
