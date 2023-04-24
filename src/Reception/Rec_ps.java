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
public class Rec_ps extends javax.swing.JFrame {
    Connection conn ;
    ResultSet rss = null;
    PreparedStatement paa = null;
 
    
    
    public Rec_ps() {
        initComponents();
        conn = Config.connectDB();
        importd();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DocListTable = new javax.swing.JTable();
        Nametext = new javax.swing.JTextField();
        NIDtext = new javax.swing.JTextField();
        Passtext = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        GenderText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        DocListTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "NationalID", "Password", "Age", "Phone number", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
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

        Nametext.setText("Name");
        Nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametextActionPerformed(evt);
            }
        });

        NIDtext.setText("National ID");
        NIDtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIDtextActionPerformed(evt);
            }
        });

        Passtext.setText("Password");
        Passtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasstextActionPerformed(evt);
            }
        });

        PhoneText.setText("Phone number");
        PhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextActionPerformed(evt);
            }
        });

        GenderText.setText("Gender");
        GenderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderTextActionPerformed(evt);
            }
        });

        AgeText.setText("Age");
        AgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTextActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
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

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, -1, -1));

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 9, -1, -1));

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 9, -1, -1));

        txt_search.setText("Enter NID");
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 8, 310, 30));

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 26));

        jLabel1.setText("Search By National ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 127, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nametext, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Passtext, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NIDtext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenderText))
                            .addComponent(PhoneText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GenderText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nametext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Passtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Reception rec = new Reception();
        rec.show();
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

    private void NametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NametextActionPerformed
public String getnamepat(){
    DefaultTableModel RecordTable = (DefaultTableModel)DocListTable.getModel();
    int SelectedRows = DocListTable.getSelectedRow();
    String name = RecordTable.getValueAt(SelectedRows, 0).toString();
    return name;
}
public String getidpat(){
    DefaultTableModel RecordTable = (DefaultTableModel)DocListTable.getModel();
    int SelectedRows = DocListTable.getSelectedRow();
    String id = RecordTable.getValueAt(SelectedRows, 7).toString();
    return id;
}
    private void DocListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocListTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)DocListTable.getModel();
        int SelectedRows = DocListTable.getSelectedRow();
        Nametext. setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        Passtext . setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        NIDtext. setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        AgeText . setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        PhoneText . setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        GenderText. setText(RecordTable.getValueAt(SelectedRows, 5).toString());
    }//GEN-LAST:event_DocListTableMouseClicked

    private void NIDtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIDtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIDtextActionPerformed

    private void PasstextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasstextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasstextActionPerformed

int posx = 0;
int posy = 0;

    private void PhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextActionPerformed

    private void GenderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderTextActionPerformed

    private void AgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTextActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        posx = evt.getX();
        posy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen()-posx,evt.getYOnScreen()-posy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
          
        try {
            
            String sql="select * from PatientData where NationalID =?";
                    paa=conn.prepareStatement(sql);
                    paa.setString(1,txt_search.getText());
         
                    rss=paa.executeQuery();
                    if(rss.next())
                    {   
                        String add1=rss.getString("Name");
                        Nametext.setText(add1);
                        
                         String add2=rss.getString("NationalID");
                        NIDtext.setText(add2);
                        
                       
                        
                         String add4=rss.getString("Password");
                        Passtext.setText(add4);
                        
                         String add5=rss.getString("Age");
                        AgeText.setText(add5);
                        
                         String add6=rss.getString("PhoneNumber");
                        PhoneText.setText(add6);
                        
                         String add7=rss.getString("Gender");
                        GenderText.setText(add7);
                        
                       
                    }
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null,e);
            
        }
        
        
    }                                      
   
    public void edit(){    
    try{
       String insert = "Insert into PatientData (Name,NationalID,Password,Age,PhoneNumber,Gender)  values (?,?,?,?,?,?,?)";
       paa = conn.prepareStatement(insert);
       paa.setString(1, Nametext.getText());
       paa.setString(2, NIDtext.getText());
       paa.setString(3, Passtext.getText());
       paa.setString(4, AgeText.getText());
       paa.setString(5, PhoneText.getText());
       paa.setString(6, GenderText.getText());
       paa.executeUpdate();
       JOptionPane.showMessageDialog(null,"User Added Sucessfully");
       importd();
    }catch(HeadlessException | SQLException e){
        importd();
        JOptionPane.showMessageDialog(null,"Error Password Or National ID is repeated");
    }
        
        
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
            
        try {
            
            String sql="select * from PatientData where NationalID =?";
                    paa=conn.prepareStatement(sql);
                    paa.setString(1,txt_search.getText());
         
                    rss=paa.executeQuery();
                    if(rss.next())
                    {   
                        String add1=rss.getString("Name");
                        Nametext.setText(add1);
                         String add2=rss.getString("NationalID");
                        NIDtext.setText(add2);
                         String add4=rss.getString("Password");
                        Passtext.setText(add4);
                         String add5=rss.getString("Age");
                        AgeText.setText(add5);

                         String add6=rss.getString("PhoneNumber");
                        PhoneText.setText(add6);
                        
                         String add7=rss.getString("Gender");
                        GenderText.setText(add7);
                        
                        
                    }
        }
        catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(null,e);
            
        }
        
    }//GEN-LAST:event_txt_searchActionPerformed
   /*
    public void edit(){    
    try{
       String insert = "Insert into PatientData (Name,NationalID,Password,Email,Age,PhoneNumber,Gender)  values (?,?,?,?,?,?,?)";
       paa = conn.prepareStatement(insert);
       paa.setString(1, Nametext.getText());
       paa.setString(2, NIDtext.getText());
       paa.setString(3, Passtext.getText());
       paa.setString(4, EmailText.getText());
       paa.setString(5, AgeText.getText());
       paa.setString(6, PhoneText.getText());
       paa.setString(7, GenderText.getText());
       paa.executeUpdate();
       JOptionPane.showMessageDialog(null,"User Added Sucessfully");
       importd();
    }catch(HeadlessException | SQLException e){
        importd();
        JOptionPane.showMessageDialog(null,"Error Password Or National ID is repeated");
    }
}
    
    */
    
    public void importd(){
        
        try{
           String insert = "select *from PatientData";
           paa = conn.prepareStatement(insert);
           rss = paa.executeQuery();
           DocListTable.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
     }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rec_ps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeText;
    private javax.swing.JTable DocListTable;
    private javax.swing.JTextField GenderText;
    private javax.swing.JTextField NIDtext;
    private javax.swing.JTextField Nametext;
    private javax.swing.JTextField Passtext;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
