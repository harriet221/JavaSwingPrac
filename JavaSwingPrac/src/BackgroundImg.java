import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

public class BackgroundImg {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Image Prac");
		frame.setSize(640, 640);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		ImagePanel panel = new ImagePanel(new ImageIcon("./Image/coffee_maker.png").getImage());
		frame.add(panel);
		frame.pack();
		
		/*
		// 파일 존재 확인 방법
		File f = new File("./Image/coffee_maker.png");
		System.out.println(f.exists()? "Exists":"Doesn't Exists");
		*/
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
