package Admins;
import Main.Config;
import Main.Main;
import Doctors.doctor1;
import Managers.Managers;
import Reception.Reception;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Admins extends javax.swing.JFrame {
    Connection con ;
    ResultSet rss = null;
    PreparedStatement paa = null;
    PreparedStatement paad = null;
    public Admins() {
        initComponents();
        con = Config.connectDB();
        DeleteID.setEnabled(false);
        DeleteID1.setEnabled(false);
        DeleteID_pat.setEnabled(false);
        DeleteID_Rooms1.setEnabled(false);
        NIDtext_pat.setEnabled(false);
        importd_doc();
        importd_pat();
        importd_Rooms();
        importd_farm();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Nametext = new javax.swing.JTextField();
        nidtexts = new javax.swing.JTextField();
        passtexts = new javax.swing.JTextField();
        avtext = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DocListTable = new javax.swing.JTable();
        IDTEXT = new javax.swing.JTextField();
        VK_S = new javax.swing.JButton();
        Specbox = new javax.swing.JComboBox<>();
        Update = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        DeleteID = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Nametext_pat = new javax.swing.JTextField();
        AgeText_pat = new javax.swing.JTextField();
        GenderText_pat = new javax.swing.JTextField();
        NIDtext_pat = new javax.swing.JTextField();
        Passtext_pat = new javax.swing.JTextField();
        PhoneText_pat = new javax.swing.JTextField();
        VK_S1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatListTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        DeleteID_pat = new javax.swing.JTextField();
        Update1 = new javax.swing.JButton();
        NIDtext_pat_new = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        Rn = new javax.swing.JTextField();
        Save_Rooms = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        RoomListTable = new javax.swing.JTable();
        Statebox = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        DeleteID_Rooms = new javax.swing.JTextField();
        DeleteID_Rooms1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        Update_Rooms = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        IDTEXT1 = new javax.swing.JTextField();
        Nametext1 = new javax.swing.JTextField();
        passtexts1 = new javax.swing.JTextField();
        VK_S2 = new javax.swing.JButton();
        Update2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        DocListTable1 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        DeleteID1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1024, 320));

        jPanel1.setBackground(new java.awt.Color(32, 53, 96));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 420));
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

        jTabbedPane1.setBackground(new java.awt.Color(32, 53, 96));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel2.setPreferredSize(new java.awt.Dimension(870, 600));

        jPanel7.setBackground(new java.awt.Color(32, 53, 96));
        jPanel7.setPreferredSize(new java.awt.Dimension(599, 600));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel7.add(Nametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, 30));

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
        jPanel7.add(nidtexts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 310, 30));

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
        jPanel7.add(passtexts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 310, 30));

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
        jPanel7.add(avtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 30));

        DocListTable.setAutoCreateRowSorter(true);
        DocListTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 0, 550, 350));

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
        jPanel7.add(IDTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, 30));

        VK_S.setText("Save");
        VK_S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VK_SMouseClicked(evt);
            }
        });
        VK_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VK_SActionPerformed(evt);
            }
        });
        jPanel7.add(VK_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 40));

        Specbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select A Specification---", "General Surgery\t", "Internal Medicine", "Family Medicine/General Practice", "Pediatrics", "Obstetrics and Gynecology", "Psychiatry", "Radiology and Diagnostic Radiology", "Cardiovascular Disease", "Orthopedic Surgery", "Ophthalmology", "Hematology and Oncology", "Neurology", "Dermatology" }));
        jPanel7.add(Specbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, -1));

        Update.setText("Update");
        Update.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                UpdateFocusLost(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel7.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 80, 40));

        jPanel8.setBackground(new java.awt.Color(32, 53, 96));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton5.setText("Delete");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DeleteID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(DeleteID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add A Doctor", jPanel2);

        jPanel5.setBackground(new java.awt.Color(32, 53, 96));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel5.add(Nametext_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 240, 30));

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
        jPanel5.add(AgeText_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 30));

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
        jPanel5.add(GenderText_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 70, 30));

        NIDtext_pat.setText("National ID");
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
        jPanel5.add(NIDtext_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 100, 30));

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
        Passtext_pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Passtext_patActionPerformed(evt);
            }
        });
        jPanel5.add(Passtext_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 310, 30));

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
        PhoneText_pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneText_patActionPerformed(evt);
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
        jPanel5.add(PhoneText_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 30));

        VK_S1.setText("Save");
        VK_S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VK_S1ActionPerformed(evt);
            }
        });
        jPanel5.add(VK_S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 104, 40));

        PatListTable.setAutoCreateRowSorter(true);
        PatListTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
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

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 550, 350));

        jPanel10.setBackground(new java.awt.Color(32, 53, 96));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Delete");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        DeleteID_pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteID_patActionPerformed(evt);
            }
        });
        jPanel10.add(DeleteID_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 30));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 50));

        Update1.setText("Update");
        Update1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Update1FocusLost(evt);
            }
        });
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });
        jPanel5.add(Update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 100, 40));

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
        NIDtext_pat_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIDtext_pat_newActionPerformed(evt);
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
        jPanel5.add(NIDtext_pat_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 240, 30));

        jTabbedPane1.addTab("Edit A Patient", jPanel5);

        jPanel6.setBackground(new java.awt.Color(32, 53, 96));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Rn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RnActionPerformed(evt);
            }
        });
        Rn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RnKeyTyped(evt);
            }
        });
        jPanel6.add(Rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 30));

        Save_Rooms.setText("Save");
        Save_Rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save_RoomsMouseClicked(evt);
            }
        });
        Save_Rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_RoomsActionPerformed(evt);
            }
        });
        jPanel6.add(Save_Rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 40));

        RoomListTable.setAutoCreateRowSorter(true);
        RoomListTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 0, 560, 350));

        Statebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A State", "Free", "Full" }));
        Statebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateboxActionPerformed(evt);
            }
        });
        jPanel6.add(Statebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 110, 30));

        jPanel11.setBackground(new java.awt.Color(32, 53, 96));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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
        jPanel11.add(DeleteID_Rooms1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 30));

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
        jPanel11.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 50));

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
        jPanel6.add(Update_Rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 100, 40));

        jTabbedPane1.addTab("Add A Room", jPanel6);

        jPanel3.setBackground(new java.awt.Color(32, 53, 96));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(IDTEXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, 30));

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
        jPanel3.add(Nametext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, 30));

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
        jPanel3.add(passtexts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 310, 30));

        VK_S2.setText("Save");
        VK_S2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VK_S2MouseClicked(evt);
            }
        });
        VK_S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VK_S2ActionPerformed(evt);
            }
        });
        jPanel3.add(VK_S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 40));

        Update2.setText("Update");
        Update2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Update2FocusLost(evt);
            }
        });
        Update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update2ActionPerformed(evt);
            }
        });
        jPanel3.add(Update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 80, 40));

        DocListTable1.setAutoCreateRowSorter(true);
        DocListTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        jPanel12.setBackground(new java.awt.Color(32, 53, 96));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("Delete");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

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
        jPanel12.add(DeleteID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 30));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 50));

        jTabbedPane1.addTab("Add PharmDr", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 870, 430));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/hoho .png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 110));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admins");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("          LogOut");
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
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 130, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 460));

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, -1, -1));

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

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

    private void DeleteIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteIDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_DeleteIDKeyTyped

    private void DeleteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteIDActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if(DeleteID.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Select a user to delete");
        }
        else{
            delete();
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void VK_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VK_SActionPerformed
        // TODO add your handling code here:
        edit();
    }//GEN-LAST:event_VK_SActionPerformed

    private void VK_SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VK_SMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VK_SMouseClicked

    private void IDTEXTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTEXTKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE )||c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_IDTEXTKeyTyped

    private void IDTEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTEXTActionPerformed

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

    private void avtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avtextActionPerformed

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

    private void passtextsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtextsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtextsActionPerformed

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

    private void nidtextsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidtextsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidtextsActionPerformed

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

    private void NametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NametextActionPerformed
