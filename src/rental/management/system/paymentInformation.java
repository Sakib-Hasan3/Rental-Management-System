package rental.management.system;
import Project.ConnectionProvider;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class paymentInformation extends javax.swing.JFrame {
        public int flag=0;


    public paymentInformation() {
        initComponents();
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 90));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("Flat No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 140, 29));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 190, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/management/system/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 50, 40));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1580, 80));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel3.setText("Month");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel4.setText("Rent Amount");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 240, 40));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 240, 40));

        jButton2.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/management/system/save-icon--1.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 860, 150, -1));

        jButton3.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/management/system/Close.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 860, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel6.setText("Gas Bill");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 240, 40));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel7.setText("Maintanance ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 230, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 240, 40));

        jButton4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jButton4.setText("Total");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 190, 50));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel10.setText("Reciept no");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 550, 550));

        jButton5.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/management/system/print.jpg"))); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 830, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setText("DATE :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, 30));

        jLabel8.setText("           ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 689, 153, 258));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, 30));

        jLabel12.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 60, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1540, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 50, 750));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("                     ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 710, 240, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/management/system/rsz_11interior-has-armchair-empty-white-wall.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
// code for search button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                String flatno=jTextField1.getText(); 
                                try
                                 {
                                     Connection con=ConnectionProvider.getCon();
                                     Statement st=con.createStatement();
                                     ResultSet rs=st.executeQuery("select * from tenent where flatno='" + flatno + "';" );
                               //       JOptionPane.showMessageDialog(null, "!!!   database connected !!!");  
                                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                           /*         if(!rs.first())
                                                jLabel2.setVisible(true);
                                     else
                                     {
                                         jLabel2.setVisible(false); 
                                         jTextField1.setEditable(false);
                                         flag=1;
                                     }
                                     */
                                     
                                 }
                                catch(Exception e)
                                        {
                                            JOptionPane.showMessageDialog(null, "!!!  Connection Error  !!!");
                                        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed
// code for close button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed
// code for payable amount
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                   try
                   { java.util.Date date=jDateChooser1.getDate();
                       Date sqldate = new java.sql.Date(date.getTime());
                       String rno=jLabel12.getText();
                      String flatno=jTextField1.getText();
                      String month = (String) jComboBox1.getSelectedItem();
                      
                       String gas_bill=jTextField3.getText();
                        int gas_bill1=Integer.parseInt(gas_bill);
                       
                        String rent=jTextField4.getText();
                          int rent1=Integer.parseInt(rent);
                          
                        String maintanance=jTextField5.getText();
                         int maintanance1=Integer.parseInt(maintanance);
                         
                       
                         int payable_amount;
                     
                         payable_amount=(int) (gas_bill1+rent1+maintanance1);
                           jLabel13.setText(" "+payable_amount);
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "******************************************************\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "               MONTHLY PAYMENT RECIEPT                   \n");
                                       jTextArea1.setText(jTextArea1.getText()+ "******************************************************\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "RECIEPT NO                                     "+rno+           "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "DATE                                                 "+sqldate+       "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "FLAT NO                                           "+flatno+        "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "MONTHLY RENT                             "+rent1+         "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "GAS BILL                                          "+gas_bill1+     "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "MAINTANANCE CHARGE              "+maintanance1+  "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "TOATAL AMOUNT                          "+payable_amount+"\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "************   THANK YOU FOR PAYMENT   *************");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "\n");
                                       jTextArea1.setText(jTextArea1.getText()+ "                                             House owner signature");

                           
                           
     
                           
                           
                     if(jButton4.isSelected())
                            {
                                      jLabel13.setVisible(true);
               
                              }    
                   }
                    catch (Exception e) 
                                        {
                                           JOptionPane.showMessageDialog(this," Enter data incorrect Format");
                                            }
                   
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                     
                      java.util.Date date=jDateChooser1.getDate();
                      
                       String rno=jLabel12.getText();
                      String flatno=jTextField1.getText();
                     String month = (String) jComboBox1.getSelectedItem();
                       String gas_bill=jTextField3.getText();
                        int gas_bill1=Integer.parseInt(gas_bill);
                       
                        String rent=jTextField4.getText();
                          int rent1=Integer.parseInt(rent);
                          
                        String maintanance=jTextField5.getText();
                         int maintanance1=Integer.parseInt(maintanance);
                         
                       
                         int payable_amount;
                        payable_amount=(int) (gas_bill1+rent1+maintanance1);
                           jLabel13.setText(" "+payable_amount);
                       
                         try {
                                  
                                      Connection con = ConnectionProvider.getCon();
                                      Statement st = con.createStatement();
                                       st.executeUpdate("insert into rent values('" +rno+ "','" + month + "','" + gas_bill + "','" +rent + "','" + maintanance + "','" + payable_amount + "','" + flatno + "','" + date + "')");
                                     
                                        JOptionPane.showMessageDialog(null, "Successfully Inserted");
                                        setVisible(false);
                                           new paymentInformation().setVisible(true);
                                    } 
                                        catch (Exception e) 
                                        {
                                           JOptionPane.showMessageDialog(this,"Either some data is Missing or  Enter data incorrect Format");
                                             }
                
                          

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            try {
                jTextArea1.print();
                
                // TODO add your handling code here:
            } catch (PrinterException ex) {
                Logger.getLogger(paymentInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
               try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select max(rno) from rent;");
            if(rs.next())
            {
                int id=rs.getInt(1);
                id=id+1;
                String str=String.valueOf(id);
                jLabel12.setText(str);
                
                
                 
            }
            else
                jLabel12.setText("1");
        } catch (Exception e) {
           
        }   
     
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(paymentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
