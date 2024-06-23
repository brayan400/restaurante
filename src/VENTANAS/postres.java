package VENTANAS;

import static VENTANAS.Menu.dudate;
import static VENTANAS.Menu.royalcafe;
import static VENTANAS.Menu.qtyIsZero;
import static VENTANAS.comida.total;
import static VENTANAS.comida.x;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class postres extends javax.swing.JPanel {

    private Image imagen;

    public postres() {
        initComponents();
    }

    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/IMAGENES/madera.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/helado.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setOpaque(true);
        add(jLabel1);
        jLabel1.setBounds(10, 10, 200, 130);

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/tresleches.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.setOpaque(true);
        add(jLabel2);
        jLabel2.setBounds(290, 10, 200, 130);

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/helado-de-vainilla.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel3.setOpaque(true);
        add(jLabel3);
        jLabel3.setBounds(570, 10, 200, 130);

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fresa.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel4.setOpaque(true);
        add(jLabel4);
        jLabel4.setBounds(10, 240, 200, 130);

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ensalada.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.setOpaque(true);
        add(jLabel5);
        jLabel5.setBounds(290, 240, 200, 130);

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/postrechocolate.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.setOpaque(true);
        add(jLabel6);
        jLabel6.setBounds(570, 240, 200, 130);

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("helado de chocolate");
        add(jLabel7);
        jLabel7.setBounds(50, 150, 130, 15);

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("tres leches");
        add(jLabel8);
        jLabel8.setBounds(350, 150, 80, 15);

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("helado de vainilla");
        add(jLabel9);
        jLabel9.setBounds(610, 150, 120, 15);

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("helado de fresa");
        add(jLabel10);
        jLabel10.setBounds(60, 380, 92, 15);

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ensalada de frutas");
        add(jLabel11);
        jLabel11.setBounds(330, 380, 120, 15);

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("pastel de chocolate");
        add(jLabel12);
        jLabel12.setBounds(610, 380, 130, 15);

        jSpinner1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(jSpinner1);
        jSpinner1.setBounds(50, 190, 64, 21);

        jSpinner2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(jSpinner2);
        jSpinner2.setBounds(340, 190, 64, 21);

        jSpinner3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(jSpinner3);
        jSpinner3.setBounds(620, 190, 64, 21);

        jSpinner4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(jSpinner4);
        jSpinner4.setBounds(620, 420, 64, 21);

        jSpinner5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(jSpinner5);
        jSpinner5.setBounds(340, 420, 64, 21);

        jSpinner6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        add(jSpinner6);
        jSpinner6.setBounds(60, 420, 64, 21);

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("4.000");
        add(jLabel13);
        jLabel13.setBounds(90, 170, 43, 15);

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("11.000");
        add(jLabel14);
        jLabel14.setBounds(370, 170, 43, 15);

        jLabel15.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("4.000");
        add(jLabel15);
        jLabel15.setBounds(650, 170, 34, 15);

        jLabel16.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("4.000");
        add(jLabel16);
        jLabel16.setBounds(90, 400, 34, 15);

        jLabel17.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("5.000");
        add(jLabel17);
        jLabel17.setBounds(370, 400, 34, 15);

        jLabel18.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("11.000");
        add(jLabel18);
        jLabel18.setBounds(650, 400, 37, 15);

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(120, 190, 30, 19);

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2);
        jCheckBox2.setBounds(410, 190, 20, 19);

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        add(jCheckBox3);
        jCheckBox3.setBounds(690, 190, 20, 19);

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        add(jCheckBox4);
        jCheckBox4.setBounds(130, 420, 20, 19);

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        add(jCheckBox5);
        jCheckBox5.setBounds(410, 420, 30, 19);

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        add(jCheckBox6);
        jCheckBox6.setBounds(690, 420, 20, 19);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        int qty = Integer.parseInt(jSpinner1.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox1.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 30000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + jLabel7.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

        int qty = Integer.parseInt(jSpinner2.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox2.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 30000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + jLabel8.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed

        int qty = Integer.parseInt(jSpinner3.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox3.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 30000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + jLabel9.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed

        int qty = Integer.parseInt(jSpinner6.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox4.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 30000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + jLabel10.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed

        int qty = Integer.parseInt(jSpinner5.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox5.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 30000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + jLabel11.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed

        int qty = Integer.parseInt(jSpinner4.getValue().toString());
        if (qtyIsZero(qty) && jCheckBox6.isSelected()) {
            x++;
            if (x == 1) {
                royalcafe();
            }
            int price = qty * 30000;
            total += price;
            Menu.jTextArea1.setText(Menu.jTextArea1.getText() + x + ". " + jLabel12.getText() + "\t\t" + price + "\n");
            dudate();
        } else {
            jCheckBox6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox jCheckBox1;
    public static javax.swing.JCheckBox jCheckBox2;
    public static javax.swing.JCheckBox jCheckBox3;
    public static javax.swing.JCheckBox jCheckBox4;
    public static javax.swing.JCheckBox jCheckBox5;
    public static javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JSpinner jSpinner1;
    public static javax.swing.JSpinner jSpinner2;
    public static javax.swing.JSpinner jSpinner3;
    public static javax.swing.JSpinner jSpinner4;
    public static javax.swing.JSpinner jSpinner5;
    public static javax.swing.JSpinner jSpinner6;
    // End of variables declaration//GEN-END:variables
}
