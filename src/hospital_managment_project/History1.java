package hospital_managment_project;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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

public class History1 extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0;
    ResultSet rss=null;
    PreparedStatement tps=null;
    PreparedStatement ops=null;
    int ft=0;
    public History1() {
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
            Logger.getLogger(History1.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(History1.class.getName()).log(Level.SEVERE, null, ex);
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
        jButton13 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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
        Show_Patient_ID = new javax.swing.JButton();
        Show_All = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jButton23 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        Appoint_Patient_Date = new com.toedter.calendar.JDateChooser();
        jLabel39 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jTextField44 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
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
        jLabel1.setText("Back");
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
        jLabel3.setText("History");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 0, 1050, 140);

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 51, 255));
        jButton13.setText("Refrash");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);
        jButton13.setBounds(1220, 100, 140, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1070, 100, 150, 40);

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
        jScrollPane1.setBounds(30, 50, 1290, 190);

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
        Patient_Name.setBackground(new java.awt.Color(204, 204, 204));
        Patient_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(Patient_Name);
        Patient_Name.setBounds(260, 470, 200, 50);

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Patient");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(400, 0, 510, 50);

        Show_Patient_ID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Show_Patient_ID.setForeground(new java.awt.Color(0, 0, 255));
        Show_Patient_ID.setText("Show Patent ID");
        Show_Patient_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_Patient_IDActionPerformed(evt);
            }
        });
        jPanel3.add(Show_Patient_ID);
        Show_Patient_ID.setBounds(970, 470, 300, 50);

        Show_All.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Show_All.setForeground(new java.awt.Color(0, 0, 255));
        Show_All.setText("Show All");
        Show_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_AllActionPerformed(evt);
            }
        });
        jPanel3.add(Show_All);
        Show_All.setBounds(670, 470, 300, 50);

        jTabbedPane1.addTab("Patient", jPanel3);

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

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 0, 255));
        jButton23.setText("Show all");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton23);
        jButton23.setBounds(50, 330, 150, 50);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Id", "Doctor Name", "Patient Serial", "Patient Name", "Patient Number", "Fee", "Date"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jPanel4.add(jScrollPane5);
        jScrollPane5.setBounds(420, 40, 810, 350);

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
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Appoint_Patient_DateInputMethodTextChanged(evt);
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
        jLabel7.setBounds(10, 270, 400, 50);

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
        jTextField44.setBackground(new java.awt.Color(204, 204, 204));
        jTextField44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField44);
        jTextField44.setBounds(170, 130, 220, 40);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel64.setText("Doctor Name");
        jPanel4.add(jLabel64);
        jLabel64.setBounds(40, 130, 130, 40);

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 0, 255));
        jButton24.setText("Show Date");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton24);
        jButton24.setBounds(50, 380, 170, 50);

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(0, 0, 255));
        jButton25.setText("Show Doctor");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton25);
        jButton25.setBounds(220, 380, 187, 50);

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 0, 255));
        jButton26.setText("Show Patient Serial");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton26);
        jButton26.setBounds(50, 430, 360, 50);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel65);
        jLabel65.setBounds(890, 390, 340, 50);

        jTabbedPane1.addTab("Appointment Patient", jPanel4);

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
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser3InputMethodTextChanged(evt);
            }
        });
        jPanel5.add(jDateChooser3);
        jDateChooser3.setBounds(0, 0, 220, 40);

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 0, 255));
        jButton28.setText("Show Date");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton28);
        jButton28.setBounds(20, 180, 170, 50);

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 0, 255));
        jButton29.setText("Month");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton29);
        jButton29.setBounds(190, 180, 109, 50);

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 0, 255));
        jButton30.setText("Year");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton30);
        jButton30.setBounds(20, 230, 280, 50);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel67);
        jLabel67.setBounds(890, 390, 340, 50);

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
        jScrollPane4.setBounds(460, 40, 780, 390);

        jTabbedPane1.addTab("Madecine", jPanel5);

        jPanel1.setLayout(null);

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
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser6InputMethodTextChanged(evt);
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

        jButton31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 0, 255));
        jButton31.setText("Day Cost Report");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31);
        jButton31.setBounds(80, 250, 330, 50);

        jButton32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(0, 0, 255));
        jButton32.setText("Monthly  Cost Report");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32);
        jButton32.setBounds(80, 300, 330, 50);

        jButton39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton39.setForeground(new java.awt.Color(0, 0, 255));
        jButton39.setText("Yearly Cost Report");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton39);
        jButton39.setBounds(80, 350, 330, 50);

        jButton40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton40.setForeground(new java.awt.Color(0, 0, 255));
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
                " Id", " Name", "Price ", "Date"
            }
        ));
        jScrollPane9.setViewportView(jTable8);

        jPanel1.add(jScrollPane9);
        jScrollPane9.setBounds(480, 50, 750, 350);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(jLabel59);
        jLabel59.setBounds(1090, 400, 140, 50);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(jLabel60);
        jLabel60.setBounds(970, 400, 120, 50);

        jTabbedPane1.addTab("Cost", jPanel1);

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
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling 
        
    }//GEN-LAST:event_jButton13ActionPerformed
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
        Reception_1st rc1=new Reception_1st();
        rc1.setVisible(true);
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

    private void Show_Patient_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_Patient_IDActionPerformed
        // TODO add your handling code here:
      if(Patiet_Id.getSelectedIndex()<=0){JOptionPane.showMessageDialog(rootPane, "Please Select Patient Id");}
      else{  jtable1_viewid();
        jtable2_viewid();
        jtable3_viewId();}
    }//GEN-LAST:event_Show_Patient_IDActionPerformed

    private void Show_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_AllActionPerformed
        // TODO add your handling code here:
        jtable1_view();
