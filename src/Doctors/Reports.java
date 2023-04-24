
package Doctors;

import Main.Config;
import static Main.Config.connectDB;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;


public class Reports extends javax.swing.JFrame {

   Connection conn=null;
   PreparedStatement pst =null;
   ResultSet rs =null;
   
    public Reports() {
        initComponents();
     conn = Config.connectDB();
     SaveButton.setEnabled(false);
     NameField.setEnabled(false);
     Dr_Name_Text.setEnabled(false);
     Spec_texts.setEnabled(false);
     IDField.setEnabled(false);
     Quantitytext.setEnabled(false);
     MedNametext.setEnabled(false);
     DateField.setEnabled(false);
     ReportsArea.setEnabled(false);  
     get_med();
    }

   
    @SuppressWarnings("unchecked")
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        NameField = new javax.swing.JTextField();
        IDField = new javax.swing.JTextField();
        DateField = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        Dr_ID_text = new javax.swing.JTextField();
        Dr_Name_Text = new javax.swing.JTextField();
        Spec_texts = new javax.swing.JTextField();
        Quantitytext = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        MedTable = new javax.swing.JTable();
        MedNametext = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportsArea = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reports list");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 82, 38));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 73, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 255), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameField.setText("Patient Name");
        NameField.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        NameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameFieldKeyReleased(evt);
            }
        });
        jPanel2.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 230, -1));

        IDField.setText("Patient ID");
        IDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDFieldKeyTyped(evt);
            }
        });
        jPanel2.add(IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, -1));

        DateField.setText("Date");
        jPanel2.add(DateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 100, -1));

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 90, 50));

        Dr_ID_text.setText("Dr ID");
        Dr_ID_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Dr_ID_textFocusLost(evt);
            }
        });
        Dr_ID_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dr_ID_textMouseClicked(evt);
            }
        });
        Dr_ID_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dr_ID_textActionPerformed(evt);
            }
        });
        Dr_ID_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Dr_ID_textKeyReleased(evt);
            }
        });
        jPanel2.add(Dr_ID_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, -1));

        Dr_Name_Text.setText("Dr Name");
        Dr_Name_Text.setDisabledTextColor(new java.awt.Color(153, 0, 51));
        Dr_Name_Text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Dr_Name_TextFocusLost(evt);
            }
        });
        Dr_Name_Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dr_Name_TextMouseClicked(evt);
            }
        });
        jPanel2.add(Dr_Name_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 230, -1));

        Spec_texts.setText("Specification");
        Spec_texts.setDisabledTextColor(new java.awt.Color(153, 0, 51));
        jPanel2.add(Spec_texts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, -1));

        Quantitytext.setText("Quantity of this Medicine");
        Quantitytext.setDisabledTextColor(new java.awt.Color(102, 0, 0));
        Quantitytext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                QuantitytextFocusGained(evt);
            }
        });
        Quantitytext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuantitytextMouseClicked(evt);
            }
        });
        Quantitytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantitytextActionPerformed(evt);
            }
        });
        jPanel2.add(Quantitytext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 150, 30));

        MedTable.setAutoCreateRowSorter(true);
        MedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(MedTable);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 200));

        MedNametext.setText("Medicine Name");
        MedNametext.setDisabledTextColor(new java.awt.Color(102, 0, 0));
        MedNametext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MedNametextFocusGained(evt);
            }
        });
        MedNametext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedNametextMouseClicked(evt);
            }
        });
        jPanel2.add(MedNametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 380, 310));

        jLabel6.setText("Report:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 93, -1));

        ReportsArea.setColumns(20);
        ReportsArea.setRows(5);
        jScrollPane1.setViewportView(ReportsArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 330, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

doctor1 ob =new doctor1();
ob.show();
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed
 public void checks(){
     String sql = "INSERT INTO ReportTable(Patient_Name,ID,Date,Medicine,Report,Dr_ID,Dr_Name,Dr_Spec)VALUES(?,?,?,?,?,?,?,?)";

if(ReportsArea.getText().equals("") || Quantitytext.getText().equals("Quantity of this Medicine")||Quantitytext.getText().equals("")){
 JOptionPane.showMessageDialog(null,"Please Fill The Reports Area (If No Reports Type nan)");   
}else{
    try
{
    pst = conn.prepareStatement(sql);
    pst.setString(1, NameField.getText());
    pst.setString(2, IDField.getText());
    pst.setString(3, DateField.getText());
    pst.setString(4, MedNametext.getText());
    pst.setString(5, ReportsArea.getText());   
    pst.setString(6,Dr_ID_text.getText());
    pst.setString(7,Dr_Name_Text.getText());
    pst.setString(8,Spec_texts.getText());
    pst.executeUpdate();
    pst.close();
    rs.close();
    
    JOptionPane.showMessageDialog(null,"Reports Added");
   
}      catch (HeadlessException | SQLException e) {
    JOptionPane.showMessageDialog(null,e);
       
       } 
}

 }
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
if(Quantitytext.getText().equals("Out Of Stock")||Quantitytext.getText().equals("")){
    JOptionPane.showMessageDialog(null, "This Medicine is Out Of Stock or");
    
}else if(DateField.getText().equals("Date")||DateField.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please select date");
    }
else{
    checks();
}
    }//GEN-LAST:event_SaveButtonActionPerformed

    public void checkname(){
         try{
            String Plist = "select *from PatientData Where NationalID=?";
            pst = conn.prepareStatement(Plist);
            pst.setString(1, IDField.getText());
            rs = pst.executeQuery();
            if(rs.next()){
               String nid = rs.getString("Name");
               NameField.setText(nid);
               SaveButton.setEnabled(true);
               DateField.setEnabled(true);
               ReportsArea.setEnabled(true);
              
           }else{
            NameField.setText("Not Found");
             SaveButton.setEnabled(false);
             DateField.setEnabled(false);
             ReportsArea.setEnabled(false);
           }
        }catch(HeadlessException | SQLException e){   
        }
    }
    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameFieldKeyReleased
        // TODO add your handling code here:
   
    }//GEN-LAST:event_NameFieldKeyReleased

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen()-x,evt.getYOnScreen()-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void Dr_ID_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dr_ID_textMouseClicked
        // TODO add your handling code here:
        if(Dr_ID_text.getText().equals("Dr ID")){
            Dr_ID_text.setText("");
        }
    }//GEN-LAST:event_Dr_ID_textMouseClicked