public void update_table_Doc(){String select = Specbox.getSelectedItem().toString();
  try{
        String update = "Update doclist set ID=? , Name=?,NationalID=?,Specification=?,Password=?,Available=? Where ID ="+IDTEXT.getText()+"";
        paa = con.prepareStatement(update);
        paa.setString(1, IDTEXT.getText());
        paa.setString(2, Nametext.getText());
        paa.setString(3, nidtexts.getText());
        paa.setString(5, passtexts.getText());
        paa.setString(6, avtext.getText());
        paa.setString(4, select);
        paa.executeUpdate();
        JOptionPane.showMessageDialog(null,"Doctor Updated");
        importd_doc();
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e); 
    }    
}
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

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
String select = Specbox.getSelectedItem().toString();
        if(IDTEXT.getText().equals("")||IDTEXT.getText().equals("ID")||Nametext.getText().equals("")||Nametext.getText().equals("Name")||nidtexts.getText().equals("")||nidtexts.getText().equals("Password")||select.equals("---Select A Specification---")||passtexts.getText().equals("")||passtexts.getText().equals("National ID")||avtext.getText().equals("")||avtext.getText().equals("Availible")){
        JOptionPane.showMessageDialog(null,"Cannot Update While Some Data is Not Correct Or Empty");
        }else{
        check_if_null();    
        }

    }//GEN-LAST:event_UpdateActionPerformed

    private void UpdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UpdateFocusLost
       
    }//GEN-LAST:event_UpdateFocusLost

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

    private void Nametext_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nametext_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nametext_patActionPerformed

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

    private void AgeText_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeText_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeText_patActionPerformed

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

    private void GenderText_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderText_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderText_patActionPerformed

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
        // TODO add your handling code here:
        if(NIDtext_pat.getText().equals("")){
            NIDtext_pat.setText("National ID");
        }
    }//GEN-LAST:event_NIDtext_patFocusLost

    private void NIDtext_patMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NIDtext_patMouseClicked
        // TODO add your handling code here:
        if(NIDtext_pat.getText().equals("National ID")){
            NIDtext_pat.setText("");
        }
    }//GEN-LAST:event_NIDtext_patMouseClicked

    private void NIDtext_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIDtext_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIDtext_patActionPerformed

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

    private void NIDtext_patKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIDtext_patKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_NIDtext_patKeyTyped

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

    private void Passtext_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Passtext_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Passtext_patActionPerformed

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

    private void PhoneText_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneText_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneText_patActionPerformed

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

    private void VK_S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VK_S1ActionPerformed
        // TODO add your handling code here:
        edit_pat();
    }//GEN-LAST:event_VK_S1ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        if(DeleteID.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please Select a user to delete");
        }
        else{
            delete();
        }

    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(DeleteID_pat.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please Select a user to delete");
        }
        else{
            delete_pat();
        }
    }//GEN-LAST:event_jButton6ActionPerformed
