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

public class Debit_Credit extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0;
    ResultSet rss=null;
    PreparedStatement tps=null;
    PreparedStatement ops=null;
    int ft=0;
    public Debit_Credit() {
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
//jLabel44.setVisible(false);
//jButton26.setVisible(false);
    }
 
      
 public void show_id(){
     int j,k,l=0;
    contest();    
    j=ProfitAccoubnt2()+Profit_ac6()+Profit_ptotal()+ Profit_Appointment_fee()+Profit_others_test_fee();
    k=cost_Sallarrysum()+cost_Cost_Sum()+cost_account4()+cost_Doctor_Sallarry_Sum();
    l=j-k;
   jTextArea1.setText("\nIncome : "+j+" TK"+"\nExpenses : "+k+" TK"+"\nProfit : "+l+" Tk");
 
 
 }
  
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
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
        }return others_test_fee;} 

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
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Profit_Date = new com.toedter.calendar.JDateChooser();
        jLabel37 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Profit.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 0, 1020, 140);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1210, 100, 150, 40);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1360, 140);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 90, 280, 50);

        Profit_Date.setBackground(new java.awt.Color(255, 255, 255));
        Profit_Date.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Profit_DateMouseMoved(evt);
            }
        });
        Profit_Date.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                Profit_DateMouseWheelMoved(evt);
            }
        });
        Profit_Date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Profit_DateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Profit_DateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Profit_DateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Profit_DateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Profit_DateMouseReleased(evt);
            }
        });
        Profit_Date.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Profit_DateInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel4.add(Profit_Date);
        Profit_Date.setBounds(80, 40, 220, 40);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Date");
        jPanel4.add(jLabel37);
        jLabel37.setBounds(0, 40, 100, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Print");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel5);
        jLabel5.setBounds(770, 40, 90, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(320, 40, 440, 160);

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Day Salary Report");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel43);
        jLabel43.setBounds(40, 150, 230, 40);

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Monthly Salary Report");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel46);
        jLabel46.setBounds(20, 190, 290, 40);

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("All");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        jLabel45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel45KeyPressed(evt);
            }
        });
        jPanel4.add(jLabel45);
        jLabel45.setBounds(50, 270, 230, 40);

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Yearly Salary Riport ");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel44);
        jLabel44.setBounds(40, 230, 250, 40);

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel47);
        jLabel47.setBounds(1280, 30, 80, 80);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Profit.jpg"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(0, 30, 1360, 590);

        desktopPane.add(jPanel4);
        jPanel4.setBounds(0, 120, 1360, 620);

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
String o="INSERT INTO `other's_cost`(`id`,`Name`,`Tk`,`DAte`) VALUES(?,?,?,?)";
if(jTextField1.getText().isEmpty()){
    jLabel5.setText("'Id Is Empty'");
jTextField1.requestFocus();
}else if(jTextField2.getText().isEmpty()){
    jLabel5.setText("'Name Is Empty'");
jTextField2.requestFocus();
}else if(jTextField3.getText().isEmpty()){
    jLabel5.setText(" 'Ammount Is Empty'");
jTextField3.requestFocus();
}else{
     int p=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Add Other's Cost...???", "Add Others's Cost", JOptionPane.YES_NO_OPTION);
        if(p==0){ 
    ps = null;
    try {
        contest();
        Date dte=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        ps = ct.prepareCall(o);
         ps.setString(1, jTextField1.getText());
          ps.setString(2, jTextField2.getText());
           ps.setString(3, jTextField3.getText());
                 ps.setString(4,df.format(dte));
                int m = ps.executeUpdate();
                if (m > 0) { 
   DefaultTableModel dt4 = (DefaultTableModel) jTable1.getModel();
                    while (dt4.getRowCount() > 0) {
                        for (int i = 0; i < dt4.getRowCount(); i++) {
                            dt4.removeRow(i);
                        }
                    }
                    show_id();
                    jtable1_view();
                    jLabel5.setText("''"+jTextField2.getText()+" Cost Add Success...''");
                //    jlabel5_Total();
                            //jTextField1.setText("");
                              jTextField2.setText("");
                                jTextField3.setText("");
                    jTextField2.requestFocus();
                }
        
    } catch (SQLException ex) {
        Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
    }  }}
}*/

