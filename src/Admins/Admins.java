package Admins;
import Admins.DataBase.Doctor;
import Admins.DataBase.Patient;
import Admins.DataBase.Pharmacy;
import Admins.DataBase.Rooms;
import Main.Main;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Admins extends javax.swing.JFrame {
    int px = 0;
    int py =0;
    public Admins() {
        initComponents();
        NIDtext_pat.setVisible(false);
        DeleteID.setEnabled(false);
        DeleteID1.setEnabled(false);
        DeleteID_pat.setEnabled(false);
        DeleteID_Rooms1.setEnabled(false);
        NIDtext_pat.setEnabled(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DocListTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        Delete_Doctors = new javax.swing.JButton();
        DeleteID = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        Update_Doctor = new javax.swing.JButton();
        Save_Doctor = new javax.swing.JButton();
        Specbox = new javax.swing.JComboBox<>();
        passtexts = new javax.swing.JTextField();
        IDTEXT = new javax.swing.JTextField();
        nidtexts = new javax.swing.JTextField();
        Nametext = new javax.swing.JTextField();
        avtext = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatListTable = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        PhoneText_pat = new javax.swing.JTextField();
        NIDtext_pat = new javax.swing.JTextField();
        GenderText_pat = new javax.swing.JTextField();
        AgeText_pat = new javax.swing.JTextField();
        Passtext_pat = new javax.swing.JTextField();
        NIDtext_pat_new = new javax.swing.JTextField();
        Nametext_pat = new javax.swing.JTextField();
        Save_Patient = new javax.swing.JButton();
        Update_Patient = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        Delete_Patient = new javax.swing.JButton();
        DeleteID_pat = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        RoomListTable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        DeleteID_Rooms = new javax.swing.JTextField();
        DeleteID_Rooms1 = new javax.swing.JTextField();
        Delete_Room = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        DeleteID_Rooms2 = new javax.swing.JTextField();
        Save_Rooms = new javax.swing.JButton();
        Update_Rooms = new javax.swing.JButton();
        Statebox = new javax.swing.JComboBox<>();
        Rn = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DocListTable1 = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        IDTEXT1 = new javax.swing.JTextField();
        Nametext1 = new javax.swing.JTextField();
        passtexts1 = new javax.swing.JTextField();
        Save_PharmDR = new javax.swing.JButton();
        Update_PharmDR = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        Delete_PharmDR = new javax.swing.JButton();
        DeleteID1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1024, 320));

        jPanel1.setBackground(new java.awt.Color(32, 53, 96));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 480));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(32, 53, 96));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel2.setPreferredSize(new java.awt.Dimension(870, 600));

        jPanel7.setBackground(new java.awt.Color(32, 53, 96));
        jPanel7.setPreferredSize(new java.awt.Dimension(599, 600));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocListTable.setAutoCreateRowSorter(true);
        DocListTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                "ID", "Name", "Password", "Specification", "NationalID", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 0, 550, 390));

        jPanel8.setBackground(new java.awt.Color(57, 84, 140));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Delete_Doctors.setText("Delete");
        Delete_Doctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_DoctorsMouseClicked(evt);
            }
        });
        Delete_Doctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_DoctorsActionPerformed(evt);
            }
        });
        jPanel8.add(Delete_Doctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 20, 70, 30));

        DeleteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteIDActionPerformed(evt);
            }
        });
        DeleteID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DeleteIDKeyTyped(evt);
            }
        });
        jPanel8.add(DeleteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, 30));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 170, 70));

        jPanel19.setBackground(new java.awt.Color(57, 84, 140));
        jPanel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Update_Doctor.setText("Update");
        Update_Doctor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Update_DoctorFocusLost(evt);
            }
        });
        Update_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_DoctorActionPerformed(evt);
            }
        });
        jPanel19.add(Update_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 40));

        Save_Doctor.setText("Save");
        Save_Doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save_DoctorMouseClicked(evt);
            }
        });
        Save_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_DoctorActionPerformed(evt);
            }
        });
        jPanel19.add(Save_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 40));

        Specbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Specification", "General Surgery\t", "Internal Medicine", "Family Medicine/General Practice", "Pediatrics", "Obstetrics and Gynecology", "Psychiatry", "Radiology and Diagnostic Radiology", "Cardiovascular Disease", "Orthopedic Surgery", "Ophthalmology", "Hematology and Oncology", "Neurology", "Dermatology" }));
        jPanel19.add(Specbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, 30));

        passtexts.setText("Password");
        passtexts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passtextsFocusLost(evt);
            }
        });
        passtexts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passtextsMouseClicked(evt);
            }
        });
        passtexts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtextsActionPerformed(evt);
            }
        });
        passtexts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passtextsKeyTyped(evt);
            }
        });
        jPanel19.add(passtexts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, 30));

        IDTEXT.setText("ID");
        IDTEXT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDTEXTFocusLost(evt);
            }
        });
        IDTEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDTEXTMouseClicked(evt);
            }
        });
        IDTEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTEXTActionPerformed(evt);
            }
        });
        IDTEXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDTEXTKeyTyped(evt);
            }
        });
        jPanel19.add(IDTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        nidtexts.setText("National ID");
        nidtexts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nidtextsFocusLost(evt);
            }
        });
        nidtexts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nidtextsMouseClicked(evt);
            }
        });
        nidtexts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidtextsActionPerformed(evt);
            }
        });
        nidtexts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nidtextsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nidtextsKeyTyped(evt);
            }
        });
        jPanel19.add(nidtexts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, 30));

        Nametext.setText("Name");
        Nametext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NametextFocusLost(evt);
            }
        });
        Nametext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NametextMouseClicked(evt);
            }
        });
        Nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametextActionPerformed(evt);
            }
        });
        Nametext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NametextKeyTyped(evt);
            }
        });
        jPanel19.add(Nametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, 30));

        avtext.setText("Available");
        avtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                avtextFocusLost(evt);
            }
        });
        avtext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avtextMouseClicked(evt);
            }
        });
        avtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avtextActionPerformed(evt);
            }
        });
        avtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                avtextKeyTyped(evt);
            }
        });
        jPanel19.add(avtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 30));

        jPanel7.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 290));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add A Doctor", jPanel2);

        jPanel5.setBackground(new java.awt.Color(32, 53, 96));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatListTable.setAutoCreateRowSorter(true);
        PatListTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PatListTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Name", "National ID", "Password", "Age", "Phone number", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PatListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatListTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PatListTable);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 550, 380));

        jPanel18.setBackground(new java.awt.Color(57, 84, 140));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PhoneText_pat.setText("Phone Number");
        PhoneText_pat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PhoneText_patFocusLost(evt);
            }
        });
        PhoneText_pat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhoneText_patMouseClicked(evt);
            }
        });
        PhoneText_pat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneText_patKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneText_patKeyTyped(evt);
            }
        });
        jPanel18.add(PhoneText_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        NIDtext_pat.setText("National ID");
        NIDtext_pat.setEnabled(false);
        NIDtext_pat.setFocusable(false);
        NIDtext_pat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NIDtext_patFocusLost(evt);
            }
        });
        NIDtext_pat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NIDtext_patMouseClicked(evt);
            }
        });
        NIDtext_pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIDtext_patActionPerformed(evt);
            }
        });
        NIDtext_pat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NIDtext_patKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIDtext_patKeyTyped(evt);
            }
        });
        jPanel18.add(NIDtext_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        GenderText_pat.setText("Gender");
        GenderText_pat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                GenderText_patFocusLost(evt);
            }
        });
        GenderText_pat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenderText_patMouseClicked(evt);
            }
        });
        GenderText_pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderText_patActionPerformed(evt);
            }
        });
        GenderText_pat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GenderText_patKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GenderText_patKeyTyped(evt);
            }
        });
        jPanel18.add(GenderText_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 60, 30));

        AgeText_pat.setText("Age");
        AgeText_pat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AgeText_patFocusLost(evt);
            }
        });
        AgeText_pat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgeText_patMouseClicked(evt);
            }
        });
        AgeText_pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeText_patActionPerformed(evt);
            }
        });
        AgeText_pat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeText_patKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AgeText_patKeyTyped(evt);
            }
        });
        jPanel18.add(AgeText_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 60, 30));

        Passtext_pat.setText("Password");
        Passtext_pat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Passtext_patFocusLost(evt);
            }
        });
        Passtext_pat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Passtext_patMouseClicked(evt);
            }
        });
        jPanel18.add(Passtext_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, 30));

        NIDtext_pat_new.setText("National ID");
        NIDtext_pat_new.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NIDtext_pat_newFocusLost(evt);
            }
        });
        NIDtext_pat_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NIDtext_pat_newMouseClicked(evt);
            }
        });
        NIDtext_pat_new.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NIDtext_pat_newKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIDtext_pat_newKeyTyped(evt);
            }
        });
        jPanel18.add(NIDtext_pat_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 30));

        Nametext_pat.setText("Name");
        Nametext_pat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Nametext_patFocusLost(evt);
            }
        });
        Nametext_pat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nametext_patMouseClicked(evt);
            }
        });
        Nametext_pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nametext_patActionPerformed(evt);
            }
        });
        Nametext_pat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nametext_patKeyTyped(evt);
            }
        });
        jPanel18.add(Nametext_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 30));

        Save_Patient.setText("Save");
        Save_Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_PatientActionPerformed(evt);
            }
        });
        jPanel18.add(Save_Patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, 40));

        Update_Patient.setText("Update");
        Update_Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_PatientActionPerformed(evt);
            }
        });
        jPanel18.add(Update_Patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 70, 40));

        jPanel5.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 280));

        jPanel10.setBackground(new java.awt.Color(57, 84, 140));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Delete_Patient.setText("Delete");
        Delete_Patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_PatientMouseClicked(evt);
            }
        });
        Delete_Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_PatientActionPerformed(evt);
            }
        });
        jPanel10.add(Delete_Patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));
        jPanel10.add(DeleteID_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, 30));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 170, 70));

        jTabbedPane1.addTab("Edit A Patient", jPanel5);

        jPanel6.setBackground(new java.awt.Color(32, 53, 96));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoomListTable.setAutoCreateRowSorter(true);
        RoomListTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RoomListTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null}
            },
            new String [] {
                "Room Number", "Status "
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
        RoomListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomListTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RoomListTable);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 0, 560, 380));

        jPanel11.setBackground(new java.awt.Color(57, 84, 140));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Delete");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 79, -1));

        DeleteID_Rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteID_RoomsActionPerformed(evt);
            }
        });
        jPanel11.add(DeleteID_Rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 50, 30));

        DeleteID_Rooms1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteID_Rooms1ActionPerformed(evt);
            }
        });
        jPanel11.add(DeleteID_Rooms1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, 30));

        Delete_Room.setText("Delete");
        Delete_Room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_RoomMouseClicked(evt);
            }
        });
        Delete_Room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_RoomActionPerformed(evt);
            }
        });
        jPanel11.add(Delete_Room, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 170, 70));

        jPanel17.setBackground(new java.awt.Color(57, 84, 140));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("Delete");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 79, -1));

        DeleteID_Rooms2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteID_Rooms2ActionPerformed(evt);
            }
        });
        jPanel17.add(DeleteID_Rooms2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 50, 30));

        Save_Rooms.setText("Save");
        Save_Rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_RoomsActionPerformed(evt);
            }
        });
        jPanel17.add(Save_Rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, 40));

        Update_Rooms.setText("Update");
        Update_Rooms.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Update_RoomsFocusLost(evt);
            }
        });
        Update_Rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_RoomsActionPerformed(evt);
            }
        });
        jPanel17.add(Update_Rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 70, 40));

        Statebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A State", "Free", "Full" }));
        Statebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateboxActionPerformed(evt);
            }
        });
        jPanel17.add(Statebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 30));

        Rn.setText("Room Number");
        Rn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RnFocusLost(evt);
            }
        });
        Rn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RnMouseClicked(evt);
            }
        });
        jPanel17.add(Rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 30));

        jPanel6.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 210));

        jTabbedPane1.addTab("Add A Room", jPanel6);

        jPanel3.setBackground(new java.awt.Color(32, 53, 96));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocListTable1.setAutoCreateRowSorter(true);
        DocListTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DocListTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DrID", "DrName", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DocListTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocListTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(DocListTable1);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 0, 550, 380));

        jPanel20.setBackground(new java.awt.Color(57, 84, 140));
        jPanel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDTEXT1.setText("ID");
        IDTEXT1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDTEXT1FocusLost(evt);
            }
        });
        IDTEXT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDTEXT1MouseClicked(evt);
            }
        });
        IDTEXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTEXT1ActionPerformed(evt);
            }
        });
        IDTEXT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDTEXT1KeyTyped(evt);
            }
        });
        jPanel20.add(IDTEXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        Nametext1.setText("Name");
        Nametext1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Nametext1FocusLost(evt);
            }
        });
        Nametext1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nametext1MouseClicked(evt);
            }
        });
        Nametext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nametext1ActionPerformed(evt);
            }
        });
        Nametext1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nametext1KeyTyped(evt);
            }
        });
        jPanel20.add(Nametext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 30));

        passtexts1.setText("Password");
        passtexts1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passtexts1FocusLost(evt);
            }
        });
        passtexts1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passtexts1MouseClicked(evt);
            }
        });
        passtexts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtexts1ActionPerformed(evt);
            }
        });
        passtexts1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passtexts1KeyTyped(evt);
            }
        });
        jPanel20.add(passtexts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 30));

        Save_PharmDR.setText("Save");
        Save_PharmDR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save_PharmDRMouseClicked(evt);
            }
        });
        Save_PharmDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_PharmDRActionPerformed(evt);
            }
        });
        jPanel20.add(Save_PharmDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, 40));

        Update_PharmDR.setText("Update");
        Update_PharmDR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Update_PharmDRFocusLost(evt);
            }
        });
        Update_PharmDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_PharmDRActionPerformed(evt);
            }
        });
        jPanel20.add(Update_PharmDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 80, 40));

        jPanel3.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 270));

        jPanel12.setBackground(new java.awt.Color(57, 84, 140));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Delete_PharmDR.setText("Delete");
        Delete_PharmDR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_PharmDRMouseClicked(evt);
            }
        });
        Delete_PharmDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_PharmDRActionPerformed(evt);
            }
        });
        jPanel12.add(Delete_PharmDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));

        DeleteID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteID1ActionPerformed(evt);
            }
        });
        DeleteID1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DeleteID1KeyTyped(evt);
            }
        });
        jPanel12.add(DeleteID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, 30));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 180, 70));

        jTabbedPane1.addTab("Add PharmDr", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 860, 440));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/hoho .png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 110));

        jPanel13.setBackground(new java.awt.Color(66, 66, 66));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(153, 0, 51));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admins");
        jPanel13.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 50));

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("          LogOut");
        jLabel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel6FocusGained(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel16.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 90, 40));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 130, 40));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("     LogOut");
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel15.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 410, 130, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 530));

        jButton1.setText("x");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 40, 40));

        jButton2.setText("-");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 40, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DeleteIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteIDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_DeleteIDKeyTyped

    private void Delete_DoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_DoctorsMouseClicked
        // TODO add your handling code here:
        if(DeleteID.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Select a user to delete");
        }
        else{
           Doctor in = new Doctor(DeleteID.getText(),"","","","","", "Delete",DocListTable);
            DeleteID.setText("");
        }
    }//GEN-LAST:event_Delete_DoctorsMouseClicked

    private void Save_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_DoctorActionPerformed
        // TODO add your handling code here:
        String select = Specbox.getSelectedItem().toString();
        if(IDTEXT.getText().equals("")||IDTEXT.getText().equals("ID")||Nametext.getText().equals("")||Nametext.getText().equals("Name")||nidtexts.getText().equals("")||nidtexts.getText().equals("Password")||select.equals("Select Specification")||passtexts.getText().equals("")||passtexts.getText().equals("National ID")||avtext.getText().equals("")||avtext.getText().equals("Availible")){
        JOptionPane.showMessageDialog(null,"Error Cannot Add This Data Please Enter Correct Data");
        }else{
        Doctor in = new Doctor(IDTEXT.getText(),Nametext.getText(),nidtexts.getText(),passtexts.getText(),avtext.getText(),select , "Insert",DocListTable);
        }
    }//GEN-LAST:event_Save_DoctorActionPerformed

    private void IDTEXTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTEXTKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE )||c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_IDTEXTKeyTyped

    private void IDTEXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDTEXTMouseClicked
        // TODO add your handling code here:
        if(IDTEXT.getText().equals("ID")){
            IDTEXT.setText("");
        }
    }//GEN-LAST:event_IDTEXTMouseClicked

    private void IDTEXTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDTEXTFocusLost
        // TODO add your handling code here:
        if(IDTEXT.getText().equals("")){
            IDTEXT.setText("ID");
        }
    }//GEN-LAST:event_IDTEXTFocusLost

    private void DocListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocListTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)DocListTable.getModel();
        int SelectedRows = DocListTable.getSelectedRow();
        IDTEXT  . setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        Nametext. setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        nidtexts . setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        passtexts. setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        DeleteID.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        avtext.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
    }//GEN-LAST:event_DocListTableMouseClicked

    private void avtextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_avtextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_avtextKeyTyped

    private void avtextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avtextMouseClicked
        // TODO add your handling code here:
        if(avtext.getText().equals("Available")){
            avtext.setText("");
        }
    }//GEN-LAST:event_avtextMouseClicked

    private void avtextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_avtextFocusLost
        // TODO add your handling code here:
        if(avtext.getText().equals("")){
            avtext.setText("Available");
        }
    }//GEN-LAST:event_avtextFocusLost

    private void passtextsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtextsKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
    }//GEN-LAST:event_passtextsKeyTyped

    private void passtextsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtextsMouseClicked
        // TODO add your handling code here:
        if(passtexts.getText().equals("Password")){
            passtexts.setText("");
        }
    }//GEN-LAST:event_passtextsMouseClicked

    private void passtextsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passtextsFocusLost
        // TODO add your handling code here:
        if(passtexts.getText().equals("")){
            passtexts.setText("Password");
        }
    }//GEN-LAST:event_passtextsFocusLost

    private void nidtextsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nidtextsKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE )||c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nidtextsKeyTyped

    private void nidtextsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nidtextsKeyPressed
        // TODO add your handling code here:
        int l = nidtexts.getText().length();
        if(l < 14){
            nidtexts.setEditable(true);

        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                nidtexts.setEditable(true);
            }else{
                nidtexts.setEditable(false);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_nidtextsKeyPressed

    private void nidtextsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidtextsMouseClicked
        // TODO add your handling code here:
        if(nidtexts.getText().equals("National ID")){
            nidtexts.setText("");
        }
    }//GEN-LAST:event_nidtextsMouseClicked

    private void nidtextsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nidtextsFocusLost
        // TODO add your handling code here:
        if(nidtexts.getText().equals("")){
            nidtexts.setText("National ID");
        }
    }//GEN-LAST:event_nidtextsFocusLost

    private void NametextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NametextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_NametextKeyTyped

    private void NametextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NametextMouseClicked
        // TODO add your handling code here:
        if(Nametext.getText().equals("Name")){
            Nametext.setText("");
        }
    }//GEN-LAST:event_NametextMouseClicked

    private void NametextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NametextFocusLost
        // TODO add your handling code here:
        if(Nametext.getText().equals("")){
            Nametext.setText("Name");
        }
    }//GEN-LAST:event_NametextFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Main m = new Main();
        m.show();
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Update_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_DoctorActionPerformed
        String select = Specbox.getSelectedItem().toString();
        if(IDTEXT.getText().equals("")||IDTEXT.getText().equals("ID")||Nametext.getText().equals("")||Nametext.getText().equals("Name")||nidtexts.getText().equals("")||nidtexts.getText().equals("Password")||select.equals("Select Specification")||passtexts.getText().equals("")||passtexts.getText().equals("National ID")||avtext.getText().equals("")||avtext.getText().equals("Availible")){
        JOptionPane.showMessageDialog(null,"Cannot Update While Some Data is Not Correct Or Empty");
        }else{
        if("".equals(DeleteID.getText())){
         JOptionPane.showMessageDialog(null,"Please Select A Doctor From Table To Update");
        }else if(!"".equals(DeleteID.getText())){
        Doctor in = new Doctor(IDTEXT.getText(),Nametext.getText(),nidtexts.getText(),passtexts.getText(),avtext.getText(),select , "Update",DocListTable);
        }    
        }

    }//GEN-LAST:event_Update_DoctorActionPerformed

    private void Nametext_patFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nametext_patFocusLost
        // TODO add your handling code here:
        if(Nametext_pat.getText().equals(""))
        Nametext_pat.setText("Name");
    }//GEN-LAST:event_Nametext_patFocusLost

    private void Nametext_patMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nametext_patMouseClicked
        // TODO add your handling code here:
        if(Nametext_pat.getText().equals("Name")){
            Nametext_pat.setText("");
        }
    }//GEN-LAST:event_Nametext_patMouseClicked

    private void Nametext_patKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nametext_patKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isAlphabetic(c)|| (c == KeyEvent.VK_BACK_SPACE )||c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_Nametext_patKeyTyped

    private void AgeText_patFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AgeText_patFocusLost
        // TODO add your handling code here:
        if(AgeText_pat.getText().equals(""))
        AgeText_pat.setText("Age");
    }//GEN-LAST:event_AgeText_patFocusLost

    private void AgeText_patMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeText_patMouseClicked
        // TODO add your handling code here:
        if(AgeText_pat.getText().equals("Age")){
            AgeText_pat.setText("");
        }
    }//GEN-LAST:event_AgeText_patMouseClicked

    private void AgeText_patKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeText_patKeyPressed
        // TODO add your handling code here:
        int l = AgeText_pat.getText().length();
        if(l < 3){
            AgeText_pat.setEditable(true);

        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                AgeText_pat.setEditable(true);
            }else{
                AgeText_pat.setEditable(false);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_AgeText_patKeyPressed

    private void AgeText_patKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeText_patKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE )||c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_AgeText_patKeyTyped

    private void GenderText_patFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenderText_patFocusLost
        // TODO add your handling code here:
        if(GenderText_pat.getText().equals("")){
            GenderText_pat.setText("Gender");
        }
    }//GEN-LAST:event_GenderText_patFocusLost

    private void GenderText_patMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenderText_patMouseClicked
        // TODO add your handling code here:
        if(GenderText_pat.getText().equals("Gender")){
            GenderText_pat.setText("");
        }
    }//GEN-LAST:event_GenderText_patMouseClicked

    private void GenderText_patKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenderText_patKeyPressed
        // TODO add your handling code here:
        int l = GenderText_pat.getText().length();
        if(l < 6){
            GenderText_pat.setEditable(true);

        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                GenderText_pat.setEditable(true);
            }else{
                GenderText_pat.setEditable(false);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_GenderText_patKeyPressed

    private void GenderText_patKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenderText_patKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isAlphabetic(c)|| (c == KeyEvent.VK_BACK_SPACE )||c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_GenderText_patKeyTyped

    private void NIDtext_patFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NIDtext_patFocusLost

    }//GEN-LAST:event_NIDtext_patFocusLost

    private void NIDtext_patMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NIDtext_patMouseClicked

    }//GEN-LAST:event_NIDtext_patMouseClicked

    private void NIDtext_patKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIDtext_patKeyPressed
        // TODO add your handling code here:
        int l = NIDtext_pat.getText().length();
        if(l < 14){
            NIDtext_pat.setEditable(true);

        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                NIDtext_pat.setEditable(true);
            }else{
                NIDtext_pat.setEditable(false);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_NIDtext_patKeyPressed

    private void Passtext_patFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Passtext_patFocusLost
        // TODO add your handling code here:
        if(Passtext_pat.getText().equals("")){
            Passtext_pat.setText("Password");
        }
    }//GEN-LAST:event_Passtext_patFocusLost

    private void Passtext_patMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Passtext_patMouseClicked
        // TODO add your handling code here:
        if(Passtext_pat.getText().equals("Password")){
            Passtext_pat.setText("");
        }
    }//GEN-LAST:event_Passtext_patMouseClicked

    private void PhoneText_patFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneText_patFocusLost
        // TODO add your handling code here:
        if(PhoneText_pat.getText().equals("")){
            PhoneText_pat.setText("Phone Number");
        }
    }//GEN-LAST:event_PhoneText_patFocusLost

    private void PhoneText_patMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneText_patMouseClicked
        // TODO add your handling code here:
        if(PhoneText_pat.getText().equals("Phone Number")){
            PhoneText_pat.setText("");
        }
    }//GEN-LAST:event_PhoneText_patMouseClicked

    private void PhoneText_patKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneText_patKeyPressed
        // TODO add your handling code here:
        int l = PhoneText_pat.getText().length();
        if(l < 11){
            PhoneText_pat.setEditable(true);

        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                PhoneText_pat.setEditable(true);
            }else{
                PhoneText_pat.setEditable(false);
                getToolkit().beep();
            }
        }
    }//GEN-LAST:event_PhoneText_patKeyPressed

    private void PhoneText_patKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneText_patKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE )||c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_PhoneText_patKeyTyped

    private void Save_PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_PatientActionPerformed
      if(PatListTable.equals("")||NIDtext_pat.getText().equals("")||Nametext_pat.getText().equals("")||Passtext_pat.getText().equals("")||PhoneText_pat.getText().equals("")||GenderText_pat.getText().equals("")|| AgeText_pat.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Please Enter Vaild Data");
      }
      else{
        Patient pt = new Patient(NIDtext_pat_new.getText(),Nametext_pat.getText(),Passtext_pat.getText(),PhoneText_pat.getText(),GenderText_pat.getText(), AgeText_pat.getText(),PatListTable,"Insert");      
      }
        
    }//GEN-LAST:event_Save_PatientActionPerformed

    private void Delete_PatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_PatientMouseClicked
        // TODO add your handling code here:
        if(DeleteID_pat.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please Select a user to delete");
        }
        else{
            Patient pt = new Patient(DeleteID_pat.getText(),Nametext_pat.getText(),Passtext_pat.getText(),PhoneText_pat.getText(),GenderText_pat.getText(), AgeText_pat.getText(),PatListTable,"Delete"); 
        }

    }//GEN-LAST:event_Delete_PatientMouseClicked

    private void Delete_PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_PatientActionPerformed
        // TODO add your handling code here:
        if(DeleteID_pat.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please Select a user to delete");
        }
        else{
            Patient pt = new Patient(DeleteID_pat.getText(),Nametext_pat.getText(),Passtext_pat.getText(),PhoneText_pat.getText(),GenderText_pat.getText(), AgeText_pat.getText(),PatListTable,"Delete"); 
             DeleteID_pat.setText("");
        }
    }//GEN-LAST:event_Delete_PatientActionPerformed

    private void PatListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatListTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)PatListTable.getModel();
        int SelectedRows = PatListTable.getSelectedRow();
        Nametext_pat. setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        Passtext_pat . setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        NIDtext_pat. setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        AgeText_pat . setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        PhoneText_pat . setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        GenderText_pat. setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        DeleteID_pat.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
    }//GEN-LAST:event_PatListTableMouseClicked

    private void Update_PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_PatientActionPerformed
        // TODO add your handling code here:
        if(Nametext_pat.getText().equals("")||Nametext_pat.getText().equals("Name")||NIDtext_pat.getText().equals("")||NIDtext_pat.getText().equals("National ID")||AgeText_pat.getText().equals("")||AgeText_pat.getText().equals("Age")||Passtext_pat.getText().equals("")||Passtext_pat.getText().equals("Password")||PhoneText_pat.getText().equals("")||PhoneText_pat.getText().equals("Phone Number")){
        JOptionPane.showMessageDialog(null,"Cannot Update While Some Data is Not Correct Or Empty");
        }else{
         Patient pt = new Patient(NIDtext_pat_new.getText(),Nametext_pat.getText(),Passtext_pat.getText(),PhoneText_pat.getText(),GenderText_pat.getText(), AgeText_pat.getText(),PatListTable,"Update");      
        }
        
    }//GEN-LAST:event_Update_PatientActionPerformed

    private void Save_RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_RoomsActionPerformed
      String select = Statebox.getSelectedItem().toString();
        if(Rn.getText().equals("")||select.equals("Select A State")){
           JOptionPane.showMessageDialog(null,"Please Enter Correct Data"); 
        }else{
           Rooms RM = new Rooms(Rn.getText() , select , "Insert" , RoomListTable);
        }     
    }//GEN-LAST:event_Save_RoomsActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked

    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void DeleteID_RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteID_RoomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteID_RoomsActionPerformed

    private void RoomListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomListTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)RoomListTable.getModel();
        int SelectedRows = RoomListTable.getSelectedRow();
        Rn  . setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        DeleteID_Rooms1.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
    }//GEN-LAST:event_RoomListTableMouseClicked

    private void StateboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateboxActionPerformed
 
    private void Update_RoomsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Update_RoomsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Update_RoomsFocusLost

    private void Update_RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_RoomsActionPerformed
      String select = Statebox.getSelectedItem().toString();
        if(Rn.getText().equals("")||Rn.getText().equals("Room Number")|| select.equals("Select A State")){
        JOptionPane.showMessageDialog(null,"Cannot Update While Some Data is Not Correct Or Empty");
        }else{
         Rooms RM = new Rooms(Rn.getText() , select , "Update" , RoomListTable);
        } 
    }//GEN-LAST:event_Update_RoomsActionPerformed

    private void RnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RnFocusLost
        // TODO add your handling code here:
        if(Rn.getText().equals("")){
            Rn.setText("Room Number");
        }
    }//GEN-LAST:event_RnFocusLost

    private void RnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RnMouseClicked
       if(Rn.getText().equals("Room Number")){
            Rn.setText("");
        }
    }//GEN-LAST:event_RnMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        px = evt.getX();
        py = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen()-px , evt.getYOnScreen()-py);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void IDTEXT1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDTEXT1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTEXT1FocusLost

    private void IDTEXT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDTEXT1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTEXT1MouseClicked

    private void IDTEXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTEXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTEXT1ActionPerformed

    private void IDTEXT1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTEXT1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTEXT1KeyTyped

    private void Nametext1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nametext1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Nametext1FocusLost

    private void Nametext1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nametext1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Nametext1MouseClicked

    private void Nametext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nametext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nametext1ActionPerformed

    private void Nametext1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nametext1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Nametext1KeyTyped

    private void passtexts1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passtexts1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_passtexts1FocusLost

    private void passtexts1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtexts1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_passtexts1MouseClicked

    private void passtexts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtexts1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtexts1ActionPerformed

    private void passtexts1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtexts1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_passtexts1KeyTyped

    private void Save_PharmDRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_PharmDRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Save_PharmDRMouseClicked

    private void Save_PharmDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_PharmDRActionPerformed
        // TODO add your handling code here:
       Pharmacy ph = new Pharmacy(IDTEXT1.getText(),Nametext1.getText(),passtexts1.getText(),"Insert",DocListTable1);
    }//GEN-LAST:event_Save_PharmDRActionPerformed

    private void Update_PharmDRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Update_PharmDRFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Update_PharmDRFocusLost

    private void Update_PharmDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_PharmDRActionPerformed
 Pharmacy ph = new Pharmacy(IDTEXT1.getText(),Nametext1.getText(),passtexts1.getText(),"Update",DocListTable1);
    }//GEN-LAST:event_Update_PharmDRActionPerformed

    private void DocListTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocListTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)DocListTable1.getModel();
        int SelectedRows = DocListTable1.getSelectedRow();
        IDTEXT1. setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        Nametext1 . setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        passtexts1. setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        DeleteID1.setText(RecordTable.getValueAt(SelectedRows, 0).toString());    
    }//GEN-LAST:event_DocListTable1MouseClicked

    private void Delete_PharmDRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_PharmDRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete_PharmDRMouseClicked

    private void Delete_PharmDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_PharmDRActionPerformed
  Pharmacy ph = new Pharmacy(DeleteID1.getText(),"","","Delete",DocListTable1);
   DeleteID1.setText("");
    }//GEN-LAST:event_Delete_PharmDRActionPerformed

    private void DeleteID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteID1ActionPerformed

    private void DeleteID1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteID1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteID1KeyTyped

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel1FocusGained

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
   jLabel1.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
    jLabel1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void NIDtext_pat_newFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NIDtext_pat_newFocusLost
       if(NIDtext_pat_new.getText().equals("")){
            NIDtext_pat_new.setText("National ID");
        }
    }//GEN-LAST:event_NIDtext_pat_newFocusLost

    private void NIDtext_pat_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NIDtext_pat_newMouseClicked
       if(NIDtext_pat_new.getText().equals("National ID")){
            NIDtext_pat_new.setText("");
        }
    }//GEN-LAST:event_NIDtext_pat_newMouseClicked

    private void NIDtext_pat_newKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIDtext_pat_newKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIDtext_pat_newKeyPressed

    private void NIDtext_pat_newKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIDtext_pat_newKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_NIDtext_pat_newKeyTyped

    private void GenderText_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderText_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderText_patActionPerformed

    private void NIDtext_patKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIDtext_patKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_NIDtext_patKeyTyped

    private void NIDtext_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIDtext_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIDtext_patActionPerformed

    private void AgeText_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeText_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeText_patActionPerformed

    private void Nametext_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nametext_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nametext_patActionPerformed

    private void Update_DoctorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Update_DoctorFocusLost

    }//GEN-LAST:event_Update_DoctorFocusLost

    private void NametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NametextActionPerformed

    private void nidtextsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidtextsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidtextsActionPerformed

    private void passtextsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtextsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtextsActionPerformed

    private void avtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avtextActionPerformed

    private void IDTEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTEXTActionPerformed

    private void Save_DoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_DoctorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Save_DoctorMouseClicked

    private void DeleteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteIDActionPerformed

    private void jLabel6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6FocusGained

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void DeleteID_Rooms2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteID_Rooms2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteID_Rooms2ActionPerformed

    private void Delete_RoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_RoomActionPerformed
        // TODO add your handling code here:
        if(DeleteID_Rooms1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Select a Room to Delete");
        }
        else{
             Rooms RM = new Rooms(DeleteID_Rooms1.getText() ,"", "Delete" , RoomListTable);
             DeleteID_Rooms1.setText("");
        }
    }//GEN-LAST:event_Delete_RoomActionPerformed

    private void Delete_RoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_RoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete_RoomMouseClicked

    private void DeleteID_Rooms1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteID_Rooms1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteID_Rooms1ActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseReleased

    private void Delete_DoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_DoctorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete_DoctorsActionPerformed
  public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admins().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeText_pat;
    private javax.swing.JTextField DeleteID;
    private javax.swing.JTextField DeleteID1;
    private javax.swing.JTextField DeleteID_Rooms;
    private javax.swing.JTextField DeleteID_Rooms1;
    private javax.swing.JTextField DeleteID_Rooms2;
    private javax.swing.JTextField DeleteID_pat;
    private javax.swing.JButton Delete_Doctors;
    private javax.swing.JButton Delete_Patient;
    private javax.swing.JButton Delete_PharmDR;
    private javax.swing.JButton Delete_Room;
    private javax.swing.JTable DocListTable;
    private javax.swing.JTable DocListTable1;
    private javax.swing.JTextField GenderText_pat;
    private javax.swing.JTextField IDTEXT;
    private javax.swing.JTextField IDTEXT1;
    private javax.swing.JTextField NIDtext_pat;
    private javax.swing.JTextField NIDtext_pat_new;
    private javax.swing.JTextField Nametext;
    private javax.swing.JTextField Nametext1;
    private javax.swing.JTextField Nametext_pat;
    private javax.swing.JTextField Passtext_pat;
    private javax.swing.JTable PatListTable;
    private javax.swing.JTextField PhoneText_pat;
    private javax.swing.JTextField Rn;
    private javax.swing.JTable RoomListTable;
    private javax.swing.JButton Save_Doctor;
    private javax.swing.JButton Save_Patient;
    private javax.swing.JButton Save_PharmDR;
    private javax.swing.JButton Save_Rooms;
    private javax.swing.JComboBox<String> Specbox;
    private javax.swing.JComboBox<String> Statebox;
    private javax.swing.JButton Update_Doctor;
    private javax.swing.JButton Update_Patient;
    private javax.swing.JButton Update_PharmDR;
    private javax.swing.JButton Update_Rooms;
    private javax.swing.JTextField avtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nidtexts;
    private javax.swing.JTextField passtexts;
    private javax.swing.JTextField passtexts1;
    // End of variables declaration//GEN-END:variables
}