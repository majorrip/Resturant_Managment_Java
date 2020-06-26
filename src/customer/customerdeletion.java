package customer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import manager.rmvemployee;
import universalsignin.homepage;

public class customerdeletion {

	private JFrame frmTheCoronaCanteen;
	private JTextField customerNAME;
	private JPasswordField customerPASSWORD1st;
	private JPasswordField customerPASSWORD2nd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerdeletion window = new customerdeletion();
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
	public customerdeletion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheCoronaCanteen = new JFrame();
		frmTheCoronaCanteen.setIconImage(Toolkit.getDefaultToolkit().getImage(customerdeletion.class.getResource("/employee/imageee.png")));
		frmTheCoronaCanteen.setTitle("The Corona Canteen - Customer Deletion");
		frmTheCoronaCanteen.getContentPane().setBackground(new Color(210, 180, 140));
		frmTheCoronaCanteen.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("THE CORONA CANTEEN");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
		lblNewLabel_1.setBounds(81, 11, 382, 49);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("please press enter after every entry");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(89, 322, 350, 31);
		frmTheCoronaCanteen.getContentPane().add(lblNewLabel_3);
		
		JLabel namelabel = new JLabel("Name : ");
		namelabel.setForeground(new Color(255, 250, 240));
		namelabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		namelabel.setBounds(10, 83, 131, 38);
		frmTheCoronaCanteen.getContentPane().add(namelabel);
		
		customerNAME = new JTextField();
		customerNAME.setColumns(10);
		customerNAME.setBounds(202, 91, 327, 25);
		frmTheCoronaCanteen.getContentPane().add(customerNAME);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setForeground(new Color(255, 250, 240));
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblPassword.setBounds(10, 132, 158, 38);
		frmTheCoronaCanteen.getContentPane().add(lblPassword);
		
		customerPASSWORD1st = new JPasswordField();
		customerPASSWORD1st.setBounds(202, 140, 327, 25);
		frmTheCoronaCanteen.getContentPane().add(customerPASSWORD1st);
		
		JButton CONFIRM = new JButton("CONFIRM");
		CONFIRM.setForeground(new Color(240, 230, 140));
		CONFIRM.setBackground(new Color(47, 79, 79));
		CONFIRM.setBounds(137, 273, 248, 38);
		frmTheCoronaCanteen.getContentPane().add(CONFIRM);
                CONFIRM.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
				
			BufferedReader reader = null;
                try {
                    String comp = customerNAME.getText() + "," + customerPASSWORD1st.getText();
                    File inputFile = new File("customer.txt");
                    File tempFile = new File("myTempFile.txt");
                    reader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter writer = null;
                    try {
                        writer = new BufferedWriter(new FileWriter(tempFile));
                    } catch (IOException ex) {
                        Logger.getLogger(rmvemployee.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //String lineToRemove = "bbb";
                    String currentLine;
                    while ((currentLine = reader.readLine()) != null) {
                        // trim newline when comparing with lineToRemove
                        String trimmedLine = currentLine.trim();
                        if (trimmedLine.contains(comp)) {
                            continue;
                        }
                        writer.write(currentLine + System.getProperty("line.separator"));
                    }
                    writer.close();
                    reader.close();
                    inputFile.delete();
                    tempFile.renameTo(inputFile);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(rmvemployee.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(rmvemployee.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        reader.close();
                        
                    } catch (IOException ex) {
                        Logger.getLogger(rmvemployee.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                homepage obj = new homepage();
                obj.main(null);
                frmTheCoronaCanteen.dispose();
							
			}		                                              
			});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 248, 519, 14);
		frmTheCoronaCanteen.getContentPane().add(separator);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Pass : ");
		lblConfirmPassword.setForeground(new Color(255, 250, 240));
		lblConfirmPassword.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblConfirmPassword.setBounds(10, 181, 158, 38);
		frmTheCoronaCanteen.getContentPane().add(lblConfirmPassword);
		
		customerPASSWORD2nd = new JPasswordField();
		customerPASSWORD2nd.setBounds(202, 189, 327, 25);
		frmTheCoronaCanteen.getContentPane().add(customerPASSWORD2nd);
		frmTheCoronaCanteen.setBounds(100, 100, 557, 415);
		frmTheCoronaCanteen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
	}
}

