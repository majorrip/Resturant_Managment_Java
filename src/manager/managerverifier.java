
package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class managerverifier {

	private static JFrame frmManagerPermissionRequired;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	
	public static String inputname,inputpass;
	private static File managerinfo;
	private static FileReader reader;
	
	public static boolean result=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					managerverifier window = new managerverifier();
					window.frmManagerPermissionRequired.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public managerverifier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmManagerPermissionRequired = new JFrame();
		frmManagerPermissionRequired.setIconImage(Toolkit.getDefaultToolkit().getImage(managerverifier.class.getResource("/manager/logo.png")));
		frmManagerPermissionRequired.setTitle("Manager Permission Required");
		frmManagerPermissionRequired.getContentPane().setBackground(new Color(222, 184, 135));
		frmManagerPermissionRequired.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrative Authentication Required");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel.setBounds(76, 21, 485, 30);
		frmManagerPermissionRequired.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_5 = new JLabel("Manager's Username : ");
		lblNewLabel_1_5.setForeground(new Color(255, 250, 240));
		lblNewLabel_1_5.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_5.setBounds(56, 80, 233, 38);
		frmManagerPermissionRequired.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Manager's Password :  ");
		lblNewLabel_1_6.setForeground(new Color(255, 250, 240));
		lblNewLabel_1_6.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_6.setBounds(56, 120, 222, 38);
		frmManagerPermissionRequired.getContentPane().add(lblNewLabel_1_6);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(284, 86, 291, 25);
		frmManagerPermissionRequired.getContentPane().add(textField);
		
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputname=textField.getText();
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(284, 129, 291, 24);
		frmManagerPermissionRequired.getContentPane().add(passwordField);
		
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputpass=passwordField.getText();
				
			}
		});
		
		btnNewButton = new JButton("PROCEED");
		btnNewButton.setForeground(new Color(240, 230, 140));
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setBounds(176, 191, 248, 38);
		frmManagerPermissionRequired.getContentPane().add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crosscheck();
			}
		});
		
		
		lblNewLabel_1 = new JLabel("please press enter after every entry");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(138, 253, 368, 31);
		frmManagerPermissionRequired.getContentPane().add(lblNewLabel_1);
		frmManagerPermissionRequired.setBounds(100, 100, 653, 334);
		frmManagerPermissionRequired.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
	}
	
	public static String name;
	public static String pass;
	public static Scanner sc;
	
	public static void crosscheck()
	{
	
			try {
				
				reader = new FileReader("manager.txt");			
				
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			
			
			sc = new Scanner(reader);
			String usernamearray[];
			
			while(sc.hasNextLine())
			{
				
				String usernameline = sc.nextLine();
				
				usernamearray = usernameline.split(",");
				
				name = usernamearray[0];
				pass = usernamearray[1];
			}
			
		if(name.equals(inputname) && pass.equals(inputpass))
		result=true;
		else
		JOptionPane.showMessageDialog(null, "Wrong Manager Creditentials");
			
		if(result==true)
		{
			String choice = JOptionPane.showInputDialog(null, "Press 1 for Adding Employee\n2 for Removing Employee");
			if(choice.equals("1"))
			{
				addemployee obj = new addemployee();
				obj.main(null);
				frmManagerPermissionRequired.dispose();
				
			}
			else if(choice.equals("2"))
			{
				rmvemployee obj = new rmvemployee();
				obj.main(null);
				frmManagerPermissionRequired.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Irrelevant Input");
			}
			
		}
	}
	
	
}



