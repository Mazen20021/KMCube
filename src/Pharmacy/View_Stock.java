
package Pharmacy;

import Main.Config;
import Main.Main;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class View_Stock extends javax.swing.JFrame {

  Connection conn;
ResultSet rss = null;
PreparedStatement paa = null; 
    public View_Stock() {
        initComponents();
        ViewStockPannel.setVisible(true);
        conn = Config.connectDB();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ViewStock = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        LogOut = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        AddMedicine = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ViewStockPannel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Dr_ID = new javax.swing.JTextField();
        showtable = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(53, 86, 118));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewStock.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        ViewStock.setForeground(new java.awt.Color(255, 255, 255));
        ViewStock.setText("  View Stock");
        ViewStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewStockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ViewStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewStockMouseExited(evt);
            }
        });
        jPanel3.add(ViewStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 40));

        jPanel5.setBackground(new java.awt.Color(53, 86, 118));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogOut.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        LogOut.setForeground(new java.awt.Color(204, 204, 204));
        LogOut.setText("              Log Out");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutMouseExited(evt);
            }
        });
        jPanel5.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 140, 40));

        jPanel6.setBackground(new java.awt.Color(53, 86, 118));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddMedicine.setBackground(new java.awt.Color(204, 204, 204));
        AddMedicine.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        AddMedicine.setForeground(new java.awt.Color(204, 204, 204));
        AddMedicine.setText(" Add Medicine");
        AddMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMedicineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMedicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMedicineMouseExited(evt);
            }
        });
        jPanel6.add(AddMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 40));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("       Pharmacy");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 60));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 400));

        ViewStockPannel.setBackground(new java.awt.Color(204, 204, 204));
        ViewStockPannel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ViewStockPannel.setPreferredSize(new java.awt.Dimension(850, 340));
        ViewStockPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MedName", "MedCode", "ExpDate", "Quantity", "DrName", "Notes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        ViewStockPannel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 5, 650, 320));

        Dr_ID.setText("Dr ID");
        ViewStockPannel.add(Dr_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        showtable.setText("Show Table");
        showtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showtableActionPerformed(evt);
            }
        });
        ViewStockPannel.add(showtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 50));

        jPasswordField1.setText("jPasswordField1");
        ViewStockPannel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, -1));

        jPanel4.add(ViewStockPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 870, 330));

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStockMouseClicked
        // TODO add your handling code here:
       ViewStockPannel.show();
        if(ViewStockPannel.isVisible()){
           ViewStock.setForeground(Color.white);
       }

    }//GEN-LAST:event_ViewStockMouseClicked

    private void ViewStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStockMouseEntered
        // TODO add your handling code here:
       

    }//GEN-LAST:event_ViewStockMouseEntered

    private void ViewStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStockMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ViewStockMouseExited

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        Main m = new Main();
        m.show();
        dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseEntered
        // TODO add your handling code here:

        LogOut.setForeground(Color.white);
    }//GEN-LAST:event_LogOutMouseEntered

    private void LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseExited
        // TODO add your handling code here:
        LogOut.setForeground(Color.lightGray);
    }//GEN-LAST:event_LogOutMouseExited

    private void AddMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMedicineMouseClicked
        Pharmacy_Main fm = new Pharmacy_Main();
        View_Stock vs = new View_Stock();
        fm.setVisible(true);
        vs.setVisible(false);
       

    }//GEN-LAST:event_AddMedicineMouseClicked

    private void AddMedicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMedicineMouseEntered
        // TODO add your handling code here:
        AddMedicine.setForeground(Color.white);
    }//GEN-LAST:event_AddMedicineMouseEntered

    private void AddMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMedicineMouseExited
        // TODO add your handling code here:
        AddMedicine.setForeground(Color.lightGray);
    }//GEN-LAST:event_AddMedicineMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void showtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showtableActionPerformed
     find_ID();
    }//GEN-LAST:event_showtableActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        x=evt.getX();
                y=evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
       setLocation(evt.getXOnScreen()-x,evt.getYOnScreen()-y);
    }//GEN-LAST:event_jPanel4MouseDragged
int x =0;
int y = 0;
public void find_ID(){
     try{
          String insert = "select *from FarmacyDoc Where DrID =? and Password=?";
           paa = conn.prepareStatement(insert); 
           paa.setString(1, Dr_ID.getText());
           paa.setString(2, jPasswordField1.getText());
           rss = paa.executeQuery();
          if(rss.next()){
              updatetable();
              Dr_ID.setEnabled(false);
              jPasswordField1.setEnabled(false);
              showtable.setEnabled(false);
              Dr_ID.setText("");
              jPasswordField1.setText("");
               
         }else{
            JOptionPane.showMessageDialog(null,"ID or Password is Wrong"); 
          }
        
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null,e); 
      }
}
    public void updatetable(){
    try{
           String insert = "select MedName , MedCode , ExpDate , Quantity , DrName , Notes from Farmacy";
           paa = conn.prepareStatement(insert);
           rss = paa.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
    }
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
            java.util.logging.Logger.getLogger(View_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddMedicine;
    private javax.swing.JTextField Dr_ID;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel ViewStock;
    private javax.swing.JPanel ViewStockPannel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton showtable;
    // End of variables declaration//GEN-END:variables
}
