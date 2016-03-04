import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class TryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
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
	public TryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.ASSIGNMENT_7);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//RAD1
				px.setPixel(49, 80, Color.GREEN);
				px.setPixel(50, 80, Color.GREEN);
				//RAD2
				px.setPixel(47, 81, Color.GREEN);
				px.setPixel(48, 81, Color.GREEN);
				px.setPixel(49, 81, Color.GREEN);
				px.setPixel(50, 81, Color.GREEN);
				//RAD3
				px.setPixel(47, 82, Color.GREEN);
				px.setPixel(48, 82, Color.GREEN);
				px.setPixel(49, 82, Color.GREEN);
				//RAD4
				px.setPixel(46, 83, Color.GREEN);
				px.setPixel(47, 83, Color.GREEN);
				px.setPixel(48, 83, Color.GREEN);
				px.setPixel(49, 83, Color.GREEN);
				//RAD5
				px.setPixel(46, 84, Color.GREEN);
				px.setPixel(47, 84, Color.GREEN);
				px.setPixel(48, 84, Color.GREEN);
				//RAD6
				px.setPixel(45, 85, Color.GREEN);
				px.setPixel(46, 85, Color.GREEN);
				px.setPixel(47, 85, Color.GREEN);
				//RAD7
				px.setPixel(39, 86, Color.GREEN);
				px.setPixel(40, 86, Color.GREEN);
				px.setPixel(41, 86, Color.GREEN);
				px.setPixel(42, 86, Color.GREEN);
				px.setPixel(49, 86, Color.GREEN);
				px.setPixel(50, 86, Color.GREEN);
				px.setPixel(51, 86, Color.GREEN);
				px.setPixel(52, 86, Color.GREEN);
				//RAD8
				px.setPixel(37, 87, Color.GREEN);
				px.setPixel(38, 87, Color.GREEN);
				px.setPixel(39, 87, Color.GREEN);
				px.setPixel(40, 87, Color.GREEN);
				px.setPixel(41, 87, Color.GREEN);
				px.setPixel(42, 87, Color.GREEN);
				px.setPixel(43, 87, Color.GREEN);
				px.setPixel(44, 87, Color.GREEN);
				px.setPixel(46, 87, Color.GREEN);
				px.setPixel(47, 87, Color.GREEN);
				px.setPixel(48, 87, Color.GREEN);
				px.setPixel(49, 87, Color.GREEN);
				px.setPixel(50, 87, Color.GREEN);
				px.setPixel(51, 87, Color.GREEN);
				px.setPixel(52, 87, Color.GREEN);
				px.setPixel(53, 87, Color.GREEN);
				//RAD9
				px.setPixel(36, 88, Color.GREEN);
				px.setPixel(37, 88, Color.GREEN);
				px.setPixel(38, 88, Color.GREEN);
				px.setPixel(39, 88, Color.GREEN);
				px.setPixel(40, 88, Color.GREEN);
				px.setPixel(41, 88, Color.GREEN);
				px.setPixel(42, 88, Color.GREEN);
				px.setPixel(43, 88, Color.GREEN);
				px.setPixel(44, 88, Color.GREEN);
				px.setPixel(45, 88, Color.GREEN);
				px.setPixel(46, 88, Color.GREEN);
				px.setPixel(47, 88, Color.GREEN);
				px.setPixel(48, 88, Color.GREEN);
				px.setPixel(49, 88, Color.GREEN);
				px.setPixel(50, 88, Color.GREEN);
				px.setPixel(51, 88, Color.GREEN);
				px.setPixel(52, 88, Color.GREEN);
				px.setPixel(53, 88, Color.GREEN);
				px.setPixel(54, 88, Color.GREEN);
				//RAD10
				px.setPixel(35, 89, Color.GREEN);
				px.setPixel(36, 89, Color.GREEN);
				px.setPixel(37, 89, Color.GREEN);
				px.setPixel(38, 89, Color.GREEN);
				px.setPixel(39, 89, Color.GREEN);
				px.setPixel(40, 89, Color.GREEN);
				px.setPixel(41, 89, Color.GREEN);
				px.setPixel(42, 89, Color.GREEN);
				px.setPixel(43, 89, Color.GREEN);
				px.setPixel(44, 89, Color.GREEN);
				px.setPixel(45, 89, Color.GREEN);
				px.setPixel(46, 89, Color.GREEN);
				px.setPixel(47, 89, Color.GREEN);
				px.setPixel(48, 89, Color.GREEN);
				px.setPixel(49, 89, Color.GREEN);
				px.setPixel(50, 89, Color.GREEN);
				px.setPixel(51, 89, Color.GREEN);
				px.setPixel(52, 89, Color.GREEN);
				px.setPixel(53, 89, Color.GREEN);
				px.setPixel(54, 89, Color.GREEN);
				//RAD11
				px.setPixel(35, 90, Color.YELLOW);
				px.setPixel(36, 90, Color.YELLOW);
				px.setPixel(37, 90, Color.YELLOW);
				px.setPixel(38, 90, Color.YELLOW);
				px.setPixel(39, 90, Color.YELLOW);
				px.setPixel(40, 90, Color.YELLOW);
				px.setPixel(41, 90, Color.YELLOW);
				px.setPixel(42, 90, Color.YELLOW);
				px.setPixel(43, 90, Color.YELLOW);
				px.setPixel(44, 90, Color.YELLOW);
				px.setPixel(45, 90, Color.YELLOW);
				px.setPixel(46, 90, Color.YELLOW);
				px.setPixel(47, 90, Color.YELLOW);
				px.setPixel(48, 90, Color.YELLOW);
				px.setPixel(49, 90, Color.YELLOW);
				px.setPixel(50, 90, Color.YELLOW);
				px.setPixel(51, 90, Color.YELLOW);
				px.setPixel(52, 90, Color.YELLOW);
				px.setPixel(53, 90, Color.YELLOW);
				//RAD12
				px.setPixel(34, 91, Color.YELLOW);
				px.setPixel(35, 91, Color.YELLOW);
				px.setPixel(36, 91, Color.YELLOW);
				px.setPixel(37, 91, Color.YELLOW);
				px.setPixel(38, 91, Color.YELLOW);
				px.setPixel(39, 91, Color.YELLOW);
				px.setPixel(40, 91, Color.YELLOW);
				px.setPixel(41, 91, Color.YELLOW);
				px.setPixel(42, 91, Color.YELLOW);
				px.setPixel(43, 91, Color.YELLOW);
				px.setPixel(44, 91, Color.YELLOW);
				px.setPixel(45, 91, Color.YELLOW);
				px.setPixel(46, 91, Color.YELLOW);
				px.setPixel(47, 91, Color.YELLOW);
				px.setPixel(48, 91, Color.YELLOW);
				px.setPixel(49, 91, Color.YELLOW);
				px.setPixel(50, 91, Color.YELLOW);
				px.setPixel(51, 91, Color.YELLOW);
				px.setPixel(52, 91, Color.YELLOW);
				//RAD13
				px.setPixel(34, 92, Color.YELLOW);
				px.setPixel(35, 92, Color.YELLOW);
				px.setPixel(36, 92, Color.YELLOW);
				px.setPixel(37, 92, Color.YELLOW);
				px.setPixel(38, 92, Color.YELLOW);
				px.setPixel(39, 92, Color.YELLOW);
				px.setPixel(40, 92, Color.YELLOW);
				px.setPixel(41, 92, Color.YELLOW);
				px.setPixel(42, 92, Color.YELLOW);
				px.setPixel(43, 92, Color.YELLOW);
				px.setPixel(44, 92, Color.YELLOW);
				px.setPixel(45, 92, Color.YELLOW);
				px.setPixel(46, 92, Color.YELLOW);
				px.setPixel(47, 92, Color.YELLOW);
				px.setPixel(48, 92, Color.YELLOW);
				px.setPixel(49, 92, Color.YELLOW);
				px.setPixel(50, 92, Color.YELLOW);
				px.setPixel(51, 92, Color.YELLOW);
				px.setPixel(52, 92, Color.YELLOW);
				//RAD14
				px.setPixel(34, 93, Color.ORANGE);
				px.setPixel(35, 93, Color.ORANGE);
				px.setPixel(36, 93, Color.ORANGE);
				px.setPixel(37, 93, Color.ORANGE);
				px.setPixel(38, 93, Color.ORANGE);
				px.setPixel(39, 93, Color.ORANGE);
				px.setPixel(40, 93, Color.ORANGE);
				px.setPixel(41, 93, Color.ORANGE);
				px.setPixel(42, 93, Color.ORANGE);
				px.setPixel(43, 93, Color.ORANGE);
				px.setPixel(44, 93, Color.ORANGE);
				px.setPixel(45, 93, Color.ORANGE);
				px.setPixel(46, 93, Color.ORANGE);
				px.setPixel(47, 93, Color.ORANGE);
				px.setPixel(48, 93, Color.ORANGE);
				px.setPixel(49, 93, Color.ORANGE);
				px.setPixel(50, 93, Color.ORANGE);
				px.setPixel(51, 93, Color.ORANGE);
				px.setPixel(52, 93, Color.ORANGE);
				//RAD15
				px.setPixel(34, 94, Color.ORANGE);
				px.setPixel(35, 94, Color.ORANGE);
				px.setPixel(36, 94, Color.ORANGE);
				px.setPixel(37, 94, Color.ORANGE);
				px.setPixel(38, 94, Color.ORANGE);
				px.setPixel(39, 94, Color.ORANGE);
				px.setPixel(40, 94, Color.ORANGE);
				px.setPixel(41, 94, Color.ORANGE);
				px.setPixel(42, 94, Color.ORANGE);
				px.setPixel(43, 94, Color.ORANGE);
				px.setPixel(44, 94, Color.ORANGE);
				px.setPixel(45, 94, Color.ORANGE);
				px.setPixel(46, 94, Color.ORANGE);
				px.setPixel(47, 94, Color.ORANGE);
				px.setPixel(48, 94, Color.ORANGE);
				px.setPixel(49, 94, Color.ORANGE);
				px.setPixel(50, 94, Color.ORANGE);
				px.setPixel(51, 94, Color.ORANGE);
				px.setPixel(52, 94, Color.ORANGE);
				//RAD16
				px.setPixel(34, 95, Color.ORANGE);
				px.setPixel(35, 95, Color.ORANGE);
				px.setPixel(36, 95, Color.ORANGE);
				px.setPixel(37, 95, Color.ORANGE);
				px.setPixel(38, 95, Color.ORANGE);
				px.setPixel(39, 95, Color.ORANGE);
				px.setPixel(40, 95, Color.ORANGE);
				px.setPixel(41, 95, Color.ORANGE);
				px.setPixel(42, 95, Color.ORANGE);
				px.setPixel(43, 95, Color.ORANGE);
				px.setPixel(44, 95, Color.ORANGE);
				px.setPixel(45, 95, Color.ORANGE);
				px.setPixel(46, 95, Color.ORANGE);
				px.setPixel(47, 95, Color.ORANGE);
				px.setPixel(48, 95, Color.ORANGE);
				px.setPixel(49, 95, Color.ORANGE);
				px.setPixel(50, 95, Color.ORANGE);
				px.setPixel(51, 95, Color.ORANGE);
				px.setPixel(52, 95, Color.ORANGE);
				//RAD17
				px.setPixel(34, 96, Color.ORANGE);
				px.setPixel(35, 96, Color.ORANGE);
				px.setPixel(36, 96, Color.ORANGE);
				px.setPixel(37, 96, Color.ORANGE);
				px.setPixel(38, 96, Color.ORANGE);
				px.setPixel(39, 96, Color.ORANGE);
				px.setPixel(40, 96, Color.ORANGE);
				px.setPixel(41, 96, Color.ORANGE);
				px.setPixel(42, 96, Color.ORANGE);
				px.setPixel(43, 96, Color.ORANGE);
				px.setPixel(44, 96, Color.ORANGE);
				px.setPixel(45, 96, Color.ORANGE);
				px.setPixel(46, 96, Color.ORANGE);
				px.setPixel(47, 96, Color.ORANGE);
				px.setPixel(48, 96, Color.ORANGE);
				px.setPixel(49, 96, Color.ORANGE);
				px.setPixel(50, 96, Color.ORANGE);
				px.setPixel(51, 96, Color.ORANGE);
				px.setPixel(52, 96, Color.ORANGE);
				//RAD18
				px.setPixel(34, 97, Color.RED);
				px.setPixel(35, 97, Color.RED);
				px.setPixel(36, 97, Color.RED);
				px.setPixel(37, 97, Color.RED);
				px.setPixel(38, 97, Color.RED);
				px.setPixel(39, 97, Color.RED);
				px.setPixel(40, 97, Color.RED);
				px.setPixel(41, 97, Color.RED);
				px.setPixel(42, 97, Color.RED);
				px.setPixel(43, 97, Color.RED);
				px.setPixel(44, 97, Color.RED);
				px.setPixel(45, 97, Color.RED);
				px.setPixel(46, 97, Color.RED);
				px.setPixel(47, 97, Color.RED);
				px.setPixel(48, 97, Color.RED);
				px.setPixel(49, 97, Color.RED);
				px.setPixel(50, 97, Color.RED);
				px.setPixel(51, 97, Color.RED);
				px.setPixel(52, 97, Color.RED);
				//RAD19
				px.setPixel(34, 98, Color.RED);
				px.setPixel(35, 98, Color.RED);
				px.setPixel(36, 98, Color.RED);
				px.setPixel(37, 98, Color.RED);
				px.setPixel(38, 98, Color.RED);
				px.setPixel(39, 98, Color.RED);
				px.setPixel(40, 98, Color.RED);
				px.setPixel(41, 98, Color.RED);
				px.setPixel(42, 98, Color.RED);
				px.setPixel(43, 98, Color.RED);
				px.setPixel(44, 98, Color.RED);
				px.setPixel(45, 98, Color.RED);
				px.setPixel(46, 98, Color.RED);
				px.setPixel(47, 98, Color.RED);
				px.setPixel(48, 98, Color.RED);
				px.setPixel(49, 98, Color.RED);
				px.setPixel(50, 98, Color.RED);
				px.setPixel(51, 98, Color.RED);
				px.setPixel(52, 98, Color.RED);
				px.setPixel(53, 98, Color.RED);
				//RAD20
				px.setPixel(35, 99, Color.RED);
				px.setPixel(36, 99, Color.RED);
				px.setPixel(37, 99, Color.RED);
				px.setPixel(38, 99, Color.RED);
				px.setPixel(39, 99, Color.RED);
				px.setPixel(40, 99, Color.RED);
				px.setPixel(41, 99, Color.RED);
				px.setPixel(42, 99, Color.RED);
				px.setPixel(43, 99, Color.RED);
				px.setPixel(44, 99, Color.RED);
				px.setPixel(45, 99, Color.RED);
				px.setPixel(46, 99, Color.RED);
				px.setPixel(47, 99, Color.RED);
				px.setPixel(48, 99, Color.RED);
				px.setPixel(49, 99, Color.RED);
				px.setPixel(50, 99, Color.RED);
				px.setPixel(51, 99, Color.RED);
				px.setPixel(52, 99, Color.RED);
				px.setPixel(53, 99, Color.RED);
				px.setPixel(54, 99, Color.RED);
				//RAD21
				px.setPixel(35, 100, Color.RED);
				px.setPixel(36, 100, Color.RED);
				px.setPixel(37, 100, Color.RED);
				px.setPixel(38, 100, Color.RED);
				px.setPixel(39, 100, Color.RED);
				px.setPixel(40, 100, Color.RED);
				px.setPixel(41, 100, Color.RED);
				px.setPixel(42, 100, Color.RED);
				px.setPixel(43, 100, Color.RED);
				px.setPixel(44, 100, Color.RED);
				px.setPixel(45, 100, Color.RED);
				px.setPixel(46, 100, Color.RED);
				px.setPixel(47, 100, Color.RED);
				px.setPixel(48, 100, Color.RED);
				px.setPixel(49, 100, Color.RED);
				px.setPixel(50, 100, Color.RED);
				px.setPixel(51, 100, Color.RED);
				px.setPixel(52, 100, Color.RED);
				px.setPixel(53, 100, Color.RED);
				px.setPixel(54, 100, Color.RED);
				px.setPixel(55, 100, Color.RED);
				//RAD22
				px.setPixel(35, 101, Color.MAGENTA);
				px.setPixel(36, 101, Color.MAGENTA);
				px.setPixel(37, 101, Color.MAGENTA);
				px.setPixel(38, 101, Color.MAGENTA);
				px.setPixel(39, 101, Color.MAGENTA);
				px.setPixel(40, 101, Color.MAGENTA);
				px.setPixel(41, 101, Color.MAGENTA);
				px.setPixel(42, 101, Color.MAGENTA);
				px.setPixel(43, 101, Color.MAGENTA);
				px.setPixel(44, 101, Color.MAGENTA);
				px.setPixel(45, 101, Color.MAGENTA);
				px.setPixel(46, 101, Color.MAGENTA);
				px.setPixel(47, 101, Color.MAGENTA);
				px.setPixel(48, 101, Color.MAGENTA);
				px.setPixel(49, 101, Color.MAGENTA);
				px.setPixel(50, 101, Color.MAGENTA);
				px.setPixel(51, 101, Color.MAGENTA);
				px.setPixel(52, 101, Color.MAGENTA);
				px.setPixel(53, 101, Color.MAGENTA);
				px.setPixel(54, 101, Color.MAGENTA);
				px.setPixel(55, 101, Color.MAGENTA);
				//RAD23
				px.setPixel(36, 102, Color.MAGENTA);
				px.setPixel(37, 102, Color.MAGENTA);
				px.setPixel(38, 102, Color.MAGENTA);
				px.setPixel(39, 102, Color.MAGENTA);
				px.setPixel(40, 102, Color.MAGENTA);
				px.setPixel(41, 102, Color.MAGENTA);
				px.setPixel(42, 102, Color.MAGENTA);
				px.setPixel(43, 102, Color.MAGENTA);
				px.setPixel(44, 102, Color.MAGENTA);
				px.setPixel(45, 102, Color.MAGENTA);
				px.setPixel(46, 102, Color.MAGENTA);
				px.setPixel(47, 102, Color.MAGENTA);
				px.setPixel(48, 102, Color.MAGENTA);
				px.setPixel(49, 102, Color.MAGENTA);
				px.setPixel(50, 102, Color.MAGENTA);
				px.setPixel(51, 102, Color.MAGENTA);
				px.setPixel(52, 102, Color.MAGENTA);
				px.setPixel(53, 102, Color.MAGENTA);
				px.setPixel(54, 102, Color.MAGENTA);
				px.setPixel(55, 102, Color.MAGENTA);
				//RAD24
				px.setPixel(36, 103, Color.MAGENTA);
				px.setPixel(37, 103, Color.MAGENTA);
				px.setPixel(38, 103, Color.MAGENTA);
				px.setPixel(39, 103, Color.MAGENTA);
				px.setPixel(40, 103, Color.MAGENTA);
				px.setPixel(41, 103, Color.MAGENTA);
				px.setPixel(42, 103, Color.MAGENTA);
				px.setPixel(43, 103, Color.MAGENTA);
				px.setPixel(44, 103, Color.MAGENTA);
				px.setPixel(45, 103, Color.MAGENTA);
				px.setPixel(46, 103, Color.MAGENTA);
				px.setPixel(47, 103, Color.MAGENTA);
				px.setPixel(48, 103, Color.MAGENTA);
				px.setPixel(49, 103, Color.MAGENTA);
				px.setPixel(50, 103, Color.MAGENTA);
				px.setPixel(51, 103, Color.MAGENTA);
				px.setPixel(52, 103, Color.MAGENTA);
				px.setPixel(53, 103, Color.MAGENTA);
				px.setPixel(54, 103, Color.MAGENTA);
				//RAD25
				px.setPixel(37, 104, Color.MAGENTA);
				px.setPixel(38, 104, Color.MAGENTA);
				px.setPixel(39, 104, Color.MAGENTA);
				px.setPixel(40, 104, Color.MAGENTA);
				px.setPixel(41, 104, Color.MAGENTA);
				px.setPixel(42, 104, Color.MAGENTA);
				px.setPixel(43, 104, Color.MAGENTA);
				px.setPixel(44, 104, Color.MAGENTA);
				px.setPixel(45, 104, Color.MAGENTA);
				px.setPixel(46, 104, Color.MAGENTA);
				px.setPixel(47, 104, Color.MAGENTA);
				px.setPixel(48, 104, Color.MAGENTA);
				px.setPixel(49, 104, Color.MAGENTA);
				px.setPixel(50, 104, Color.MAGENTA);
				px.setPixel(51, 104, Color.MAGENTA);
				px.setPixel(52, 104, Color.MAGENTA);
				px.setPixel(53, 104, Color.MAGENTA);
				px.setPixel(54, 104, Color.MAGENTA);
				//RAD26
				px.setPixel(38, 105, Color.BLUE);
				px.setPixel(39, 105, Color.BLUE);
				px.setPixel(40, 105, Color.BLUE);
				px.setPixel(41, 105, Color.BLUE);
				px.setPixel(42, 105, Color.BLUE);
				px.setPixel(43, 105, Color.BLUE);
				px.setPixel(44, 105, Color.BLUE);
				px.setPixel(45, 105, Color.BLUE);
				px.setPixel(46, 105, Color.BLUE);
				px.setPixel(47, 105, Color.BLUE);
				px.setPixel(48, 105, Color.BLUE);
				px.setPixel(49, 105, Color.BLUE);
				px.setPixel(50, 105, Color.BLUE);
				px.setPixel(51, 105, Color.BLUE);
				px.setPixel(52, 105, Color.BLUE);
				px.setPixel(53, 105, Color.BLUE);
				//RAD27
				px.setPixel(38, 106, Color.BLUE);
				px.setPixel(39, 106, Color.BLUE);
				px.setPixel(40, 106, Color.BLUE);
				px.setPixel(41, 106, Color.BLUE);
				px.setPixel(42, 106, Color.BLUE);
				px.setPixel(43, 106, Color.BLUE);
				px.setPixel(44, 106, Color.BLUE);
				px.setPixel(45, 106, Color.BLUE);
				px.setPixel(46, 106, Color.BLUE);
				px.setPixel(47, 106, Color.BLUE);
				px.setPixel(48, 106, Color.BLUE);
				px.setPixel(49, 106, Color.BLUE);
				px.setPixel(50, 106, Color.BLUE);
				px.setPixel(51, 106, Color.BLUE);
				px.setPixel(52, 106, Color.BLUE);
				//RAD28
				px.setPixel(40, 107, Color.BLUE);
				px.setPixel(41, 107, Color.BLUE);
				px.setPixel(42, 107, Color.BLUE);
				px.setPixel(43, 107, Color.BLUE);
				px.setPixel(49, 107, Color.BLUE);
				px.setPixel(50, 107, Color.BLUE);
				px.setPixel(51, 107, Color.BLUE);
	}

}
