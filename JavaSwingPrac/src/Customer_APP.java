import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Customer_APP {

	private JFrame frame;
	private JTextField idField;
	private JPasswordField passwordField;
	private JLabel idLabel;
	private JLabel passwordLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_APP window = new Customer_APP();
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
	public Customer_APP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		// �̹��� ũ�⸦ ������ ���� �����;� ��...
		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("C:/Users/Harriet.SJ/git/JavaSwingPrac/JavaSwingPrac/image/brown_desk.jpg").getImage());
		frame.setSize(625, 379);
		frame.getContentPane().add(welcomePanel);
		welcomePanel.setLayout(null);
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setForeground(new Color(255, 255, 255));
		loginLabel.setFont(new Font("KoPub����ü Bold", Font.PLAIN, 26));
		loginLabel.setBounds(197, 107, 82, 44);
		welcomePanel.add(loginLabel);
		
		idField = new JTextField();
		idField.setFont(new Font("KoPub����ü Bold", Font.PLAIN, 18));
		idField.setToolTipText("Enter ID");
		idField.setBounds(196, 153, 183, 27);
		welcomePanel.add(idField);
		idField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
		passwordField.setToolTipText("Enter password");
		passwordField.setBounds(196, 190, 183, 27);
		welcomePanel.add(passwordField);
		
		idLabel = new JLabel("id");
		idLabel.setForeground(new Color(192, 192, 192));
		idLabel.setFont(new Font("KoPub����ü Bold", Font.PLAIN, 16));
		idLabel.setBounds(171, 156, 13, 25);
		welcomePanel.add(idLabel);
		
		passwordLabel = new JLabel("password");
		passwordLabel.setFont(new Font("KoPub����ü Bold", Font.PLAIN, 16));
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setForeground(new Color(192, 192, 192));
		passwordLabel.setBounds(120, 196, 69, 18);
		welcomePanel.add(passwordLabel);
		
		JButton loginBtn = new JButton("LOGIN");
		loginBtn.setForeground(new Color(192, 192, 192));
		loginBtn.setFont(new Font("KoPub����ü Bold", Font.PLAIN, 14));
		loginBtn.setBackground(new Color(0, 0, 0));
		loginBtn.setBounds(297, 228, 82, 23);
		welcomePanel.add(loginBtn);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class ImagePanel extends JPanel {
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}
	
	public int getHeight() {
		return img.getHeight(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
}
