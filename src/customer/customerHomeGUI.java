package customer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import manager.managerguihome;
import menu.Menu;

public class customerHomeGUI {

	private JFrame frmTheCoronaCanteen;
	private customerdeletion obj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerHomeGUI window = new customerHomeGUI();
					window.frmTheCoronaCanteen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public customerHomeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheCoronaCanteen = new JFrame();
		frmTheCoronaCanteen.setIconImage(Toolkit.getDefaultToolkit().getImage(customerHomeGUI.class.getResource("/employee/imageee.png")));
		frmTheCoronaCanteen.setTitle("The Corona Canteen - Customer Home Page");
		frmTheCoronaCanteen.setResizable(false);
		frmTheCoronaCanteen.getContentPane().setBackground(new Color(222, 184, 135));
		frmTheCoronaCanteen.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("THE CORONA CANTEEN");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
		lblNewLabel_1.setBounds(117, 26, 382, 49);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("THE CORONA CANTEEN");
		lblNewLabel_1_1.setForeground(new Color(255, 245, 238));
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
		lblNewLabel_1_1.setBounds(114, 0, 382, 96);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1_1);
		
		JButton ORDERFOOD = new JButton("ORDER FOOD");
		ORDERFOOD.setForeground(new Color(255, 255, 224));
		ORDERFOOD.setBackground(new Color(47, 79, 79));
		ORDERFOOD.setBounds(196, 86, 201, 23);
		frmTheCoronaCanteen.getContentPane().add(ORDERFOOD);
                ORDERFOOD.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
			Menu menuObj= new Menu();
                        menuObj.setVisible(true);
							
			}		                                              
			});	
		
		JButton PROVIDEFEEDBACK = new JButton("PROVIDE FEEDBACK");
		PROVIDEFEEDBACK.setForeground(new Color(255, 255, 224));
		PROVIDEFEEDBACK.setBackground(new Color(47, 79, 79));
		PROVIDEFEEDBACK.setBounds(196, 132, 201, 23);
		frmTheCoronaCanteen.getContentPane().add(PROVIDEFEEDBACK);
                PROVIDEFEEDBACK.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                String path = JOptionPane.showInputDialog("Enter Feedback!");
                //Scanner input=new Scanner(System.in);
                String feedbackinput;
                feedbackinput = path;
                try {
                    BufferedWriter feedback = new BufferedWriter(new FileWriter("FEEDBACK.txt", true));
                    feedback.write(feedbackinput);
                    feedback.newLine();
                    feedback.close();
                    //System.out.println("Your feedback was valuable.");
                    JFrame f=new JFrame();
                     JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
                } catch (IOException ex) {
                    //System.out.println("An error occurred.");
                    JFrame f=new JFrame();
                    JOptionPane.showMessageDialog(f,"An error occurred.","Alert",JOptionPane.WARNING_MESSAGE);
                    ex.printStackTrace();
                }              
            }
        });
		
		JButton PAYMENTINSTRUCTIONS = new JButton("INSTRUCTIONS ON PAYMENT");
		PAYMENTINSTRUCTIONS.setForeground(new Color(255, 255, 224));
		PAYMENTINSTRUCTIONS.setBackground(new Color(47, 79, 79));
		PAYMENTINSTRUCTIONS.setBounds(196, 176, 201, 23);
		frmTheCoronaCanteen.getContentPane().add(PAYMENTINSTRUCTIONS);
                PAYMENTINSTRUCTIONS.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                     JFrame j=new JFrame();
                      Runnable r = () -> {
            String html = "<html><body width='%2s'><h1>INSTRUCTIONS</h1>"
                + "<p>Take screenshot of the menu after completing choosing dish "
                + "and go to the register and show it to the employee."
                + "You will need to tell your name as in in the database."
                + "and then proceed with payment<br><br>"
                + "<p>Thank You!";
            // change to alter the width 
            int w = 175;

            JOptionPane.showMessageDialog(j, String.format(html, w, w));
        };
        SwingUtilities.invokeLater(r);
                     
                 }
        });
		
		JButton CheckBalance = new JButton("CHECK BALANCE");
		CheckBalance.setForeground(new Color(255, 255, 224));
		CheckBalance.setBackground(new Color(47, 79, 79));
		CheckBalance.setBounds(196, 222, 201, 23);
                CheckBalance.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
		FileReader reader = null;		
                            try {
                                reader = new FileReader("customer.txt");
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(customerHomeGUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                Scanner sc = new Scanner(reader);
                JFrame f = new JFrame();
                String login=JOptionPane.showInputDialog(f, "Enter your Name as stored in our file"); 
                
                while (sc.hasNextLine()) {

                    String usernameline = sc.nextLine();

                    if(usernameline.contains(login)){
                        String[] usernamearray;
                        usernamearray = usernameline.split(",");
                        JOptionPane.showMessageDialog(null, "Hello "+usernamearray[0]+" Your current balance is: " + usernamearray[2]);
							
			}
                }
                        
                }});
		frmTheCoronaCanteen.getContentPane().add(CheckBalance);
		
		JButton DELETE = new JButton("DELETE ACCOUNT");
		DELETE.setForeground(new Color(250, 240, 230));
		DELETE.setBackground(new Color(240, 128, 128));
		DELETE.setBounds(196, 262, 201, 23);
		frmTheCoronaCanteen.getContentPane().add(DELETE);
		frmTheCoronaCanteen.setBounds(100, 100, 611, 336);
		frmTheCoronaCanteen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		DELETE.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
				
			obj = new customerdeletion();
			obj.main(null);
							
			}		                                              
			});	
		
	}
}

