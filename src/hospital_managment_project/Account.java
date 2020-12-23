
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

public class Account extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0;
    ResultSet rss=null;
    PreparedStatement tps=null;
    PreparedStatement ops=null;
    int ft=0;
    public Account() {
        initComponents();
    
        Toolkit tk=Toolkit.getDefaultToolkit();
  //      int h=(int) tk.getScreenSize().getHeight();
    ///    int w=(int) tk.getScreenSize().getWidth();
    //  this.setSize(w, h);
    // getContentPane().setBackground(Color.White);
 
      setIconImage(tk.getImage(getClass().getResource("Loghu__Hospital.jpg")));
 show_date();
jlabel6_Total();
show_id();
Show_Id_Search();
//jLabel6.setVisible(false);

    }
 
      
public int show_id(){
   contest();
   ps=null;
   id=0;
   // cleardata();
   String select="SELECT `Id` FROM `account`";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
            id=rs.getInt(1);
            }id=id+1;
            jTextField3.setText(""+id);
            jTextField4.requestFocus();
                    } catch (SQLException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
  return id; }
 public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Madecine.class.getName()).log(Level.SEVERE, null, ex);
        } }

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
        jLabel19 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Ivest.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 0, 1040, 140);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1210, 100, 150, 40);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19);
        jLabel19.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1360, 140);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(330, 120, 200, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(530, 240, 200, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(280, 320, 570, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 30, 1360, 40);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(jTextField3);
        jTextField3.setBounds(530, 120, 200, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Amount Of TK");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(330, 240, 200, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField4);
        jTextField4.setBounds(530, 160, 200, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(330, 160, 200, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField5);
        jTextField5.setBounds(530, 200, 200, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Number");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(330, 200, 200, 40);

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(51, 51, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Attendence.jpg"))); // NOI18N
        jLabel84.setText("Invest");
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel84MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel84MouseEntered(evt);
            }
        });
        jPanel3.add(jLabel84);
        jLabel84.setBounds(350, 410, 390, 80);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel17);
        jLabel17.setBounds(1270, 0, 90, 80);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Invest.jpg"))); // NOI18N
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 0, 1360, 560);

        jTabbedPane1.addTab("                                          Investment                                     ", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Id");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 150, 60, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select---" }));
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(160, 150, 130, 40);

        jTable3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Number", "Ammount", "Date"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(440, 110, 750, 380);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 220, 380, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Print");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1100, 70, 90, 40);

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel85.setText("Search All");
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel85MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel85MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel85);
        jLabel85.setBounds(20, 290, 340, 60);

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel86.setText("Search");
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel86MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel86);
        jLabel86.setBounds(10, 370, 290, 80);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1270, 0, 90, 80);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel18);
        jLabel18.setBounds(870, 490, 320, 50);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Invest.jpg"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 1360, 560);

        jTabbedPane1.addTab("                                        Search                                    ", jPanel1);

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
public int jlabel6_Total(){
    int j,k,l=0;
    
    contest(); 
  
      
j=ProfitAccoubnt2()+Profit_ac6()+Profit_ptotal()+ Profit_Appointment_fee()+Profit_others_test_fee();
k=cost_Sallarrysum()+cost_Cost_Sum()+cost_account4()+cost_Doctor_Sallarry_Sum();
l=j-k;
  jLabel6.setText("Total Amount :"+l+" TK");
return l;} 
public int cost_account4(){
    contest(); 
    int account4=0;
   // jComboBox3.removeAllItems();
        try { st=ct.createStatement();
        String s="SELECT `account4`.`Total_Pur_tk`FROM `account4`";
        rs=st.executeQuery(s);
        while(rs.next()){
   account4=rs.getInt(1);
        }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }return account4;} 
public int cost_Doctor_Sallarry_Sum(){
    contest(); 
    int Doctor_Sallarry_Sum=0;
   // jComboBox3.removeAllItems();
        try { st=ct.createStatement();
        String s="SELECT `doctor_sallarry_sum`.`sallarry` FROM `doctor_sallarry_sum`";
        rs=st.executeQuery(s);
        while(rs.next()){
   Doctor_Sallarry_Sum=rs.getInt(1);
        }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }return Doctor_Sallarry_Sum;} 
