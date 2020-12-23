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

public class Stup_Sallarry extends javax.swing.JFrame {

    Connection ct = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Statement st = null;
    int id = 0;
    int id2 = 0;
     int id3 = 0;
     int id4 = 0;
     int id5 = 0;
    ResultSet rss = null;
    PreparedStatement tps = null;
    PreparedStatement ops = null;
    int ft = 0;

    public Stup_Sallarry() {
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        //      int h=(int) tk.getScreenSize().getHeight();
        ///    int w=(int) tk.getScreenSize().getWidth();
        //  this.setSize(w, h);
        // getContentPane().setBackground(Color.White);

        setIconImage(tk.getImage(getClass().getResource("Loghu__Hospital.jpg")));
        show_date();
        show_id();
        jtable1_view();
        jtable2_view();
//show_id2();
jTextField38_show_id();
        show_id2();
        View_Doctor_TAble();
        show_Doctor_Id();
       View_jComboBox1_Id_Search();
      doctor_type_id(); 
      jtable3_view();
       View_jComboBox3_Id_Search();
       jtable4_view();
       View_jComboBox4_Id_Search();
       show_id_Sallarry();
       show_id_Doctor_Sallarry();
       View_jComboBox2_Id_Search();
        View_jComboBox5_Id_Search();
         jTextField37_show_id_Sallarry();
         jtable5_view();
         View_jComboBox7_Id_Search();
         jtable6_view();
    }

