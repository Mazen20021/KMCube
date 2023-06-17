package Reception;
import Main.Config;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SingleSelectionModel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Patient_Female extends javax.swing.JFrame {
     Connection conn;
    ResultSet rss = null;
    PreparedStatement paa = null;
    public Patient_Female() {
        initComponents();
        conn = Config.connectDB();
     
        
      
       
       
        Pname1.setEnabled(false);
        Date.setEnabled(false);
        Stype.setEnabled(false);
       
      
      
        jButton8.setEnabled(false);
        
        Rstate.setEnabled(false);
       
       
        imported();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        pn = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        Rnum = new javax.swing.JTextField();
        Stype = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        Rstate = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        Pname1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Rtable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1024, 500));

        jPanel2.setBackground(new java.awt.Color(78, 102, 151));
        jPanel2.setPreferredSize(new java.awt.Dimension(1024, 480));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 12, 64));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Patient");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/HosLogo211.png"))); // NOI18N
        jLabel3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/HosLogov1.png"))); // NOI18N
        jLabel3.setDoubleBuffered(true);
        jLabel3.setFocusCycleRoot(true);
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 170, 230));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 167, 500));

        jPanel4.setBackground(new java.awt.Color(78, 102, 151));
        jPanel4.setPreferredSize(new java.awt.Dimension(1024, 480));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -40, -1, -1));

        pn.setBackground(java.awt.SystemColor.activeCaptionBorder);
        pn.setForeground(java.awt.SystemColor.activeCaption);
        pn.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        pn.setToolTipText("");
        pn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jPanel7.setBackground(new java.awt.Color(78, 102, 151));
        jPanel7.setBorder(null);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rnum.setBackground(new java.awt.Color(153, 153, 153));
        Rnum.setText("Room Number");
        Rnum.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                RnumComponentAdded(evt);
            }
        });
        Rnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RnumFocusLost(evt);
            }
        });
        Rnum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RnumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RnumMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RnumMousePressed(evt);
            }
        });
        Rnum.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                RnumComponentShown(evt);
            }
        });
        Rnum.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                RnumInputMethodTextChanged(evt);
            }
        });
        Rnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RnumActionPerformed(evt);
            }
        });
        Rnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RnumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RnumKeyTyped(evt);
            }
        });
        jPanel7.add(Rnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 130, -1));

        Stype.setBackground(new java.awt.Color(153, 153, 153));
        Stype.setText("Surgon Type");
        Stype.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                StypeFocusLost(evt);
            }
        });
        Stype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StypeMouseClicked(evt);
            }
        });
        jPanel7.add(Stype, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 290, -1));

        Date.setBackground(new java.awt.Color(153, 153, 153));
        Date.setText("DD/MM/YY");
        Date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DateFocusLost(evt);
            }
        });
        Date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DateMouseClicked(evt);
            }
        });
        Date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DateKeyTyped(evt);
            }
        });
        jPanel7.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 290, -1));

        Rstate.setBackground(new java.awt.Color(153, 153, 153));
        Rstate.setText("Room State");
        Rstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RstateActionPerformed(evt);
            }
        });
        jPanel7.add(Rstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 135, -1));

        jButton8.setText("Book");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 102, 40));

        Pname1.setBackground(new java.awt.Color(153, 153, 153));
        Pname1.setText("Patient Name");
        Pname1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pname1FocusLost(evt);
            }
        });
        Pname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pname1MouseClicked(evt);
            }
        });
        Pname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pname1ActionPerformed(evt);
            }
        });
        jPanel7.add(Pname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 290, -1));

        Rtable.setAutoCreateRowSorter(true);
        Rtable.setBackground(new java.awt.Color(102, 102, 102));
        Rtable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Rtable.setModel(new javax.swing.table.DefaultTableModel(
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
                "RoomNumber", "State"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Rtable.setEnabled(false);
        Rtable.setGridColor(new java.awt.Color(0, 153, 153));
        Rtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Rtable);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 820, 240));

        pn.addTab("Book A Surgery", jPanel7);

        jPanel4.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 840, 460));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 870, 460));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Reception Home = new Reception();
        Home.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
