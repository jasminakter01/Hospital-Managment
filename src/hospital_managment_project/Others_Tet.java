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

public class Others_Tet extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0;
    ResultSet rss=null;
    PreparedStatement tps=null;
    PreparedStatement ops=null;
    int ft=0;
    public Others_Tet() {
        initComponents();
    
        Toolkit tk=Toolkit.getDefaultToolkit();
  //      int h=(int) tk.getScreenSize().getHeight();
    ///    int w=(int) tk.getScreenSize().getWidth();
    //  this.setSize(w, h);
    // getContentPane().setBackground(Color.White);
 
      setIconImage(tk.getImage(getClass().getResource("Loghu__Hospital.jpg")));
 show_date();
show_id();
jtable1_view();
show_Test();
showp_id();
    }
 
   public void show_Test(){
   contest();
   jComboBox2.removeAllItems();
   jComboBox2.addItem("---Select Test---");
   ps=null;
   id=0;
   // cleardata();
   String select="SELECT `M_T_Nmae` FROM `medical_test_info`";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())   {
          jComboBox2.addItem(""+rs.getString(1));
            }} catch (SQLException ex) {
            Logger.getLogger(Others_Tet.class.getName()).log(Level.SEVERE, null, ex);
        }
}   
 public int show_id(){
   contest();
   ps=null;
   // cleardata();
   String select="SELECT `id` FROM `others_test`";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
            id=rs.getInt(1);
            }id=id+1;
            jTextField1.setText(""+id);
            jTextField2.requestFocus();
                    } catch (SQLException ex) {
            Logger.getLogger(Others_Tet.class.getName()).log(Level.SEVERE, null, ex);
        }
  return id; }
 public int showp_id(){
   contest();
   ps=null;
   id=0;
   // cleardata();
   String select="SELECT `P_Id` FROM `others_test`";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
            id=rs.getInt(1);
            }id=id+1;
            jTextField3.setText(""+id);
           
                    } catch (SQLException ex) {
            Logger.getLogger(Others_Tet.class.getName()).log(Level.SEVERE, null, ex);
        }
  return id; }
          public void show_date(){
        Date dt=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
jLabel8.setText(df.format(dt));
//((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
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
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel60 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        jLabel1.setBounds(0, 0, 160, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecal_Test.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 0, 1010, 140);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1140, 100, 210, 40);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15);
        jLabel15.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1360, 140);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Patien Name");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(140, 180, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(110, 280, 380, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ID");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(140, 100, 150, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField1);
        jTextField1.setBounds(290, 100, 150, 40);

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
        jTextField2.setBounds(290, 180, 150, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/ok.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(260, 350, 70, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Patient Number");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(140, 220, 150, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tset Name", "Test Fee", "Patient Name", "Patient Number", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(540, 130, 630, 310);

        jPanel5.setLayout(null);

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 0, 255));
        jButton29.setText("Day Cost Report");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton29);
        jButton29.setBounds(80, 250, 330, 50);

        jDateChooser5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jDateChooser5MouseMoved(evt);
            }
        });
        jDateChooser5.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jDateChooser5MouseWheelMoved(evt);
            }
        });
        jDateChooser5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDateChooser5MouseReleased(evt);
            }
        });
        jDateChooser5.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser5InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel5.add(jDateChooser5);
        jDateChooser5.setBounds(180, 70, 220, 40);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setText("Date");
        jPanel5.add(jLabel41);
        jLabel41.setBounds(80, 70, 100, 40);

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 0, 255));
        jButton30.setText("Monthly  Cost Report");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton30);
        jButton30.setBounds(80, 300, 330, 50);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", " Name", "Price ", "Date"
            }
        ));
        jScrollPane8.setViewportView(jTable7);

        jPanel5.add(jScrollPane8);
        jScrollPane8.setBounds(480, 50, 750, 350);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel11);
        jLabel11.setBounds(90, 180, 320, 50);

        jButton37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton37.setForeground(new java.awt.Color(0, 0, 255));
        jButton37.setText("Yearly Cost Report");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton37);
        jButton37.setBounds(80, 350, 330, 50);

        jButton38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton38.setForeground(new java.awt.Color(0, 0, 255));
        jButton38.setText("All");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton38);
        jButton38.setBounds(80, 400, 330, 50);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(0, -41, 700, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Test---" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
        });
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(0, 0, 250, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField4);
        jTextField4.setBounds(290, 220, 150, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 40, 250, 40);

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel76.setText("Submit");
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel76);
        jLabel76.setBounds(1220, 470, 120, 50);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel32);
        jLabel32.setBounds(1270, 0, 90, 80);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(1040, 70, 130, 60);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField3);
        jTextField3.setBounds(290, 140, 150, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Patient ID");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(140, 140, 150, 40);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/test.jpg"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(0, 0, 1360, 560);

        jTabbedPane1.addTab("                                  Other's Test                              ", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jDateChooser6.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jDateChooser6MouseMoved(evt);
            }
        });
        jDateChooser6.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jDateChooser6MouseWheelMoved(evt);
            }
        });
        jDateChooser6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDateChooser6MouseReleased(evt);
            }
        });
        jDateChooser6.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser6InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel1.add(jDateChooser6);
        jDateChooser6.setBounds(180, 70, 220, 40);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("Date");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(80, 70, 100, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(80, 180, 320, 50);

        jButton31.setBackground(new java.awt.Color(51, 51, 255));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Day Test Report");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31);
        jButton31.setBounds(80, 250, 330, 50);

        jButton32.setBackground(new java.awt.Color(51, 51, 255));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("Monthly  Test Report");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32);
        jButton32.setBounds(80, 300, 330, 50);

        jButton39.setBackground(new java.awt.Color(51, 51, 255));
        jButton39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("Yearly Test Report");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton39);
        jButton39.setBounds(80, 350, 330, 50);

        jButton40.setBackground(new java.awt.Color(51, 51, 255));
        jButton40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("All");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton40);
        jButton40.setBounds(80, 400, 330, 50);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", "Test Name", "Test Fee", "Patient Name", "Patient Number", "Date"
            }
        ));
        jScrollPane9.setViewportView(jTable8);

        jPanel1.add(jScrollPane9);
        jScrollPane9.setBounds(450, 100, 750, 350);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel60);
        jLabel60.setBounds(690, 450, 510, 50);

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Print");
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel77);
        jLabel77.setBounds(1230, 490, 120, 50);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel31);
        jLabel31.setBounds(1270, 0, 90, 80);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/test.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(-20, 0, 1360, 560);

        jTabbedPane1.addTab("                                          Search                                          ", jPanel1);

        desktopPane.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 140, 1360, 600);

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
public void ok(){id=0;
if(jTextField1.getText().isEmpty()){
    jLabel5.setText("'Id Is Empty'");
jTextField1.requestFocus();
}else if(jComboBox2.getSelectedIndex()<=0){
    jLabel5.setText("'Test Is Empty'");
jComboBox2.requestFocus();
}if(jLabel9.getText().isEmpty()){
    jLabel5.setText("Test Fee Is Empty");
jLabel9.requestFocus();
}else if(jTextField2.getText().isEmpty()){
    jLabel5.setText("'Patient Name Is Empty'");
jTextField2.requestFocus();
}else if(jTextField4.getText().isEmpty()){
    jLabel5.setText("'Patient Number Is Empty'");
jTextField4.requestFocus();
}else{ int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add Patient Test...???", "Add Patient Test", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
    ps = null;
    try {
        String o="INSERT INTO `others_test`(`id`,`Tet_Name`,`Test_Fee`,`P_Id`,`patient_Name`,`Patient_Number`,`Date`)VALUES(?,?,?,?,?,?,?)";
        contest();
        Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        ps = ct.prepareCall(o);
         ps.setString(1, jTextField1.getText());
           ps.setString(2,jComboBox2.getSelectedItem().toString());
            ps.setString(3, jLabel9.getText());
                      ps.setString(4, jTextField3.getText());
          ps.setString(5, jTextField2.getText());
           ps.setString(6, jTextField4.getText());
                 ps.setString(7,df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) { 
   DefaultTableModel dt4 = (DefaultTableModel) jTable1.getModel();
                    dt4.setRowCount(0);
                  
                    jtable1_view();
                show_id();  jComboBox2.setSelectedIndex(0);
                               
                                jLabel5.setText("''Success''");
                }
        
    } catch (SQLException ex) {
        Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
    }  }}
}