    public void show_date() {
       //jComboBox2.addItem("");
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        jLabel8.setText(df.format(dt));
//((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
    }
    public void View_jComboBox1_Id_Search(){
contest(); try {
 st=ct.createStatement();
    String i="SELECT `E2Id` FROM `employe_sallary2` GROUP BY`E2Id`"; 
    rs=st.executeQuery(i);
     while(rs.next()){
            jComboBox1.addItem(rs.getString(1));  
     }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void View_jComboBox5_Id_Search(){
contest(); try {
 st=ct.createStatement();
    String i="SELECT`E2Id`FROM`employe_sallary2` GROUP BY `E2Id`"; 
    rs=st.executeQuery(i);
     while(rs.next()){
            jComboBox5.addItem(rs.getString(1));  
     }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void View_jComboBox2_Id_Search(){
contest(); try {
 st=ct.createStatement();
    String i="SELECT `D_Id` FROM `d_type`"; 
    rs=st.executeQuery(i);
     while(rs.next()){
            jComboBox2.addItem(""+rs.getInt(1));  
     }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel38 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField26 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField21 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
        jLabel2.setBounds(1300, 0, 60, 60);

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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Employe.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(250, 0, 930, 140);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1210, 100, 150, 40);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel33);
        jLabel33.setBounds(1070, 100, 150, 40);

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel97MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel97);
        jLabel97.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1360, 140);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Employe Sallary");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 250, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(210, 460, 860, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Employe Type");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(50, 210, 130, 30);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField1);
        jTextField1.setBounds(200, 160, 140, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField2);
        jTextField2.setBounds(200, 200, 140, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(200, 240, 140, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Type Id");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 170, 90, 30);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type Id", "Employe Type", "Employe Sallary"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(390, 120, 452, 320);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField4);
        jTextField4.setBounds(1040, 160, 140, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Id");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(890, 170, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Employe Type");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(890, 210, 130, 30);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField5);
        jTextField5.setBounds(1040, 200, 140, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Employe Sallary");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(890, 250, 150, 30);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField6);
        jTextField6.setBounds(1040, 240, 140, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Print");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel15);
        jLabel15.setBounds(750, 80, 90, 40);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(51, 51, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/add2.png"))); // NOI18N
        jLabel69.setText("ok");
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel69);
        jLabel69.setBounds(120, 350, 140, 80);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(51, 51, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Update.png"))); // NOI18N
        jLabel70.setText("Update");
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel70);
        jLabel70.setBounds(910, 370, 310, 80);

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel85MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel85);
        jLabel85.setBounds(1270, 0, 90, 80);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Doctor_2.jpg"))); // NOI18N
        jPanel3.add(jLabel19);
        jLabel19.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Employe Type  ", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Employe Sallary");
        jPanel5.add(jLabel39);
        jLabel39.setBounds(100, 220, 150, 30);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel40);
        jLabel40.setBounds(220, 450, 940, 60);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setText("Doctor Type");
        jPanel5.add(jLabel41);
        jLabel41.setBounds(100, 180, 130, 30);

        jTextField22.setEditable(false);
        jTextField22.setBackground(new java.awt.Color(255, 255, 255));
        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel5.add(jTextField22);
        jTextField22.setBounds(250, 130, 140, 40);

        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField23KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField23KeyTyped(evt);
            }
        });
        jPanel5.add(jTextField23);
        jTextField23.setBounds(250, 170, 140, 40);

        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField25KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField25KeyTyped(evt);
            }
        });
        jPanel5.add(jTextField25);
        jTextField25.setBounds(250, 210, 140, 40);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("Type Id");
        jPanel5.add(jLabel42);
        jLabel42.setBounds(100, 140, 90, 30);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type Id", "Employe Type", "Employe Sallary"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(470, 130, 452, 320);

        jTextField26.setEditable(false);
        jTextField26.setBackground(new java.awt.Color(255, 255, 255));
        jTextField26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel5.add(jTextField26);
        jTextField26.setBounds(1160, 130, 140, 40);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText("Type Id");
        jPanel5.add(jLabel43);
        jLabel43.setBounds(1010, 140, 90, 30);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setText("Doctor Type");
        jPanel5.add(jLabel44);
        jLabel44.setBounds(1010, 180, 130, 30);

        jTextField27.setEditable(false);
        jTextField27.setBackground(new java.awt.Color(255, 255, 255));
        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel5.add(jTextField27);
        jTextField27.setBounds(1160, 170, 140, 40);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setText("Doctor Sallary");
        jPanel5.add(jLabel45);
        jLabel45.setBounds(1010, 220, 150, 30);

        jTextField28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField28KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField28KeyTyped(evt);
            }
        });
        jPanel5.add(jTextField28);
        jTextField28.setBounds(1160, 210, 140, 40);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel64.setText("Print");
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel64);
        jLabel64.setBounds(830, 90, 90, 40);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(51, 51, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Update.png"))); // NOI18N
        jLabel72.setText("Update");
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel72);
        jLabel72.setBounds(1050, 350, 260, 80);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 51, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/add2.png"))); // NOI18N
        jLabel71.setText("ok");
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel71MouseEntered(evt);
            }
        });
        jPanel5.add(jLabel71);
        jLabel71.setBounds(180, 350, 140, 70);

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel86);
        jLabel86.setBounds(1270, 0, 90, 80);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Doctor_2.jpg"))); // NOI18N
        jPanel5.add(jLabel32);
        jLabel32.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Doctor Type  ", jPanel5);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Id");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 80, 150, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("BirthDay");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 320, 150, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Address");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 240, 150, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Name");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(40, 200, 150, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("MObile Number ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(40, 280, 150, 40);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(210, 410, 790, 50);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(190, 80, 210, 40);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField9);
        jTextField9.setBounds(190, 200, 210, 40);

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField10);
        jTextField10.setBounds(190, 240, 210, 40);

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(190, 280, 210, 40);

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField12);
        jTextField12.setBounds(190, 360, 210, 40);

        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyPressed(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(190, 320, 210, 40);

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Employe Type", "Employe ID", "Name", "Birthday", "Address", "Mobile Numner", "Detsilse", "Join Date"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable2MouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(420, 120, 570, 280);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Detailse");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(40, 360, 150, 40);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setText("Employe Type Id");
        jPanel1.add(jLabel46);
        jLabel46.setBounds(40, 120, 150, 40);

        jTable4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type Id", "Employe Type", "Employe Sallary"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(1020, 120, 300, 280);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jComboBox4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox4KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(190, 120, 210, 40);

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(255, 255, 255));
        jTextField29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField29);
        jTextField29.setBounds(490, 80, 150, 40);

        jTextField30.setEditable(false);
        jTextField30.setBackground(new java.awt.Color(255, 255, 255));
        jTextField30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField30);
        jTextField30.setBounds(420, 80, 70, 40);

        jTextField31.setEditable(false);
        jTextField31.setBackground(new java.awt.Color(255, 255, 255));
        jTextField31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField31);
        jTextField31.setBounds(640, 80, 150, 40);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setText("Employe Id");
        jPanel1.add(jLabel58);
        jLabel58.setBounds(40, 160, 150, 40);

        jTextField39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField39KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField39KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField39KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField39);
        jTextField39.setBounds(190, 160, 210, 40);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel65.setText("Print");
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel65);
        jLabel65.setBounds(900, 80, 90, 40);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(51, 51, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/clear.png"))); // NOI18N
        jLabel73.setText("Clear");
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel73MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel73);
        jLabel73.setBounds(970, 470, 230, 70);

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(51, 51, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/add2.png"))); // NOI18N
        jLabel74.setText("Add");
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel74MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel74);
        jLabel74.setBounds(110, 470, 210, 64);

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(51, 51, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Update.png"))); // NOI18N
        jLabel75.setText("Update");
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel75MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel75MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel75);
        jLabel75.setBounds(360, 470, 270, 70);

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(51, 51, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Delete.jpg"))); // NOI18N
        jLabel76.setText("Delete");
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel76MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel76);
        jLabel76.setBounds(700, 460, 250, 80);

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel87MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel87);
        jLabel87.setBounds(1270, 0, 90, 80);

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Doctor_2.jpg"))); // NOI18N
        jPanel1.add(jLabel92);
        jLabel92.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Employ Add ", jPanel1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel22);
        jLabel22.setBounds(30, 420, 450, 40);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Id");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(40, 60, 190, 40);

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(255, 255, 255));
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel7.add(jTextField13);
        jTextField13.setBounds(230, 60, 220, 40);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Doctor Name ");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(40, 100, 190, 40);

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField14KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField14);
        jTextField14.setBounds(230, 100, 220, 40);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Doctor Fee");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(40, 140, 190, 30);

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField15KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField15);
        jTextField15.setBounds(230, 140, 220, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Doctor Qualification");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(40, 170, 190, 40);

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField16KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField16KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField16);
        jTextField16.setBounds(230, 170, 220, 40);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Doctor Number");
        jPanel7.add(jLabel27);
        jLabel27.setBounds(40, 290, 190, 40);

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField17KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField17KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField17);
        jTextField17.setBounds(230, 290, 220, 40);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("DoctorBirthDay");
        jPanel7.add(jLabel28);
        jLabel28.setBounds(40, 250, 190, 40);

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField18KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField18KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField18);
        jTextField18.setBounds(230, 330, 220, 40);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Doctor Type ID");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(40, 370, 190, 40);

        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField19KeyPressed(evt);
            }
        });
        jPanel7.add(jTextField19);
        jTextField19.setBounds(230, 210, 220, 40);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Doctor Age");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(40, 330, 190, 40);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Doctor Address");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(40, 210, 190, 40);

        jDateChooser2.setDateFormatString("yyyy,MM,dd");
        jDateChooser2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser2KeyPressed(evt);
            }
        });
        jPanel7.add(jDateChooser2);
        jDateChooser2.setBounds(230, 250, 220, 40);

        jTable7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", "Type", "Doctor Id", "Name", "Fee", "Qualification", "Address", "BirthDay", "Number", "Age"
            }
        ));
        jTable7.setGridColor(new java.awt.Color(255, 255, 255));
        jTable7.setName(""); // NOI18N
        jTable7.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);

        jPanel7.add(jScrollPane7);
        jScrollPane7.setBounds(470, 110, 830, 300);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel35);
        jLabel35.setBounds(470, 420, 830, 50);

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(255, 255, 255));
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField20);
        jTextField20.setBounds(470, 70, 70, 40);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jComboBox3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox3KeyPressed(evt);
            }
        });
        jPanel7.add(jComboBox3);
        jComboBox3.setBounds(230, 370, 130, 40);

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(255, 255, 255));
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(jTextField21);
        jTextField21.setBounds(540, 70, 150, 40);

        jTextField40.setEditable(false);
        jTextField40.setBackground(new java.awt.Color(255, 255, 255));
        jTextField40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel7.add(jTextField40);
        jTextField40.setBounds(360, 370, 90, 40);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel66.setText("Print");
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel66);
        jLabel66.setBounds(1200, 70, 90, 40);

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(51, 51, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/add2.png"))); // NOI18N
        jLabel77.setText("Add");
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel77MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel77);
        jLabel77.setBounds(100, 470, 220, 70);

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 51, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/clear.png"))); // NOI18N
        jLabel78.setText("Clear");
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel78MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel78MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel78);
        jLabel78.setBounds(950, 470, 220, 60);

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(51, 51, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Delete.jpg"))); // NOI18N
        jLabel79.setText("Delete");
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel79MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel79MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel79);
        jLabel79.setBounds(680, 470, 240, 70);

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 51, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Update.png"))); // NOI18N
        jLabel80.setText("Update");
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel80MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel80);
        jLabel80.setBounds(350, 470, 260, 70);

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel88MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel88);
        jLabel88.setBounds(1270, 0, 90, 80);

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Doctor_2.jpg"))); // NOI18N
        jPanel7.add(jLabel93);
        jLabel93.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Doctor Add ", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setText("Doctor  id");
        jPanel9.add(jLabel59);
        jLabel59.setBounds(80, 160, 130, 40);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setText("Id");
        jPanel9.add(jLabel60);
        jLabel60.setBounds(80, 80, 130, 40);

        jTextField38.setEditable(false);
        jTextField38.setBackground(new java.awt.Color(255, 255, 255));
        jTextField38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel9.add(jTextField38);
        jTextField38.setBounds(210, 80, 240, 40);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setText("Date");
        jPanel9.add(jLabel61);
        jLabel61.setBounds(80, 200, 130, 40);

        jDateChooser4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.add(jDateChooser4);
        jDateChooser4.setBounds(210, 200, 240, 40);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel63);
        jLabel63.setBounds(10, 260, 450, 60);

        jTable6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Type", "Doctor ID", "Date"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jPanel9.add(jScrollPane6);
        jScrollPane6.setBounds(480, 80, 380, 310);

        jComboBox8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        jComboBox8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox8KeyPressed(evt);
            }
        });
        jPanel9.add(jComboBox8);
        jComboBox8.setBounds(210, 160, 240, 40);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setText("Doctor Type");
        jPanel9.add(jLabel62);
        jLabel62.setBounds(80, 120, 130, 40);

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jComboBox7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox7KeyPressed(evt);
            }
        });
        jPanel9.add(jComboBox7);
        jComboBox7.setBounds(210, 120, 240, 40);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel68.setText("Print");
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel68);
        jLabel68.setBounds(770, 40, 90, 40);

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(51, 51, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Attendence.jpg"))); // NOI18N
        jLabel84.setText("Attendence");
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel84MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel84MouseEntered(evt);
            }
        });
        jPanel9.add(jLabel84);
        jLabel84.setBounds(40, 410, 400, 80);

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel89MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel89);
        jLabel89.setBounds(1270, 0, 90, 80);

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Doctor_2.jpg"))); // NOI18N
        jPanel9.add(jLabel94);
        jLabel94.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab("Doctor Attendence ", jPanel9);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setText("Employe id");
        jPanel8.add(jLabel53);
        jLabel53.setBounds(80, 160, 130, 40);

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jComboBox5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox5KeyPressed(evt);
            }
        });
        jPanel8.add(jComboBox5);
        jComboBox5.setBounds(210, 120, 240, 40);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setText("Id");
        jPanel8.add(jLabel54);
        jLabel54.setBounds(80, 80, 130, 40);

        jTextField37.setEditable(false);
        jTextField37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel8.add(jTextField37);
        jTextField37.setBounds(210, 80, 240, 40);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setText("Date");
        jPanel8.add(jLabel55);
        jLabel55.setBounds(80, 200, 130, 40);

        jDateChooser3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser3KeyPressed(evt);
            }
        });
        jPanel8.add(jDateChooser3);
        jDateChooser3.setBounds(210, 200, 240, 40);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setText("Employe Type");
        jPanel8.add(jLabel56);
        jLabel56.setBounds(80, 120, 130, 40);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel57);
        jLabel57.setBounds(10, 260, 460, 50);

        jTable5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employe ID", "Employe Type", "Date"
            }
        ));
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(1).setHeaderValue("Employe Type");
        }

        jPanel8.add(jScrollPane5);
        jScrollPane5.setBounds(480, 80, 410, 340);

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jComboBox6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox6KeyPressed(evt);
            }
        });
        jPanel8.add(jComboBox6);
        jComboBox6.setBounds(210, 160, 240, 40);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel67.setText("Print");
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel67);
        jLabel67.setBounds(800, 40, 90, 40);

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(51, 51, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Attendence.jpg"))); // NOI18N
        jLabel81.setText("Attendence");
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel81MouseEntered(evt);
            }
        });
        jPanel8.add(jLabel81);
        jLabel81.setBounds(70, 360, 370, 80);

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel91MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel91);
        jLabel91.setBounds(1270, 0, 90, 80);

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Doctor_2.jpg"))); // NOI18N
        jPanel8.add(jLabel95);
        jLabel95.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Employe Attendence ", jPanel8);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Employe Type");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(140, 130, 130, 40);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Salary");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(140, 210, 130, 40);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("Id");
        jPanel4.add(jLabel36);
        jLabel36.setBounds(140, 90, 130, 40);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel37);
        jLabel37.setBounds(30, 300, 590, 60);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(270, 130, 240, 40);

        jTextField32.setEditable(false);
        jTextField32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField32KeyPressed(evt);
            }
        });
        jPanel4.add(jTextField32);
        jTextField32.setBounds(270, 210, 240, 40);

        jTextField33.setEditable(false);
        jTextField33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField33);
        jTextField33.setBounds(270, 90, 240, 40);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setText("Employe id");
        jPanel4.add(jLabel47);
        jLabel47.setBounds(140, 170, 130, 40);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel48);
        jLabel48.setBounds(680, 300, 620, 70);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setText("Id");
        jPanel4.add(jLabel49);
        jLabel49.setBounds(740, 90, 130, 40);

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(255, 255, 255));
        jTextField34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField34);
        jTextField34.setBounds(870, 90, 240, 40);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setText("Doctor id");
        jPanel4.add(jLabel50);
        jLabel50.setBounds(740, 170, 120, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox2KeyReleased(evt);
            }
        });
        jPanel4.add(jComboBox2);
        jComboBox2.setBounds(870, 130, 240, 40);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setText("Doctor Type");
        jPanel4.add(jLabel51);
        jLabel51.setBounds(740, 130, 130, 40);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel52.setText("Salary");
        jPanel4.add(jLabel52);
        jLabel52.setBounds(740, 210, 130, 40);

        jTextField36.setEditable(false);
        jTextField36.setBackground(new java.awt.Color(255, 255, 255));
        jTextField36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField36KeyPressed(evt);
            }
        });
        jPanel4.add(jTextField36);
        jTextField36.setBounds(870, 210, 240, 40);

        jComboBox9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        jComboBox9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox9KeyPressed(evt);
            }
        });
        jPanel4.add(jComboBox9);
        jComboBox9.setBounds(270, 170, 240, 40);

        jComboBox10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });
        jComboBox10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox10KeyPressed(evt);
            }
        });
        jPanel4.add(jComboBox10);
        jComboBox10.setBounds(870, 170, 240, 40);

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Salary.png"))); // NOI18N
        jLabel82.setText("Add");
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel82MouseEntered(evt);
            }
        });
        jPanel4.add(jLabel82);
        jLabel82.setBounds(220, 400, 250, 80);

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 51, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Salary.png"))); // NOI18N
        jLabel83.setText("Add");
        jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel83MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel83MouseEntered(evt);
            }
        });
        jPanel4.add(jLabel83);
        jLabel83.setBounds(820, 410, 310, 60);

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel90MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel90);
        jLabel90.setBounds(1270, 0, 90, 80);

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Doctor_2.jpg"))); // NOI18N
        jPanel4.add(jLabel96);
        jLabel96.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab("Salary", jPanel4);

        desktopPane.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 130, 1360, 610);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1362, 739));
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
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public int show_id() {
        contest();
        ps = null;// cleardata();
        String select = "SELECT `E_Id` FROM `empllye_sallary`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
            jTextField1.setText("" + id);
            jTextField2.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
     public int jTextField38_show_id() {
        contest();
        id=0;
        ps = null;// cleardata();
        String select = "SELECT `id` FROM `doctora_attendenc`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
          jTextField38.setText("" + id);
          ///  jTextField2.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public int show_id_Sallarry() {
        contest();
        ps = null;// cleardata();
        String select = "SELECT `E_S_ID` FROM `employe_sallary_test`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id4 = rs.getInt(1);
            }
            id4 = id4 + 1;
            jTextField33.setText("" + id4);
            
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id4;
    }
    public int jTextField37_show_id_Sallarry() {
        contest();
           id4=0;
        ps = null;// cleardata();
        String select = "SELECT `Id` FROM `employe_attendence`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id4 = rs.getInt(1);
            }
            id4 = id4 + 1;
            jTextField37.setText("" + id4);
            
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id4;
    }
    public int show_id_Doctor_Sallarry() {
        contest();
        ps = null;// cleardata();
        String select = "SELECT `E_S_ID` FROM `doctor_sallarry`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id5 = rs.getInt(1);
            }
            id5 = id5 + 1;
            jTextField34.setText("" + id5);
            
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id4;
    }
