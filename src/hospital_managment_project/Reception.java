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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Reception extends javax.swing.JFrame {
    Connection ct = null;
    PreparedStatement ps = null;
    ResultSet rs = null;    
    Statement st = null;
    Statement st2 = null;
    int id = 0;
    ResultSet rss = null;
    PreparedStatement tps = null;
    PreparedStatement ops = null;
    double day = 1;
    static int j; 
    public Reception() {
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("Loghu__Hospital.jpg")));
        show_date();
        show_test();
       
        test_Patient();
        Doctor_Name();
        Oparetion_Show();
        jtable1_view();
        jtable7_Oparetion_Detailse_view();
        Jcombobox14_Test_Show();
        jtable6_TestDetailse_view();
        jtable4_Patient_Test_view();
        jtable5_Patient_oparetion_view();
        View_jComboBox9_Id_Search();
        View_jComboBox16_Id_Search();
        View_jComboBox10_Id_Search();
        View_jComboBox11_Id_Search();
        View_jComboBox13_Id_Search();
        View_jComboBox15_Oparetion_Search();
        jTextField15.setText("");
        jLabel8.setText("");
        jLabel30.setText("");
        jTextField24.setText("");
         jTextField25.setVisible(false);
          jTextField26.setVisible(false);
          Combobox4_Show();
      
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
        jLabel22 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Test_Id = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jTextField15 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        Oparetion_id = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jComboBox15 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jTextField19 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        Oparetion_Submit = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Patien_Id_Search = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jButton23 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jTextField28 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
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
        jLabel2.setBounds(1300, 0, 59, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Back.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 140, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/text-animation-3.6s-954x200px(2).gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(170, 0, 1040, 140);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1210, 100, 140, 40);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22);
        jLabel22.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 140);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Bed Fee");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(520, 110, 180, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Ward Number");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(520, 50, 170, 30);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Doctor Fee");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(20, 370, 190, 40);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("City");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(20, 270, 190, 40);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Address");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(20, 230, 190, 40);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Maritial Status");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(20, 200, 190, 29);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Gender");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(20, 170, 190, 30);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Age");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(20, 130, 190, 40);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("First Name");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(20, 90, 190, 40);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("Patient ID");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(20, 50, 190, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField1);
        jTextField1.setBounds(210, 50, 300, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField2);
        jTextField2.setBounds(210, 90, 300, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField4);
        jTextField4.setBounds(210, 130, 300, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---", "Male", "Female" }));
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        jPanel7.add(jComboBox1);
        jComboBox1.setBounds(210, 170, 300, 28);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---", "Singel", "Married" }));
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
        });
        jPanel7.add(jComboBox2);
        jComboBox2.setBounds(210, 200, 300, 28);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField6);
        jTextField6.setBounds(210, 230, 300, 40);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField7);
        jTextField7.setBounds(210, 270, 300, 40);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField8);
        jTextField8.setBounds(210, 310, 300, 28);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jComboBox4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox4KeyReleased(evt);
            }
        });
        jPanel7.add(jComboBox4);
        jComboBox4.setBounds(700, 50, 300, 28);

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox5.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox5PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
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
        jPanel7.add(jComboBox5);
        jComboBox5.setBounds(700, 80, 300, 28);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(580, 320, 150, 70);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);
        jButton2.setBounds(760, 320, 170, 70);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Phone Number");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(20, 310, 190, 30);

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
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
        jPanel7.add(jComboBox6);
        jComboBox6.setBounds(210, 340, 300, 30);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel7.add(jTextField10);
        jTextField10.setBounds(210, 370, 300, 40);

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField12);
        jTextField12.setBounds(700, 110, 300, 40);

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel52.setText("Doctor Name");
        jPanel7.add(jLabel52);
        jLabel52.setBounds(20, 340, 190, 30);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel45.setText("Bed Number");
        jPanel7.add(jLabel45);
        jLabel45.setBounds(520, 80, 170, 30);

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel32);
        jLabel32.setBounds(530, 210, 480, 60);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel31);
        jLabel31.setBounds(1270, 0, 90, 80);

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Add.jpg"))); // NOI18N
        jPanel7.add(jLabel51);
        jLabel51.setBounds(0, 0, 1390, 570);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("*Add Patient", jPanel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Test No");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(30, 220, 130, 40);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Patient Id");
        jPanel6.add(jLabel26);
        jLabel26.setBounds(30, 140, 130, 40);

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
        jPanel6.add(jComboBox7);
        jComboBox7.setBounds(160, 180, 160, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel8);
        jLabel8.setBounds(10, 330, 390, 50);

        Test_Id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Test_Id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        Test_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Test_IdActionPerformed(evt);
            }
        });
        Test_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Test_IdKeyPressed(evt);
            }
        });
        jPanel6.add(Test_Id);
        Test_Id.setBounds(160, 140, 160, 40);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("View Test Fee");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField3);
        jTextField3.setBounds(50, 270, 260, 50);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Test No", "Test", "Test Fee"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(410, 130, 490, 310);

        jButton12.setBackground(new java.awt.Color(204, 0, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12);
        jButton12.setBounds(190, 390, 150, 60);

        jButton24.setBackground(new java.awt.Color(204, 0, 0));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Add Test");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton24);
        jButton24.setBounds(50, 390, 140, 60);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField13);
        jTextField13.setBounds(410, 80, 80, 50);

        jButton25.setBackground(new java.awt.Color(204, 0, 0));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Update Test");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton25);
        jButton25.setBounds(720, 440, 180, 50);

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField14);
        jTextField14.setBounds(490, 80, 100, 50);

        jButton26.setBackground(new java.awt.Color(204, 0, 0));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Delete Test");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton26);
        jButton26.setBounds(730, 30, 170, 50);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test", "Test Fee"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable6);

        jPanel6.add(jScrollPane7);
        jScrollPane7.setBounds(980, 130, 290, 310);

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField15);
        jTextField15.setBounds(160, 220, 160, 40);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setText("Patient Test");
        jPanel6.add(jLabel47);
        jLabel47.setBounds(30, 180, 130, 40);

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField16);
        jTextField16.setBounds(590, 80, 180, 50);

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField17);
        jTextField17.setBounds(770, 80, 130, 50);

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("Test NO");
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField18);
        jTextField18.setBounds(410, 440, 110, 50);

        jComboBox14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox14);
        jComboBox14.setBounds(520, 440, 200, 50);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setText("Print");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel33);
        jLabel33.setBounds(660, 30, 70, 50);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel36);
        jLabel36.setBounds(1270, 0, 90, 80);

        jComboBox17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Submit---", "Patient Test", "Test" }));
        jComboBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox17ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox17);
        jComboBox17.setBounds(1190, 500, 150, 28);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Add.jpg"))); // NOI18N
        jPanel6.add(jLabel4);
        jLabel4.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab("*Patient Test ", jPanel6);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Oparetion Name");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(50, 170, 160, 40);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Patient Id");
        jPanel4.add(jLabel29);
        jLabel29.setBounds(50, 130, 160, 40);

        jComboBox8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
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
        jPanel4.add(jComboBox8);
        jComboBox8.setBounds(210, 170, 200, 40);

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add Oparetion ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);
        jButton6.setBounds(40, 400, 220, 40);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel30);
        jLabel30.setBounds(0, 350, 460, 40);

        Oparetion_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Oparetion_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        Oparetion_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Oparetion_idActionPerformed(evt);
            }
        });
        Oparetion_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Oparetion_idKeyPressed(evt);
            }
        });
        jPanel4.add(Oparetion_id);
        Oparetion_id.setBounds(210, 130, 200, 40);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("View Oparetion Fee");
        jPanel4.add(jTextField9);
        jTextField9.setBounds(40, 290, 380, 50);

        jComboBox15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jPanel4.add(jComboBox15);
        jComboBox15.setBounds(610, 420, 130, 40);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Oparetion NO", "Oparetion Name", "Oparetion  Fee"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable5);

        jPanel4.add(jScrollPane6);
        jScrollPane6.setBounds(500, 150, 480, 270);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oparetion Name", "Oparetion Fee"
            }
        ));
        jScrollPane8.setViewportView(jTable7);

        jPanel4.add(jScrollPane8);
        jScrollPane8.setBounds(1060, 150, 270, 260);

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField19);
        jTextField19.setBounds(500, 110, 120, 40);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Oparetion NO");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(50, 210, 160, 40);

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField20);
        jTextField20.setBounds(620, 110, 120, 40);

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField21);
        jTextField21.setBounds(740, 110, 110, 40);

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField22);
        jTextField22.setBounds(850, 110, 130, 40);

        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField23);
        jTextField23.setBounds(500, 420, 110, 40);

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField24);
        jTextField24.setBounds(210, 210, 200, 40);

        jButton27.setBackground(new java.awt.Color(204, 0, 0));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Delete Oparetion");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton27);
        jButton27.setBounds(730, 60, 250, 50);

        jButton28.setBackground(new java.awt.Color(204, 0, 0));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Update Oparetion");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton28);
        jButton28.setBounds(730, 420, 250, 40);

        jButton29.setBackground(new java.awt.Color(204, 0, 0));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Clear");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton29);
        jButton29.setBounds(260, 400, 160, 40);

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel44);
        jLabel44.setBounds(1270, 0, 90, 80);

        Oparetion_Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Oparetion_Submit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Submit---", "Patient Oparetion", "Oparetion" }));
        Oparetion_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Oparetion_SubmitActionPerformed(evt);
            }
        });
        jPanel4.add(Oparetion_Submit);
        Oparetion_Submit.setBounds(1100, 490, 240, 28);

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Add.jpg"))); // NOI18N
        jPanel4.add(jLabel53);
        jLabel53.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab("*Patient  Oparetion", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Patient ID");
        jPanel8.add(jLabel23);
        jLabel23.setBounds(100, 50, 130, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel8.add(jTextField5);
        jTextField5.setBounds(230, 50, 300, 50);

        jPanel3.add(jPanel8);
        jPanel8.setBounds(1374, 0, 0, 0);

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(400, 460, 260, 60);

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(660, 460, 170, 60);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Patient ID");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(70, 80, 110, 50);

        jTable2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Name", "Age", "Geender", "Maritial Status", "Date", "Address", "City", "Phone Number", "Doctor Name", "Patient Type", "Ward No", "Bed No"
            }
        ));
        jTable2.setToolTipText("");
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Geender");
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setHeaderValue("Maritial Status");
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Date");
            jTable2.getColumnModel().getColumn(6).setHeaderValue("Address");
            jTable2.getColumnModel().getColumn(7).setHeaderValue("City");
            jTable2.getColumnModel().getColumn(8).setResizable(false);
            jTable2.getColumnModel().getColumn(8).setHeaderValue("Phone Number");
            jTable2.getColumnModel().getColumn(9).setHeaderValue("Doctor Name");
            jTable2.getColumnModel().getColumn(10).setHeaderValue("Patient Type");
            jTable2.getColumnModel().getColumn(11).setResizable(false);
            jTable2.getColumnModel().getColumn(11).setHeaderValue("Ward No");
            jTable2.getColumnModel().getColumn(12).setHeaderValue("Bed No");
        }

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(40, 150, 1290, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(300, 390, 760, 50);

        Patien_Id_Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Patien_Id_Search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        Patien_Id_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patien_Id_SearchActionPerformed(evt);
            }
        });
        Patien_Id_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Patien_Id_SearchKeyPressed(evt);
            }
        });
        jPanel3.add(Patien_Id_Search);
        Patien_Id_Search.setBounds(180, 80, 150, 50);

        jTable8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jTable8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Oparetion No", "Oparetion Name"
            }
        ));
        jTable8.setToolTipText("");
        jScrollPane9.setViewportView(jTable8);

        jPanel3.add(jScrollPane9);
        jScrollPane9.setBounds(720, 240, 380, 140);

        jTable9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
        jTable9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Test No", "Test Name"
            }
        ));
        jTable9.setToolTipText("");
        jScrollPane10.setViewportView(jTable9);

        jPanel3.add(jScrollPane10);
        jScrollPane10.setBounds(230, 240, 410, 140);

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel54);
        jLabel54.setBounds(1270, 0, 90, 80);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(1210, 490, 130, 40);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Add.jpg"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab("*Saerch Patient", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Age", "Gender", "Maritial Status", "Date", "Address", "City", "Phone No", "Doctor Name", "Patient Type", "Word No", "Bed N0", "Test No", "Test Name", "Oparetion No", "Oparetion Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false, true, true, true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(40, 120, 1300, 330);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel49.setText("Print");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel49);
        jLabel49.setBounds(1240, 90, 100, 30);

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel55);
        jLabel55.setBounds(1270, 0, 90, 80);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Add.jpg"))); // NOI18N
        jPanel5.add(jLabel27);
        jLabel27.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab("*View  Patient", jPanel5);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Patient ID");
        jPanel9.add(jLabel37);
        jLabel37.setBounds(10, 30, 100, 40);

        jComboBox13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });
        jComboBox13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox13KeyPressed(evt);
            }
        });
        jPanel9.add(jComboBox13);
        jComboBox13.setBounds(110, 30, 180, 40);

        jButton23.setBackground(new java.awt.Color(204, 0, 0));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Show Total Bill ");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton23);
        jButton23.setBounds(520, 30, 220, 40);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel43);
        jLabel43.setBounds(230, 470, 550, 50);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel9.add(jScrollPane4);
        jScrollPane4.setBounds(240, 180, 440, 270);
        jPanel9.add(jTextField25);
        jTextField25.setBounds(460, 370, 10, 40);
        jPanel9.add(jTextField26);
        jTextField26.setBounds(460, 300, 10, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Enter Patient Bill How Much Pay ");
        jPanel9.add(jLabel9);
        jLabel9.setBounds(900, 210, 440, 50);

        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField27KeyPressed(evt);
            }
        });
        jPanel9.add(jTextField27);
        jTextField27.setBounds(980, 270, 260, 50);

        jButton30.setBackground(new java.awt.Color(204, 0, 0));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("OK");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton30);
        jButton30.setBounds(1040, 370, 150, 50);

        jTextField28.setEditable(false);
        jTextField28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel9.add(jTextField28);
        jTextField28.setBounds(290, 30, 230, 40);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel50.setText("Submit");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel50);
        jLabel50.setBounds(690, 180, 90, 50);

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel56);
        jLabel56.setBounds(1270, 0, 90, 80);

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Add.jpg"))); // NOI18N
        jPanel9.add(jLabel38);
        jLabel38.setBounds(0, 0, 1360, 570);

        jLabel58.setText("jLabel58");
        jPanel9.add(jLabel58);
        jLabel58.setBounds(330, 290, 40, 14);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10);
        jPanel10.setBounds(200, 200, 100, 100);

        jTabbedPane1.addTab("*Patient Bill", jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(null);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Patient ID");
        jPanel16.add(jLabel34);
        jLabel34.setBounds(100, 50, 130, 40);

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
        jPanel16.add(jTextField11);
        jTextField11.setBounds(230, 50, 300, 50);

        jPanel11.add(jPanel16);
        jPanel16.setBounds(1374, 0, 0, 0);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("Patient ID");
        jPanel11.add(jLabel35);
        jLabel35.setBounds(170, 110, 110, 50);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(jLabel40);
        jLabel40.setBounds(40, 200, 600, 50);

        jComboBox16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox16ActionPerformed(evt);
            }
        });
        jComboBox16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox16KeyPressed(evt);
            }
        });
        jPanel11.add(jComboBox16);
        jComboBox16.setBounds(280, 110, 150, 50);

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Check Out");
        jPanel11.add(jLabel46);
        jLabel46.setBounds(120, 10, 1080, 60);

        jButton11.setBackground(new java.awt.Color(204, 0, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Check Out");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton11);
        jButton11.setBounds(80, 270, 510, 60);

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel57);
        jLabel57.setBounds(1270, 0, 90, 80);

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Add.jpg"))); // NOI18N
        jPanel11.add(jLabel42);
        jLabel42.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab("*check Out", jPanel11);

        desktopPane.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 140, 1370, 600);

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
    public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     jLabel5.setText(df.format(dt));
 }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Add  Oparetion
        Add_Oparetion();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear_seatch_table();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //  Search
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        dt.setRowCount(0);
        DefaultTableModel dt8 = (DefaultTableModel) jTable8.getModel();
        while (dt8.getRowCount() > 0) {
            for (int i = 0; i < dt8.getRowCount(); i++) {
                dt8.removeRow(i);
            }
        }
        DefaultTableModel dt9 = (DefaultTableModel) jTable9.getModel();
      dt9.setRowCount(0);
        Search_Patient_Test1();
        // jTextField9.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyTyped
    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        contest();
        jTextField2.requestFocus();
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField10.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jLabel32.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Add_Patient_Test();
        show_date();
        show_test();
       //Combobox4_Show();
        test_Patient();
        Doctor_Name();
        Oparetion_Show();
        jtable1_view();
        jtable7_Oparetion_Detailse_view();
        Jcombobox14_Test_Show();
        jtable6_TestDetailse_view();
        jtable4_Patient_Test_view();
        jtable5_Patient_oparetion_view();
        View_jComboBox9_Id_Search();
        View_jComboBox16_Id_Search();
        View_jComboBox10_Id_Search();
        View_jComboBox11_Id_Search();
        View_jComboBox13_Id_Search();
        View_jComboBox15_Oparetion_Search();

    }//GEN-LAST:event_jButton1ActionPerformed
    private void jComboBox5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           Add_Patient_Test();
        show_date();
        show_test();
     Combobox4_Show();
        test_Patient();
        Doctor_Name();
        Oparetion_Show();
        jtable1_view();
        jtable7_Oparetion_Detailse_view();
        Jcombobox14_Test_Show();
        jtable6_TestDetailse_view();
        jtable4_Patient_Test_view();
        jtable5_Patient_oparetion_view();
        View_jComboBox9_Id_Search();
        View_jComboBox16_Id_Search();
        View_jComboBox10_Id_Search();
        View_jComboBox11_Id_Search();
        View_jComboBox13_Id_Search();
        View_jComboBox15_Oparetion_Search();

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5KeyPressed
    private void jComboBox5PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox5PopupMenuWillBecomeInvisible

    }//GEN-LAST:event_jComboBox5PopupMenuWillBecomeInvisible
    private void jComboBox4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox4KeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4KeyReleased
    private void jComboBox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox4KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox5.requestFocus();
        }
    }//GEN-LAST:event_jComboBox4KeyPressed
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        Combobox5_Show();

    }//GEN-LAST:event_jComboBox4ActionPerformed
    private void jComboBox4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox4PopupMenuWillBecomeInvisible

    }//GEN-LAST:event_jComboBox4PopupMenuWillBecomeInvisible
    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyTyped
    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox6.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyPressed
    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed
    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
      
    }//GEN-LAST:event_jTextField7KeyTyped
    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField8.requestFocus();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyPressed
    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped
    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField7.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField6.requestFocus();
        }
    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox2.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox1.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox6KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox4.requestFocus();
        }
    }//GEN-LAST:event_jComboBox6KeyPressed

    private void Patien_Id_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patien_Id_SearchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Patien_Id_SearchActionPerformed

    private void Test_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Test_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Test_IdActionPerformed

    private void Oparetion_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Oparetion_idActionPerformed
        // TODO add your handling code here:
        jComboBox8.setSelectedIndex(0);
        jTextField24.setText("");
        jTextField9.setText("View Oparetion Fee");
    }//GEN-LAST:event_Oparetion_idActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        // TODO add your handling code here:
        try {
            String h = "SELECT `Firs_Name` FROM `pasent_info` WHERE `Pasent_Id`='" + jComboBox13.getSelectedItem() + "'";
            contest();
            st = ct.createStatement();
            //  String i="SELECT `Pasent_Id` FROM `pasent_info`"; 
            rs = st.executeQuery(h);
            while (rs.next()) {
                jTextField28.setText("" + rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
       if(Test_Id.getSelectedIndex()<=0){
           jLabel8.setText("'Please Select Patient Id'");
 jTextField15.setText("");
       Test_Id.requestFocus();
       }
       else{
        contest();
        try {st=null;
            st = ct.createStatement();
            String s = "SELECT  `M_T_Price` FROM `medical_test_info` WHERE `M_T_Nmae`='" + jComboBox7.getSelectedItem() + "'";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField3.setText("" + rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {st=null; 
        id=0;       
        st = ct.createStatement();
            String s = "SELECT `T_Id` FROM `patient_test_info` WHERE `Pasent_Id`='"+Test_Id.getSelectedItem()+"'";
            rs = st.executeQuery(s);
            while (rs.next()) {
                id=rs.getInt(1); 
            }
            id=id+1;
 jTextField15.setText("" + id);
        }catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:]
       if(Oparetion_id.getSelectedIndex()<=0){
           jLabel30.setText("'Please Select Patient Id'");
       jTextField24.setText("");
       Oparetion_id.requestFocus();
       } else{contest();

        //   jTextField3.setText("");
        try {
            st = ct.createStatement();
            String s = "SELECT  `O_Price` FROM `oparetiont_info` WHERE `O_Name`='" + jComboBox8.getSelectedItem() + "'";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField9.setText("" + rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {st=null; 
        id=0;       
        st = ct.createStatement();
 String s = "SELECT `O_Id` FROM `patient_oparetion_info` WHERE `Pasent_Id`='"+Oparetion_id.getSelectedItem()+"'";
            rs = st.executeQuery(s);
            while (rs.next()) {
                id=rs.getInt(1); 
            }
            id=id+1;
jTextField24.setText("" + id);
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
        contest();
        try {
            st = ct.createStatement();
            String s = "SELECT `D_Fee` FROM `doctor_info` WHERE `D_Name`='" + jComboBox6.getSelectedItem() + "'";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField10.setText("" + rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jComboBox14.setSelectedIndex(0);
        Test_Id.setSelectedIndex(0);
        jComboBox7.setSelectedIndex(0);
        jTextField18.setText("Test NO");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField15.setText("");
        jLabel8.setText("");
        jTextField3.setText("View Test Fee");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

        ShowTotal();

    }//GEN-LAST:event_jButton23ActionPerformed
    public void refrash() {
        jComboBox14.removeAllItems();
        jComboBox15.removeAllItems();
        jComboBox8.removeAllItems();
        jComboBox13.removeAllItems();
        jComboBox16.removeAllItems();
        jComboBox15.removeAllItems();
        Oparetion_id.removeAllItems();
        jComboBox7.removeAllItems();
        Test_Id.removeAllItems();
        Patien_Id_Search.removeAllItems();
        String s = "---Select---";
        jComboBox8.addItem(s);
        jComboBox7.addItem(s);
        jComboBox14.addItem(s);
        jComboBox15.addItem(s);
        Oparetion_id.addItem(s);
        jComboBox13.addItem(s);
        jComboBox16.addItem(s);
        jComboBox15.addItem(s);
        Test_Id.addItem(s);
        Patien_Id_Search.addItem(s);
        View_jComboBox16_Id_Search();
        View_jComboBox10_Id_Search();
        View_jComboBox11_Id_Search();
        Oparetion_Show();
        View_jComboBox13_Id_Search();
        test_Patient();
        View_jComboBox15_Oparetion_Search();
        View_jComboBox9_Id_Search();
        Jcombobox14_Test_Show();
        View_jComboBox15_Oparetion_Search();
    //    jLabel22.setText("");
        jLabel6.setText("");
        jLabel8.setText("");
        jLabel8.setText("");
        jLabel30.setText("");
        jLabel40.setText("");
        jLabel6.setText("");
        jLabel30.setText("");
        jLabel8.setText("");
        jLabel40.setText("");
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
       dt.setRowCount(0);      
       DefaultTableModel dt7 = (DefaultTableModel) jTable7.getModel();
        dt7.setRowCount(0);
        DefaultTableModel dt6 = (DefaultTableModel) jTable6.getModel();
       dt6.setRowCount(0);
        jtable1_view();
        jtable6_TestDetailse_view();
        jtable7_Oparetion_Detailse_view();

    }
    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        contest();
        try {
            st = ct.createStatement();
            String s = " SELECT  `Bed_Price` FROM `wb` WHERE `Bed`='" + jComboBox5.getSelectedItem() + "'";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField12.setText("" + rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed

      Add_Patient();
       
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
        jTextField13.setText(dt.getValueAt(jTable4.getSelectedRow(), 0).toString());
        jTextField14.setText(dt.getValueAt(jTable4.getSelectedRow(), 1).toString());
        jTextField16.setText(dt.getValueAt(jTable4.getSelectedRow(), 2).toString());
        jTextField17.setText(dt.getValueAt(jTable4.getSelectedRow(), 3).toString());
        jTextField18.setText(dt.getValueAt(jTable4.getSelectedRow(), 1).toString());
        jComboBox14.setSelectedItem(dt.getValueAt(jTable4.getSelectedRow(), 2).toString());
jLabel8.setText("");

    }//GEN-LAST:event_jTable4MouseClicked

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        // TODO add your handling code here:
        Update_Patient();

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        if (jTextField13.getText().isEmpty()) {
            jLabel8.setText("'Please Select Row'");
        } else if (jTextField14.getText().isEmpty()) {
            jLabel8.setText("'Please Select Row'");
        } else if (jTextField16.getText().isEmpty()) {
            jLabel8.setText("'Please Select Row'");
        } else if (jTextField17.getText().isEmpty()) {
            jLabel8.setText("'Please Select Row'");
        } else {
            int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Delete The Patient Test...???", "Delete Patient Test", JOptionPane.YES_NO_OPTION);
       
        if(p==0){
            try {
                String d = "DELETE FROM `patient_test_info` WHERE `Pasent_Id`='" + jTextField13.getText() + "' AND `T_Id`='" + jTextField14.getText() + "'AND `T_Name`='" + jTextField16.getText() + "'";
                contest();
                ps = null;
                ps = ct.prepareCall(d);
                ps.execute();
                ps.executeUpdate();
                DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField18.setText("");
                jComboBox14.removeAll();
                String s = "---Select---";
                jComboBox14.setSelectedItem(s);
                Jcombobox14_Test_Show();
                jtable4_Patient_Test_view();
                jLabel8.setText("''Patient Test Has Been Delete''");
                jtable1_view();
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }}
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        if (jTextField19.getText().isEmpty()) {
            jLabel30.setText("'Please Select Row'");
        } else if (jTextField20.getText().isEmpty()) {
            jLabel30.setText("'Please Select Row'");
        } else if (jTextField21.getText().isEmpty()) {
            jLabel30.setText("'Please Select Row'");
        } else if (jTextField22.getText().isEmpty()) {
            jLabel30.setText("'Please Select Row'");
        } else {
            int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Delete The Patient Oparetion...???", "Delete Patient Operation", JOptionPane.YES_NO_OPTION);
       
        if(p==0){
            try {
                String d = "DELETE FROM `patient_oparetion_info` WHERE `Pasent_Id`='" + jTextField19.getText() + "' AND `O_Id`='" + jTextField20.getText() + "'AND `O_Name`='" + jTextField21.getText() + "'";
                contest();
                ps = null;
                ps = ct.prepareCall(d);
                ps.execute();
                ps.executeUpdate();
                DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                jTextField19.setText("");
                jTextField20.setText("");
                jTextField21.setText("");
                jTextField22.setText("");
                jTextField23.setText("");
                jComboBox15.removeAll();
                String s = "---Select---";
                jComboBox15.setSelectedItem(s);
                View_jComboBox15_Oparetion_Search();
                jtable5_Patient_oparetion_view();
                jtable1_view();
                jLabel30.setText("''Patient Oparetion Has Been Delete''");
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        Update_Patient_Oparetion();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
        jTextField19.setText(dt.getValueAt(jTable5.getSelectedRow(), 0).toString());
        jTextField20.setText(dt.getValueAt(jTable5.getSelectedRow(), 1).toString());
        jTextField21.setText(dt.getValueAt(jTable5.getSelectedRow(), 2).toString());
        jTextField22.setText(dt.getValueAt(jTable5.getSelectedRow(), 3).toString());

        jTextField23.setText(dt.getValueAt(jTable5.getSelectedRow(), 1).toString());
        jComboBox15.setSelectedItem(dt.getValueAt(jTable5.getSelectedRow(), 2).toString());
        jLabel30.setText("");
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        jComboBox15.setSelectedIndex(0);
        Oparetion_id.setSelectedIndex(0);
        jComboBox8.setSelectedIndex(0);
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField15.setText("");
        jTextField9.setText("View Oparetion Fee");
        jLabel30.setText("");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jComboBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox16ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
//sDelete_Patient(); 
        int j = 0;
        try {
            st = ct.createStatement();
            String select = "SELECT `Pasent_Id` FROM `chack_out`";
            rs = st.executeQuery(select);
            while (rs.next()) {
                if (rs.getString(1).equals(jComboBox16.getSelectedItem())) {
                    j = 1;
                }}
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (jComboBox16.getSelectedIndex() <= 0) {
            jLabel40.setText("Please Select The Patient Id");
        } else if (j == 1) {
            jLabel40.setText("Sorry This Patient All-Ready Check Out");
        } else {
            ps = null;
            contest();
            String checkout = "INSERT `chack_out`(`Pasent_Id`,`C_Date`)VALUES (?,?) ";
            String pchackout = "UPDATE `pasent_info`SET `status`='Chack Out' WHERE `Pasent_Id`='" + jComboBox16.getSelectedItem() + "'";

            try {
                tps = ct.prepareCall(pchackout);
                tps.execute();
                ps = ct.prepareCall(checkout);

                ps.setString(1, (String) jComboBox16.getSelectedItem());
                ps.setString(2, jLabel5.getText());
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel40.setText("Patient Check out Success...");
                }
                jComboBox16.removeAllItems();
                String s = "---Select---";
                jComboBox16.addItem(s);
                View_jComboBox16_Id_Search();

            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        if (jComboBox13.getSelectedIndex() <= 0) {
            jLabel43.setText("Please Select The Patient Id ");
            jComboBox13.requestFocus();
        } else if (jTextField27.getText().isEmpty()) {
            jLabel43.setText("Please Enter Patient Bill How Much Pay  ");
            jTextField27.requestFocus();
        } else {
             int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The Patient Bill...???", "Add Patient", JOptionPane.YES_NO_OPTION);
        if(p==0){    
            st();
        }
        }
        //ShowTotal();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Reception_1st rc1 = new Reception_1st();
        rc1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Test_IdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Test_IdKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox7.requestFocus();
        }
    }//GEN-LAST:event_Test_IdKeyPressed

    private void jComboBox7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox7KeyPressed
        // TODO add your handling code here:
             if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           Add_Patient();  }
    }//GEN-LAST:event_jComboBox7KeyPressed

    private void Oparetion_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Oparetion_idKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           jComboBox8.requestFocus();
        }
    }//GEN-LAST:event_Oparetion_idKeyPressed

    private void jComboBox8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox8KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         Add_Oparetion();
        }
    }//GEN-LAST:event_jComboBox8KeyPressed

    private void Patien_Id_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Patien_Id_SearchKeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        dt.setRowCount(0);
        DefaultTableModel dt8 = (DefaultTableModel) jTable8.getModel();
        while (dt8.getRowCount() > 0) {
            for (int i = 0; i < dt8.getRowCount(); i++) {
                dt8.removeRow(i);
            }
        }
        DefaultTableModel dt9 = (DefaultTableModel) jTable9.getModel();
      dt9.setRowCount(0);
        Search_Patient_Test1();}
    }//GEN-LAST:event_Patien_Id_SearchKeyPressed

    private void jComboBox13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox13KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ShowTotal();
          
          }
    }//GEN-LAST:event_jComboBox13KeyPressed

    private void jTextField27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyPressed
        // TODO add your handling code here:
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if (jComboBox13.getSelectedIndex() <= 0) {
            jLabel43.setText("Please Select The Patient Id ");
            jComboBox13.requestFocus();
        } else if (jTextField27.getText().isEmpty()) {
            jLabel43.setText("Please Enter Patient Bill How Much Pay  ");
            jTextField27.requestFocus();
        } else {
            st();
        }
       }
    }//GEN-LAST:event_jTextField27KeyPressed

    private void jComboBox16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox16KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { int j = 0;
        try {
            st = ct.createStatement();
            String select = "SELECT `Pasent_Id` FROM `chack_out`";
            rs = st.executeQuery(select);
            while (rs.next()) {

                if (rs.getString(1).equals(jComboBox16.getSelectedItem())) {
                    j = 1;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (jComboBox16.getSelectedIndex() <= 0) {
            jLabel40.setText("Please Select The Patient Id");
        } else if (j == 1) {
            jLabel40.setText("Sorry This Patient All-Ready Check Out");
        } else {
            ps = null;
            contest();
            String checkout = "INSERT `chack_out`(`Pasent_Id`,`C_Date`)VALUES (?,?) ";
            String pchackout = "UPDATE `pasent_info`SET `status`='Chack Out' WHERE `Pasent_Id`='" + jComboBox16.getSelectedItem() + "'";

            try {
                tps = ct.prepareCall(pchackout);
                tps.execute();
                ps = ct.prepareCall(checkout);

                ps.setString(1, (String) jComboBox16.getSelectedItem());
                ps.setString(2, jLabel5.getText());
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel40.setText("Patient Check out Success...");
                }
                jComboBox16.removeAllItems();
                String s = "---Select---";
                jComboBox16.addItem(s);
                View_jComboBox16_Id_Search();

            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_jComboBox16KeyPressed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
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
    }//GEN-LAST:event_jLabel33MouseClicked

public int test4(){
int n=0;
int p = 0;

contest();
        try {st=null;
            st = ct.createStatement();
            String s = "SELECT `Pasent_Id` FROM `pasent_info` WHERE `Pasent_Id`='"+Test_Id.getSelectedItem().toString()+"'";
            rs = st.executeQuery(s);
            while (rs.next()) {
            n=rs.getInt(1);
      // JOptionPane.showMessageDialog(rootPane, "hhh="+n);
         p=Integer.parseInt(Test_Id.getSelectedItem().toString());
         
            } } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        

}
return p;}
public int Patientbill(){
int n=0;
int p = 0;

contest();
        try {st=null;
            st = ct.createStatement();
            String s = "SELECT `Pasent_Id` FROM `pasent_info` WHERE `Pasent_Id`='"+jComboBox13.getSelectedItem().toString()+"'";
            rs = st.executeQuery(s);
            while (rs.next()) {
            n=rs.getInt(1);
      // JOptionPane.showMessageDialog(rootPane, "hhh="+n);
         p=Integer.parseInt(jComboBox13.getSelectedItem().toString());
         
            } } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        

}
return p;}
public int Patient(){
int n=0;
int p = 0;

contest();
        try {st=null;
            st = ct.createStatement();
            String s = "SELECT `Pasent_Id` FROM `pasent_info` WHERE `Pasent_Id`='"+Patien_Id_Search.getSelectedItem().toString()+"'";
            rs = st.executeQuery(s);
            while (rs.next()) {
            n=rs.getInt(1);
      // JOptionPane.showMessageDialog(rootPane, "hhh="+n);
         p=Integer.parseInt(Patien_Id_Search.getSelectedItem().toString());
         
            } } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        

}
return p;}
public int Patient_bill(){
int n=0;
int p = 0;

contest();
        try {st=null;
            st = ct.createStatement();
            String s = "SELECT `Pasent_Id` FROM `pasent_info` WHERE `Pasent_Id`='"+Patien_Id_Search.getSelectedItem().toString()+"'";
            rs = st.executeQuery(s);
            while (rs.next()) {
            n=rs.getInt(1);
      // JOptionPane.showMessageDialog(rootPane, "hhh="+n);
         p=Integer.parseInt(Patien_Id_Search.getSelectedItem().toString());
         
            } } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        

}
return p;}
public int Oparetion4(){
int n=0;
int p = 0;
contest();
        try {st=null;
            st = ct.createStatement();
            String s = "SELECT `Pasent_Id` FROM `pasent_info` WHERE `Pasent_Id`='"+Oparetion_id.getSelectedItem().toString()+"'";
            rs = st.executeQuery(s);
            while (rs.next()) {
            n=rs.getInt(1);
      // JOptionPane.showMessageDialog(rootPane, "hhh="+n);
         p=Integer.parseInt(Oparetion_id.getSelectedItem().toString());
         
            } } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }


return p;}


    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
       if(jComboBox13.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(rootPane, "Patint Id Is Empty");
        }else{
        Print_Patient_Bill p=new Print_Patient_Bill(Patientbill());
   p.setVisible(true);
        }
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jComboBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox17ActionPerformed
        // TODO add your handling code here:
        if(Test_Id.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(Oparetion_id, "Patient Id Is Empty...!!!");
        }else{if(jComboBox17.getSelectedItem()=="Patient Test"){
         Print_Test p=new Print_Test(test4());
   p.setVisible(true);
        }else if(jComboBox17.getSelectedItem()=="Test"){
        Print_Test1 p=new Print_Test1();
   p.setVisible(true);
        }}
    }//GEN-LAST:event_jComboBox17ActionPerformed

    private void Oparetion_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Oparetion_SubmitActionPerformed
     if(Oparetion_Submit.getSelectedItem()=="Patient Oparetion"){
       if(Oparetion_id.getSelectedIndex()<=0 ){
JOptionPane.showMessageDialog(rootPane, "Patient Id Is Empty");
}else{  
         Print_Oparetion o=new Print_Oparetion(Oparetion4());
  o.setVisible(true);
       }  }else if(Oparetion_Submit.getSelectedItem()=="Oparetion"){
       Print_Oparetion1 o1=new Print_Oparetion1();
  o1.setVisible(true);
       }
    }//GEN-LAST:event_Oparetion_SubmitActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(Patien_Id_Search.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(rootPane, "Patint Id Is Empty");
        }else{
        Print_Patient p=new Print_Patient(Patient());
   p.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable1.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered
    public void Doctor_Name() {
        jComboBox6.removeAllItems();
         jComboBox6.addItem("---Select---");contest();
        try {
            st = ct.createStatement();
            String d = "SELECT `D_Name` FROM `doctor_info`";
            rs = st.executeQuery(d);
            while (rs.next()) {
                jComboBox6.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void View_jComboBox9_Id_Search() {
     Patien_Id_Search.removeAllItems();
     Patien_Id_Search.addItem("---Select---");contest();
        try {
            st = ct.createStatement();
            String i = "SELECT `Pasent_Id` FROM `pasent_info`";
            rs = st.executeQuery(i);
            while (rs.next()) {
                Patien_Id_Search.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void View_jComboBox16_Id_Search() {
        jComboBox16.removeAllItems();
         jComboBox16.addItem("---Select---");
         contest();
        try {
            st = ct.createStatement();
            String i = "SELECT `Pasent_Id`FROM `pasent_info` WHERE `status`='check in'";
            rs = st.executeQuery(i);
            while (rs.next()) {
                jComboBox16.addItem("" + rs.getInt(1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void View_jComboBox10_Id_Search() {
        Test_Id.removeAllItems();
          Test_Id.addItem("---Select---");
          contest();
        try {
            st = ct.createStatement();
            String i = "SELECT `Pasent_Id` FROM `pasent_info`";
            rs = st.executeQuery(i);
            while (rs.next()) {
                Test_Id.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void View_jComboBox11_Id_Search() {
       Oparetion_id.removeAllItems();
        Oparetion_id.addItem("---Select---");
       contest();
        try {
            st = ct.createStatement();
            String i = "SELECT `Pasent_Id` FROM `pasent_info`";
            rs = st.executeQuery(i);
            while (rs.next()) {
                Oparetion_id.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void View_jComboBox15_Oparetion_Search() {
          
        jComboBox15.removeAllItems();
        jComboBox15.addItem("---Select---");
        contest();
        try {
            st = ct.createStatement();
            String ope = "SELECT `O_Name` FROM `oparetiont_info`";
            rs = st.executeQuery(ope);
            while (rs.next()) {
                jComboBox15.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void View_jComboBox13_Id_Search() {
        jComboBox13.removeAllItems();
        jComboBox13.addItem("---Select---");
        contest();
        try {
            st = ct.createStatement();
            String i = "SELECT `Pasent_Id` FROM `pasent_info`";
            rs = st.executeQuery(i);
            while (rs.next()) {

                jComboBox13.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void test_Patient() {
      jComboBox7.removeAllItems();
      jComboBox7.addItem("---Select---");
      contest();
        try {
            st = ct.createStatement();
            String test = "SELECT `M_T_Nmae` FROM `medical_test_info`";
            rs = st.executeQuery(test);
            while (rs.next()) {
                jComboBox7.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Jcombobox14_Test_Show() {
        contest();
        try {
            jComboBox14.removeAllItems();
            jComboBox14.addItem("---Select---");
            st = ct.createStatement();
            String test = "SELECT `M_T_Nmae` FROM `medical_test_info`";
            rs = st.executeQuery(test);
            while (rs.next()) {
                jComboBox14.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Oparetion_Show() {
        jComboBox8.removeAllItems();
         jComboBox8.addItem("---Select---");
         contest();
        try {
            st = ct.createStatement();
            String ope = "SELECT `O_Name` FROM `oparetiont_info`";
            rs = st.executeQuery(ope);
            while (rs.next()) {
                jComboBox8.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Add_Patient() {
        ps = null;
        if (Test_Id.getSelectedIndex() == 0) {
            jLabel8.setText("'Please Selecte The Patient ID'");
            Test_Id.requestFocus();
        } else if (jComboBox7.getSelectedIndex() == 0) {
            jLabel8.setText("'Please Selecte The Test Name'");
            jComboBox7.requestFocus();
        } else if (jTextField15.getText().isEmpty()) {
            jLabel8.setText("'Please Enter Test NO'");
            jTextField15.requestFocus();
        } else { int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The Patient Test...???", "Add Patient Test", JOptionPane.YES_NO_OPTION);
       
        if(p==0){
            contest();
            String test = "INSERT INTO `patient_test_info` (`Pasent_Id`,`T_Name`,`T_Id`,`T_Fee`) VALUES (?,?,?,?)";
            try {
                ps = ct.prepareCall(test);
                ps.setString(1, Test_Id.getSelectedItem().toString());
                ps.setString(2, jComboBox7.getSelectedItem().toString());
                ps.setString(3, jTextField15.getText());
                ps.setString(4, jTextField3.getText());
                ps.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
            while (dt.getRowCount() > 0) {
                for (int i = 0; i < dt.getRowCount(); i++) {
                    dt.removeRow(i);
                }
            }
            contest();
            jLabel8.setText("''Patient Test Has Been Add''");
            jComboBox7.setSelectedIndex(0);
            Test_Id.setSelectedIndex(0);
            jTextField15.setText("");
            jTextField3.setText("View Test Fee");
            jtable4_Patient_Test_view();
jtable1_view();
        }}
    }

    public void Add_Oparetion() {
        ps = null;
        if (Oparetion_id.getSelectedIndex() == 0) {
            jLabel30.setText("'Please Selecte The Patient ID'");
            Oparetion_id.requestFocus();
        } else if (jComboBox8.getSelectedIndex() == 0) {
            jLabel30.setText("'Please Selecte The Test Name'");
            jComboBox8.requestFocus();
        } else if (jTextField24.getText().isEmpty()) {
            jLabel30.setText("'Please Enter Test NO'");
            jTextField24.requestFocus();
        } else {
            int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The Patient Oparetion...???", "Add Patient Oparetion", JOptionPane.YES_NO_OPTION);
       
        if(p==0){
            contest();
            String test = "INSERT INTO `patient_oparetion_info` (`Pasent_Id`,`O_Name`,`O_Id`,`O_Fee`) VALUES (?,?,?,?)";
            try {
                ps = ct.prepareCall(test);
                ps.setString(1, Oparetion_id.getSelectedItem().toString());
                ps.setString(2, jComboBox8.getSelectedItem().toString());
                ps.setString(3, jTextField24.getText());
                ps.setString(4, jTextField9.getText());
                ps.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
            while (dt.getRowCount() > 0) {
                for (int i = 0; i < dt.getRowCount(); i++) {
                    dt.removeRow(i);
                }
            }
            contest();
            jLabel30.setText("''Patient Test Has Been Add''");
            jComboBox8.setSelectedIndex(0);
            Oparetion_id.setSelectedIndex(0);
            jTextField24.setText("");
            jTextField9.setText("View Test Fee");
            jtable5_Patient_oparetion_view();
jtable1_view();
        }}
    }

    public void Update_Patient() {
        ps = null;
        if (jTextField13.getText().isEmpty()) {
            jLabel8.setText("'Please Selecte The Patient ID From Table'");
            jTextField13.requestFocus();
        } else if (jComboBox14.getSelectedIndex() == 0) {
            jLabel8.setText("'Please Selecte The Test Name From Table'");
            jComboBox7.requestFocus();
        } else {
            int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Change The Patient Test...???", "Change Patient Test", JOptionPane.YES_NO_OPTION);
        if(p==0){
            contest();
            String test = "UPDATE `patient_test_info` SET `T_Id`='" + jTextField18.getText() + "',`T_Name`='" + jComboBox14.getSelectedItem() + "' WHERE `Pasent_Id`='" + jTextField13.getText() + "'AND `T_Id`='" + jTextField14.getText() + "' ";
            try {
                ps = ct.prepareCall(test);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                contest();

                jtable4_Patient_Test_view();
                jLabel8.setText("''Patient Test Has Been Update''");
                jComboBox7.setSelectedIndex(0);
                Test_Id.setSelectedIndex(0);
                jTextField3.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField18.setText("");
                jTextField15.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jComboBox14.setSelectedIndex(0);
                jtable1_view();
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}
    }

    public void Update_Patient_Oparetion() {
        ps = null;
        if (jTextField19.getText().isEmpty()) {
            jLabel30.setText("'Please Selecte Row'");
            jTextField19.requestFocus();
        } else if (jComboBox15.getSelectedIndex() == 0) {
            jLabel30.setText("'Please Selecte The Test Name'");
            jComboBox15.requestFocus();
        } else if (jTextField23.getText().isEmpty()) {
            jLabel30.setText("'Please Selecte The Oparetion No'");
            jTextField23.requestFocus();
        } else {
            int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Change The Patient Oparetion...???", "Change Patient Oparetion", JOptionPane.YES_NO_OPTION);
       if(p==0){
            contest();
            String test = "UPDATE `patient_oparetion_info` SET `O_Id`='" + jTextField23.getText() + "',`O_Name`='" + jComboBox15.getSelectedItem() + "' WHERE `Pasent_Id`='" + jTextField19.getText() + "'AND `O_Id`='" + jTextField20.getText() + "' ";
            try {
                ps = ct.prepareCall(test);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                contest();

                jtable5_Patient_oparetion_view();
                jLabel30.setText("''Patient Oparetion Has Been Update''");

                jComboBox8.setSelectedIndex(0);
                Oparetion_id.setSelectedIndex(0);
                jTextField23.setText("");
                jTextField19.setText("");
                jTextField20.setText("");
                jTextField9.setText("View Oparetion Fee");
                jTextField24.setText("");
                jTextField21.setText("");
                jTextField22.setText("");

                jComboBox15.setSelectedIndex(0);
                jtable1_view();
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        }
    }

    public void Add_PatientTest_Combo_Test() {
        ps = null;
        if (Test_Id.getSelectedIndex() <= 0) {
            jLabel8.setText("Patient Id Is Empty");
        } else if (jComboBox7.getSelectedIndex() <= 0) {
            jLabel18.setText("Test Name Is Empty");
            jComboBox7.requestFocus();
        } else {
            contest();
            String test = "UPDATE `pasent_info` SET `P_Test`='" + jComboBox7.getSelectedItem() + "' WHERE `Pasent_Id`='" + Test_Id.getSelectedItem() + "'";
            try {
                ps = ct.prepareCall(test);
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabel8.setText("Patient Test Add Success...");
        }
    }

    public void Add_Patient_Test() {
        
            if (jTextField2.getText().isEmpty()) {
          jLabel32.setText( "'First_Nmae Is Empty'");
                jTextField2.requestFocus();
            } else if (jTextField4.getText().isEmpty()) {
              jLabel32.setText("'Age Name Is Empty'");
                jTextField4.requestFocus();
            } else if (jTextField6.getText().isEmpty()) {
        jLabel32.setText("'Address Name Is Empty'");
                jTextField6.requestFocus();
            } else if (jTextField7.getText().isEmpty()) {
              jLabel32.setText( "'City Name Is Empty'");
                jTextField7.requestFocus();
            } else if (jTextField8.getText().isEmpty()) {
               jLabel32.setText("'Phone Number Name Is Empty'");
                jTextField8.requestFocus();
            } else if (jComboBox6.getSelectedIndex() <= 0) {
               jLabel32.setText("'Doctor Name Is Empty'");
                jComboBox6.requestFocus();
            } else if (jComboBox1.getSelectedIndex() <= 0) {
                 jLabel32.setText("'Gender Is Empty'");
                jComboBox1.requestFocus();
            } else if (jComboBox2.getSelectedIndex() <= 0) {
                jLabel32.setText("'Patient Type Is Empty'");
                jComboBox2.requestFocus();
            } else if (jComboBox4.getSelectedIndex() <= 0) {
             jLabel32.setText( "'Ward NO Is Empty'");
                jComboBox4.requestFocus();
            } else if (jComboBox5.getSelectedIndex() <= 0) {
               jLabel32.setText( "'Bed NO Is Empty'");
                jComboBox5.requestFocus();
            } else { int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add The Word Or Bed...???", "Add Word Or Bed", JOptionPane.YES_NO_OPTION);
        if(p==0){
         
                contest();

                ps = null;
                String insert = "INSERT INTO `pasent_info` (`Pasent_Id`,`Firs_Name`,`Age`,`Gender`,`Maritial`,`Date`,`Address`,`City`,`Phone_Number`,`Doctor_Name`,`Patient_Type`,`Ward_No`,`Bed_No`,`Doctor fee`,`Bed_Price`)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                try {
                    ps = ct.prepareCall(insert);
                    ps.setString(1, jTextField1.getText());
                    ps.setString(2, jTextField2.getText());
                   ps.setString(3, jTextField4.getText());
                    ps.setString(4, jComboBox1.getSelectedItem().toString());
                    ps.setString(5, jComboBox2.getSelectedItem().toString());
                    ps.setString(6, jLabel5.getText());
                    ps.setString(7, jTextField6.getText());
                    ps.setString(8, jTextField7.getText());
                    ps.setString(9, jTextField8.getText());
                    ps.setString(10, jComboBox6.getSelectedItem().toString());
                    ps.setString(11, "Indoor");
                    ps.setString(12, jComboBox4.getSelectedItem().toString());
                    ps.setString(13, jComboBox5.getSelectedItem().toString());
                    ps.setString(14, jTextField10.getText().toString());
                     ps.setString(15, jTextField12.getText().toString());
                    int m = ps.executeUpdate();
                    if (m > 0) {

                        show_test();
                        jTextField2.requestFocus();
                        jTextField2.setText("");

                        jTextField4.setText("");
                        jTextField6.setText("");
                        jTextField7.setText("");
                        jTextField8.setText("");
                        jComboBox6.setSelectedIndex(0);
                        jComboBox1.setSelectedIndex(0);
                        jComboBox2.setSelectedIndex(0);
                      //  jComboBox3.setSelectedIndex(0);
                        jComboBox4.setSelectedIndex(0);
                        jComboBox5.setSelectedIndex(0);
                        jTextField10.setText("");
                       jLabel32.setText("Patient Has Been Add");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                }
        } 
        }
    }

    public void contest() {
        try {
            ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            //ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int show_test() {
        contest();
        ps = null;
        // cleardata();
        String select = "SELECT `Pasent_Id` FROM `pasent_info`";
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
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

   

    public void Combobox4_Show() {
        contest();
        try {
                st = ct.createStatement();
                String s = " SELECT  `Word` FROM `wb` GROUP BY `Word`";
                rs = st.executeQuery(s);
                while (rs.next()) {
                    jComboBox4.addItem(rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    public void Combobox5_Show() {
        contest();
        jComboBox5.removeAllItems();
        String ss = "---Select---";
        jComboBox5.addItem(ss);
        jTextField12.setText("");
        try {
            st = ct.createStatement();
            String s = "SELECT `Bed` FROM `wb` WHERE `Word`='" + jComboBox4.getSelectedItem() + "'";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jComboBox5.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void clear_seatch_table() {
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);
            }
        }
DefaultTableModel dt1 = (DefaultTableModel) jTable9.getModel();
        while (dt1.getRowCount() > 0) {
            for (int i = 0; i < dt1.getRowCount(); i++) {
                dt1.removeRow(i);
            }
        }

        DefaultTableModel dt3 = (DefaultTableModel) jTable8.getModel();
        while (dt3.getRowCount() > 0) {
            for (int i = 0; i < dt3.getRowCount(); i++) {
                dt3.removeRow(i);
            }
        }

        jLabel6.setText("Clear Data");
    }

    /*public void Delete_Patient(){
        if(jComboBox16.getSelectedIndex()<=0){
      jLabel40.setText("Please Select The Patient Id"); }
       else if(jTable10.getRowCount()<=0){
         jLabel40.setText("Please Search Patient");
        }
        else{
    contest();
 ps=null;
 tps=null;
 ops=null;
String insert="DELETE FROM `pasent_info` WHERE `Pasent_Id` ='"+jComboBox16.getSelectedItem()+"'";
      String Op="DELETE FROM `patient_oparetion_info` WHERE `Pasent_Id`='"+jComboBox16.getSelectedItem()+"'";
      String t="DELETE FROM `patient_test_info` WHERE `Pasent_Id`='"+jComboBox16.getSelectedItem()+"'";
        try {
            ps=ct.prepareCall(insert);
            ps.execute(); 
            ps.executeUpdate();
              tps=ct.prepareCall(t);
           tps.execute();
           tps.executeUpdate(t);
            ops=ct.prepareCall(Op);
           ops.execute();
           ops.executeUpdate(t);
             //  jtable3_Clear();
               jLabel40.setText("Patient Delete Success..");
                  Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
         ps = null;
        String g="INSERT `d_date` (`Date`,`Pasent_Id`) VALUES (?,?)";
                ps = ct.prepareCall(g);
                //   ps.setString(4, jTextField4.getText());
                  ps.setString(1,df.format(dte));
                  ps.setString(2, (String) jComboBox16.getSelectedItem());
              ps.executeUpdate();
        jComboBox16.removeAllItems();
               DefaultTableModel dt10 = (DefaultTableModel) jTable10.getModel();
            while (dt10.getRowCount() > 0) {
                for (int i = 0; i < dt10.getRowCount(); i++) {
                    dt10.removeRow(i); } }
           String s ="---Select---";
           jComboBox16.addItem(s);
           View_jComboBox16_Id_Search();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex); }

        }    }*/
    public void jtable1_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);
        String select = "SELECT *FROM `p_t_o_info_final`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13), rs.getInt(14), rs.getString(15), rs.getInt(16), rs.getString(17)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void jtable3_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);
        String select = "SELECT `Pasent_Id`,`Firs_Name`,`Age`,`Gender`,`Maritial`,`Date`,`Address`,`City`,`Phone_Number`,`Doctor_Name`,`Patient_Type`,`Ward_No`,`Bed_No` FROM `pasent_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getInt(12), rs.getInt(13)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void jtable6_TestDetailse_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
        dt.setRowCount(0);
        String select = "SELECT `M_T_Nmae`,`M_T_Price` FROM`medical_test_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString(1), rs.getInt(2)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void jtable7_Oparetion_Detailse_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
        dt.setRowCount(0);
        String select = "SELECT `O_Name`,`O_Price` FROM `oparetiont_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString(1), rs.getInt(2)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void jtable4_Patient_Test_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
      dt.setRowCount(0);
        String select = "SELECT `Pasent_Id`,`T_Id`,`T_Name`,`T_Fee` FROM `patient_test_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void jtable5_Patient_oparetion_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
        dt.setRowCount(0);
        String select = "SELECT `Pasent_Id`,`O_Id`,`O_Name`,`O_Fee` FROM `patient_oparetion_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void Search_Patient_Test1() {
        if (Patien_Id_Search.getSelectedIndex() <= 0) {
            jLabel6.setText("Please Select The Patient ID");
            Patien_Id_Search.requestFocus();
        } else {
            Connection ct = null;
            Statement st = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
            try {
                ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
                st = ct.createStatement();
                // String str="SELECT `Name`,`Address` FROM `student_details` WHERE `Id`='"+jTextField1.getText()+"'";
                String Search = "SELECT `Pasent_Id`,`Firs_Name`,`Age`,`Gender`,`Maritial`,`Date`,`Address`,`City`,`Phone_Number`,`Doctor_Name`,`Patient_Type`,`Ward_No`,`Bed_No` FROM `pasent_info` WHERE `Pasent_Id`='" + Patien_Id_Search.getSelectedItem() + "'";
                rs = st.executeQuery(Search);
                while (rs.next()) {
                    DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getInt(12), rs.getInt(13)});

                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                String test = "SELECT `Pasent_Id`,`T_Id`,`T_Name` FROM `patient_test_info` WHERE `Pasent_Id`='" + Patien_Id_Search.getSelectedItem() + "'";

                rs = st.executeQuery(test);
                if (rs.next()) {
                    rss = st.executeQuery(test);
                    while (rss.next()) {
                        DefaultTableModel t9 = (DefaultTableModel) jTable9.getModel();
                        t9.addRow(new Object[]{rss.getInt(1), rss.getInt(2), rss.getString(3)});
                    }
                } else {
                    int N = 0;
                    String NT = "No Test";
                    DefaultTableModel t9 = (DefaultTableModel) jTable9.getModel();
                    t9.addRow(new Object[]{Patien_Id_Search.getSelectedItem(), N, NT});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            String Op = "SELECT `Pasent_Id`,`O_Id`,`O_Name` FROM `patient_oparetion_info` WHERE `Pasent_Id`='" + Patien_Id_Search.getSelectedItem() + "'";
            try {
                rs = st.executeQuery(Op);
                if (rs.next()) {
                    rss = st.executeQuery(Op);
                    while (rss.next()) {
                        DefaultTableModel t8 = (DefaultTableModel) jTable8.getModel();
                        t8.addRow(new Object[]{rss.getInt(1), rss.getInt(2), rss.getString(3)});
                    }
                } else {
                    int N = 0;
                    String NT = "No Oparetion ";
                    DefaultTableModel t8 = (DefaultTableModel) jTable8.getModel();
                    t8.addRow(new Object[]{Patien_Id_Search.getSelectedItem(), N, NT});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

            Patien_Id_Search.requestFocus();
            String s = (String) Patien_Id_Search.getSelectedItem();
            jLabel6.setText("This Is The Id No " + s);
            Patien_Id_Search.setSelectedIndex(0);
        }
    } 
    
    public double ShowTotal() {
        double tt1 = 0;
        if (jComboBox13.getSelectedIndex() <= 0) {
            jLabel43.setText("Please Select The Patient Id ");
            jComboBox13.requestFocus();
        } else {
            int f = 0, g = 0, h = 0, i = 0, j = 0;
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            String p = "";
            String q = "";
            String r = "";
            double t1 = 0;
            double t2 = 0;
            double t3 = 0;
            double tt = 0;
            int pt1 = 0;

            double tt2 = 0;
            Connection ct = null;
            Statement st = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
            try {
                ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
                st = ct.createStatement();
                   String checkutdate = "SELECT `Pasent_Id`,`C_Date` FROM `chack_out` WHERE `Pasent_Id`='" + jComboBox13.getSelectedItem() + "'";
                rss = st.executeQuery(checkutdate);
                if (rss.next()) {
                    jTextField26.setText("" + rss.getDate(2));
                } else {
      //Date dt = new Date();
      //DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       // jLabel5.setText(df.format(dt));
                    jTextField26.setText("" + jLabel5.getText());
                }
                String pas = "SELECT *FROM `show_date` WHERE `show_date`.`Pasent_Id`='" + jComboBox13.getSelectedItem() + "'";
                rs = st.executeQuery(pas);
                while (rs.next()) {
                    try {

                      jTextField25.setText("" + rs.getDate(5));
                        //  String y1=String.parseString(rs.getDate(1));
                        String bday = jTextField25.getText();
                        String cday = jTextField26.getText();
                        
                          SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                       
                        Date bb = df.parse(bday);
                        Date aa = df.parse(cday);

                        long dd = aa.getTime() - bb.getTime();
                        day = (dd / (1000 * 60 * 60 * 24));
                        if (day == 0) {
                            day = 1;
                        } else {
                            day = day;
                        }
                        // jTextField2.setText(""+day);
                        //   JOptionPane.showMessageDialog(rootPane, ""+day);
                    } catch (ParseException ex) {
                        Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    a = rs.getInt(3);

                    b = rs.getInt(4);
                    if (a <= 0) {
                        jTextArea1.setText("\nName          : " + rs.getString(2) + "\nBed Price     : " + b * day);
                        p = jTextArea1.getText();
                        t1 = b * day;
                    } else if (b <= 0) {
                        jTextArea1.setText("\nName          : " + rs.getString(2) + "\nDoctor Fee    : " + a * day);
                        // JOptionPane.showMessageDialog(rootPane, "d"+a);
                        /// JOptionPane.showMessageDialog(rootPane, "dad"+day);
                        p = jTextArea1.getText();
                        t1 = a * day;
                    } else {
                        jTextArea1.setText("\nName          : " + rs.getString(2) + "\nDoctor Fee    : " + (a * day) + "\nBed Price     : " + b * day);
                        //JOptionPane.showMessageDialog(rootPane, "d"+a);
                        //  JOptionPane.showMessageDialog(rootPane, "dad"+day);
                        p = jTextArea1.getText();
                        t1 = (a * day) + (b * day);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            String test = "SELECT SUM(`T_Fee`) AS `T_Fee` FROM `patient_test_info` WHERE `Pasent_Id` ='" + jComboBox13.getSelectedItem() + "'";
            try {
                rs = st.executeQuery(test);
                while (rs.next()) {
                    c = rs.getInt(1);
                    if (c <= 0) {
                    } else {
                        jTextArea1.setText("\nTest Fee      : " + rs.getInt(1));
                        q = jTextArea1.getText();
                        t2 = rs.getInt(1);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

            String op = "SELECT SUM(`O_Fee`) AS `O_Fee` FROM `patient_oparetion_info` WHERE `Pasent_Id`='" + jComboBox13.getSelectedItem() + "'";
            try {
                rs = st.executeQuery(op);
                while (rs.next()) {
                    d = rs.getInt(1);
                    if (d <= 0) {
                    } else {
                        jTextArea1.setText("\nOparetion Fee : " + rs.getInt(1));
                        t3 = rs.getInt(1);
                        r = jTextArea1.getText();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                st = ct.createStatement();
                String pt = "SELECT SUM(`Tk`)AS`Tk` FROM `prtient_bill` WHERE `P_Id`='" + jComboBox13.getSelectedItem() + "'GROUP BY `P_Id`";
                rs = st.executeQuery(pt);
                while (rs.next()) {
                    pt1 = rs.getInt(1);

                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            tt = t1 + t2 + t3;
            tt1 = tt - pt1;

            jTextArea1.setText("" + p + "" + q + "" + r + "\nTotal Tk      : " + tt + "\nPaid          : " + pt1 + "\nDiue          :" + tt1);

            jComboBox13.requestFocus();
            String s = (String) jComboBox13.getSelectedItem();
            jLabel43.setText("This Is The Id No " + s);
            // jComboBox13.setSelectedIndex(0); 
jTextField27.requestFocus();
        }
        return tt1;
    }

    void st() {
        contest();
        ps = null;
        double x = ShowTotal();
        double y = Double.parseDouble(jTextField27.getText());

        if (jComboBox13.getSelectedIndex() <= 0) {
            jLabel43.setText("Please Select The Patient Id ");
            jComboBox13.requestFocus();
        } else if (jTextField27.getText().isEmpty()) {
            jLabel43.setText("Please Enter Patient Bill How Much Pay  ");
            jTextField27.requestFocus();
        } else if (y <= x) {
            String in = "INSERT INTO `prtient_bill`(`P_Id`,`Name`,`Tk`,`Date`)VALUES(?,?,?,?)";
            try {
                ps = ct.prepareCall(in);
                ps.setString(1, jComboBox13.getSelectedItem().toString());
                ps.setString(2, jTextField28.getText());
                ps.setString(3, jTextField27.getText());
                ps.setString(4, jLabel5.getText());

                int m = ps.executeUpdate();
                if (m > 0) {
                    ShowTotal();
                    jLabel43.setText("");
                    jLabel43.setText("Success ");
                    jTextField27.setText("");
                    jComboBox13.requestFocus();
                    jTextField27.setText("");
                    String s = (String) jComboBox13.getSelectedItem();
                    jComboBox13.setSelectedIndex(0);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jLabel43.setText("Max then Due");
        }
    }

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
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Reception().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Oparetion_Submit;
    private javax.swing.JComboBox<String> Oparetion_id;
    private javax.swing.JComboBox<String> Patien_Id_Search;
    private javax.swing.JComboBox<String> Test_Id;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
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
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
