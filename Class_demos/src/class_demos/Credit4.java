package class_demos;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit4 {

	private JFrame frame;
	private JTextField FNt;
	private JLabel LN;
	private JTextField LNt;
	private JLabel Ag;
	private JTextField Agt;
	private JButton SB;
	private JButton Cl;
	private JLabel Dis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit4_GUI window = new Credit4_GUI();
					((JComponent) window.frame).setVisible(true);
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
	public Credit4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		Dis.setBounds(0, 156, 478, 119);
		panel.add(Dis);
		
		Agt = new JTextField();
		Agt.setColumns(10);
		Agt.setBounds(79, 100, 140, 20);
		panel.add(Agt);
		
		SB = new JButton("Submit");
		SB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String FN = FNt.getText();
				String LN = LNt.getText();
				String Ag = Agt.getText();
				Dis.setText("First name: " + FN + "        Last name: " + LN + "and your age is: " + Ag);
				
			}
		});
		SB.setBounds(229, 11, 146, 55);
		panel.add(SB);
		
		Cl = new JButton("Clear");
		Cl.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				FN.setText(" ");
				LN.setText(" ");
				Ag.setText(" ");
			}
		});
		Cl.setBounds(229, 71, 146, 55);
		panel.add(Cl);
		
		
	}
}
