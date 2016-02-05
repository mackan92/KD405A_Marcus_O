import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class BikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtColorinput;
	private JTextField txtSizeinput;
	private JTextField txtPriceinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGUI frame = new BikeGUI();
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
	public BikeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtColorinput = new JTextField();
		txtColorinput.setText("");
		txtColorinput.setBounds(27, 42, 94, 26);
		contentPane.add(txtColorinput);
		txtColorinput.setColumns(10);
		
		txtSizeinput = new JTextField();
		txtSizeinput.setText("");
		txtColorinput.setText("");
		txtSizeinput.setBounds(189, 42, 88, 26);
		contentPane.add(txtSizeinput);
		txtSizeinput.setColumns(10);
		
		txtPriceinput = new JTextField();
		txtPriceinput.setText("");
		txtColorinput.setText("");
		txtPriceinput.setBounds(346, 42, 94, 26);
		contentPane.add(txtPriceinput);
		txtPriceinput.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 166, 402, 216);
		contentPane.add(scrollPane);
		
		JTextArea bikeList = new JTextArea();
		scrollPane.setViewportView(bikeList);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int convertSize = Integer.parseInt(txtSizeinput.getText());
				int convertPrice = Integer.parseInt(txtPriceinput.getText());
				
				BikeStore.addBike(txtColorinput.getText(), convertSize, convertPrice);
				bikeList.setText(BikeStore.getAllBikes());
				txtColorinput.setText("");
				txtSizeinput.setText("");
				txtPriceinput.setText("");
			}
		});
		btnNewButton.setBounds(175, 97, 117, 29);
		contentPane.add(btnNewButton);
		
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(31, 14, 61, 16);
		contentPane.add(lblColor);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(348, 14, 61, 16);
		contentPane.add(lblPrice);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(189, 14, 61, 16);
		contentPane.add(lblSize);
	}
}
