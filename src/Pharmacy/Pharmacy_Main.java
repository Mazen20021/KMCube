package Pharmacy;
import Main.Main;
import Main.Config;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Pharmacy_Main extends javax.swing.JFrame {
Connection conn;
ResultSet rss = null;
PreparedStatement paa = null; 
    public Pharmacy_Main() {
        initComponents();
        AddMedpannel.setVisible(true);
        medname.setEnabled(false);
        statef.setEnabled(false);
        drname.setEnabled(false);
        medcode.setEnabled(false);
        addbot.setEnabled(false);
        notestext.setEnabled(false);
        expdate.setEnabled(false);
        quantity.setEnabled(false);
        Updatebot.setEnabled(false);
          
        conn = Config.connectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        AddMedpannel = new javax.swing.JPanel();
        medcode = new javax.swing.JTextField();
        medname = new javax.swing.JTextField();
        statef = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        drname = new javax.swing.JTextField();
        expdate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        notestext = new javax.swing.JTextArea();
        drid = new javax.swing.JTextField();
        addbot = new javax.swing.JButton();
        Updatebot = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ViewStock = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        LogOut = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        AddMedicine = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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

        AddMedpannel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        AddMedpannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medcode.setText("Medicine Code");
        medcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                medcodeFocusLost(evt);
            }
        });
        medcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medcodeMouseClicked(evt);
            }
        });
        medcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medcodeKeyReleased(evt);
            }
        });
        AddMedpannel.add(medcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, -1));

        medname.setText("Medicine Name");
        medname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mednameFocusLost(evt);
            }
        });
        medname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mednameMouseClicked(evt);
            }
        });
        AddMedpannel.add(medname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, -1));

        statef.setText("State");
        AddMedpannel.add(statef, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, -1));

        quantity.setText("Quantity");
        quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFocusLost(evt);
            }
        });
        quantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantityMouseClicked(evt);
            }
        });
        AddMedpannel.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 130, -1));

        drname.setText("Dr Name");
        AddMedpannel.add(drname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 240, -1));

        expdate.setText("Expiry Date");
        expdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                expdateFocusLost(evt);
            }
        });
        expdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expdateMouseClicked(evt);
            }
        });
        AddMedpannel.add(expdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, -1));

        notestext.setColumns(20);
        notestext.setRows(5);
        notestext.setText("Notes:");
        jScrollPane1.setViewportView(notestext);

        AddMedpannel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 450, 290));

        drid.setText("Dr ID");
        drid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dridKeyReleased(evt);
            }
        });
        AddMedpannel.add(drid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, -1));

        addbot.setText("Add");
        addbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbotActionPerformed(evt);
            }
        });
        AddMedpannel.add(addbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 80, 40));

        Updatebot.setText("Update");
        Updatebot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebotActionPerformed(evt);
            }
        });
        AddMedpannel.add(Updatebot, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, 40));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        AddMedpannel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jPanel4.add(AddMedpannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 870, 330));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(53, 86, 118));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewStock.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        ViewStock.setForeground(new java.awt.Color(204, 204, 204));
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
        AddMedicine.setForeground(new java.awt.Color(255, 255, 255));
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

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddMedicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMedicineMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AddMedicineMouseEntered

    private void AddMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMedicineMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_AddMedicineMouseExited

    private void ViewStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStockMouseEntered
        // TODO add your handling code here:
 ViewStock.setForeground(Color.white);
        
    }//GEN-LAST:event_ViewStockMouseEntered

    private void ViewStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStockMouseExited
        // TODO add your handling code here:
               ViewStock.setForeground(Color.lightGray);
    }//GEN-LAST:event_ViewStockMouseExited

    private void LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseEntered
        // TODO add your handling code here:
        
       LogOut.setForeground(Color.white);
    }//GEN-LAST:event_LogOutMouseEntered

    private void LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseExited
        // TODO add your handling code here:
         LogOut.setForeground(Color.lightGray);
    }//GEN-LAST:event_LogOutMouseExited

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        Main m = new Main();
        m.show();
        dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void AddMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMedicineMouseClicked
        // TODO add your handling code here:
    AddMedpannel.show();
  if(AddMedpannel.isVisible()){
       AddMedicine.setForeground(Color.white);
   }  
    }//GEN-LAST:event_AddMedicineMouseClicked

    private void addbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbotActionPerformed
