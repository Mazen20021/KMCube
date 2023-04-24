package Reception;
import Main.Config;
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
import java.util.logging.Level;
import java.util.logging.Logger;
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
import net.proteanit.sql.DbUtils;
public class Booking_Doctor_Appointment extends javax.swing.JFrame {
    Connection conn ,con , c , co;
    ResultSet rss = null;
    ResultSet rsss = null;
    ResultSet rssss = null;
    PreparedStatement paa = null;
    PreparedStatement paada = null;
    PreparedStatement paadb = null;
    PreparedStatement paadc = null;
    boolean ge=false;
     boolean dge=false;
    public Booking_Doctor_Appointment() {
        initComponents();
        conn = Config.connectDB(); //for booking doc
        date_txt.setEditable(true);
        importd();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DocListTable = new javax.swing.JTable();
        docid_txt = new javax.swing.JTextField();
        docname_txt = new javax.swing.JTextField();
        spec_txt = new javax.swing.JTextField();
        patientid_txt = new javax.swing.JTextField();
        patientname_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(880, 583));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocListTable.setAutoCreateRowSorter(true);
        DocListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Specification", "Available "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DocListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DocListTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, 865, 410));

        docid_txt.setText("Doctor ID");
        docid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docid_txtActionPerformed(evt);
            }
        });
        docid_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                docid_txtKeyReleased(evt);
            }
        });
        getContentPane().add(docid_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 190, -1));

        docname_txt.setEditable(false);
        docname_txt.setText("Doctor Name");
        docname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docname_txtActionPerformed(evt);
            }
        });
        getContentPane().add(docname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 190, -1));

        spec_txt.setEditable(false);
        spec_txt.setText("Specification");
        getContentPane().add(spec_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 190, -1));

        patientid_txt.setText("Patient National ID");
        patientid_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                patientid_txtKeyReleased(evt);
            }
        });
        getContentPane().add(patientid_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 240, -1));

        patientname_txt.setEditable(false);
        patientname_txt.setText("Patient Name");
        patientname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientname_txtActionPerformed(evt);
            }
        });
        getContentPane().add(patientname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 240, -1));

        date_txt.setEditable(false);
        date_txt.setText("Date");
        date_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_txtActionPerformed(evt);
            }
        });
        getContentPane().add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 240, -1));

        jButton4.setText("BOOK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 80, 50));

        jButton5.setText("View Booked Appointments Table");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, -1, -1));

        jPanel1.setBackground(new java.awt.Color(31, 55, 102));
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

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, -1));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Doctors Table ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       Reception recipt = new Reception();
        recipt.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DocListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocListTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)DocListTable.getModel();
        int SelectedRows = DocListTable.getSelectedRow();
      
    }//GEN-LAST:event_DocListTableMouseClicked
int posx = 0;
int posy = 0;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 if(patientname_txt.getText().equals("Not Found")||patientname_txt.getText().equals("")){
       int x = JOptionPane.showConfirmDialog(rootPane, "This Patient Is Not Found Do You Want To Add Him?", "Adding Option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(x ==JOptionPane.YES_OPTION){
           SignUp sp = new SignUp();
           sp.show();
           dispose();
       }       
     } 
      
else{
     if(date_txt.getText().equals("")||date_txt.getText().equals("Date")){
         JOptionPane.showMessageDialog(null,"Please Choose Date");   
     }else{
     try  {    
            String sql="INSERT INTO PL(ID,Name_Doc,Spec,Name_Pat,Day) VALUES (?,?,?,?,?)";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, docid_txt.getText());
            pstmt.setString(2, docname_txt.getText());
            pstmt.setString(3, spec_txt.getText());
            pstmt.setString(4, patientname_txt.getText());
            pstmt.setString(5, date_txt.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Booked Sucessfully");          
                        
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Error");
        }
     }
        
        
}  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Booking_Doctors_Table bdt = new Booking_Doctors_Table();
         bdt.show();
        dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void patientid_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientid_txtKeyReleased
        // TODO add your handling code here:
        
           String patientid=patientid_txt.getText();
           try {
            
            String sqll="select * from PatientData where NationalID =?";
                    paa=conn.prepareStatement(sqll);
                    paa.setString(1,patientid);
         
                    rss=paa.executeQuery();
                    if(rss.next())
                    {   
                        String add1=rss.getString("Name");
                        patientname_txt.setText(add1);
                        
                         String add2=rss.getString("NationalID");
                        patientid_txt.setText(add2);
                        
                        String add3=rss.getString("Specification");
                        spec_txt.setText(add3);
                        
                        ge=false;
                       
                    }
                    else {
                       
                        patientname_txt.setText("Not Found");
                        
                        ge=true;
                    }
        }
        catch(SQLException e){
        }              
        
    }//GEN-LAST:event_patientid_txtKeyReleased

    private void docid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docid_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docid_txtActionPerformed

    private void docid_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_docid_txtKeyReleased
    String patientid=patientid_txt.getText();
           try {
            
            String sqlll="select * from doclist where ID =?";
                    paa=conn.prepareStatement(sqlll);
                    paa.setString(1,docid_txt.getText());
         
                    rss=paa.executeQuery();
                    if(rss.next())
                    {   
                        String add1=rss.getString("ID");
                        docid_txt.setText(add1);
                        
                         String add2=rss.getString("Name");
                        docname_txt.setText(add2);
                           String add3=rss.getString("Specification");
                        spec_txt.setText(add3);
                          dge=false;
                          
                          //spec_txt
                       
                    }
                    else {
                        dge=true;
                        
                       
                        
                        docname_txt.setText("Not Found");
                        spec_txt.setText("");
                          dge=false;
                        
                    }
        }
        catch(SQLException e)
        {}
    }//GEN-LAST:event_docid_txtKeyReleased

    private void docname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docname_txtActionPerformed

    private void patientname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientname_txtActionPerformed

    private void date_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_txtActionPerformed
int xt=0;
int yt=0;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xt =evt.getX();
        yt = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen()-xt,evt.getYOnScreen()-yt);
    }//GEN-LAST:event_jPanel1MouseDragged

    public void importd(){
        try{
           String insert = "select *from Adoc";
           paa = conn.prepareStatement(insert);
           rss = paa.executeQuery();
           DocListTable.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
     }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking_Doctor_Appointment().setVisible(true);
            }
        });
    }






    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DocListTable;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField docid_txt;
    private javax.swing.JTextField docname_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientid_txt;
    private javax.swing.JTextField patientname_txt;
    private javax.swing.JTextField spec_txt;
    // End of variables declaration//GEN-END:variables
}
