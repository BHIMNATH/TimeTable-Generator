/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMCTimeTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aswin
 */

public class Login extends javax.swing.JFrame {
       String ex[] = new String[2];
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
     String url = "jdbc:mysql://localhost:3306/";

        /**
         * The MySQL user.
         */
        String user = "root";

        /**
         * Password for the above MySQL user. If no password has been 
         * set (as is the default for the root user in XAMPP's MySQL),
         * an empty string can be used.
         */
        String password = "root";

        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stt = con.createStatement();

            /**
             * Create and select a database for use. 
             */

            stt.execute("USE time");

            /**
             * Create a table
             */


            /**
             * Query login
             */
            ResultSet res = stt.executeQuery("SELECT * FROM login");

            /**
             * Iterate over the result set from the above query
             */
            while (res.next())
            {
                ex[0] = res.getString("username");
                ex[1] = res.getString("password");
            }
            //System.out.println(ex[0]+" "+ex[1] );

            /**
             * Same as the last query, but using a prepared statement. 
             * Prepared statements should be used when building query strings
             * from user input as they protect against SQL injections
             */

            /**
             * Free all opened resources
             */
            res.close();
            stt.close();
            //prep.close();
            con.close();

        }
        catch (Exception e)
        {
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
        quote = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        quote1 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        quote2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quote.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        quote.setForeground(new java.awt.Color(254, 254, 254));
        quote.setText("MMC Time Table");
        jPanel1.add(quote, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        icon.setForeground(new java.awt.Color(204, 204, 204));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/3.png"))); // NOI18N
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, 10));

        jSeparator3.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, 30));

        jSeparator4.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, 10));

        jSeparator5.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, 10));

        jSeparator6.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator6.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, 30));

        jSeparator7.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator7.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, 30));

        jSeparator8.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator8.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MMCTimeTable");

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("RESET");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");

        uname.setText("admin");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please Login");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        submit.setBackground(new java.awt.Color(51, 255, 0));
        submit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(password)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(226, 226, 226))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        jPanel3.setBackground(new java.awt.Color(51, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quote1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        quote1.setForeground(new java.awt.Color(42, 43, 103));
        quote1.setText("AN INITIATIVE OF MMC TEAM");
        jPanel3.add(quote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        icon1.setForeground(new java.awt.Color(204, 204, 204));
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/3.png"))); // NOI18N
        jPanel3.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, 10));

        jSeparator9.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, 30));

        jSeparator10.setForeground(new java.awt.Color(254, 254, 254));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, 10));

        jSeparator11.setForeground(new java.awt.Color(254, 254, 254));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, 10));

        jSeparator12.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator12.setForeground(new java.awt.Color(254, 254, 254));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, 30));

        jSeparator13.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator13.setForeground(new java.awt.Color(254, 254, 254));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, 30));

        jSeparator14.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator14.setForeground(new java.awt.Color(254, 254, 254));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, 30));

        quote2.setFont(new java.awt.Font("Adobe Hebrew", 1, 24)); // NOI18N
        quote2.setForeground(new java.awt.Color(254, 254, 254));
        quote2.setText("MMC TIME TABLE");
        jPanel3.add(quote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        uname.setText(null);
        password.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String user = uname.getText();
        String pass = password.getText();
        if(user.length()>0 && pass.length()>0){
            if(pass.equals(ex[1]) && user.equals((ex[0]))){
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new BasicForm().setVisible(true);
                    }
                });
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Password/Username","InCorrect",JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fill form completely","Complete",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel quote;
    private javax.swing.JLabel quote1;
    private javax.swing.JLabel quote2;
    private javax.swing.JButton submit;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