int doctor_type_id(){
        try {
            contest(); ps = null;
            String gg="SELECT `D_Id` FROM `d_type`";
            ps=ct.prepareCall(gg);
            rs = ps.executeQuery();
           while(rs.next()){
           id3=rs.getInt(1);
           }id3=id3+1;
           jTextField22.setText(""+id3);
           jTextField23.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
 return id3;}
    public int show_id2() {
        try { contest();ps = null;
            String select2 = "SELECT `E_Id` FROM `employe_sallary2`";
            ps = ct.prepareCall(select2);
            rs = ps.executeQuery();
            while (rs.next()) {
                id2 = rs.getInt(1);
            } id2 = id2 + 1;
            jTextField7.setText("" + id2);
          jComboBox4.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id2;
    }

    public void jtable1_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        String select = "SELECT `E_Id`,`E_Type`,`E_Sallary` FROM `empllye_sallary`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
       public void jtable5_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
        String select = "SELECT `E_Id`,`E_Type`,`Date` FROM `employe_attendence` WHERE `Date`='"+jLabel8.getText()+"'";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getDate(3)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
       public void jtable6_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
        String select = "SELECT `Doctor_Type`,`Doctor_Id`,`Date`FROM `doctora_attendenc`  WHERE `Date`='"+jLabel8.getText()+"'";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getDate(3)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public void jtable4_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
        String select = "SELECT `E_Id`,`E_Type`,`E_Sallary` FROM `empllye_sallary`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }public void View_jComboBox3_Id_Search(){
contest(); try {
 st=ct.createStatement();
    String i="SELECT`D_Id`FROM `d_type`"; 
    rs=st.executeQuery(i);
     while(rs.next()){
          jComboBox3.addItem(""+rs.getInt(1));
             
     }} catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public void View_jComboBox4_Id_Search(){
contest(); try {
 st=ct.createStatement();
    String i="SELECT`E_Id`FROM `empllye_sallary`"; 
    rs=st.executeQuery(i);
     while(rs.next()){
          jComboBox4.addItem(""+rs.getInt(1));
             
     }} catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
}
     public void View_jComboBox7_Id_Search(){
contest(); try {
 st=ct.createStatement();
    String i="SELECT `D_Id` FROM`d_type`"; 
    rs=st.executeQuery(i);
     while(rs.next()){
          jComboBox7.addItem(""+rs.getInt(1));
             
     }} catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public void jtable3_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
        String select = "SELECT `D_Id`,`D_Type`,`D_Sallary` FROM `d_type`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void jtable2_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        String select = "SELECT `E_Id`,`E2Id`,`E2_IdOfName`,`E2_Name`,`E2_Bdate`,`E2_Address`,`E2_M_Number`,`E2_Details`,`E2_Join_DAte` FROM `employe_sallary2` WHERE `E2_D_Date` = '0000-00-00'";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2),rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getDate(9)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        jTextField4.setText(dt.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTextField5.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField6.setText(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());


    }//GEN-LAST:event_jTable1MouseClicked
    public int show_Doctor_Id() {
        contest();
        
        id=0;
        ps = null;
        // cleardata();
        String select = "SELECT `D_Id` FROM `doctor_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
            jTextField13.setText("" + id);
            jTextField14.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public void View_Doctor_TAble() {
        contest();
        DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
        String s = "SELECT `D_Id`,`E_Id`,`D_Name_Id`,`D_Name`,`D_Fee`,`D_Qualification`,`D_Address`,`Join_Date`,`D_Number`,`D_Age` FROM `doctor_info` WHERE `DeletD` = '0000-00-00'";
        try {
            ps = ct.prepareCall(s);
            rs = ps.executeQuery();
            while (rs.next()) {
 dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3),rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getString(9),rs.getInt(10)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Add_Doctor() {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String date = sd.format(jDateChooser2.getDate());
        if (jTextField14.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Name'");
        } else if (jTextField15.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Fee'");
        } else if (jTextField16.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Qualification'");
        } else if (jTextField19.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Address'");
        } else if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Date'");
        } else if (jTextField17.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Number'");
        } else if (   jComboBox3.getSelectedIndex()<=0) {
            jLabel22.setText("'Please Enter Doctor Type'");
        } else if (jTextField18.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Age'");
        } else {
            contest();
            ps = null;
            String D = "INSERT INTO `doctor_info` (`D_Id`,`D_Name`,`D_Fee`,`D_Qualification`,`D_Number`,`E_Id`,`D_Age`,`D_Address`,`Join_Date`,`jonate2`,`D_Name_Id`)VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField13.getText());
                ps.setString(2, jTextField14.getText());
                ps.setString(3, jTextField15.getText());
                ps.setString(4, jTextField16.getText());
                ps.setString(5, jTextField17.getText());
                ps.setString(6, jComboBox3.getSelectedItem().toString());
                ps.setString(7, jTextField18.getText());
                ps.setString(8, jTextField19.getText());
                ps.setString(9, date);
                ps.setString(10, jLabel8.getText());
                ps.setString(11, jTextField40.getText());
               
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel22.setText("''Doctor Add Success...''");
                    jTextField14.requestFocus();
                    jTextField14.setText("");
                    jTextField15.setText("");
                    jTextField16.setText("");
                    jTextField17.setText("");
                    jTextField18.setText("");
                    jTextField19.setText("");
                    jComboBox3.setSelectedIndex(0);
                   // jComboBox3.setSelectedItem(0);
                    ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
              jTextField40.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           jTextField15.requestFocus();
        }
    }//GEN-LAST:event_jTextField14KeyPressed

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE||c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jTextField15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField16.requestFocus();
        }
    }//GEN-LAST:event_jTextField15KeyPressed

    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField15KeyTyped

    private void jTextField16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        jTextField19.requestFocus();
        }
    }//GEN-LAST:event_jTextField16KeyPressed

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
     jTextField18.requestFocus();
        }
    }//GEN-LAST:event_jTextField17KeyPressed

    private void jTextField17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField17KeyTyped

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField18KeyTyped

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField19KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
       jDateChooser2.requestFocus();
        }
    }//GEN-LAST:event_jTextField19KeyPressed

    private void jDateChooser2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          jTextField17.requestFocus();
        }
    }//GEN-LAST:event_jDateChooser2KeyPressed

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        // jtable7
        DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
        jTextField20.setText(dt.getValueAt(jTable7.getSelectedRow(), 0).toString());
    //jComboBox3.setSelectedItem(dt.getValueAt(jTable7.getSelectedRow(), 1).toString());
 jComboBox3.setSelectedItem(dt.getValueAt(jTable7.getSelectedRow(),1).toString());
  jTextField40.setText(dt.getValueAt(jTable7.getSelectedRow(), 2).toString());
    jTextField14.setText(dt.getValueAt(jTable7.getSelectedRow(), 3).toString());
        jTextField15.setText(dt.getValueAt(jTable7.getSelectedRow(), 4).toString());
        jTextField16.setText(dt.getValueAt(jTable7.getSelectedRow(), 5).toString());
        jTextField19.setText(dt.getValueAt(jTable7.getSelectedRow(), 6).toString());
        //((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText(dt.getValueAt(jTable7.getSelectedRow(), 6).toString());
      jTextField21.setText(dt.getValueAt(jTable7.getSelectedRow(),7).toString());
        jTextField17.setText(dt.getValueAt(jTable7.getSelectedRow(), 8).toString());
 jTextField18.setText(dt.getValueAt(jTable7.getSelectedRow(), 9).toString());
  
 
    }//GEN-LAST:event_jTable7MouseClicked

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jComboBox9.requestFocus();
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
            DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
        jTextField26.setText(dt.getValueAt(jTable3.getSelectedRow(), 0).toString());
        jTextField27.setText(dt.getValueAt(jTable3.getSelectedRow(), 1).toString());
        jTextField28.setText(dt.getValueAt(jTable3.getSelectedRow(), 2).toString());

    }//GEN-LAST:event_jTable3MouseClicked

    private void jComboBox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox3KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
 if (jTextField14.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Name'");
        } else if (jTextField15.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Fee'");
        } else if (jTextField16.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Qualification'");
        } else if (jTextField19.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Address'");
        } else if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Date'");
        } else if (jTextField17.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Number'");
        } else if (jTextField18.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Age'");
        } else if (jComboBox3.getSelectedIndex()<=0) {
            jLabel22.setText("'Please Enter Doctor Type Type'");
        } else {
            Add_Doctor();
            show_Doctor_Id();

        }
        DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);
            }
        }
        View_Doctor_TAble();
      }
    }//GEN-LAST:event_jComboBox3KeyPressed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
 id=0;  contest(); try {
 st=ct.createStatement();
    String i="SELECT `D_Name_Id` FROM `doctor_info` WHERE `E_Id`='"+jComboBox3.getSelectedItem()+"'"; 
    rs=st.executeQuery(i);
     while(rs.next()){
         // jComboBox4.addItem(""+rs.getInt(1));
         id=rs.getInt(1);
             //jTextField39.setText(""+rs.getInt(1));
     }} catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        } id=id+1;
                jTextField40.setText(""+id);
        
        /*
    contest();
 jComboBox3.removeAllItems();
    String ss="---Select---";
 jComboBox3.addItem(ss);
 jTextField12.setText("");
        try {
            st=ct.createStatement();
 String s="SELECT `D_Sallary` FROM `d_type` WHERE `D_Id`='"+jComboBox3.getSelectedItem()+"'";
            rs=st.executeQuery(s);
        while(rs.next()){jLabel22.setText(""+rs.getInt(1));}
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
     */

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
  id=0;
                contest(); try {
 st=ct.createStatement();
    String i="SELECT `E2_IdOfName` FROM `employe_sallary2` WHERE `E2Id`='"+jComboBox4.getSelectedItem()+"'"; 
    rs=st.executeQuery(i);
     while(rs.next()){
         // jComboBox4.addItem(""+rs.getInt(1));
         id=rs.getInt(1);
             //jTextField39.setText(""+rs.getInt(1));
     }} catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
                id=id+1;
                jTextField39.setText(""+id);
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox4KeyPressed

  if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField9.requestFocus();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4KeyPressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
          DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
          
        jTextField30.setText(dt.getValueAt(jTable2.getSelectedRow(), 0).toString());
         jComboBox4.setSelectedItem(dt.getValueAt(jTable2.getSelectedRow(),1).toString()); 
    jTextField39.setText(dt.getValueAt(jTable2.getSelectedRow(), 2).toString());
         jTextField9.setText(dt.getValueAt(jTable2.getSelectedRow(), 3).toString());
   
     jTextField29.setText(dt.getValueAt(jTable2.getSelectedRow(), 4).toString());
        jTextField10.setText(dt.getValueAt(jTable2.getSelectedRow(), 5).toString());
        jTextField11.setText(dt.getValueAt(jTable2.getSelectedRow(), 6).toString());
        //((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText(dt.getValueAt(jTable7.getSelectedRow(), 6).toString());
      jTextField12.setText(dt.getValueAt(jTable2.getSelectedRow(),7).toString());
        jTextField31.setText(dt.getValueAt(jTable2.getSelectedRow(), 8).toString());
 //.setText(dt.getValueAt(jTable2.getSelectedRow(), 8).toString());
 
 
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            jComboBox9.removeAllItems();
            jComboBox9.addItem("---Select---");
            // TODO add your handling code here:
            st=ct.createStatement(); 
            String type="SELECT `E2_IdOfName` FROM  `employe_sallary2` WHERE `E2Id`='"+jComboBox1.getSelectedItem()+"'";
        rs=st.executeQuery(type);
        while(rs.next()){jComboBox9.addItem(""+rs.getInt(1));}
        
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
       jTextField32.setText("");
    }//GEN-LAST:event_jComboBox1ActionPerformed
