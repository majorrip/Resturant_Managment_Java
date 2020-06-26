package customer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class customersignup {

	private JFrame frmTheCoronaCanteen;
	private JTextField textField;
	private JPasswordField passwordField;
	private String customername,password,customerusername;
	private int balance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customersignup window = new customersignup();
					window.frmTheCoronaCanteen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public customersignup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheCoronaCanteen = new JFrame();
		frmTheCoronaCanteen.setIconImage(Toolkit.getDefaultToolkit().getImage(customersignup.class.getResource("/employee/e3.png")));
		frmTheCoronaCanteen.setTitle("The Corona Canteen - New Customer Registration");
		frmTheCoronaCanteen.setResizable(false);
		frmTheCoronaCanteen.getContentPane().setBackground(new Color(210, 180, 140));
		frmTheCoronaCanteen.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("THE CORONA CANTEEN");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
		lblNewLabel_1.setBounds(113, 11, 382, 49);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("please press enter after every entry");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(121, 255, 350, 31);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_3);
		
		JLabel namelabel = new JLabel("Name : ");
		namelabel.setForeground(new Color(255, 250, 240));
		namelabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		namelabel.setBounds(42, 83, 131, 38);
		frmTheCoronaCanteen.getContentPane().add(namelabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(234, 91, 327, 25);
		frmTheCoronaCanteen.getContentPane().add(textField);
		
		JLabel passwordlabel = new JLabel("New Password : ");
		passwordlabel.setForeground(new Color(255, 250, 240));
		passwordlabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		passwordlabel.setBounds(42, 132, 158, 38);
		frmTheCoronaCanteen.getContentPane().add(passwordlabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(234, 140, 327, 25);
		frmTheCoronaCanteen.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("PROCEED");
		btnNewButton.setForeground(new Color(240, 230, 140));
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setBounds(169, 206, 248, 38);
		frmTheCoronaCanteen.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(42, 181, 519, 14);
		frmTheCoronaCanteen.getContentPane().add(separator);
		frmTheCoronaCanteen.setBounds(100, 100, 608, 344);
		frmTheCoronaCanteen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		textField.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				customername = textField.getText();	
				
				if(customername.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your name.");
							
			}		                                              
			});	
		
		passwordField.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				password = passwordField.getText();	
				
				if(password.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your desired password.");
							
			}		                                              
			});	
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				customerusername= customername+(new Random().nextInt(50)+1);
				
				try {
					
					BufferedWriter writer = new BufferedWriter(new FileWriter("customer.txt",true));
					
					balance = 0;
					writer.newLine();
					writer.write(customerusername+","+password+","+balance);
					writer.newLine();
					writer.close();		
					
					JOptionPane.showMessageDialog(null, "Congratulations, you are now a registered customer\nUsername: "+customerusername+"\nPassword: "+password+"\nPlease remember your username and password as these are not changeable");
					frmTheCoronaCanteen.dispose();
					
					
				} catch (IOException x) {

					JOptionPane.showMessageDialog(null, "An error has occured during the sign up process. Please try again.");
					x.printStackTrace();
				}	
							
			}		                                              
			});	
		
		
	}

}
