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

public class History extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0;
    ResultSet rss=null;
    PreparedStatement tps=null;
    PreparedStatement ops=null;
    int ft=0;
    public History() {
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
jtable2_view();
        jtable3_view();
         id();
         jtable1_Madecine_view();
           jTable4_view();
           cost();
           jtable10_view();
           jtable11_view();
           jtable12_view();
            jtable14_view();
//show_Test();

    }
    
 public void jtable1_Madecine_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        String select = "SELECT `Madicine_Id`,`Madicine_Name`,`Madicine_Detailse`,`Date` FROM `madicine_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
  /* public void show_Test(){/
   contest();
   jComboBox2.removeAllItems();
   jComboBox2.addItem("---Select---");
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
            Logger.getLogger(Add_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
}    */
 public int show_id(){
   contest();
   ps=null;
   id=0;
   // cleardata();
   String select="SELECT `id` FROM `others_test`";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
            id=rs.getInt(1);
            }id=id+1;
           // jTextField1.setText(""+id);
          //  jTextField2.requestFocus();
                    } catch (SQLException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
  return id; }
 public void show_Madecine_Date(){
   if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(Oparetion, "Date Is Empty");
            jDateChooser3.requestFocus();
        } else{ contest();
   ps=null;
   id=0;
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
         SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
         dt.setRowCount(0);
                String date = sd.format(jDateChooser3.getDate());
   // cleardata();
   String select="SELECT `Madicine_Id`,`Madicine_Name`,`Madicine_Detailse`,`Date` FROM `madicine_info` WHERE `Date`='"+date+"'";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
              dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4)});
            }        } catch (SQLException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
   }}
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
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Patient = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Oparetion = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Test = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        Patiet_Id = new javax.swing.JComboBox<>();
        Patient_Name = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        Appoint_Patient_Date = new com.toedter.calendar.JDateChooser();
        jLabel39 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jTextField44 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel77 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel83 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel43 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel82 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel81 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel78 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Historyyyyyy.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 0, 1050, 140);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1210, 100, 150, 40);

        jPanel10.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(jLabel17);
        jLabel17.setBounds(80, 180, 320, 50);

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", " Name", "Price", "Date", "Event"
            }
        ));
        jScrollPane14.setViewportView(jTable13);

        jPanel10.add(jScrollPane14);
        jScrollPane14.setBounds(180, 50, 1050, 410);

        jPanel2.add(jPanel10);
        jPanel10.setBounds(0, 0, 0, 0);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel32);
        jLabel32.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1360, 140);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        Patient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Age", "Gender", "Maritial Status", "Address", "City", "Number", "Doctor Name", "Type", "Ward", "Bed", "Status", "Chak_In_Date", "Chack_Out_Date"
            }
        ));
        jScrollPane1.setViewportView(Patient);
        if (Patient.getColumnModel().getColumnCount() > 0) {
            Patient.getColumnModel().getColumn(3).setHeaderValue("Gender");
            Patient.getColumnModel().getColumn(4).setHeaderValue("Maritial Status");
            Patient.getColumnModel().getColumn(5).setHeaderValue("Address");
            Patient.getColumnModel().getColumn(6).setHeaderValue("City");
            Patient.getColumnModel().getColumn(7).setHeaderValue("Number");
            Patient.getColumnModel().getColumn(8).setHeaderValue("Doctor Name");
            Patient.getColumnModel().getColumn(9).setHeaderValue("Type");
            Patient.getColumnModel().getColumn(10).setHeaderValue("Ward");
            Patient.getColumnModel().getColumn(11).setHeaderValue("Bed");
            Patient.getColumnModel().getColumn(12).setHeaderValue("Status");
            Patient.getColumnModel().getColumn(13).setHeaderValue("Chak_In_Date");
            Patient.getColumnModel().getColumn(14).setHeaderValue("Chack_Out_Date");
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 80, 1290, 160);

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Oparetion");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(670, 240, 650, 40);

        Oparetion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Oparetion Name", "Oparetion No"
            }
        ));
        jScrollPane2.setViewportView(Oparetion);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(670, 280, 650, 190);

        Test.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Test Name", "Test No"
            }
        ));
        jScrollPane3.setViewportView(Test);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(30, 280, 590, 190);

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Test");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(30, 240, 590, 40);

        Patiet_Id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Patiet_Id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Patient Id---" }));
        Patiet_Id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Patiet_IdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Patiet_IdMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Patiet_IdMousePressed(evt);
            }
        });
        Patiet_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patiet_IdActionPerformed(evt);
            }
        });
        Patiet_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Patiet_IdKeyPressed(evt);
            }
        });
        jPanel3.add(Patiet_Id);
        Patiet_Id.setBounds(30, 470, 230, 50);

        Patient_Name.setEditable(false);
        Patient_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(Patient_Name);
        Patient_Name.setBounds(260, 470, 200, 50);

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Patient");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(390, 30, 510, 50);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel62.setText("Show All");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel62);
        jLabel62.setBounds(670, 480, 260, 60);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel63.setText("Show Patient Id");
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel63);
        jLabel63.setBounds(950, 480, 370, 60);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel21);
        jLabel21.setBounds(1280, 0, 80, 80);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Patient ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Date");
        jPanel4.add(jLabel37);
        jLabel37.setBounds(40, 50, 130, 40);

        jComboBox13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox13MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox13MousePressed(evt);
            }
        });
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
        jPanel4.add(jComboBox13);
        jComboBox13.setBounds(170, 90, 220, 40);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Id", "Doctor Name", "Patient Serial", "Patient Name", "Patient Number", "Fee", "Date"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jPanel4.add(jScrollPane5);
        jScrollPane5.setBounds(420, 70, 810, 350);

        Appoint_Patient_Date.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Appoint_Patient_DateMouseMoved(evt);
            }
        });
        Appoint_Patient_Date.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                Appoint_Patient_DateMouseWheelMoved(evt);
            }
        });
        Appoint_Patient_Date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Appoint_Patient_DateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Appoint_Patient_DateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Appoint_Patient_DateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Appoint_Patient_DateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Appoint_Patient_DateMouseReleased(evt);
            }
        });
        Appoint_Patient_Date.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Appoint_Patient_DateInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel4.add(Appoint_Patient_Date);
        Appoint_Patient_Date.setBounds(170, 50, 220, 40);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Doctor ID");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(40, 90, 130, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 270, 400, 50);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("Patient Serial");
        jPanel4.add(jLabel40);
        jLabel40.setBounds(40, 170, 130, 40);

        jComboBox14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox14MouseEntered(evt);
            }
        });
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });
        jComboBox14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox14KeyPressed(evt);
            }
        });
        jPanel4.add(jComboBox14);
        jComboBox14.setBounds(170, 170, 220, 40);

        jTextField44.setEditable(false);
        jTextField44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField44);
        jTextField44.setBounds(170, 130, 220, 40);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel64.setText("Doctor Name");
        jPanel4.add(jLabel64);
        jLabel64.setBounds(40, 130, 130, 40);

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel84.setText("Print");
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel84MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel84);
        jLabel84.setBounds(1160, 30, 70, 40);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel69.setText("Show Doctor");
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel69);
        jLabel69.setBounds(570, 450, 330, 60);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel70.setText("Show Patient Serial");
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel70);
        jLabel70.setBounds(910, 450, 440, 60);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel71.setText("Show all");
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel71);
        jLabel71.setBounds(30, 450, 240, 60);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel72.setText("Show Date");
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel72);
        jLabel72.setBounds(280, 450, 280, 60);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel24);
        jLabel24.setBounds(1280, 0, 80, 80);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Appointment Patient ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jDateChooser3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jDateChooser3MouseMoved(evt);
            }
        });
        jDateChooser3.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jDateChooser3MouseWheelMoved(evt);
            }
        });
        jDateChooser3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDateChooser3MouseReleased(evt);
            }
        });
        jDateChooser3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser3InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel5.add(jDateChooser3);
        jDateChooser3.setBounds(0, 0, 220, 40);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel67);
        jLabel67.setBounds(910, 460, 340, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Detailse", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(470, 70, 780, 390);

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel77.setText("Print");
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel77);
        jLabel77.setBounds(1180, 30, 70, 40);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel65.setText("Show Date");
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel65);
        jLabel65.setBounds(50, 220, 300, 60);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel66.setText("Month");
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel66);
        jLabel66.setBounds(30, 290, 250, 60);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel68.setText("Year");
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel68);
        jLabel68.setBounds(20, 360, 240, 60);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel25);
        jLabel25.setBounds(1280, 0, 80, 80);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel5.add(jLabel6);
        jLabel6.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Madecine ", jPanel5);

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
        jLabel12.setBounds(90, 150, 320, 50);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", " Name", "Price ", "Date"
            }
        ));
        jScrollPane9.setViewportView(jTable8);

        jPanel1.add(jScrollPane9);
        jScrollPane9.setBounds(480, 50, 750, 350);

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel83.setText("Print");
        jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel83MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel83);
        jLabel83.setBounds(1160, 10, 70, 40);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel73.setText("Yearly Cost Report");
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel73);
        jLabel73.setBounds(30, 360, 430, 60);

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel74.setText("All");
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel74);
        jLabel74.setBounds(60, 440, 300, 60);

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel75.setText("Monthly  Cost Report");
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel75MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel75);
        jLabel75.setBounds(10, 290, 460, 60);

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel76.setText("Day Cost Report");
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel76);
        jLabel76.setBounds(40, 220, 380, 60);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel26);
        jLabel26.setBounds(1280, 0, 80, 80);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Cost ", jPanel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jDateChooser7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jDateChooser7MouseMoved(evt);
            }
        });
        jDateChooser7.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jDateChooser7MouseWheelMoved(evt);
            }
        });
        jDateChooser7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDateChooser7MouseReleased(evt);
            }
        });
        jDateChooser7.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser7InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel6.add(jDateChooser7);
        jDateChooser7.setBounds(180, 70, 220, 40);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText("Date");
        jPanel6.add(jLabel43);
        jLabel43.setBounds(80, 70, 100, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel13);
        jLabel13.setBounds(90, 130, 320, 50);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", " Name", "Number", "Ammount", "Date"
            }
        ));
        jScrollPane10.setViewportView(jTable9);

        jPanel6.add(jScrollPane10);
        jScrollPane10.setBounds(520, 120, 750, 350);

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel82.setText("Print");
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel82);
        jLabel82.setBounds(1200, 80, 70, 40);

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel85.setText("All");
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel85MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel85);
        jLabel85.setBounds(70, 420, 300, 60);

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel86.setText("Yearly Invest Report");
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel86);
        jLabel86.setBounds(20, 350, 460, 60);

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel87.setText("Day Invest Report");
        jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel87MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel87);
        jLabel87.setBounds(40, 210, 420, 60);

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Search1.jpg"))); // NOI18N
        jLabel88.setText("Monthly  Invest  Report");
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel88MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel88);
        jLabel88.setBounds(0, 280, 520, 60);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel27);
        jLabel27.setBounds(1280, 0, 80, 80);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel6.add(jLabel10);
        jLabel10.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Account ", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", " Name", "Price", "Date", "Event"
            }
        ));
        jScrollPane11.setViewportView(jTable10);

        jPanel7.add(jScrollPane11);
        jScrollPane11.setBounds(210, 50, 1020, 350);

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel81.setText("Print");
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel81);
        jLabel81.setBounds(1160, 10, 70, 40);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel28);
        jLabel28.setBounds(1280, 0, 80, 80);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel7.add(jLabel11);
        jLabel11.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Test ", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", " Name", "Price", "Date", "Event"
            }
        ));
        jScrollPane12.setViewportView(jTable11);

        jPanel8.add(jScrollPane12);
        jScrollPane12.setBounds(180, 50, 1050, 410);

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel80.setText("Print");
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel80);
        jLabel80.setBounds(1160, 10, 70, 40);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel29);
        jLabel29.setBounds(1280, 0, 80, 80);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel8.add(jLabel14);
        jLabel14.setBounds(0, 0, 1360, 570);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel8.add(jLabel15);
        jLabel15.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Operation ", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type Id", "Doctor Id", "Doctor Name", "BirthDate", "Address", "Number", "Detailse", "Join Date", "Delete Date", "Event"
            }
        ));
        jScrollPane13.setViewportView(jTable12);

        jPanel9.add(jScrollPane13);
        jScrollPane13.setBounds(180, 50, 1050, 410);

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel78.setText("Print");
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel78MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel78);
        jLabel78.setBounds(1160, 10, 70, 40);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel30);
        jLabel30.setBounds(1280, 0, 80, 80);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel9.add(jLabel16);
        jLabel16.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Employe ", jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(jLabel18);
        jLabel18.setBounds(80, 180, 320, 50);

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Type Id", "Doctor Id ", "Doctor Name", "Doctor Fee", "Qualification", "Mobile Number", "Age", "Address", "Join Date", "Event"
            }
        ));
        jScrollPane15.setViewportView(jTable14);

        jPanel11.add(jScrollPane15);
        jScrollPane15.setBounds(180, 50, 1050, 410);

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel79.setText("Print");
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel79MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel79);
        jLabel79.setBounds(1160, 10, 70, 40);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel31);
        jLabel31.setBounds(1280, 0, 80, 80);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/History.jpg"))); // NOI18N
        jPanel11.add(jLabel19);
        jLabel19.setBounds(0, 0, 1360, 570);

        jTabbedPane1.addTab(" Doctor", jPanel11);

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
/*public void ok(){
id=0;
if(jTextField1.getText().isEmpty()){
    jLabel5.setText("'Id Is Empty'");
jTextField1.requestFocus();
}else if(jComboBox2.getSelectedIndex()<=0){
    jLabel5.setText("'Test Is Empty'");
jComboBox2.requestFocus();
}if(jTextField4.getText().isEmpty()){
    jLabel5.setText("Test Fee Is Empty");
jTextField4.requestFocus();
}else if(jTextField2.getText().isEmpty()){
    jLabel5.setText("'Name Is Empty'");
jTextField2.requestFocus();
}else if(jTextField3.getText().isEmpty()){
    jLabel5.setText("'Number Is Empty'");
jTextField3.requestFocus();
}else{ int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add Patient Test...???", "Add Patient Test", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
    ps = null;
    try {
        String o="INSERT INTO `others_test`(`id`,`Tet_Name`,`Test_Fee`,`patient_Name`,`Patient_Number`,`Date`)VALUES(?,?,?,?,?,?)";
        contest();
        Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        ps = ct.prepareCall(o);
         ps.setString(1, jTextField1.getText());
           ps.setString(2,jComboBox2.getSelectedItem().toString());
            ps.setString(3, jTextField4.getText());
          ps.setString(4, jTextField2.getText());
           ps.setString(5, jTextField3.getText());
                 ps.setString(6,df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) { 
   DefaultTableModel dt4 = (DefaultTableModel) jTable1.getModel();
                    dt4.setRowCount(0);
                    show_id();
                    jtable1_view();
                 //   jLabel5.setText(""+jTextField2.getText()+"Test Add Success...");
                //    jlabel5_Total();
                            //jTextField1.setText("");
                           jComboBox2.setSelectedIndex(0);
                                jTextField4.setText(""); 
                            jTextField2.setText("");
                                jTextField3.setText("");
                                jLabel5.setText("''Success''");
                   // jTextField2.requestFocus();
                    
                }
        
    } catch (SQLException ex) {
        Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
    }  }}
}
*/
public void jtable1_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) Patient.getModel();
        dt.setRowCount(0);
        String select = "SELECT *FROM`patient_backup`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