public void jtable1_view() {
        contest();

     //   DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        String select = "SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost`WHERE `DAte`='"+jLabel8.getText()+"'";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
            //    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getDate(4)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
 Sallary_Account_Backup_Detailse ss=new Sallary_Account_Backup_Detailse();
        ss.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked
public int DateAccount(){
int Account=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`account_date`.`Ammount`) FROM `account_date` WHERE `account_date`.`Date`='"+date+"'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Account=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Account;}
public int Mdecinesell_Date(){
int Mdecinesell=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`madecine_sell_date`.`Price`) FROM `madecine_sell_date` WHERE `madecine_sell_date`.`Sel_Dte`='"+date+"'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Mdecinesell=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Mdecinesell;}
public int Patient_Bill_Date(){
int Patient_Bill=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`patint_bill_date`.`Tk`) FROM `patint_bill_date` WHERE `patint_bill_date`.`Date`='"+date+"'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Patient_Bill=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Patient_Bill;}
public int Appoint_Chackin_Date(){
int Appoint_Chackin=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`appoint_chakin_date`.`Fee`) FROM `appoint_chakin_date` WHERE `appoint_chakin_date`.`Date`='"+date+"'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Appoint_Chackin=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Appoint_Chackin;}
public int Others_Test_Date(){
int Others_Test=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`appoint_chakin_date`.`Fee`) FROM `appoint_chakin_date`WHERE `appoint_chakin_date`.`Date`='"+date+"'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Others_Test=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Others_Test;}
public int Employe_Sallary_Date(){
int Employe_Sallary=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`E_Sallary`) FROM `empllye_sallary` WHERE `date`='"+date+"'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Employe_Sallary=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Employe_Sallary;}
public int Doctor_Sallary_Date(){
int Doctor_Sallary=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`E_Sallary`) FROM `doctor_sallarry` WHERE `Date`='"+date+"'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Doctor_Sallary=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Doctor_Sallary;}
public int Madecin_pur_Date(){
int Madecin_pur=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`Total_Price`) FROM  `madecine_pur_info` WHERE `Pur_Date`='"+date+"'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Madecin_pur=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Madecin_pur;}
public int Others_Cost_Date(){
int Others_Cost=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`Tk`) FROM `other's_cost`WHERE `DAte`='"+date+"'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Others_Cost=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Others_Cost;}
public int MonthAccount(){
int Account=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`account_date`.`Ammount`) FROM `account_date` WHERE `account_date`.`Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Account=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Account;}
public int Mdecinesell_month(){
int Mdecinesell=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`madecine_sell_date`.`Price`) FROM `madecine_sell_date` WHERE `madecine_sell_date`.`Sel_Dte`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Mdecinesell=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Mdecinesell;}
public int Patient_Bill_Month(){
int Patient_Bill=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`patint_bill_date`.`Tk` )FROM `patint_bill_date` WHERE `patint_bill_date`.`Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Patient_Bill=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Patient_Bill;}
public int Appoint_Chackin_Month(){
int Appoint_Chackin=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`appoint_chakin_date`.`Fee`) FROM `appoint_chakin_date` WHERE `appoint_chakin_date`.`Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Appoint_Chackin=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Appoint_Chackin;}
public int Others_Test_Month(){
int Others_Test=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`appoint_chakin_date`.`Fee`) FROM `appoint_chakin_date`WHERE `appoint_chakin_date`.`Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Others_Test=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Others_Test;}
public int Employe_Sallary_Month(){
int Employe_Sallary=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`E_Sallary`)FROM `empllye_sallary` WHERE `date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Employe_Sallary=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Employe_Sallary;}
public int Doctor_Sallary_Month(){
int Doctor_Sallary=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`E_Sallary`) FROM `doctor_sallarry` WHERE `Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Doctor_Sallary=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Doctor_Sallary;}
public int Madecin_pur_Month(){
int Madecin_pur=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`Total_Price`) FROM  `madecine_pur_info` WHERE `Pur_Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Madecin_pur=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Madecin_pur;}
public int Others_Cost_MOnth(){
int Others_Cost=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`Tk`) FROM `other's_cost`WHERE `DAte`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Others_Cost=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Others_Cost;}










