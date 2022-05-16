package class_demos;

import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class FN_LN_Gui {

	private JFrame frame;
	private JTextField FNt;
	private JLabel LN;
	private JTextField LNt;
	private JLabel Ag;
	private JButton SB;
	private JButton Cl;
	private JLabel Dis;
	private JComboBox AgCB;
	private JButton CL;
	private JPanel panel_1;

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
					FN_LN_Gui window = new FN_LN_Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public FN_LN_Gui()
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
		frame.setBounds(100, 100, 494, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 478, 275);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel FN = new JLabel("First name:");
		FN.setBounds(10, 11, 87, 31);
		panel.add(FN);
		
		FNt = new JTextField();
		FNt.setBounds(79, 16, 140, 20);
		panel.add(FNt);
		FNt.setColumns(10);
		
		LN = new JLabel("Last name:");
		LN.setBounds(10, 53, 87, 31);
		panel.add(LN);
		
		LNt = new JTextField();
		LNt.setColumns(10);
		LNt.setBounds(79, 58, 140, 20);
		panel.add(LNt);
		
		
		
		Ag = new JLabel("Age:");
		Ag.setBounds(48, 95, 70, 31);
		panel.add(Ag);
		
		Dis = new JLabel("");
		Dis.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Dis.setBounds(10, 158, 295, 106);
		panel.add(Dis);
		
		AgCB = new JComboBox();
		AgCB.setModel(new DefaultComboBoxModel(new String[] {"Grade 10", "Grade 11", "Grade 12"}));
		AgCB.setBounds(79, 99, 140, 22);
		panel.add(AgCB);
		
		SB = new JButton("Submit");
		SB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		SB.setBackground(new Color(0, 204, 51));
		SB.setForeground(new Color(255, 255, 255));
		SB.addActionListener(new ActionListener() 
		{
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e)
			{
				String FN = FNt.getText();
				String LN = LNt.getText();
				int grade = 0;
						
				if(AgCB.getSelectedItem().equals("Grade 10"))
				{
					grade = 10;
				}
				else if(AgCB.getSelectedItem().equals("Grade 11"))
				{
					grade = 11;
					Gui_2 k = new Gui_2();
					
				}
				else
				{
					grade = 12;
				}
				
				Dis.setText("First name: " + FN + " | Last name: " + LN + " | Your grade is: " + grade);
				
			}
		});
		SB.setBounds(229, 11, 146, 55);
		panel.add(SB);
		
		CL = new JButton("Clear");
		CL.setForeground(new Color(255, 255, 255));
		CL.setBackground(new Color(255, 51, 0));
		CL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		CL.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				FNt.setText(" ");
				LNt.setText(" ");
				AgCB.setSelectedItem("Grade 10");
				Dis.setText(" ");
			}
		});
		CL.setBounds(229, 71, 146, 55);
		panel.add(CL);
		
		panel_1 = new JPanel();
		panel_1.setBounds(315, 158, 153, 106);
		panel.add(panel_1);
		
		
	
		
	}
}