//dt.addRow(new Object[]{rs.getInt(1)rs.getString(2),rs.getint(3),rs.getString(4),rs.getString(5),,rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getString(15),rs.getdate(16),rs.getdate(17)});
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(15),rs.getDate(16),rs.getDate(17)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public void jtable10_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable10.getModel();
        dt.setRowCount(0);
        String select = "SELECT *FROM`madical_test_back_up`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
//dt.addRow(new Object[]{rs.getInt(1)rs.getString(2),rs.getint(3),rs.getString(4),rs.getString(5),,rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getString(15),rs.getdate(16),rs.getdate(17)});
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4),rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public void jtable11_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable11.getModel();
        dt.setRowCount(0);
        String select = "SELECT *FROM `oparetion_ifo_back_up`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
//dt.addRow(new Object[]{rs.getInt(1)rs.getString(2),rs.getint(3),rs.getString(4),rs.getString(5),,rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getString(15),rs.getdate(16),rs.getdate(17)});
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4),rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public void jtable12_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable12.getModel();
        dt.setRowCount(0);
        String select = "SELECT `E2Id`,`E2_IdOfName`,`E2_Name`,`E2_BDate`,`E2_Address`,`E2_M_Number`,`E2_Details`,`E2_Join_Date`,`E2_D_Date`,`event`FROM`employe_back_up`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
