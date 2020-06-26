package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import customer.customerHomeGUI;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class customerpayment {

    private JFrame frmTheCoronaCanteen;
    private JTextField textField;
    private JPasswordField passwordField;
    private String username, pass, balance;
    private FileReader reader;
    private static int marker;
    private JTextField paymentfield;
    private static String payment;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    customerpayment window = new customerpayment();
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
    public customerpayment() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmTheCoronaCanteen = new JFrame();
        frmTheCoronaCanteen.setIconImage(Toolkit.getDefaultToolkit().getImage(customerpayment.class.getResource("/employee/imageee.png")));
        frmTheCoronaCanteen.setResizable(false);
        frmTheCoronaCanteen.setTitle("The Corona Canteen - Customer Payment");
        frmTheCoronaCanteen.getContentPane().setBackground(new Color(222, 184, 135));
        frmTheCoronaCanteen.getContentPane().setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("THE CORONA CANTEEN");
        lblNewLabel_1.setForeground(Color.BLACK);
        lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
        lblNewLabel_1.setBounds(140, 26, 382, 49);
        frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("THE CORONA CANTEEN");
        lblNewLabel_1_1.setForeground(new Color(255, 245, 238));
        lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
        lblNewLabel_1_1.setBounds(137, 0, 382, 96);
        frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1_1);

        JLabel lblCustomerUsername = new JLabel("Customer Username : ");
        lblCustomerUsername.setForeground(new Color(255, 250, 240));
        lblCustomerUsername.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
        lblCustomerUsername.setBounds(45, 86, 216, 38);
        frmTheCoronaCanteen.getContentPane().add(lblCustomerUsername);

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(312, 99, 327, 25);
        frmTheCoronaCanteen.getContentPane().add(textField);

        JLabel lblPassword = new JLabel("Customer Password : ");
        lblPassword.setForeground(new Color(255, 250, 240));
        lblPassword.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
        lblPassword.setBounds(45, 135, 216, 38);
        frmTheCoronaCanteen.getContentPane().add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(312, 148, 327, 25);
        frmTheCoronaCanteen.getContentPane().add(passwordField);

        JSeparator separator = new JSeparator();
        separator.setBounds(46, 288, 583, 14);
        frmTheCoronaCanteen.getContentPane().add(separator);

        JButton btnClose = new JButton("CLOSE");
        btnClose.setForeground(new Color(240, 230, 140));
        btnClose.setBackground(new Color(47, 79, 79));
        btnClose.setBounds(213, 313, 248, 38);
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EmployeeHomeGUI obj=new EmployeeHomeGUI();
                obj.main(null);
                frmTheCoronaCanteen.setVisible(false);
        }
        });
        frmTheCoronaCanteen.getContentPane().add(btnClose);

        JLabel lblNewLabel_3 = new JLabel("please press enter after every entry");
        lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_3.setBounds(162, 362, 350, 31);
        frmTheCoronaCanteen.getContentPane().add(lblNewLabel_3);

        JLabel lblAuthenticate = new JLabel("Add payment :");
        lblAuthenticate.setForeground(new Color(255, 250, 240));
        lblAuthenticate.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
        lblAuthenticate.setBounds(45, 233, 235, 38);
        frmTheCoronaCanteen.getContentPane().add(lblAuthenticate);

        JLabel lblCurrentBalance = new JLabel("Authenticate :");
        lblCurrentBalance.setForeground(new Color(255, 250, 240));
        lblCurrentBalance.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
        lblCurrentBalance.setBounds(45, 184, 205, 38);
        frmTheCoronaCanteen.getContentPane().add(lblCurrentBalance);

        JButton authenticator = new JButton("CHECK");
        authenticator.setForeground(new Color(255, 255, 240));
        authenticator.setBackground(new Color(32, 178, 170));
        authenticator.setBounds(312, 190, 327, 23);
        frmTheCoronaCanteen.getContentPane().add(authenticator);

        paymentfield = new JTextField();
        paymentfield.setColumns(10);
        paymentfield.setBounds(312, 239, 327, 25);
        frmTheCoronaCanteen.getContentPane().add(paymentfield);
        frmTheCoronaCanteen.setBounds(100, 100, 681, 433);
        frmTheCoronaCanteen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        textField.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                username = textField.getText();

                if (username.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter your username.");
                }

            }
        });

        passwordField.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                pass = passwordField.getText();

                if (pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter your password.");
                }

            }
        });

        authenticator.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    reader = new FileReader("customer.txt");

                } catch (FileNotFoundException e1) {

                    e1.printStackTrace();
                }
                Scanner sc = new Scanner(reader);
                String login = username + "," + pass;

                while (sc.hasNextLine()) {

                    String usernameline = sc.nextLine();

                    if (usernameline.contains(login)) {
                        String[] usernamearray;
                        usernamearray = usernameline.split(",");
                        JOptionPane.showMessageDialog(null, "Hello " + usernamearray[0] + " Your current balance is: " + usernamearray[2]);
                    }

                }

            }
        });

        paymentfield.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int input=Integer.parseInt(paymentfield.getText());

                File file = new File("customer.txt");
                ArrayList<String> lines = new ArrayList<>();
                Scanner sc = new Scanner(System.in);
                String user = username; //ask user for the username
                String pwd = pass; //ask user for the password

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

                        if (parts[0].equals(user) && parts[1].equals(pwd)) { //if username and password match first and second parts of line, respectively
                            int temp = Integer.parseInt(parts[2]);
                            if(input>temp){
                             JOptionPane.showMessageDialog(null, "Insufficient funds");
                            }
                            else{
                            temp = temp - input;
                            parts[2] = String.valueOf(temp); //set third part of line to 500
                            }
                            
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

    }
}
