/*

////////          DO NOT FORGET TO READ            ///////////////
////////  THE README TXT FILE BEFORE VENTURING    ///////////////
///////            INTO THE PROJECT              ///////////////

*/
package universalsignin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class firstpage {

    private static JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    firstpage window = new firstpage();
                    window.frame.setVisible(true);
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public firstpage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        homepage obj = new homepage();

        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(222, 184, 135));
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Click to Enter");
        btnNewButton.setForeground(new Color(255, 245, 238));
        btnNewButton.setBackground(new Color(47, 79, 79));
        btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 15));
        btnNewButton.setBounds(149, 300, 249, 49);
        frame.getContentPane().add(btnNewButton);

        frame.setTitle("Corona Canteen Software");

        ImageIcon icon = new ImageIcon(getClass().getResource("imageee.png"));
        frame.setIconImage(icon.getImage());

        JLabel lblNewLabel_1 = new JLabel("THE CORONA CANTEEN");
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
        lblNewLabel_1.setBounds(99, 37, 382, 49);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel logo = new JLabel("");

        Image image = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
        logo.setIcon(new ImageIcon(image));

        logo.setBounds(168, 89, 200, 199);
        frame.getContentPane().add(logo);

        JLabel lblNewLabel_1_1 = new JLabel("THE CORONA CANTEEN");
        lblNewLabel_1_1.setForeground(new Color(255, 245, 238));
        lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 32));
        lblNewLabel_1_1.setBounds(96, 11, 382, 96);
        frame.getContentPane().add(lblNewLabel_1_1);
        frame.setBounds(100, 100, 563, 410);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                obj.main(null);
                frame.dispose();

            }

        });

    }
}
