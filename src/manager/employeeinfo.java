
package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JMenuBar;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class employeeinfo {
	
	private FileReader reader;

	private JFrame frmEmployeeInformationTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employeeinfo window = new employeeinfo();
					window.frmEmployeeInformationTable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public employeeinfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeeInformationTable = new JFrame();
		frmEmployeeInformationTable.setResizable(false);
		frmEmployeeInformationTable.setTitle("Employee Information Table - The Corona Cafe");
		frmEmployeeInformationTable.getContentPane().setBackground(new Color(222, 184, 135));
		frmEmployeeInformationTable.setBounds(100, 100, 1000, 550);
		frmEmployeeInformationTable.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEmployeeInformationTable.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE INFORMATION TABLE");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel.setBounds(285, 10, 459, 71);
		frmEmployeeInformationTable.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(223, 124, 57, 40);
		frmEmployeeInformationTable.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("DATE OF BIRTH");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(350, 124, 180, 40);
		frmEmployeeInformationTable.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("EMAIL ID");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(564, 124, 91, 40);
		frmEmployeeInformationTable.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("USERNAME");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(41, 124, 134, 40);
		frmEmployeeInformationTable.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("ATTENDANCE");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(698, 124, 147, 40);
		frmEmployeeInformationTable.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("SALARY");
		lblNewLabel_1_5.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(883, 124, 157, 40);
		frmEmployeeInformationTable.getContentPane().add(lblNewLabel_1_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(41, 173, 899, 12);
		frmEmployeeInformationTable.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Total Number of Employees : ");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_2.setBounds(350, 86, 228, 14);
		frmEmployeeInformationTable.getContentPane().add(lblNewLabel_2);

		
		try {
			
			reader = new FileReader("employeedata.txt");			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(reader);
		String[] usernamearray;	
		String name,firstname,lastname,dateofbirth,emailid,attendancevalue,salaryvalue;
		
		int employeenumber=0;
		
		int unx=41,uny=196;
		int nx=195,ny=196;
		int doby=196;
		int emaily=196;
		int atty=196;
		int fl=196;
		
		while(sc.hasNextLine())
		{
			
			String usernameline = sc.nextLine();
			
			usernamearray = usernameline.split(",");
			
			name = usernamearray[0];
			
			firstname = usernamearray[2];
			lastname = usernamearray[3];
			dateofbirth = usernamearray[4];
			emailid = usernamearray[5];
			attendancevalue = usernamearray[6];
			salaryvalue = usernamearray[7];
			
			
			
			JLabel username = new JLabel(name);
			username.setBounds(unx, uny, 109, 20);
			frmEmployeeInformationTable.getContentPane().add(username);
			uny+=40;
			
			JLabel emname = new JLabel(firstname+" "+lastname);
			emname.setBounds(nx, ny, 134, 20);
			frmEmployeeInformationTable.getContentPane().add(emname);
			ny+=40;
			
			JLabel dob = new JLabel(dateofbirth);
			dob.setBounds(376, doby, 134, 20);
			frmEmployeeInformationTable.getContentPane().add(dob);
			doby+=40;
			
			JLabel email = new JLabel(emailid);
			email.setBounds(525, emaily, 200, 20);
			frmEmployeeInformationTable.getContentPane().add(email);
			emaily+=40;
			
			JLabel attendance = new JLabel(attendancevalue);
			attendance.setBounds(755, atty, 57, 20);
			frmEmployeeInformationTable.getContentPane().add(attendance);
			atty+=40;
			
			JLabel salary = new JLabel(salaryvalue);
			salary.setBounds(895, fl, 39, 20);
			frmEmployeeInformationTable.getContentPane().add(salary);
			fl+=40;
			
			employeenumber++;
			
		}
		
		JLabel employeenum = new JLabel(Integer.toString(employeenumber));
		employeenum.setFont(new Font("Century Gothic", Font.BOLD, 15));
		employeenum.setBounds(580, 86, 46, 14);
		frmEmployeeInformationTable.getContentPane().add(employeenum);
		
		JButton btnNewButton = new JButton("CLOSE");
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setForeground(new Color(250, 250, 210));
		btnNewButton.setBounds(450, 477, 89, 23);
		frmEmployeeInformationTable.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				frmEmployeeInformationTable.dispose();
				
			}			
			
		});		
		
		
		
		
	}
}