//dt.addRow(new Object[]{rs.getInt(1)rs.getString(2),rs.getint(3),rs.getString(4),rs.getString(5),,rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getString(15),rs.getdate(16),rs.getdate(17)});
dt.addRow(new Object[]{rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDate(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getDate(8),rs.getString(10)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public void jtable14_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable14.getModel();
        dt.setRowCount(0);
        String select = "SELECT `D_Id`,`E_Id`,`D_Name_Id`,`D_Name`,`D_Fee`,`D_Qualification`,`D_Number`,`D_Age`,`D_Address`,`Join_Date`,`Event` FROM`doctor_backup`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
//dt.addRow(new Object[]{rs.getInt(1)rs.getString(2),rs.getint(3),rs.getString(4),rs.getString(5),,rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getString(15),rs.getdate(16),rs.getdate(17)});
dt.addRow(new Object[]{rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getString(10),rs.getString(11)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public void jtable1_viewid() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) Patient.getModel();
        dt.setRowCount(0);
        String select = "SELECT *FROM`patient_backup`WHERE `patient_backup`.`Pasent_Id`='"+Patiet_Id.getSelectedItem()+"' ";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
//dt.addRow(new Object[]{rs.getInt(1)rs.getString(2),rs.getint(3),rs.getString(4),rs.getString(5),,rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getString(15),rs.getdate(16),rs.getdate(17)});
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(15),rs.getDate(16),rs.getDate(17)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

public void jtable2_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) Oparetion.getModel();
       dt.setRowCount(0);
       String select = "SELECT `Pasent_Id`,`O_Name`,`O_Id` FROM `patient_oparetion_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
      dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3)}); }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public void jtable2_viewid() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) Oparetion.getModel();
       dt.setRowCount(0);
        String select = "SELECT `Pasent_Id`,`O_Name`,`O_Id` FROM `patient_oparetion_info`WHERE`patient_oparetion_info`.`Pasent_Id`='"+Patiet_Id.getSelectedItem()+"' ";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
      dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3)}); }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }public void jtable3_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) Test.getModel();
     dt.setRowCount(0);
     String select = "SELECT `Pasent_Id`,`T_Name`,`T_Id` FROM `patient_test_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
     dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void jtable3_viewId() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) Test.getModel();
       
        dt.setRowCount(0);String select = "SELECT `Pasent_Id`,`T_Name`,`T_Id` FROM `patient_test_info` WHERE `patient_test_info`.`Pasent_Id`='"+Patiet_Id.getSelectedItem()+"' ";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
     dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
