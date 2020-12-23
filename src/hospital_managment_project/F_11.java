package hospital_managment_project;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class F_11 extends javax.swing.JFrame {
public F_11() {
        initComponents();
         Toolkit tk=Toolkit.getDefaultToolkit();
      int h=(int) tk.getScreenSize().getHeight();
      int w=(int) tk.getScreenSize().getWidth();
this.setSize(w, h);
      getContentPane().setBackground(Color.white);
      setIconImage(tk.getImage(getClass().getResource("Loghu__Hospital.jpg")));}
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/Icon_Loding.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 150, 150);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/First_F___Prgrass_Bar ___Hospital_Managment.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1322, 160);

        jProgressBar1.setBackground(new java.awt.Color(0, 153, 0));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(270, 626, 813, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_managment_project/F_1_Background.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 150, 620, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
             F_11 ff=new F_11();  
       ff.setVisible(true);
         for (int i = -1; i <=99;) {
             i++;
                 try {
                     Thread.sleep(40); 
                      jProgressBar1.setValue(i);
                      if(i==100){
          First_Login1 f =new First_Login1();
          f.setVisible(true);
               
                ff.setVisible(false);
             }
                 } catch (InterruptedException ex) {
                     Logger.getLogger(F_11.class.getName()).log(Level.SEVERE, null, ex);
                 }

            
           
             
}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
