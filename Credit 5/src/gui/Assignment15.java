package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignment15 
{

	private JFrame frame;
	private JTextField user_ans;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try 
				{
					Assignment15 window = new Assignment15();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assignment15() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 390, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 374, 182);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Question = new JLabel("");
		Question.setBounds(10, 11, 364, 14);
		Question.setForeground(new Color(0, 0, 139));
		Question.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(Question);
		
		int num1 = 1 + (int) (Math.random()*10);
		int num2 = 1 + (int) (Math.random()*10);
					
		double answer = (double) num1 / num2;
		double round_answer = (double) (Math.round(answer*100.0)/100.0);
					
		Question.setText("What is " + num1 + "/" + num2 + "? Answer to two decimal places.");
		
		user_ans = new JTextField();
		user_ans.setFont(new Font("Tahoma", Font.PLAIN, 13));
		user_ans.setBounds(10, 34, 86, 20);
		panel.add(user_ans);
		user_ans.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.setBounds(106, 34, 60, 23);
		panel.add(btnNewButton);
		
		
	}
}
