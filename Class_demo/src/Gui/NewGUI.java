package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewGUI {

	private JFrame frame;
	ImageIcon img1 = new ImageIcon("../Class_demo/src/Gui/Gull_portrait_ca_usa.jpg");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewGUI window = new NewGUI();
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
	public NewGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel img = new JLabel("");
		img.setBounds(10, 53, 216, 153);
		frame.getContentPane().add(img);
		
		JButton btnNewButton = new JButton("Press to show an image");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				img.setIcon(img1);
			}
		});
		btnNewButton.setBounds(242, 93, 141, 58);
		frame.getContentPane().add(btnNewButton);
	}
}

