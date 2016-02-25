import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JTextField hourField;
	private JTextField minuteField;
	private JLabel clockLabel;
	private JLabel alarmLabel;
	private JLabel alarmMessageLabel;
	private JLabel photoLabel;
	DecimalFormat timeFormat = new DecimalFormat("00");
	
	public void DigitalClockGUI () {
		
	}

	public void setTimeOnLabel(String time){
		clockLabel.setText(time);
	}
	
	public void setAlarmOnLabel(String alarmTime){
		alarmLabel.setText(alarmTime);
	}
	
	public void activateAlarm(boolean activate){
		if(activate){
			alarmMessageLabel.setText("Wake up!");
			photoLabel.setIcon(new ImageIcon("/Users/Marcus/Documents/Programmering 2/KD405A_Marcus_O/Assignment_5/src/alarm.png"));
			
			} else {
			alarmMessageLabel.setText("");
			photoLabel.setIcon(new ImageIcon("/Users/Marcus/Documents/Programmering 2/KD405A_Marcus_O/Assignment_5/src/sleep_alarm.jpg"));
			}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setTitle("Alarm Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		photoLabel = new JLabel("");
		photoLabel.setIcon(new ImageIcon("/Users/Marcus/Documents/Programmering 2/KD405A_Marcus_O/Assignment_5/src/sleep_alarm.jpg"));
		photoLabel.setBounds(6, 6, 392, 190);
		contentPane.add(photoLabel);
		
		hourField = new JTextField();
		hourField.setBounds(52, 200, 69, 26);
		contentPane.add(hourField);
		hourField.setColumns(10);
		
		minuteField = new JTextField();
		minuteField.setBounds(190, 201, 69, 26);
		contentPane.add(minuteField);
		minuteField.setColumns(10);
		
		JLabel lblHour = new JLabel("Hour:");
		lblHour.setBounds(5, 204, 43, 16);
		contentPane.add(lblHour);
		
		JLabel lblMinute = new JLabel("Minute:");
		lblMinute.setBounds(134, 206, 61, 16);
		contentPane.add(lblMinute);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hourString = hourField.getText();
				int hour = Integer.parseInt(hourString);
				String minuteString = minuteField.getText();
				int minute = Integer.parseInt(minuteString);
				clockLogic.setAlarm(hour, minute);
				
				alarmLabel.setText("Alarm set at: " + hourField.getText() + ":" + minuteField.getText());
			}
		});
		btnSetAlarm.setBounds(278, 200, 117, 29);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();
				alarmLabel.setText("");
				hourField.setText("");
				minuteField.setText("");
			}
		});
		btnClearAlarm.setBounds(447, 200, 117, 29);
		contentPane.add(btnClearAlarm);
		
		clockLabel = new JLabel("");
		clockLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		clockLabel.setBounds(410, 22, 138, 52);
		contentPane.add(clockLabel);
		
		alarmLabel = new JLabel("");
		alarmLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
		alarmLabel.setBounds(410, 102, 138, 38);
		contentPane.add(alarmLabel);
		
		alarmMessageLabel = new JLabel("");
		alarmMessageLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		alarmMessageLabel.setBounds(410, 140, 138, 26);
		contentPane.add(alarmMessageLabel);
		
		clockLogic = new ClockLogic(this);
	}
}
