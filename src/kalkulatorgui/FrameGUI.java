/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorgui;

import java.awt.Color;

/**
 *
 * @author Sigit Sukarman
 */
public class FrameGUI extends javax.swing.JFrame {

    /**
     * Creates new form FrameGUI
     */
    double nilai1;
    double nilai2;
    String perintah;

    public FrameGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        layar1 = new javax.swing.JTextField();
        jButtonHasil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        layar2 = new javax.swing.JTextField();
        layarHasil = new javax.swing.JTextField();
        jComboBoxPerintah = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kalkulator Sederhana");

        layar1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        layar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        layar1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        layar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layar1ActionPerformed(evt);
            }
        });

        jButtonHasil.setText("=");
        jButtonHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHasilActionPerformed(evt);
            }
        });

        jLabel2.setText("Pilih Perintah:");

        jLabel3.setText("Masukkan Bilangan Pertama:");

        jLabel4.setText("Masukkan Bilangan Kedua:");

        jLabel5.setText("Hasil:");

        layar2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        layar2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        layar2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        layar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layar2ActionPerformed(evt);
            }
        });

        layarHasil.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        layarHasil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        layarHasil.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        layarHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layarHasilActionPerformed(evt);
            }
        });

        jComboBoxPerintah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "+", "-", "/", "*", "%", "Pangkat", "Akar" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonHasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(layarHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(layar1)
                                    .addComponent(jComboBoxPerintah, 0, 86, Short.MAX_VALUE)
                                    .addComponent(layar2, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(layar2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxPerintah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonHasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layarHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void layar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_layar1ActionPerformed

    private void jButtonHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHasilActionPerformed
        nilai1 = Double.valueOf(layar1.getText());
        nilai2 = Double.valueOf(layar2.getText());
        if (jComboBoxPerintah.getSelectedItem() == "+") {
            layarHasil.setText(String.valueOf(nilai1 + nilai2));
        } else if (jComboBoxPerintah.getSelectedItem() == "-") {
            layarHasil.setText(String.valueOf(nilai1 - nilai2));
        } else if (jComboBoxPerintah.getSelectedItem() == "/") {
            layarHasil.setText(String.valueOf(nilai1 / nilai2));
        } else if (jComboBoxPerintah.getSelectedItem() == "*") {
            layarHasil.setText(String.valueOf(nilai1 * nilai2));
        } else if (jComboBoxPerintah.getSelectedItem() == "%") {
            layarHasil.setText(String.valueOf(nilai1 % nilai2));
        } else if (jComboBoxPerintah.getSelectedItem() == "Pangkat") {
            layarHasil.setText(String.valueOf(Math.pow(nilai1, nilai2)));
        } else if (jComboBoxPerintah.getSelectedItem() == "Akar") {
            layar2.disable();
            layarHasil.setText(String.valueOf(Math.sqrt(nilai1)));
            layar2.enable();
        } else {
            layarHasil.setText("inputan harus angka");
        }
        

    }//GEN-LAST:event_jButtonHasilActionPerformed

    private void layar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_layar2ActionPerformed

    private void layarHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layarHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_layarHasilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHasil;
    private javax.swing.JComboBox jComboBoxPerintah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField layar1;
    private javax.swing.JTextField layar2;
    private javax.swing.JTextField layarHasil;
    // End of variables declaration//GEN-END:variables
}