/* public void jTable4_viewdate(){
       if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel10.setText("'Date Is Empty'");
            jDateChooser2.requestFocus();
        }else{
          contest();
  DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
  dt.setRowCount(0);
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser2.getDate());
String select="SELECT  `id`,`patient_Name`,`Patient_Number`,`Tet_Name`,`Test_Fee`,`Date` FROM `others_test` WHERE `Date`='"+date+"'";
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
             while(rs.next())  {
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6)});
   jLabel10.setText("");  }    } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }}}public void jTable4_view(){
       contest();
  DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
  dt.setRowCount(0);
String select="SELECT `id`,`patient_Name`,`Patient_Number`,`Tet_Name`,`Test_Fee`,`Date` FROM `others_test`";
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
             while(rs.next())  {
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6)});
  }    } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }*/
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
      Sallary_Account_Backup_Detailse ss=new Sallary_Account_Backup_Detailse();
        ss.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Patiet_IdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Patiet_IdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Patiet_IdMouseClicked

    private void Patiet_IdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Patiet_IdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Patiet_IdMouseEntered
public void id(){

            Patiet_Id.removeAllItems();
            String g="---Select Patient Id---";
            Patiet_Id.addItem(g);
            try {
                String select = "SELECT `patient_backup`.`Pasent_Id` FROM`patient_backup`";
             contest();
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while (rs.next()) {
                    Patiet_Id.addItem(""+rs.getInt(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }

}
    private void Patiet_IdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Patiet_IdMousePressed
        // TODO add your handling code here:\
       
    }//GEN-LAST:event_Patiet_IdMousePressed

    private void Patiet_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patiet_IdActionPerformed
        
            try {
              
   String select = "SELECT `patient_backup`.`Firs_Name` FROM `patient_backup` WHERE`patient_backup`.`Pasent_Id`='"+Patiet_Id.getSelectedItem()+"'";
                //,`Doctor_Name`
                contest();
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while (rs.next()) {
     Patient_Name.setText(""+rs.getString(1));

                }
            } catch (SQLException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_Patiet_IdActionPerformed

    private void Patiet_IdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Patiet_IdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Patiet_IdKeyPressed

    private void jComboBox13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox13MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox13MouseClicked

    private void jComboBox13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox13MouseEntered

    }//GEN-LAST:event_jComboBox13MouseEntered

    private void jComboBox13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox13MousePressed
        if (((JTextField) Appoint_Patient_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Appoint_Patient_Date.requestFocus();
        }else{
            jComboBox13.removeAllItems();
            String g="---Select---";
            jComboBox13.addItem(g);
            try {
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Appoint_Patient_Date.getDate());
                String select = "SELECT `Doctor_Id` FROM `appointment_chakin` WHERE `Date`='" + date + "' GROUP BY `Doctor_Id`";
                //,`Doctor_Name`
                contest();
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while (rs.next()) {
                    jComboBox13.addItem(""+rs.getInt(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabel7.setText("");
        }
    }//GEN-LAST:event_jComboBox13MousePressed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed

        jComboBox14.removeAllItems();
        String hh="---Select---";
        jComboBox14.addItem(hh);
        jTextField44.setText("");
        if (((JTextField) Appoint_Patient_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Appoint_Patient_Date.requestFocus();
        }else{

            try {
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Appoint_Patient_Date.getDate());
                String select = "SELECT `Doctor_Name`,`Serial` FROM `appointment_chakin` WHERE `Doctor_Id`='" + jComboBox13.getSelectedItem()+ "'AND `Date`='"+date+"'";
                //,`Doctor_Name`
                contest();
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while (rs.next()) {
                    jTextField44.setText(""+rs.getString(1));
                    jComboBox14.addItem(""+rs.getInt(2));

                }
            } catch (SQLException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox13KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jComboBox14.requestFocus();
        }
    }//GEN-LAST:event_jComboBox13KeyPressed
  public void jTable4_view(){
      id=0; contest();
  DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
  dt.setRowCount(0);
String select="SELECT `Doctor_Id`,`Doctor_Name`,`Serial`,`Patient_Name`,`Phone_Number`,`Fee`,`Date`FROM `appointment_chakin`";
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
             while(rs.next())  {
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getDate(7)});
 id=id+rs.getInt(6); }    } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  }
    private void Appoint_Patient_DateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Appoint_Patient_DateMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Appoint_Patient_DateMouseMoved

    private void Appoint_Patient_DateMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_Appoint_Patient_DateMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Appoint_Patient_DateMouseWheelMoved

    private void Appoint_Patient_DateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Appoint_Patient_DateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Appoint_Patient_DateMouseClicked

    private void Appoint_Patient_DateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Appoint_Patient_DateMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_Appoint_Patient_DateMouseEntered

    private void Appoint_Patient_DateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Appoint_Patient_DateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Appoint_Patient_DateMouseExited

    private void Appoint_Patient_DateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Appoint_Patient_DateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Appoint_Patient_DateMousePressed

    private void Appoint_Patient_DateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Appoint_Patient_DateMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_Appoint_Patient_DateMouseReleased

    private void Appoint_Patient_DateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Appoint_Patient_DateInputMethodTextChanged
        // TODO add your handling code here:
        //  JOptionPane.showMessageDialog(rootPane, "jj");
    }//GEN-LAST:event_Appoint_Patient_DateInputMethodTextChanged

    private void jComboBox14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14MouseClicked

    private void jComboBox14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14MouseEntered

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jComboBox14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox14KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jTable4_viewPatient_Serial();
        }
    }//GEN-LAST:event_jComboBox14KeyPressed