if(notestext.getText().equals("Notes:")||notestext.getText().equals("")){
 JOptionPane.showMessageDialog(null,"Please Put Any Notes if There is no note type nan");    
}else{
    try{
            String Surgon = "Insert into Farmacy (MedName,MedCode,ExpDate,Quantity,DrID,DrName,Notes)  values (?,?,?,?,?,?,?)";
            paa = conn.prepareStatement(Surgon);
            paa.setString(1, medname.getText());
            paa.setString(2, medcode.getText());
            paa.setString(3, expdate.getText());
            paa.setString(4, quantity.getText());
            paa.setString(5, drid.getText());
            paa.setString(6, drname.getText());
            paa.setString(7, notestext.getText());
            if(quantity.getText().equals("0")){
              paa.setString(4, "Out Of Stock"); 
              paa.executeUpdate();
              JOptionPane.showMessageDialog(null,"Medicine Added(Note Please As soon As possible Get More Of That Medicine)");
              medcode.setText("Medicine Code");
              expdate.setText("Expiry Date");
              medname.setText("Medicine Name");
              quantity.setText("Quantity");
              
            }else{
                paa.setString(4, quantity.getText()); 
                paa.executeUpdate();
                JOptionPane.showMessageDialog(null,"This Medicine Added Sucessfully");
              medcode.setText("Medicine Code");
              expdate.setText("Expiry Date");
              medname.setText("Medicine Name");
              quantity.setText("Quantity");
            }
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
}
        
    }//GEN-LAST:event_addbotActionPerformed

    private void medcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medcodeKeyReleased
        search();
    }//GEN-LAST:event_medcodeKeyReleased

    private void dridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dridKeyReleased
        find();
    }//GEN-LAST:event_dridKeyReleased

    private void UpdatebotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebotActionPerformed
        update();
    }//GEN-LAST:event_UpdatebotActionPerformed

    private void ViewStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewStockMouseClicked
  Pharmacy_Main fm = new Pharmacy_Main();
        View_Stock vs = new View_Stock();
        fm.setVisible(false);
        vs.setVisible(true);
       
        
         

    }//GEN-LAST:event_ViewStockMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
int x =0;
int y =0;

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
       setLocation(evt.getXOnScreen()-x,evt.getYOnScreen()-y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void mednameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mednameMouseClicked
       if(medname.getText().equals("Medicine Name")){
           medname.setText("");
       }
        
        
        
        
        
    }//GEN-LAST:event_mednameMouseClicked

    private void mednameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mednameFocusLost
       if(medname.getText().equals("")){
           medname.setText("Medicine Name");
       }
    }//GEN-LAST:event_mednameFocusLost

    private void medcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medcodeMouseClicked
       if(medcode.getText().equals("Medicine Code")){
           medcode.setText("");
       }
    }//GEN-LAST:event_medcodeMouseClicked

    private void medcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_medcodeFocusLost
       if(medcode.getText().equals("")){
           medcode.setText("Medicine Code");
       }
    }//GEN-LAST:event_medcodeFocusLost

    private void expdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expdateMouseClicked
        if(expdate.getText().equals("Expiry Date")){
          expdate.setText("");
       }
    }//GEN-LAST:event_expdateMouseClicked

    private void expdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expdateFocusLost
     if(expdate.getText().equals("")){
          expdate.setText("Expiry Date");
       }
    }//GEN-LAST:event_expdateFocusLost

    private void quantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantityMouseClicked
        if(quantity.getText().equals("Quantity")){
          quantity.setText("");
       }
    }//GEN-LAST:event_quantityMouseClicked

    private void quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusLost
           if(quantity.getText().equals("")){
          quantity.setText("Quantity");
       }
    }//GEN-LAST:event_quantityFocusLost

