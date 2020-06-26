
package manager;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.io.*;
import java.util.*;

public class addemployee {

	private static JFrame frmTheCoronaCanteen;
	private JTextField first;
	private JTextField last;
	private JTextField email;
	private JPasswordField newpass;
	private static String year, month, day;
	private static String firstname,lastname,emailinput,manager,password,managerpassword,dob;
	public static int EMPLOYEEATTENDANCE,EMPLOYEEFLAG,EMPLOYEEPAY;
	public static String EMPLOYEEUSERNAME;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addemployee window = new addemployee();
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
	public addemployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheCoronaCanteen = new JFrame();
		frmTheCoronaCanteen.setResizable(false);
		frmTheCoronaCanteen.setIconImage(Toolkit.getDefaultToolkit().getImage("manager\\logo.png"));
		frmTheCoronaCanteen.setTitle("The Corona Canteen");
		frmTheCoronaCanteen.getContentPane().setBackground(new Color(222, 184, 135));
		frmTheCoronaCanteen.setBounds(100, 100, 683, 634);
		frmTheCoronaCanteen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTheCoronaCanteen.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE SIGN UP PAGE");
		lblNewLabel.setForeground(new Color(255, 250, 240));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel.setBounds(159, 23, 368, 53);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name : ");
		lblNewLabel_1.setForeground(new Color(255, 250, 240));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(82, 242, 131, 38);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name : ");
		lblNewLabel_1_1.setForeground(new Color(255, 250, 240));
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(82, 282, 131, 38);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email ID : ");
		lblNewLabel_1_2.setForeground(new Color(255, 250, 240));
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(82, 362, 131, 38);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Date of Birth : ");
		lblNewLabel_1_3.setForeground(new Color(255, 250, 240));
		lblNewLabel_1_3.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_3.setBounds(82, 322, 145, 38);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("New Password : ");
		lblNewLabel_1_4.setForeground(new Color(255, 250, 240));
		lblNewLabel_1_4.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_4.setBounds(82, 402, 158, 38);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(82, 447, 519, 14);
		frmTheCoronaCanteen.getContentPane().add(separator);
		
		first = new JTextField();
		first.setBounds(274, 250, 327, 25);
		frmTheCoronaCanteen.getContentPane().add(first);
		first.setColumns(10);
		
		first.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				firstname = first.getText();
				
				if(firstname.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your first name.");
							
			}		                                              
			});		
		
		last = new JTextField();
		last.setColumns(10);
		last.setBounds(274, 292, 327, 25);
		frmTheCoronaCanteen.getContentPane().add(last);
		
		last.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				lastname = last.getText();	
				
				if(lastname.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your last name.");
							
			}		                                              
			});	
		
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(274, 369, 327, 25);
		frmTheCoronaCanteen.getContentPane().add(email);
		
		email.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				emailinput = email.getText();	
				
				if(emailinput.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your email address.");
							
			}		                                              
			});
		
		newpass = new JPasswordField();
		newpass.setBounds(274, 410, 327, 25);
		frmTheCoronaCanteen.getContentPane().add(newpass);
		
		newpass.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
				password = newpass.getText();	
				
				if(password.isEmpty())
				JOptionPane.showMessageDialog(null, "Enter your new password");
							
			}		                                              
			});
		

				
		
		JComboBox d = new JComboBox();
		d.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		d.setBounds(274, 334, 87, 22);
		frmTheCoronaCanteen.getContentPane().add(d);
		
		d.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				day = d.getSelectedItem().toString();
			}			
			
		});
		
		JComboBox m = new JComboBox();
		m.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		m.setBounds(386, 334, 87, 22);
		frmTheCoronaCanteen.getContentPane().add(m);
		
		m.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				month = m.getSelectedItem().toString();
			}			
			
		});
		
		JComboBox y = new JComboBox();
		y.setModel(new DefaultComboBoxModel(new String[] {"1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"}));
		y.setBounds(500, 334, 101, 22);
		frmTheCoronaCanteen.getContentPane().add(y);
		
		y.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				year = y.getSelectedItem().toString();
				dob=day+"/"+month+"/"+year;
			}			
			
		});	
		
		
		
		JButton btnNewButton = new JButton("PROCEED");
		btnNewButton.setForeground(new Color(240, 230, 140));
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setBounds(209, 472, 248, 38);
		frmTheCoronaCanteen.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(firstname+" "+lastname);
				System.out.println(dob);
				System.out.println(emailinput);
				System.out.println(password);

				
				EMPLOYEEUSERNAME= firstname+(new Random().nextInt(50)+1);
				
				EMPLOYEEATTENDANCE=0;
				EMPLOYEEFLAG=0;
				EMPLOYEEPAY=0;
				
				fileadder();
				
			}			
			
		});		
		
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(addemployee.class.getResource("/manager/e3.png")));
		lblNewLabel_2.setBounds(258, 84, 145, 155);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("please press enter after every entry");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(171, 534, 368, 31);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_3);
	}
	
	
	
	static private void fileadder() {

		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("employeedata.txt",true));
			
			writer.write(EMPLOYEEUSERNAME+","+password+","+firstname+","+lastname+","+dob+","+emailinput+","+EMPLOYEEATTENDANCE+","+EMPLOYEEFLAG+","+EMPLOYEEPAY);
			writer.newLine();
			writer.close();		
			
			JOptionPane.showMessageDialog(null, "Congratulations, you are now a registered employee\nUsername: "+EMPLOYEEUSERNAME+"\n Password: "+password+"\nPlease remember your username and password as these are not changeable");
			frmTheCoronaCanteen.dispose();
			
			
		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "An error has occured during the sign up process. Please try again.");
			e.printStackTrace();
		}
		
		
		
		
		
		

	}
}

