import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonFrame extends JFrame {
	
	JButton button;
	JLabel label;
	JLabel label2;
	JCheckBox checkBox;
	
	ButtonFrame() {
//		Images
		ImageIcon icon = new ImageIcon("./src/think.png");
		ImageIcon icon2 = new ImageIcon("./src/roll.png");
		ImageIcon icon3 = new ImageIcon("./src/steam.png");

//		Label 1
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(100, 250, 150, 150);
		label.setVisible(false);
		
//		Label 2
		label2 = new JLabel();
		label2.setIcon(icon3);
		label2.setBounds(300, 250, 150, 150);
		label2.setVisible(false);
		
//		Button
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.setText("Submit");
		button.setIcon(icon2);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 18));
		button.setIconTextGap(5);
		button.setForeground(Color.orange);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
//		Checkbox
		checkBox = new JCheckBox();
		checkBox.setText("Agree to terms and conditions");
		checkBox.setFont(new Font("Comic Sans", Font.PLAIN, 14));
		checkBox.setBounds(100, 200, 250, 100);
		
//		Frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setResizable(false);
		this.add(button);
		this.add(label);
		this.add(label2);
		this.add(checkBox);
		
//		Action Listener Checkbox
		checkBox.addActionListener(e -> {
			if(checkBox.isSelected()) {
				label.setVisible(true);
			}
 		});
		
//		Action Listener Button
		button.addActionListener(e -> {
			label2.setVisible(true);
		});
	}
}