public void delete_pat(){
     String delete = "DELETE from PatientData WHERE NationalID =?";
       int x = JOptionPane.showConfirmDialog(rootPane, "Do You want To delete this user ?", "Deleting Option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
       if(x ==JOptionPane.YES_OPTION){
       try{      
       paa = con.prepareStatement(delete);
       paa.setString(1, DeleteID_pat.getText());
       paa.execute();
       JOptionPane.showMessageDialog(null,"User Deleted Sucessfully"); 
       DeleteID_pat.setText("");
       importd_pat();     
      }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }  
    }
}
    private void DeleteID_patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteID_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteID_patActionPerformed

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

    private void Update1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Update1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Update1FocusLost

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        // TODO add your handling code here:
        if(Nametext_pat.getText().equals("")||Nametext_pat.getText().equals("Name")||NIDtext_pat.getText().equals("")||NIDtext_pat.getText().equals("National ID")||AgeText_pat.getText().equals("")||AgeText_pat.getText().equals("Age")||Passtext_pat.getText().equals("")||Passtext_pat.getText().equals("Password")||PhoneText_pat.getText().equals("")||PhoneText_pat.getText().equals("Phone Number")){
        JOptionPane.showMessageDialog(null,"Cannot Update While Some Data is Not Correct Or Empty");
        }else{
        check_if_null_pat(); 
        }
        
    }//GEN-LAST:event_Update1ActionPerformed
int px = 0;
int py =0;
    private void RnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RnActionPerformed

    private void RnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RnKeyTyped

    }//GEN-LAST:event_RnKeyTyped

    private void Save_RoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_RoomsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Save_RoomsMouseClicked

    private void Save_RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_RoomsActionPerformed
      String select = Statebox.getSelectedItem().toString();
        if(Rn.getText().equals("")||select.equals("Select A State")){
           JOptionPane.showMessageDialog(null,"Please Enter Correct Data"); 
        }else{
            edit_Rooms();
        }
        
        
    }//GEN-LAST:event_Save_RoomsActionPerformed