public int cost_Cost_Sum(){
    contest(); 
    int Cost_Sum=0;
   // jComboBox3.removeAllItems();
        try { st=ct.createStatement();
        String s="SELECT `cost_sum`.`tk`FROM `cost_sum`";
        rs=st.executeQuery(s);
        while(rs.next()){
   Cost_Sum=rs.getInt(1);
        }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }return Cost_Sum;} 
public int cost_Sallarrysum(){
    contest(); 
    int Sallarrysum=0;
   // jComboBox3.removeAllItems();
        try { st=ct.createStatement();
        String s="SELECT `sallarry_sum`.`Sallarry`FROM `sallarry_sum`";
        rs=st.executeQuery(s);
        while(rs.next()){
   Sallarrysum=rs.getInt(1);
        }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }return Sallarrysum;} 

public int ProfitAccoubnt2(){
    contest(); 
    int account2=0;
   // jComboBox3.removeAllItems();
        try { st=ct.createStatement();
        String s="SELECT `account2`.`Ammount` FROM `account2`";
        rs=st.executeQuery(s);
        while(rs.next()){
   account2=rs.getInt(1);
        }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }return account2;} 
public int Profit_ac6(){
    contest(); 
    int ac6=0;
   // jComboBox3.removeAllItems();
        try { st=ct.createStatement();
        String s="SELECT `ac6`.`selltk` FROM `ac6`";
        rs=st.executeQuery(s);
        while(rs.next()){
   ac6=rs.getInt(1);
        }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }return ac6;} 
public int Profit_ptotal(){
    contest(); 
    int ptotal=0;
   // jComboBox3.removeAllItems();
        try { st=ct.createStatement();
        String s="SELECT `ptotal`.`Tk` FROM `ptotal`";
        rs=st.executeQuery(s);
        while(rs.next()){
   ptotal=rs.getInt(1);
        }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }return ptotal;} 
public int Profit_Appointment_fee(){
    contest(); 
    int Appointment_fee=0;
   // jComboBox3.removeAllItems();
        try { st=ct.createStatement();
        String s="SELECT `appoint_fee`.`appointfee` FROM `appoint_fee`";
        rs=st.executeQuery(s);
        while(rs.next()){
   Appointment_fee=rs.getInt(1);
        }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }return Appointment_fee;} 
public int Profit_others_test_fee(){
    contest(); 
    int others_test_fee=0;
   // jComboBox3.removeAllItems();
        try { st=ct.createStatement();
        String s="SELECT `other_test_fee`.`Test_Fee`FROM `other_test_fee`";
        rs=st.executeQuery(s);
        while(rs.next()){
   others_test_fee=rs.getInt(1);
        }} catch (SQLException ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }return others_test_fee;} 

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
Sallary_Account_Backup_Detailse ss=new Sallary_Account_Backup_Detailse();
        ss.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField5.requestFocus();
      }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField1.requestFocus();
      }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if(jTextField3.getText().isEmpty()){
        jLabel5.setText("'Id Is Empty ");
        jTextField3.requestFocus();
        }else if(jTextField4.getText().isEmpty()){
        jLabel5.setText("'Name Is Empty ");
        jTextField4.requestFocus();
        }else if(jTextField5.getText().isEmpty()){
        jLabel5.setText("'Number Is Empty'");
        jTextField5.requestFocus();
        }else if(jTextField1.getText().isEmpty()){
        jLabel5.setText("'Please Enter Amount Of TK'");
        jTextField1.requestFocus();
        }
        else{
            int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add TK...???", "Add TK", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
         contest();
         Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            ps = null;
String D = "INSERT `account` (`Id`,`Name`,`Number`,`Ammount`,`Date`)VALUES(?,?,?,?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField3.getText());
                 ps.setString(2, jTextField4.getText());
                  ps.setString(3, jTextField5.getText());
                ps.setString(4, jTextField1.getText());
                 ps.setString(5,df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel5.setText("''TK Has Been Add''");
                    jlabel6_Total();
                    show_id();   jTextField1.setText("");
                                jTextField5.setText("");
                                    jTextField4.setText("");
                    jTextField4.requestFocus();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}
             
      }
    }//GEN-LAST:event_jTextField1KeyPressed
