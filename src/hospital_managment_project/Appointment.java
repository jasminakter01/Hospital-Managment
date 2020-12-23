
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

public class Appointment extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0;
     int id2=0;
    ResultSet rss=null;
    PreparedStatement tps=null;
    PreparedStatement ops=null;
    int ft=0;
    public Appointment() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
  //      int h=(int) tk.getScreenSize().getHeight();
    ///    int w=(int) tk.getScreenSize().getWidth();
    //  this.setSize(w, h);
    // getContentPane().setBackground(Color.White);
 
      setIconImage(tk.getImage(getClass().getResource("Loghu__Hospital.jpg")));
 show_date();
id();
id2();
 Doctor_id();
jtable1_view();
jtable3_view();
jTable2_Madecine_view();
jComboBox4_Show_Madecine_Name();
    }
      public void jComboBox4_Show_Madecine_Name() {
           jComboBox4.removeAllItems();
           String ss="---Select---";
           jComboBox4.addItem(ss);
          contest();
         Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String s ="SELECT `Doctor_Id` FROM `appointment` WHERE `Date`='"+df.format(dte)+"' && `Status`='Appoint'GROUP BY `Doctor_Id`";
        try {
            st = ct.createStatement();
            rs = st.executeQuery(s);
            while (rs.next()) {
              jComboBox4.addItem(""+rs.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } 
      }
       public void jComboBox13_Show_Madecine_Name() {
        jComboBox13.removeAllItems();
           String ss="---Select---";
           jComboBox13.addItem(ss);
          contest();
         Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String s ="SELECT `Doctor_Id` FROM `appointment` WHERE `Date`='"+df.format(dte)+"' && `Status`='Appoint'GROUP BY `Doctor_Id`";
        try {
            st = ct.createStatement();
            rs = st.executeQuery(s);
            while (rs.next()) {
            jComboBox13.addItem(""+rs.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        } 
      }
  public void jTable2_Madecine_view() {
        contest();
 Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        String select = "SELECT `id`,`Doctor_Name`,`Sl_No`,`Patient_Name`,`Phone_Number`,`Date` FROM `appointment` WHERE `Add_Date`='"+df.format(dte)+"'";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getDate(6)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    public void jtable1_view(){
       contest();
  DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
String select="SELECT `D_Id`,`D_Name`,`D_Fee`,`D_Qualification` FROM `doctor_info`";
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
             while(rs.next())  {
dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
             }    } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
    
      public void jtable3_view(){
       contest();
  DefaultTableModel dt=(DefaultTableModel) jTable3.getModel();
String select="SELECT `Doctor_Name`,`Fee`,`Serial`,`Patient_Name`,`Phone_Number`,`Date` FROM `appointment_chakin` WHERE `Date`='"+jLabel8.getText()+"'";
        try {
            ps=ct.prepareCall(select);
            rs=ps.executeQuery();
             while(rs.next())  {
dt.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getDate(6)});
  }    } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
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
      public void jTable4_viewdate(){
      id=0; if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            jDateChooser2.requestFocus();
        }else{
          contest();
  DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
  dt.setRowCount(0);
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser2.getDate());
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
      public void jTable4_viewdoctor(){
       id=0;if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            jDateChooser2.requestFocus();
        }else if(jComboBox13.getSelectedIndex()<=0){
            jLabel7.setText("Doctor Id Is Empty");
          jComboBox13.requestFocus();
        }else{
          contest();
  DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
  dt.setRowCount(0);
          SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser2.getDate());
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
       public void jTable4_viewPatient_Serial(){
       id=0;if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            jDateChooser2.requestFocus();
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
                String date = sd.format(jDateChooser2.getDate());
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
public void id(){
        try {
            String i="SELECT `id` FROM `appointment`";
            contest();
            ps = null;
            ps = ct.prepareCall(i);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
        jTextField34.setText("" + id);
      jComboBox2.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
public void id2(){
        try {
            String i="SELECT `Id` FROM `appointment_chakin`";
            contest();
            ps = null;
            ps = ct.prepareCall(i);
            rs = ps.executeQuery();
            while (rs.next()) {
                id2 = rs.getInt(1);
            }
            id2 = id2 + 1;
       jTextField43.setText("" + id2);
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }}
public void Doctor_id(){
        try {
            String i="SELECT `D_Id` FROM `doctor_info`";
            contest();
            ps = null;
            ps = ct.prepareCall(i);
            rs = ps.executeQuery();
            while (rs.next()) {
             jComboBox2.addItem(""+rs.getInt(1));
            }
          
     jTextField37.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
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
        jLabel21 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField34 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField36 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField40 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fee = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel67 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel39 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jTextField44 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Appointment.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(150, 0, 1070, 140);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1210, 100, 150, 40);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel21);
        jLabel21.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1360, 140);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Id");
        jPanel1.add(jLabel49);
        jLabel49.setBounds(70, 20, 140, 40);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Doctor id");
        jPanel1.add(jLabel50);
        jLabel50.setBounds(70, 60, 130, 40);

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
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(210, 60, 240, 40);

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(255, 255, 255));
        jTextField34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField34);
        jTextField34.setBounds(210, 20, 240, 40);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Doctor Name");
        jPanel1.add(jLabel51);
        jLabel51.setBounds(70, 100, 140, 40);

        jTextField35.setEditable(false);
        jTextField35.setBackground(new java.awt.Color(255, 255, 255));
        jTextField35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField35);
        jTextField35.setBounds(210, 100, 240, 40);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Doctor Name", "Doctor Fee", "Qualification"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Doctor Fee");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Qualification");
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 230, 440, 270);

        jTextField36.setEditable(false);
        jTextField36.setBackground(new java.awt.Color(255, 255, 255));
        jTextField36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField36);
        jTextField36.setBounds(670, 60, 240, 40);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Appointment Date");
        jPanel1.add(jLabel52);
        jLabel52.setBounds(490, 20, 170, 40);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Patient Name");
        jPanel1.add(jLabel53);
        jLabel53.setBounds(490, 100, 170, 40);

        jTextField37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField37KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField37KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField37);
        jTextField37.setBounds(670, 100, 240, 40);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Phone Number");
        jPanel1.add(jLabel54);
        jLabel54.setBounds(490, 140, 170, 40);

        jTextField38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField38KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField38KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField38);
        jTextField38.setBounds(670, 140, 240, 40);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Doctor Fee");
        jPanel1.add(jLabel55);
        jLabel55.setBounds(70, 140, 140, 40);

        jTextField39.setEditable(false);
        jTextField39.setBackground(new java.awt.Color(255, 255, 255));
        jTextField39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField39);
        jTextField39.setBounds(210, 140, 240, 40);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Serial No");
        jPanel1.add(jLabel56);
        jLabel56.setBounds(490, 60, 170, 40);

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser1MousePressed(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(670, 20, 240, 40);

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Doctor Name", "Sl_NO", "Patient Name", "Phone Number", "Appointment Date"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(540, 230, 760, 270);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 190, 550, 40);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Submit");
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel66);
        jLabel66.setBounds(1160, 500, 150, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/serial.png"))); // NOI18N
        jLabel4.setText("Serial");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(930, 20, 180, 60);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/add2.png"))); // NOI18N
        jLabel9.setText("Add");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(930, 90, 150, 70);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20);
        jLabel20.setBounds(1270, 0, 90, 80);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/appoint2.jpg"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 1370, 560);

        jTabbedPane1.addTab("                      Apointment                        ", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Doctor Name");
        jPanel3.add(jLabel57);
        jLabel57.setBounds(50, 120, 130, 40);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Doctor Id");
        jPanel3.add(jLabel59);
        jLabel59.setBounds(50, 80, 130, 40);

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
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(590, 40, 240, 40);

        jTextField40.setEditable(false);
        jTextField40.setBackground(new java.awt.Color(255, 255, 255));
        jTextField40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField40);
        jTextField40.setBounds(590, 120, 240, 40);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Serial No");
        jPanel3.add(jLabel60);
        jLabel60.setBounds(440, 40, 150, 40);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Patient Number");
        jPanel3.add(jLabel58);
        jLabel58.setBounds(440, 120, 150, 40);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Patient Name");
        jPanel3.add(jLabel61);
        jLabel61.setBounds(440, 80, 150, 40);

        jTextField41.setEditable(false);
        jTextField41.setBackground(new java.awt.Color(255, 255, 255));
        jTextField41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField41);
        jTextField41.setBounds(180, 120, 240, 40);

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
        jPanel3.add(jComboBox4);
        jComboBox4.setBounds(180, 80, 240, 40);

        jTextField42.setEditable(false);
        jTextField42.setBackground(new java.awt.Color(255, 255, 255));
        jTextField42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField42MouseExited(evt);
            }
        });
        jPanel3.add(jTextField42);
        jTextField42.setBounds(590, 80, 240, 40);

        jTextField43.setEditable(false);
        jTextField43.setBackground(new java.awt.Color(255, 255, 255));
        jTextField43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField43);
        jTextField43.setBounds(180, 40, 240, 40);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Id");
        jPanel3.add(jLabel62);
        jLabel62.setBounds(50, 40, 120, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(840, 140, 400, 50);

        Fee.setEditable(false);
        Fee.setBackground(new java.awt.Color(255, 255, 255));
        Fee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(Fee);
        Fee.setBounds(180, 160, 240, 40);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Doctor Fee");
        jPanel3.add(jLabel63);
        jLabel63.setBounds(50, 160, 120, 40);

        jTable3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Fee", "Patient Serial", "Patient Name", "Patient Number", "Date"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(50, 210, 750, 280);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(810, 210, 510, 280);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Print");
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel67);
        jLabel67.setBounds(1210, 490, 110, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Chackin.png"))); // NOI18N
        jLabel14.setText("Chack-In");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14);
        jLabel14.setBounds(840, 60, 250, 70);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel19);
        jLabel19.setBounds(1270, 0, 90, 80);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/appoint2.jpg"))); // NOI18N
        jPanel3.add(jLabel17);
        jLabel17.setBounds(0, 0, 1370, 560);

        jTabbedPane1.addTab("                    Patient Chack-in                     ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Date");
        jPanel4.add(jLabel37);
        jLabel37.setBounds(40, 30, 130, 40);

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
        jComboBox13.setBounds(170, 70, 220, 40);

        jTable4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Id", "Doctor Name", "Patient Serial", "Patient Name", "Patient Number", "Fee", "Date"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jPanel4.add(jScrollPane5);
        jScrollPane5.setBounds(440, 70, 810, 350);

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseMoved(evt);
            }
        });
        jDateChooser2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jDateChooser2MouseWheelMoved(evt);
            }
        });
        jDateChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseReleased(evt);
            }
        });
        jDateChooser2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser2InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel4.add(jDateChooser2);
        jDateChooser2.setBounds(170, 30, 220, 40);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Doctor ID");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(40, 70, 130, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 210, 400, 50);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Patient Serial");
        jPanel4.add(jLabel40);
        jLabel40.setBounds(40, 150, 130, 40);

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
        jComboBox14.setBounds(170, 150, 220, 40);

        jTextField44.setEditable(false);
        jTextField44.setBackground(new java.awt.Color(255, 255, 255));
        jTextField44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField44);
        jTextField44.setBounds(170, 110, 220, 40);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Doctor Name");
        jPanel4.add(jLabel64);
        jLabel64.setBounds(40, 110, 130, 40);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel65);
        jLabel65.setBounds(910, 420, 340, 30);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Print");
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel68);
        jLabel68.setBounds(1220, 480, 120, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/view.jpg"))); // NOI18N
        jLabel10.setText("View All");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel10);
        jLabel10.setBounds(50, 270, 240, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/view.jpg"))); // NOI18N
        jLabel11.setText("View Date");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel11);
        jLabel11.setBounds(50, 330, 280, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/view.jpg"))); // NOI18N
        jLabel12.setText("Show Doctor");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel12);
        jLabel12.setBounds(50, 390, 320, 50);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/view.jpg"))); // NOI18N
        jLabel13.setText("Show Patient Serial");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel13);
        jLabel13.setBounds(50, 450, 440, 50);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel18);
        jLabel18.setBounds(1270, 0, 90, 80);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/appoint2.jpg"))); // NOI18N
        jPanel4.add(jLabel16);
        jLabel16.setBounds(0, 0, 1370, 560);

        jTabbedPane1.addTab("                  Search                   ", jPanel4);

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
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1362, 727));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         Main_Frame_MDI mm=new Main_Frame_MDI();
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            st=ct.createStatement();
            String type="SELECT `D_Name`,`D_Fee` FROM `doctor_info` WHERE `D_Id`='"+jComboBox2.getSelectedItem()+"'";
         rs=st.executeQuery(type);
            while(rs.next()){
                jTextField35.setText(""+rs.getString(1));
           jTextField39.setText(""+rs.getInt(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
       //JOptionPane.showMessageDialog(rootPane, "jjjj");
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MousePressed
        // TODO add your handling code here:
      //  JOptionPane.showMessageDialog(rootPane, "jjjj");
    }//GEN-LAST:event_jDateChooser1MousePressed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        jComboBox3Action_Show_Madecine_Name();
    }//GEN-LAST:event_jComboBox3ActionPerformed
public void jComboBox3Action_Show_Madecine_Name() {
      jTextField42.setText("");
      jTextField40.setText("");
     contest();
         Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
         
        String s ="SELECT `Patient_Name`,`Phone_Number` FROM `appointment` WHERE `Date`='"+df.format(dte)+"' AND `Doctor_Id`='"+jComboBox4.getSelectedItem()+"' AND `Sl_No`='"+jComboBox3.getSelectedItem()+"'AND `Status`='Appoint'";
        try {
            st = ct.createStatement();
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField42.setText(""+rs.getString(1));
                 jTextField40.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        } 
      }
    private void jComboBox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jComboBox4.getSelectedIndex()<=0)
   {  
      jLabel6.setText("'Please Select Doctor Id'");
   } else if(jTextField41.getText().isEmpty()){  
       jLabel6.setText("'Please Select Doctor Id'");
   } else if(jComboBox3.getSelectedIndex()<=0){  
       jLabel6.setText("'Please Select Serial Id'");
   } else if(jTextField42.getText().isEmpty()){  
       jLabel6.setText("'Patient Name Is Empty'");
   } else if(jTextField40.getText().isEmpty()){  
       jLabel6.setText("'Patient Mobile Number Is Empty'");
   } else{
   String in="INSERT INTO `appointment_chakin` (`Id`,`Doctor_Id`,`Doctor_Name`,`Serial`,`Fee`,`Patient_Name`,`Phone_Number`,`Date`) VALUES (?,?,?,?,?,?,?,?)";
   ps=null;
   contest();
   
        Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//String date1 = sd.format(jDateChooser1.getDate());
       try {
           ps = ct.prepareStatement(in);
       ps.setString(1, jTextField43.getText());
     ps.setString(2, jComboBox4.getSelectedItem().toString());
       ps.setString(3, jTextField41.getText());
       ps.setString(4, jComboBox3.getSelectedItem().toString());
          ps.setString(5, Fee.getText());
       ps.setString(6, jTextField42.getText());
       ps.setString(7,jTextField40.getText());
       ps.setString(8, df.format(dte));
       int m=ps.executeUpdate();
          if (m > 0) {
              String id=jTextField43.getText();
              String dname=jTextField41.getText();
              String Fe=Fee.getText();
           String sl=jComboBox3.getSelectedItem().toString();
           String pname=jTextField42.getText();
           String pnumber=jTextField40.getText();
           String datee=jLabel8.getText();
         jTextArea1.setText("\t    Date : "+datee+"\n\nSerial No      : "+sl+"\nPatient Name   : "+pname+"\nPatient Number : "+pnumber+"\nDoctor Name    : "+dname+"\nDoctor Fee     : "+Fe);
            id2(); 
              chakin_update();
             DefaultTableModel dt=(DefaultTableModel) jTable3.getModel();
             dt.setRowCount(0);
              jtable3_view();
              
               jLabel6.setText("Success");
               jTextField41.setText("");
               jTextField42.setText("");
               jTextField40.setText("");
               Fee.setText("");
          }
       } catch (SQLException ex) {
           Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
       }}}
    }//GEN-LAST:event_jComboBox3KeyPressed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
