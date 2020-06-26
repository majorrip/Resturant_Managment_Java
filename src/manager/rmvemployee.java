package manager;

//import employee.EmployeeGUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
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
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class rmvemployee {

    private JFrame frmEmployeeRemovalPage;
    private JTextField EMPLOYEEusername;
    private JPasswordField EMPLOYEEpassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    rmvemployee window = new rmvemployee();
                    window.frmEmployeeRemovalPage.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public rmvemployee() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmEmployeeRemovalPage = new JFrame();
        frmEmployeeRemovalPage.setIconImage(Toolkit.getDefaultToolkit().getImage(rmvemployee.class.getResource("/employee/imageee.png")));
        frmEmployeeRemovalPage.setTitle("Employee Removal Page - The Corona Canteen");
        frmEmployeeRemovalPage.setResizable(false);
        frmEmployeeRemovalPage.getContentPane().setBackground(new Color(222, 184, 135));
        frmEmployeeRemovalPage.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Employee Username");
        lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel.setBounds(50, 81, 165, 42);
        frmEmployeeRemovalPage.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Employee Password");
        lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_1.setBounds(50, 123, 165, 42);
        frmEmployeeRemovalPage.getContentPane().add(lblNewLabel_1);

        JLabel lblConfirmProcess = new JLabel("Confirm Process : ");
        lblConfirmProcess.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
        lblConfirmProcess.setBounds(123, 176, 165, 42);
        frmEmployeeRemovalPage.getContentPane().add(lblConfirmProcess);

        JLabel lblR = new JLabel("EMPLOYEE REMOVAL PAGE");
        lblR.setFont(new Font("Century Gothic", Font.BOLD, 25));
        lblR.setBounds(104, 11, 334, 55);
        frmEmployeeRemovalPage.getContentPane().add(lblR);

        JToggleButton ConfirmProcess = new JToggleButton("\u2705");
        ConfirmProcess.setBackground(new Color(211, 211, 211));
        ConfirmProcess.setBounds(273, 188, 121, 23);
        frmEmployeeRemovalPage.getContentPane().add(ConfirmProcess);

        EMPLOYEEusername = new JTextField();
        EMPLOYEEusername.setBounds(252, 94, 204, 20);
        frmEmployeeRemovalPage.getContentPane().add(EMPLOYEEusername);
        EMPLOYEEusername.setColumns(10);

        EMPLOYEEpassword = new JPasswordField();
        EMPLOYEEpassword.setBounds(252, 136, 207, 20);
        frmEmployeeRemovalPage.getContentPane().add(EMPLOYEEpassword);

        JButton Delete = new JButton("DELETE");
        Delete.setFont(new Font("Tahoma", Font.BOLD, 11));
        Delete.setBackground(new Color(255, 0, 0));
        Delete.setForeground(new Color(250, 250, 210));
        Delete.setBounds(219, 236, 89, 46);
        Delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BufferedReader reader = null;
                try {
                    String comp = EMPLOYEEusername.getText() + "," + EMPLOYEEpassword.getText();
                    File inputFile = new File("employeedata.txt");
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
                
                //EmployeeGUI objemp=new EmployeeGUI();
                
            }

        });
        frmEmployeeRemovalPage.getContentPane().add(Delete);
        frmEmployeeRemovalPage.setBounds(100, 100, 566, 344);
        frmEmployeeRemovalPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