public void jTable4_viewdate(){
      id=0; if (((JTextField) Appoint_Patient_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Appoint_Patient_Date.requestFocus();
        }else{
          contest();
  DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
  dt.setRowCount(0);
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Appoint_Patient_Date.getDate());
String select="SELECT `Doctor_Id`,`Doctor_Name`,`Serial`,`Patient_Name`,`Phone_Number`,`Fee`,`Date`FROM `appointment_chakin`WHERE `Date`='"+date+"'";
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
             while(rs.next())  {
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getDate(7)});
id=id+rs.getInt(6);
jLabel7.setText("");  }    } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }}
  
   } public void jTable4_viewdoctor(){
       id=0;if (((JTextField) Appoint_Patient_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Appoint_Patient_Date.requestFocus();
        }else if(jComboBox13.getSelectedIndex()<=0){
            jLabel7.setText("Doctor Id Is Empty");
          jComboBox13.requestFocus();
        }else{
          contest();
  DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
  dt.setRowCount(0);
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Appoint_Patient_Date.getDate());
String select="SELECT `Doctor_Id`,`Doctor_Name`,`Serial`,`Patient_Name`,`Phone_Number`,`Fee`,`Date`FROM `appointment_chakin`WHERE `Date`='"+date+"'AND`Doctor_Id`='"+jComboBox13.getSelectedItem()+"' ";
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
             while(rs.next())  {
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getDate(7)});
   jLabel7.setText("");
             id=id+rs.getInt(6);}    } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }}
 
   } public void jTable4_viewPatient_Serial(){
       id=0;if (((JTextField) Appoint_Patient_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Appoint_Patient_Date.requestFocus();
        }else if(jComboBox13.getSelectedIndex()<=0){
            jLabel7.setText("Doctor Id Is Empty");
          jComboBox13.requestFocus();
        }else if(jComboBox14.getSelectedIndex()<=0){
            jLabel7.setText("Patient Serial Is Empty");
          jComboBox14.requestFocus();
        }
        else{
          contest();
  DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
  dt.setRowCount(0);
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Appoint_Patient_Date.getDate());
String select="SELECT `Doctor_Id`,`Doctor_Name`,`Serial`,`Patient_Name`,`Phone_Number`,`Fee`,`Date`FROM `appointment_chakin`WHERE `Date`='"+date+"'AND`Doctor_Id`='"+jComboBox13.getSelectedItem()+"'AND `Serial`='"+jComboBox14.getSelectedItem()+"' ";
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
             while(rs.next())  {
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getDate(7)});
   jLabel7.setText("");  
             id=id+rs.getInt(6);}    } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }}
   
   }
    private void jDateChooser3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3MouseMoved

    private void jDateChooser3MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jDateChooser3MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3MouseWheelMoved

    private void jDateChooser3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3MouseClicked

    private void jDateChooser3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3MouseEntered

    private void jDateChooser3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3MouseExited

    private void jDateChooser3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3MousePressed

    private void jDateChooser3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3MouseReleased

    private void jDateChooser3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser3InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3InputMethodTextChanged
