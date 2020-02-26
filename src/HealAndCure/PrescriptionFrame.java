/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealAndCure;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class PrescriptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrescriptionFrame
     */
    String tData[][]=new String[10000][4];
    int rowCount=0;
    
    public PrescriptionFrame() {
        initComponents();
    }

    public PrescriptionFrame(String name,String dinfo,String mail,String contact)
    {
        initComponents();
        
        doctorName.setText(name);
        info.setText(dinfo);
        email.setText(mail);
        contactNo.setText(contact);
        docname.setText(name);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Patient = new javax.swing.JPanel();
        pcontact = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Sex = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        pname = new javax.swing.JTextField();
        page = new javax.swing.JTextField();
        prescribe = new javax.swing.JButton();
        psex = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        docname = new javax.swing.JLabel();
        createPrescription = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        drugName = new javax.swing.JTextField();
        drugDuration = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        drugTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        showPrescriptoin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        vDate = new javax.swing.JTextField();
        Dose = new javax.swing.JComboBox<>();
        date = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        complains = new javax.swing.JTextArea();
        print = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        writeTest = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        showPrescription = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        patientName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        patientAge = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        patientSex = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        presentDate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        nDate = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        showTest = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        complain = new javax.swing.JTextArea();
        doctorName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        contactNo = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        patientid = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        setResizable(false);

        jPanel1.setLayout(new java.awt.CardLayout());

        Patient.setBackground(new java.awt.Color(230, 230, 254));
        Patient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pcontact.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        pcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcontactActionPerformed(evt);
            }
        });
        Patient.add(pcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, 30));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-people-interface-symbol-of-black-person-close-up-with-plus-sign-in-small-circle.png"))); // NOI18N
        jButton3.setText("Add");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Patient.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 337, 107, 39));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        Patient.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 394, 575, 205));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel19.setText("Patient Name:");
        Patient.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jButton4.setBackground(new java.awt.Color(129, 166, 203));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading.png"))); // NOI18N
        jButton4.setText("Load");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Patient.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 130, 40));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel20.setText("Age:");
        Patient.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 42, -1));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton5.setText("Search");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Patient.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 130, 43));

        Sex.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Sex.setText("Gender:");
        Patient.add(Sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 85, -1));

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recycle-bin.png"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Patient.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 338, 134, 37));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel22.setText("Contact No:");
        Patient.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 85, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 186));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jButton7.setText("Update");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Patient.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 338, 134, 36));

        pname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Patient.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 200, 35));

        page.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageActionPerformed(evt);
            }
        });
        Patient.add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 32));

        prescribe.setBackground(new java.awt.Color(68, 46, 89));
        prescribe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prescribe.setForeground(new java.awt.Color(232, 232, 253));
        prescribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prescription (1).png"))); // NOI18N
        prescribe.setText("PRESCRIBE");
        prescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeActionPerformed(evt);
            }
        });
        Patient.add(prescribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 636, 169, -1));

        psex.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Patient.add(psex, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 200, 32));

        pid.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Patient.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 70, 200, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Patient ID:");
        Patient.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 20));

        jPanel3.setBackground(new java.awt.Color(110, 95, 124));

        docname.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        docname.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Patient.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 50));

        jPanel1.add(Patient, "card4");

        createPrescription.setBackground(new java.awt.Color(224, 224, 224));
        createPrescription.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Drug Name:");
        createPrescription.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Drug Dose:");
        createPrescription.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Drug Duration:");
        createPrescription.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 194, -1, 20));

        drugName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        drugName.setBorder(null);
        createPrescription.add(drugName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 139, 20));

        drugDuration.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        drugDuration.setBorder(null);
        drugDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugDurationActionPerformed(evt);
            }
        });
        createPrescription.add(drugDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 194, 139, 20));

        jButton2.setBackground(new java.awt.Color(45, 196, 83));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton2.setText("Add");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        createPrescription.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 72, 32));

        drugTime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        drugTime.setBorder(null);
        drugTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugTimeActionPerformed(evt);
            }
        });
        createPrescription.add(drugTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 139, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Drug Time:");
        createPrescription.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 224, -1, 20));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug Dose", "Drug Duration", "Drug Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        createPrescription.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 590, 161));

        jButton1.setBackground(new java.awt.Color(80, 190, 218));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        createPrescription.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 88, 32));

        showPrescriptoin.setBackground(new java.awt.Color(230, 230, 254));
        showPrescriptoin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showPrescriptoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medical-prescription.png"))); // NOI18N
        showPrescriptoin.setText("CREATE");
        showPrescriptoin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), null, new java.awt.Color(51, 0, 102), new java.awt.Color(204, 204, 204)));
        showPrescriptoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrescriptoinActionPerformed(evt);
            }
        });
        createPrescription.add(showPrescriptoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 580, 140, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Problems:");
        createPrescription.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 69, 26));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Next Visiting Date:");
        createPrescription.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        vDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vDate.setBorder(null);
        createPrescription.add(vDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 129, -1));

        Dose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1+1+1", "1+0+1", "1+0+0", "0+0+1", "0+1+1", "0+1+0", "1+1+0", " " }));
        createPrescription.add(Dose, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(51, 0, 51));
        date.setText("Date:");
        createPrescription.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 20));

        dateField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateField.setBorder(null);
        dateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFieldActionPerformed(evt);
            }
        });
        createPrescription.add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 121, -1));

        complains.setColumns(20);
        complains.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        complains.setRows(5);
        complains.setBorder(null);
        jScrollPane3.setViewportView(complains);

        createPrescription.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, 80));

        print.setBackground(new java.awt.Color(230, 230, 254));
        print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        print.setText("PRINT");
        print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, new java.awt.Color(51, 0, 102), java.awt.Color.lightGray));
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        createPrescription.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 140, 41));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Test:");
        createPrescription.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 48, 26));

        writeTest.setColumns(20);
        writeTest.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        writeTest.setRows(5);
        writeTest.setBorder(null);
        jScrollPane6.setViewportView(writeTest);

        createPrescription.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 220, 80));

        jButton8.setBackground(new java.awt.Color(224, 224, 224));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow-angle-in-circular-button (2).png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        createPrescription.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(createPrescription, "card2");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 270, 329, 398));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Email :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 50, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Tests:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 394, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Contact No :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 667, 10));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 119, 667, 5));

        patientName.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        patientName.setBorder(null);
        jPanel2.add(patientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 130, 150, -1));

        jLabel13.setText("Next Visiting Date:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 599, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Name:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        patientAge.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        patientAge.setBorder(null);
        jPanel2.add(patientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 38, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Age:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        patientSex.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        patientSex.setBorder(null);
        jPanel2.add(patientSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 130, 60, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Sex:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        presentDate.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        presentDate.setBorder(null);
        jPanel2.add(presentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 130, 110, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Date:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        nDate.setBorder(null);
        jPanel2.add(nDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 624, 129, -1));

        showTest.setColumns(20);
        showTest.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        showTest.setRows(5);
        showTest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jScrollPane4.setViewportView(showTest);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 414, 230, 131));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prescription (2).png"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 70, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Problems:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        complain.setColumns(20);
        complain.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        complain.setRows(5);
        complain.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jScrollPane7.setViewportView(complain);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, -1));

        doctorName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        doctorName.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(doctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 185, 32));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 54, 147, -1));

        info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        info.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 140, 20));

        email.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 130, 20));

        contactNo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(contactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 140, 20));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 255));
        jLabel23.setText("ID:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        patientid.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        patientid.setBorder(null);
        jPanel2.add(patientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

        javax.swing.GroupLayout showPrescriptionLayout = new javax.swing.GroupLayout(showPrescription);
        showPrescription.setLayout(showPrescriptionLayout);
        showPrescriptionLayout.setHorizontalGroup(
            showPrescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        showPrescriptionLayout.setVerticalGroup(
            showPrescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        jPanel1.add(showPrescription, "card3");

        jMenuBar1.setBackground(new java.awt.Color(227, 226, 226));

        jMenu1.setBackground(new java.awt.Color(227, 226, 226));
        jMenu1.setForeground(new java.awt.Color(48, 9, 88));
        jMenu1.setText("File");

        jMenuItem3.setText("Print");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setForeground(new java.awt.Color(48, 9, 88));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(227, 226, 226));
        jMenu2.setForeground(new java.awt.Color(48, 9, 88));
        jMenu2.setText("About");

        jMenuItem2.setForeground(new java.awt.Color(48, 9, 88));
        jMenuItem2.setText("Info");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drugDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugDurationActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList drugInfo=new ArrayList();
        
        drugInfo.add(drugName.getText());
        drugInfo.add(Dose.getSelectedItem().toString());
        drugInfo.add(drugDuration.getText());
        drugInfo.add(drugTime.getText());
                    
        String cols[]={"Drug Name","Drug Dose","Drug Duration","Drug Time"};
        DefaultTableModel tmodelDefaultTableModel=(DefaultTableModel) jTable1.getModel();
        tmodelDefaultTableModel.setDataVector(tData, cols);
    
        tData[rowCount][0]=drugName.getText();
        tData[rowCount][1]=Dose.getSelectedItem().toString();
        tData[rowCount][2]=drugDuration.getText();
        tData[rowCount][3]=drugTime.getText();
        
        jButton1.doClick();
        
        jTextArea1.setText(jTextArea1.getText()+"\n"+tData[rowCount][0]+"\t"+tData[rowCount][1]+"\t"+tData[rowCount][2]+"\t"
                        +tData[rowCount][3]+"\n");
        rowCount++;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void drugTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugTimeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String cols[]={"Drug Name","Drug Dose","Drug Duration","Drug Time"};
        DefaultTableModel tmodelDefaultTableModel=(DefaultTableModel) jTable1.getModel();
        tmodelDefaultTableModel.setDataVector(tData, cols);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showPrescriptoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrescriptoinActionPerformed
        // TODO add your handling code here:redirecting show panel
        String pdate=dateField.getText();
        String comp=complains.getText();
        String test=writeTest.getText();
        String vdate=vDate.getText();
        String id=pid.getText();
        String name=pname.getText();
        String age=page.getText();
        String sex=psex.getText();
        
        
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        
        jPanel1.add(showPrescription);
        jPanel1.repaint();
        jPanel1.revalidate();
        
        presentDate.setText(pdate);
        showTest.setText(test);
        complain.setText(comp);
        nDate.setText(vdate);
        patientid.setText(id);
        patientName.setText(name);
        patientAge.setText(age);
        patientSex.setText(sex);
       
    }//GEN-LAST:event_showPrescriptoinActionPerformed

    private void prescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeActionPerformed

        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(createPrescription);
        jPanel1.repaint();
        jPanel1.revalidate();

    }//GEN-LAST:event_prescribeActionPerformed

    private void pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pageActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ArrayList pInfo=new ArrayList();
        
        pInfo.add(pid.getText());
        pInfo.add(docname.getText());

        PatientDBConnect dbc =new PatientDBConnect();
        
        pInfo.add(pname.getText());
        pInfo.add(page.getText());
        pInfo.add(psex.getText());
        pInfo.add(pcontact.getText());

        System.out.println(pInfo);
        dbc.updatePatient(pInfo);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{

            ArrayList pInfo=new ArrayList();
            pInfo.add(pid.getText());
             pInfo.add(docname.getText());

            PatientDBConnect dbc =new PatientDBConnect();
            dbc.deletePatient(pInfo);
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            PatientDBConnect dbc=new PatientDBConnect();
            ResultSet rs= dbc.getResultSetBySearch(pid.getText(),docname.getText());
            while(rs.next())
            {   
                String dname=rs.getString("docname");
                String pId=Integer.toString(rs.getInt("pid"));
                String name=rs.getString("pname");
                String age=Integer.toString(rs.getInt("page"));
                String sex=rs.getString("psex");
                String contact=rs.getString("pcontact");
                
                pname.setText(name);
                page.setText(age);
                psex.setText(sex);
                pcontact.setText(contact);
                
                jTextArea2.setText(pId+"\t"+name+"\t\t"+age+"\t"+sex+"\t"+contact+"\t"+dname+"\n");
               
            }

        }
        catch(Exception e){
            System.out.println("Error : "+e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            PatientDBConnect dbc=new PatientDBConnect();
            ResultSet rs= dbc.getResultPatient(docname.getText());
            jTextArea2.setText(null);
            while(rs.next())
            {   
                String dname=rs.getString("docname");
                String id=Integer.toString(rs.getInt("pid"));
                String name=rs.getString("pname");
                String age=Integer.toString(rs.getInt("page"));
                String sex=rs.getString("psex");
                String contact=rs.getString("pcontact");
                
                jTextArea2.setText(jTextArea2.getText()+"\n"+id+"\t"+name+"\t\t"+age+"\t"+sex+"\t"+contact+"\t"+dname+"\n");
            
            }

        }
        catch(Exception e){
            System.out.println("Error : "+e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ArrayList pInfo=new ArrayList();
        pInfo.add(docname.getText());
        pInfo.add(pid.getText());
        pInfo.add(pname.getText());
        pInfo.add(page.getText());
        pInfo.add(psex.getText());

        pInfo.add(pcontact.getText());

        PatientDBConnect dbc =new PatientDBConnect();
        System.out.println(pInfo);
        dbc.insertIntoPatient(pInfo);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcontactActionPerformed

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFieldActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"This App is developed using JAVA!");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
       PrinterJob jb=PrinterJob.getPrinterJob();
       jb.setJobName("Printable");
       jb.setPrintable(new Printable()
       {
           public int print(Graphics g,PageFormat pf,int num)
           {
               if(num>0)
               {
                   return Printable.NO_SUCH_PAGE;
               }
               Graphics2D g2=(Graphics2D)g;
               g2.translate(pf.getImageableX(),pf.getImageableY());
               jPanel2.paint(g2);
               return Printable.PAGE_EXISTS;
           }
       });
       boolean ok=jb.printDialog();
       if(ok)
       {
           JOptionPane.showMessageDialog(null,"Printing...");
           try
           {
               jb.print();
               JOptionPane.showMessageDialog(null,"Printing Complete!");
           }
           catch(PrinterException e)
           {
               System.out.println("Error : "+e.getMessage());
           }
       }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        PrinterJob jb=PrinterJob.getPrinterJob();
       jb.setJobName("Printable");
       jb.setPrintable(new Printable()
       {
           public int print(Graphics g,PageFormat pf,int num)
           {
               if(num>0)
               {
                   return Printable.NO_SUCH_PAGE;
               }
               Graphics2D g2=(Graphics2D)g;
               g2.translate(pf.getImageableX(),pf.getImageableY());
               jPanel2.paint(g2);
               return Printable.PAGE_EXISTS;
           }
       });
       boolean ok=jb.printDialog();
       if(ok)
       {
           JOptionPane.showMessageDialog(null,"Printing...");
           try
           {
               jb.print();
               JOptionPane.showMessageDialog(null,"Printing Complete!");
           }
           catch(PrinterException e)
           {
               System.out.println("Error : "+e.getMessage());
           }
       }
    }//GEN-LAST:event_printActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        
        jPanel1.add(Patient);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        
        jPanel1.add(createPrescription);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(PrescriptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrescriptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrescriptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrescriptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrescriptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Dose;
    private javax.swing.JPanel Patient;
    private javax.swing.JLabel Sex;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea complain;
    private javax.swing.JTextArea complains;
    private javax.swing.JLabel contactNo;
    private javax.swing.JPanel createPrescription;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel docname;
    private javax.swing.JLabel doctorName;
    private javax.swing.JTextField drugDuration;
    private javax.swing.JTextField drugName;
    private javax.swing.JTextField drugTime;
    private javax.swing.JLabel email;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField nDate;
    private javax.swing.JTextField page;
    private javax.swing.JTextField patientAge;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField patientSex;
    private javax.swing.JTextField patientid;
    private javax.swing.JTextField pcontact;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JButton prescribe;
    private javax.swing.JTextField presentDate;
    private javax.swing.JButton print;
    private javax.swing.JTextField psex;
    private javax.swing.JPanel showPrescription;
    private javax.swing.JButton showPrescriptoin;
    private javax.swing.JTextArea showTest;
    private javax.swing.JTextField vDate;
    private javax.swing.JTextArea writeTest;
    // End of variables declaration//GEN-END:variables
}
