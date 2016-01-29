import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myCalculator = new Calculator();
		
		textField = new JTextField();
		textField.setBounds(6, 6, 284, 71);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		button.setBounds(6, 212, 134, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		button_1.setBounds(6, 171, 61, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_2.setBounds(79, 171, 61, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		button_3.setBounds(152, 171, 61, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		button_4.setBounds(6, 130, 61, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_5.setBounds(79, 130, 61, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		button_6.setBounds(152, 130, 61, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		button_7.setBounds(6, 89, 61, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button_8.setBounds(79, 89, 61, 29);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		button_9.setBounds(152, 89, 61, 29);
		contentPane.add(button_9);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("X");
				myCalculator.mult();
			}
		});
		btnX.setBounds(228, 89, 62, 29);
		contentPane.add(btnX);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-");
				myCalculator.minus();
			}
		});
		button_10.setBounds(228, 130, 62, 29);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("+");
				myCalculator.plus();
			}
		});
		button_11.setBounds(228, 171, 62, 29);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
				
			}
		});
		button_12.setBounds(228, 212, 61, 29);
		contentPane.add(button_12);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				myCalculator.clear();
			}
		});
		btnClear.setBounds(152, 212, 61, 29);
		contentPane.add(btnClear);
	}
}
