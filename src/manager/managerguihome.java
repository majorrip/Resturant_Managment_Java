package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import universalsignin.homepage;

import java.awt.Font;
import java.awt.Image;
import static java.awt.SystemColor.menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UnsupportedLookAndFeelException;

import menu.Total_Sell;
import menu.Menu;

public class managerguihome {

    private JFrame frmManagerHomePage;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    managerguihome window = new managerguihome();
                    window.frmManagerHomePage.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public managerguihome() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmManagerHomePage = new JFrame();
        frmManagerHomePage.setIconImage(Toolkit.getDefaultToolkit().getImage(managerguihome.class.getResource("/universalsignin/imageee.png")));
        frmManagerHomePage.setTitle("Manager Home Page - The Corona Canteen");
        frmManagerHomePage.getContentPane().setBackground(new Color(222, 184, 135));
        frmManagerHomePage.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Welcome, Manager");
        lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 25));
        lblNewLabel.setBounds(122, 21, 399, 56);
        frmManagerHomePage.getContentPane().add(lblNewLabel);

        JButton ADD = new JButton("Add an Employee");
        ADD.setForeground(new Color(245, 222, 179));
        ADD.setBackground(new Color(0, 128, 128));
        ADD.setBounds(234, 100, 167, 34);
        frmManagerHomePage.getContentPane().add(ADD);

        ADD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                managerverifier mk = new managerverifier();
                mk.main(null);
            }
        });

        JButton REMOVE = new JButton("Remove an Employee");
        REMOVE.setForeground(new Color(245, 222, 179));
        REMOVE.setBackground(new Color(0, 128, 128));
        REMOVE.setBounds(433, 100, 171, 34);
        frmManagerHomePage.getContentPane().add(REMOVE);

        REMOVE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                managerverifier mk = new managerverifier();
                mk.main(null);

            }
        });

        JButton DATABASE = new JButton("Employee Database");
        DATABASE.setForeground(new Color(245, 222, 179));
        DATABASE.setBackground(new Color(0, 128, 128));
        DATABASE.setBounds(234, 145, 368, 34);
        frmManagerHomePage.getContentPane().add(DATABASE);

        DATABASE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                employeeinfo obj = new employeeinfo();
                obj.main(null);
            }
        });

        JButton FEEDBACK = new JButton("Feedback Section");
        FEEDBACK.setForeground(new Color(245, 222, 179));
        FEEDBACK.setBackground(new Color(0, 128, 128));
        FEEDBACK.setBounds(234, 333, 368, 34);
        FEEDBACK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String input = "";
                
                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(new FileReader("FEEDBACK.txt"));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(managerguihome.class.getName()).log(Level.SEVERE, null, ex);
                }
                String line = null;
                try {
                    //Loop through every line in the .txt file

                    while ((line = reader.readLine()) != null) {
                        //Add the line and then "\n" indicating a new line
                        input += line + "\n";

                    }
                } catch (IOException ex) {
                    Logger.getLogger(managerguihome.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(managerguihome.class.getName()).log(Level.SEVERE, null, ex);
                }

                JTextArea textArea = new JTextArea(input);
                JScrollPane scrollPane = new JScrollPane(textArea);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                scrollPane.setPreferredSize(new Dimension(600, 600)); //whatever size you want
                JOptionPane.showMessageDialog(null,
                        scrollPane,
                        "The Employee Feedback Panel",
                        JOptionPane.PLAIN_MESSAGE);

            }
        });
        frmManagerHomePage.getContentPane().add(FEEDBACK);

        JButton PAY = new JButton("Pay Employee");
        PAY.setForeground(new Color(245, 222, 179));
        PAY.setBackground(new Color(0, 128, 128));
        PAY.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame f = new JFrame();
                String name = JOptionPane.showInputDialog(f, "Enter UserName of employee you wanna pay (you pay 1000)");
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

                        if (lines.get(i).contains(name)) { //if username and password match first and second parts of line, respectively
                            
                            int temp = Integer.parseInt(parts[7]);
                            
                            temp = temp + 1000;
                            System.out.println(""+temp);
                            parts[7] = String.valueOf(temp); //set third part of line to 500
                            JOptionPane.showMessageDialog(null, "Succesfully Payed");
                           
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
        PAY.setBounds(234, 190, 368, 34);
        frmManagerHomePage.getContentPane().add(PAY);

        JButton MENU = new JButton("Check Menu");
        MENU.setForeground(new Color(245, 222, 179));
        MENU.setBackground(new Color(0, 128, 128));
        MENU.setBounds(234, 288, 368, 34);
        frmManagerHomePage.getContentPane().add(MENU);
        MENU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Menu obj = new Menu();
                try {
                    obj.main(null);
                } catch (InstantiationException ex) {
                    Logger.getLogger(managerguihome.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(managerguihome.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(managerguihome.class.getName()).log(Level.SEVERE, null, ex);
                }
                frmManagerHomePage.setVisible(true);

            }
        });

        JButton SALES = new JButton("Track Total Sales");
        SALES.setForeground(new Color(245, 222, 179));
        SALES.setBackground(new Color(0, 128, 128));
        SALES.setBounds(234, 243, 368, 34);
        frmManagerHomePage.getContentPane().add(SALES);
        SALES.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmManagerHomePage.setVisible(false);
                Total_Sell obj = new Total_Sell();
                obj.main(null);

            }
        });

        JLabel icon = new JLabel("");
        icon.setFont(new Font("Arial Black", Font.BOLD, 13));
        icon.setBounds(10, 100, 193, 205);

        Image image = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
        icon.setIcon(new ImageIcon(image));

        frmManagerHomePage.getContentPane().add(icon);

        JButton LOGOUT = new JButton("LOG OUT");
        LOGOUT.setFont(new Font("Arial", Font.BOLD, 10));
        LOGOUT.setForeground(new Color(245, 245, 245));
        LOGOUT.setBackground(new Color(47, 79, 79));
        LOGOUT.setBounds(72, 316, 87, 51);

        LOGOUT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmManagerHomePage.setVisible(false);
                homepage obj = new homepage();
                obj.main(null);

            }
        });

        frmManagerHomePage.getContentPane().add(LOGOUT);
        frmManagerHomePage.setBounds(100, 100, 652, 456);
        frmManagerHomePage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
