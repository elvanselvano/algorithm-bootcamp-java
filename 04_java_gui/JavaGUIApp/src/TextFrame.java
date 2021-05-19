import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFrame extends JFrame {
	
	JButton button;
	JTextField textField;
	
	TextFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(e -> {
			System.out.println(e);
			System.out.println("Hello!");
		});
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField.setForeground(Color.green);
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}
}
