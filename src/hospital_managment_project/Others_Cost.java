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

public class Others_Cost extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0;
    ResultSet rss=null;
    PreparedStatement tps=null;
    PreparedStatement ops=null;
    int ft=0;
    public Others_Cost() {
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

    }
 
      
 public int show_id(){
   contest();
   ps=null;
   // cleardata();
   String select="SELECT `id` FROM `other's_cost`";
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
            Logger.getLogger(Others_Cost.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
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
        jLabel76 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        jLabel84 = new javax.swing.JLabel();
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
        jLabel1.setBounds(0, 0, 140, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Othrs_Test.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 0, 1020, 140);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1170, 100, 190, 40);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13);
        jLabel13.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1360, 140);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(160, 120, 90, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(110, 210, 380, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(160, 80, 90, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField1);
        jTextField1.setBounds(250, 80, 150, 40);

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
        jTextField2.setBounds(250, 120, 150, 40);

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
        jTextField3.setBounds(250, 160, 150, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ammount");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(160, 160, 90, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Ammount", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(530, 150, 650, 260);

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

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Print");
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel76);
        jLabel76.setBounds(1080, 100, 100, 50);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/add.png"))); // NOI18N
        jLabel62.setText("Ok");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel62);
        jLabel62.setBounds(180, 290, 220, 80);

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel85MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel85);
        jLabel85.setBounds(1270, 0, 90, 80);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Cost.jpg"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(-6, -6, 1360, 560);

        jTabbedPane1.addTab("                                  Other's Cost                                   ", jPanel3);

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
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Date");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(80, 70, 100, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(80, 180, 320, 50);

        jButton31.setBackground(new java.awt.Color(0, 0, 255));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Day Cost Report");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31);
        jButton31.setBounds(80, 250, 330, 50);

        jButton32.setBackground(new java.awt.Color(0, 0, 255));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("Monthly  Cost Report");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32);
        jButton32.setBounds(80, 300, 330, 50);

        jButton39.setBackground(new java.awt.Color(0, 0, 255));
        jButton39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("Yearly Cost Report");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton39);
        jButton39.setBounds(80, 350, 330, 50);

        jButton40.setBackground(new java.awt.Color(0, 0, 255));
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
                " Id", " Name", "Price ", "Date"
            }
        ));
        jScrollPane9.setViewportView(jTable8);

        jPanel1.add(jScrollPane9);
        jScrollPane9.setBounds(490, 120, 750, 350);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel60);
        jLabel60.setBounds(490, 470, 750, 50);

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Print");
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel77);
        jLabel77.setBounds(1120, 70, 120, 50);

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel84MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel84);
        jLabel84.setBounds(1270, 0, 90, 80);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Cost.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(-6, -6, 1360, 560);

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
public void ok(){
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
        Logger.getLogger(Others_Cost.class.getName()).log(Level.SEVERE, null, ex);
    }  }}
}

public void jtable1_view() {
        contest();

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        String select = "SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost`WHERE `DAte`='"+jLabel8.getText()+"'";
        try {
            ps = ct.prepareCall(select);
            rs = ps.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getDate(4)});
//dt.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),rs.getString(15),rs.getString(16)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stup_Sallarry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
jTextField3.requestFocus();
      }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ok();
           
           }
    }//GEN-LAST:event_jTextField3KeyPressed

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
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '"+date+"'  ";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
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
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
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
                String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost` WHERE `DAte`LIKE '%"+date+"%'";
                st = ct.prepareCall(s);
                rs = st.executeQuery(s);
                while (rs.next()) {
                    dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
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
            String s="SELECT `id`,`Name`,`Tk`,`DAte` FROM `other's_cost`";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)});
          id=id+rs.getInt(3);  }jLabel12.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);

        }jLabel60.setText("Total Tk :"+id);
           

    }//GEN-LAST:event_jButton40ActionPerformed

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
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

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
         ok();
        
    }//GEN-LAST:event_jLabel62MouseClicked

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

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked
public void contest(){
        try {
            ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Others_Cost.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Others_Cost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Others_Cost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Others_Cost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Others_Cost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Others_Cost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
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
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
