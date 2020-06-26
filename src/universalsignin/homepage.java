package universalsignin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import customer.customerHomeGUI;
import customer.customersignup;
import employee.EmployeeHomeGUI;
import manager.addemployee;
import manager.managerguihome;
import manager.rmvemployee;

import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSeparator;

public class homepage {

    private JFrame frmTheCoronaCanteen;
    private JTextField usernameinput;
    private JPasswordField usernamepassword;
    private String name, pass;
    private FileReader reader;
    private EmployeeHomeGUI obj;
    private managerguihome obj2;
    private customersignup obj3;
    private customerHomeGUI obj4;
    private boolean ans = false;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    homepage window = new homepage();
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
    public homepage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmTheCoronaCanteen = new JFrame();
        frmTheCoronaCanteen.setResizable(false);
        frmTheCoronaCanteen.setIconImage(Toolkit.getDefaultToolkit().getImage(homepage.class.getResource("/universalsignin/logo.png")));
        frmTheCoronaCanteen.setTitle("The Corona Canteen - Home Page");
        frmTheCoronaCanteen.getContentPane().setBackground(new Color(222, 184, 135));
        frmTheCoronaCanteen.getContentPane().setLayout(null);
 
        JLabel lblNewLabel_1 = new JLabel("THE CORONA CANTEEN");
        lblNewLabel_1.setForeground(Color.BLACK);
        lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
        lblNewLabel_1.setBounds(119, 37, 382, 49);
        frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("THE CORONA CANTEEN");
        lblNewLabel_1_1.setForeground(new Color(255, 245, 238));
        lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
        lblNewLabel_1_1.setBounds(116, 11, 382, 96);
        frmTheCoronaCanteen.getContentPane().add(lblNewLabel_1_1);

        JButton customer = new JButton("SIGN IN AS CUSTOMER");
        customer.setForeground(new Color(253, 245, 230));
        customer.setBackground(new Color(47, 79, 79));
        customer.setBounds(320, 206, 181, 31);
        frmTheCoronaCanteen.getContentPane().add(customer);

        JButton employee = new JButton("SIGN IN AS EMPLOYEE");
        employee.setForeground(new Color(253, 245, 230));
        employee.setBackground(new Color(47, 79, 79));
        employee.setBounds(91, 206, 181, 31);
        frmTheCoronaCanteen.getContentPane().add(employee);

        JButton manager = new JButton("SIGN IN AS MANAGER");
        manager.setForeground(new Color(253, 245, 230));
        manager.setBackground(new Color(47, 79, 79));
        manager.setBounds(208, 262, 181, 31);
        frmTheCoronaCanteen.getContentPane().add(manager);

        JButton customerreg = new JButton("REGISTER AS CUSTOMER");
        customerreg.setForeground(new Color(253, 245, 230));
        customerreg.setBackground(new Color(47, 79, 79));
        customerreg.setBounds(208, 344, 181, 31);
        frmTheCoronaCanteen.getContentPane().add(customerreg);

        usernameinput = new JTextField();
        usernameinput.setBounds(320, 118, 181, 20);
        frmTheCoronaCanteen.getContentPane().add(usernameinput);
        usernameinput.setColumns(10);

        JLabel usernamelabel = new JLabel("ENTER USERNAME: ");
        usernamelabel.setForeground(new Color(255, 255, 224));
        usernamelabel.setFont(new Font("Century Gothic", Font.BOLD, 15));
        usernamelabel.setBounds(112, 119, 181, 14);
        frmTheCoronaCanteen.getContentPane().add(usernamelabel);

        JLabel passwordlabel = new JLabel("ENTER PASSWORD:");
        passwordlabel.setForeground(new Color(255, 255, 224));
        passwordlabel.setFont(new Font("Century Gothic", Font.BOLD, 15));
        passwordlabel.setBounds(112, 157, 181, 14);
        frmTheCoronaCanteen.getContentPane().add(passwordlabel);

        usernamepassword = new JPasswordField();
        usernamepassword.setBounds(320, 156, 181, 20);
        frmTheCoronaCanteen.getContentPane().add(usernamepassword);

        JSeparator separator = new JSeparator();
        separator.setBounds(15, 314, 567, 12);
        frmTheCoronaCanteen.getContentPane().add(separator);

