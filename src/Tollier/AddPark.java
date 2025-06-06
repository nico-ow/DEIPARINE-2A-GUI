/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tollier;

import config.connectDB;
import java.awt.Color;
import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author mendo
 */
public class AddPark extends javax.swing.JFrame {
    private String selectedAreaId;
    /**
     * Creates new form AddPark
     */
    public AddPark(String areaId) {
        initComponents();
        this.selectedAreaId = areaId;
    }
    Color lightGray = new Color(211, 211, 211);
    Color lightBlue = new Color(173, 216, 230);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cs_name = new javax.swing.JTextField();
        cs_contact = new javax.swing.JTextField();
        lastnametext = new javax.swing.JLabel();
        Hours = new javax.swing.JLabel();
        plate = new javax.swing.JTextField();
        add = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        hours = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("ADD PARK");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Customer Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        cs_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cs_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cs_nameFocusLost(evt);
            }
        });
        cs_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs_nameActionPerformed(evt);
            }
        });
        jPanel2.add(cs_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 196, 30));

        cs_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cs_contact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cs_contactFocusLost(evt);
            }
        });
        cs_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs_contactActionPerformed(evt);
            }
        });
        jPanel2.add(cs_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 196, 30));

        lastnametext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastnametext.setText("Contact No.");
        jPanel2.add(lastnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        Hours.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Hours.setText("Plate No.");
        jPanel2.add(Hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 70, -1));

        plate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        plate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                plateFocusLost(evt);
            }
        });
        plate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateActionPerformed(evt);
            }
        });
        jPanel2.add(plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 196, 30));

        add.setBackground(new java.awt.Color(173, 216, 230));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(173, 216, 230));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 100, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("ADD");
        add.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 10, -1, -1));

        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 100, 30));

        hour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hour.setText("Hour/Hours ");
        jPanel2.add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 90, -1));

        hours.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hours.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hoursFocusLost(evt);
            }
        });
        hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursActionPerformed(evt);
            }
        });
        jPanel2.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 196, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout (2).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 670, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cs_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cs_nameFocusLost

    }//GEN-LAST:event_cs_nameFocusLost

    private void cs_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cs_nameActionPerformed

    private void cs_contactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cs_contactFocusLost

    }//GEN-LAST:event_cs_contactFocusLost

    private void cs_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cs_contactActionPerformed

    private void plateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plateFocusLost

    }//GEN-LAST:event_plateFocusLost

    private void plateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateActionPerformed

    }//GEN-LAST:event_plateActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      String name = cs_name.getText().trim();
    String contact = cs_contact.getText().trim();
    String plateNumber = plate.getText().trim();
    String hourText = hours.getText().trim();

    // Validate inputs
    if (name.isEmpty() || contact.isEmpty() || plateNumber.isEmpty() || hourText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int hoursVal;
    try {
        hoursVal = Integer.parseInt(hourText);
        if (hoursVal <= 0) throw new NumberFormatException();
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number of hours.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        connectDB db = new connectDB();

        String areaQuery = "SELECT a_rate FROM area_tbl WHERE a_id = ?";
        PreparedStatement areaStmt = db.connect.prepareStatement(areaQuery);
        areaStmt.setInt(1, Integer.parseInt(selectedAreaId));
        ResultSet rs = areaStmt.executeQuery();
        
        int rate = 0;
        if (rs.next()) {
            rate = rs.getInt("a_rate");
        } else {
            JOptionPane.showMessageDialog(this, "Selected area not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int total_due = rate * hoursVal;

        // Insert transaction
        String insertQuery = "INSERT INTO transactions (a_id, customer_name, car_plate, contact_number, hours, total_due, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = db.connect.prepareStatement(insertQuery);
        pst.setInt(1, Integer.parseInt(selectedAreaId));
        pst.setString(2, name);
        pst.setString(3, plateNumber);
        pst.setString(4, contact);
        pst.setInt(5, hoursVal);
        pst.setInt(6, total_due);
        pst.setString(7, "pending");

        int result = pst.executeUpdate();

        if (result > 0) {
            // Update area status to 'Occupied'
            String updateStatusQuery = "UPDATE area_tbl SET a_status = 'Occupied' WHERE a_id = ?";
            PreparedStatement updateStmt = db.connect.prepareStatement(updateStatusQuery);
            updateStmt.setInt(1, Integer.parseInt(selectedAreaId));
            updateStmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Transaction added successfully. Area marked as occupied.");
            this.dispose(); // Close the current input form
            new TollierDB().setVisible(true); // Reopen the dashboard
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add transaction.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }        
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(lightGray);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(lightBlue);
    }//GEN-LAST:event_addMouseExited

    private void hoursFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hoursFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursFocusLost

    private void hoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
          for (Frame f : Frame.getFrames()) {
    if (f instanceof TollierDB) {
        f.setVisible(true);
        this.dispose();
        return;
    }
}
        TollierDB go = new TollierDB();
        go.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(AddPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPark("1").setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hours;
    private javax.swing.JPanel add;
    private javax.swing.JTextField cs_contact;
    private javax.swing.JTextField cs_name;
    private javax.swing.JLabel hour;
    private javax.swing.JTextField hours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lastnametext;
    private javax.swing.JTextField plate;
    // End of variables declaration//GEN-END:variables
}
