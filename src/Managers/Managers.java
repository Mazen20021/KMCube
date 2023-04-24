package Managers;
import Main.Config;
import Main.Main;
import Admins.Admins;
import Doctors.doctor1;
import Reception.Reception;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
public class Managers extends javax.swing.JFrame {

    int positionX = 0;
    int positionY = 0;

    Connection conn ;
    ResultSet rss_doctor = null;
    ResultSet rss_patient = null;
    ResultSet rss_patient_Spec = null;
    PreparedStatement pre_stat = null;
    PreparedStatement pre_stat1 = null;
    PreparedStatement pre_stat1_1 = null;

    DefaultTableModel RecordTableDoctors;
    DefaultTableModel RecordTablePatients;



    public Managers() {
        initComponents();
        conn = Config.connectDB();

        RecordTableDoctors = (DefaultTableModel)DocListTable.getModel();
        RecordTablePatients = (DefaultTableModel) PatientListTable1.getModel();
        RecordTablePatients.setRowCount(0);
        RecordTableDoctors.setRowCount(0);
        importDoctor();
        importPatient();
    }


    public void importDoctor(){

        try{
            String insert = "select ID,NAME,Specification,Available from doclist";
            pre_stat = conn.prepareStatement(insert);
            rss_doctor = pre_stat.executeQuery();
            DocListTable.setModel(DbUtils.resultSetToTableModel(rss_doctor));

            TableModel docTable = DocListTable.getModel();
            for (int i = 0; i < docTable.getRowCount(); i++) {

                Object o = docTable.getValueAt(i, 2);
                Object o2 = docTable.getValueAt(i, 3);



                //Object  o[] = {rss_doctor.getInt("ID"),rss_doctor.getString("Name"),rss_doctor.getString("Specification"),rss_doctor.getInt("NationalID"),};
                //RecordTableDoctors.addRow(o);
                if("General Surgery".equals(o.toString()) && !(" ".equals(o2.toString()))){
                    CountGeneral_Surgery++;
                }
                else if ("Internal Medicine".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountInternalMedicine++;
                }
                else if ("Family Medicine/General Practice".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountFamilyMedicine++;
                }
                else if ("Pediatrics".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountPediatrics++;
                }
                else if ("Obstetrics and Gynecology".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountObstetricsAndGynecology++;
                }
                else if ("Psychiatry".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountPsychiatry++;
                }
                else if ("Radiology and Diagnostic Radiology".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountRadiologyAndDiagnosticRadiology++;
                }
                else if ("Cardiovascular Disease".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountCardiovascularDisease++;
                }
                else if ("Orthopedic Surgery".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountOrthopedicSurgery++;
                }
                else if ("Ophthalmology".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountOphthalmology++;
                }
                else if ("Neurology".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountNeurology++;
                }
                else if ("Dermatology".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountDermatology++;
                }
                else if ("Hematology and Oncology".equals(o.toString()) && !(" ".equals(o2.toString()))) {
                    CountHematologyAndOncology++;
                }



            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public void importPatient(){

        try{
            String insert1 = "select Name,Age,PhoneNumber,Gender from patientData";
            pre_stat1 = conn.prepareStatement(insert1);
            rss_patient = pre_stat1.executeQuery();
            PatientListTable1.setModel(DbUtils.resultSetToTableModel(rss_patient));

            String insert_Spec = "select Spec from PL";
            pre_stat1_1 = conn.prepareStatement(insert_Spec);
            rss_patient_Spec = pre_stat1_1.executeQuery();

            while (rss_patient_Spec.next()) {

                Object o_p = rss_patient_Spec.getString(1);
                if("General Surgery".equals(o_p.toString()) ){
                    CountGeneral_Surgery_p++;
                }
                else if ("Internal Medicine".equals(o_p.toString()) ) {
                    CountInternalMedicine_p++;
                }
                else if ("Family Medicine".equals(o_p.toString()) ) {
                    CountFamilyMedicine_p++;
                }
                else if ("Pediatrics".equals(o_p.toString()) ) {
                    CountPediatrics_p++;
                }
                else if ("Obstetrics and Gynecology".equals(o_p.toString()) ) {
                    CountObstetricsAndGynecology_p++;
                }
                else if ("Psychiatry".equals(o_p.toString()) ) {
                    CountPsychiatry_p++;
                }
                else if ("Radiology and Diagnostic Radiology".equals(o_p.toString()) ) {
                    CountRadiologyAndDiagnosticRadiology_p++;
                }
                else if ("Cardiovascular Disease".equals(o_p.toString()) ) {
                    CountCardiovascularDisease_p++;
                }
                else if ("Orthopedic Surgery".equals(o_p.toString()) ) {
                    CountOrthopedicSurgery_p++;
                }
                else if ("Ophthalmology".equals(o_p.toString()) ) {
                    CountOphthalmology_p++;
                }
                else if ("Neurology".equals(o_p.toString()) ) {
                    CountNeurology_p++;
                }
                else if ("Dermatology".equals(o_p.toString()) ) {
                    CountDermatology_p++;
                }
                else if ("Hematology and Oncology".equals(o_p.toString()) ) {
                    CountHematologyAndOncology_p++;
                }
            }

        }


        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnDoctors = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnPatients = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnFinantial = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tableDocTab = new javax.swing.JScrollPane();
        DocListTable = new javax.swing.JTable();
        tableDocAnalesis = new javax.swing.JPanel();
        BarChart = new javax.swing.JButton();
        piechart = new javax.swing.JButton();
        LineChart = new javax.swing.JButton();
        panelChart = new javax.swing.JPanel();
        tab2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        tablePatientTab1 = new javax.swing.JScrollPane();
        PatientListTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        P_BarChart = new javax.swing.JButton();
        P_PieChart = new javax.swing.JButton();
        P_LineChart = new javax.swing.JButton();
        patientChartPanel = new javax.swing.JPanel();
        tab3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 153, 255));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(46, 76, 96));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/pro.png"))); // NOI18N
        jLabel3.setText("  Welcome, Manager");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 310, 40));

        jButton2.setText("x");
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 30));

        jButton4.setText("-");
        jButton4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDoctors.setBackground(new java.awt.Color(255, 255, 255));
        btnDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoctorsMouseClicked(evt);
            }
        });
        btnDoctors.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Doctors");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        btnDoctors.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jPanel4.add(btnDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 30));

        btnPatients.setBackground(java.awt.Color.lightGray);
        btnPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPatientsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPatientsMouseEntered(evt);
            }
        });
        btnPatients.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Patients");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        btnPatients.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jPanel4.add(btnPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 30));

        btnFinantial.setBackground(java.awt.Color.lightGray);
        btnFinantial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinantialMouseClicked(evt);
            }
        });
        btnFinantial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(btnFinantial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, 30));

        btnLogOut.setBackground(java.awt.Color.lightGray);
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        btnLogOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/logout-icon-304-thumb.png"))); // NOI18N
        jLabel6.setText("      Logout");
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
        btnLogOut.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jPanel4.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/hoho .png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 100, 90));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 430));

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setBackground(new java.awt.Color(46, 76, 96));
        tab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(46, 76, 96));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseEntered(evt);
            }
        });

        tableDocTab.setBackground(new java.awt.Color(255, 255, 255));

        DocListTable.setAutoCreateRowSorter(true);
        DocListTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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
                        "ID", "Name", "Specification", "NationalID"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DocListTable.setShowGrid(true);
        DocListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocListTableMouseClicked(evt);
            }
        });
        tableDocTab.setViewportView(DocListTable);
        if (DocListTable.getColumnModel().getColumnCount() > 0) {
            DocListTable.getColumnModel().getColumn(2).setHeaderValue("Specification");
        }

        jTabbedPane1.addTab("Doctor List ", tableDocTab);

        tableDocAnalesis.setBackground(new java.awt.Color(46, 76, 96));
        tableDocAnalesis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarChart.setText("Bar_Chart");
        BarChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarChartActionPerformed(evt);
            }
        });
        tableDocAnalesis.add(BarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        piechart.setText("Pie_Chart");
        piechart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piechartActionPerformed(evt);
            }
        });
        tableDocAnalesis.add(piechart, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        LineChart.setText("LineChart  X");
        LineChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineChartActionPerformed(evt);
            }
        });
        tableDocAnalesis.add(LineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        panelChart.setBackground(new java.awt.Color(153, 153, 153));
        panelChart.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelChart.setLayout(new java.awt.BorderLayout());
        tableDocAnalesis.add(panelChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 340));

        jTabbedPane1.addTab("Charts", tableDocAnalesis);

        tab1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 770, 420));

        jPanel8.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        tab2.setBackground(new java.awt.Color(46, 76, 96));
        tab2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        tablePatientTab1.setBackground(new java.awt.Color(255, 255, 255));

        PatientListTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "Name", "NationalID", "Email", "Age", "PhoneNumber", "Gender"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PatientListTable1.setShowGrid(true);
        PatientListTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientListTable1MouseClicked(evt);
            }
        });
        tablePatientTab1.setViewportView(PatientListTable1);

        jTabbedPane2.addTab("tab1", tablePatientTab1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_BarChart.setText("Bar_Chart");
        P_BarChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_BarChartActionPerformed(evt);
            }
        });
        jPanel2.add(P_BarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        P_PieChart.setText("Pie_Chart");
        P_PieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_PieChartActionPerformed(evt);
            }
        });
        jPanel2.add(P_PieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        P_LineChart.setText("LineCart   X");
        jPanel2.add(P_LineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, -1, -1));

        patientChartPanel.setBackground(new java.awt.Color(255, 255, 255));
        patientChartPanel.setLayout(new java.awt.BorderLayout());
        jPanel2.add(patientChartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 750, 350));

        jTabbedPane2.addTab("tab2", jPanel2);

        tab2.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        jPanel8.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        tab3.setBackground(new java.awt.Color(255, 255, 102));
        tab3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 790, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);

    }

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {
        setState(JFrame.ICONIFIED);
    }

    // DoctorsInfo Display

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        tab1.setVisible(true);
        tab2.setVisible(false);
        tab3.setVisible(false);

        btnDoctors.setBackground(Color.white);
        btnFinantial.setBackground(new Color(204,204,255));
        btnPatients.setBackground(new Color(204,204,255));

        x2 = false;
        x1 = true;
        x3 = false;

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void btnPatientsMouseClicked(java.awt.event.MouseEvent evt) {
        tab2.setVisible(true);
        tab1.setVisible(false);
        tab3.setVisible(false);
        btnPatients.setBackground(Color.white);
        btnDoctors.setBackground(new Color(204,204,255));
        btnFinantial.setBackground(new Color(204,204,255));
        x2 = true;
        x1 = false;
        x3 = false;

    }

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
        tab2.setVisible(true);
        tab1.setVisible(false);
        tab3.setVisible(false);

        btnPatients.setBackground(Color.white);
        btnDoctors.setBackground(new Color(204,204,255));
        btnFinantial.setBackground(new Color(204,204,255));
        x2 = true;
        x1 = false;
        x3 = false;

    }

    private void btnDoctorsMouseClicked(java.awt.event.MouseEvent evt) {
        tab1.setVisible(true);
        tab2.setVisible(false);
        tab3.setVisible(false);

        btnDoctors.setBackground(Color.white);
        btnFinantial.setBackground(new Color(204,204,255));
        btnPatients.setBackground(new Color(204,204,255));
    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    /*
     *Doctors table
     */
    public ArrayList<String> doctor = new ArrayList<>();

    private void DocListTableMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {
        positionX = evt.getX();
        positionY = evt.getY();
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {
        setLocation(evt.getXOnScreen()-positionX , evt.getYOnScreen()-positionY);
    }

    // when tab1 clicked the tale will displayed
    //table of doctors
    private int CountGeneral_Surgery = 0;
    private int CountInternalMedicine = 0;
    private int CountFamilyMedicine = 0;
    private int CountPediatrics = 0;
    private int CountObstetricsAndGynecology = 0;
    private int CountPsychiatry = 0;
    private int CountRadiologyAndDiagnosticRadiology = 0;
    private int CountCardiovascularDisease = 0;
    private int CountOrthopedicSurgery = 0;
    private int CountOphthalmology = 0;
    private int CountNeurology = 0;
    private int CountDermatology = 0;
    private int CountHematologyAndOncology = 0;

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void jTabbedPane1MouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    //charts_of_doctors
    //Bar_chart


    // public static JFreeChart createPieChart(String title, PieDataset dataset, boolean legend, boolean tooltips,boolean urls);


    private void BarChartActionPerformed(java.awt.event.ActionEvent evt) {

        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(CountGeneral_Surgery, "Contibution Amount", "General_Surgery");
        barChartData.setValue(CountInternalMedicine, "Contibution Amount", "InternalMedicine");
        barChartData.setValue(CountFamilyMedicine, "Contibution Amount", "FamilyMedicine");
        barChartData.setValue(CountPediatrics, "Contibution Amount", "Pediatrics");
        barChartData.setValue(CountObstetricsAndGynecology, "Contibution Amount", "Plastic surgeon");
        barChartData.setValue(CountPsychiatry, "Contibution Amount", "Psychiatry");
        barChartData.setValue(CountRadiologyAndDiagnosticRadiology, "Contibution Amount", "RadiologyAndDiagnosticRadiology");
        barChartData.setValue(CountCardiovascularDisease, "Contibution Amount", "CardiovascularDisease");
        barChartData.setValue(CountOrthopedicSurgery, "Contibution Amount", "OrthopedicSurgery");
        barChartData.setValue(CountOphthalmology, "Contibution Amount", "Ophthalmology");
        barChartData.setValue(CountNeurology, "Contibution Amount", "Neurology");
        barChartData.setValue(CountDermatology, "Contibution Amount", "Dermatology");
        barChartData.setValue(CountHematologyAndOncology, "Contibution Amount", "bones");

        JFreeChart pieChart = ChartFactory.createBarChart("Available No. of Doctors in Hospital", "Specialization", "Available Number", barChartData, PlotOrientation.HORIZONTAL, false, true, false);
        CategoryPlot piechart = pieChart.getCategoryPlot();
        piechart.setRangeGridlinePaint(Color.GREEN);

        ChartPanel barPanel = new ChartPanel(pieChart);
        panelChart.removeAll();
        panelChart.add(barPanel,BorderLayout.CENTER);
        panelChart.validate();
    }

    //Pie_chart

    private DefaultPieDataset pieDataset;
    private JFreeChart pieChart;
    private PiePlot piePlot;
    private ChartPanel chartPanel;

    private void piechartActionPerformed(java.awt.event.ActionEvent evt) {

        pieDataset = new DefaultPieDataset();


        pieDataset.setValue("General_Surgery",CountGeneral_Surgery);
        pieDataset.setValue("InternalMedicine",CountInternalMedicine);
        pieDataset.setValue("FamilyMedicine",CountFamilyMedicine);
        pieDataset.setValue("Pediatrics",CountPediatrics);
        pieDataset.setValue("Plastic surgeon",CountObstetricsAndGynecology);
        pieDataset.setValue("Psychiatry",CountPsychiatry);
        pieDataset.setValue("RadiologyAndDiagnosticRadiology",CountRadiologyAndDiagnosticRadiology);
        pieDataset.setValue("CardiovascularDisease",CountCardiovascularDisease);
        pieDataset.setValue("OrthopedicSurgery",CountOrthopedicSurgery);
        pieDataset.setValue("Ophthalmology",CountOphthalmology);
        pieDataset.setValue("Neurology",CountNeurology);
        pieDataset.setValue("Dermatology",CountDermatology);
        pieDataset.setValue("bones",CountHematologyAndOncology);

        //create chart
        pieChart = ChartFactory.createPieChart3D("Available doctors", pieDataset, true, true, false);
        piePlot = (PiePlot) pieChart.getPlot();
        chartPanel = new ChartPanel(pieChart);
        panelChart.removeAll();
        panelChart.add(chartPanel,BorderLayout.CENTER);
        panelChart.validate();
    }



    private int CountGeneral_Surgery_p = 0;
    private int CountInternalMedicine_p = 0;
    private int CountFamilyMedicine_p = 0;
    private int CountPediatrics_p = 0;
    private int CountObstetricsAndGynecology_p = 0;
    private int CountPsychiatry_p = 0;
    private int CountRadiologyAndDiagnosticRadiology_p = 0;
    private int CountCardiovascularDisease_p = 0;
    private int CountOrthopedicSurgery_p = 0;
    private int CountOphthalmology_p = 0;
    private int CountNeurology_p = 0;
    private int CountDermatology_p = 0;
    private int CountHematologyAndOncology_p = 0;


    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {

    }

    //table of patients

    private void PatientListTable1MouseClicked(java.awt.event.MouseEvent evt) {

    }

    //Patient_charts
    //BarChart

    private void P_BarChartActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(CountGeneral_Surgery_p, "Contibution Amount", "General_Surgery");
        barChartData.setValue(CountInternalMedicine_p, "Contibution Amount", "InternalMedicine");
        barChartData.setValue(CountFamilyMedicine_p, "Contibution Amount", "FamilyMedicine");
        barChartData.setValue(CountPediatrics_p, "Contibution Amount", "Pediatrics");
        barChartData.setValue(CountObstetricsAndGynecology_p, "Contibution Amount", "Plastic surgeon");
        barChartData.setValue(CountPsychiatry_p, "Contibution Amount", "Psychiatry");
        barChartData.setValue(CountRadiologyAndDiagnosticRadiology_p, "Contibution Amount", "RadiologyAndDiagnosticRadiology");
        barChartData.setValue(CountCardiovascularDisease_p, "Contibution Amount", "CardiovascularDisease");
        barChartData.setValue(CountOrthopedicSurgery_p, "Contibution Amount", "OrthopedicSurgery");
        barChartData.setValue(CountOphthalmology_p, "Contibution Amount", "Ophthalmology");
        barChartData.setValue(CountNeurology_p, "Contibution Amount", "Neurology");
        barChartData.setValue(CountDermatology_p, "Contibution Amount", "Dermatology");
        barChartData.setValue(CountHematologyAndOncology_p, "Contibution Amount", "bones");

        JFreeChart barChart = ChartFactory.createBarChart("no. of patients in each Clinic", "Specialization", "Patients Number", barChartData, PlotOrientation.HORIZONTAL, false, true, false);
        CategoryPlot barchart = barChart.getCategoryPlot();
        barchart.setRangeGridlinePaint(Color.GREEN);



        ChartPanel barPanel2 = new ChartPanel(barChart);
        patientChartPanel.removeAll();
        patientChartPanel.add(barPanel2,BorderLayout.CENTER);
        patientChartPanel.validate();
    }

    // pieChart


    private void P_PieChartActionPerformed(java.awt.event.ActionEvent evt) {
        pieDataset = new DefaultPieDataset();


        pieDataset.setValue("General_Surgery",CountGeneral_Surgery_p);
        pieDataset.setValue("InternalMedicine",CountInternalMedicine_p);
        pieDataset.setValue("FamilyMedicine",CountFamilyMedicine_p);
        pieDataset.setValue("Pediatrics",CountPediatrics_p);
        pieDataset.setValue("Plastic surgeon",CountObstetricsAndGynecology_p);
        pieDataset.setValue("Psychiatry",CountPsychiatry_p);
        pieDataset.setValue("RadiologyAndDiagnosticRadiology",CountRadiologyAndDiagnosticRadiology_p);
        pieDataset.setValue("CardiovascularDisease",CountCardiovascularDisease_p);
        pieDataset.setValue("OrthopedicSurgery",CountOrthopedicSurgery_p);
        pieDataset.setValue("Ophthalmology",CountOphthalmology_p);
        pieDataset.setValue("Neurology",CountNeurology_p);
        pieDataset.setValue("Dermatology",CountDermatology_p);
        pieDataset.setValue("bones",CountHematologyAndOncology_p);

        //create chart
        pieChart = ChartFactory.createPieChart3D("Available doctors", pieDataset, true, true, false);
        piePlot = (PiePlot) pieChart.getPlot();
        chartPanel = new ChartPanel(pieChart);
        patientChartPanel.removeAll();
        patientChartPanel.add(chartPanel,BorderLayout.CENTER);
        patientChartPanel.validate();
    }

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

    }
    boolean x1 = true;
    boolean x2 = false;
    boolean x3 = false;
    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {

        btnDoctors.setBackground(Color.white);

    }

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {
        if(x1==true){btnDoctors.setBackground(Color.white);}else{
            btnDoctors.setBackground(Color.LIGHT_GRAY);
            x1 = false;
        }

    }

    private void btnPatientsMouseEntered(java.awt.event.MouseEvent evt) {

    }

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {
        btnPatients.setBackground(Color.white);
    }

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {
        if(x2 == true){
            btnPatients.setBackground(Color.white);
        }else{
            btnPatients.setBackground(Color.LIGHT_GRAY);
        }
    }

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {
        btnLogOut.setBackground(Color.white);
    }

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {
        btnLogOut.setBackground(Color.LIGHT_GRAY);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        setState(JFrame.ICONIFIED);
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
        Main m = new Main();
        m.show();
        dispose();
    }

    private void LineChartActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnFinantialMouseClicked(java.awt.event.MouseEvent evt) {
        tab3.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);

        btnFinantial.setBackground(Color.white);
        btnDoctors.setBackground(new Color(204,204,255));
        btnPatients.setBackground(new Color(204,204,255));
    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // dataBase


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Managers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Managers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Managers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Managers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Managers dialog = new Managers();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton BarChart;
    private javax.swing.JTable DocListTable;
    private javax.swing.JButton LineChart;
    private javax.swing.JButton P_BarChart;
    private javax.swing.JButton P_LineChart;
    private javax.swing.JButton P_PieChart;
    private javax.swing.JTable PatientListTable1;
    private javax.swing.JPanel btnDoctors;
    private javax.swing.JPanel btnFinantial;
    private javax.swing.JPanel btnLogOut;
    private javax.swing.JPanel btnPatients;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel panelChart;
    private javax.swing.JPanel patientChartPanel;
    private javax.swing.JButton piechart;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tableDocAnalesis;
    private javax.swing.JScrollPane tableDocTab;
    private javax.swing.JScrollPane tablePatientTab1;
    // End of variables declaration
}