jComboBox4Action_Show_Madecine_Name();
    }//GEN-LAST:event_jComboBox4ActionPerformed
 public void jComboBox4Action_Show_Madecine_Name() {
      jComboBox3.removeAllItems();
      //String se=;
      jComboBox3.addItem("---Select---");
     contest();
         Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
         
        String s ="SELECT `Doctor_Name`,`Sl_No` FROM`appointment`WHERE `Doctor_Id`='"+jComboBox4.getSelectedItem()+"'AND `Date`='"+df.format(dte)+"'AND `Status`='Appoint'";
        try {
            st = ct.createStatement();
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField41.setText(""+rs.getString(1));
              jComboBox3.addItem(""+rs.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        } 
        dfee();
      }
 public void dfee(){
 String fe="SELECT `D_Fee` FROM `doctor_info` WHERE `D_Id`='"+jComboBox4.getSelectedItem()+"'";
        try {
            st=ct.createStatement();
            rs=st.executeQuery(fe);
           if(rs.next()){
            Fee.setText(""+rs.getString(1));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
   public void PAtient_Bill_Print() {
        try {
            boolean m = jTextArea1.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
              //  jTextArea1.setText("");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    private void jComboBox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4KeyPressed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
     
            jComboBox14.removeAllItems();
            String hh="---Select---";
             jComboBox14.addItem(hh);
             jTextField44.setText("");
        if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            jDateChooser2.requestFocus();
        }else{
             
             try {
                 SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                 String date = sd.format(jDateChooser2.getDate());
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

    private void jTextField42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField42MouseExited
        // TODO add your handling code here:
       // JOptionPane.showMessageDialog(rootPane, ""+jTextField42.getText());
    }//GEN-LAST:event_jTextField42MouseExited

    private void jDateChooser2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jDateChooser2MouseEntered

    private void jDateChooser2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MousePressed

    private void jDateChooser2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jDateChooser2MouseReleased

    private void jDateChooser2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_jDateChooser2MouseExited

    private void jDateChooser2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jDateChooser2MouseMoved

    private void jDateChooser2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jDateChooser2MouseWheelMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jDateChooser2MouseWheelMoved

    private void jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseClicked

    private void jDateChooser2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser2InputMethodTextChanged
        // TODO add your handling code here:
      //  JOptionPane.showMessageDialog(rootPane, "jj");
    }//GEN-LAST:event_jDateChooser2InputMethodTextChanged

    private void jComboBox13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox13MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBox13MouseClicked

    private void jComboBox13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox13MouseEntered
    
        
    }//GEN-LAST:event_jComboBox13MouseEntered

    private void jComboBox14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14MouseClicked

    private void jComboBox14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14MouseEntered

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jComboBox13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox13MousePressed
        if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            jDateChooser2.requestFocus();
        }else{
            jComboBox13.removeAllItems();
            String g="---Select---";
            jComboBox13.addItem(g);
             try {
                 SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                 String date = sd.format(jDateChooser2.getDate());
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Reception_1st rc1=new Reception_1st();
        rc1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField37KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField37KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
 if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ||c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField37KeyTyped

    private void jTextField38KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField38KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField38KeyTyped

    private void jTextField37KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField37KeyPressed
        // TODO add your handling code here:
           if (evt.getKeyCode() == KeyEvent.VK_ENTER){
jTextField38.requestFocus();
      }
    }//GEN-LAST:event_jTextField37KeyPressed

    private void jTextField38KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField38KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER){
 if(jTextField36.getText().isEmpty()){
     jLabel5.setText("Please Click Serial");
     }else if(jTextField37.getText().isEmpty()){
  jLabel5.setText("'Plesase Enter Patient Name'");
     jTextField37.requestFocus();}
     else if(jTextField38.getText().isEmpty()){
  jLabel5.setText("'Plesase Enter Patient Mobile Number'");
   jTextField38.requestFocus();}
     else{ps=null;
String in="INSERT INTO `appointment`(`id`,`Doctor_Id`,`Doctor_Name`,`Sl_No`,`Patient_Name`,`Phone_Number`,`Date`,`Add_Date`,`Status`) VALUES(?,?,?,?,?,?,?,?,?)";
      contest();
      
        Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
String date1 = sd.format(jDateChooser1.getDate());
       
try {
             ps = ct.prepareStatement(in);
        ps.setString(1, jTextField34.getText());
    ps.setString(2,jComboBox2.getSelectedItem().toString());
  ps.setString(3,jTextField35.getText());
 ps.setString(4,jTextField36.getText()); 
        ps.setString(5,jTextField37.getText()); 
         ps.setString(6,jTextField38.getText()); 
                 ps.setString(7,date1 );
          ps.setString(8,df.format(dte));
          ps.setString(9, "Appoint");
           int m = ps.executeUpdate();
                if (m > 0) {
                jLabel5.setText("Success");
                 DefaultTableModel dt4 = (DefaultTableModel) jTable2.getModel();
                    while (dt4.getRowCount() > 0) {
                        for (int i = 0; i < dt4.getRowCount(); i++) {
                            dt4.removeRow(i); } }
                   jTable2_Madecine_view();
                    id();
                  jComboBox4_Show_Madecine_Name();
                  jTextField35.setText("");
                  jTextField39.setText("");
                  jTextField36.setText("");
                  jTextField37.setText("");
                  jTextField38.setText("");
                  jComboBox2.setSelectedIndex(0);
                  ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
                  
                }
         } catch (SQLException ex) {
             Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     }   
      }
    }//GEN-LAST:event_jTextField38KeyPressed

    private void jComboBox13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox13KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        jComboBox14.requestFocus();
        }
    }//GEN-LAST:event_jComboBox13KeyPressed

    private void jComboBox14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox14KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER){
         jTable4_viewPatient_Serial();
         }
    }//GEN-LAST:event_jComboBox14KeyPressed

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        Print_Aopointment p=new Print_Aopointment(Appoint());
   p.setVisible(true);
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTextArea1.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }        
        } catch (PrinterException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable4.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }  
        } catch (PrinterException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel5.setText("Please Enter Appointment Date ");
            //jTextField3.requestFocus();
        }
 else if(jComboBox2.getSelectedIndex()<=0){
  jLabel5.setText("Please Select Doctor Id");
 }else{
        
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
String date1 = sd.format(jDateChooser1.getDate());
String date="SELECT `Sl_No` FROM `appointment` WHERE `Date`='"+date1+"' AND `Doctor_Id`='"+jComboBox2.getSelectedItem()+"'";  
 contest();
            ps = null;
            id=0;
        try {
            
            ps = ct.prepareCall(date);
              rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }id=id+1; 
 jTextField36.setText(""+id);
   jLabel5.setText("");}
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        if(jTextField36.getText().isEmpty()){
     jLabel5.setText("Please Click Serial");
     }else if(jTextField37.getText().isEmpty()){
  jLabel5.setText("'Plesase Enter Patient Name'");
     jTextField37.requestFocus();}
     else if(jTextField38.getText().isEmpty()){
  jLabel5.setText("'Plesase Enter Patient Mobile Number'");
   jTextField38.requestFocus();}
     else{ps=null;
String in="INSERT INTO `appointment`(`id`,`Doctor_Id`,`Doctor_Name`,`Sl_No`,`Patient_Name`,`Phone_Number`,`Date`,`Add_Date`,`Status`) VALUES(?,?,?,?,?,?,?,?,?)";
      contest();
      
        Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
String date1 = sd.format(jDateChooser1.getDate());
       
try {
             ps = ct.prepareStatement(in);
        ps.setString(1, jTextField34.getText());
    ps.setString(2,jComboBox2.getSelectedItem().toString());
  ps.setString(3,jTextField35.getText());
 ps.setString(4,jTextField36.getText()); 
        ps.setString(5,jTextField37.getText()); 
         ps.setString(6,jTextField38.getText()); 
                 ps.setString(7,date1 );
          ps.setString(8,df.format(dte));
          ps.setString(9, "Appoint");
           int m = ps.executeUpdate();
                if (m > 0) {
                jLabel5.setText("Success");
                 DefaultTableModel dt4 = (DefaultTableModel) jTable2.getModel();
                    while (dt4.getRowCount() > 0) {
                        for (int i = 0; i < dt4.getRowCount(); i++) {
                            dt4.removeRow(i); } }
                   jTable2_Madecine_view();
                    id();
                  jComboBox4_Show_Madecine_Name();
                  jTextField35.setText("");
                  jTextField39.setText("");
                  jTextField36.setText("");
                  jTextField37.setText("");
                  jTextField38.setText("");
                  jComboBox2.setSelectedIndex(0);
                  ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
                  
                }
         } catch (SQLException ex) {
             Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     }   
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jTable4_view();

    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
            jTable4_viewdate();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
          jTable4_viewdoctor();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
               jTable4_viewPatient_Serial();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
          if(jComboBox4.getSelectedIndex()<=0)
   {  
      jLabel6.setText("'Please Select Doctor Id'");
   } else if(jTextField41.getText().isEmpty()){  
       jLabel6.setText("'Please Select Doctor Id'");
   } else if(jComboBox3.getSelectedIndex()<=0){  
       jLabel6.setText("'Please Select Serial Id'");
   } else if(jTextField42.getText().isEmpty()){  
       jLabel6.setText("'Patient Name Is Empty'");
   } else if(jTextField40.getText().isEmpty()){  
       jLabel6.setText("'Patient Mobile Number Is Empty'");
   } else{
   String in="INSERT INTO `appointment_chakin` (`Id`,`Doctor_Id`,`Doctor_Name`,`Serial`,`Fee`,`Patient_Name`,`Phone_Number`,`Date`) VALUES (?,?,?,?,?,?,?,?)";
   ps=null;
   contest();
   
        Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//String date1 = sd.format(jDateChooser1.getDate());
       try {
           ps = ct.prepareStatement(in);
       ps.setString(1, jTextField43.getText());
     ps.setString(2, jComboBox4.getSelectedItem().toString());
       ps.setString(3, jTextField41.getText());
       ps.setString(4, jComboBox3.getSelectedItem().toString());
          ps.setString(5, Fee.getText());
       ps.setString(6, jTextField42.getText());
       ps.setString(7,jTextField40.getText());
       ps.setString(8, df.format(dte));
       int m=ps.executeUpdate();
          if (m > 0) {
              String id=jTextField43.getText();
              String dname=jTextField41.getText();
              String Fe=Fee.getText();
           String sl=jComboBox3.getSelectedItem().toString();
           String pname=jTextField42.getText();
           String pnumber=jTextField40.getText();
           String datee=jLabel8.getText();
         jTextArea1.setText("\t    Date : "+datee+"\n\nSerial No      : "+sl+"\nPatient Name   : "+pname+"\nPatient Number : "+pnumber+"\nDoctor Name    : "+dname+"\nDoctor Fee     : "+Fe);
            id2(); 
              chakin_update();
             DefaultTableModel dt=(DefaultTableModel) jTable3.getModel();
             dt.setRowCount(0);
              jtable3_view();
              
               jLabel6.setText("Success");
               jTextField41.setText("");
               jTextField42.setText("");
               jTextField40.setText("");
               Fee.setText("");
               jComboBox4.requestFocus();
          }
       } catch (SQLException ex) {
           Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
       }}
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel21MouseClicked
public int Appoint(){
int n=0;
int p = 0;

 try {
            String i="SELECT `D_Id` FROM `doctor_info`WHERE `D_Id`='"+jComboBox2.getSelectedItem()+"'";
            contest();
            ps = null;
            ps = ct.prepareCall(i);
            rs = ps.executeQuery();
            while (rs.next()) {
             p=Integer.parseInt(jComboBox2.getSelectedItem().toString());
            }
          
     jTextField37.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
return p;}
public void chakin_update(){
        try {
            Date dte=new Date();
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            String up="UPDATE `appointment` SET `Status`='Chack-in' WHERE `Doctor_Id`='"+jComboBox4.getSelectedItem()+"'AND `Sl_No`='"+jComboBox3.getSelectedItem()+"'AND `Date`='"+df.format(dte)+"'";
            ps = ct.prepareCall(up);
            ps.execute();
             jComboBox4_Show_Madecine_Name();
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fee;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
