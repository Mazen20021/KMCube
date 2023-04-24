package Doctors;
import Main.Config;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;
import net.proteanit.sql.DbUtils;


public class Viewpatients extends javax.swing.JFrame {
   Connection conn=null;
   PreparedStatement pst =null;
   ResultSet rs =null;
    public Viewpatients() {
       initComponents();
       conn = Config.connectDB();
       
       checkplace.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ID_texts = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkplace = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(590, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 54));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patients menu");

        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("x");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175)
                .addComponent(jButton5)
                .addGap(8, 8, 8)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 588, -1));

        ID_texts.setText("Enter Your ID Please Dr");
        ID_texts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ID_textsFocusLost(evt);
            }
        });
        ID_texts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ID_textsMouseClicked(evt);
            }
        });
        ID_texts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_textsActionPerformed(evt);
            }
        });
        ID_texts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ID_textsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ID_textsKeyTyped(evt);
            }
        });
        getContentPane().add(ID_texts, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 190, -1));

        checkplace.setColumns(1);
        checkplace.setForeground(new java.awt.Color(255, 255, 255));
        checkplace.setLineWrap(true);
        checkplace.setRows(1);
        checkplace.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkplace.setDisabledTextColor(new java.awt.Color(102, 0, 0));
        checkplace.setDoubleBuffered(true);
        checkplace.setEnabled(false);
        jScrollPane2.setViewportView(checkplace);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 590, 130));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);
doctor1 ob =new doctor1();
ob.setVisible(true);
dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void has_num(){ 
       
    String[] list;
    list = new String[100];
        try{
           String insert = "select *from PL Where ID =?";
           pst = conn.prepareStatement(insert); 
           pst.setString(1, ID_texts.getText());
           rs = pst.executeQuery();
           
          if(rs.next()){
           String pname = rs.getString("Name_Pat");
           String date  =  rs.getString("Day");
              while(rs.next()){
             checkplace.setText("Patient Name: "+pname+"  "+"Days: "+date); 
              }
             
                     
        }else{
              checkplace.setText("This ID is Not Found");
          }
     }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "This ID Is Not Found Please Make Sure You Entered Your Correct ID "+e);
             
        }
    
    
   
        
}
    private void ID_textsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_textsKeyReleased
       has_num();
      
    }//GEN-LAST:event_ID_textsKeyReleased

    private void ID_textsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_textsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_textsActionPerformed

    private void ID_textsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_textsKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_ID_textsKeyTyped

    private void ID_textsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ID_textsMouseClicked
        // TODO add your handling code here:
        if(ID_texts.getText().equals("Enter Your ID Please Dr")){
            ID_texts.setText("");
        }
    }//GEN-LAST:event_ID_textsMouseClicked

    private void ID_textsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ID_textsFocusLost
        // TODO add your handling code here:
        if(ID_texts.getText().equals("")){
            ID_texts.setText("Enter Your ID Please Dr");
        }
    }//GEN-LAST:event_ID_textsFocusLost

    
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
            java.util.logging.Logger.getLogger(Viewpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewpatients().setVisible(true);
            }
        });
    }
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_texts;
    private javax.swing.JTextArea checkplace;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

