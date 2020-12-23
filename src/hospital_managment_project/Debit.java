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

public class Debit extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0;
    ResultSet rss=null;
    PreparedStatement tps=null;
    PreparedStatement ops=null;
    int ft=0;
    public Debit() {
        initComponents();
    
        Toolkit tk=Toolkit.getDefaultToolkit();
  //      int h=(int) tk.getScreenSize().getHeight();
    ///    int w=(int) tk.getScreenSize().getWidth();
    //  this.setSize(w, h);
    // getContentPane().setBackground(Color.White);
 
      setIconImage(tk.getImage(getClass().getResource("Loghu__Hospital.jpg")));
 show_date();


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
        jLabel49 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Back.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 140, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Cost.gif"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 0, 1020, 140);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1210, 100, 150, 40);

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Minimze.png"))); // NOI18N
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel49);
        jLabel49.setBounds(1240, 0, 60, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1360, 140);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Date");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(120, 70, 60, 40);

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel4.add(jDateChooser3);
        jDateChooser3.setBounds(180, 70, 220, 40);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Type", "Doctor ID", "Doctor Salary", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable5);

        jPanel4.add(jScrollPane6);
        jScrollPane6.setBounds(500, 100, 660, 350);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel9);
        jLabel9.setBounds(90, 140, 320, 50);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 204));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel60);
        jLabel60.setBounds(500, 450, 660, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Print");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6);
        jLabel6.setBounds(1070, 60, 90, 40);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel17.setText("Day Salary Report");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17);
        jLabel17.setBounds(120, 200, 320, 70);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel18.setText("Monthly Salary Report");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel18);
        jLabel18.setBounds(130, 270, 350, 70);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel19.setText("Yearly Salary Riport ");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel19);
        jLabel19.setBounds(130, 340, 330, 70);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel20.setText("All");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jLabel20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel20KeyPressed(evt);
            }
        });
        jPanel4.add(jLabel20);
        jLabel20.setBounds(70, 410, 230, 70);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel30);
        jLabel30.setBounds(1280, 0, 80, 80);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/tk.jpg"))); // NOI18N
        jPanel4.add(jLabel29);
        jLabel29.setBounds(0, 0, 1360, 560);

        jTabbedPane1.addTab("              Doctor           ", jPanel4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jDateChooser4.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jDateChooser4MouseMoved(evt);
            }
        });
        jDateChooser4.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jDateChooser4MouseWheelMoved(evt);
            }
        });
        jDateChooser4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDateChooser4MouseReleased(evt);
            }
        });
        jDateChooser4.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser4InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel1.add(jDateChooser4);
        jDateChooser4.setBounds(180, 70, 220, 40);

        jTable6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Madecie Id", "Madecine Name", "Purchase Quantity", "Total Price", "Date"
            }
        ));
        jScrollPane7.setViewportView(jTable6);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(500, 100, 660, 350);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("Date");
        jPanel1.add(jLabel40);
        jLabel40.setBounds(120, 70, 60, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 140, 320, 50);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 204));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel61);
        jLabel61.setBounds(500, 450, 660, 60);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Print");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1070, 60, 90, 40);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel25.setText("Yearly Madecine Riport ");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel25);
        jLabel25.setBounds(110, 340, 360, 70);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel26.setText("Monthly Madecine Report");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel26);
        jLabel26.setBounds(110, 270, 390, 70);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel27.setText("Day Madecine Report");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel27);
        jLabel27.setBounds(110, 200, 340, 70);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel28.setText("All");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jLabel28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel28KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel28);
        jLabel28.setBounds(70, 410, 190, 70);

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel43);
        jLabel43.setBounds(1280, 0, 80, 80);

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/tk.jpg"))); // NOI18N
        jPanel1.add(jLabel46);
        jLabel46.setBounds(0, 0, 1360, 560);

        jTabbedPane1.addTab("                Madecine               ", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

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

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", " Name", "Price ", "Date"
            }
        ));
        jScrollPane8.setViewportView(jTable7);

        jPanel5.add(jScrollPane8);
        jScrollPane8.setBounds(500, 100, 660, 350);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel11);
        jLabel11.setBounds(100, 140, 320, 50);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 204));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel62);
        jLabel62.setBounds(500, 450, 660, 60);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Print");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel13);
        jLabel13.setBounds(1070, 60, 90, 40);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel23.setText("Day Csot Report");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel23);
        jLabel23.setBounds(130, 200, 300, 70);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel22.setText("Monthly Cost Report");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel22);
        jLabel22.setBounds(130, 270, 350, 70);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel21.setText("Yearly Cost Riport ");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel21);
        jLabel21.setBounds(130, 340, 330, 70);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel24.setText("All");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jLabel24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel24KeyPressed(evt);
            }
        });
        jPanel5.add(jLabel24);
        jLabel24.setBounds(70, 410, 270, 80);

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel44);
        jLabel44.setBounds(1280, 0, 80, 80);

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/tk.jpg"))); // NOI18N
        jPanel5.add(jLabel47);
        jLabel47.setBounds(0, 0, 1360, 560);

        jTabbedPane1.addTab("               Other's Cost          ", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Date");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(80, 70, 100, 40);

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
        jPanel3.add(jDateChooser2);
        jDateChooser2.setBounds(180, 70, 220, 40);

        jTable4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employe Type", "Employe ID", "Employe Salary", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jPanel3.add(jScrollPane5);
        jScrollPane5.setBounds(500, 100, 660, 370);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(100, 160, 320, 50);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 204));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel59);
        jLabel59.setBounds(500, 470, 660, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Print");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5);
        jLabel5.setBounds(1060, 60, 90, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel4.setText("Monthly Salary Report");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4);
        jLabel4.setBounds(130, 270, 370, 70);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel14.setText("Yearly Salary Riport ");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14);
        jLabel14.setBounds(140, 340, 320, 70);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel15.setText("All");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jLabel15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel15KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel15);
        jLabel15.setBounds(50, 410, 300, 80);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/search.png"))); // NOI18N
        jLabel16.setText("Day Salary Report");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16);
        jLabel16.setBounds(140, 200, 300, 70);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("Date");
        jPanel6.add(jLabel42);
        jLabel42.setBounds(80, 70, 100, 40);

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
        jPanel6.add(jDateChooser6);
        jDateChooser6.setBounds(180, 70, 220, 40);

        jTable8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employe Type", "Employe ID", "Employe Salary", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable8);

        jPanel6.add(jScrollPane9);
        jScrollPane9.setBounds(480, 50, 480, 350);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel31);
        jLabel31.setBounds(100, 160, 320, 50);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 255));
        jPanel6.add(jLabel63);
        jLabel63.setBounds(680, 400, 280, 50);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setText("Print");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel32);
        jLabel32.setBounds(1260, 0, 90, 40);

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Monthly Salary Report");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel33);
        jLabel33.setBounds(100, 290, 290, 40);

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Yearly Salary Riport ");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel34);
        jLabel34.setBounds(120, 330, 250, 40);

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("All");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jLabel35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel35KeyPressed(evt);
            }
        });
        jPanel6.add(jLabel35);
        jLabel35.setBounds(130, 380, 230, 40);

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Day Salary Report");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel36);
        jLabel36.setBounds(130, 250, 230, 40);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(0, 0, 0, 0);

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/Logout.jpg"))); // NOI18N
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel45);
        jLabel45.setBounds(1280, 0, 80, 80);

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/icon/tk.jpg"))); // NOI18N
        jPanel3.add(jLabel48);
        jLabel48.setBounds(0, 0, 1360, 560);

        jTabbedPane1.addTab("                    Employe             ", jPanel3);

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
    private void jDateChooser2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser2InputMethodTextChanged
        // TODO add your handling code here:
        //  JOptionPane.showMessageDialog(rootPane, "jj");
    }//GEN-LAST:event_jDateChooser2InputMethodTextChanged

    private void jDateChooser2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseReleased

    private void jDateChooser2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MousePressed

    private void jDateChooser2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseExited

    private void jDateChooser2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseEntered

    private void jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseClicked

    private void jDateChooser2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jDateChooser2MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseWheelMoved

    private void jDateChooser2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseMoved

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

    private void jDateChooser4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser4MouseMoved

    private void jDateChooser4MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jDateChooser4MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser4MouseWheelMoved

    private void jDateChooser4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser4MouseClicked

    private void jDateChooser4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser4MouseEntered

    private void jDateChooser4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser4MouseExited

    private void jDateChooser4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser4MousePressed

    private void jDateChooser4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser4MouseReleased

    private void jDateChooser4InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser4InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser4InputMethodTextChanged

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

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
     
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Sallary_Account_Backup_Detailse ss=new Sallary_Account_Backup_Detailse();
        ss.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
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
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
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
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
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
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
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
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        id=0;if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel7.setText("Date Is Empty");
            jDateChooser2.requestFocus();
        } else{
        try {
             DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
                dt.setRowCount(0);
             contest();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser2.getDate());
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `E2Id`,`E_Id`,`E_Sallary`,`Date` FROM `employe_sallary_test` WHERE `Date` LIKE '"+date+"' ";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
               
              dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4)});
           id=id+rs.getInt(3); }jLabel7.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }
    jLabel59.setText("Total : "+id+ "Tk");
    
    }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        id=0;    if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
           jLabel7.setText("Date Is Empty");
            jDateChooser2.requestFocus();
        } else{
         DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
                dt.setRowCount(0);
        try {contest();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
            String date = sd.format(jDateChooser2.getDate());
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `E2Id`,`E_Id`,`E_Sallary`,`Date` FROM `employe_sallary_test` WHERE `Date` LIKE '%"+date+"%' ";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4)});
           id=id+rs.getInt(3); }
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }jLabel7.setText("");
     jLabel59.setText("Total : "+id+ "Tk");
    
    }

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
         id=0; if (((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()) {
           jLabel7.setText("Date Is Empty");
            jDateChooser2.requestFocus();
        } else{
         DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
                dt.setRowCount(0);
        try {contest();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy");
            String date = sd.format(jDateChooser2.getDate());
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `E2Id`,`E_Id`,`E_Sallary`,`Date` FROM `employe_sallary_test` WHERE `Date` LIKE '%"+date+"%' ";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4)});
           id=id+rs.getInt(3); }jLabel7.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }
     jLabel59.setText("Total : "+id+ "Tk");
    
    }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel15KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15KeyPressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        id=0;   DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
                dt.setRowCount(0);
        try {contest();
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `E2Id`,`E_Id`,`E_Sallary`,`Date` FROM `employe_sallary_test` ";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4)});
            id=id+rs.getInt(3);}jLabel7.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        } jLabel59.setText("Total : "+id+ "Tk");
    
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        id=0;        if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel9.setText("Date Is Empty");
            jDateChooser3.requestFocus();
        } else{
        try {
             DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
                dt.setRowCount(0);
             contest();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser3.getDate());
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `E2Id`,`E_Id`,`E_Sallary`,`Date` FROM `doctor_sallarry` WHERE `Date` LIKE '"+date+"'  ";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
              dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4)});
         id=id+rs.getInt(3);   }jLabel9.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }
    
      jLabel60.setText("Total : "+id+ "Tk");
    } 
        
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
         id=0; if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel9.setText("Date Is Empty");
            jDateChooser3.requestFocus();
        } else{
         DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
                dt.setRowCount(0);
        try {contest();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
            String date = sd.format(jDateChooser3.getDate());
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `E2Id`,`E_Id`,`E_Sallary`,`Date` FROM `doctor_sallarry` WHERE `Date` LIKE '%"+date+"%' ";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4)});
          id=id+rs.getInt(3);  }jLabel9.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }       jLabel60.setText("Total : "+id+ "Tk");
}         
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
         id=0; if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel9.setText("Date Is Empty");
            jDateChooser3.requestFocus();
        } else{
         DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
                dt.setRowCount(0);
        try {contest();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy");
            String date = sd.format(jDateChooser3.getDate());
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `E2Id`,`E_Id`,`E_Sallary`,`Date` FROM `doctor_sallarry` WHERE `Date` LIKE '%"+date+"%' ";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4)});
           id=id+rs.getInt(3); }jLabel9.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }       jLabel60.setText("Total : "+id+ "Tk");
}        
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
           id=0;
       DefaultTableModel dt = (DefaultTableModel) jTable5.getModel();
                dt.setRowCount(0);
        try {contest();
             //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `E2Id`,`E_Id`,`E_Sallary`,`Date` FROM `doctor_sallarry`  ";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDate(4)});
            id=id+rs.getInt(3);}jLabel9.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }      jLabel60.setText("Total : "+id+ "Tk");
 
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel20KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20KeyPressed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
          id=0;if (((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText().isEmpty()) {
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
            id=id+rs.getInt(3);}jLabel11.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  jLabel62.setText("Total : "+id+ "Tk");
        
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
         id=0;  if (((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText().isEmpty()) {
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
            id=id+rs.getInt(3);}jLabel11.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        } jLabel62.setText("Total : "+id+ "Tk");
    } 
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
           id=0; if (((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText().isEmpty()) {
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
           id=id+rs.getInt(3); }jLabel11.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   jLabel62.setText("Total : "+id+ "Tk");
        
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        id=0;
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
           id=id+rs.getInt(3);}jLabel11.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        
    }  jLabel62.setText("Total : "+id+ "Tk");
        
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel24KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24KeyPressed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
          id=0; if (((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText().isEmpty()) {
           jLabel10.setText("Date Is Empty");
            jDateChooser4.requestFocus();
        } else{
        try {
             DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
                dt.setRowCount(0);
             contest();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy");
            String date = sd.format(jDateChooser4.getDate());
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `Madicine_Id`,`Madicine_Name`,`Pur_Quantity`,`Total_Price`,`Pur_Date` FROM `madecine_pur_info` WHERE `Pur_Date` LIKE '%"+date+"%'";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
              dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getInt(4), rs.getDate(5)});
           id=id+rs.getInt(4); }jLabel10.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }
     jLabel61.setText("Total : "+id+ "Tk");
    
    } 
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
          id=0; if (((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText().isEmpty()) {
           jLabel10.setText("Date Is Empty");
            jDateChooser4.requestFocus();
        } else{
        try {
             DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
                dt.setRowCount(0);
             contest();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
            String date = sd.format(jDateChooser4.getDate());
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `Madicine_Id`,`Madicine_Name`,`Pur_Quantity`,`Total_Price`,`Pur_Date` FROM `madecine_pur_info` WHERE `Pur_Date` LIKE '%"+date+"%'";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
              dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getInt(4), rs.getDate(5)});
           id=id+rs.getInt(4); }jLabel10.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }
     jLabel61.setText("Total : "+id+ "Tk");
    
    } 
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        id=0;  if (((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText().isEmpty()) {
           jLabel10.setText("Date Is Empty");
            jDateChooser4.requestFocus();
        } else{
        try {
             DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
                dt.setRowCount(0);
             contest();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date = sd.format(jDateChooser4.getDate());
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `Madicine_Id`,`Madicine_Name`,`Pur_Quantity`,`Total_Price`,`Pur_Date` FROM `madecine_pur_info` WHERE `Pur_Date`='"+date+"'";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
              dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getInt(4), rs.getDate(5)});
           id=id+rs.getInt(4); }jLabel10.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        }
      jLabel61.setText("Total : "+id+ "Tk");
    
    } 
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
         id=0;
        try {
             DefaultTableModel dt = (DefaultTableModel) jTable6.getModel();
                dt.setRowCount(0);
             contest();
          
            //JOptionPane.showMessageDialog(rootPane, "date :"+date);
            String s="SELECT `Madicine_Id`,`Madicine_Name`,`Pur_Quantity`,`Total_Price`,`Pur_Date` FROM `madecine_pur_info`";
            st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while (rs.next()) {
              dt.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getInt(4), rs.getDate(5)});
           id=id+rs.getInt(4); }jLabel10.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
        } jLabel61.setText("Total : "+id+ "Tk");
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel28KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28KeyPressed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel30MouseClicked

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

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel35KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel35KeyPressed

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
        First_Login f=new  First_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel49MouseClicked




   
    
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
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Debit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
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
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
