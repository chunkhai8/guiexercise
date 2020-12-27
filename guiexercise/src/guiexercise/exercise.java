package guiexercise;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class exercise {

	private JFrame frame;
	private JTextField textFieldnum1;
	private JTextField textFieldnum2;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField textFieldans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercise window = new exercise();
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
	public exercise() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBounds(66, 29, 171, 50);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setColumns(10);
		textFieldnum2.setBounds(279, 29, 171, 50);
		frame.getContentPane().add(textFieldnum2);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldnum1.getText());
					num2=Integer.parseInt(textFieldnum2.getText());
					
					ans= num1+num2;
					textFieldans.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, ("Please Enter Valid Number"));
				}
			}
		});
		btnNewButton.setBounds(107, 123, 106, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldnum1.getText());
					num2=Integer.parseInt(textFieldnum2.getText());
					
					ans= num1-num2;
					textFieldans.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, ("Please Enter Valid Number"));
				}
			}
		});
		btnNewButton_1.setBounds(312, 123, 106, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldnum1.getText());
					num2=Integer.parseInt(textFieldnum2.getText());
					
					ans= num1*num2;
					textFieldans.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, ("Please Enter Valid Number"));
				}
			}
		});
		btnNewButton_2.setBounds(107, 168, 106, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldnum1.getText());
					num2=Integer.parseInt(textFieldnum2.getText());
					
					ans= num1/num2;
					textFieldans.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, ("Please Enter Valid Number"));
				}
			}
		});
		btnNewButton_3.setBounds(312, 168, 106, 32);
		frame.getContentPane().add(btnNewButton_3);
		
		textFieldans = new JTextField();
		textFieldans.setBounds(279, 224, 157, 44);
		frame.getContentPane().add(textFieldans);
		textFieldans.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The answer is ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(144, 224, 112, 44);
		frame.getContentPane().add(lblNewLabel);
	}
}