jtable2_view();
        jtable3_view();
    }//GEN-LAST:event_Show_AllActionPerformed

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
  
      jLabel65.setText("Total Fee : "+id+" Tk");
   }
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

        jTable4_view();

    }//GEN-LAST:event_jButton23ActionPerformed

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
   jLabel65.setText("Total Fee : "+id+" Tk");
   }
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        jTable4_viewdate();
    }//GEN-LAST:event_jButton24ActionPerformed
 public void jTable4_viewdoctor(){
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
   jLabel65.setText("Total Fee : "+id+" Tk");
   }
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        jTable4_viewdoctor();
    }//GEN-LAST:event_jButton25ActionPerformed
 public void jTable4_viewPatient_Serial(){
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
   jLabel65.setText("Total Fee : "+id+" Tk");
   }
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        jTable4_viewPatient_Serial();
    }//GEN-LAST:event_jButton26ActionPerformed

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

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        show_Madecine_Date();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        show_Madecine_Month();
    }//GEN-LAST:event_jButton29ActionPerformed
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
            Logger.getLogger(History1.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(History1.class.getName()).log(Level.SEVERE, null, ex);
        }
   }}
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        show_Madecine_Year();
    }//GEN-LAST:event_jButton30ActionPerformed

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
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '"+date+"'  ";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                    id=rs.getInt(3)+id;
                }jLabel12.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }jLabel60.setText("Total Tk :");
            jLabel59.setText(""+id);
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
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                    id=id+rs.getInt(3);
                }jLabel12.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }jLabel60.setText("Total Tk :");
            jLabel59.setText(""+id);
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
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                    id=id+rs.getInt(3);  }jLabel12.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }jLabel60.setText("Total Tk :");
            jLabel59.setText(""+id);
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
            String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost`";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
                id=id+rs.getInt(3);  }jLabel12.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);

        }jLabel60.setText("Total Tk :");
        jLabel59.setText(""+id);
    }//GEN-LAST:event_jButton40ActionPerformed
public void contest(){
        try {
            ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
        } catch (SQLException ex) {
            Logger.getLogger(History1.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(History1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new History1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Appoint_Patient_Date;
    private javax.swing.JTable Oparetion;
    private javax.swing.JTable Patient;
    private javax.swing.JTextField Patient_Name;
    private javax.swing.JComboBox<String> Patiet_Id;
    private javax.swing.JButton Show_All;
    private javax.swing.JButton Show_Patient_ID;
    private javax.swing.JTable Test;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