public void imported(){
   
    try{
           String insert = "select *from RoomEmg";
           paa = conn.prepareStatement(insert);
           rss = paa.executeQuery();
           Rtable.setModel(DbUtils.resultSetToTableModel(rss));     
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
       
}public void update_table(){
    try{
        String update = "Update RoomEmg set State=? Where RoomNo ="+Rnum.getText()+"";
        paa = conn.prepareStatement(update);
        paa.setString(1, "full");
        paa.executeUpdate();
    }catch(SQLException e){
         JOptionPane.showMessageDialog(null,e);
    }
}public void has_num(){  
     try{
           String insert = "select *from RoomEmg Where RoomNo =?";
           paa = conn.prepareStatement(insert); 
           paa.setString(1, Rnum.getText());
           rss = paa.executeQuery();
          if(rss.next()){
              String stat = rss.getString("State");
              Rstate.setText(stat);
         if(Rstate.getText().equals("Full")||Rstate.getText().equals("full")){
             Pname1.setEnabled(false);
             Stype.setEnabled(false);
             Date.setEnabled(false);
             
              jButton8.setEnabled(false);
         }else{
             Pname1.setEnabled(true);
             Stype.setEnabled(true);
             Date.setEnabled(true);
             
             jButton8.setEnabled(true);
         }
         }else{
              Rstate.setText("Room Not Found");
              Pname1.setEnabled(false);
              Stype.setEnabled(false);
              Date.setEnabled(false);
             
              jButton8.setEnabled(false);
          }
        
        }catch(SQLException e){
           Rstate.setText("Error 404"); 
        }
}int pX = 0;
int pY  = 0;
       
    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        pX =evt.getX();
        pY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
         setLocation(evt.getXOnScreen()-pX , evt.getYOnScreen()-pY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4MouseDragged

    private void RtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RtableMouseClicked

    }//GEN-LAST:event_RtableMouseClicked

    private void Pname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pname1ActionPerformed

    private void Pname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pname1MouseClicked
        // TODO add your handling code here:
        if(Pname1.getText().equals("Patient Name")){
            Pname1.setText("");
        }
    }//GEN-LAST:event_Pname1MouseClicked

    private void Pname1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pname1FocusLost
        if(Pname1.getText().equals("")){
            Pname1.setText("Patient Name");
        }
    }//GEN-LAST:event_Pname1FocusLost

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try{
            String Surgon = "Insert into Surgonlist (RoomNumber,SurgonType,PatientName,Date)  values (?,?,?,?)";
            paa = conn.prepareStatement(Surgon);
            paa.setString(1, Rnum.getText());
            paa.setString(2, Stype.getText());
            paa.setString(3, Pname1.getText());
            paa.setString(4, Date.getText());
            paa.executeUpdate();
            JOptionPane.showMessageDialog(null,"Room Booked Sucessfully");
            update_table();
            imported();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"This Room Is Used");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void RstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RstateActionPerformed

    }//GEN-LAST:event_RstateActionPerformed

    private void DateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DateKeyTyped
        // TODO add your handling code here:
        int l = Date.getText().length();
        if(l < 10){
            Date.setEditable(true);

        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                Date.setEditable(true);
            }else{
                Date.setEditable(false);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_DateKeyTyped

    private void DateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateMouseClicked
        // TODO add your handling code here:
        if(Date.getText().equals("DD/MM/YY")){
            Date.setText("");
        }
    }//GEN-LAST:event_DateMouseClicked

    private void DateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateFocusLost
        // TODO add your handling code here:
        if(Date.getText().equals("")){
            Date.setText("DD/MM/YY");
        }
    }//GEN-LAST:event_DateFocusLost

    private void StypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StypeMouseClicked

        if(Stype.getText().equals("Surgon Type")){
            Stype.setText("");
        }
    }//GEN-LAST:event_StypeMouseClicked

    private void StypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StypeFocusLost
        // TODO add your handling code here:
        if(Stype.getText().equals("")){
            Stype.setText("Surgon Type");
        }
    }//GEN-LAST:event_StypeFocusLost

    private void RnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RnumKeyTyped
        Rstate.setText("");
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE )||c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_RnumKeyTyped

    private void RnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RnumKeyReleased
        has_num();
    }//GEN-LAST:event_RnumKeyReleased

    private void RnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RnumActionPerformed

    private void RnumInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_RnumInputMethodTextChanged

    }//GEN-LAST:event_RnumInputMethodTextChanged

    private void RnumComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_RnumComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_RnumComponentShown

    private void RnumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RnumMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RnumMousePressed

    private void RnumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RnumMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RnumMouseEntered

    private void RnumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RnumMouseClicked
        // TODO add your handling code here:
        if(Rnum.getText().equals("Room Number"))
        Rnum.setText("");
    }//GEN-LAST:event_RnumMouseClicked

    private void RnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RnumFocusLost

        if(Rnum.getText().equals("")){
            Rnum.setText("Room Number");
            Rstate.setText("Room State");
        }
    }//GEN-LAST:event_RnumFocusLost

    private void RnumComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_RnumComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_RnumComponentAdded
 
   
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
            java.util.logging.Logger.getLogger(Patient_Female.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Female.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Female.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Female.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Female().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Pname1;
    private javax.swing.JTextField Rnum;
    private javax.swing.JTextField Rstate;
    private javax.swing.JTable Rtable;
    private javax.swing.JTextField Stype;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane pn;
    // End of variables declaration//GEN-END:variables
}
