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

public class Madecine extends javax.swing.JFrame {

    Connection ct = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Statement st = null;
    int id = 0;
    int midd=0;
    int idPur = 0;
      int idd = 0;
      int idsell = 0;
    int idj3 = 0;
    int idj4 = 0;
    int pur_price=0;
    int s1_price=0;
     int s2_price=0;
          int s2=0;
               int s3=0;
     int Sell_price=0;
    int tp=0;
    ResultSet rss = null;
    PreparedStatement tps = null;
    PreparedStatement ops = null;
    int ft = 0;
    int tk = 0;
    int tk2 = 0;
    int tp2 = 0;
int stock30=0;
int stock34=0;
int stock35=0;
int Sell_Up_qun=0;
    public Madecine() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        //      int h=(int) tk.getScreenSize().getHeight();
        ///    int w=(int) tk.getScreenSize().getWidth();
        //  this.setSize(w, h);
        // getContentPane().setBackground(Color.White);

        setIconImage(tk.getImage(getClass().getResource("Loghu__Hospital.jpg")));
        show_date();
        show_Pur_Id();
        show_test();
//jatble2stock();
        jtable1_Madecine_view();
        View_jComboBox1_Id_Search();
        jcombbx3_Show_Madecine_Name();
        //jatble2stock();
        // jtable4Pur();
        show_id_sell();
        show_id();
        jcombbx4_Show_Madecine_Name();
        jcombbx5_Show_Madecine_Name();
        show_Pur_Id_seller();
        show_Sell_Id_jtextfilde3();
        show_Sell_Id_jtextfilde20();
                 jLabel58.setVisible(false);
    }

    public int jatble2stock() {
        contest();
        st = null;
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        dt.setRowCount(0);
        String t = "SELECT *FROM `Stock_Final`";
        try {
            int sqt = 0;
            int tt = 0;
            st = ct.prepareCall(t);
            rs = st.executeQuery(t);
            while (rs.next()) {
                if (rs.getInt(3) <= 0) {
                    tt = rs.getInt(2);
                    // JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
                } else {
                    tt = rs.getInt(2) - rs.getInt(3);
                    //JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
                }
                dt.addRow(new Object[]{rs.getString(1), rs.getInt(2), rs.getInt(3), tt});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    } public int Stock_Madecine() {
        contest();
        st = null;
        String t = "SELECT *FROM `Stock_Final` WHERE `stock_final`.`Madicine_Name`='"+jComboBox14.getSelectedItem()+"'";
        try {
            int sqt = 0;
            int tt = 0;
            st = ct.prepareCall(t);
            rs = st.executeQuery(t);
            while (rs.next()) {
                if (rs.getInt(3) <= 0) {
                    tt = rs.getInt(2);
                     jTextField29.setText(""+tt);
                    // JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
                } else {
                    tt = rs.getInt(2) - rs.getInt(3);
                     //jTextField29.setText(""+tt);
                    //JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
              jTextField29.setText(""+tt);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }
 public int Stock_Madecine_sell() {
        contest();
        st = null;
        String t = "SELECT *FROM `Stock_Final` WHERE `stock_final`.`Madicine_Name`='"+jComboBox13.getSelectedItem()+"'";
        try {
            int sqt = 0;
            int tt = 0;
            st = ct.prepareCall(t);
            rs = st.executeQuery(t);
            while (rs.next()) {
                if (rs.getInt(3) <= 0) {
                    tt = rs.getInt(2);
                     jTextField34.setText(""+tt);
                    // JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
                } else {
                    tt = rs.getInt(2) - rs.getInt(3);
                     //jTextField29.setText(""+tt);
                    //JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
              jTextField34.setText(""+tt);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }
    public int jatble2_search() {
        contest();
        st = null;
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        dt.setRowCount(0);
        String t = "SELECT *FROM `Stock_Final` WHERE `stock_final`.`Madicine_Name`='" + jComboBox4.getSelectedItem() + "'";
        try {
            int sqt = 0;
            int tt = 0;
            st = ct.prepareCall(t);
            rs = st.executeQuery(t);
            while (rs.next()) {
                if (rs.getInt(3) <= 0) {
                    tt = rs.getInt(2);
                    // JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
                } else {
                    tt = rs.getInt(2) - rs.getInt(3);
                    //JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
                }
                dt.addRow(new Object[]{rs.getString(1), rs.getInt(2), rs.getInt(3), tt});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    public int jatble5_search() {
        contest();
        st = null;
        DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
        dt.setRowCount(0);
        String t = "SELECT `Madicine_Name`,`Madicine_Price`,`Madicine_Detailse` FROM `madicine_info` WHERE `madicine_info`.`Madicine_Name`='" + jComboBox5.getSelectedItem() + "'";
        try {
            int sqt = 0;
            int tt = 0;
            st = ct.prepareCall(t);
            rs = st.executeQuery(t);
            while (rs.next()) {

                dt.addRow(new Object[]{rs.getString(1), rs.getInt(2), rs.getString(3)});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    public int jtable4Pur() {
        contest();
        st = null;
        DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
        dt.setRowCount(0);
        String t = "SELECT `Seller_Id`,`Seller_Name`,`Seller_Number`,`Madicine_Name`,`Madicine_Id`,`Pur_Price`,`Pur_Quantity`,(`Pur_Quantity`*`Pur_Price`) AS `Total_Price`FROM `madecine_pur_info` GROUP BY `Pur_ID`";
        try {
            st = ct.prepareCall(t);
            rs = st.executeQuery(t);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8)});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    public int jtable4Pur2() {
        contest();
        st = null;
        DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
        // dt.setRowCount(0);

//  String t="SELECT `Seller_Id`,`Seller_Name`,`Seller_Number`,`Madicine_Name`,`Madicine_Id`,`Pur_Price`,`Pur_Quantity`,(`Pur_Quantity`*`Pur_Price`) AS `Total_Price`FROM `madecine_pur_info` GROUP BY `Pur_ID`";
        dt.addRow(new Object[]{jTextField14.getText(), jTextField16.getText(), jTextField17.getText(), jComboBox3.getSelectedItem(), jTextField11.getText(), jTextField12.getText(), jTextField5.getText(), jTextField18.getText()});

        return 0;
    }

    /* public int  jtable2_stock(){
contest();
st=null;
DefaultTableModel dt=(DefaultTableModel)jTable2.getModel();
String q="SELECT *FROM `stockf`";
try {
          int sq=0,stk=0;
 st=ct.prepareCall(q);
         rs=st.executeQuery(q);
          while(rs.next()){
             if(rs.getInt(3)==0){
             stk=rs.getInt(2);
             }else{
              stk=rs.getInt(2)- rs.getInt(3);
             } 
dt.addRow(new Object[]{rs.getInt(1),rs.getInt(2),rs.getInt(3),stk});
         }} catch (SQLException ex) {
           Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
      }
return 0;}
     */

    public void jtable1_Madecine_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        String select = "SELECT `Madicine_Id`,`Madicine_Name`,`Madicine_Price`,`Madicine_Detailse` FROM `madicine_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void View_jComboBox1_Id_Search() {
        contest();
        try {
            st = ct.createStatement();
            String i = "SELECT `stockf`.`Madicine_Name` FROM `stockf`";
            rs = st.executeQuery(i);
            while (rs.next()) {
                jComboBox1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        jLabel8.setText(df.format(dt));
//((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel38 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField12 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton45 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jTextField20 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jTextField15 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel40 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jTextField25 = new javax.swing.JTextField();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jButton51 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(102, 102, 255));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Update");
        jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel90MouseClicked(evt);
            }
        });

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1210, 100, 150, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecine.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 0, 1050, 140);

        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel105MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel105);
        jLabel105.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 140);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Madicine Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 190, 180, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 460, 780, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Madicine Id");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 160, 180, 31);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(250, 190, 150, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(250, 230, 150, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(250, 260, 150, 40);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(250, 160, 150, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Madicine Price");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 230, 180, 31);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Price", "Detailse"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(440, 160, 520, 270);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Madicine Detailse");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 260, 180, 40);

        jTextField23.setEditable(false);
        jTextField23.setBackground(new java.awt.Color(255, 255, 255));
        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField23);
        jTextField23.setBounds(1160, 160, 150, 40);

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(255, 255, 255));
        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField24);
        jTextField24.setBounds(1160, 200, 150, 40);

        jLabel6.setBackground(new java.awt.Color(51, 51, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Madicine Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(990, 200, 170, 40);

        jLabel44.setBackground(new java.awt.Color(51, 51, 255));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Madicine Id");
        jPanel1.add(jLabel44);
        jLabel44.setBounds(990, 160, 170, 40);

        jLabel56.setBackground(new java.awt.Color(51, 51, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Madicine Detailse");
        jPanel1.add(jLabel56);
        jLabel56.setBounds(990, 270, 170, 40);

        jTextField26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });
        jTextField26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField26KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField26);
        jTextField26.setBounds(1160, 270, 150, 40);

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
        jTextField38.setBounds(1160, 240, 150, 30);

        jLabel57.setBackground(new java.awt.Color(51, 51, 255));
        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Madicine Price");
        jPanel1.add(jLabel57);
        jLabel57.setBounds(990, 240, 170, 31);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Print");
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel68);
        jLabel68.setBounds(880, 120, 80, 40);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Update.png"))); // NOI18N
        jLabel61.setText("Update");
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel61);
        jLabel61.setBounds(1030, 370, 240, 70);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/addm.png"))); // NOI18N
        jLabel62.setText("Add Madicine");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel62);
        jLabel62.setBounds(30, 360, 330, 70);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Clear");
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel64);
        jLabel64.setBounds(780, 120, 90, 40);

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel84MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel84);
        jLabel84.setBounds(1270, 0, 90, 80);

        jLabel96.setBackground(new java.awt.Color(51, 51, 255));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecin.jpg"))); // NOI18N
        jPanel1.add(jLabel96);
        jLabel96.setBounds(0, -6, 1360, 570);

        jTabbedPane1.addTab("Add Madecine", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField8);
        jTextField8.setBounds(260, 60, 150, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Purcheas Id");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(80, 60, 180, 31);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Madicine Name");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(80, 200, 180, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Madicine Id");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(80, 240, 180, 40);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox3PopupMenuWillBecomeVisible(evt);
            }
        });
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
        jPanel5.add(jComboBox3);
        jComboBox3.setBounds(260, 200, 150, 40);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel5.add(jTextField12);
        jTextField12.setBounds(260, 280, 150, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField5MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField5MouseReleased(evt);
            }
        });
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
        jPanel5.add(jTextField5);
        jTextField5.setBounds(260, 320, 150, 40);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
        });
        jPanel5.add(jTextField11);
        jTextField11.setBounds(260, 240, 150, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Madicine Price");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(80, 280, 180, 40);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seller Id", "Seller Name", "Seller Number", "Madicine Name", "Madecine Id", "Madicine Price", "Madicine Quantity", "Total Price"
            }
        ));
        jScrollPane3.setViewportView(jTable4);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(490, 100, 730, 390);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel22);
        jLabel22.setBounds(40, 420, 420, 50);

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField14);
        jTextField14.setBounds(260, 90, 150, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Seller Id");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(80, 90, 180, 31);

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        jPanel5.add(jTextField16);
        jTextField16.setBounds(260, 120, 150, 40);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Seller  Name");
        jPanel5.add(jLabel26);
        jLabel26.setBounds(80, 120, 180, 40);

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
        jPanel5.add(jTextField17);
        jTextField17.setBounds(260, 160, 150, 40);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Seller  Number");
        jPanel5.add(jLabel27);
        jLabel27.setBounds(80, 160, 180, 40);

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton18.setText("Clear");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton18);
        jButton18.setBounds(1070, 60, 140, 40);

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField18);
        jTextField18.setBounds(260, 360, 150, 40);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Madicine Quantity");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(80, 320, 180, 40);

        jButton45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton45.setText("Total Price");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton45);
        jButton45.setBounds(70, 360, 190, 40);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 255));
        jPanel5.add(jLabel55);
        jLabel55.setBounds(1050, 490, 150, 50);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 255));
        jLabel58.setText("Total Tk :");
        jPanel5.add(jLabel58);
        jLabel58.setBounds(930, 490, 120, 50);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel69.setText("Submit");
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel69);
        jLabel69.setBounds(1210, 510, 140, 40);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecinee.jpg"))); // NOI18N
        jLabel63.setText("Purchase Madecine");
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel63);
        jLabel63.setBounds(20, 480, 450, 70);

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel85MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel85);
        jLabel85.setBounds(1270, 0, 90, 80);

        jLabel97.setBackground(new java.awt.Color(51, 51, 255));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecin.jpg"))); // NOI18N
        jPanel5.add(jLabel97);
        jLabel97.setBounds(0, -6, 1360, 570);

        jTabbedPane1.addTab("Purchase", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

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
        jComboBox1.setBounds(220, 250, 150, 40);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(jTextField7);
        jTextField7.setBounds(370, 250, 290, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Custommer Id");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(30, 130, 190, 40);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField10);
        jTextField10.setBounds(370, 290, 290, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
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
        jPanel4.add(jComboBox2);
        jComboBox2.setBounds(220, 290, 150, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Madicine Quantity");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(30, 290, 190, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Madicine Name");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(30, 250, 190, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Custommer Birthday");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(30, 210, 190, 40);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField3);
        jTextField3.setBounds(220, 90, 440, 40);

        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyPressed(evt);
            }
        });
        jPanel4.add(jDateChooser1);
        jDateChooser1.setBounds(220, 210, 440, 40);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel20);
        jLabel20.setBounds(20, 350, 650, 50);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Custommer Name");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(30, 170, 190, 40);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField9);
        jTextField9.setBounds(220, 170, 440, 40);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Custommer Name", "Cutommer BirthDay", "Madicine Name", "Price", "Madicine Quantity", "Total", "Date"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(670, 130, 630, 350);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(1160, 90, 140, 40);

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField20);
        jTextField20.setBounds(220, 130, 440, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Sell NO");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(30, 90, 190, 40);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 255));
        jPanel4.add(jLabel59);
        jLabel59.setBounds(1120, 480, 140, 50);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 255));
        jPanel4.add(jLabel60);
        jLabel60.setBounds(1000, 480, 120, 50);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel70.setText("Submit");
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel70);
        jLabel70.setBounds(1220, 500, 140, 40);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/mmm.png"))); // NOI18N
        jLabel65.setText(" Sell");
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel65);
        jLabel65.setBounds(280, 430, 250, 70);

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel86);
        jLabel86.setBounds(1270, 0, 90, 80);

        jLabel98.setBackground(new java.awt.Color(51, 51, 255));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecin.jpg"))); // NOI18N
        jPanel4.add(jLabel98);
        jLabel98.setBounds(0, -6, 1360, 570);

        jTabbedPane1.addTab("Sell Madecine ", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Madecine Name", "Purchase Quantity", "Sell Quantity", "Total Quantity"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setHeaderValue("Purchase Quantity");
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Sell Quantity");
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(370, 110, 920, 390);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox4PopupMenuWillBecomeVisible(evt);
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
        });
        jPanel3.add(jComboBox4);
        jComboBox4.setBounds(210, 110, 150, 40);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Madicine Name");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(50, 110, 160, 40);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel71.setText("Print");
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel71);
        jLabel71.setBounds(1230, 500, 120, 50);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 102, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/view.jpg"))); // NOI18N
        jLabel66.setText("View");
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel66);
        jLabel66.setBounds(50, 300, 240, 80);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 102, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel67.setText("Search");
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel67);
        jLabel67.setBounds(70, 400, 240, 80);

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel87MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel87);
        jLabel87.setBounds(1270, 0, 90, 80);

        jLabel99.setBackground(new java.awt.Color(51, 51, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecin.jpg"))); // NOI18N
        jPanel3.add(jLabel99);
        jLabel99.setBounds(0, -6, 1360, 570);

        jTabbedPane1.addTab("Strock", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Madicine Name");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(20, 160, 160, 40);

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox5.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox5PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox5PopupMenuWillBecomeVisible(evt);
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
        jPanel6.add(jComboBox5);
        jComboBox5.setBounds(180, 160, 150, 40);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Madecine Name", "Price", "Details"
            }
        ));
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(350, 130, 920, 370);

        jButton26.setBackground(new java.awt.Color(204, 0, 0));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Clear");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton26);
        jButton26.setBounds(1140, 90, 130, 40);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel72.setText("Print");
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel72);
        jLabel72.setBounds(1230, 510, 120, 40);

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(102, 102, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel77.setText("Search");
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel77);
        jLabel77.setBounds(30, 340, 240, 70);

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel88MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel88);
        jLabel88.setBounds(1270, 0, 90, 80);

        jLabel100.setBackground(new java.awt.Color(51, 51, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecin.jpg"))); // NOI18N
        jPanel6.add(jLabel100);
        jLabel100.setBounds(0, -6, 1360, 570);

        jTabbedPane1.addTab("Search Madecine", jPanel6);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jDateChooser3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser3KeyPressed(evt);
            }
        });
        jPanel8.add(jDateChooser3);
        jDateChooser3.setBounds(40, 40, 210, 50);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Custommer Id");
        jPanel8.add(jLabel34);
        jLabel34.setBounds(30, 150, 170, 40);

        jComboBox10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jComboBox10MouseDragged(evt);
            }
        });
        jComboBox10.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox10PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox10PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox10.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jComboBox10MouseWheelMoved(evt);
            }
        });
        jComboBox10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox10MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBox10MouseReleased(evt);
            }
        });
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
        jPanel8.add(jComboBox10);
        jComboBox10.setBounds(200, 150, 150, 40);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("Custommer Name");
        jPanel8.add(jLabel35);
        jLabel35.setBounds(30, 190, 170, 40);

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel8.add(jTextField22);
        jTextField22.setBounds(200, 190, 150, 40);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel37);
        jLabel37.setBounds(410, 470, 860, 50);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Custommer Id", "Custommer Name ", "Madecine Name", "Quantity", "Price", " Total Price ", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel8.add(jScrollPane8);
        jScrollPane8.setBounds(400, 130, 880, 330);

        jButton11.setBackground(new java.awt.Color(204, 0, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Clear");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton11);
        jButton11.setBounds(1150, 90, 130, 40);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel73.setText("Print");
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel73);
        jLabel73.setBounds(1250, 500, 110, 50);

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 102, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/ok.jpg"))); // NOI18N
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel78MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel78);
        jLabel78.setBounds(250, 30, 70, 70);

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 102, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel79.setText("Search Id");
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel79MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel79);
        jLabel79.setBounds(50, 430, 250, 70);

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(102, 102, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel80.setText("Search Date");
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel80);
        jLabel80.setBounds(50, 350, 300, 70);

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(102, 102, 255));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel89.setText("Search All");
        jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel89MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel89);
        jLabel89.setBounds(20, 270, 320, 70);

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel92);
        jLabel92.setBounds(1270, 0, 90, 80);

        jLabel101.setBackground(new java.awt.Color(51, 51, 255));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecin.jpg"))); // NOI18N
        jPanel8.add(jLabel101);
        jLabel101.setBounds(0, -6, 1360, 570);

        jTabbedPane1.addTab("Search Purchase", jPanel8);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Custommer Id", "Custommer Name ", "Custommer Birth Date", "Madecine Name", "Quantity", "Price", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setHeaderValue("Birthday");
        }

        jPanel7.add(jScrollPane6);
        jScrollPane6.setBounds(420, 110, 880, 330);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Seller Birth Date");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(40, 260, 160, 40);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Seller Name");
        jPanel7.add(jLabel32);
        jLabel32.setBounds(40, 220, 160, 40);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 255));
        jPanel7.add(jLabel29);
        jLabel29.setBounds(420, 440, 870, 50);
        jPanel7.add(jDateChooser2);
        jDateChooser2.setBounds(30, 50, 210, 50);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Seller Id");
        jPanel7.add(jLabel33);
        jLabel33.setBounds(40, 180, 160, 40);

        jComboBox9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox9.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox9PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox9PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox9MousePressed(evt);
            }
        });
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
        jPanel7.add(jComboBox9);
        jComboBox9.setBounds(200, 180, 150, 40);

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel7.add(jTextField15);
        jTextField15.setBounds(200, 220, 150, 40);

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel7.add(jTextField21);
        jTextField21.setBounds(200, 260, 150, 40);

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton25.setText("Clear");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton25);
        jButton25.setBounds(1120, 70, 130, 40);

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel74.setText("Print");
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel74);
        jLabel74.setBounds(1230, 500, 120, 50);

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 102, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/ok.jpg"))); // NOI18N
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel81);
        jLabel81.setBounds(250, 50, 80, 60);

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 102, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel82.setText("Search  Id");
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel82);
        jLabel82.setBounds(90, 400, 280, 60);

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 102, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel83.setText("Search Date");
        jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel83MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel83);
        jLabel83.setBounds(80, 330, 330, 60);

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(102, 102, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel91.setText("Search  All");
        jLabel91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel91MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel91);
        jLabel91.setBounds(90, 470, 280, 60);

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel93MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel93);
        jLabel93.setBounds(1270, 0, 90, 80);

        jLabel102.setBackground(new java.awt.Color(51, 51, 255));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecin.jpg"))); // NOI18N
        jPanel7.add(jLabel102);
        jLabel102.setBounds(0, -6, 1360, 570);

        jTabbedPane1.addTab("Search Sell", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Madecine Name", "Quantity", "Price", "Total Price", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel9.add(jScrollPane7);
        jScrollPane7.setBounds(430, 100, 870, 360);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Seller Name");
        jPanel9.add(jLabel39);
        jLabel39.setBounds(60, 180, 160, 40);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel30);
        jLabel30.setBounds(450, 460, 820, 50);
        jPanel9.add(jDateChooser4);
        jDateChooser4.setBounds(640, 40, 190, 50);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("Seller Id");
        jPanel9.add(jLabel40);
        jLabel40.setBounds(60, 140, 160, 40);

        jComboBox11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox11.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox11PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox11PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox11MouseClicked(evt);
            }
        });
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });
        jComboBox11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox11KeyPressed(evt);
            }
        });
        jPanel9.add(jComboBox11);
        jComboBox11.setBounds(240, 140, 150, 40);

        jButton33.setBackground(new java.awt.Color(204, 0, 51));
        jButton33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("Show Id");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton33);
        jButton33.setBounds(70, 470, 140, 50);

        jButton34.setBackground(new java.awt.Color(204, 0, 51));
        jButton34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Return");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton34);
        jButton34.setBounds(210, 470, 180, 50);

        jButton35.setBackground(new java.awt.Color(204, 0, 51));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("Show All");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton35);
        jButton35.setBounds(70, 420, 140, 50);

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel9.add(jTextField25);
        jTextField25.setBounds(240, 180, 150, 40);

        jButton38.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton38.setText("Clear");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton38);
        jButton38.setBounds(1110, 50, 130, 40);

        jButton39.setBackground(new java.awt.Color(204, 0, 51));
        jButton39.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("Purchase");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton39);
        jButton39.setBounds(430, 40, 210, 50);

        jButton41.setBackground(new java.awt.Color(204, 0, 51));
        jButton41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("Show Date");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton41);
        jButton41.setBounds(210, 420, 180, 50);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setText("Madecine Name");
        jPanel9.add(jLabel45);
        jLabel45.setBounds(60, 220, 160, 40);

        jTextField29.setEditable(false);
        jTextField29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel9.add(jTextField29);
        jTextField29.setBounds(240, 260, 150, 40);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setText("Stock Quantity");
        jPanel9.add(jLabel46);
        jLabel46.setBounds(60, 260, 180, 40);

        jComboBox14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox14.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox14PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox14PopupMenuWillBecomeVisible(evt);
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
        jPanel9.add(jComboBox14);
        jComboBox14.setBounds(240, 220, 150, 40);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setText("Purchase Quantity");
        jPanel9.add(jLabel49);
        jLabel49.setBounds(60, 300, 180, 40);

        jTextField31.setEditable(false);
        jTextField31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel9.add(jTextField31);
        jTextField31.setBounds(240, 300, 150, 40);

        jTextField32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField32KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField32KeyTyped(evt);
            }
        });
        jPanel9.add(jTextField32);
        jTextField32.setBounds(240, 340, 150, 40);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setText("Return Quantity");
        jPanel9.add(jLabel50);
        jLabel50.setBounds(60, 340, 180, 40);

        jTextField33.setEditable(false);
        jTextField33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel9.add(jTextField33);
        jTextField33.setBounds(240, 100, 150, 40);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setText("Id");
        jPanel9.add(jLabel51);
        jLabel51.setBounds(60, 100, 180, 40);

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Print");
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel75MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel75);
        jLabel75.setBounds(1230, 500, 120, 50);

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel94MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel94);
        jLabel94.setBounds(1270, 0, 90, 80);

        jLabel103.setBackground(new java.awt.Color(51, 51, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecin.jpg"))); // NOI18N
        jPanel9.add(jLabel103);
        jLabel103.setBounds(0, -6, 1360, 570);

        jTabbedPane1.addTab("Purchase Return", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Madecine Name", "Quantity", "Price", "Total Price", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel10.add(jScrollPane9);
        jScrollPane9.setBounds(450, 80, 860, 360);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(jLabel36);
        jLabel36.setBounds(450, 440, 860, 50);
        jPanel10.add(jDateChooser5);
        jDateChooser5.setBounds(610, 30, 190, 50);

        jButton51.setBackground(new java.awt.Color(204, 0, 0));
        jButton51.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton51.setForeground(new java.awt.Color(255, 255, 255));
        jButton51.setText("Clear");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton51);
        jButton51.setBounds(1060, 40, 130, 40);

        jButton27.setBackground(new java.awt.Color(204, 0, 0));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Search");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton27);
        jButton27.setBounds(450, 30, 160, 50);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setText("Id");
        jPanel10.add(jLabel54);
        jLabel54.setBounds(60, 50, 180, 40);

        jTextField36.setEditable(false);
        jTextField36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField36);
        jTextField36.setBounds(260, 50, 150, 40);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setText("Cutommer Id");
        jPanel10.add(jLabel41);
        jLabel41.setBounds(60, 90, 180, 40);

        jComboBox12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox12.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox12PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox12PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox12MousePressed(evt);
            }
        });
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        jComboBox12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox12KeyPressed(evt);
            }
        });
        jPanel10.add(jComboBox12);
        jComboBox12.setBounds(260, 90, 150, 40);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("Cutommer Name");
        jPanel10.add(jLabel42);
        jLabel42.setBounds(60, 130, 180, 40);

        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel10.add(jTextField27);
        jTextField27.setBounds(260, 130, 150, 40);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText("Cutommer Birth Date");
        jPanel10.add(jLabel43);
        jLabel43.setBounds(60, 170, 200, 40);

        jTextField28.setEditable(false);
        jTextField28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel10.add(jTextField28);
        jTextField28.setBounds(260, 170, 150, 40);

        jComboBox13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox13.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox13PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox13PopupMenuWillBecomeVisible(evt);
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
        jPanel10.add(jComboBox13);
        jComboBox13.setBounds(260, 210, 150, 30);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setText("Madecine Name");
        jPanel10.add(jLabel48);
        jLabel48.setBounds(60, 210, 180, 30);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel52.setText("Stock Quantity");
        jPanel10.add(jLabel52);
        jLabel52.setBounds(60, 240, 180, 40);

        jTextField34.setEditable(false);
        jTextField34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel10.add(jTextField34);
        jTextField34.setBounds(260, 240, 150, 40);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setText("Madecine Quantity");
        jPanel10.add(jLabel47);
        jLabel47.setBounds(60, 280, 180, 40);

        jTextField30.setEditable(false);
        jTextField30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel10.add(jTextField30);
        jTextField30.setBounds(260, 280, 150, 40);

        jTextField35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField35KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField35KeyTyped(evt);
            }
        });
        jPanel10.add(jTextField35);
        jTextField35.setBounds(260, 320, 150, 40);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setText("Return Quantity");
        jPanel10.add(jLabel53);
        jLabel53.setBounds(60, 320, 180, 40);

        jButton40.setBackground(new java.awt.Color(204, 0, 0));
        jButton40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("Show All");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton40);
        jButton40.setBounds(60, 420, 140, 50);

        jButton42.setBackground(new java.awt.Color(204, 0, 0));
        jButton42.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setText("Show Date");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton42);
        jButton42.setBounds(200, 420, 180, 50);

        jButton44.setBackground(new java.awt.Color(204, 0, 0));
        jButton44.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("Return");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton44);
        jButton44.setBounds(200, 470, 180, 50);

        jButton43.setBackground(new java.awt.Color(204, 0, 0));
        jButton43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton43.setForeground(new java.awt.Color(255, 255, 255));
        jButton43.setText("Show Id");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton43);
        jButton43.setBounds(60, 470, 140, 50);

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel76.setText("Print");
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel76);
        jLabel76.setBounds(1230, 500, 120, 50);

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel95MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel95);
        jLabel95.setBounds(1270, 0, 90, 80);

        jLabel104.setBackground(new java.awt.Color(51, 51, 255));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Madecin.jpg"))); // NOI18N
        jPanel10.add(jLabel104);
        jLabel104.setBounds(0, -6, 1360, 570);

        jTabbedPane1.addTab("Sell Return", jPanel10);

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
    public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        } }

    public int show_test() {
        contest();
        ps = null;
        // cleardata();
        id=0;
        String select = "SELECT `Madicine_Id` FROM `madicine_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
            jTextField6.setText("" + id);
            jTextField1.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public int show_Pur_Id_seller() {
        contest();
        ps = null;
        // cleardata();
        String select = "SELECT `Seller_Id` FROM `madecine_pur_info`GROUP BY `Seller_Id`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                idPur = rs.getInt(1);
            }
          idPur = idPur + 1;
            jTextField14.setText("" + idPur);

        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idPur;
    }

    public int show_Pur_Id() {
        contest();
        ps = null;
        // cleardata();
        String select = "SELECT `Pur_ID`FROM `madecine_pur_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            id = id + 1;
            jTextField8.setText("" + id);

        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public int show_Sell_Id_jtextfilde3() {
        contest();
        ps = null;
        // cleardata();
        String select = "SELECT `Sel_Id` FROM `mdecine_sels_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                idj3 = rs.getInt(1);
            }
            idj3 = idj3 + 1;
            jTextField3.setText("" + idj3);

        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idj3;
    }

    public int show_Sell_Id_jtextfilde20() {
        contest();
        ps = null;
        // cleardata();
        String select = "SELECT `Coustomer_Id` FROM `mdecine_sels_info`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                idj4 = rs.getInt(1);
            }
            idj4 = idj4 + 1;
            jTextField20.setText("" + idj4);

        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idj4;
    }

    public void jcombbx3_Show_Madecine_Name() {
        contest();
        String s = "SELECT `Madicine_Name` FROM `madicine_info` GROUP BY `Madicine_Id`";
        try {
            st = ct.createStatement();
            rs = st.executeQuery(s);
            while (rs.next()) {
                jComboBox3.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void jcombbx4_Show_Madecine_Name() {
        contest();
        String s = "SELECT `stock_final`.`Madicine_Name` FROM `stock_final` GROUP BY `stock_final`.`Madicine_Name`";
        try {
            st = ct.createStatement();
            rs = st.executeQuery(s);
            while (rs.next()) {
                jComboBox4.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void jcombbx5_Show_Madecine_Name() {
        contest();
        String s = "SELECT `Madicine_Name`,`Madicine_Price`,`Madicine_Detailse` FROM `madicine_info`";
        try {
            st = ct.createStatement();
            rs = st.executeQuery(s);
            while (rs.next()) {
                jComboBox5.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        jTextField23.setText(dt.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTextField24.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField38.setText(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextField26.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());

    }//GEN-LAST:event_jTable1MouseClicked
    public void m_final_q_p() {
        String ss = "---Select---";
        jComboBox2.removeAllItems();
        jComboBox2.addItem(ss);
        contest();
        try {
            //   jTextField3.setText("");
            st = ct.createStatement();

            String s = "SELECT `m_price`.`Madicine_Name`,SUM(`m_price`.`Pur_Price`+'10%')AS `S_Price` FROM  `m_price` WHERE `m_price`.`Madicine_Name`='" + jComboBox1.getSelectedItem() + "' GROUP BY `m_price`.`Madicine_Name`";
            rs = st.executeQuery(s);
            Statement st2 = null;
            ResultSet rs2 = null;
            st2 = ct.createStatement();
            String s2 = "SELECT *FROM `Stock_Final` WHERE  `Madicine_Name`='" + jComboBox1.getSelectedItem() + "'";
            //    Madecine ob=new Madecine();
            rs2 = st2.executeQuery(s2);
            if (rs2.next()) {
                int tt2 = 0;
                if (rs2.getInt(3) <= 0) {
                    tt2 = rs2.getInt(2);

                    // JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
                } else {
                    tt2 = rs2.getInt(2) - rs2.getInt(3);
                    //JOptionPane.showMessageDialog(rootPane,"Total= "+tt);
                }
                int p = 0;
                while (p != tt2) {
                    p++;
                    jComboBox2.addItem("" + p);
                }
//  JOptionPane.showMessageDialog(rootPane,"Total= "+tt2);  
            }
            while (rs.next()) {
                jTextField7.setText("Price : " + rs.getInt(2));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        m_final_q_p();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jcombobox2();

    }//GEN-LAST:event_jComboBox2ActionPerformed
    public void jcombobox2() {
        int tp = 0;
        try {

            st = ct.createStatement();

            String s = "SELECT `m_price`.`Madicine_Name`,SUM(`m_price`.`Pur_Price`+'10%')AS `S_Price` FROM  `m_price` WHERE `m_price`.`Madicine_Name`='" + jComboBox1.getSelectedItem() + "' GROUP BY `m_price`.`Madicine_Name`";
            rs = st.executeQuery(s);
            while (rs.next()) {
                tp = rs.getInt(2);
                //

            }
            int q = jComboBox2.getSelectedIndex();
            int tp2 = tp * q;
            jTextField10.setText("Total Price : " + tp2);
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked

    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jComboBox3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox3PopupMenuWillBecomeInvisible

    }//GEN-LAST:event_jComboBox3PopupMenuWillBecomeInvisible

    private void jComboBox3PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox3PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3PopupMenuWillBecomeVisible

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       jLabel22.setText("");
        if(jComboBox3.getSelectedIndex()==0){
       jTextField12.setText("");
          jTextField11.setText("");
        }contest();
        String s = "SELECT `madicine_info`.`Madicine_Price`,`madicine_info`.`Madicine_Id` FROM `madicine_info` WHERE `Madicine_Name`='" + jComboBox3.getSelectedItem() + "' GROUP BY `madicine_info`.`Madicine_Id`";
        try {
            st = ct.createStatement();
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField12.setText("" + rs.getInt(1));
                jTextField11.setText("" + rs.getInt(2));
             //   jTextField5.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox3KeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
       jTextField5.requestFocus();
      }
    }//GEN-LAST:event_jComboBox3KeyPressed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField9.requestFocus();
        jTextField9.setText("");
       jLabel59.setText("");
        jLabel60.setText("");
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField7.setText("");
        jTextField10.setText("");
        jLabel20.setText("");
        DefaultTableModel dt1 = (DefaultTableModel) jTable3.getModel();
        while (dt1.getRowCount() > 0) {
            for (int i = 0; i < dt1.getRowCount(); i++) {
                dt1.removeRow(i);
            }
        }
        show_Sell_Id_jtextfilde20();
        ft = 0;
    }//GEN-LAST:event_jButton5ActionPerformed
    public void print_J_2() {
        try {
            boolean m = jTable2.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jComboBox4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox4PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4PopupMenuWillBecomeInvisible

    private void jComboBox4PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox4PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4PopupMenuWillBecomeVisible

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox4KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
DefaultTableModel dt1 = (DefaultTableModel) jTable2.getModel();
        while (dt1.getRowCount() > 0) {
            for (int i = 0; i < dt1.getRowCount(); i++) {
                dt1.removeRow(i);
            }
        }
        jatble2_search();
      }
    }//GEN-LAST:event_jComboBox4KeyPressed

    private void jComboBox5PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox5PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5PopupMenuWillBecomeInvisible

    private void jComboBox5PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox5PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5PopupMenuWillBecomeVisible

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox5KeyPressed
        // TODO add your handling code here:
             if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             jatble5_search();
             
             }
    }//GEN-LAST:event_jComboBox5KeyPressed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
        jLabel22.setText("");
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
        jLabel22.setText("");
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        // jTextField14.setText("");
        jTextField16.setText("");
        //jTextField8.setText("");
        jTextField17.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField5.setText("");
        jTextField18.setText("");
       jLabel55.setText("");
       jLabel58.setVisible(false);
        DefaultTableModel dt4 = (DefaultTableModel) jTable4.getModel();
        while (dt4.getRowCount() > 0) {
            for (int i = 0; i < dt4.getRowCount(); i++) {
                dt4.removeRow(i);
            }
        }
        show_Pur_Id_seller();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed
    public void ok() {
        if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel29.setText("Date Is Empty");
            jDateChooser2.requestFocus();
        } else {
            jComboBox9.removeAllItems();
            String d = "---Select---";
            jComboBox9.addItem(d);
            try {
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser2.getDate());
                String select = "SELECT `Coustomer_Id` FROM `mdecine_sels_info` WHERE `Sel_Dte`='" + date + "' GROUP BY `Coustomer_Id`";
                contest();
                st = null;
                // DefaultTableModel dt=(DefaultTableModel) jTable6.getModel();
                // dt.setRowCount(0);
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while (rs.next()) {
                    jComboBox9.addItem(rs.getString(1));
                    //   JOptionPane.showMessageDialog(rootPane, rs.getInt(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextField15.setText("");
            jTextField21.setText("");
        }

    }

    public void Seller() {
        if (((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel36.setText("Date Is Empty");
            jDateChooser5.requestFocus();
        } else {
            jComboBox12.removeAllItems();
            String d = "---Select---";
            jComboBox12.addItem(d);
            try {
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser5.getDate());
                String select = "SELECT `Coustomer_Id` FROM `mdecine_sels_info` WHERE `Sel_Dte`='" + date + "' GROUP BY `Coustomer_Id`";
                contest();
                st = null;
                // DefaultTableModel dt=(DefaultTableModel) jTable6.getModel();
                // dt.setRowCount(0);
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while (rs.next()) {
                    jComboBox12.addItem(rs.getString(1));
                    //   JOptionPane.showMessageDialog(rootPane, rs.getInt(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextField27.setText("");
            jTextField28.setText("");
            //   jTextField36.setText("");
 jTextField34.setText("");
  jTextField35.setText("");
 jComboBox13.removeAllItems();
 String s="---Select---";
  jComboBox13.addItem(""+s);
        }  }

    public void ok2() {
        if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel37.setText("Date Is Empty");
            jDateChooser3.requestFocus();
        } else {
            jComboBox10.removeAllItems();
            String d = "---Select---";
            jComboBox10.addItem(d);
            try {
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser3.getDate());
                String select = "SELECT `Seller_Id` FROM `madecine_pur_info` WHERE `Pur_Date`='" + date + "' GROUP BY `Seller_Id`";
                contest();
                st = null;
                // DefaultTableModel dt=(DefaultTableModel) jTable6.getModel();
                // dt.setRowCount(0);
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while (rs.next()) {
                    jComboBox10.addItem(rs.getString(1));
                    //   JOptionPane.showMessageDialog(rootPane, rs.getInt(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextField22.setText("");
            // jTextField23.setText("");
        }

    }

    public void Cutommer() {
        
        jTextField25.setText("");
         jTextField29.setText("");
         jTextField31.setText("");
         jTextField32.setText("");
         // jTextField25.setText("");
        jComboBox11.removeAllItems();
          jComboBox14.removeAllItems();
          String s="---Select---";
           jComboBox11.addItem(s);
           jComboBox14.addItem(s);
            jLabel30.setText("");
        if (((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel30.setText("Date Is Empty");
            jDateChooser4.requestFocus();
        } else {
            jComboBox11.removeAllItems();
            String d = "---Select---";
            jComboBox11.addItem(d);
            try {
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser4.getDate());
                String select = "SELECT `Seller_Id` FROM `madecine_pur_info` WHERE `Pur_Date`='" + date + "' GROUP BY `Seller_Id`";
                contest();
                st = null;
                // DefaultTableModel dt=(DefaultTableModel) jTable6.getModel();
                // dt.setRowCount(0);
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while (rs.next()) {
                    jComboBox11.addItem(rs.getString(1));
                    //   JOptionPane.showMessageDialog(rootPane, rs.getInt(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // jTextField23.setText("");
        }

    }
    private void jComboBox9PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox9PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9PopupMenuWillBecomeInvisible

    private void jComboBox9PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox9PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9PopupMenuWillBecomeVisible

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:

        contest();
        try {
            st = ct.createStatement();
            String s = "SELECT `Coustomer_Name`,`Coutomer_Brith_Date` FROM `mdecine_sels_info` WHERE `Coustomer_Id`='" + jComboBox9.getSelectedItem() + "' GROUP BY `Coustomer_Id`";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField15.setText("" + rs.getString(1));
                jTextField21.setText("" + rs.getString(2));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9KeyPressed

    private void jComboBox10PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox10PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10PopupMenuWillBecomeInvisible

    private void jComboBox10PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox10PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10PopupMenuWillBecomeVisible

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
        contest();
        try {
            st = ct.createStatement();
            String s = "SELECT `Seller_Name` FROM `madecine_pur_info` WHERE `Seller_Id`='" + jComboBox10.getSelectedItem() + "' GROUP BY `Seller_Id`";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField22.setText("" + rs.getString(1));
                // jTextField23.setText(""+rs.getString(2));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10KeyPressed
    public void Update_Madecine() {
        ps = null;
        if (jTextField23.getText().isEmpty()) {
            jLabel5.setText("'Please Selecte Madecine'");
            jTextField23.requestFocus();
        } else if (jTextField24.getText().isEmpty()) {
            jLabel5.setText("'Please Selecte The Madecine Name'");
            jTextField24.requestFocus();
        }else if (jTextField38.getText().isEmpty()) {
            jLabel5.setText("'Madecine Price Is Empty'");
            jTextField23.requestFocus();
        }else if (jTextField36.getText().isEmpty()) {
            jLabel5.setText("'Madecine Details Is Empty'");
            jTextField23.requestFocus();
        } else { int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Change The Madecine...???", "Change Madecine", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
            contest();
            String test = "UPDATE `madicine_info`SET `Madicine_Price`='" + jTextField38.getText() + "',`Madicine_Detailse`='" + jTextField26.getText() + "',`Date`='" + jLabel8.getText() + "' WHERE `Madicine_Id`='" + jTextField23.getText() + "' ";
            try {
                ps = ct.prepareCall(test);
                ps.execute();
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                while (dt.getRowCount() > 0) {
                    for (int i = 0; i < dt.getRowCount(); i++) {
                        dt.removeRow(i);
                    }
                }
                contest();
                // jtable1_Patient_Test_view();
                jLabel5.setText("''The Madeine Update Was Successful...''");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField23.setText("");
                jTextField24.setText("");
                jTextField4.setText("");
                   jTextField38.setText("");
                      jTextField26.setText("");
                     //// jTextField38.requestFocus();
                jtable1_Madecine_view();
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }}

        }
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        Seller();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jComboBox11PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox11PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11PopupMenuWillBecomeInvisible

    private void jComboBox11PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox11PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11PopupMenuWillBecomeVisible

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
      jComboBox14.removeAllItems();
      String ss="---Select---";
      jComboBox14.addItem(ss);
        contest();
        try {
            st = ct.createStatement();
            String s = "SELECT `Seller_Name`,`Madicine_Name` FROM `madecine_pur_info` WHERE `Seller_Id`='" + jComboBox11.getSelectedItem() + "' GROUP BY `Madicine_Name`";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField25.setText("" + rs.getString(1));
                jComboBox14.addItem(rs.getString(2));
                // jTextField23.setText(""+rs.getString(2));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox11KeyPressed
        // TODO add your handling code here:
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           jComboBox14.requestFocus();
           
           }
    }//GEN-LAST:event_jComboBox11KeyPressed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        if (((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel30.setText("Date Is Empty");
            jDateChooser4.requestFocus();
        } else if (jComboBox11.getSelectedIndex() <= 0) {
            jLabel30.setText("Id Is Empty");
            jComboBox11.requestFocus();
        } else {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser4.getDate());
            contest();
            DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
            dt.setRowCount(0);
            String select = "SELECT `Seller_Id`,`Seller_Name`,`Madicine_Name`,`Pur_Quantity`,`Pur_Price`,SUM(`Pur_Quantity`*`Pur_Price`)AS `Total`,`Pur_Date` FROM `madecine_pur_info` WHERE `Seller_Id` ='" + jComboBox11.getSelectedItem() + "'GROUP BY `Pur_ID`";

            try {
                ps = ct.prepareCall(select);
                rs = ps.executeQuery();
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton33ActionPerformed
/*void madecine_insert_for_return(){
        if(jTextField1.getText().isEmpty()){
        jLabel5.setText(" Please Enter Amount Of TK ");
        jTextField1.requestFocus();
        }
        else{
         contest();
         Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            ps = null;
String D = "INSERT `account` (`Ammount`,`Date`)VALUES(?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField1.getText());
                 ps.setString(2,df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel5.setText("TK Add Success...");
                    jlabel6_Total();
                            jTextField1.setText("");
                    jTextField1.requestFocus();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}*/
   public int show_id() {
        contest();
        ps = null;// cleardata();
        String select = "SELECT `id` FROM `pur_returnid`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                 idd = rs.getInt(1);
            }
            idd =  idd + 1;
            jTextField33.setText("" +  idd);
            jComboBox11.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  idd;
    }
    public int show_id_sell() {
        contest();
        ps = null;// cleardata();
        String select = "select `Id` from `sell_return`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                 idsell = rs.getInt(1);
            }
           idsell =  idsell + 1;
            jTextField36.setText("" +  idsell);
            jComboBox12.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  idsell;
    }
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
       //return
       purchase_Return();
    //   jatble2stock();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        Cutommer();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        if (((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel30.setText("Date Is Empty");
        } else {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser4.getDate());
            contest();
            DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
            dt.setRowCount(0);
            String select = "SELECT `Seller_Id`,`Seller_Name`,`Madicine_Name`,`Pur_Quantity`,`Pur_Price`,SUM(`Pur_Quantity`*`Pur_Price`)AS `Total`,`Pur_Date` FROM `madecine_pur_info`WHERE `Pur_Date`='" + date + "'GROUP BY `Pur_ID`";

            try {
                ps = ct.prepareCall(select);
                rs = ps.executeQuery();
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jComboBox12PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox12PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12PopupMenuWillBecomeInvisible

    private void jComboBox12PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox12PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12PopupMenuWillBecomeVisible

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
       jComboBox13.removeAllItems();
       String d="---Select---";
        jComboBox13.addItem(d);
        contest();
        try {
            st = ct.createStatement();
            String s = "SELECT `Coustomer_Name`,`Coutomer_Brith_Date`,`Madicine_Nmae` FROM `mdecine_sels_info` WHERE `Coustomer_Id`='" + jComboBox12.getSelectedItem() + "' GROUP BY `Madicine_Nmae`";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField27.setText("" + rs.getString(1));
                jTextField28.setText("" + rs.getString(2));
                jComboBox13.addItem(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jComboBox12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox12KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox12KeyPressed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable9.getModel();
        dt.setRowCount(0);
        String select = "SELECT `Coustomer_Id`,`Coustomer_Name`,`Madicine_Nmae`,`Sel_Quantity`,`Price`,`Sel_Dte` FROM `mdecine_sels_info`";

        try {

            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getDate(6)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        if (((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText().isEmpty()) {
           jLabel36.setText("Date Is Empty");
        } else {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser5.getDate());
            contest();
            DefaultTableModel dt = (DefaultTableModel) jTable9.getModel();
            dt.setRowCount(0);
            String select = "SELECT `Coustomer_Id`,`Coustomer_Name`,`Madicine_Nmae`,`Sel_Quantity`,`Price`,`Sel_Dte` FROM `mdecine_sels_info` WHERE `Sel_Dte`='" + date + "'";

            try {
                ps = ct.prepareCall(select);
                rs = ps.executeQuery();
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getDate(6)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        if (((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel36.setText("Date Is Empty");
            jDateChooser5.requestFocus();
        } else if (jComboBox12.getSelectedIndex() <= 0) {
            jLabel36.setText("Id Is Empty");
            jComboBox12.requestFocus();
        } else {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser5.getDate());
            contest();
            DefaultTableModel dt = (DefaultTableModel) jTable9.getModel();
            dt.setRowCount(0);
            String select = "SELECT `Coustomer_Id`,`Coustomer_Name`,`Madicine_Nmae`,`Sel_Quantity`,`Price`,`Sel_Dte` FROM `mdecine_sels_info` WHERE `Coustomer_Id`='" + jComboBox12.getSelectedItem() + "'";

            try {
                ps = ct.prepareCall(select);
                rs = ps.executeQuery();
                while (rs.next()) {
                     dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getDate(6)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
Sells_Return();


    }//GEN-LAST:event_jButton44ActionPerformed
void Sells_Return(){
if(jTextField36.getText().isEmpty()){
jLabel36.setText("'Id Is Empty'");
jTextField36.requestFocus();
}
else if(jComboBox12.getSelectedIndex()<=0){
jLabel36.setText("'Coustommer Id Is Empty'");
jComboBox12.requestFocus();
}else if(jComboBox13.getSelectedIndex()<=0){
jLabel36.setText("'Madecine Name Is Empty'");
jComboBox13.requestFocus();
}else if(jTextField35.getText().isEmpty()){
jLabel36.setText("'Return Quantity Is Empty'");
jTextField35.requestFocus();
}
else{
stock30=Integer.parseInt(jTextField30.getText());
 stock34=Integer.parseInt(jTextField34.getText());
stock35=Integer.parseInt(jTextField35.getText());
if(stock34<stock35){
jLabel36.setText("Madecine Stock Quantity Is Large");
jTextField35.requestFocus();
}else if(stock30<stock35){
jLabel36.setText("Madecine Sells Quantity Is Large");
jTextField35.requestFocus();
} 
else{int p1=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Return The Seals Madecines...???", "Seals Madecine's Return", JOptionPane.YES_NO_OPTION);
        if(p1==0){ 
  selprice_insert();
update();
  // pur_insert();
    jatble2stock();
   clear();
}
}}
}
void update(){
    s2=0;
    s2_price=0;
    s1_price=0;
 stock30=Integer.parseInt(jTextField30.getText());
 stock34=Integer.parseInt(jTextField34.getText());
stock35=Integer.parseInt(jTextField35.getText());
Sell_Up_qun=stock30-stock35;
try {
         String p="SELECT `Madicine_Price` FROM `madicine_info` WHERE `Madicine_Name`='"+jComboBox13.getSelectedItem()+"' ";
            ps=ct.prepareCall(p);
            rs=ps.executeQuery();
            if(rs.next()){
                s2=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
//s2= s2_price/ s1_price;
s3=s2*Sell_Up_qun;
String up="UPDATE `mdecine_sels_info` SET `Sel_Quantity`='"+Sell_Up_qun+"',`Price`='"+s3+"' WHERE `Coustomer_Id`='"+jComboBox12.getSelectedItem()+"'AND `Madicine_Nmae`='"+jComboBox13.getSelectedItem()+"'";
        try {
            ps = ct.prepareCall(up);
                     ps.execute(); 
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
       


}
void selprice_insert(){
      s2=0;
    s2_price=0;
    s1_price=0;  
   try {
            String p="SELECT `Madicine_Price` FROM `madicine_info` WHERE `Madicine_Name`='"+jComboBox13.getSelectedItem()+"' ";
            ps=ct.prepareCall(p);
            rs=ps.executeQuery();
            if(rs.next()){
                s2=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
//s2= s2_price/ s1_price;
s3=s2*Sell_Up_qun;
ps=null;
String insert="INSERT INTO `sell_return` (`Id`,`S_Id`,`S_Name`,`Madecine_Name`,`Quantity`,`Price`,`Date`) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = ct.prepareCall(insert);
       ps.setString(1, jTextField36.getText());
   ps.setString(2, jComboBox12.getSelectedItem().toString());
          ps.setString(3, jTextField27.getText());
          ps.setString(4, jComboBox13.getSelectedItem().toString());
           ps.setString(5, jTextField35.getText());
            ps.setString(6, ""+s2);
       ps.setString(7,jLabel8.getText());
           int m = ps.executeUpdate();
                if (m > 0) {
           jLabel36.setText("''Seals Madecine Return Successful''");
                 show_id_sell();
                }
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }

}
/*void pur_insert(){
        s2=0;
    s2_price=0;
    s1_price=0;
 stock30=Integer.parseInt(jTextField30.getText());
 stock34=Integer.parseInt(jTextField34.getText());
stock35=Integer.parseInt(jTextField35.getText());
Sell_Up_qun=stock30-stock35;
//JOptionPane.showMessageDialog(rootPane, Sell_Up_qun);
try {
            String p="SELECT `Madicine_Price` FROM `madicine_info` WHERE `Madicine_Name`='"+jComboBox13.getSelectedItem()+"' ";
            ps=ct.prepareCall(p);
            rs=ps.executeQuery();
            if(rs.next()){
                s2=rs.getInt(1);}
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
//s2= s2_price/ s1_price;
//s3=s2*Sell_Up_qun;
s3=s2*stock35;
try {
            String qun = null;
            String pri = null;
            contest();
            String select = "SELECT `p_c_total`.`totaltk` FROM `p_c_total`";
            
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            if (rs.next()) {
                  if (s3 > rs.getInt(1)) {
                   jLabel36.setText("Sorry Your Account Does Not Have :" + s3 + " TK");
                }
 else if (s2 <= rs.getInt(1)) {
     String idm="SELECT `Madicine_Id` FROM `madicine_info` WHERE `Madicine_Name`='"+jComboBox13.getSelectedItem()+"'";
     ps=null;
     ps=ct.prepareCall(idm);
     rs=null;
     rs=ps.executeQuery();
     if(rs.next()){
      midd=rs.getInt(1);
     }
                ps = null;
String D = "INSERT INTO `madecine_pur_info`(`Pur_ID`,`Seller_Id`,`Seller_Name`,`Seller_Number`,`Madicine_Id`,`Madicine_Name`,`Pur_Quantity`,`Pur_Price`,`Total_Price`,`Pur_Date`) VALUES (?,?,?,?,?,?,?,?,?,?)";
         
 ps = ct.prepareCall(D);
   ps.setString(1, jTextField8.getText());
        ps.setString(2, jTextField14.getText());
   ps.setString(3, jTextField27.getText());
   ps.setString(4, jTextField37.getText());
   ps.setString(5, ""+midd);
 ps.setString(6, jComboBox13.getSelectedItem().toString());
 ps.setString(7, jTextField35.getText());
ps.setString(8, ""+s2);
 ps.setString(9,""+s3);
ps.setString(10, jLabel8.getText());
int m = ps.executeUpdate();
 if (m > 0) {
     jLabel36.setText("Return");
  show_Pur_Id();
 }  }}   
} catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
}*/
    private void jComboBox13PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox13PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox13PopupMenuWillBecomeInvisible

    private void jComboBox13PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox13PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox13PopupMenuWillBecomeVisible
void clear(){

jTextField28.setText("");
jTextField27.setText("");
jTextField34.setText("");
jTextField30.setText("");
jTextField35.setText("");
//sjTextField37.setText("");
jComboBox12.removeAllItems();
jComboBox13.removeAllItems();
String s="---Select---";
jComboBox12.addItem(s);
jComboBox13.addItem(s);
}
    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        // TODO add your handling code here:
               contest();
        try {
            st = ct.createStatement();
            String s = "SELECT `Sel_Quantity` FROM `mdecine_sels_info` WHERE `Madicine_Nmae`='" + jComboBox13.getSelectedItem() + "'AND `Coustomer_Id`='"+jComboBox12.getSelectedItem()+"' GROUP BY `Madicine_Nmae`";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField30.setText("" + rs.getString(1));    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
        Stock_Madecine_sell() ;
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox13KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox13KeyPressed

    private void jComboBox14PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox14PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14PopupMenuWillBecomeInvisible

    private void jComboBox14PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox14PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14PopupMenuWillBecomeVisible
void purchase(){
contest();
        try {
            st = ct.createStatement();
           // String s = "SELECT `Pur_Quantity` FROM `madecine_pur_info` WHERE `Madicine_Name`='" + jComboBox14.getSelectedItem() + "' GROUP BY `Seller_Id`";
            String s="SELECT SUM(`Pur_Quantity`)AS`Pur_Quantity` FROM `madecine_pur_info` WHERE `Madicine_Name`='"+jComboBox14.getSelectedItem()+"'AND `Seller_Id`='"+jComboBox11.getSelectedItem()+"'  GROUP BY `Seller_Id`";
            rs = st.executeQuery(s);
            while (rs.next()) {
                jTextField31.setText("" + rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void purchase_Return(){
    if (((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel30.setText("'Date Is Empty'");
            jDateChooser4.requestFocus();
        } else if (jComboBox11.getSelectedIndex() <= 0) {
            jLabel30.setText("'Id Is Empty'");
            jComboBox11.requestFocus();
        }
        else if (jComboBox14.getSelectedIndex() <= 0) {
            jLabel30.setText("'Madecine Name Is Empty'");
            jComboBox14.requestFocus();
        } else if(jTextField32.getText().isEmpty()){
          jLabel30.setText("'Madecine Quantity Is Empty'");
            jTextField32.requestFocus();
         //   jTextField32.requestFocus();
        }else { int p1=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Return The Parchase Madecine...???", "Parchase Madecine Return", JOptionPane.YES_NO_OPTION);
        if(p1==0){ 
            int j=Integer.parseInt(jTextField29.getText());
             int j2=Integer.parseInt(jTextField31.getText()); 
             int j23=Integer.parseInt(jTextField32.getText()); 
             if(j<j23){
               jLabel30.setText("Large Than Quantity Of The Madecine Stock ");
               jTextField32.requestFocus();
             }else if(j2<j23){
               jLabel30.setText("Large Than Quantity Of The Madecine Purchase");
               jTextField32.requestFocus();
             }else{ps=null;
                 String select="SELECT `Pur_Price` FROM `madecine_pur_info`WHERE `Madicine_Name`='"+jComboBox14.getSelectedItem()+"' GROUP BY `Madicine_Id`";
                try {
                    ps=ct.prepareCall(select);
                    rs=ps.executeQuery();
                    while(rs.next()){
                    pur_price=rs.getInt(1);   
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
                 contest();
        try {
           int h=Integer.parseInt(jTextField32.getText());
            tp=pur_price*h;
             int h2=Integer.parseInt(jTextField31.getText());
             int h3=h2-h;
             int p=pur_price*h3;
              ps=null;
            String s = "UPDATE `madecine_pur_info` SET `Pur_Quantity`='"+h3+"',`Total_Price`='"+p+"' WHERE `Seller_Id`='"+jComboBox11.getSelectedItem()+"' AND `Madicine_Name`='"+jComboBox14.getSelectedItem()+"'";
            ps = ct.prepareCall(s);
                ps.execute();
                 jatble2stock();
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
        ops=null;
        String insert="INSERT INTO `pur_returnid`(`id`,`P_Id`,`Name`,`Madecine_Name`,`Quantity`,`Price`,`Date`)VALUES(?,?,?,?,?,?,?)";
                try {   Date dte = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    ops = ct.prepareCall(insert);
                   ops.setString(1, jTextField33.getText());
                ops.setString(2, jComboBox11.getSelectedItem().toString());
                ops.setString(3, jTextField25.getText());
                ops.setString(4,jComboBox14.getSelectedItem().toString());
       ops.setString(5, jTextField32.getText());
        ops.setString(6,""+tp);
        //JOptionPane.showMessageDialog(rootPane, ""+tp);
                ops.setString(7, df.format(dte));
                int m = ops.executeUpdate();
                if (m > 0) {
                show_id();
               jLabel30.setText("Return Successful");
                }
                } catch (SQLException ex) {
                    Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
                }
        
         
       jTextField25.setText("");
         jTextField29.setText("");
         jTextField31.setText("");
         jTextField32.setText("");
         // jTextField25.setText("");
        jComboBox11.setSelectedIndex(0);
          jComboBox14.setSelectedIndex(0);
          
        }}}
}

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
         /**/purchase();
         Stock_Madecine();
         
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jComboBox14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox14KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    jTextField32.requestFocus();
           
           }
    }//GEN-LAST:event_jComboBox14KeyPressed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Reception_1st rc1=new Reception_1st();
        rc1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isLetter(c)|| c==KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isLetter(c)|| c==KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jTextField17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField17KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c==KeyEvent.VK_SPACE|| c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField32KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField32KeyTyped

    private void jTextField35KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField35KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField35KeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          //jTextField4.requestFocus();
           contest();
        int j = 0;
        try {
            st = ct.createStatement();
            String i = "SELECT `Madicine_Name` FROM `madicine_info`";
            rs = st.executeQuery(i);
            while (rs.next()) {
                //   jComboBox1.addItem(rs.getString(1));
                if (rs.getString(1).equals(jTextField1.getText())) {
                    j = 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (jTextField6.getText().isEmpty()) {
            jLabel5.setText("'Please Enter The Madicine Id'");
        } else if (jTextField1.getText().isEmpty()) {
            jLabel5.setText("'Please Enter The Madicine Name'");
        } else if (jTextField2.getText().isEmpty()) {
            jLabel5.setText("'Please Enter The Madecine Price'");
        } else if (jTextField4.getText().isEmpty()) {
            jLabel5.setText("'Please Enter The Test Detailse'");
        } else if (j == 1) {
            jLabel5.setText("Duplicate Input");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField1.requestFocus();

        } else {
             int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add Madecine...???", "Add Madecine", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
            Date dte = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            // ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dte));

            contest();
            ps = null;
            String D = "INSERT `madicine_info` (`Madicine_Id`,`Madicine_Name`,`Madicine_Price`,`Madicine_Detailse`,`Date`)VALUES(?,?,?,?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField6.getText());
                ps.setString(2, jTextField1.getText());
                ps.setString(3, jTextField2.getText());
                ps.setString(4, jTextField4.getText());
                ps.setString(5, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel5.setText("'Madecine Add Has Been Success''");
                    show_test();
                    jTextField1.requestFocus();

                    jTextField4.setText("");
                    jTextField2.setText("");
                    jTextField1.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);
            }
        }}
        jtable1_Madecine_view();
        jComboBox3.removeAllItems();
        String h = "---Select---";
        jComboBox3.addItem(h);
        jcombbx3_Show_Madecine_Name();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField26KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
              Update_Madecine();
        }
    }//GEN-LAST:event_jTextField26KeyPressed

    private void jTextField38KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField38KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField26.requestFocus();
        }
    }//GEN-LAST:event_jTextField38KeyPressed

    private void jTextField38KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField38KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField38KeyTyped

    private void jTextField16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           jTextField17.requestFocus();
        }
    }//GEN-LAST:event_jTextField16KeyPressed

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
        // TODO add your handling code here:
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         jComboBox3.requestFocus();
        } 
    }//GEN-LAST:event_jTextField17KeyPressed

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           jTextField17.requestFocus();
        }
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         if (jComboBox3.getSelectedIndex() <= 0) {
            jLabel22.setText("Madecine Name Is Empty ");
            jComboBox3.requestFocus();
        }
        if (jTextField5.getText().isEmpty()) {
            jLabel22.setText("Madecine Quantity Is Empty ");
            jTextField5.requestFocus();
        } else {
            int jj = Integer.parseInt(jTextField5.getText());
            int jj2 = Integer.parseInt(jTextField12.getText());
            int jj3 = jj * jj2;
            jTextField18.setText("" + jj3);
              jTextField18.requestFocus();
        }}
         
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
     
         if (jComboBox3.getSelectedIndex() <= 0) {
            jLabel22.setText("Madecine Name Is Empty ");
            jComboBox3.requestFocus();
        }
         else if (jTextField5.getText().isEmpty()) {
            jLabel22.setText("Madecine Quantity Is Empty ");
            jTextField5.requestFocus();
        } else {
            int jj = Integer.parseInt(jTextField5.getText());
            int jj2 = Integer.parseInt(jTextField12.getText());
            int jj3 = jj * jj2;
            jTextField18.setText("" + jj3);
            jTextField18.requestFocus();
        }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
     jDateChooser1.requestFocus();
      }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jDateChooser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
     jComboBox1.requestFocus();
      }
    }//GEN-LAST:event_jDateChooser1KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
  jComboBox2.requestFocus();
      }
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
  contest();
        int dd = 0;
        if (jTextField3.getText().isEmpty()) {
            jLabel20.setText("'Please Enter sell NO'");
            jTextField3.requestFocus();
        } else if (jTextField20.getText().isEmpty()) {
            jLabel20.setText("'Please Enter Customer ID'");
            jTextField20.requestFocus();

        } else if (jTextField9.getText().isEmpty()) {
            jLabel20.setText("'Please Enter Customer Name'");
            jTextField9.requestFocus();
        } else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel20.setText("'Please Enter Customer BirthDay'");
            //jTextField3.requestFocus();
        } else if (jComboBox1.getSelectedIndex() <= 0) {
            jLabel20.setText("'Please Select Madecine Name'");
            jComboBox1.requestFocus();
        } else if (jComboBox2.getSelectedIndex() <= 0) {
            jLabel20.setText("'Please Select Madecine Quantity'");
            jComboBox2.requestFocus();
        } else {
            int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Seals The Madecine...???", "Seals Madecine", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser1.getDate());
            Date dte = new Date();
// ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dte));

            contest();
            ps = null;
            try {
                int tp = 0;
                st = ct.createStatement();
                String s1 = "SELECT `m_price`.`Madicine_Name`,SUM(`m_price`.`Pur_Price`+'10%')AS `S_Price` FROM  `m_price` WHERE `m_price`.`Madicine_Name`='" + jComboBox1.getSelectedItem() + "' GROUP BY `m_price`.`Madicine_Name`";
                rs = st.executeQuery(s1);
                while (rs.next()) {
                    tp = rs.getInt(2);
                }
                int q = jComboBox2.getSelectedIndex();
                tp2 = tp * q;
                String s = "INSERT INTO `mdecine_sels_info`(`Sel_Id`,`Coustomer_Id`,`Coustomer_Name`,`Coutomer_Brith_Date`,`Madicine_Nmae`,`Sel_Quantity`,`Price`,`Sel_Dte`) VALUES (?,?,?,?,?,?,?,?)";
                ps = ct.prepareCall(s);
                ps.setString(1, jTextField3.getText());
                ps.setString(2, jTextField20.getText());
                ps.setString(3, jTextField9.getText());
                ps.setString(4, date);
                ps.setString(5, (String) jComboBox1.getSelectedItem());
                ps.setString(6, (String) jComboBox2.getSelectedItem());
                ps.setString(7, "" + tp2);
                ps.setString(8, sd.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {

                    String pr = "SELECT `m_price`.`Madicine_Name`,SUM(`m_price`.`Pur_Price`+'10%')AS `S_Price` FROM  `m_price` WHERE `m_price`.`Madicine_Name`='" + jComboBox1.getSelectedItem() + "' GROUP BY `m_price`.`Madicine_Name`";
                    rs = st.executeQuery(pr);
                    while (rs.next()) {
                        dd = rs.getInt(2);
                    }
                    ft = tp2 + ft;
                    st = ct.createStatement();
                    DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
                    dt.addRow(new Object[]{jTextField9.getText(), date, jComboBox1.getSelectedItem(), dd, jComboBox2.getSelectedItem(), tp2, jLabel8.getText()});

                     jLabel60.setText("Total TK :");
                 jLabel59.setText("" + ft);
                    tps = null;
                    String ft1 = "INSERT INTO `ft_sell_price` (`tk`)VALUE (?)";
                    tps = ct.prepareCall(ft1);
                    tps.setString(1, "" + ft);
                    tps.executeUpdate();
                    DefaultTableModel dt1 = (DefaultTableModel) jTable2.getModel();
                    while (dt1.getRowCount() > 0) {
                        for (int i = 0; i < dt1.getRowCount(); i++) {
                            dt1.removeRow(i);
                        }
                    }
                    jatble2stock();
                    jLabel20.setText("''Madecine Sales Have Been Successful''");
                    show_Sell_Id_jtextfilde3();
                    jTextField1.requestFocus();
                    // jTextField9.setText("");
                    //((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
                    jComboBox1.setSelectedIndex(0);
                    jComboBox2.setSelectedIndex(0);
                    jTextField7.setText("");
                    jTextField10.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
      }
    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jDateChooser3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser3KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
                 ok2();
             }
    }//GEN-LAST:event_jDateChooser3KeyPressed

    private void jComboBox10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox10MousePressed
           ok2();
    }//GEN-LAST:event_jComboBox10MousePressed

    private void jComboBox10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox10MouseDragged
     
    }//GEN-LAST:event_jComboBox10MouseDragged

    private void jComboBox10MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jComboBox10MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10MouseWheelMoved

    private void jComboBox10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox10MouseClicked
     
    }//GEN-LAST:event_jComboBox10MouseClicked

    private void jComboBox10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox10MouseEntered
     
    }//GEN-LAST:event_jComboBox10MouseEntered

    private void jComboBox10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox10MouseReleased
        
    }//GEN-LAST:event_jComboBox10MouseReleased

    private void jComboBox9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox9MousePressed
        // TODO add your handling code here:
              ok();
    }//GEN-LAST:event_jComboBox9MousePressed

    private void jComboBox11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox11MouseClicked
        // TODO add your handling code here:
        Cutommer();
    }//GEN-LAST:event_jComboBox11MouseClicked

    private void jTextField32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField32KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
       purchase_Return();
           }
    }//GEN-LAST:event_jTextField32KeyPressed

    private void jComboBox12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox12MousePressed
        // TODO add your handling code here:
         Seller();
    }//GEN-LAST:event_jComboBox12MousePressed

    private void jComboBox12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12MouseClicked

    private void jTextField35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField35KeyPressed
        // TODO add your handling code here:
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
     Sells_Return();

           }
    }//GEN-LAST:event_jTextField35KeyPressed

    private void jTextField5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseExited
        // TODO add your handling code here:
            if (jComboBox3.getSelectedIndex() <= 0) {
            jLabel22.setText("Madecine Name Is Empty ");
            jComboBox3.requestFocus();
        }
         else if (jTextField5.getText().isEmpty()) {
            jLabel22.setText("Madecine Quantity Is Empty ");
            jTextField5.requestFocus();
        } else {
            int jj = Integer.parseInt(jTextField5.getText());
            int jj2 = Integer.parseInt(jTextField12.getText());
            int jj3 = jj * jj2;
            jTextField18.setText("" + jj3);
            //jTextField18.requestFocus();
        }
    }//GEN-LAST:event_jTextField5MouseExited

    private void jTextField5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField5MouseReleased

    private void jTextField5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseEntered

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable1.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
      Print_pur_Madecine p=new Print_pur_Madecine(Madecine());
   p.setVisible(true);
    }//GEN-LAST:event_jLabel69MouseClicked
public int Madecine(){
int n=0;
int p = 0;

 try {
            String i="SELECT `Seller_Id` FROM `madecine_pur_info` WHERE `Seller_Id`='"+jTextField14.getText()+"'";
            contest();
            ps = null;
            ps = ct.prepareCall(i);
            rs = ps.executeQuery();
            while (rs.next()) {
             p=Integer.parseInt(jTextField14.getText().toString());
            }
          
 //    jTextField37.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
return p;}
    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        Print_Sell_Madecine1 p=new Print_Sell_Madecine1(MadecineSell());
        p.setVisible(true);
    }//GEN-LAST:event_jLabel70MouseClicked
public int MadecineSell(){
int n=0;
int p = 0;

 try {
            String i="SELECT `Coustomer_Id`FROM `mdecine_sels_info` WHERE `Coustomer_Id`='"+jTextField20.getText()+"'";
            contest();
            ps = null;
            ps = ct.prepareCall(i);
            rs = ps.executeQuery();
            while (rs.next()) {
             p=Integer.parseInt(jTextField20.getText().toString());
            }
          
 //    jTextField37.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
return p;}
    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable2.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable5.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable6.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable7.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel75MouseClicked

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
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
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
 contest();
        int j = 0;
        try {
            st = ct.createStatement();
            String i = "SELECT `Madicine_Name` FROM `madicine_info`";
            rs = st.executeQuery(i);
            while (rs.next()) {
                //   jComboBox1.addItem(rs.getString(1));
                if (rs.getString(1).equals(jTextField1.getText())) {
                    j = 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (jTextField6.getText().isEmpty()) {
            jLabel5.setText("'Please Enter The Madicine Id'");
        } else if (jTextField1.getText().isEmpty()) {
            jLabel5.setText("'Please Enter The Madicine Name'");
        } else if (jTextField2.getText().isEmpty()) {
            jLabel5.setText("'Please Enter The Madecine Price'");
        } else if (jTextField4.getText().isEmpty()) {
            jLabel5.setText("'Please Enter The Test Detailse'");
        } else if (j == 1) {
            jLabel5.setText("Duplicate Input");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField1.requestFocus();

        } else {
             int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add Madecine...???", "Add Madecine", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
            Date dte = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            // ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dte));

            contest();
            ps = null;
            String D = "INSERT `madicine_info` (`Madicine_Id`,`Madicine_Name`,`Madicine_Price`,`Madicine_Detailse`,`Date`)VALUES(?,?,?,?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField6.getText());
                ps.setString(2, jTextField1.getText());
                ps.setString(3, jTextField2.getText());
                ps.setString(4, jTextField4.getText());
                ps.setString(5, df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel5.setText("'Madecine Added Was Successful''");
                    show_test();
                    jTextField1.requestFocus();

                    jTextField4.setText("");
                    jTextField2.setText("");
                    jTextField1.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        while (dt.getRowCount() > 0) {
            for (int i = 0; i < dt.getRowCount(); i++) {
                dt.removeRow(i);
            }
        }}
        jtable1_Madecine_view();
        jComboBox3.removeAllItems();
        String h = "---Select---";
        jComboBox3.addItem(h);
        jcombbx3_Show_Madecine_Name();
    }//GEN-LAST:event_jLabel62MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        // TODO add your handling code here:
          Update_Madecine();
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        // TODO add your handling code here:
          String qun = null;
        String pri = null;
        if (jTextField16.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Seller Name'");
            jTextField16.requestFocus();
        } else if (jTextField17.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Seller Number'");
            jTextField17.requestFocus();
        } else if (jComboBox3.getSelectedIndex() <= 0) {
            jLabel22.setText("'Please Select Madecine Name'");
        } else if (jTextField5.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Madicine Quantity'");
            jTextField5.requestFocus();
        } else if (jTextField12.getText().isEmpty()) {
            jLabel22.setText("'Please Enter The Madecine Price'");
            jTextField12.requestFocus();
        } else {
int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Purchase The Madecine...???", "Purchase Madecine", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
            Account a=new Account();
               qun = jTextField5.getText();
                    pri = jTextField12.getText();
                    int pri1 = Integer.parseInt(pri);
                    int qun1 = Integer.parseInt(qun);
                    int tt1 = pri1 * qun1;

                    if (tt1 >  a.jlabel6_Total()) {
                        jLabel22.setText("Sorry Your Account Does Not Have :" + tt1 + " TK");
                    } else if (tt1 <=  a.jlabel6_Total()) {

                       ps = null;
                        String D = "INSERT INTO `madecine_pur_info`(`Pur_ID`,`Seller_Id`,`Seller_Name`,`Seller_Number`,`Madicine_Id`,`Madicine_Name`,`Pur_Quantity`,`Pur_Price`,`Total_Price`,`Pur_Date`) VALUES (?,?,?,?,?,?,?,?,?,?)";
                        try {
                            int jj = Integer.parseInt(jTextField5.getText());
                            int jj2 = Integer.parseInt(jTextField12.getText());
                            int jj3 = jj * jj2;
                            tk = jj3 + tk;
                            jTextField18.setText("" + jj3);
                            jLabel58.setVisible(true);
                            jLabel55.setText("" + tk);
                            // DefaultTableModel dt=(DefaultTableModel) jTable4.getModel();
                            ps = ct.prepareCall(D);
                            ps.setString(1, jTextField8.getText());
                            ps.setString(2, jTextField14.getText());
                            ps.setString(3, jTextField16.getText());
                            ps.setString(4, jTextField17.getText());
  ps.setString(5, jTextField11.getText());
                            ps.setString(6, jComboBox3.getSelectedItem().toString());
                            ps.setString(7, jTextField5.getText());
                            ps.setString(8, jTextField12.getText());
                            ps.setString(9, jTextField18.getText());
                            ps.setString(10, jLabel8.getText());
                            int m = ps.executeUpdate();
                            if (m > 0) {
                                /* DefaultTableModel dt4 = (DefaultTableModel) jTable4.getModel();
        while (dt4.getRowCount() > 0) {
            for (int i = 0; i < dt4.getRowCount(); i++) {
                dt4.removeRow(i);}}   */
                                jtable4Pur2();
                
                                /// show_test();
                                DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
                                while (dt.getRowCount() > 0) {
                                    for (int i = 0; i < dt.getRowCount(); i++) {
                                        dt.removeRow(i);
                                    }
                                }
                                jatble2stock();
                                String se1 = "---Select---";
                                jComboBox1.removeAllItems();
                                jComboBox1.addItem(se1);
                                View_jComboBox1_Id_Search();

                                jTextField11.setText("");
                                jTextField18.setText("");
                                jTextField5.setText("");
                                // jTextField16.setText("");
                                // jTextField17.setText("");
                                jTextField12.setText("");
                                String se = "---Select---";
                                jComboBox3.removeAllItems();
                                jComboBox3.addItem(se);
                                jcombbx3_Show_Madecine_Name();
                        show_Pur_Id();
                         jLabel22.setText("''The Purchase Of Madecine Has Been Successful''");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
              
            
         }
        
        }
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        // TODO add your handling code here:
         jTextField1.setText("");
        jTextField2.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField4.setText("");

    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        // TODO add your handling code here:
        //Selll
          contest();
        int dd = 0;
        if (jTextField3.getText().isEmpty()) {
            jLabel20.setText("'Please Enter sell NO'");
            jTextField3.requestFocus();
        } else if (jTextField20.getText().isEmpty()) {
            jLabel20.setText("'Please Enter Customer ID'");
            jTextField20.requestFocus();

        } else if (jTextField9.getText().isEmpty()) {
            jLabel20.setText("'Please Enter Customer Name'");
            jTextField9.requestFocus();
        } else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel20.setText("'Please Enter Customer BirthDay'");
            //jTextField3.requestFocus();
        } else if (jComboBox1.getSelectedIndex() <= 0) {
            jLabel20.setText("'Please Select Madecine Name'");
            jComboBox1.requestFocus();
        } else if (jComboBox2.getSelectedIndex() <= 0) {
            jLabel20.setText("'Please Select Madecine Quantity'");
            jComboBox2.requestFocus();
        } else {
            int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Seals The Madecine...???", "Seals Madecine", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser1.getDate());
            Date dte = new Date();
// ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dte));

            contest();
            ps = null;
            try {
                int tp = 0;
                st = ct.createStatement();
                String s1 = "SELECT `m_price`.`Madicine_Name`,SUM(`m_price`.`Pur_Price`+'10%')AS `S_Price` FROM  `m_price` WHERE `m_price`.`Madicine_Name`='" + jComboBox1.getSelectedItem() + "' GROUP BY `m_price`.`Madicine_Name`";
                rs = st.executeQuery(s1);
                while (rs.next()) {
                    tp = rs.getInt(2);
                }
                int q = jComboBox2.getSelectedIndex();
                tp2 = tp * q;
                String s = "INSERT INTO `mdecine_sels_info`(`Sel_Id`,`Coustomer_Id`,`Coustomer_Name`,`Coutomer_Brith_Date`,`Madicine_Nmae`,`Sel_Quantity`,`Price`,`Sel_Dte`) VALUES (?,?,?,?,?,?,?,?)";
                ps = ct.prepareCall(s);
                ps.setString(1, jTextField3.getText());
                ps.setString(2, jTextField20.getText());
                ps.setString(3, jTextField9.getText());
                ps.setString(4, date);
                ps.setString(5, (String) jComboBox1.getSelectedItem());
                ps.setString(6, (String) jComboBox2.getSelectedItem());
                ps.setString(7, "" + tp2);
                ps.setString(8, sd.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {

                    String pr = "SELECT `m_price`.`Madicine_Name`,SUM(`m_price`.`Pur_Price`+'10%')AS `S_Price` FROM  `m_price` WHERE `m_price`.`Madicine_Name`='" + jComboBox1.getSelectedItem() + "' GROUP BY `m_price`.`Madicine_Name`";
                    rs = st.executeQuery(pr);
                    while (rs.next()) {
                        dd = rs.getInt(2);
                    }
                    ft = tp2 + ft;
                    st = ct.createStatement();
                    DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
                    dt.addRow(new Object[]{jTextField9.getText(), date, jComboBox1.getSelectedItem(), dd, jComboBox2.getSelectedItem(), tp2, jLabel8.getText()});
                  jLabel60.setText("Total TK :");
                 jLabel59.setText("" + ft);
                    tps = null;
                    String ft1 = "INSERT INTO `ft_sell_price` (`tk`)VALUE (?)";
                    tps = ct.prepareCall(ft1);
                    tps.setString(1, "" + ft);
                    tps.executeUpdate();
                    DefaultTableModel dt1 = (DefaultTableModel) jTable2.getModel();
                    while (dt1.getRowCount() > 0) {
                        for (int i = 0; i < dt1.getRowCount(); i++) {
                            dt1.removeRow(i);
                        }
                    }
                    jatble2stock();
                    jLabel20.setText("''Madecine Sales Have Been Successful''");
                    show_Sell_Id_jtextfilde3();
                    jTextField1.requestFocus();
                    // jTextField9.setText("");
                    //((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
                    jComboBox1.setSelectedIndex(0);
                    jComboBox2.setSelectedIndex(0);
                    jTextField7.setText("");
                    jTextField10.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Hospital_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        /* jtable1_Madecine_view();
        jComboBox3.removeAllItems();
       String h="---Select---";
       jComboBox3.addItem(h);
        jcombbx3_Show_Madecine_Name();
         */

    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        // TODO add your handling code here:
         DefaultTableModel dt1 = (DefaultTableModel) jTable2.getModel();
        while (dt1.getRowCount() > 0) {
            for (int i = 0; i < dt1.getRowCount(); i++) {
                dt1.removeRow(i);
            }
        }
        jatble2stock();
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
        // TODO add your handling code here:
         DefaultTableModel dt1 = (DefaultTableModel) jTable2.getModel();
        while (dt1.getRowCount() > 0) {
            for (int i = 0; i < dt1.getRowCount(); i++) {
                dt1.removeRow(i);
            }
        }
        jatble2_search();
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        // TODO add your handling code here:
           jatble5_search();
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jLabel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseClicked
        // TODO add your handling code here:
               ok2();
    }//GEN-LAST:event_jLabel78MouseClicked

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
        // TODO add your handling code here:
            Show_Id_Pur();
    }//GEN-LAST:event_jLabel79MouseClicked

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        // TODO add your handling code here:
          Show_Date_Pur();
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        // TODO add your handling code here:
            Show_Id();
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jLabel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseClicked
        // TODO add your handling code here:
                Show_Date();
    }//GEN-LAST:event_jLabel83MouseClicked

    private void jLabel89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseClicked
        // TODO add your handling code here:
           Show_All_Pur();
    }//GEN-LAST:event_jLabel89MouseClicked

    private void jLabel90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel90MouseClicked

    private void jLabel91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel91MouseClicked
        // TODO add your handling code here:
           Show_All();
    }//GEN-LAST:event_jLabel91MouseClicked

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
   contest();
        DefaultTableModel dt = (DefaultTableModel) jTable7.getModel();
        dt.setRowCount(0);
        String select = "SELECT `Seller_Id`,`Seller_Name`,`Madicine_Name`,`Pur_Quantity`,`Pur_Price`,SUM(`Pur_Quantity`*`Pur_Price`)AS `Total`,`Pur_Date` FROM `madecine_pur_info` GROUP BY `Pur_ID`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jLabel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel84MouseClicked

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

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel92MouseClicked

    private void jLabel93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel93MouseClicked

    private void jLabel94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel94MouseClicked

    private void jLabel95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseClicked
        // TODO add your handling code here:
        First_Login1 f=new First_Login1();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel95MouseClicked

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
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
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel105MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel105MouseClicked

    public void Show_All() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
        dt.setRowCount(0);
        String select = "SELECT `Coustomer_Id`,`Coustomer_Name`,`Coutomer_Brith_Date`,`Madicine_Nmae`,`Sel_Quantity`,`Price`,`Sel_Dte` FROM `mdecine_sels_info`";

        try {

            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Show_All_Pur() {
        contest();
        DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
        dt.setRowCount(0);
        String select = "SELECT `Seller_Id`,`Seller_Name`,`Madicine_Name`,`Pur_Quantity`,`Pur_Price`,SUM(`Pur_Quantity`*`Pur_Price`)AS `Total`,`Pur_Date` FROM `madecine_pur_info` GROUP BY `Pur_ID`";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Show_Date() {
        if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel29.setText("Date Is Empty");
        } else {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser2.getDate());
            contest();
            DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
            dt.setRowCount(0);
            String select = "SELECT `Coustomer_Id`,`Coustomer_Name`,`Coutomer_Brith_Date`,`Madicine_Nmae`,`Sel_Quantity`,`Price`,`Sel_Dte` FROM `mdecine_sels_info` WHERE `Sel_Dte`='" + date + "'";

            try {
                ps = ct.prepareCall(select);
                rs = ps.executeQuery();
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void Show_Date_Pur() {
        if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel37.setText("'Date Is Empty'");
        } else {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser3.getDate());
            contest();
            DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
            dt.setRowCount(0);
            String select = "SELECT `Seller_Id`,`Seller_Name`,`Madicine_Name`,`Pur_Quantity`,`Pur_Price`,SUM(`Pur_Quantity`*`Pur_Price`)AS `Total`,`Pur_Date` FROM `madecine_pur_info`WHERE `Pur_Date`='" + date + "'GROUP BY `Pur_ID`";

            try {
                ps = ct.prepareCall(select);
                rs = ps.executeQuery();
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void Show_Id() {
        if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel29.setText("Date Is Empty");
            jDateChooser2.requestFocus();
        } else if (jComboBox9.getSelectedIndex() <= 0) {
            jLabel29.setText("Id Is Empty");
            jComboBox9.requestFocus();
        } else {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser2.getDate());
            contest();
            DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
            dt.setRowCount(0);
            String select = "SELECT `Coustomer_Id`,`Coustomer_Name`,`Coutomer_Brith_Date`,`Madicine_Nmae`,`Sel_Quantity`,`Price`,`Sel_Dte` FROM `mdecine_sels_info` WHERE `Coustomer_Id`='" + jComboBox9.getSelectedItem() + "'";

            try {
                ps = ct.prepareCall(select);
                rs = ps.executeQuery();
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void Show_Id_Pur() {
        if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel37.setText("'Date Is Empty'");
            jDateChooser3.requestFocus();
        } else if (jComboBox10.getSelectedIndex() <= 0) {
            jLabel37.setText("'Id Is Empty'");
            jComboBox10.requestFocus();
        } else {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser3.getDate());
            contest();
            DefaultTableModel dt = (DefaultTableModel) jTable8.getModel();
            dt.setRowCount(0);
            String select = "SELECT `Seller_Id`,`Seller_Name`,`Madicine_Name`,`Pur_Quantity`,`Pur_Price`,SUM(`Pur_Quantity`*`Pur_Price`)AS `Total`,`Pur_Date` FROM `madecine_pur_info` WHERE `Seller_Id` ='" + jComboBox10.getSelectedItem() + "'GROUP BY `Pur_ID`";

            try {
                ps = ct.prepareCall(select);
                rs = ps.executeQuery();
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

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
            java.util.logging.Logger.getLogger(Madecine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Madecine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Madecine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Madecine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Madecine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton51;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
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
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
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
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