public void show_Madecine_Month(){
   if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(Oparetion, "Date Is Empty");
            jDateChooser3.requestFocus();
        } else{contest();
   ps=null;
   id=0;
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
     dt.setRowCount(0);
         SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
     String date = sd.format(jDateChooser3.getDate());
   // cleardata();
   String select="SELECT `Madicine_Id`,`Madicine_Name`,`Madicine_Detailse`,`Date` FROM `madicine_info` WHERE `Date` LIKE'%"+date+"%'";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
  dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4)});
            }        } catch (SQLException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
   }}
public void show_Madecine_Year(){
  if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(Oparetion, "Date Is Empty");
            jDateChooser3.requestFocus();
        } else{ contest();
   ps=null;
   id=0;
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
     dt.setRowCount(0);
         SimpleDateFormat sd = new SimpleDateFormat("yyyy");
     String date = sd.format(jDateChooser3.getDate());
   // cleardata();
   String select="SELECT `Madicine_Id`,`Madicine_Name`,`Madicine_Detailse`,`Date` FROM `madicine_info` WHERE `Date` LIKE'%"+date+"%'";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
  dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4)});
            }        } catch (SQLException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
   }}
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       
    }//GEN-LAST:event_jTable1MouseClicked

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
public void cost(){
 id=0;
        try {
            DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
            dt.setRowCount(0);
            contest();

            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost`";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
} } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
 }

}
public void Account(){
 id=0;
        try {
            DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
            dt.setRowCount(0);
            contest();

            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT *FROM `account`";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getDate(5)});
                 }
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);

        }

}
    private void jDateChooser7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser7MouseMoved

    private void jDateChooser7MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jDateChooser7MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser7MouseWheelMoved

    private void jDateChooser7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser7MouseClicked

    private void jDateChooser7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser7MouseEntered

    private void jDateChooser7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser7MouseExited

    private void jDateChooser7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser7MousePressed

    private void jDateChooser7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser7MouseReleased

    private void jDateChooser7InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser7InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser7InputMethodTextChanged

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable1.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jLabel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable12.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel78MouseClicked

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable14.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel79MouseClicked

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable11.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable10.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable9.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jLabel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseClicked
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
    }//GEN-LAST:event_jLabel83MouseClicked

    private void jLabel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable4.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel84MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
    jtable1_view();
jtable2_view();
        jtable3_view();

    }//GEN-LAST:event_jLabel62MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        // TODO add your handling code here:
        if(Patiet_Id.getSelectedIndex()<=0){JOptionPane.showMessageDialog(rootPane, "Please Select Patient Id");}
      else{  jtable1_viewid();
        jtable2_viewid();
        jtable3_viewId();}
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        // TODO add your handling code here:
          show_Madecine_Date();
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        // TODO add your handling code here:
            // TODO add your handling code here:
        show_Madecine_Month();
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        // TODO add your handling code here:
           show_Madecine_Year();
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        // TODO add your handling code here:
      jTable4_viewdoctor();
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        // TODO add your handling code here:
            jTable4_viewPatient_Serial();
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        // TODO add your handling code here:
             jTable4_view();
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        // TODO add your handling code here:
             jTable4_viewdate();
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
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
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                    id=id+rs.getInt(3);  }jLabel12.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        // TODO add your handling code here:
          id=0;
        try {
            DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
            dt.setRowCount(0);
            contest();

            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost`";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                id=id+rs.getInt(3);  }jLabel12.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
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
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                    id=id+rs.getInt(3);
                }jLabel12.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel75MouseClicked

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
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
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '"+date+"'  ";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                    id=rs.getInt(3)+id;
                }jLabel12.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseClicked
        // TODO add your handling code here:
        
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable9.getModel();
                dt.setRowCount(0);
                contest();
               
                String s="SELECT *FROM `account`";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5)});
                   
                }
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_jLabel85MouseClicked

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        // TODO add your handling code here:
              // TODO add your handling code here:
        if (((JTextField) jDateChooser7.getDateEditor().getUiComponent()).getText().isEmpty()) {
           JOptionPane.showMessageDialog(Oparetion,"Date Is Empty");
            jDateChooser7.requestFocus();
        } else{
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable9.getModel();
                dt.setRowCount(0);
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(jDateChooser7.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT *FROM `account`WHERE `Date`LIKE'%"+date+"%' ";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5)});
                   
                }
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel86MouseClicked

    private void jLabel87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseClicked
        // TODO add your handling code here:
         if (((JTextField) jDateChooser7.getDateEditor().getUiComponent()).getText().isEmpty()) {
           JOptionPane.showMessageDialog(Oparetion,"Date Is Empty");
            jDateChooser7.requestFocus();
        } else{
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable9.getModel();
                dt.setRowCount(0);
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser7.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT *FROM `account`WHERE `Date`='"+date+"' ";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5)});
                   
                }
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel87MouseClicked

    private void jLabel88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseClicked
        // TODO add your handling code here:
          if (((JTextField) jDateChooser7.getDateEditor().getUiComponent()).getText().isEmpty()) {
           JOptionPane.showMessageDialog(Oparetion,"Date Is Empty");
            jDateChooser7.requestFocus();
        } else{
            try {
                DefaultTableModel dt = (DefaultTableModel) jTable9.getModel();
                dt.setRowCount(0);
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(jDateChooser7.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT *FROM `account`WHERE `Date`LIKE'%"+date+"%' ";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5)});
                   
                }
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel88MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel32MouseClicked
public void contest(){
        try {
            ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
        } catch (SQLException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Appoint_Patient_Date;
    private javax.swing.JTable Oparetion;
    private javax.swing.JTable Patient;
    private javax.swing.JTextField Patient_Name;
    private javax.swing.JComboBox<String> Patiet_Id;
    private javax.swing.JTable Test;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
