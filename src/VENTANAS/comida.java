package VENTANAS;

import static VENTANAS.Menu.dudate;
import static VENTANAS.Menu.royalcafe;
import static VENTANAS.Menu.qtyIsZero;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class comida extends javax.swing.JPanel {

    private Image imagen;
    public static int total = 0;
    public static int x = 0;

    public comida() {
        initComponents();
    }

    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/IMAGENES/madera.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        img1 = new javax.swing.JLabel();
        costillaBBQ = new javax.swing.JLabel();
        cantCostillaBBQ = new javax.swing.JSpinner();
        img2 = new javax.swing.JLabel();
        Tamal = new javax.swing.JLabel();
        cantTamal = new javax.swing.JSpinner();
        img3 = new javax.swing.JLabel();
        churrasco = new javax.swing.JLabel();
        cantChurrasco = new javax.swing.JSpinner();
        img4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        img1.setBackground(new java.awt.Color(0, 102, 102));
        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/232040.jpg"))); // NOI18N
        img1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        img1.setOpaque(true);
        add(img1);
        img1.setBounds(10, 10, 200, 130);

        costillaBBQ.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        costillaBBQ.setForeground(new java.awt.Color(255, 255, 255));
        costillaBBQ.setText("costilla BBQ");
        add(costillaBBQ);
        costillaBBQ.setBounds(60, 150, 110, 18);

        cantCostillaBBQ.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cantCostillaBBQ.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        cantCostillaBBQ.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantCostillaBBQStateChanged(evt);
            }
        });
        add(cantCostillaBBQ);
        cantCostillaBBQ.setBounds(70, 190, 70, 21);

        img2.setBackground(new java.awt.Color(0, 102, 102));
        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Tamales-Tolimenses1.jpg"))); // NOI18N
        img2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        img2.setOpaque(true);
        add(img2);
        img2.setBounds(15, 240, 200, 130);

        Tamal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Tamal.setForeground(new java.awt.Color(255, 255, 255));
        Tamal.setText("Tamal");
        add(Tamal);
        Tamal.setBounds(90, 380, 60, 18);

        cantTamal.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cantTamal.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(cantTamal);
        cantTamal.setBounds(60, 420, 64, 21);

        img3.setBackground(new java.awt.Color(0, 102, 102));
        img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/churrasco-con-chimichurri-web.jpg"))); // NOI18N
        img3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        img3.setOpaque(true);
        add(img3);
        img3.setBounds(290, 10, 200, 130);

        churrasco.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        churrasco.setForeground(new java.awt.Color(255, 255, 255));
        churrasco.setText("churrasco");
        add(churrasco);
        churrasco.setBounds(360, 150, 70, 18);

        cantChurrasco.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cantChurrasco.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(cantChurrasco);
        cantChurrasco.setBounds(350, 190, 64, 21);

        img4.setBackground(new java.awt.Color(0, 102, 102));
        img4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/f1280x720-25870_157545_4032.jpg"))); // NOI18N
        img4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        img4.setOpaque(true);
        add(img4);
        img4.setBounds(290, 240, 200, 130);

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pollo con salsa de espinaca");
        add(jLabel12);
        jLabel12.setBounds(290, 380, 200, 18);

        jSpinner5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(jSpinner5);
        jSpinner5.setBounds(340, 420, 64, 21);

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/IMAGENES/receta-birria-de-res-en-olla-express.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel4.setOpaque(true);
        add(jLabel4);
        jLabel4.setBounds(570, 10, 200, 130);

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Birria de res");
        add(jLabel14);
        jLabel14.setBounds(630, 150, 90, 18);

        jSpinner7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(jSpinner7);
        jSpinner7.setBounds(630, 190, 64, 21);

        jLabel15.setBackground(new java.awt.Color(0, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salmon.jpg"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel15.setOpaque(true);
        add(jLabel15);
        jLabel15.setBounds(570, 240, 200, 130);

        jLabel17.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Salmon con champiñones");
        add(jLabel17);
        jLabel17.setBounds(580, 380, 190, 18);

        jSpinner8.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(jSpinner8);
        jSpinner8.setBounds(630, 420, 64, 21);

        jCheckBox1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(150, 190, 20, 19);

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("30.000");
        add(jLabel1);
        jLabel1.setBounds(80, 170, 60, 15);

        jCheckBox2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2);
        jCheckBox2.setBounds(420, 190, 19, 19);

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("35.000");
        add(jLabel2);
        jLabel2.setBounds(370, 170, 50, 15);

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("25.000");
        add(jLabel3);
        jLabel3.setBounds(650, 170, 50, 15);

        jCheckBox3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        add(jCheckBox3);
        jCheckBox3.setBounds(700, 190, 19, 19);

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("15.000");
        add(jLabel5);
        jLabel5.setBounds(90, 400, 50, 15);

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("19.000");
        add(jLabel6);
        jLabel6.setBounds(380, 400, 39, 15);

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("40.000");
        add(jLabel7);
        jLabel7.setBounds(660, 400, 42, 15);

        jCheckBox4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        add(jCheckBox4);
        jCheckBox4.setBounds(130, 420, 20, 19);

        jCheckBox5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        add(jCheckBox5);
        jCheckBox5.setBounds(410, 420, 20, 19);

        jCheckBox6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        add(jCheckBox6);
        jCheckBox6.setBounds(700, 420, 20, 19);
    }// </editor-fold>                        

    private void cantCostillaBBQStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_cantCostillaBBQStateChanged

    }// GEN-LAST:event_cantCostillaBBQStateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox1ActionPerformed

        int qty = Integer.parseInt(cantCostillaBBQ.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox1.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 30000;
            total += price;
            Menu.jTextArea1
                    .setText(Menu.jTextArea1.getText() + x + ". " + costillaBBQ.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox1.setSelected(false);
        }

    }// GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox2ActionPerformed

        int qty = Integer.parseInt(cantChurrasco.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox2.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 35000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + churrasco.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox2.setSelected(false);
        }
    }// GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox3ActionPerformed

        int qty = Integer.parseInt(jSpinner7.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox3.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 25000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + jLabel14.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox3.setSelected(false);
        }
    }// GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox4ActionPerformed

        int qty = Integer.parseInt(cantTamal.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox4.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 15000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + Tamal.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox4.setSelected(false);
        }
    }// GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox5ActionPerformed

        int qty = Integer.parseInt(jSpinner5.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox5.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 19000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + jLabel12.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox5.setSelected(false);
        }
    }// GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox6ActionPerformed

        int qty = Integer.parseInt(jSpinner8.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox6.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 40000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + jLabel17.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox6.setSelected(false);
        }
    }

    private javax.swing.JLabel Tamal;
    public static javax.swing.JSpinner cantChurrasco;
    public static javax.swing.JSpinner cantCostillaBBQ;
    public static javax.swing.JSpinner cantTamal;
    private javax.swing.JLabel churrasco;
    private javax.swing.JLabel costillaBBQ;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    public static javax.swing.JCheckBox jCheckBox1;
    public static javax.swing.JCheckBox jCheckBox2;
    public static javax.swing.JCheckBox jCheckBox3;
    public static javax.swing.JCheckBox jCheckBox4;
    public static javax.swing.JCheckBox jCheckBox5;
    public static javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JSpinner jSpinner5;
    public static javax.swing.JSpinner jSpinner7;
    public static javax.swing.JSpinner jSpinner8;
    // End of variables declaration                   

}