public void jtable1_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        String select = "SELECT `id`,`Tet_Name`,`Test_Fee`,`P_Id`,`patient_Name`,`Patient_Number`,`Date` FROM `others_test`WHERE `Date`='"+jLabel8.getText()+"'";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ok();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Reception_1st rc1=new Reception_1st();
        rc1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
 if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ||c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField4.requestFocus();
      }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        if (((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel11.setText("Date Is Empty");
            jDateChooser5.requestFocus();
        } else{
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
                dt.setRowCount(0);
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser5.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '"+date+"'  ";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                }jLabel11.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton29ActionPerformed

    private void jDateChooser5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser5MouseMoved

    private void jDateChooser5MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jDateChooser5MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser5MouseWheelMoved

    private void jDateChooser5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser5MouseClicked

    private void jDateChooser5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser5MouseEntered

    private void jDateChooser5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser5MouseExited

    private void jDateChooser5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser5MousePressed

    private void jDateChooser5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser5MouseReleased

    private void jDateChooser5InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser5InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser5InputMethodTextChanged

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        if (((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel11.setText("Date Is Empty");
            jDateChooser5.requestFocus();
        } else{
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
                dt.setRowCount(0);
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(jDateChooser5.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                }jLabel11.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        if (((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel11.setText("Date Is Empty");
            jDateChooser5.requestFocus();
        } else{
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
                dt.setRowCount(0);
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(jDateChooser5.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                }jLabel11.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:

        try {
            DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
            dt.setRowCount(0);
            contest();

            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost`";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
            }jLabel11.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jButton38ActionPerformed

    private void jDateChooser6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser6MouseMoved

    private void jDateChooser6MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jDateChooser6MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser6MouseWheelMoved

    private void jDateChooser6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser6MouseClicked

    private void jDateChooser6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser6MouseEntered

    private void jDateChooser6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser6MouseExited

    private void jDateChooser6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser6MousePressed

    private void jDateChooser6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser6MouseReleased

    private void jDateChooser6InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser6InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser6InputMethodTextChanged

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
       id=0; if (((JTextField) jDateChooser6.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel12.setText("Date Is Empty");
            jDateChooser6.requestFocus();
        } else{
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
                dt.setRowCount(0);
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser6.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT `id`,`Tet_Name`,`Test_Fee`,`patient_Name`,`Patient_Number`,`Date` FROM `others_test`WHERE `Date` LIKE '"+date+"'  ";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5), rs.getDate(6)});
               id=rs.getInt(3)+id;
                }jLabel12.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }jLabel60.setText("Total Tk :"+id);
         
        }

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        id=0;if (((JTextField) jDateChooser6.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel12.setText("Date Is Empty");
            jDateChooser6.requestFocus();
        } else{
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
                dt.setRowCount(0);
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(jDateChooser6.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT `id`,`Tet_Name`,`Test_Fee`,`patient_Name`,`Patient_Number`,`Date` FROM `others_test`WHERE `Date` LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5), rs.getDate(6)});
              id=id+rs.getInt(3);
                }jLabel12.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }jLabel60.setText("Total Tk :"+id);
         
        }

    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
       id=0; if (((JTextField) jDateChooser6.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel12.setText("Date Is Empty");
            jDateChooser6.requestFocus();
        } else{
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
                dt.setRowCount(0);
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(jDateChooser6.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT `id`,`Tet_Name`,`Test_Fee`,`patient_Name`,`Patient_Number`,`Date` FROM `others_test`WHERE `Date` LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5), rs.getDate(6)});
              id=id+rs.getInt(3);  }jLabel12.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }jLabel60.setText("Total Tk :"+id);
          
        }

    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
id=0;
        try {
            DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
            dt.setRowCount(0);
            contest();

            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `id`,`Tet_Name`,`Test_Fee`,`patient_Name`,`Patient_Number`,`Date` FROM `others_test`";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5), rs.getDate(6)});
          id=id+rs.getInt(3);  }jLabel12.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);

        }jLabel60.setText("Total Tk :"+id);
   

    }//GEN-LAST:event_jButton40ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        contest();
        ps=null;
        // cleardata();
        String select="SELECT `M_T_Price` FROM `medical_test_info` WHERE `M_T_Nmae`='"+jComboBox2.getSelectedItem()+"'";
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
            while(rs.next())
            {
               jLabel9.setText(""+rs.getInt(1));
            } } catch (SQLException ex) {
                Logger.getLogger(Others_Tet.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
       ok();
      }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE )) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
  jTextField2.requestFocus();
      }
    }//GEN-LAST:event_jComboBox2KeyPressed
public int Others_Test(){
int n=0;
int p = 0;

 try {
            String i="SELECT `P_Id` FROM `others_test` WHERE `P_Id`='"+jTextField3.getText()+"'";
            contest();
            ps = null;
            ps = ct.prepareCall(i);
            rs = ps.executeQuery();
            while (rs.next()) {
             p=Integer.parseInt(jTextField3.getText().toString());
            }
          
 //    jTextField37.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
return p;}
    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
      Print_Others_Test p=new Print_Others_Test(Others_Test());
        p.setVisible(true);
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable8.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      showp_id();
       jTextField4.setText(""); 
       jTextField2.setText("");
       jLabel9.setText("");
                              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked
public void contest(){
        try {
            ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Others_Tet.class.getName()).log(Level.SEVERE, null, ex);
        }}
  

   
    
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
            java.util.logging.Logger.getLogger(Others_Tet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Others_Tet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Others_Tet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Others_Tet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Others_Tet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