public void find(){
     try{
          String insert = "select *from FarmacyDoc Where DrID =?";
           paa = conn.prepareStatement(insert); 
           paa.setString(1, drid.getText());
           rss = paa.executeQuery();
          if(rss.next()){
              String drnames = rss.getString("DrName");
              drname.setText(drnames);
         if(drname.getText().equals("ID Not Found")){
             medcode.setEnabled(false);
             addbot.setEnabled(false);
             notestext.setEnabled(false);
             expdate.setEnabled(false);
             quantity.setEnabled(false);
             Updatebot.setEnabled(false);
         }else{
             medcode.setEnabled(true);
         }
         }else{
             drname.setText("ID Not Found");
             quantity.setEnabled(false);
             addbot.setEnabled(false);
             expdate.setEnabled(false);
             notestext.setEnabled(false);
             Updatebot.setEnabled(false);
             medcode.setEnabled(false);
          }
        
      }catch(SQLException e){
          
      }
}
public void search(){
      try{
          String insert = "select *from Farmacy Where MedCode =?";
           paa = conn.prepareStatement(insert); 
           paa.setString(1, medcode.getText());
           rss = paa.executeQuery();
          if(rss.next()){
              String mednames = rss.getString("MedName");
              String quantitys = rss.getString("Quantity");
              String expcodes = rss.getString("ExpDate");
              String drnames = rss.getString("DrName");
              String drids = rss.getString("DrID");
              medname.setText(mednames);
              expdate.setText(expcodes);
              quantity.setText(quantitys);
              drid.setText(drids);
              drname.setText(drnames);
              statef.setText("Medicine Found");
         if(statef.getText().equals("Medicine Found")){
             addbot.setEnabled(false);
             expdate.setEnabled(false);
             drid.setEnabled(false);
             quantity.setEnabled(true);
             medname.setEnabled(false);
             notestext.setEnabled(true);
             Updatebot.setEnabled(true);
         }else{
             addbot.setEnabled(true);
             expdate.setEnabled(true);
             drid.setEnabled(true);
             quantity.setEnabled(true);
             notestext.setEnabled(true);
             medname.setEnabled(true);
             Updatebot.setEnabled(false);
         }
         }else{
             statef.setText("Medicine Not Found");
             addbot.setEnabled(true);
             expdate.setEnabled(true);
             drid.setEnabled(true);
             medname.setEnabled(true);
             quantity.setEnabled(true);
             notestext.setEnabled(true);
             Updatebot.setEnabled(false);
          }
        
      }catch(SQLException e){
          
      }
  }
public void update(){
     try{
        String update = "Update Farmacy set Quantity=? Where MedCode ="+medcode.getText()+"";
        paa = conn.prepareStatement(update);
        paa.setString(1, quantity.getText());
        if(quantity.getText().equals("0")){
          paa.setString(1, "Out Of Stock"); 
          paa.executeUpdate();
          JOptionPane.showMessageDialog(null,"Medicine Updated(Note Please As soon As possible Get More Of That Medicine)");
        }else{
        paa.executeUpdate(); 
        JOptionPane.showMessageDialog(null,"Medicine Updated");
        }
    }catch(SQLException e){
         JOptionPane.showMessageDialog(null,e);
    }
}
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacy_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddMedicine;
    private javax.swing.JPanel AddMedpannel;
    private javax.swing.JLabel LogOut;
    private javax.swing.JButton Updatebot;
    private javax.swing.JLabel ViewStock;
    private javax.swing.JButton addbot;
    private javax.swing.JTextField drid;
    private javax.swing.JTextField drname;
    private javax.swing.JTextField expdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medcode;
    private javax.swing.JTextField medname;
    private javax.swing.JTextArea notestext;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField statef;
    // End of variables declaration//GEN-END:variables
}