void sallarry(){ 
       if(jTextField33.getText().isEmpty()){
   jLabel37.setText("'Id Is Empty'");
    jTextField33.requestFocus();
    }    else if(jComboBox1.getSelectedIndex()<=0){
     jLabel37.setText("'Employed Type Is Empty'");
     jComboBox1.requestFocus();
    }
    else if(jComboBox9.getSelectedIndex()<=0){
   jLabel37.setText("'Emplye Id Is Empty'");
     jComboBox9.requestFocus();
    } else if(jTextField32.getText().isEmpty()){
   jLabel37.setText("'Employe Sallarry Is Empty'");
    jTextField32.requestFocus();
    } else{
         contest();
   ps=null;
   id=0;
   int p1=0,mm=0;;
   // cleardata();
   Date dte1=new Date();
        DateFormat df1=new SimpleDateFormat("yyyy-MM");
   
   String select="SELECT `E_Id` FROM `employe_sallary_test` WHERE `E_Id`='"+jComboBox9.getSelectedItem().toString()+"' and `Date` LIKE '"+df1.format(dte1)+"%' AND `E2Id`='"+jComboBox1.getSelectedItem()+"'";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();

            if(rs.next())        
            {
           mm++;
           jLabel37.setText("Sorry...!!!");
            }else {
     // jLabel37.setText("");
              int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You'll Pay Employe Sallarry..???", "Pay Employe Sallarry", JOptionPane.YES_NO_OPTION);
        if(p==0){
            ps = null;
    try {Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
           
 String s2="INSERT INTO `employe_sallary_test` (`E_S_ID`,`E_Id`,`E2Id`,`E_Sallary`,`Date`) VALUES (?,?,?,?,?)";
          ps = ct.prepareCall(s2);
             ps.setString(1, jTextField33.getText());
              ps.setString(3, jComboBox1.getSelectedItem().toString());
                 ps.setString(2,jComboBox9.getSelectedItem().toString());
                ps.setString(4, jTextField32.getText());
                ps.setString(5,df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                jLabel37.setText("''Employe Sallarry Pay Successful''");
                 show_id_Sallarry();
                jTextField32.setText("");
                   //jTextField33.setText("");
                     jComboBox9.removeAllItems();
                     jComboBox9.addItem("---Select---");
                      jComboBox1.setSelectedIndex(0);
                      jComboBox1.requestFocus();
                }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }}
            }
                    } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
void sallarry_Doctor(){ 
    if(jTextField34.getText().isEmpty()){
   jLabel48.setText("'Id Is Empty'");
    jTextField34.requestFocus();
    }    else if(jComboBox2.getSelectedIndex()<=0){
     jLabel48.setText("'Doctor Type Is Empty'");
     jComboBox2.requestFocus();
    }
      if(jComboBox10.getSelectedIndex()<=0){
   jLabel48.setText("'Doctor Id Is Empty'");
    jComboBox10.requestFocus();
    } if(jTextField36.getText().isEmpty()){
   jLabel48.setText("'Doctor Sallarry Is Empty'");
    jTextField36.requestFocus();
    } else{ 
     int jh=0;
     int j2=0;
      contest();
   ps=null;
   id=0;
   int p1=0,mm=0;;
   // cleardata();
   Date dte1=new Date();
        DateFormat df1=new SimpleDateFormat("yyyy-MM");
   
   String select="SELECT `E_Id` FROM `employe_sallary_test` WHERE `E_Id`='"+jComboBox9.getSelectedItem().toString()+"' and `Date` LIKE '"+df1.format(dte1)+"%' AND `E2Id`='"+jComboBox1.getSelectedItem()+"'";
  
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
            if(rs.next()){
            jLabel48.setText("Sorry...!!!");
     }else{
        
         int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You'll Pay Doctor Sallarry...???", "Pay Doctor Sallarry", JOptionPane.YES_NO_OPTION);
        if(p==0){ ps = null;
    try {Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
           
            String s2="INSERT INTO `doctor_sallarry` (`E_S_ID`,`E_Id`,`E2Id`,`E_Sallary`,`Date`) VALUES (?,?,?,?,?)";
          ps = ct.prepareCall(s2);
             ps.setString(1, jTextField34.getText());
              ps.setString(3, jComboBox2.getSelectedItem().toString());
                 ps.setString(2,  jComboBox10.getSelectedItem().toString());
                ps.setString(4, jTextField36.getText());
                ps.setString(5,df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                jLabel48.setText("''Doctor Sallarry Pay Successful''");
             show_id_Doctor_Sallarry();
                jComboBox10.removeAllItems();
                jComboBox10.addItem("---Select---");
                   //jTextField33.setText("");
                      jTextField36.setText("");
                      jComboBox2.setSelectedIndex(0);
                      jComboBox2.requestFocus();
                }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            st=ct.createStatement(); 
String type="SELECT `D_Name_Id`FROM `doctor_info` WHERE `E_Id`='"+jComboBox2.getSelectedItem()+"'";
        rs=st.executeQuery(type);
        while(rs.next()){
        jComboBox10.addItem(""+rs.getInt(1));}
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
      jTextField36.setText("");
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jComboBox10.requestFocus();
      }
    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        String v="---Select---";
        jComboBox6.removeAllItems();
        jComboBox6.addItem(""+v);
        try {
  st=ct.createStatement(); 
String type="SELECT `E2_IdOfName` FROM `employe_sallary2` WHERE `E2Id`='"+jComboBox5.getSelectedItem()+"'";
        rs=st.executeQuery(type);
        while(rs.next()){
         jComboBox6.addItem(""+rs.getInt(1));
        
        }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
        
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox5KeyPressed
        // TODO add your handling code here:
              if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
                  jComboBox6.requestFocus();}
    }//GEN-LAST:event_jComboBox5KeyPressed

    private void jTable2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseEntered

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox6KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
               jDateChooser3.requestFocus();}
    }//GEN-LAST:event_jComboBox6KeyPressed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox8KeyPressed
        // TODO add your handling code here:
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
                jDateChooser4.requestFocus();}
    }//GEN-LAST:event_jComboBox8KeyPressed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
         String v="---Select---";
        jComboBox8.removeAllItems();
        jComboBox8.addItem(""+v);
        try {
  st=ct.createStatement(); 
String type="SELECT `D_Name_Id` FROM `doctor_info` WHERE `E_Id`='"+jComboBox7.getSelectedItem()+"'";
        rs=st.executeQuery(type);
        while(rs.next()){
         jComboBox8.addItem(""+rs.getInt(1)); }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox7KeyPressed
        // TODO add your handling code here:
             if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
                jComboBox8.requestFocus();}
    }//GEN-LAST:event_jComboBox7KeyPressed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
        
         try {
            // TODO add your handling code here:
            rs=null;
            st=ct.createStatement(); 
  String type2="SELECT `E_Sallary` FROM `empllye_sallary` WHERE  `E_Id`='"+jComboBox1.getSelectedItem()+"'";
        rs=st.executeQuery(type2);
        while(rs.next()){jTextField32.setText(""+rs.getInt(1));}
        
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox9KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
 sallarry();
      }
    }//GEN-LAST:event_jComboBox9KeyPressed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
      //  SELECT `D_Name_Id`FROM `doctor_info` WHERE `E_Id`=2
          try {
            // TODO add your handling code here:
            rs=null;
            st=ct.createStatement(); 
            String type2="SELECT `D_Sallary` FROM `d_type` WHERE  `D_Id`='"+jComboBox2.getSelectedItem()+"'";
        rs=st.executeQuery(type2);
        while(rs.next()){jTextField36.setText(""+rs.getInt(1));}
        
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox10KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
  sallarry_Doctor();
      }
    }//GEN-LAST:event_jComboBox10KeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Reception_1st rc1=new Reception_1st();
        rc1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField3.requestFocus();
      }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
 Date dte = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if (jTextField1.getText().isEmpty()) {
            jLabel5.setText("'ID Is Empty'");
           jTextField1.requestFocus();
        } else if (jTextField2.getText().isEmpty()) {
            jLabel5.setText("'Employe Type Is Empty'");
            jTextField2.requestFocus();
        } else if (jTextField3.getText().isEmpty()) {
            jLabel5.setText("'Employe Sallary Is Empty'");
            jTextField3.requestFocus();
        } else {
            contest();
            ps = null;
            String insert = "INSERT INTO `empllye_sallary`(`E_Id`,`E_Type`,`E_Sallary`,`date`)VALUES(?,?,?,?)";
            try {
                ps = ct.prepareCall(insert);
                ps.setString(1, jTextField1.getText());
                ps.setString(2, jTextField2.getText());
                ps.setString(3, jTextField3.getText());
                ps.setString(4, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    show_id();
                    DefaultTableModel dt1 = (DefaultTableModel) jTable1.getModel();
                    while (dt1.getRowCount() > 0) {
                        for (int i = 0; i < dt1.getRowCount(); i++) {
                            dt1.removeRow(i);
                        }
                    }    DefaultTableModel dt4 = (DefaultTableModel) jTable4.getModel();
                    while (dt4.getRowCount() > 0) {
                        for (int i = 0; i < dt4.getRowCount(); i++) {
                            dt4.removeRow(i);
                        }
                    }
                    jtable4_view();
                     jtable1_view();
                    jLabel5.setText("''Employe Type Add Has Been Successful''");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField2.requestFocus();

                }
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
      }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
if (jTable1.getRowCount() == -1) {
            jLabel5.setText("'No Data Pound'");
        } else if (jTable1.getSelectedRow() == -1) {
            jLabel5.setText("'Please select Data'");
        } else if (jTextField4.getText().isEmpty()) {
            jLabel5.setText("'Id Is Empty'");
        } else if (jTextField5.getText().isEmpty()) {
            jLabel5.setText("'Employe Type Is Empty'");
        } else if (jTextField6.getText().isEmpty()) {
            jLabel5.setText("'Employe Sallarry Is Empty'");
        } else {
            String up = "UPDATE `empllye_sallary` SET `E_Sallary`='" + jTextField6.getText() + "' WHERE `E_Id`='" + jTextField4.getText() + "'";
            try {
                ps = ct.prepareCall(up);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                jtable1_view();
                jLabel5.setText("''Employe Type Update Has Been Successful''");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

      }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField25.requestFocus();
      }
    }//GEN-LAST:event_jTextField23KeyPressed

    private void jTextField25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField25KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
 Date dte = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if (jTextField22.getText().isEmpty()) {
            jLabel40.setText("'ID Is Empty'");
           jTextField22.requestFocus();
        } else if (jTextField23.getText().isEmpty()) {
            jLabel40.setText("'Employe Type Is Empty'");
          jTextField23.requestFocus();
        } else if (jTextField25.getText().isEmpty()) {
            jLabel40.setText("'Employe Sallary Is Empty'");
          jTextField25.requestFocus();
        } else {
            contest();
            ps = null;
            String insert = "INSERT INTO `d_type`(`D_Id`,`D_Type`,`D_Sallary`,`Date`)VALUES(?,?,?,?)";
            try {
                ps = ct.prepareCall(insert);
                ps.setString(1, jTextField22.getText());
                ps.setString(2, jTextField23.getText());
                ps.setString(3, jTextField25.getText());
                ps.setString(4, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                   doctor_type_id();
                    DefaultTableModel dt1 = (DefaultTableModel) jTable3.getModel();
                    while (dt1.getRowCount() > 0) {
                        for (int i = 0; i < dt1.getRowCount(); i++) {
                            dt1.removeRow(i);
                        }
                    }
                    jtable3_view();
                    jLabel40.setText("''Doctor Type Add Success''");
                    jTextField25.setText("");
                    jTextField23.setText("");
                    jTextField22.requestFocus();

                }
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
      }
    }//GEN-LAST:event_jTextField25KeyPressed

    private void jTextField28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
