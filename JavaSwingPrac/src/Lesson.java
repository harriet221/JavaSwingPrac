import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Lesson {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson window = new Lesson();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel startpage = new JPanel();
		startpage.setBackground(new Color(30, 144, 255));
		startpage.setBounds(0, 0, 796, 572);
		frame.getContentPane().add(startpage);
		startpage.setLayout(null);
		
		JButton btnnxt = new JButton("GO TO NEXT");
		btnnxt.setFont(new Font("10X10 Bold", Font.BOLD, 26));
		btnnxt.setBounds(65, 65, 264, 392);
		startpage.add(btnnxt);
		
		JPanel endpage = new JPanel();
		endpage.setBackground(new Color(188, 143, 143));
		endpage.setBounds(0, 0, 796, 572);
		frame.getContentPane().add(endpage);
		endpage.setLayout(null);
		
		JButton btnbfr = new JButton("GO TO LAST");
		btnbfr.setFont(new Font("10X10 Bold", Font.BOLD, 26));
		btnbfr.setBounds(414, 72, 258, 389);
		endpage.add(btnbfr);
		
		endpage.setVisible(false);
		
		btnnxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				endpage.setVisible(true);
				startpage.setVisible(false);
			}
		});
		
		btnbfr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startpage.setVisible(true);
				endpage.setVisible(false);
			}
		});
	}
}