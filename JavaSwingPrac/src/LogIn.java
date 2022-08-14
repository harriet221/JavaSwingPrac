import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	public String pw = "";
	public LogIn() {
		
		JPanel panel = new JPanel();
		JLabel id = new JLabel("ID : ");
		JTextField txtID = new JTextField(10);
		JLabel pswrd = new JLabel("Password : ");
		JPasswordField txtPass = new JPasswordField(10);
		JButton logBtn = new JButton("Log In");
		
		panel.add(id);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		
		char[] password = txtPass.getPassword();
		for(char chps : password) {
			Character.toString(chps);
			// pw += (pw.equals("")) ? ""+chps+"" : ""+chps+"";
			// 맞아도 틀려도 넣을거면 왜 하는 거지? ""는 왜 앞뒤로 넣을까?
			// 값이 pw에 없으면 저장, 있으면 이어서 저장? 어케 되는 거임...
			pw += chps; // 일단 이렇게 놓고 고민해보기
		}
		
		logBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Dan";
				String pass = "1234";
				int ps = 0;
				for(int i=0; i<pw.length(); i++) {
					if(pass.charAt(i) == pw.charAt(i))
						ps += 1;
				}
				
				if(id.equals(txtID.getText()) && ps == pw.length()) {
					JOptionPane.showMessageDialog(null, "You have logged in successfully");
				} else {
					JOptionPane.showMessageDialog(null, "You failed to login");
				}
				
			}
			
		});
		add(panel);
		
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new LogIn();
	}
}
