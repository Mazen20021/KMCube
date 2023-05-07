package Reception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Main.Config;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
public class SignUp extends javax.swing.JFrame {
    private boolean JCheckBox;
    Connection con ;
    ResultSet rs = null;
    PreparedStatement pa = null;
    public SignUp() {
        initComponents();
        con = Config.connectDB();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name_Sign = new javax.swing.JTextField();
        Age_Sign = new javax.swing.JTextField();
        Phone_Sign = new javax.swing.JTextField();
        Pass_Sign = new javax.swing.JPasswordField();
        NationalID = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        Signupbot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ConfirmPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        GenderBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setBounds(new java.awt.Rectangle(500, 500, 500, 500));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(20);
        setFocusCycleRoot(false);
        setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        setForeground(java.awt.Color.darkGray);
        setUndecorated(true);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name_Sign.setText("Name");
        Name_Sign.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Name_SignFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Name_SignFocusLost(evt);
            }
        });
        Name_Sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Name_SignMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Name_SignMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Name_SignMouseReleased(evt);
            }
        });
        Name_Sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_SignActionPerformed(evt);
            }
        });
        Name_Sign.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Name_SignPropertyChange(evt);
            }
        });
        getContentPane().add(Name_Sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, 30));

        Age_Sign.setText("Age");
        Age_Sign.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Age_SignFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Age_SignFocusLost(evt);
            }
        });
        Age_Sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Age_SignMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Age_SignMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Age_SignMouseReleased(evt);
            }
        });
        Age_Sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age_SignActionPerformed(evt);
            }
        });
        Age_Sign.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Age_SignKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Age_SignKeyTyped(evt);
            }
        });
        getContentPane().add(Age_Sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 40, 30));

        Phone_Sign.setText("Phone Number");
        Phone_Sign.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Phone_SignFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Phone_SignFocusLost(evt);
            }
        });
        Phone_Sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Phone_SignMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Phone_SignMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Phone_SignMouseReleased(evt);
            }
        });
        Phone_Sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Phone_SignActionPerformed(evt);
            }
        });
        Phone_Sign.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Phone_SignKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Phone_SignKeyTyped(evt);
            }
        });
        getContentPane().add(Phone_Sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 190, 30));

        Pass_Sign.setText("Password");
        Pass_Sign.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Pass_SignComponentAdded(evt);
            }
        });
        Pass_Sign.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pass_SignFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pass_SignFocusLost(evt);
            }
        });
        Pass_Sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pass_SignMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pass_SignMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Pass_SignMouseReleased(evt);
            }
        });
        Pass_Sign.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Pass_SignInputMethodTextChanged(evt);
            }
        });
        Pass_Sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pass_SignActionPerformed(evt);
            }
        });
        getContentPane().add(Pass_Sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 200, 30));

        NationalID.setText("National ID");
        NationalID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NationalIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NationalIDFocusLost(evt);
            }
        });
        NationalID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NationalIDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NationalIDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NationalIDMouseReleased(evt);
            }
        });
        NationalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalIDActionPerformed(evt);
            }
        });
        NationalID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NationalIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NationalIDKeyTyped(evt);
            }
        });
        getContentPane().add(NationalID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 200, 30));

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        Signupbot.setText("Sign Up");
        Signupbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupbotMouseClicked(evt);
            }
        });
        Signupbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupbotActionPerformed(evt);
            }
        });
        getContentPane().add(Signupbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("   Sign Up");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 57, 151, 54));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("x");
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
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        ConfirmPass.setText("Password");
        ConfirmPass.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ConfirmPassComponentAdded(evt);
            }
        });
        ConfirmPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ConfirmPassFocusLost(evt);
            }
        });
        ConfirmPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmPassMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConfirmPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ConfirmPassMouseReleased(evt);
            }
        });
        ConfirmPass.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ConfirmPassInputMethodTextChanged(evt);
            }
        });
        ConfirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPassActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 200, 30));

        jLabel3.setText("Confirmation Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        jCheckBox2.setText("Show Password");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 368, -1, 30));

        GenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose Gender--", "Male", "Female" }));
        getContentPane().add(GenderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Name_SignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_SignActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_Name_SignActionPerformed

    private void Phone_SignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phone_SignActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_Phone_SignActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SignupbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupbotActionPerformed

        
    }//GEN-LAST:event_SignupbotActionPerformed

    public void reg(){
    Book_Surgery ptf = new Book_Surgery();
    String n , id , p , a , pn;
     n  = Name_Sign.getText();
     id = NationalID.getText();
     p = Pass_Sign.getText();
     a = Age_Sign.getText();
     pn = Phone_Sign.getText();
     if(n.equals("") || id.equals("") || GenderBox.getSelectedItem().equals("--Choose Gender--") || p.equals("") || a.equals("") || pn.equals("")){
         JOptionPane.showMessageDialog(rootPane, "Error Missing information"); 
           }
           else{
           if(GenderBox.getSelectedItem().equals("Female")){
           try{
           String insert = "Insert into PatientData (Name ,NationalID , Password, Age , PhoneNumber,Gender)  values (?,?,?,?,?,?,?)";
           pa = con.prepareStatement(insert);
           pa.setString(1, Name_Sign.getText());
           pa.setString(2, NationalID.getText());
           pa.setString(3, Pass_Sign.getText());
           pa.setString(4, Age_Sign.getText());
           pa.setString(5, Phone_Sign.getText());
           pa.setString(6, "Female");
           pa.execute();
           JOptionPane.showMessageDialog(rootPane, "Welcome Mis: "+n);
           Reception rec=new Reception();
           rec.show();
           dispose();
       }
       catch(   HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
           }
           else if(GenderBox.getSelectedItem().equals("Male")){
                 try{
           String insert = "Insert into PatientData (Name ,NationalID , Password, Age , PhoneNumber , Gender)  values (?,?,?,?,?,?)";
           pa = con.prepareStatement(insert);
           pa.setString(1, Name_Sign.getText());
           pa.setString(2, NationalID.getText());
           pa.setString(3, Pass_Sign.getText());
           pa.setString(4, Age_Sign.getText());
           pa.setString(5, Phone_Sign.getText());
           pa.setString(6, "Male");
           pa.execute();
           JOptionPane.showMessageDialog(rootPane, "Welcome Sir: "+n);
            Reception rec=new Reception();
           rec.show();
           dispose();
       }
       catch(    HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
           }
        }
   
   
}
private int cn = 0;
public void resetcn(){
    this.cn = 0;
}
    private void Pass_SignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pass_SignActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Pass_SignActionPerformed

    private void Age_SignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age_SignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age_SignActionPerformed

    private void NationalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalIDActionPerformed
 int c = 10;
    private void SignupbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupbotMouseClicked
        // TODO add your handling code here:
         if(Pass_Sign.getText().length() < 8){
            JOptionPane.showInternalMessageDialog(null, "Error the password is smaller than 8 Characters", "error", HEIGHT);
        } 
         else if("".equals(ConfirmPass.getText())){
            JOptionPane.showInternalMessageDialog(null, "Error please enter the security password", "error", HEIGHT); 
         }
         else if(ConfirmPass.getText().equals("123456789admin_rec")){
             reg();
         }
         else{
             c--;
             JOptionPane.showInternalMessageDialog(null, "Error password not correct", "error", HEIGHT);
             if(c == 0){
            JOptionPane.showInternalMessageDialog(null, "You have exceeded the maximum number of atempts try again later", "error", HEIGHT);
            System.exit(0);
        }
         }
        
    }//GEN-LAST:event_SignupbotMouseClicked
int posx = 0;
int posy = 0;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        posx = evt.getX();
        posy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen()-posx,evt.getYOnScreen()-posy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        Pass_Sign.setEchoChar((char)0);
        else
           Pass_Sign.setEchoChar(('*')); 
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void Pass_SignInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Pass_SignInputMethodTextChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Pass_SignInputMethodTextChanged

    private void Pass_SignComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Pass_SignComponentAdded
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Pass_SignComponentAdded

    private void Phone_SignKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Phone_SignKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Phone_SignKeyTyped

    private void NationalIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NationalIDKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_NationalIDKeyTyped

    private void Age_SignKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Age_SignKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Age_SignKeyTyped

    private void Phone_SignKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Phone_SignKeyPressed
        // TODO add your handling code here:
        int l = Phone_Sign.getText().length();
        if(l < 11){
           Phone_Sign.setEditable(true);
          
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
            Phone_Sign.setEditable(true);
        }else{
               Phone_Sign.setEditable(false);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_Phone_SignKeyPressed

    private void NationalIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NationalIDKeyPressed
        // TODO add your handling code here:
        int l = NationalID.getText().length();
        if(l < 14){
           NationalID.setEditable(true);
           
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
            NationalID.setEditable(true);
        }else{
               NationalID.setEditable(false);
               getToolkit().beep();
            }
        }
    }//GEN-LAST:event_NationalIDKeyPressed

    private void Age_SignKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Age_SignKeyPressed
        // TODO add your handling code here:
         int l = Age_Sign.getText().length();
        if(l < 3){
           Age_Sign.setEditable(true);
           
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
            Age_Sign.setEditable(true);
        }else{
               Age_Sign.setEditable(false);
               getToolkit().beep();
            }
        }
    }//GEN-LAST:event_Age_SignKeyPressed

    private void ConfirmPassComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ConfirmPassComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPassComponentAdded

    private void ConfirmPassInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ConfirmPassInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPassInputMethodTextChanged

    private void ConfirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPassActionPerformed

    private void Phone_SignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Phone_SignMousePressed
        // TODO add your handling code here:
        if( Phone_Sign.getText().equals("Phone Number")){
             Phone_Sign.setText("");
        }
           
        
      
       
    }//GEN-LAST:event_Phone_SignMousePressed

    private void Age_SignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Age_SignMousePressed
        // TODO add your handling code here:
         if(Age_Sign.getText().equals("Age")){
        Age_Sign.setText("");
         }
    }//GEN-LAST:event_Age_SignMousePressed
  
  
       
   
    
    private void Name_SignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Name_SignMousePressed
        // TODO add your handling code here:
        if(Name_Sign.getText().equals("Name")){
             Name_Sign.setText("");
        }
      
   
    }//GEN-LAST:event_Name_SignMousePressed

    private void NationalIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NationalIDMousePressed
        // TODO add your handling code here:
       if(NationalID.getText().equals("National ID")){
            NationalID.setText("");
    
       }
        
    }//GEN-LAST:event_NationalIDMousePressed

    private void Pass_SignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pass_SignMousePressed
        // TODO add your handling code here:
      if(Pass_Sign.getText().equals("Password")){
           Pass_Sign.setText("");
      }
       
    }//GEN-LAST:event_Pass_SignMousePressed

    private void ConfirmPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmPassMousePressed
        // TODO add your handling code here:
        if(ConfirmPass.getText().equals("Password")){
           ConfirmPass.setText(""); 
        }
    }//GEN-LAST:event_ConfirmPassMousePressed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox2.isSelected())
        ConfirmPass.setEchoChar((char)0);
        else
           ConfirmPass.setEchoChar(('*'));                                      
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void Name_SignMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Name_SignMouseReleased

    }//GEN-LAST:event_Name_SignMouseReleased

    private void NationalIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NationalIDMouseReleased
     
    }//GEN-LAST:event_NationalIDMouseReleased

    private void Pass_SignMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pass_SignMouseReleased
     
    }//GEN-LAST:event_Pass_SignMouseReleased

    private void Age_SignMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Age_SignMouseReleased
    
    }//GEN-LAST:event_Age_SignMouseReleased

    private void Phone_SignMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Phone_SignMouseReleased
        
    }//GEN-LAST:event_Phone_SignMouseReleased

    private void ConfirmPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmPassMouseReleased
      
    }//GEN-LAST:event_ConfirmPassMouseReleased

    private void Name_SignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Name_SignMouseExited
        // TODO add your handling code here:
      
    }//GEN-LAST:event_Name_SignMouseExited

    private void NationalIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NationalIDMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_NationalIDMouseExited

    private void Pass_SignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pass_SignMouseExited
      
    }//GEN-LAST:event_Pass_SignMouseExited

    private void Age_SignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Age_SignMouseExited
        // TODO add your handling code here:
      
    }//GEN-LAST:event_Age_SignMouseExited

    private void Phone_SignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Phone_SignMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Phone_SignMouseExited

    private void ConfirmPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmPassMouseExited
        // TODO add your handling code here:
      
    }//GEN-LAST:event_ConfirmPassMouseExited

    private void Name_SignPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Name_SignPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Name_SignPropertyChange

    private void NationalIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NationalIDFocusLost
        // TODO add your handling code here:
        if(NationalID.getText().equals("")){
            NationalID.setText("National ID");
        }
    }//GEN-LAST:event_NationalIDFocusLost

    private void Name_SignFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Name_SignFocusLost
        // TODO add your handling code here:
        if(Name_Sign.getText().equals("")){
            Name_Sign.setText("Name");
        }
    }//GEN-LAST:event_Name_SignFocusLost

    private void Pass_SignFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass_SignFocusLost
        // TODO add your handling code here:
         if(Pass_Sign.getText().equals("")){
            Pass_Sign.setText("Password");
        }
    }//GEN-LAST:event_Pass_SignFocusLost

    private void Age_SignFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Age_SignFocusLost
        // TODO add your handling code here:
         if(Age_Sign.getText().equals("")){
            Age_Sign.setText("Age");
        }
    }//GEN-LAST:event_Age_SignFocusLost

    private void Phone_SignFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Phone_SignFocusLost
        // TODO add your handling code here:
         if(Phone_Sign.getText().equals("")){
            Phone_Sign.setText("Phone Number");
        }
    }//GEN-LAST:event_Phone_SignFocusLost

    private void ConfirmPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPassFocusLost
        // TODO add your handling code here:
         if(ConfirmPass.getText().equals("")){
            ConfirmPass.setText("Password");
        }
    }//GEN-LAST:event_ConfirmPassFocusLost

    private void Name_SignFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Name_SignFocusGained
        // TODO add your handling code here:
         if(Name_Sign.getText().equals("Name")){
             Name_Sign.setText("");
        }
        
    }//GEN-LAST:event_Name_SignFocusGained

    private void NationalIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NationalIDFocusGained
        // TODO add your handling code here:
         if(NationalID.getText().equals("National ID")){
            NationalID.setText("");
    
       }
    }//GEN-LAST:event_NationalIDFocusGained

    private void Age_SignFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Age_SignFocusGained
         if(Age_Sign.getText().equals("Age")){
        Age_Sign.setText("");
         }
    }//GEN-LAST:event_Age_SignFocusGained

    private void Phone_SignFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Phone_SignFocusGained
        // TODO add your handling code here:
          if( Phone_Sign.getText().equals("Phone Number")){
             Phone_Sign.setText("");
        }
    }//GEN-LAST:event_Phone_SignFocusGained

    private void Pass_SignFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass_SignFocusGained
        // TODO add your handling code here:
         if(Pass_Sign.getText().equals("Password")){
           Pass_Sign.setText("");
      }
       
    }//GEN-LAST:event_Pass_SignFocusGained
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age_Sign;
    private javax.swing.JPasswordField ConfirmPass;
    private javax.swing.JComboBox<String> GenderBox;
    private javax.swing.JTextField Name_Sign;
    private javax.swing.JTextField NationalID;
    private javax.swing.JPasswordField Pass_Sign;
    private javax.swing.JTextField Phone_Sign;
    private javax.swing.JButton Signupbot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void list(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