if (jTable3.getRowCount() == -1) {
            jLabel40.setText("'No Data Pound'");
        } else if (jTable3.getSelectedRow() == -1) {
            jLabel40.setText("'Please select Data'");
        } else if (jTextField26.getText().isEmpty()) {
           jLabel40.setText("'Id Is Empty'");
        } else if (jTextField27.getText().isEmpty()) {
            jLabel40.setText("'Doctor Type Is Empty'");
        } else if (jTextField28.getText().isEmpty()) {
            jLabel40.setText("'Doctor Sallarry Is Empty'");
        } else {
            String up = "UPDATE `d_type` SET `D_Sallary`='" + jTextField28.getText() + "' WHERE `D_Id`='" + jTextField26.getText() + "'";
            try {
                ps = ct.prepareCall(up);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                jtable3_view();
                jLabel40.setText("''Doctor Type Update Has Been Successful''");
                jTextField26.setText("");
                jTextField27.setText("");
                jTextField28.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            } }
      }
    }//GEN-LAST:event_jTextField28KeyPressed

    private void jTextField39KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField39KeyReleased
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//jTextField3.requestFocus();
      }
    }//GEN-LAST:event_jTextField39KeyReleased

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField10.requestFocus();
      }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
  if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField11.requestFocus();
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jDateChooser1.requestFocus();
      }
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        if (jTextField7.getText().isEmpty()) {
            jLabel20.setText("'ID Is Empty'");
            jTextField7.requestFocus();
        } else if (jComboBox4.getSelectedIndex()<=0) {
            jLabel20.setText("'Employe Type Is Empty'");
            jComboBox4.requestFocus();
        } else if (jTextField9.getText().isEmpty()) {
            jLabel20.setText("'Employe NameIs Empty'");
            jTextField9.requestFocus();
        } else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel20.setText("'BirthDay Is Empty'");
            //jTextField3.requestFocus();
        } else if (jTextField10.getText().isEmpty()) {
            jLabel20.setText("'Employe Address Is Empty'");
            jTextField11.requestFocus();
        } else if (jTextField11.getText().isEmpty()) {
            jLabel20.setText("'Employe Mobile Number Is Empty'");
            jTextField11.requestFocus();
        } else if (jTextField12.getText().isEmpty()) {
            jLabel20.setText("'Employe Details Is Empty'");
            jTextField12.requestFocus();
        } else {
  Date dte = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(jDateChooser1.getDate());
            contest();
            ps = null;
            String insert = "INSERT INTO `employe_sallary2`(`E_Id`,`E2Id`,`E2_IdOfName`,`E2_Name`,`E2_Bdate`,`E2_Address`,`E2_M_Number`,`E2_Details`,`E2_Join_DAte`) VALUES (?,?,?,?,?,?,?,?,?)";
            try {
                ps = ct.prepareCall(insert);
                ps.setString(1, jTextField7.getText());
                ps.setString(2, jComboBox4.getSelectedItem().toString());
                ps.setString(3, jTextField39.getText());
                ps.setString(4, jTextField9.getText());
                ps.setString(5, date);
                ps.setString(6, jTextField10.getText());
                ps.setString(7, jTextField11.getText());
                ps.setString(8, jTextField12.getText());
                ps.setString(9, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    show_id2();
                    DefaultTableModel dt1 = (DefaultTableModel) jTable2.getModel();
                    while (dt1.getRowCount() > 0) {
                        for (int i = 0; i < dt1.getRowCount(); i++) {
                            dt1.removeRow(i);
                        }
                    }
                    jtable2_view();
                    jLabel20.setText("''Employe Add Success''");
               
                    jComboBox4.setSelectedIndex(0);
                    jTextField9.setText("");
                    jTextField10.setText("");
                    jTextField11.setText("");
                    jTextField12.setText("");
                    jTextField39.setText("");
                    ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
                  jComboBox4.requestFocus();
                   

                }
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
      }
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jDateChooser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField12.requestFocus();
      }
    }//GEN-LAST:event_jDateChooser1KeyPressed

    private void jTextField18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jComboBox3.requestFocus();
      }
    }//GEN-LAST:event_jTextField18KeyPressed

    private void jTextField39KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField39KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
  jTextField9.requestFocus();
      }
      
    }//GEN-LAST:event_jTextField39KeyPressed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jDateChooser3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser3KeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jDateChooser3KeyPressed

    private void jTextField32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField32KeyPressed
       // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_jTextField32KeyPressed

    private void jComboBox2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2KeyReleased

    private void jTextField36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField36KeyPressed
        // TODO add your handling code here:
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
              
                }
    }//GEN-LAST:event_jTextField36KeyPressed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
 char c = evt.getKeyChar();
 if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ||c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE )) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
 if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ||c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField23KeyTyped

    private void jTextField25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField25KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ||c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField25KeyTyped

    private void jTextField28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE )) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField28KeyTyped

    private void jTextField39KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField39KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE )) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField39KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
 if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ||c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
 char c = evt.getKeyChar();
 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE )) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable1.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Hospital_Detailse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable3.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Hospital_Detailse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable2.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Hospital_Detailse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable7.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Hospital_Detailse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
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
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
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
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
      Date dte = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if (jTextField1.getText().isEmpty()) {
            jLabel5.setText("'ID Is Empty'");
           jTextField1.requestFocus();
        } else if (jTextField2.getText().isEmpty()) {
            jLabel5.setText("'Employe Type Is Empty'");
            jTextField2.requestFocus();
        } else if (jTextField3.getText().isEmpty()) {
            jLabel5.setText("'Employe Sallary Is Empty'");
            jTextField3.requestFocus();
        } else {
            contest();
            ps = null;
            String insert = "INSERT INTO `empllye_sallary`(`E_Id`,`E_Type`,`E_Sallary`,`date`)VALUES(?,?,?,?)";
            try {
                ps = ct.prepareCall(insert);
                ps.setString(1, jTextField1.getText());
                ps.setString(2, jTextField2.getText());
                ps.setString(3, jTextField3.getText());
                ps.setString(4, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    show_id();
                    DefaultTableModel dt1 = (DefaultTableModel) jTable1.getModel();
                    while (dt1.getRowCount() > 0) {
                        for (int i = 0; i < dt1.getRowCount(); i++) {
                            dt1.removeRow(i);
                        }
                    }    DefaultTableModel dt4 = (DefaultTableModel) jTable4.getModel();
                    while (dt4.getRowCount() > 0) {
                        for (int i = 0; i < dt4.getRowCount(); i++) {
                            dt4.removeRow(i);
                        }
                    }
                    jtable4_view();
                     jtable1_view();
                    jLabel5.setText("''Employe Type Add Has Been Successful''");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField2.requestFocus();

                }
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        // TODO add your handling code here:
           if (jTable1.getRowCount() == -1) {
            jLabel5.setText("'No Data Pound'");
        } else if (jTable1.getSelectedRow() == -1) {
            jLabel5.setText("'Please select Data'");
        } else if (jTextField4.getText().isEmpty()) {
            jLabel5.setText("'Id Is Empty'");
        } else if (jTextField5.getText().isEmpty()) {
            jLabel5.setText("'Employe Type Is Empty'");
        } else if (jTextField6.getText().isEmpty()) {
            jLabel5.setText("'Employe Sallarry Is Empty'");
        } else {
            String up = "UPDATE `empllye_sallary` SET `E_Sallary`='" + jTextField6.getText() + "' WHERE `E_Id`='" + jTextField4.getText() + "'";
            try {
                ps = ct.prepareCall(up);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                jtable1_view();
                jLabel5.setText("''Employe Type Update Has Been Successful''");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        // TODO add your handling code here:
         Date dte = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if (jTextField22.getText().isEmpty()) {
            jLabel40.setText("'Doctor Type ID Is Empty'");
           jTextField22.requestFocus();
        } else if (jTextField23.getText().isEmpty()) {
            jLabel40.setText("'Doctor Type Is Empty'");
          jTextField23.requestFocus();
        } else if (jTextField25.getText().isEmpty()) {
            jLabel40.setText("'Doctor Sallary Is Empty'");
          jTextField25.requestFocus();
        } else {
            contest();
            ps = null;
            String insert = "INSERT INTO `d_type`(`D_Id`,`D_Type`,`D_Sallary`,`Date`)VALUES(?,?,?,?)";
            try {
                ps = ct.prepareCall(insert);
                ps.setString(1, jTextField22.getText());
                ps.setString(2, jTextField23.getText());
                ps.setString(3, jTextField25.getText());
                ps.setString(4, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                   doctor_type_id();
                    DefaultTableModel dt1 = (DefaultTableModel) jTable3.getModel();
                    while (dt1.getRowCount() > 0) {
                        for (int i = 0; i < dt1.getRowCount(); i++) {
                            dt1.removeRow(i);
                        }
                    }
                    jtable3_view();
                    jLabel40.setText("''Doctor Type Add Success''");
                    jTextField25.setText("");
                    jTextField23.setText("");
                    jTextField22.requestFocus();

                }
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        // TODO add your handling code here:
           if (jTable3.getRowCount() == -1) {
            jLabel40.setText("'No Data Pound'");
        } else if (jTable3.getSelectedRow() == -1) {
            jLabel40.setText("'Please select Data'");
        } else if (jTextField26.getText().isEmpty()) {
           jLabel40.setText("'Type Id Is Empty'");
        } else if (jTextField27.getText().isEmpty()) {
            jLabel40.setText("'Doctor Type Is Empty'");
        } else if (jTextField28.getText().isEmpty()) {
            jLabel40.setText("'Doctor Sallarry Is Empty'");
        } else {
            String up = "UPDATE `d_type` SET `D_Sallary`='" + jTextField28.getText() + "' WHERE `D_Id`='" + jTextField26.getText() + "'";
            try {
                ps = ct.prepareCall(up);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                jtable3_view();
                jLabel40.setText("''Doctor Type Update Has Been Successful''");
                jTextField26.setText("");
                jTextField27.setText("");
                jTextField28.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            } }
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel71MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel71MouseEntered

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
        // TODO add your handling code here:
          jLabel20.setText("");
         jComboBox4.setSelectedIndex(0);
                    jTextField9.setText("");
                    jTextField10.setText("");
                    jTextField11.setText("");
                    jTextField12.setText("");
                    jTextField39.setText("");
                       jTextField29.setText("");
                        jTextField30.setText("");
                         jTextField31.setText("");
                    ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
                   jComboBox4.requestFocus();
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel73MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel73MouseEntered

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        // TODO add your handling code here:
        

        if (jTextField7.getText().isEmpty()) {
            jLabel20.setText("'ID Is Empty'");
            jTextField7.requestFocus();
        } else if (jComboBox4.getSelectedIndex()<=0) {
            jLabel20.setText("'Employe Type Is Empty'");
            jComboBox4.requestFocus();
        } else if (jTextField9.getText().isEmpty()) {
            jLabel20.setText("'Employe NameIs Empty'");
            jTextField9.requestFocus();
        } else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel20.setText("'BirthDay Is Empty'");
            //jTextField3.requestFocus();
        } else if (jTextField10.getText().isEmpty()) {
            jLabel20.setText("'Employe Address Is Empty'");
            jTextField11.requestFocus();
        } else if (jTextField11.getText().isEmpty()) {
            jLabel20.setText("'Employe Mobile Number Is Empty'");
            jTextField11.requestFocus();
        } else if (jTextField12.getText().isEmpty()) {
            jLabel20.setText("'Employe Details Is Empty'");
            jTextField12.requestFocus();
        } else {
  Date dte = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(jDateChooser1.getDate());
            contest();
            ps = null;
            String insert = "INSERT INTO `employe_sallary2`(`E_Id`,`E2Id`,`E2_IdOfName`,`E2_Name`,`E2_Bdate`,`E2_Address`,`E2_M_Number`,`E2_Details`,`E2_Join_DAte`) VALUES (?,?,?,?,?,?,?,?,?)";
            try {
                ps = ct.prepareCall(insert);
                ps.setString(1, jTextField7.getText());
                ps.setString(2, jComboBox4.getSelectedItem().toString());
                ps.setString(3, jTextField39.getText());
                ps.setString(4, jTextField9.getText());
                ps.setString(5, date);
                ps.setString(6, jTextField10.getText());
                ps.setString(7, jTextField11.getText());
                ps.setString(8, jTextField12.getText());
                ps.setString(9, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    show_id2();
                    DefaultTableModel dt1 = (DefaultTableModel) jTable2.getModel();
                    while (dt1.getRowCount() > 0) {
                        for (int i = 0; i < dt1.getRowCount(); i++) {
                            dt1.removeRow(i);
                        }
                    }
                    jtable2_view();
                    jLabel20.setText("''Employe Add Success''");
               
                    jComboBox4.setSelectedIndex(0);
                    jTextField9.setText("");
                    jTextField10.setText("");
                    jTextField11.setText("");
                    jTextField12.setText("");
                    jTextField39.setText("");
                    ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
                  jComboBox4.requestFocus();
                   

                }
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jLabel74MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel74MouseEntered

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
        // TODO add your handling code here:
        
         String test ="UPDATE `employe_sallary2` SET `E2Id`='"+jComboBox4.getSelectedItem()+"',`E2_IdOfName`='"+jTextField39.getText()+"',`E2_Address`='"+jTextField10.getText()+"',`E2_M_Number`='"+jTextField11.getText()+"',`E2_Details`='"+jTextField12.getText()+"' WHERE `E_Id`='"+jTextField30.getText()+"'";
       if (   jComboBox4.getSelectedIndex()<=0) {
            jLabel20.setText("'Please Enter Employe Type'");
        }  else if (jTextField9.getText().isEmpty()) {
            jLabel20.setText("'Please Enter The Employe Name'");
            jTextField9.requestFocus();
        } else if (jTextField10.getText().isEmpty()) {
            jLabel20.setText("'Please Enter Employe Address'");
            jTextField10.requestFocus();
        } else if (jTextField11.getText().isEmpty()) {
            jLabel20.setText("'Please Enter Employe Mobile Number'");
            jTextField11.requestFocus();
        } else if (jTextField12.getText().isEmpty()) {
            jLabel20.setText("'Please Enter Employe Details'");
            jTextField12.requestFocus();
        } else {
            try {
                contest();
                ps = ct.prepareCall(test);
                ps.execute();
                jLabel20.setText("''Employe Update Success...''");
                
                  jComboBox4.requestFocus();
               jComboBox4.setSelectedIndex(0);
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField12.setText("");
                jTextField29.setText("");
                jTextField30.setText("");
                jTextField39.setText("");
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
                jTextField31.setText("");
         jtable2_view();
                 
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
            while (dt.getRowCount() > 0) {
                for (int i = 0; i < dt.getRowCount(); i++) {
                    dt.removeRow(i);
                }
            }
           jtable2_view();
        }
    }//GEN-LAST:event_jLabel75MouseClicked

    private void jLabel75MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel75MouseEntered

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
        // TODO add your handling code here:
           if (jTextField30.getText().isEmpty()) {
            jLabel20.setText("'Please Select Employe Id'");
        } else {
            contest();
            ps = null;
            String insert = "UPDATE `employe_sallary2` SET `E2_D_Date`='" + jLabel8.getText() + "' WHERE `E_Id`='" + jTextField30.getText() + "'";
            try {
                ps = ct.prepareCall(insert);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                jTextField30.setText("");
                ps.executeUpdate();
                // jtable3_Clear();
                jLabel20.setText("''Employe Delete Successfull''");
                jComboBox4.requestFocus();
               jComboBox4.setSelectedIndex(0);
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField12.setText("");
                jTextField29.setText("");
                jTextField30.setText("");
                jTextField39.setText("");
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
                jTextField31.setText("");
         jtable2_view();
               
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel76MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel76MouseEntered

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        // TODO add your handling code here:
         if (jTextField14.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Name'");
        } else if (jTextField15.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Fee'");
        } else if (jTextField16.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Qualification'");
        } else if (jTextField19.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Address'");
        } else if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Date'");
        } else if (jTextField17.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Number'");
        } else if (jTextField18.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Age'");
        } else if (jComboBox3.getSelectedIndex()<=0) {
            jLabel22.setText("'Please Enter Doctor Type Type'");
        } else {
            Add_Doctor();
            show_Doctor_Id();

        }
        DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);
            }
        }
        View_Doctor_TAble();
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jLabel77MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel77MouseEntered

    private void jLabel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseClicked
        // TODO add your handling code here:
         jTextField14.requestFocus();
            jComboBox3.setSelectedIndex(0);
                    jTextField14.setText("");
                    jTextField15.setText("");
                    jTextField16.setText("");
                    jTextField17.setText("");
                    jTextField18.setText("");
                    jTextField19.setText("");
                    jComboBox3.setSelectedItem(0);
                    ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
              jTextField40.setText("");
              jComboBox3.setSelectedIndex(0);
        jTextField2.requestFocus();
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField19.setText("");
        jLabel22.setText("");
        jTextField18.setText("");
        jTextField40.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_jLabel78MouseClicked

    private void jLabel78MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel78MouseEntered

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
        // TODO add your handling code here:
          if (jTextField20.getText().isEmpty()) {
            jLabel35.setText("'Please Select Doctor Id'");
        } else {
            contest();
            ps = null;
            String insert = "UPDATE `doctor_info` SET `DeletD`='" + jLabel8.getText() + "' WHERE `D_Id`='" + jTextField20.getText() + "'";
            try {
                ps = ct.prepareCall(insert);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                jTextField20.setText("");
                ps.executeUpdate();
                // jtable3_Clear();
                jLabel35.setText("''Doctor Delete Successfull..''");
               // jTextField13.requestFocus();
               // jTextField13.setText("");
                jTextField14.setText("");
                  jTextField14.requestFocus();
                jTextField18.setText("");
                jTextField15.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField19.setText("");
                jComboBox3.setSelectedIndex(0);
                jTextField40.setText("");
                jLabel22.setText("");
                ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
                jTextField21.setText("");
                jComboBox3.setSelectedItem(0);
                View_Doctor_TAble();
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jLabel79MouseClicked

    private void jLabel79MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel79MouseEntered

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        // TODO add your handling code here:
         String test = "UPDATE `doctor_info` SET `D_Name_Id`='"+jTextField40.getText()+"',`D_Fee`='" + jTextField15.getText() + "',`D_Qualification`='" + jTextField16.getText() + "',`D_Number`='" + jTextField17.getText() + "',`E_Id`='" +jComboBox3.getSelectedItem() + "',`D_Age`='" + jTextField18.getText() + "',`D_Address`='" + jTextField19.getText() + "' WHERE `D_Id`='" + jTextField20.getText() + "'";
        if (jTextField14.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Name'");
        } else if (jTextField15.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Fee'");
        } else if (jTextField16.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Qualification'");
        } else if (jTextField19.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Address'");
        } else if (jTextField17.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Number'");
        } else if (   jComboBox3.getSelectedIndex()<=0) {
            jLabel22.setText("'Please Enter Doctor Type'");
        } else if (jTextField18.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Doctor Age'");
        }  else {
            try {
                contest();
                ps = ct.prepareCall(test);
                ps.execute();
                jLabel35.setText("''Doctor Update Success...''");
                jTextField14.requestFocus();
                jTextField14.setText("");
                jTextField15.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField18.setText("");
                jTextField19.setText("");
                jLabel22.setText("");
                jTextField20.setText("");
                 jTextField21.setText("");
                 jTextField40.setText("");
                 jTextField40.setText("");
                  jComboBox3.setSelectedIndex(0);
                ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
            while (dt.getRowCount() > 0) {
                for (int i = 0; i < dt.getRowCount(); i++) {
                    dt.removeRow(i);
                }
            }
            View_Doctor_TAble();
              jTextField40.setText("");
        }
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jLabel80MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel80MouseEntered

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        // TODO add your handling code here:
           // TODO add your handling code here:
        if(jTextField37.getText().isEmpty()){
        jLabel57.setText("'Id Is Empty'");
        jTextField37.requestFocus();
        }else if(jComboBox5.getSelectedIndex()<=0){
          jLabel57.setText("'Employe Type Is Empty'");
       jComboBox5.requestFocus();
        }else if(jComboBox6.getSelectedIndex()<=0){
        jLabel57.setText("'Employe Id Is Empty'");
        jComboBox6.requestFocus();
        }else if(((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()){
          jLabel57.setText("'Date Is Empty'");
       jDateChooser3.requestFocus();
        }else{
            try {   
           String in="INSERT INTO `employe_attendence`(`Id`,`E_Type`,`E_Id`,`Date`)VALUES(?,?,?,?)";
                ps = null;
                contest();
                Date dte=new Date();
                DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                String date = df.format(jDateChooser3.getDate());
                ps = ct.prepareCall(in);
                ps.setString(1, jTextField37.getText());
                ps.setString(2,jComboBox5.getSelectedItem().toString());
                ps.setString(3, jComboBox6.getSelectedItem().toString());
                ps.setString(4,date);
                int m = ps.executeUpdate();
                if (m > 0) {
                    DefaultTableModel dt4 = (DefaultTableModel) jTable5.getModel();
                  dt4.setRowCount(0);
                 jtable5_view();
                  jTextField37_show_id_Sallarry();
           
                   // jtable1_view();
                   // jLabel5.setText(""+jTextField2.getText()+" Cost Add Success...");
                    //    jlabel5_Total();
                    //jTextField1.setText("");
                    jComboBox5.setSelectedIndex(0);
                  jComboBox6.removeAllItems();
                  jComboBox6.addItem("---Select---");
                   ((JTextField) jDateChooser3.getDateEditor().getUiComponent()).setText("");
               jLabel57.setText("''Attendence Add Success''");
             //  jCheckBox1.setSelected(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jLabel81MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel81MouseEntered

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        // TODO add your handling code here:
        sallarry();
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jLabel82MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel82MouseEntered

    private void jLabel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseClicked
        // TODO add your handling code here:
         sallarry_Doctor();
    }//GEN-LAST:event_jLabel83MouseClicked

    private void jLabel83MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel83MouseEntered

    private void jLabel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseClicked
        // TODO add your handling code here:
        if(jTextField38.getText().isEmpty()){
      jLabel63.setText("'Id Is Empty'");
        jTextField38.requestFocus();
        }else if(jComboBox7.getSelectedIndex()<=0){
          jLabel63.setText("'Doctor Type Is Empty'");
       jComboBox7.requestFocus();
        }else if(jComboBox8.getSelectedIndex()<=0){
        jLabel63.setText("'Doctor Id Is Empty'");
        jComboBox8.requestFocus();
        }else if(((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText().isEmpty()){
          jLabel63.setText("'Date Is Empty'");
       jDateChooser4.requestFocus();
        }else{
            try {   
           String in="INSERT INTO `doctora_attendenc`(`id`,`Doctor_Type`,`Doctor_Id`,`Date`)VALUES(?,?,?,?)";
                ps = null;
                contest();
                Date dte=new Date();
                DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                String date = df.format(jDateChooser4.getDate());
                ps = ct.prepareCall(in);
                ps.setString(1, jTextField38.getText());
                ps.setString(2,jComboBox7.getSelectedItem().toString());
                ps.setString(3, jComboBox8.getSelectedItem().toString());
                ps.setString(4,date);
                int m = ps.executeUpdate();
                if (m > 0) {
                    DefaultTableModel dt4 = (DefaultTableModel) jTable6.getModel();
                  dt4.setRowCount(0);
              jtable6_view();
                 jTextField38_show_id();
           
                   // jtable1_view();
                   // jLabel5.setText(""+jTextField2.getText()+" Cost Add Success...");
                    //    jlabel5_Total();
                    //jTextField1.setText("");
                    jComboBox7.setSelectedIndex(0);
                  jComboBox8.removeAllItems();
                  jComboBox8.addItem("---Select---");
                   ((JTextField) jDateChooser4.getDateEditor().getUiComponent()).setText("");
               jLabel63.setText("''Attendece Add Success''");
             //  jCheckBox1.setSelected(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jLabel84MouseClicked

    private void jLabel84MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel84MouseEntered

    private void jLabel85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel85MouseClicked

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel86MouseClicked

    private void jLabel87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel87MouseClicked

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

    private void jLabel91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel91MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel91MouseClicked

    private void jLabel97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel97MouseClicked

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
            java.util.logging.Logger.getLogger(Stup_Sallarry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stup_Sallarry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stup_Sallarry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stup_Sallarry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Stup_Sallarry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
