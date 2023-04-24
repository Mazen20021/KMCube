package Main;
import Admins.Admins;
import Doctors.doctor1;
import Pharmacy.Pharmacy_Main;
import Managers.Managers;
import Reception.Patient_Female;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Reception.Reception;
public class Main extends javax.swing.JFrame {
    Connection con ;
    ResultSet rs = null;
    PreparedStatement pa = null;
    public Main() {
        initComponents();
        con = Config.connectDB();
       
    }
    int positionX = 0;
    int positionY = 0;
    public void rec_doc(){
        Admins AD = new Admins();
        String nid  =  NationalIDText.getText();
        String pass =  PasswordText.getText();
        doctor1 dr = new doctor1();
       if((nid.equals("10001")) & (pass.equals(getpass()))){
           
           AD.setVisible(true);
            dispose();
       }
       else if((nid.equals("80002")) & (pass.equals("Admin_rs"))){
           Reception rD = new Reception();
           rD.show();
            dispose();
       }
        else{
        try{
           String sql = "select * from doclist WHERE NationalID LIKE ? and Password LIKE ?;";
           pa = con.prepareStatement(sql);
           pa.setString(1, NationalIDText.getText());
           pa.setString(2, PasswordText.getText());
           rs = pa.executeQuery();
           if(rs.next()){
              dr.show();
              dispose();
           }
           else if(!rs.next()){
              rec();
           }
           else{
               JOptionPane.showMessageDialog(null, "User Is Not Found"); 
           }
           
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error"); 
       }
        }
        
}
    public void farm(){
        Pharmacy_Main fm = new Pharmacy_Main();
      try{
           String sql = "select * from FarmacyDoc WHERE DrID LIKE ? and Password LIKE ?;";
           pa = con.prepareStatement(sql);
           pa.setString(1, NationalIDText.getText());
           pa.setString(2, PasswordText.getText());
           rs = pa.executeQuery();
           if(rs.next()){
              fm.show();
              dispose();
           }
           else{
               JOptionPane.showMessageDialog(null, "User Is Not Found"); 
           }
           
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error"); 
       }  
    }
    public void rec(){
        Patient_Female ptf = new Patient_Female();
        Managers mg = new Managers();
        Admins AD = new Admins();
        String nid  = NationalIDText.getText();
        String pass =  PasswordText.getText();
        if((nid.equals("10001")) & (pass.equals("Admin_ad"))){
           
           AD.setVisible(true);
           dispose();
       }
       else if((nid.equals("90001")) & (pass.equals("Admin_mg"))){
          
           mg.setVisible(true);
           dispose();
       }
       else{
        try{
           String sql = "select * from PatientData WHERE NationalID LIKE ? and Password LIKE ?;";
           pa = con.prepareStatement(sql);
           pa.setString(1, NationalIDText.getText());
           pa.setString(2, PasswordText.getText());
           rs = pa.executeQuery();
           if(rs.next()){
              ptf.show();
              dispose();
           }else if(!rs.next()){
               farm();
           }
           else{
               JOptionPane.showMessageDialog(null, "User Is Not Found"); 
           }
           
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error"); 
       }
       }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        MainPannel = new javax.swing.JPanel();
        LogIn = new javax.swing.JButton();
        PasswordText = new javax.swing.JPasswordField();
        NationalIDText = new javax.swing.JTextField();
        showpassword = new javax.swing.JCheckBox();
        MainLogo = new javax.swing.JLabel();
        Minimize = new javax.swing.JButton();
        exitbot = new javax.swing.JButton();
        OurTeam = new javax.swing.JButton();
        VersionDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                formCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jDesktopPane1.setBorder(null);
        jDesktopPane1.setAutoscrolls(true);
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(320, 640));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(320, 640));
        jDesktopPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseDragged(evt);
            }
        });
        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDesktopPane1MousePressed(evt);
            }
        });

        MainPannel.setBackground(new java.awt.Color(8, 12, 61));
        MainPannel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        MainPannel.setAutoscrolls(true);
        MainPannel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainPannelMouseDragged(evt);
            }
        });
        MainPannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainPannelMousePressed(evt);
            }
        });
        MainPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogIn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        LogIn.setText("Log In");
        LogIn.setAlignmentX(250.0F);
        LogIn.setAlignmentY(250.0F);
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInMouseClicked(evt);
            }
        });
        MainPannel.add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 361, 90, 60));

        PasswordText.setBackground(new java.awt.Color(204, 204, 204));
        PasswordText.setText("Password");
        PasswordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordTextFocusLost(evt);
            }
        });
        PasswordText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordTextMousePressed(evt);
            }
        });
        PasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordTextKeyPressed(evt);
            }
        });
        MainPannel.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 254, 400, -1));

        NationalIDText.setBackground(new java.awt.Color(204, 204, 204));
        NationalIDText.setText("National ID");
        NationalIDText.setCaretColor(java.awt.Color.white);
        NationalIDText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NationalIDText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        NationalIDText.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        NationalIDText.setSelectionColor(new java.awt.Color(255, 255, 255));
        NationalIDText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NationalIDTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NationalIDTextFocusLost(evt);
            }
        });
        NationalIDText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NationalIDTextMousePressed(evt);
            }
        });
        NationalIDText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NationalIDTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NationalIDTextKeyTyped(evt);
            }
        });
        MainPannel.add(NationalIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 208, 400, -1));

        showpassword.setBackground(new java.awt.Color(255, 255, 255));
        showpassword.setForeground(new java.awt.Color(255, 255, 255));
        showpassword.setText("Show password");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        MainPannel.add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 300, -1, -1));

        MainLogo.setBackground(new java.awt.Color(0, 0, 0));
        MainLogo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        MainLogo.setForeground(new java.awt.Color(255, 255, 255));
        MainLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/HosLogo211.png"))); // NOI18N
        MainLogo.setText("KMCUBE ");
        MainLogo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/HosLogov1.png"))); // NOI18N
        MainLogo.setDoubleBuffered(true);
        MainLogo.setFocusCycleRoot(true);
        MainLogo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainLogoMouseDragged(evt);
            }
        });
        MainLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainLogoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainLogoMousePressed(evt);
            }
        });
        MainPannel.add(MainLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 130));

        Minimize.setBackground(new java.awt.Color(204, 204, 204));
        Minimize.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Minimize.setText("-");
        Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeActionPerformed(evt);
            }
        });
        MainPannel.add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 40, 40));

        exitbot.setBackground(new java.awt.Color(204, 204, 204));
        exitbot.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        exitbot.setText("x");
        exitbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbotActionPerformed(evt);
            }
        });
        MainPannel.add(exitbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 40, 40));

        OurTeam.setText("Our Team");
        OurTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OurTeamActionPerformed(evt);
            }
        });
        MainPannel.add(OurTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 100, 60));

        VersionDate.setBackground(new java.awt.Color(255, 255, 255));
        VersionDate.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        VersionDate.setForeground(new java.awt.Color(255, 255, 255));
        VersionDate.setText("2022-2023");
        MainPannel.add(VersionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jDesktopPane1.setLayer(MainPannel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        jDesktopPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorMoved

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorResized

    private void formCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_formCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formCaretPositionChanged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen()-positionX , evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jDesktopPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MousePressed
        // TODO add your handling code here:
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_jDesktopPane1MousePressed

    private void jDesktopPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen()-positionX , evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_jDesktopPane1MouseDragged

    private void exitbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbotActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbotActionPerformed

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

    private void MainLogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainLogoMousePressed
        // TODO add your handling code here:
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_MainLogoMousePressed

    private void MainLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainLogoMouseClicked
        // TODO add your handling code here:
        callus ot = new callus();
        ot.show();
        dispose();
    }//GEN-LAST:event_MainLogoMouseClicked

    private void MainLogoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainLogoMouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen()-positionX , evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_MainLogoMouseDragged

    private void showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordActionPerformed
        // TODO add your handling code here:
        if(showpassword.isSelected())
        PasswordText.setEchoChar((char)0);
        else
        PasswordText.setEchoChar(('*'));
    }//GEN-LAST:event_showpasswordActionPerformed

    private void NationalIDTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NationalIDTextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_NationalIDTextKeyTyped

    private void NationalIDTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NationalIDTextKeyPressed
        // TODO add your handling code here:
        int l = NationalIDText.getText().length();
        if(l < 14){
            NationalIDText.setEditable(true);

        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                NationalIDText.setEditable(true);
            }else{
                NationalIDText.setEditable(false);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_NationalIDTextKeyPressed
private String password;
    public void setadpass(String pass){
    this.password = pass;
}
    public String getpass(){
        return this.password;
    }
    private void NationalIDTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NationalIDTextMousePressed
        // TODO add your handling code here:
        if(NationalIDText.getText().equals("National ID"))
        NationalIDText.setText("");
    }//GEN-LAST:event_NationalIDTextMousePressed

    private void NationalIDTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NationalIDTextFocusLost
        // TODO add your handling code here:
        if("".equals(NationalIDText.getText())){
            NationalIDText.setText("National ID");
        }
    }//GEN-LAST:event_NationalIDTextFocusLost

    private void PasswordTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTextMousePressed
        // TODO add your handling code here:
        if(PasswordText.getText().equals("Password"))
        PasswordText.setText("");
    }//GEN-LAST:event_PasswordTextMousePressed

    private void PasswordTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordTextFocusLost
        // TODO add your handling code here:
        if("".equals(PasswordText.getText())){
            PasswordText.setText("Password");
        }
    }//GEN-LAST:event_PasswordTextFocusLost

    private void LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseClicked
        // TODO add your handling code here:
        rec_doc();
    }//GEN-LAST:event_LogInMouseClicked

    private void OurTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OurTeamActionPerformed
        // TODO add your handling code here:
        OurTeam TM = new OurTeam();
        TM.show();
        dispose();
    }//GEN-LAST:event_OurTeamActionPerformed

    private void MainPannelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPannelMouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen()-positionX , evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_MainPannelMouseDragged

    private void MainPannelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPannelMousePressed
        // TODO add your handling code here:
         positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_MainPannelMousePressed

    private void PasswordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
              rec_doc();
        }
    }//GEN-LAST:event_PasswordTextKeyPressed

    private void PasswordTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordTextFocusGained
        // TODO add your handling code here:
        if(PasswordText.getText().equals("Password"))
        PasswordText.setText("");
    }//GEN-LAST:event_PasswordTextFocusGained

    private void NationalIDTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NationalIDTextFocusGained
        // TODO add your handling code here:
        if("".equals(NationalIDText.getText())){
            NationalIDText.setText("National ID");
        }
    }//GEN-LAST:event_NationalIDTextFocusGained
  public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn;
    private javax.swing.JLabel MainLogo;
    private javax.swing.JPanel MainPannel;
    private javax.swing.JButton Minimize;
    private javax.swing.JTextField NationalIDText;
    private javax.swing.JButton OurTeam;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JLabel VersionDate;
    private javax.swing.JButton exitbot;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JCheckBox showpassword;
    // End of variables declaration//GEN-END:variables
}