public void checkname_dr(){
         try{
            String Plist = "select *from doclist Where ID=?";
            pst = conn.prepareStatement(Plist);
            pst.setString(1, Dr_ID_text.getText());
            rs = pst.executeQuery();
            if(rs.next()){
               String nid = rs.getString("Name");
               String spec = rs.getString("Specification");
               Dr_Name_Text.setText(nid);
               Spec_texts.setText(spec);
              IDField.setEnabled(true);
              
           }else{
            Dr_Name_Text.setText("Not Found");
            Spec_texts.setText("Not Found");
            SaveButton.setEnabled(false);
            NameField.setEnabled(false);
            Dr_Name_Text.setEnabled(false);
            Spec_texts.setEnabled(false);
            IDField.setEnabled(false);
            MedTable.setEnabled(false);
            Quantitytext.setEnabled(false);
            MedNametext.setEnabled(false);
           }
        }catch(HeadlessException | SQLException e){   
        }
    }
    private void Dr_Name_TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dr_Name_TextMouseClicked
        // TODO add your handling code here:
        if(Dr_Name_Text.getText().equals("Dr Name")){
            Dr_Name_Text.setText("");
        }
    }//GEN-LAST:event_Dr_Name_TextMouseClicked

    private void Dr_ID_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dr_ID_textFocusLost
        // TODO add your handling code here:
        if(Dr_ID_text.getText().equals("")){
            Dr_ID_text.setText("Dr ID");
        }
    }//GEN-LAST:event_Dr_ID_textFocusLost

    private void Dr_Name_TextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dr_Name_TextFocusLost
        // TODO add your handling code here:
        if(Dr_Name_Text.getText().equals("")){
            Dr_Name_Text.setText("Dr Name");
        }
    }//GEN-LAST:event_Dr_Name_TextFocusLost

    private void Dr_ID_textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Dr_ID_textKeyReleased
        // TODO add your handling code here:
         checkname_dr();
    }//GEN-LAST:event_Dr_ID_textKeyReleased

    private void IDFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDFieldKeyReleased
        // TODO add your handling code here:
             checkname();
    }//GEN-LAST:event_IDFieldKeyReleased

    private void IDFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_IDFieldKeyTyped

    private void IDFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDFieldKeyPressed
        // TODO add your handling code here:
        int l = IDField.getText().length();
        if(l < 14){
            IDField.setEditable(true);

        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
               IDField.setEditable(true);
            }else{
                IDField.setEditable(false);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_IDFieldKeyPressed
public void check_if_av(){
    try{
         String insert = "select *from Farmacy Where MedName =?";
           pst = conn.prepareStatement(insert); 
         pst.setString(1, MedNametext.getText());
           rs = pst.executeQuery();
              String stat = rs.getString("Quantity");
              Quantitytext.setText(stat);
         if(Quantitytext.getText().equals("Out Of Stock")||Quantitytext.getText().equals("out of stock")){
             SaveButton.setEnabled(false);
         
         }else{
            SaveButton.setEnabled(true);
            ReportsArea.setEnabled(true);          
         }
    }catch(SQLException e){
        
    }
}
public void get_med(){
    try{
         String insert = "select MedName , Quantity from Farmacy";
           pst = conn.prepareStatement(insert); 
           rs = pst.executeQuery();
           MedTable.setModel(DbUtils.resultSetToTableModel(rs));
          
              
    }catch(SQLException e){
        
    }
}
    private void Dr_ID_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dr_ID_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dr_ID_textActionPerformed

    private void QuantitytextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantitytextMouseClicked
        // TODO add your handling code here:
        if(Quantitytext.getText().equals("Quantity of this Medicine")){
        Quantitytext.setText("");
    }
    }//GEN-LAST:event_QuantitytextMouseClicked

    private void QuantitytextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_QuantitytextFocusGained
      if(Quantitytext.getText().equals("")){
        Quantitytext.setText("Quantity of this Medicine");
    }
    }//GEN-LAST:event_QuantitytextFocusGained

    private void MedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedTableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)MedTable.getModel();
        int SelectedRows = MedTable.getSelectedRow();
        MedNametext  . setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        Quantitytext. setText(RecordTable.getValueAt(SelectedRows, 1).toString());
    }//GEN-LAST:event_MedTableMouseClicked

    private void MedNametextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MedNametextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_MedNametextFocusGained

    private void MedNametextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedNametextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MedNametextMouseClicked

    private void QuantitytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantitytextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantitytextActionPerformed
int x =0;
int y = 0;
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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField DateField;
    private javax.swing.JTextField Dr_ID_text;
    private javax.swing.JTextField Dr_Name_Text;
    private javax.swing.JTextField IDField;
    private javax.swing.JTextField MedNametext;
    private javax.swing.JTable MedTable;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField Quantitytext;
    private javax.swing.JTextArea ReportsArea;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField Spec_texts;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