public void Update_Rooms(){
    String select = Statebox.getSelectedItem().toString();
    try{
     String update = "Update RoomEmg set RoomNo=?,State=? Where RoomNo ="+Rn.getText()+"";
        paa = con.prepareStatement(update);
        paa.setString(1, Rn.getText());
        paa.setString(2, select);
        paa.executeUpdate();
        JOptionPane.showMessageDialog(null,"Room Updated");
        importd_Rooms();
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e); 
        
}
}
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
public void importd_Rooms(){
        
        try{
           String insert = "select *from RoomEmg";
           paa = con.prepareStatement(insert);
           rss = paa.executeQuery();
           RoomListTable.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
     }
    public void edit_Rooms(){ 
         importd_Rooms();
         String states = Statebox.getSelectedItem().toString();
    try{
       String insert = "Insert into RoomEmg (RoomNo,State)  values (?,?)";
       paa = con.prepareStatement(insert);
       paa.setString(1, Rn.getText());
       paa.setString(2, states);
       paa.executeUpdate();
       if(rss.next()){
           int room = Integer.parseInt(Rn.getText());
           if(room < rss.getInt("RoomNo")){
               paa = con.prepareStatement(insert); 
              JOptionPane.showMessageDialog(null,"Room Added Sucessfully");
              importd_Rooms(); 
           }else{
              paa = con.prepareStatement(insert); 
              JOptionPane.showMessageDialog(null,"Room Added Sucessfully");
               importd_Rooms();  
           }
       
       }
       JOptionPane.showMessageDialog(null,"Room Added Sucessfully");
               importd_Rooms();  
    }catch(HeadlessException | SQLException e){
        
        JOptionPane.showMessageDialog(null,"Error Room Exists");
        
    }
}
    
    private void DeleteID_Rooms1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteID_Rooms1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteID_Rooms1ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(DeleteID_Rooms1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Select a Room to Delete");
        }
        else{
            delete_room();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Update_RoomsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Update_RoomsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Update_RoomsFocusLost
public void check_if_null_Room(){
    if("".equals(DeleteID_Rooms1.getText())){
      JOptionPane.showMessageDialog(null,"Please Select A Doctor From Table To Update");
     }else if(!"".equals(DeleteID_Rooms1.getText())){
        Update_Rooms(); 
     }
}
    private void Update_RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_RoomsActionPerformed
      String select = Statebox.getSelectedItem().toString();
        if(Rn.getText().equals("")||Rn.getText().equals("Room Number")|| select.equals("Select A State")){
        JOptionPane.showMessageDialog(null,"Cannot Update While Some Data is Not Correct Or Empty");
        }else{
        check_if_null_Room(); 
        } 
    }//GEN-LAST:event_Update_RoomsActionPerformed

    private void RnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RnFocusLost
        // TODO add your handling code here:
        if(Rn.getText().equals("")){
            Rn.setText("Room Number");
        }
    }//GEN-LAST:event_RnFocusLost
