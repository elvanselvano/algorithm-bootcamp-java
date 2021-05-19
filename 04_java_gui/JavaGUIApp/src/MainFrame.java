import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MainFrame extends JFrame {
	
	MainFrame() {
//		Images
		ImageIcon logo = new ImageIcon("./src/laugh.png");
		ImageIcon image = new ImageIcon("./src/kiss.png");
		this.setIconImage(logo.getImage());
		
//		Border
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
//		JLabel: GUI display area
		JLabel label = new JLabel();
		label.setText("Welcome to Java GUI App!");
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.LEFT); // left, center, right of imageicon
		label.setVerticalTextPosition(JLabel.CENTER); // top, center, bottom of imageicon
		label.setForeground(Color.white);
		label.setBackground(Color.black);
		label.setOpaque(true); // display background color
		label.setIconTextGap(8); // gap between text and image
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBorder(border);
		
//		JFrame: GUI Window that can hold components
		this.setTitle("Java GUI App");
		this.setSize(400, 400); // change x y dimension
		this.setResizable(false); // prevent window resizing
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(400, 400);
		
//		this.getContentPane().setBackground(Color.blue);
//		this.getContentPane().setBackground(new Color(200, 150, 70));
//		this.getContentPane().setBackground(new Color(0x0066FF));
		this.getContentPane().setBackground(new Color(135, 206, 235));
		this.add(label);
		
//		this.pack(); // menyesuaikan dengan contents
	}
	
}
