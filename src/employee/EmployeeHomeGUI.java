package employee;

import employee.customerpayment;
import employee.customerrefill;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

import menu.Menu;
import universalsignin.homepage;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeHomeGUI {

    private JFrame frmTheCoronaCanteen;
    private customerpayment obj1;
    private customerrefill obj2;
    private Menu obj3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmployeeHomeGUI window = new EmployeeHomeGUI();
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
    public EmployeeHomeGUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmTheCoronaCanteen = new JFrame();
        frmTheCoronaCanteen.setIconImage(Toolkit.getDefaultToolkit().getImage(EmployeeHomeGUI.class.getResource("/employee/imageee.png")));
        frmTheCoronaCanteen.setTitle("The Corona Canteen - Employee Home Page");
        frmTheCoronaCanteen.setResizable(false);
        frmTheCoronaCanteen.getContentPane().setBackground(new Color(222, 184, 135));
        frmTheCoronaCanteen.getContentPane().setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("THE CORONA CANTEEN");
        lblNewLabel_1.setForeground(Color.BLACK);
        lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
        lblNewLabel_1.setBounds(100, 26, 382, 49);
        frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("THE CORONA CANTEEN");
        lblNewLabel_1_1.setForeground(new Color(255, 245, 238));
        lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
        lblNewLabel_1_1.setBounds(97, 0, 382, 96);
        frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1_1);

        JButton btnAttendanceAdd = new JButton("Give Attendance");
        btnAttendanceAdd.setForeground(new Color(250, 240, 230));
        btnAttendanceAdd.setBackground(new Color(47, 79, 79));
        btnAttendanceAdd.setBounds(78, 109, 187, 23);
        btnAttendanceAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame f = new JFrame();
                String name = JOptionPane.showInputDialog(f, "Enter Your Username");
                File file = new File("employeedata.txt");
                ArrayList<String> lines = new ArrayList<>();
                Scanner sc = new Scanner(System.in);
                //String user = username; //ask user for the username
                //String pwd = pass; //ask user for the password

                try (Scanner in = new Scanner(file)) {
                    while (in.hasNext()) { //read in all lines
                        lines.add(in.nextLine());
                    }
                } catch (FileNotFoundException ep) {
                    throw new RuntimeException("File not found");
                }

                try (FileWriter out = new FileWriter(file)) {
                    for (int i = 0; i < lines.size(); i++) { //iterate over lines
                        String[] parts = lines.get(i).split(","); //split line by commas

                        if (parts[0].equals(name)) { //if username and password match first and second parts of line, respectively
                            //System.out.println("this works" + parts[2]);
                            int temp = Integer.parseInt(parts[6]);
                            //System.out.println(""+temp);
                            temp = temp + 1;
                            //System.out.println(""+temp);
                            parts[6] = String.valueOf(temp); //set third part of line to 500
                            //System.out.println(""+parts[6]);
                            JOptionPane.showMessageDialog(null, "Succesfully added attendance");
                        }

                        for (int j = 0; j < parts.length; j++) { //iterate over all the parts and write them back
                            out.write(parts[j]);

                            if (j < parts.length - 1) { //only add a comma if it isn't at the end of the line
                                out.write(',');
                            }
                        }

                        if (i < lines.size() - 1) { //add a line break if it isn't the last line
                            out.write('\n');
                        }

                    }

                    out.flush(); //write everything to the file
                } catch (IOException ez) {
                    throw new RuntimeException("IO exception occurred");
                }

            }
        });
        frmTheCoronaCanteen.getContentPane().add(btnAttendanceAdd);

        JButton btnViewMenu = new JButton("View Menu");
        btnViewMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obj3 = new Menu();
                try {
                    obj3.main(null); // TODO Auto-generated catch block
                } catch (InstantiationException ex) {
                    Logger.getLogger(EmployeeHomeGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(EmployeeHomeGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(EmployeeHomeGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        btnViewMenu.setForeground(new Color(250, 240, 230));
        btnViewMenu.setBackground(new Color(47, 79, 79));
        btnViewMenu.setBounds(78, 143, 187, 23);
        frmTheCoronaCanteen.getContentPane().add(btnViewMenu);

        JButton btnChangePassword = new JButton("Change Password");
        btnChangePassword.setForeground(new Color(250, 240, 230));
        btnChangePassword.setBackground(new Color(47, 79, 79));
        btnChangePassword.setBounds(78, 177, 187, 23);
        btnChangePassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame f = new JFrame();
                String name = JOptionPane.showInputDialog(f, "Enter Your password: ");
                File file = new File("employeedata.txt");
                ArrayList<String> lines = new ArrayList<>();
                Scanner sc = new Scanner(System.in);
                //String user = username; //ask user for the username
                //String pwd = pass; //ask user for the password

                try (Scanner in = new Scanner(file)) {
                    while (in.hasNext()) { //read in all lines
                        lines.add(in.nextLine());
                    }
                } catch (FileNotFoundException ep) {
                    throw new RuntimeException("File not found");
                }

                try (FileWriter out = new FileWriter(file)) {
                    for (int i = 0; i < lines.size(); i++) { //iterate over lines
                        String[] parts = lines.get(i).split(","); //split line by commas

                        if (parts[1].equals(name)) { //if  password match 

                            String pass = JOptionPane.showInputDialog(f, "Enter Your new password: ");

                            parts[1] = pass;
                            JOptionPane.showMessageDialog(null, "Succesfully changed");
                        }

                        for (int j = 0; j < parts.length; j++) { //iterate over all the parts and write them back
                            out.write(parts[j]);

                            if (j < parts.length - 1) { //only add a comma if it isn't at the end of the line
                                out.write(',');
                            }
                        }

                        if (i < lines.size() - 1) { //add a line break if it isn't the last line
                            out.write('\n');
                        }
                        
                        

                    }

                    out.flush(); //write everything to the file
                } catch (IOException ez) {
                    throw new RuntimeException("IO exception occurred");
                }

            }
        });
        frmTheCoronaCanteen.getContentPane().add(btnChangePassword);

        JButton btnAddCustomerPay = new JButton("Add Customer Pay");
        btnAddCustomerPay.setForeground(new Color(250, 240, 230));
        btnAddCustomerPay.setBackground(new Color(47, 79, 79));
        btnAddCustomerPay.setBounds(314, 109, 187, 23);
        btnAddCustomerPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                obj1 = new customerpayment();
                obj1.main(null);

            }
        });
        frmTheCoronaCanteen.getContentPane().add(btnAddCustomerPay);

        JButton btnCheckPayroll = new JButton("Check Payroll");
        btnCheckPayroll.setForeground(new Color(250, 240, 230));
        btnCheckPayroll.setBackground(new Color(47, 79, 79));
        btnCheckPayroll.setBounds(314, 143, 187, 23);
        btnCheckPayroll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                FileReader reader = null;
                try {
                    reader = new FileReader("employeedata.txt");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(EmployeeHomeGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                Scanner sc = new Scanner(reader);
                JFrame f=new JFrame();
                String login= JOptionPane.showInputDialog(f, "Enter Your password: ");
                
                while (sc.hasNextLine()) {

                    String usernameline = sc.nextLine();

                    if(usernameline.contains(login)){
                        String[] usernamearray;
                        usernamearray = usernameline.split(",");
                        JOptionPane.showMessageDialog(null, "Hello "+usernamearray[0]+" Your current balance is: " + usernamearray[7]);
                    }


                }
                
                
                
            }
        });
        frmTheCoronaCanteen.getContentPane().add(btnCheckPayroll);

        JButton btnRefillCustomerBalance = new JButton("Refill Customer Balance");
        btnRefillCustomerBalance.setForeground(new Color(250, 240, 230));
        btnRefillCustomerBalance.setBackground(new Color(47, 79, 79));
        btnRefillCustomerBalance.setBounds(314, 177, 187, 23);
        btnRefillCustomerBalance.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                obj2 = new customerrefill();
                obj2.main(null);

            }
        });
        frmTheCoronaCanteen.getContentPane().add(btnRefillCustomerBalance);
        frmTheCoronaCanteen.setBounds(100, 100, 603, 268);
        frmTheCoronaCanteen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        

        

        

    }

}