        JLabel lblNewLabel_3 = new JLabel("please press enter after every entry");
        lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_3.setBounds(128, 418, 350, 31);
        frmTheCoronaCanteen.getContentPane().add(lblNewLabel_3);
        frmTheCoronaCanteen.setBounds(100, 100, 613, 489);
        frmTheCoronaCanteen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        usernameinput.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                name = usernameinput.getText();

                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter your username.");
                }

            }
        });

        usernamepassword.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                pass = usernamepassword.getText();

                if (pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter your password.");
                }

            }
        });

        employee.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {

                    reader = new FileReader("employeedata.txt");

                } catch (FileNotFoundException e1) {

                    e1.printStackTrace();
                }

                Scanner sc = new Scanner(reader);
                String[] usernamearray;
                String[] namearr = new String[50];
                String[] passw = new String[50];
                int m = 0;

                while (sc.hasNextLine()) {

                    String usernameline = sc.nextLine();

                    usernamearray = usernameline.split(",");

                    namearr[m] = usernamearray[0];
                    passw[m] = usernamearray[1];
                    m++;

                }
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
                int round = 0;
                boolean usernameflag = false;
                boolean passflag = false;

                while (round < m) {
                    if (namearr[round].equalsIgnoreCase(name)) {
                        usernameflag = true;
                    }
                    round++;
                }

                round = 0;
                while (round < m) {
                    if (passw[round].equalsIgnoreCase(pass)) {
                        passflag = true;
                    }
                    round++;
                }

                if (usernameflag == true && passflag == true) {
                    JOptionPane.showMessageDialog(null, "Sign In Successful!");
                    frmTheCoronaCanteen.dispose();

                    obj = new EmployeeHomeGUI();
                    obj.main(null);

                    homepage hp = new homepage();
                    hp.setverify(true);

                }

            }

        });

        manager.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    reader = new FileReader("manager.txt");

                } catch (FileNotFoundException e1) {

                    e1.printStackTrace();
                }

                Scanner sc = new Scanner(reader);
                String[] usernamearray;
                String[] namearr = new String[50];
                String[] passw = new String[50];
                int m = 0;

                while (sc.hasNextLine()) {

                    String usernameline = sc.nextLine();

                    usernamearray = usernameline.split(",");

                    namearr[m] = usernamearray[0];
                    passw[m] = usernamearray[1];
                    m++;

                }
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
                int round = 0;
                boolean usernameflag = false;
                boolean passflag = false;

                while (round < m) {
                    if (namearr[round].equalsIgnoreCase(name)) {
                        usernameflag = true;
                    }
                    round++;
                }

                round = 0;
                while (round < m) {
                    if (passw[round].equalsIgnoreCase(pass)) {
                        passflag = true;
                    }
                    round++;
                }

                if (usernameflag == true && passflag == true) {
                    JOptionPane.showMessageDialog(null, "Sign In Successful!");
                    frmTheCoronaCanteen.dispose();

                    obj2 = new managerguihome();
                    obj2.main(null);

                    homepage hp = new homepage();
                    hp.setverify(true);

                }

            }
        });

        customerreg.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                obj3 = new customersignup();
                obj3.main(null);

            }
        });

        customer.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    reader = new FileReader("customer.txt");

                } catch (FileNotFoundException e1) {

                    e1.printStackTrace();
                }

                Scanner sc = new Scanner(reader);
                String[] usernamearray;
                String[] namearr = new String[50];
                String[] passw = new String[50];
                int m = 0;

                while (sc.hasNextLine()) {

                    String usernameline = sc.nextLine();

                    usernamearray = usernameline.split(",");

                    namearr[m] = usernamearray[0];
                    passw[m] = usernamearray[1];
                    m++;

                }
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
                int round = 0;
                boolean usernameflag = false;
                boolean passflag = false;

                while (round < m) {
                    if (namearr[round].equalsIgnoreCase(name)) {
                        usernameflag = true;
                    }
                    round++;
                }

                round = 0;
                while (round < m) {
                    if (passw[round].equalsIgnoreCase(pass)) {
                        passflag = true;
                    }
                    round++;
                }

                if (usernameflag == true && passflag == true) {
                    JOptionPane.showMessageDialog(null, "Sign In Successful!");
                    frmTheCoronaCanteen.dispose();

                    obj4 = new customerHomeGUI();
                    obj4.main(null);

                    homepage hp = new homepage();
                    hp.setverify(true);

                }

            }
        });

    }

    public void setverify(boolean ans) {
        this.ans = ans;
    }

    public boolean getverify() {
        return ans;
    }
}
