package hospital_managment_project;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Hospital_Update extends javax.swing.JFrame {

    Connection ct = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Statement st = null;
    int id = 0;

    public Hospital_Update() {
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        //      int h=(int) tk.getScreenSize().getHeight();
        ///    int w=(int) tk.getScreenSize().getWidth();
        //  this.setSize(w, h);
        // getContentPane().setBackground(Color.White);

        setIconImage(tk.getImage(getClass().getResource("Loghu__Hospital.jpg")));
      
        show_test_Id();
        show_oparetion_Id();
        View_Word_Bed_Price();
        show_date();
      //  View_Doctor_TAble();
         View_Test_TAble();
         View_Oparetion_TAble();
    }

  
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField11 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/Close3.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(1310, 0, 59, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Back.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 140, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Hospital_Update.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(170, 0, 1040, 130);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1220, 100, 150, 40);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14);
        jLabel14.setBounds(1250, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 140);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTabbedPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabbedPane1KeyPressed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel23);
        jLabel23.setBounds(60, 360, 400, 50);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Test Id");
        jPanel8.add(jLabel15);
        jLabel15.setBounds(40, 110, 100, 40);

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });
        jPanel8.add(jTextField8);
        jTextField8.setBounds(200, 110, 200, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Test Name ");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(40, 160, 110, 40);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel8.add(jTextField9);
        jTextField9.setBounds(200, 160, 200, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Test  Fee");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(40, 210, 100, 40);

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });
        jPanel8.add(jTextField10);
        jTextField10.setBounds(200, 210, 200, 40);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel38);
        jLabel38.setBounds(520, 400, 840, 50);

        jTable4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable4.setForeground(new java.awt.Color(51, 51, 51));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Id", "Test  Name", "Test  Fee", "Date"
            }
        ));
        jTable4.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel8.add(jScrollPane4);
        jScrollPane4.setBounds(520, 100, 840, 300);

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel8.add(jTextField11);
        jTextField11.setBounds(520, 60, 130, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Print");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel6);
        jLabel6.setBounds(1110, 60, 90, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/clear.png"))); // NOI18N
        jLabel12.setText("Clear");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel12);
        jLabel12.setBounds(270, 470, 210, 70);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/addm.png"))); // NOI18N
        jLabel13.setText("Add");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel13);
        jLabel13.setBounds(60, 470, 190, 80);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Update.png"))); // NOI18N
        jLabel22.setText("Update");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel22);
        jLabel22.setBounds(900, 460, 300, 70);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Delete.jpg"))); // NOI18N
        jLabel26.setText("Delete");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel26);
        jLabel26.setBounds(620, 460, 240, 70);

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel90MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel90);
        jLabel90.setBounds(1290, 0, 90, 80);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Hospital.jpg"))); // NOI18N
        jPanel8.add(jLabel36);
        jLabel36.setBounds(10, -6, 1370, 570);

        jTabbedPane1.addTab("                         Test                            ", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel24);
        jLabel24.setBounds(40, 360, 400, 50);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Oparetion Id");
        jPanel9.add(jLabel19);
        jLabel19.setBounds(30, 120, 170, 30);

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel9.add(jTextField12);
        jTextField12.setBounds(190, 120, 220, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Oparetion Name ");
        jPanel9.add(jLabel20);
        jLabel20.setBounds(30, 160, 160, 30);

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField13KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });
        jPanel9.add(jTextField13);
        jTextField13.setBounds(190, 160, 220, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Oparetion Fee");
        jPanel9.add(jLabel21);
        jLabel21.setBounds(30, 200, 160, 30);

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField14KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });
        jPanel9.add(jTextField14);
        jTextField14.setBounds(190, 200, 220, 30);

        jTable5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oparetion Id", "Oparetion Name", "Oparetion  Fee", "Date"
            }
        ));
        jTable5.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable5MouseEntered(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jPanel9.add(jScrollPane5);
        jScrollPane5.setBounds(470, 110, 790, 300);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel42);
        jLabel42.setBounds(470, 410, 790, 50);

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(255, 255, 255));
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel9.add(jTextField19);
        jTextField19.setBounds(470, 70, 130, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Print");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel7);
        jLabel7.setBounds(1160, 70, 90, 40);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/clear.png"))); // NOI18N
        jLabel31.setText("Clear");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel31);
        jLabel31.setBounds(240, 470, 220, 70);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/addm.png"))); // NOI18N
        jLabel32.setText("Add");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel32);
        jLabel32.setBounds(40, 470, 190, 70);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Update.png"))); // NOI18N
        jLabel33.setText("Update");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel33);
        jLabel33.setBounds(850, 470, 320, 70);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Delete.jpg"))); // NOI18N
        jLabel34.setText("Delete");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel34);
        jLabel34.setBounds(540, 470, 250, 70);

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel89MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel89);
        jLabel89.setBounds(1290, 0, 90, 80);

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Hospital.jpg"))); // NOI18N
        jPanel9.add(jLabel37);
        jLabel37.setBounds(10, -6, 1370, 570);

        jTabbedPane1.addTab("                       Oparetion                      ", jPanel9);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(null);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Word No");
        jPanel12.add(jLabel27);
        jLabel27.setBounds(60, 120, 100, 40);

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField15KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
            }
        });
        jPanel12.add(jTextField15);
        jTextField15.setBounds(170, 120, 200, 40);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Bed No");
        jPanel12.add(jLabel28);
        jLabel28.setBounds(60, 160, 110, 40);

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(255, 255, 255));
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField16MouseClicked(evt);
            }
        });
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField16KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField16KeyTyped(evt);
            }
        });
        jPanel12.add(jTextField16);
        jTextField16.setBounds(170, 160, 200, 40);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Bed Price");
        jPanel12.add(jLabel29);
        jLabel29.setBounds(60, 200, 100, 40);

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField17KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField17KeyTyped(evt);
            }
        });
        jPanel12.add(jTextField17);
        jTextField17.setBounds(170, 200, 200, 40);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jLabel39);
        jLabel39.setBounds(560, 380, 680, 40);

        jTable6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Word No", "Bed No", "Bed Price", "Date"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel12.add(jScrollPane6);
        jScrollPane6.setBounds(620, 120, 530, 250);

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jLabel30);
        jLabel30.setBounds(80, 330, 520, 50);

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(255, 255, 255));
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel12.add(jTextField20);
        jTextField20.setBounds(620, 80, 130, 40);

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(255, 255, 255));
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel12.add(jTextField21);
        jTextField21.setBounds(750, 80, 130, 40);

        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField22KeyTyped(evt);
            }
        });
        jPanel12.add(jTextField22);
        jTextField22.setBounds(880, 80, 130, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Print");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel8);
        jLabel8.setBounds(1060, 80, 90, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/addm.png"))); // NOI18N
        jLabel4.setText("Add");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel4);
        jLabel4.setBounds(120, 460, 200, 80);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/clear.png"))); // NOI18N
        jLabel9.setText("Clear");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel9);
        jLabel9.setBounds(360, 460, 200, 70);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Update.png"))); // NOI18N
        jLabel10.setText("Update");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel10);
        jLabel10.setBounds(940, 450, 270, 80);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Delete.jpg"))); // NOI18N
        jLabel11.setText("Delete");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel11);
        jLabel11.setBounds(630, 460, 260, 60);

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel88MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel88);
        jLabel88.setBounds(1290, 0, 90, 80);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Hospital.jpg"))); // NOI18N
        jPanel12.add(jLabel35);
        jLabel35.setBounds(10, -6, 1370, 570);

        jTabbedPane1.addTab("                       Ward And Bed                   ", jPanel12);

        desktopPane.add(jTabbedPane1);
        jTabbedPane1.setBounds(-10, 130, 1390, 620);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1371, 737));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         Main_Frame_MDI mm=new Main_Frame_MDI();
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
   
    public void contest() {

        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   


    public int show_test_Id() {
        contest();
        ps = null;
        // cleardata();
        String select = "SELECT `M_T_Id` FROM `medical_test_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
            jTextField8.setText("" + id);
            jTextField9.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date dt=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
 //((JTextField)jDateChooser2.getDateEditor().getUiComponent()).setText(""+df.format(dt));
        return id;
    }
public void show_date(){
        Date dt=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
jLabel5.setText(df.format(dt));
jTextField9.requestFocus();
//((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
    }
    public int show_oparetion_Id() {
        contest();
        ps = null;
        // cleardata();
        String select = "SELECT `O_Id` FROM `oparetiont_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
            jTextField12.setText("" + id);
            jTextField13.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
     public int word_bad() {
     if(jTextField15.getText().isEmpty()) {
     jLabel30.setText("'Word No Is Empty'");
     jTextField15.requestFocus();
     }else { contest();
        id=0;
        ps = null;
        // cleardata();
        String select = "SELECT`Bed` FROM `wb` WHERE `Word`='"+jTextField15.getText()+"'";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
            jTextField16.setText("" + id);
           jTextField17.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
     return id; }
    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField9ActionPerformed
   
    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField10.requestFocus();
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jTabbedPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField13.requestFocus();
        }
    }//GEN-LAST:event_jTabbedPane1KeyPressed

    private void jTextField13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField14.requestFocus();
        }
    }//GEN-LAST:event_jTextField13KeyPressed
    public void View_Word_Bed_Price() {
        contest();
        DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
        String s = "SELECT `Word`,`Bed`,`Bed_Price`,`Date` FROM `wb`";
        try {
            ps = ct.prepareCall(s);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3),rs.getDate(4)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void View_Test_TAble() {
        contest();
        DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
        String s = "SELECT `M_T_Id`,`M_T_Nmae`,`M_T_Price`,`Date` FROM `medical_test_info`";
        try {
            ps = ct.prepareCall(s);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getDate(4)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void View_Oparetion_TAble() {
        contest();
        DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
        String s = "SELECT`O_Id`,`O_Name`,`O_Price`,`Date` FROM `oparetiont_info`";
        try {
            ps = ct.prepareCall(s);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getDate(4)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jTextField15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        word_bad();
        }
    }//GEN-LAST:event_jTextField15KeyPressed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16KeyPressed

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jTextField17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField17KeyTyped

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
        
        jTextField11.setText(dt.getValueAt(jTable4.getSelectedRow(),0).toString());
        jTextField9.setText(dt.getValueAt(jTable4.getSelectedRow(), 1).toString());
        jTextField10.setText(dt.getValueAt(jTable4.getSelectedRow(), 2).toString());
        
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
            DefaultTableModel dt=(DefaultTableModel) jTable5.getModel();
        
        jTextField19.setText(dt.getValueAt(jTable5.getSelectedRow(),0).toString());
        jTextField13.setText(dt.getValueAt(jTable5.getSelectedRow(),1).toString());
        jTextField14.setText(dt.getValueAt(jTable5.getSelectedRow(),2).toString());
    }//GEN-LAST:event_jTable5MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dt=(DefaultTableModel) jTable6.getModel();
        
        jTextField20.setText(dt.getValueAt(jTable6.getSelectedRow(),0).toString());
        jTextField21.setText(dt.getValueAt(jTable6.getSelectedRow(),1).toString());
        jTextField22.setText(dt.getValueAt(jTable6.getSelectedRow(),2).toString());
       
       
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTable5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5MouseEntered

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    Reception_1st rc1=new Reception_1st();
        rc1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
     
 Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
 
        if (jTextField9.getText().isEmpty()) {
            jLabel23.setText("'Please Enter The Test Name'");
        } else if (jTextField10.getText().isEmpty()) {
            jLabel23.setText("'Please Enter The Test Fee'");
        } else {   int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The Test...???", "Add Test", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
            contest();
            ps = null;
            String D = "INSERT INTO `medical_test_info`(`M_T_Id`,`M_T_Nmae`,`M_T_Price`,`Date`)VALUES (?,?,?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField8.getText());
                ps.setString(2, jTextField9.getText());
                ps.setString(3, jTextField10.getText());
                ps.setString(4,df.format(dte) );
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel23.setText("''Test Has Been Add''");
                    jTextField8.requestFocus();
                    jTextField9.setText("");
                    jTextField10.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
            show_test_Id();
            DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);
            }
        }
            View_Test_TAble();
            
        }
        }
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jTextField14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyPressed
        // TODO add your handling code here:
   if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if (jTextField13.getText().isEmpty()) {
            jLabel24.setText("'Please Enter The Oparetion Name'");
        } else if (jTextField14.getText().isEmpty()) {
            jLabel24.setText("'Please Enter The Oparation Fee'");
        } else {          int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The Oparetion...???", "Add Oparetion", JOptionPane.YES_NO_OPTION);
 
        if(p==0){ 
            Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
             contest();
            ps = null;
            String D = "INSERT INTO `oparetiont_info`(`O_Id`,`O_Name`,`O_Price`,`Date`) VALUES (?,?,?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField12.getText());
                ps.setString(2, jTextField13.getText());
                ps.setString(3, jTextField14.getText());
                ps.setString(4, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel24.setText("''Oparetion Has Been Add''");
                    jTextField13.requestFocus();
                    jTextField13.setText("");
                    jTextField14.setText("");
                    show_oparetion_Id();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
 DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);
            }
        }
            View_Oparetion_TAble();
        }
        }}
    }//GEN-LAST:event_jTextField14KeyPressed

    private void jTextField16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseClicked
        // TODO add your handling code here:
        word_bad();
    }//GEN-LAST:event_jTextField16MouseClicked

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
        // TODO add your handling code here:
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if (jTextField15.getText().isEmpty()) {
            jLabel30.setText("'Please Enter Word No'");
            jTextField15.requestFocus();
        } else if (jTextField16.getText().isEmpty()) {
            jLabel30.setText("'Please Enter Bed NO'");
            jTextField16.requestFocus();
        } else if (jTextField17.getText().isEmpty()) {
            jLabel30.setText("'Please Enter Bed Price'");
            jTextField17.requestFocus();
        } else {     int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The word Or Bed...???", "Add Word Or Bed", JOptionPane.YES_NO_OPTION);
    if(p==0){ 
             Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
 //((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dte));
            contest();
            String s = "INSERT INTO `wb`(`Word`,`Bed`,`Bed_Price`,`Date`)VALUES (?,?,?,?)";
            PreparedStatement ps = null;
            try {
                ps = ct.prepareCall(s);
                ps.setString(1, jTextField15.getText());
                ps.setString(2, jTextField16.getText());
                ps.setString(3, jTextField17.getText());
              ps.setString(4,df.format(dte));
                ps.executeUpdate();
                jLabel30.setText("''Word And Bed Add Success''");
                jTextField15.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField15.requestFocus();
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
            while (dt.getRowCount() > 0) {
                for (int i = 0; i < dt.getRowCount(); i++) {
                    dt.removeRow(i);
                }
            }
            View_Word_Bed_Price();
        }
        }}
    }//GEN-LAST:event_jTextField17KeyPressed

    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField15KeyTyped

    private void jTextField22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField22KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField22KeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable4.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Hospital_Detailse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable5.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Hospital_Detailse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable6.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Hospital_Detailse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         
        if (jTextField15.getText().isEmpty()) {
            jLabel30.setText("'Please Enter Word No'");
            jTextField15.requestFocus();
        } else if (jTextField16.getText().isEmpty()) {
            jLabel30.setText("'Please Enter Bed NO'");
            jTextField16.requestFocus();
        } else if (jTextField17.getText().isEmpty()) {
            jLabel30.setText("'Please Enter Bed Price'");
            jTextField17.requestFocus();
        } else {  int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The Word Or Bed...???", "Add Word Or Bed", JOptionPane.YES_NO_OPTION);
       
        if(p==0){
             Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
 //((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dte));
            contest();
            String s = "INSERT INTO `wb`(`Word`,`Bed`,`Bed_Price`,`Date`)VALUES (?,?,?,?)";
            PreparedStatement ps = null;
            try {
                ps = ct.prepareCall(s);
                ps.setString(1, jTextField15.getText());
                ps.setString(2, jTextField16.getText());
                ps.setString(3, jTextField17.getText());
              ps.setString(4,df.format(dte));
                ps.executeUpdate();
                jLabel30.setText("''Word And Bed Has Been Add''");
                jTextField15.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField15.requestFocus();
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
            while (dt.getRowCount() > 0) {
                for (int i = 0; i < dt.getRowCount(); i++) {
                    dt.removeRow(i);
                }
            }
            View_Word_Bed_Price();
        }}
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
         jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jLabel30.setText("");
    jTextField20.setText("");
     jTextField21.setText("");
     jTextField22.setText("");  
     jLabel39.setText("");
     jLabel39.setText("");
        jTextField15.requestFocus();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        if (jTextField20.getText().isEmpty()) {
            jLabel39.setText("'Please Enter The Word No'");
        } else if (jTextField21.getText().isEmpty()) {
            jLabel39.setText("'Please Enter The Bed No'");
        } 
         else if (jTextField22.getText().isEmpty()) {
            jLabel39.setText("'Please Enter The Bed Price'");
        }else {  
         int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Change The Oparetion...???", "Add Oparetion", JOptionPane.YES_NO_OPTION);
      if(p==0){
                Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
       // ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dte));
        String test="UPDATE `wb` SET `Bed_Price`='"+jTextField22.getText()+"',`Date`='"+df.format(dte)+"' WHERE `Word`='"+jTextField20.getText()+"' AND `Bed`='"+jTextField21.getText()+"'";   
        contest();
            try {ps=null;
                ps=ct.prepareCall(test);
                ps.execute();
                  jLabel39.setText("''Word No "+jTextField20.getText()+" And Bed No "+jTextField21.getText()+" Has Been Update''");
                    jTextField21.setText("");
                    jTextField22.setText("");
                     jTextField20.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
        dt.setRowCount(0);
        View_Word_Bed_Price();
        }}
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
 if (jTextField20.getText().isEmpty()) {
            jLabel39.setText("'Please Select The Word No'");
        }else if (jTextField21.getText().isEmpty()) {
            jLabel39.setText("'Please Select The Bed No'");
        } else { int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Delete The Word Or Bed...???", "Delete Word Or Bed", JOptionPane.YES_NO_OPTION);
           if(p==0){ 
            contest();
            ps = null;
            String insert = "DELETE FROM `wb` WHERE `Word`='"+jTextField20.getText()+"' AND `Bed`='"+jTextField21.getText()+"'";
            try {
                ps = ct.prepareCall(insert);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
              jTextField20.setText("");
                 jTextField21.setText("");
               jTextField22.setText("");          }
                }
                   jLabel39.setText("''Word No "+jTextField20.getText()+" And Bed No "+jTextField21.getText()+" Has Been Delete''");
               
                ps.executeUpdate();
             
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
         }
            View_Word_Bed_Price();
        }}
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        jLabel23.setText("");
        jTextField10.setText("");
        jTextField9.setText("");
        
        jLabel38.setText("");
          jTextField11.setText("");
          jTextField9.requestFocus();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        
            Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
 
        if (jTextField9.getText().isEmpty()) {
            jLabel23.setText("'Please Enter The Test Name'");
        } else if (jTextField10.getText().isEmpty()) {
            jLabel23.setText("'Please Enter The Test Fee'");
        } else {   int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The Test...???", "Add Test", JOptionPane.YES_NO_OPTION);
      if(p==0){
            contest();
            ps = null;
            String D = "INSERT INTO `medical_test_info`(`M_T_Id`,`M_T_Nmae`,`M_T_Price`,`Date`)VALUES (?,?,?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField8.getText());
                ps.setString(2, jTextField9.getText());
                ps.setString(3, jTextField10.getText());
                ps.setString(4,df.format(dte) );
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel23.setText("''Test Has Been Add''");
                    jTextField8.requestFocus();
                    jTextField9.setText("");
                    jTextField10.setText("");
                    jTextField11.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
            show_test_Id();
            DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);
            }
        }
            View_Test_TAble();
            
        }
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        
        Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
 //((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dte));
        String test="UPDATE `medical_test_info` SET `M_T_Nmae`='"+jTextField9.getText()+"',`M_T_Price`='"+jTextField10.getText()+"',`Date`='"+df.format(dte)+"' WHERE `M_T_Id`='"+jTextField11.getText()+"'";
         if (jTextField11.getText().isEmpty()) {
            jLabel38.setText("'Please Select Test ID From Test Table'");
        }else if (jTextField9.getText().isEmpty()) {
            jLabel23.setText("'Please Enter The Test Name'");
        } else if (jTextField10.getText().isEmpty()) {
            jLabel23.setText("'Please Enter The Test Fee'");
        } else {    int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Change The Test...???", "Change Test", JOptionPane.YES_NO_OPTION);
     
        if(p==0){
            contest();
            try {ps=null;
                ps=ct.prepareCall(test);
                ps.execute();
                  jLabel38.setText("''The Test Has Been Update''");
                    jTextField9.setText("");
                    jTextField10.setText("");
                    jTextField11.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);}   }
        View_Test_TAble();
        }}
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        
        if (jTextField11.getText().isEmpty()) {
            jLabel38.setText("'Please Select Test ID From Test Table'");
        } else {  int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Delete The Test...???", "Delete Test", JOptionPane.YES_NO_OPTION);
        if(p==0){
            contest();
            ps = null;
            String insert = "DELETE FROM `medical_test_info` WHERE `M_T_Id`='" + jTextField11.getText() + "'";
            try {
                ps = ct.prepareCall(insert);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
              ps.executeUpdate();
               jTextField11.setText("");
               jTextField10.setText("");
               jTextField9.setText(""); 
               jLabel38.setText("''The Test Has Been Deleted''");
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
         }
            View_Test_TAble();
        }}
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        jTextField13.setText("");
        jTextField14.setText("");
          jTextField19.setText("");
          jLabel42.setText("");
           jLabel24.setText("");
        jTextField13.requestFocus();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        if (jTextField13.getText().isEmpty()) {
            jLabel24.setText("'Please Enter The Oparetion Name'");
        } else if (jTextField14.getText().isEmpty()) {
            jLabel24.setText("'Please Enter The Oparation Fee'");
        } else {         int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The Oparetion...???", "Add Oparetion", JOptionPane.YES_NO_OPTION);
 
        if(p==0){ 
            Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
             contest();
            ps = null;
            String D = "INSERT INTO `oparetiont_info`(`O_Id`,`O_Name`,`O_Price`,`Date`) VALUES (?,?,?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField12.getText());
                ps.setString(2, jTextField13.getText());
                ps.setString(3, jTextField14.getText());
                ps.setString(4, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel24.setText("''Opretion Has Been Add''");
                    jTextField13.requestFocus();
                    jTextField13.setText("");
                    jTextField14.setText("");
                    show_oparetion_Id();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
 DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);
            }
        }
            View_Oparetion_TAble();
        }}
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        
            Date dte=new Date();
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
      //  ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dte));
        String test="UPDATE `oparetiont_info` SET `O_Name`='"+jTextField13.getText()+"',`O_Price`='"+jTextField14.getText()+"',`Date`='"+df.format(dte)+"' WHERE `O_Id`='"+jTextField19.getText()+"'";
        if(jTextField19.getText().isEmpty()){
         jLabel24.setText("'Please Select Oparetion ID From Oparetion Table'");
        }else if (jTextField13.getText().isEmpty()) {
            jLabel24.setText("'Please Enter The Oparetion Name'");
        } else if (jTextField14.getText().isEmpty()) {
       //     jLabel22.setText("Please Enter The Oparation Fee");
        } else { int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Change The Oparetion...???", "Change Oparetion", JOptionPane.YES_NO_OPTION);
       
        if(p==0){
            try {
                contest();
                ps=null;
                ps=ct.prepareCall(test);
                ps.execute();
                  jLabel42.setText("''Oparetion Has Been Update''");
                    jTextField19.setText("");
                    jTextField13.setText("");
                    jTextField14.setText("");
                
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
          DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);}   }
        View_Oparetion_TAble();
        }}
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
        
        if (jTextField19.getText().isEmpty()) {
            jLabel42.setText("'Please Select The Oparetion Id From Oparetion Table'");
        } else {   int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Delete The Test...???", "Delete Test", JOptionPane.YES_NO_OPTION);
   
        if(p==0){ 
            contest();
            ps = null;
            String insert = "DELETE FROM `oparetiont_info` WHERE `O_Id`='" + jTextField19.getText() + "'";
            try {
                ps = ct.prepareCall(insert);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);   } }
             // jTextField19.setText("");
                ps.executeUpdate();
                // jtable3_Clear();
                jLabel42.setText("''Oparetion Has Been Delete''");
                jTextField13.setText("");
        jTextField14.setText("");
          jTextField19.setText("");
        jTextField13.requestFocus();
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }   View_Oparetion_TAble();  }
        }
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel88MouseClicked

    private void jLabel89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel89MouseClicked

    private void jLabel90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel90MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Hospital_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