public void delete_room(){
   if(DeleteID_Rooms1.getText().equals("") ){
      JOptionPane.showMessageDialog(null,"Please select a Room to delete");
      DeleteID_Rooms1.setText("");
    }
    else{
        String delete = "DELETE from RoomEmg WHERE RoomNo =?";
      int x = JOptionPane.showConfirmDialog(rootPane, "Do You want To delete this Room ?", "Deleting Option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
      if(x ==JOptionPane.YES_OPTION){
       try{
       paa = con.prepareStatement(delete);
       paa.setString(1, DeleteID_Rooms1.getText());
       paa.execute();
       JOptionPane.showMessageDialog(null,"Room Deleted Sucessfully"); 
       DeleteID_Rooms1.setText("");
       importd_Rooms();
      }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }  
    }
    }    
}
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

    private void VK_S2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VK_S2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VK_S2MouseClicked

    private void VK_S2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VK_S2ActionPerformed
        // TODO add your handling code here:
        edit_farm();
    }//GEN-LAST:event_VK_S2ActionPerformed

    private void Update2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Update2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Update2FocusLost

    private void Update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update2ActionPerformed
        // TODO add your handling code here:
        check_if_null_farm();
    }//GEN-LAST:event_Update2ActionPerformed

    private void DocListTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocListTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)DocListTable1.getModel();
        int SelectedRows = DocListTable1.getSelectedRow();
        IDTEXT1. setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        Nametext1 . setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        passtexts1. setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        DeleteID1.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        
        
        
        
    }//GEN-LAST:event_DocListTable1MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      delete_farm();
    }//GEN-LAST:event_jButton9ActionPerformed

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

    private void NIDtext_pat_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIDtext_pat_newActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIDtext_pat_newActionPerformed

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
 public void check_if_null(){
     if("".equals(DeleteID.getText())){
      JOptionPane.showMessageDialog(null,"Please Select A Doctor From Table To Update");
     }else if(!"".equals(DeleteID.getText())){
        update_table_Doc(); 
     }
 }
  public void check_if_null_pat(){
     if("".equals(DeleteID_pat.getText())){
      JOptionPane.showMessageDialog(null,"Please Select A Patient From Table To Update");
     }else if(!"".equals(DeleteID_pat.getText())){
        update_table_pat(); 
     }
 } 
  public void check_if_null_farm(){
     if("".equals(DeleteID1.getText())){
      JOptionPane.showMessageDialog(null,"Please Select A Doctor From Table To Update");
     }else if(!"".equals(DeleteID1.getText())){
        update_table_farm(); 
     }
 } 
  public void update_table_farm(){
  try{
        String update = "Update FarmacyDoc set DrID=?,DrName=?,Password=? Where DrID="+IDTEXT1.getText()+"";
        paa = con.prepareStatement(update);
        paa.setString(1, IDTEXT1.getText());
        paa.setString(2, Nametext1.getText());
        paa.setString(3, passtexts1.getText());
        paa.executeUpdate();
        JOptionPane.showMessageDialog(null,"Dr Updated");
        importd_farm();
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e); 
    }    
}
  public void update_table_pat(){
  try{
        String update = "Update PatientData set Name=?,NationalID=?,Password=?,Age=?,PhoneNumber=?,Gender=? Where NationalID="+NIDtext_pat.getText()+"";
        paa = con.prepareStatement(update);
        paa.setString(1, Nametext_pat.getText());
        paa.setString(2, NIDtext_pat_new.getText());
        paa.setString(3, Passtext_pat.getText());
        paa.setString(4, AgeText_pat.getText());
        paa.setString(5, PhoneText_pat.getText());
        paa.setString(6, GenderText_pat.getText());
        paa.executeUpdate();
         importd_pat();
        JOptionPane.showMessageDialog(null,"Patient Updated");
       
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e); 
    }    
}
 
    public void de(){
    if(DeleteID.getText().equals("") ){
      JOptionPane.showMessageDialog(null,"Select a user to delete");
      DeleteID.setText(" ");
    }
    else{
       String delete = "DELETE from Adoc WHERE ID =?";
       try{
       paa = con.prepareStatement(delete);
       paa.setString(1, DeleteID.getText());
       paa.execute();
       importd_doc();
      }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }  
    }   
    
}  
     public void  delete_farm(){
    if(DeleteID1.getText().equals("") ){
      JOptionPane.showMessageDialog(null,"Select an ID to delete");
    }
    else{
       String delete = "DELETE from FarmacyDoc WHERE DrID =?";
      int x = JOptionPane.showConfirmDialog(rootPane, "Do You want To delete this ID ?", "Deleting Option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
      if(x ==JOptionPane.YES_OPTION){
       try{
       paa = con.prepareStatement(delete);
       paa.setString(1, DeleteID1.getText());
       paa.execute();
       de();
       JOptionPane.showMessageDialog(null,"ID Deleted Sucessfully"); 
       DeleteID1.setText("");
       importd_farm();
      }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }  
    }
    }   
}
    public void  delete(){
    if(DeleteID.getText().equals("") ){
      JOptionPane.showMessageDialog(null,"Select a user to delete");
      DeleteID.setText("");
    }
    else{
       String delete = "DELETE from Doclist WHERE ID =?";
      int x = JOptionPane.showConfirmDialog(rootPane, "Do You want To delete this user ?", "Deleting Option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
      if(x ==JOptionPane.YES_OPTION){
       try{
       paa = con.prepareStatement(delete);
       paa.setString(1, DeleteID.getText());
       paa.execute();
       de();
       JOptionPane.showMessageDialog(null,"User Deleted Sucessfully"); 
       DeleteID.setText("");
       importd_doc();
      }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }  
    }
    }   
}
    public void edit_pat(){    
    try{
       String insert = "Insert into PatientData (Name,NationalID,Password,Age,PhoneNumber,Gender)  values (?,?,?,?,?,?)";
       paa = con.prepareStatement(insert);
       paa.setString(1, Nametext_pat.getText());
       paa.setString(2, NIDtext_pat.getText());
       paa.setString(3, Passtext_pat.getText());
       paa.setString(4, AgeText_pat.getText());
       paa.setString(5, PhoneText_pat.getText());
       paa.setString(6, GenderText_pat.getText());
       paa.executeUpdate();
       JOptionPane.showMessageDialog(null,"User Added Sucessfully");
       importd_pat();
    }catch(HeadlessException | SQLException e){
        importd_pat();
        JOptionPane.showMessageDialog(null,"Error Password Or National ID is repeated");
    }
}
     public void edit_farm(){    
    try{
       String insert = "Insert into FarmacyDoc (DrID,DrName,Password)  values (?,?,?)";
       paa = con.prepareStatement(insert);
       paa.setString(1, IDTEXT1.getText());
       paa.setString(2, Nametext1.getText());
       paa.setString(3, passtexts1.getText());
       paa.executeUpdate();
       JOptionPane.showMessageDialog(null,"Dr Added Sucessfully");
       importd_farm();
    }catch(HeadlessException | SQLException e){
        importd_farm();
        JOptionPane.showMessageDialog(null,"Error Password Or National ID is repeated");
    }
}
public void add_pd(){String select = Specbox.getSelectedItem().toString();
    try{
      String Adoc = "Insert into Adoc (ID,Name,Spec,Av)  values (?,?,?,?)";
      paad = con.prepareStatement(Adoc);
      paad.setString(1, IDTEXT.getText());
      paad.setString(2, Nametext.getText());
      paad.setString(3, select);
      paad.setString(4, avtext.getText());
      paad.executeUpdate();
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error Cannot add in doclist for patient db");
    }
}
    public void edit(){ 
        String select = Specbox.getSelectedItem().toString();
        if(IDTEXT.getText().equals("")||IDTEXT.getText().equals("ID")||Nametext.getText().equals("")||Nametext.getText().equals("Name")||nidtexts.getText().equals("")||nidtexts.getText().equals("Password")||select.equals("---Select A Specification---")||passtexts.getText().equals("")||passtexts.getText().equals("National ID")||avtext.getText().equals("")||avtext.getText().equals("Availible")){
        JOptionPane.showMessageDialog(null,"Error Cannot Add This Data Please Enter Correct Data");
        }else{
             try{
       String insert = "Insert into Doclist (ID,Name ,NationalID , Specification , Password,Available)  values (?,?,?,?,?,?)";
       paa = con.prepareStatement(insert);
       paa.setString(1, IDTEXT.getText());
       paa.setString(2, Nametext.getText());
       paa.setString(3, nidtexts.getText());
       paa.setString(4, select);
       paa.setString(5, passtexts.getText());
       paa.setString(6, avtext.getText());
       paa.executeUpdate();
       JOptionPane.showMessageDialog(null,"User Added Sucessfully");
        add_pd();
       importd_doc();
    }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error Password Or National ID is repeated");
    }
        }
   
}
    public void importd_doc(){
        try{
           String insert = "select *from doclist";
           paa = con.prepareStatement(insert);
           rss = paa.executeQuery();
           DocListTable.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
     }
    public void importd_pat(){
        
        try{
           String insert = "select *from PatientData";
           paa = con.prepareStatement(insert);
           rss = paa.executeQuery();
           PatListTable.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
     } 
    public void importd_farm(){
        
        try{
           String insert = "select *from FarmacyDoc";
           paa = con.prepareStatement(insert);
           rss = paa.executeQuery();
           DocListTable1.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
     } 
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
    private javax.swing.JTextField DeleteID_pat;
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
    private javax.swing.JButton Save_Rooms;
    private javax.swing.JComboBox<String> Specbox;
    private javax.swing.JComboBox<String> Statebox;
    private javax.swing.JButton Update;
    private javax.swing.JButton Update1;
    private javax.swing.JButton Update2;
    private javax.swing.JButton Update_Rooms;
    private javax.swing.JButton VK_S;
    private javax.swing.JButton VK_S1;
    private javax.swing.JButton VK_S2;
    private javax.swing.JTextField avtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
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