public int yearAccount(){
int Account=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`account_date`.`Ammount`) FROM `account_date` WHERE `account_date`.`Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Account=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Account;}
public int Mdecinesell_year(){
int Mdecinesell=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`madecine_sell_date`.`Price`) FROM `madecine_sell_date` WHERE `madecine_sell_date`.`Sel_Dte`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Mdecinesell=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Mdecinesell;}
public int Patient_Bill_year(){
int Patient_Bill=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`patint_bill_date`.`Tk` )FROM `patint_bill_date` WHERE `patint_bill_date`.`Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Patient_Bill=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Patient_Bill;}
public int Appoint_Chackin_year(){
int Appoint_Chackin=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`appoint_chakin_date`.`Fee`) FROM `appoint_chakin_date` WHERE `appoint_chakin_date`.`Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Appoint_Chackin=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Appoint_Chackin;}
public int Others_Test_year(){
int Others_Test=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`appoint_chakin_date`.`Fee`) FROM `appoint_chakin_date`WHERE `appoint_chakin_date`.`Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Others_Test=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Others_Test;}
public int Employe_Sallary_year(){
int Employe_Sallary=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`E_Sallary`)FROM `empllye_sallary` WHERE `date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Employe_Sallary=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Employe_Sallary;}
public int Doctor_Sallary_year(){
int Doctor_Sallary=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`E_Sallary`) FROM `doctor_sallarry` WHERE `Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Doctor_Sallary=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Doctor_Sallary;}
public int Madecin_pur_year(){
int Madecin_pur=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`Total_Price`) FROM  `madecine_pur_info` WHERE `Pur_Date`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Madecin_pur=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Madecin_pur;}
public int Others_Cost_year(){
int Others_Cost=0;
if (((JTextField) Profit_Date.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            Profit_Date.requestFocus();
        } else{
            try {
                
                contest();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date = sd.format(Profit_Date.getDate());
                //JOptionPane.showMessageDialog(rootPane, "date :"+date);
                String s="SELECT SUM(`Tk`) FROM `other's_cost`WHERE `DAte`LIKE'%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                  Others_Cost=rs.getInt(1);
                    }jLabel7.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Credit.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
return Others_Cost;}







    private void Profit_DateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profit_DateMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Profit_DateMouseMoved

    private void Profit_DateMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_Profit_DateMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Profit_DateMouseWheelMoved

    private void Profit_DateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profit_DateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Profit_DateMouseClicked

    private void Profit_DateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profit_DateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Profit_DateMouseEntered

    private void Profit_DateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profit_DateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Profit_DateMouseExited

    private void Profit_DateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profit_DateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Profit_DateMousePressed

    private void Profit_DateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profit_DateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Profit_DateMouseReleased

    private void Profit_DateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Profit_DateInputMethodTextChanged
        // TODO add your handling code here:
        //  JOptionPane.showMessageDialog(rootPane, "jj");
    }//GEN-LAST:event_Profit_DateInputMethodTextChanged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            // TODO add your handling code here:
            boolean m = jTextArea1.print();
            if (m) {
                JOptionPane.showMessageDialog(this, "PrintSuccess ");
            } else {
                JOptionPane.showMessageDialog(this, " Printing.....");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Hospital_Detailse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        // TODO add your handling code here:
        int h,g,hg=0;
                h=DateAccount()+Mdecinesell_Date()+Patient_Bill_Date()+Appoint_Chackin_Date()+ Others_Test_Date();
    g=Employe_Sallary_Date()+Doctor_Sallary_Date()+Madecin_pur_Date()+ Others_Cost_Date();
     hg=h-g;
 jTextArea1.setText("\nIncome : "+h+" TK"+"\nExpenses : "+g+" TK"+"\nProfit : "+hg+" Tk");

    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        // TODO add your handling code here:
         int h,g,hg=0;
        h=MonthAccount()+Mdecinesell_month()+Patient_Bill_Month()+Appoint_Chackin_Month()+ Others_Test_Month();
      g=Employe_Sallary_Month()+Doctor_Sallary_Month()+Madecin_pur_Month()+ Others_Cost_MOnth();
      hg=h-g;
 jTextArea1.setText("\nIncome : "+h+" TK"+"\nExpenses : "+g+" TK"+"\nProfit : "+hg+" Tk");

    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
          show_id();
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel45KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel45KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel45KeyPressed

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
       int h,g,hg=0;
        h=yearAccount()+Mdecinesell_year()+Patient_Bill_year()+Appoint_Chackin_year()+ Others_Test_year();
      g=Employe_Sallary_year()+Doctor_Sallary_year()+Madecin_pur_year()+ Others_Cost_year();
      hg=h-g;
 jTextArea1.setText("\nIncome : "+h+" TK"+"\nExpenses : "+g+" TK"+"\nProfit : "+hg+" Tk");

    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked
public void contest(){
        try {
            ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Debit_Credit.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Debit_Credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Debit_Credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Debit_Credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Debit_Credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Debit_Credit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Profit_Date;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
