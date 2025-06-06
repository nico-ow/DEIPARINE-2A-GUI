/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import config.session;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Main.LoginPanel;
import java.awt.Color;
import java.awt.Window;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.SwingUtilities;

/**
 *
 * @author mendo
 */
public class Account extends javax.swing.JFrame {

    /**
     * Creates new form Account
     */
    public Account() {
        initComponents();
        accountInformation();
    }
    Color lightGray = new Color(211, 211, 211);
    Color lightBlue = new Color(173, 216, 230);
    
     public void accountInformation() {

        session sess = session.getInstance();

        String fullName = session.getFirstName() + " " + session.getLastName();

        name.setText("Name: " + fullName);
        

        email.setText("Email: " +session.getEmail());
        
        
        cnum.setText("Contact Number: " +session.getContact());
        
        role.setText("Role: " + session.getAcc_type());
        
         try {
        File imgFile = new File("profilepics/user_" + session.getU_id() + ".png");
        if (imgFile.exists()) {
            Image img = ImageIO.read(imgFile);
            img = img.getScaledInstance(profilepic.getWidth(), profilepic.getHeight(), Image.SCALE_SMOOTH);
            profilepic.setIcon(new ImageIcon(img));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
     

    }
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
        adminname = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        account = new javax.swing.JPanel();
        admin = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        admin1 = new javax.swing.JLabel();
        areas = new javax.swing.JPanel();
        admin3 = new javax.swing.JLabel();
        transaction = new javax.swing.JPanel();
        admin4 = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        admin2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        profilepic = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        cnum = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        updatequestion = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        changepassword = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        changeprofile = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminname.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        adminname.setForeground(new java.awt.Color(102, 102, 102));
        adminname.setText("ADMIN");
        jPanel2.add(adminname, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 130, -1, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout (2).png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        account.setBackground(new java.awt.Color(173, 216, 230));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admin.setText("ACCOUNT");
        account.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 7, -1, -1));

        jPanel2.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 170, 40));

        dashboard.setBackground(new java.awt.Color(173, 216, 230));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admin1.setText("DASHBOARD");
        dashboard.add(admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 8, -1, -1));

        jPanel2.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 40));

        areas.setBackground(new java.awt.Color(173, 216, 230));
        areas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                areasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                areasMouseExited(evt);
            }
        });
        areas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admin3.setText("AREAS");
        areas.add(admin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 7, -1, -1));

        jPanel2.add(areas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 40));

        transaction.setBackground(new java.awt.Color(173, 216, 230));
        transaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transactionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transactionMouseExited(evt);
            }
        });
        transaction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admin4.setText("TRANSACTIONS");
        transaction.add(admin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 8, -1, -1));

        jPanel2.add(transaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 170, 40));

        users.setBackground(new java.awt.Color(173, 216, 230));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        admin2.setText("USERS");
        users.add(admin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 7, -1, -1));

        jPanel2.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 470));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("PERSONAL INFORMATION");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        profilepic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/project-manager (2).png"))); // NOI18N
        jPanel1.add(profilepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 90, 100));

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 540, 40));

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setText("Email");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 540, 40));

        cnum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cnum.setText("Contactnum");
        jPanel1.add(cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 540, 40));

        role.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        role.setText("Role");
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 540, 40));

        updatequestion.setBackground(new java.awt.Color(173, 216, 230));
        updatequestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatequestionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatequestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatequestionMouseExited(evt);
            }
        });
        updatequestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(173, 216, 230));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        updatequestion.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 100, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("SECRET QUESTION");
        updatequestion.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, -1, -1));

        jPanel1.add(updatequestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 150, 30));

        changepassword.setBackground(new java.awt.Color(173, 216, 230));
        changepassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changepasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changepasswordMouseExited(evt);
            }
        });
        changepassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(173, 216, 230));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        changepassword.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 100, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("CHANGE PASSWORD");
        changepassword.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, -1, -1));

        jPanel1.add(changepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 150, 30));

        changeprofile.setBackground(new java.awt.Color(173, 216, 230));
        changeprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeprofileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeprofileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeprofileMouseExited(evt);
            }
        });
        changeprofile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(173, 216, 230));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        changeprofile.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 100, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("CHANGE PROFILE");
        changeprofile.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, -1, -1));

        jPanel1.add(changeprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updatequestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatequestionMouseClicked
       SecretQuestion go = new SecretQuestion();
       go.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_updatequestionMouseClicked

    private void updatequestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatequestionMouseEntered
        updatequestion.setBackground(lightGray);
    }//GEN-LAST:event_updatequestionMouseEntered

    private void updatequestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatequestionMouseExited
        updatequestion.setBackground(lightBlue);
    }//GEN-LAST:event_updatequestionMouseExited

    private void changepasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepasswordMouseClicked
        ChangePass acc = new ChangePass(
        session.getU_id(), 
        session.getFirstName(), 
        session.getLastName(), 
        session.getEmail(), 
        session.getContact()
    );
        acc.setVisible(true);

    }//GEN-LAST:event_changepasswordMouseClicked

    private void changepasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepasswordMouseEntered
        changepassword.setBackground(lightGray);
    }//GEN-LAST:event_changepasswordMouseEntered

    private void changepasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepasswordMouseExited
        changepassword.setBackground(lightBlue);
    }//GEN-LAST:event_changepasswordMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to logout?",
        "Logout Confirmation",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
       
        Window window = SwingUtilities.getWindowAncestor(logout);
        if (window != null) {
            window.dispose(); 
        }

        
        LoginPanel login = new LoginPanel();
        login.setVisible(true);
    }
    }//GEN-LAST:event_logoutMouseClicked

    private void changeprofileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeprofileMouseClicked
        JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Select Profile Picture");
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg", "gif"));

    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        try {
            // Create folder if it doesn't exist
            File directory = new File("profilepics");
            directory.mkdirs();

            // Copy selected image to profilepics folder with user ID as filename
            File destFile = new File("profilepics/user_" + session.getU_id() + ".png");
            Files.copy(selectedFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

            // Load and show image in JLabel
            Image img = ImageIO.read(destFile);
            img = img.getScaledInstance(profilepic.getWidth(), profilepic.getHeight(), Image.SCALE_SMOOTH);
            profilepic.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load or save image.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_changeprofileMouseClicked

    private void changeprofileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeprofileMouseEntered
       changeprofile.setBackground(lightGray);
    }//GEN-LAST:event_changeprofileMouseEntered

    private void changeprofileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeprofileMouseExited
       changeprofile.setBackground(lightBlue);
    }//GEN-LAST:event_changeprofileMouseExited

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        
    }//GEN-LAST:event_accountMouseClicked

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        account.setBackground(lightGray);
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
        account.setBackground(lightBlue);
    }//GEN-LAST:event_accountMouseExited

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        AdminDB go = new AdminDB();
        go.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardMouseClicked

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setBackground(lightGray);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setBackground(lightBlue);
    }//GEN-LAST:event_dashboardMouseExited

    private void areasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areasMouseClicked
        Areas go = new Areas();
        go.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_areasMouseClicked

    private void areasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areasMouseEntered
        areas.setBackground(lightGray);
    }//GEN-LAST:event_areasMouseEntered

    private void areasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areasMouseExited
        areas.setBackground(lightBlue);
    }//GEN-LAST:event_areasMouseExited

    private void transactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseClicked
        Transactions go = new Transactions();
        go.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_transactionMouseClicked

    private void transactionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseEntered
        transaction.setBackground(lightGray);
    }//GEN-LAST:event_transactionMouseEntered

    private void transactionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionMouseExited
        transaction.setBackground(lightBlue);
    }//GEN-LAST:event_transactionMouseExited

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        Users go = new Users();
        go.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        users.setBackground(lightGray);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        users.setBackground(lightBlue);
    }//GEN-LAST:event_usersMouseExited

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel admin1;
    private javax.swing.JLabel admin2;
    private javax.swing.JLabel admin3;
    private javax.swing.JLabel admin4;
    private javax.swing.JLabel adminname;
    private javax.swing.JPanel areas;
    private javax.swing.JPanel changepassword;
    private javax.swing.JPanel changeprofile;
    private javax.swing.JLabel cnum;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel name;
    private javax.swing.JLabel profilepic;
    private javax.swing.JLabel role;
    private javax.swing.JPanel transaction;
    private javax.swing.JPanel updatequestion;
    private javax.swing.JPanel users;
    // End of variables declaration//GEN-END:variables
}
