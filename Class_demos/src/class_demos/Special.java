package class_demos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Special {

	private JFrame frame;
	private JTextField TD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special window = new Special();
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
	public Special() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 368, 289);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-2, -1, 434, 250);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel td = new JLabel("Enter two digits");
		td.setFont(new Font("Tahoma", Font.PLAIN, 12));
		td.setBounds(26, 25, 93, 32);
		panel.add(td);
		
		TD = new JTextField();
		TD.setBounds(26, 56, 93, 32);
		panel.add(TD);
		TD.setColumns(10);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 159, 330, 80);
		panel.add(dis);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String twoDigit = TD.getText();
				int twoD = Integer.parseInt(twoDigit);
				int firstD = twoD / 10;
				dis.setText(""+firstD);
				//int sum = 
			}
		});
		btnNewButton.setBounds(182, 38, 102, 43);
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setBounds(182, 92, 102, 43);
		panel.add(btnClear);
	}
}