void Show_Id_Search(){
     jComboBox1.removeAllItems();
      jComboBox1.addItem("---Select---");
       contest();
   ps=null;
   id=0;
   // cleardata();
   String select="SELECT `Id` FROM `account`";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
            jComboBox1.addItem(""+rs.getInt(1));
            }
                    } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }}
    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
   if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
     
       if(jComboBox1.getSelectedIndex()<=0){
       jLabel7.setText("'Id Is Empty'");
       } else{DefaultTableModel dt=(DefaultTableModel)jTable3.getModel();
    dt.setRowCount(0);
       contest();
   ps=null;
   id=0;
   // cleardata();
   String select="SELECT `Id`,`Name`,`Number`,`Ammount`,`Date` FROM `account`WHERE `Id`='"+jComboBox1.getSelectedItem()+"'";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
               dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5)});
            jLabel7.setText("");
            }
                    } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }}}
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c==KeyEvent.VK_SPACE|| c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTable3.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseClicked
       
        if(jTextField3.getText().isEmpty()){
        jLabel5.setText("'Id Is Empty ");
        jTextField3.requestFocus();
        }else if(jTextField4.getText().isEmpty()){
        jLabel5.setText("'Name Is Empty ");
        jTextField4.requestFocus();
        }else if(jTextField5.getText().isEmpty()){
        jLabel5.setText("'Number Is Empty'");
        jTextField5.requestFocus();
        }else if(jTextField1.getText().isEmpty()){
        jLabel5.setText("'Please Enter Amount Of TK'");
        jTextField1.requestFocus();
        }
        else{
            int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add TK...???", "Add TK", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
         contest();
         Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            ps = null;
String D = "INSERT `account` (`Id`,`Name`,`Number`,`Ammount`,`Date`)VALUES(?,?,?,?,?)";
            try {
                ps = ct.prepareCall(D);
                ps.setString(1, jTextField3.getText());
                 ps.setString(2, jTextField4.getText());
                  ps.setString(3, jTextField5.getText());
                ps.setString(4, jTextField1.getText());
                 ps.setString(5,df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) {
                    jLabel5.setText("''TK Has Been Add''");
                    jlabel6_Total();
                    show_id();  
                    Show_Id_Search();
jTextField1.setText("");
                                jTextField5.setText("");
                                    jTextField4.setText("");
                    jTextField4.requestFocus();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}
    }//GEN-LAST:event_jLabel84MouseClicked

    private void jLabel84MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel84MouseEntered

    private void jLabel85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseClicked
        // TODO add your handling code here:
        int p,u=0;
        DefaultTableModel dt=(DefaultTableModel)jTable3.getModel();
    dt.setRowCount(0);
       contest();
   ps=null;
   id=0;
   // cleardata();
   String select="SELECT `Id`,`Name`,`Number`,`Ammount`,`Date` FROM `account`";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
               dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5)});
            jLabel7.setText("");
            p=rs.getInt(4);
            u=u+p;
            jLabel18.setText("Total :"+u);
            }
                    } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel85MouseClicked

    private void jLabel85MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel85MouseEntered

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        // TODO add your handling code here:
        
       if(jComboBox1.getSelectedIndex()<=0){
       jLabel7.setText("'Id Is Empty'");
       } else{DefaultTableModel dt=(DefaultTableModel)jTable3.getModel();
    dt.setRowCount(0);
       contest();
   ps=null;
   id=0;
   int i=0;
   // cleardata();
   String select="SELECT `Id`,`Name`,`Number`,`Ammount`,`Date` FROM `account`WHERE `Id`='"+jComboBox1.getSelectedItem()+"'";
        try {
 ps=ct.prepareCall(select);
rs=ps.executeQuery();
            while(rs.next())        
            {
               dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5)});
            jLabel7.setText("");
            i=i+rs.getInt(4);
            jLabel18.setText("Total :"+i);
            }
                    } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_jLabel86MouseClicked

    private void jLabel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel86MouseEntered

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel19MouseClicked

  

   
    
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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
