/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_managment_project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JasminBijley
 */
public class Print_Patient_Bill extends javax.swing.JFrame {
    
    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0;
    ResultSet rss=null;
    PreparedStatement tps=null;
    PreparedStatement ops=null;
    int ft=0;
        public Print_Patient_Bill(int g3) {
     initComponents();
        show_date();
testp();

if(g3<=0){
JOptionPane.showMessageDialog(rootPane, "Patient Id Is Empty");
}else{
 double day = 1;
     double tt1 = 0;
   
            int f = 0, g = 0, h = 0, i = 0, j = 0;
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            String pName = "";
            String qTest = "";
            String rOparetion = "";
             String bed = "";
              String Doctor = "";
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
                //    String date="SELECT `Date` FROM `d_date`  WHERE `Pasent_Id`='"+jComboBox13.getSelectedItem()+"";

                String checkutdate = "SELECT `Pasent_Id`,`C_Date` FROM `chack_out`WHERE `Pasent_Id`='" +g3+ "'";

                rss = st.executeQuery(checkutdate);
                if (rss.next()) {
                    jTextField26.setText("" + rss.getDate(2));
                } else {
                    jTextField26.setText("" + jLabel5.getText());
                }
                String pas = "SELECT *FROM `show_date` WHERE `show_date`.`Pasent_Id`='" + g3+ "'";
                rs = st.executeQuery(pas);
                while (rs.next()) {
                    try {

                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                        jTextField25.setText("" + rs.getDate(5));
                        //  String y1=String.parseString(rs.getDate(1));
                        String bday = jTextField25.getText();
                        String cday = jTextField26.getText();
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
                       jLabel12.setText("Patient Name    : "+ rs.getString(2) );
                      jLabel3.setText("Bed Fee             : " + b * day);
                      pName =  jLabel12.getText();
                     bed=jLabel3.getText();
                      t1 = b * day;
                    } else if (b <= 0) {
                        jLabel12.setText("Patient Name    : "+ rs.getString(2) );
                        jLabel15.setText("Doctor Fee        :"+ a * day);
                       
                        pName = jLabel12.getText();
                        Doctor=jLabel15.getText();
                        t1 = a * day;
                    } else {
                        jLabel12.setText("Patient Name    : " + rs.getString(2));
                        jLabel15.setText("Doctor Fee        :"+ a * day);
                          jLabel3.setText("Bed Fee             : " + b * day);
                        pName = jLabel12.getText();
                          Doctor=jLabel15.getText();
                           bed=jLabel3.getText();
                        t1 = (a * day) + (b * day);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            String test = "SELECT SUM(`T_Fee`) AS `T_Fee` FROM `patient_test_info` WHERE `Pasent_Id` ='" + g3 + "'";
            try {
                rs = st.executeQuery(test);
                while (rs.next()) {
                    c = rs.getInt(1);
                    if (c <= 0) {
                    } else {
                        jLabel13.setText("Test Fee            :" + rs.getInt(1));
                        qTest = jLabel13.getText();
                        t2 = rs.getInt(1);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }

            String op = "SELECT SUM(`O_Fee`) AS `O_Fee` FROM `patient_oparetion_info` WHERE `Pasent_Id`='" + g3 + "'";
            try {
                rs = st.executeQuery(op);
                while (rs.next()) {
                    d = rs.getInt(1);
                    if (d <= 0) {
                    } else {
                        jLabel16.setText("Oparetion Fee  : " + rs.getInt(1));
                        t3 = rs.getInt(1);
                        rOparetion = jLabel16.getText();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                st = ct.createStatement();
                String pt = "SELECT SUM(`Tk`)AS`Tk` FROM `prtient_bill` WHERE `P_Id`='" + g3 + "'GROUP BY `P_Id`";
                rs = st.executeQuery(pt);
                while (rs.next()) {
                    pt1 = rs.getInt(1);

                }
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            tt = t1 + t2 + t3;
            tt1 = tt - pt1;

          ///  jTextArea1.setText("" + pName + "" + qTest + "" + rOparetion + "\nTotal Tk      : " + tt + "\nPaid          : " + pt1 + "\nDiue          :" + tt1);
jLabel12.setText(""+pName);
jLabel13.setText(""+qTest);
jLabel16.setText(""+rOparetion);
jLabel17.setText("Total Fee           :"+tt);
jLabel14.setText("Paid                   :"+pt1);
jLabel4.setText("Due                   :"+tt1);
          jTextField25.setVisible(false);
       jTextField26.setVisible(false);
}   }
    public Print_Patient_Bill() {
        initComponents();
        show_date();
testp();
       jTextField25.setVisible(false);
       jTextField26.setVisible(false);
    }

   
    
    public void testp(){
    Reception r=new Reception();
    //jLabel3.setText("Name"+r.test());
        r.Patientbill();
    }
      public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Print_Patient_Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public void show_date(){
        Date dt=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
jLabel5.setText("Date : "+df.format(dt));
//((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Bed Fee             :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 250, 480, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Deu                   :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 450, 480, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Management");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 70);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Date: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 120, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Mobile Number : 01862915005");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 80, 310, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("..................................................................................................................................");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 150, 610, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("..................................................................................................................................");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 100, 610, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("........................................");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 540, 250, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Signeture");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 570, 170, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Patient Name    :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 170, 480, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Test Fee            :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 290, 480, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Paid                   :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 410, 480, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Doctor Fee        :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 210, 480, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Oparetion Fee  :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 330, 480, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Total Fee           :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(10, 370, 480, 40);
        jPanel1.add(jTextField25);
        jTextField25.setBounds(490, 540, 10, 40);
        jPanel1.add(jTextField26);
        jTextField26.setBounds(550, 540, 10, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 0, 620, 620);
        jPanel1.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 70, 620);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/Close2.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 60, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(0, 60, 70, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(690, 0, 70, 620);

        setSize(new java.awt.Dimension(759, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   PrinterJob job=PrinterJob.getPrinterJob();
   job.setJobName("Print Data");
   job.setPrintable(new Printable() {
       @Override
       public int print(Graphics pg, PageFormat pf, int PageNum){
           //To change body of generated methods, choose Tools | Templates.
      if(PageNum>0){
            return NO_SUCH_PAGE;}
Graphics2D g2=(Graphics2D) pg;
g2.translate(pf.getImageableX(),pf.getImageableX());
 g2.scale(1,0.8);  
   jPanel1.print(g2);
       return Printable.PAGE_EXISTS;
       }
   });
   if(job.printDialog()==true){
   JOptionPane.showMessageDialog(this,"Print success..");
   try{
   job.print();
   }catch(PrinterException P){
   
   }}else{JOptionPane.showMessageDialog(this,"Failed...");}
   
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Print_Patient_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print_Patient_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print_Patient_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print_Patient_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print_Patient_Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    // End of variables declaration//GEN-END:variables
}
