package menu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Toolkit;

public class Menu extends javax.swing.JFrame {

  
    public Menu() {
    	setTitle("The Corona Canteen - General Menu");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/manager/logo.png")));
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        redus = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        or9 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        or5 = new javax.swing.JTextField();
        r4 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        or6 = new javax.swing.JTextField();
        r1 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        r5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        r6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        r9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        or10 = new javax.swing.JTextField();
        jButton39 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        r2 = new javax.swing.JButton();
        qntiti = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        or2 = new javax.swing.JTextField();
        r10 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        or4 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        or7 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        r3 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        or8 = new javax.swing.JTextField();
        or1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        or3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        r8 = new javax.swing.JButton();
        //jButton3 = new javax.swing.JButton();
        r7 = new javax.swing.JButton();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(210,180,140));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 184, 135), 4));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("MeatLover Pizza-450/-");

        redus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        redus.setIcon(new javax.swing.ImageIcon("Resources\\Images\\minus.png")); // NOI18N
        redus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redusActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Italian Pizza.jpg")); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalianpizzaActionPerformed(evt);
            }
        });

        jButton36.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Chicken Sandwich2.jpg")); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcikenPizzaActionPerformed(evt);
            }
        });

        or9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton27.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Chicken Burger.jpg")); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenBurgerActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Naan.jpg")); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NanActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Italian Pizza-400/-");

        jButton26.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Shawarma.jpg")); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShwarmaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Chicken Fry-80/-");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Egg Sandwich-150/-");

        or5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        r4.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        jButton31.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Vegetable Burger.jpg")); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VegitableBurgerActionPerformed(evt);
            }
        });

        or6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        r1.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        jButton34.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Chicken Chowmein.jpg")); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenchowmenActionPerformed(evt);
            }
        });

        r5.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("  Patties -30/-");

        jButton35.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\coke.jpg")); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeActionPerformed(evt);
            }
        });

        r6.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("TOTAL :");

        jButton40.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Egg Sandwich.jpg")); // NOI18N
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EggSandwichActionPerformed(evt);
            }
        });

        r9.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Beef Burger.jpg")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beefBurgerActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 51));
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("Egg Chowmen-70/-");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Beef Burger-120/-");

        Total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Total.setText("00.00");

        jButton33.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Samosa.jpg")); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SamosaActionPerformed(evt);
            }
        });

        jButton38.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Egg Chowmein.jpg")); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eggChowmenActionPerformed(evt);
            }
        });

        or10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton39.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Sprite.jpg")); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpriteActionPerformed(evt);
            }
        });

        jButton32.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Chicken Tikka.jpg")); // NOI18N
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickentikaActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Vegetable Burger-90/-");

        jButton30.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Water.jpg")); // NOI18N
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaterActionPerformed(evt);
            }
        });

        r2.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        qntiti.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        qntiti.setText("1");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 51));
        jButton4.setText("About Us");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Meat Lover Pizza.jpg")); // NOI18N
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatloverPizzaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("   Water -20/-");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("   Naan -20/-");

        jButton37.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Singara.jpg")); // NOI18N
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShingaraActionPerformed(evt);
            }
        });

        or2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        r10.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Chiken Sandwch-180/-");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Chiken Chowmen-90/-");

        or4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton22.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Cheese Pizza.jpg")); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheesePizzaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Cheese Pizza-350/-");

        jButton23.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Patties.jpg")); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PattiesActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("  Singara-10/-");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("  Coke - 30/-");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("CONFIRM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("  Sprite - 30/-");

        or7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jButton24.setIcon(new javax.swing.ImageIcon("Resources\\Foods\\Chicken Fry.jpg")); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenFryActionPerformed(evt);
            }
        });

        r3.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        add.setIcon(new javax.swing.ImageIcon("Resources\\Images\\plus.jpg")); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("  Samosa-10/-");

        or8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        or1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        or1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                or1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText(" Shwarma -90/-");

        or3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 184, 135));
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setText("General Menu - The Corona Canteen");
        

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Chicken Burger-110/-");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Chicken Tikka-140/-");

        r8.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });
/*
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("TOTAL SELL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
*/
        r7.setIcon(new javax.swing.ImageIcon("Resources\\Images\\remove.png")); // NOI18N
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, 313, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 619, GroupLayout.PREFERRED_SIZE)
        					.addGap(54)
        					.addComponent(jButton4)
        					.addGap(161))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jButton23)
        								.addComponent(jButton24)
        								.addComponent(jButton22)
        								.addComponent(jButton6))
        							.addGap(50))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel14)
        							.addGap(29))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        							.addGap(13))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
        							.addGap(28)))
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(jButton26)
        										.addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jButton28)
        										.addComponent(jButton25)
        										.addComponent(jButton27))
        									.addGap(61))
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(jLabel18)
        									.addGap(14))
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(jLabel21)
        									.addGap(59)))
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jButton30)
        										.addComponent(jButton32)
        										.addComponent(jButton29)
        										.addComponent(jButton31))
        									.addGap(62))
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(jLabel22)
        									.addGap(9))
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(jLabel24)
        									.addGap(25)))
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(jLabel29, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jButton35)
        										.addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jButton33)
        										.addComponent(jButton36)
        										.addComponent(jButton34))
        									.addGap(58))
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(jLabel27)
        									.addPreferredGap(ComponentPlacement.UNRELATED))))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel19)
        							.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
        							.addComponent(jLabel23)
        							.addGap(6)
        							.addComponent(jLabel26)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jButton39)
        							.addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jButton37)
        							.addComponent(jButton40)
        							.addComponent(jButton38))
        						.addComponent(jLabel31)
        						.addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
        					.addGap(12)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jButton2)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        									.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
        									.addGroup(jPanel1Layout.createSequentialGroup()
        										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        											.addComponent(or8, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
        											.addComponent(or7, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
        											.addComponent(or6, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
        											.addComponent(or5, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
        											.addComponent(or4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
        											.addComponent(or3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
        											.addComponent(or2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
        											.addComponent(or1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))
        										.addPreferredGap(ComponentPlacement.RELATED)
        										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        											.addComponent(r8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        											.addComponent(r7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        											.addComponent(r6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        											.addComponent(r5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        											.addComponent(r4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        											.addComponent(r3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        											.addComponent(r2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        											.addComponent(r1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
        									.addGroup(jPanel1Layout.createSequentialGroup()
        										.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
        										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(Total, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)))
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(or10, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
        										.addComponent(or9, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(r10, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        										.addComponent(r9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
        								.addComponent(jButton1))
        							.addGap(24))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(redus, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(qntiti, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(add, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        							.addGap(110)))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(jLabel1)
        					.addGap(10)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jButton31, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        							.addGap(7)
        							.addComponent(jLabel22)
        							.addGap(18)
        							.addComponent(jButton29, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        							.addGap(47)
        							.addComponent(jButton32, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        							.addGap(7)
        							.addComponent(jLabel24)
        							.addGap(18)
        							.addComponent(jButton30, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        							.addGap(7)
        							.addComponent(jLabel25))
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        								.addGap(7)
        								.addComponent(jLabel14)
        								.addGap(18)
        								.addComponent(jButton22, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        								.addGap(7)
        								.addComponent(jLabel15)
        								.addGap(18)
        								.addComponent(jButton24, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        								.addGap(7)
        								.addComponent(jLabel16)
        								.addGap(18)
        								.addComponent(jButton23, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        								.addGap(7)
        								.addComponent(jLabel17))
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addComponent(jButton27, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        								.addGap(7)
        								.addComponent(jLabel18)
        								.addGap(18)
        								.addComponent(jButton25, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        								.addGap(7)
        								.addComponent(jLabel19)
        								.addGap(18)
        								.addComponent(jButton28, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        								.addGap(7)
        								.addComponent(jLabel20)
        								.addGap(18)
        								.addComponent(jButton26, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        								.addGap(7)
        								.addComponent(jLabel21)))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(jButton34, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        									.addGap(47)
        									.addComponent(jButton36, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        									.addGap(7)
        									.addComponent(jLabel23)
        									.addGap(18)
        									.addComponent(jButton33, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(jButton38, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        									.addGap(7)
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        										.addComponent(jLabel31)
        										.addComponent(jLabel27))
        									.addGap(18)
        									.addComponent(jButton40, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        									.addGap(7)
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        										.addComponent(jLabel30)
        										.addComponent(jLabel26))
        									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addComponent(jButton37, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
        							.addGap(7)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(jLabel28)
        									.addGap(18)
        									.addComponent(jButton35, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        									.addGap(7)
        									.addComponent(jLabel29))
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(jLabel32)
        									.addGap(19)
        									.addComponent(jButton39, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jLabel33)))
        							.addGap(4))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(28)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(qntiti, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addGap(1)
        									.addComponent(redus, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        							.addGap(18))
        						.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(add)
        							.addGap(26)))
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(or10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        						.addComponent(r10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(r9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        						.addComponent(or9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(r8, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        										.addComponent(or8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(or7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        								.addComponent(r7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(or6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(r6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(r5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        						.addComponent(or5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(or4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(5)
        							.addComponent(or3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(r4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(r3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(r2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(or2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(r1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(or1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jButton8)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(Total, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2))
        					.addGap(11)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(f1.ConfirmLogOut()){
        this.toBack();
        setVisible(false);
        /*
        Enter code to go back to firstpage
        */
        }
    }                                      
                                      
    
    private String[] str = new String[10];
    private int[] arr = new int[10];
    private int order = 0;
    private int tot = 0;
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        
        try{
            if(Integer.parseInt(qntiti.getText())<99){
            int n = Integer.parseInt(qntiti.getText());
            n++;
            String s= ""+n;
            qntiti.setText(s);
        }
        }catch(Exception e){ 
            f1.Error("Enter Only Integers !!");
            qntiti.setText("1");
        }
        
    }                                   

    private void r9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        str[8]=null;
        or9.setText("");
        tot = tot - arr[8];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                  

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        str[6]=null;
        or7.setText("");
        tot = tot - arr[6];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                  

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        str[2]=null;
        or3.setText("");
        tot = tot - arr[2];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                  

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        str[3]=null;
        or4.setText("");
        tot = tot - arr[3];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                  

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        str[0]=null;
        or1.setText("");
        tot = tot - arr[0];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                  

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        str[1]=null;
        or2.setText("");
        tot = tot - arr[1];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                  

    private void redusActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        
        try{
            if(Integer.parseInt(qntiti.getText())>1){
            int n = Integer.parseInt(qntiti.getText());
            n--;
            String s= ""+n;
            qntiti.setText(s);
        }
        }catch(Exception e){ 
            f1.Error("Enter Only Integers !!");
            qntiti.setText("1");
        }
    }                                     

    private void beefBurgerActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "BeefBurger"+" x "+qntiti.getText();
                    s2 = str[i];
                    arr[i] = Integer.parseInt(qntiti.getText()) * 120;
                    tot += Integer.parseInt(qntiti.getText())* 120;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.toBack();
        Developer_Info fp = new Developer_Info();
        fp.setVisible(true);
        fp.toFront();
        setVisible(false);
    }                                        

    private void chickenBurgerActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "ChickenBurger"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 110;
                    tot += Integer.parseInt(qntiti.getText())* 110;
                    s = ""+ tot + ".00";
                    s2 = str[i];
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void VegitableBurgerActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "VegetableBurger"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 90;
                    tot += Integer.parseInt(qntiti.getText())* 90;
                    s = ""+ tot + ".00";
                    s2 = str[i];
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void ChickenchowmenActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "ChickenChowmein"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 90;
                    tot += Integer.parseInt(qntiti.getText())* 90;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    s2 = str[i];
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void eggChowmenActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "EggChowmein"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 70;
                    tot += Integer.parseInt(qntiti.getText())* 70;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    s2 = str[i];
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void CheesePizzaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "CheesePizza"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 350;
                    tot += Integer.parseInt(qntiti.getText())* 350;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    s2 = str[i];
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void ItalianpizzaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "ItalianPizza"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 400;
                    tot += Integer.parseInt(qntiti.getText())* 400;
                    s = ""+ tot + ".00";
                    s2 = str[i];
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void meatloverPizzaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "MeatLoverPizza"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 450;
                    tot += Integer.parseInt(qntiti.getText())* 450;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    s2 = str[i];
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void chcikenPizzaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "ChikenSandwch"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 180;
                    tot += Integer.parseInt(qntiti.getText())* 180;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    s2 = str[i];
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void EggSandwichActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "EggSandwich"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 150;
                    tot += Integer.parseInt(qntiti.getText())* 150;
                    s = ""+ tot + ".00";
                    s2 = str[i];
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void ChickenFryActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "ChickenFry"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 80;
                    tot += Integer.parseInt(qntiti.getText())* 80;
                    s = ""+ tot + ".00";
                    s2 = str[i];
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void NanActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "Naan"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 20;
                    tot += Integer.parseInt(qntiti.getText())* 20;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    s2 = str[i];
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void ChickentikaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "ChickenTikka"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 140;
                    tot += Integer.parseInt(qntiti.getText())* 140;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    s2 = str[i];
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void SamosaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "Samosa"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 10;
                    tot += Integer.parseInt(qntiti.getText())* 10;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    s2 = str[i];
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void ShingaraActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "Singara"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 10;
                    tot += Integer.parseInt(qntiti.getText())* 10;
                    s = ""+ tot + ".00";
                    s2 = str[i];
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void PattiesActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "Patties"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 30;
                    tot += Integer.parseInt(qntiti.getText())* 30;
                    s = ""+ tot + ".00";
                    s2 = str[i];
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void ShwarmaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "Shwarma"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 90;
                    tot += Integer.parseInt(qntiti.getText())* 90;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    s2 = str[i];
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void WaterActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "Water"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 20;
                    tot += Integer.parseInt(qntiti.getText())* 20;
                    s = ""+ tot + ".00";
                    s2 = str[i];
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
            f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void cokeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "Coke"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 30;
                    tot += Integer.parseInt(qntiti.getText())* 30;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    s2 = str[i];
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
                f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void SpriteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(order<10){
            String s = null;
            String s2 = null;
            for (int i = 0; i < 10; i++) {
                if(str[i] == null){
                    str[i] = "Sprite"+" x "+qntiti.getText();
                    arr[i] = Integer.parseInt(qntiti.getText()) * 30;
                    tot += Integer.parseInt(qntiti.getText())* 30;
                    s = ""+ tot + ".00";
                    Total.setText(s);
                    qntiti.setText("1");
                    order++;
                    s2 = str[i];
                    break;
                }
            }
            if(or1.getText().length()< 3){
                or1.setText(s2);
            }else if(or2.getText().length()< 3){
                or2.setText(s2);
            }else if(or3.getText().length()< 3){
                or3.setText(s2);
            }else if(or4.getText().length()< 3){
                or4.setText(s2);
            }else if(or5.getText().length()< 3){
                or5.setText(s2);
            }else if(or6.getText().length()< 3){
                or6.setText(s2);
            }else if(or7.getText().length()< 3){
                or7.setText(s2);
            }else if(or8.getText().length()< 3){
                or8.setText(s2);
            }else if(or9.getText().length()< 3){
                or9.setText(s2);
            }else{
                or10.setText(s2);
            }
        }
        else{
                f1.Error("You can't order more than 10 items at a time.");
            }
    }                                         

    private void or1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        str[4]=null;
        or5.setText("");
        tot = tot - arr[4];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                  

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        str[5]=null;
        or6.setText("");
        tot = tot - arr[5];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                  

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        str[7]=null;
        or8.setText("");
        tot = tot - arr[7];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                  

    private void r10ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        str[9]=null;
        or10.setText("");
        tot = tot - arr[9];
        String s1 = ""+ tot +".00";
        Total.setText(s1);
        order--;
    }                                   

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        File_Handling f1 = new File_Handling();
        if(f1.ConfirmFood()){
            for (int i = 0; i < 10; i++) {
                try{
                if(str[i].length() > 2){
                    f1.AddFood(str[i]);
                }}catch(Exception e){ }
            }
            f1.Success("Addition Successful !!!");
            or1.setText("");
            or2.setText("");
            or3.setText("");
            or4.setText("");
            or5.setText("");
            or6.setText("");
            or7.setText("");
            or8.setText("");
            or9.setText("");
            or10.setText("");
            qntiti.setText("1");
            Total.setText("00.00");
        }
    }                                        

    /**
     * @param args the command line arguments
     * @throws UnsupportedLookAndFeelException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     */
    public static void main(String args[]) throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        } 
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Total;
    private javax.swing.JButton add;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    //private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField or1;
    private javax.swing.JTextField or10;
    private javax.swing.JTextField or2;
    private javax.swing.JTextField or3;
    private javax.swing.JTextField or4;
    private javax.swing.JTextField or5;
    private javax.swing.JTextField or6;
    private javax.swing.JTextField or7;
    private javax.swing.JTextField or8;
    private javax.swing.JTextField or9;
    private javax.swing.JTextField qntiti;
    private javax.swing.JButton r1;
    private javax.swing.JButton r10;
    private javax.swing.JButton r2;
    private javax.swing.JButton r3;
    private javax.swing.JButton r4;
    private javax.swing.JButton r5;
    private javax.swing.JButton r6;
    private javax.swing.JButton r7;
    private javax.swing.JButton r8;
    private javax.swing.JButton r9;
    private javax.swing.JButton redus;
    // End of variables declaration                   
}

