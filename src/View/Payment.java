package View;

import DAO.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Betuyaku
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Rent
     */
    public Payment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPayment = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCardNumber = new javax.swing.JLabel();
        cardNumberTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        totalRent = new javax.swing.JLabel();
        lblCVV = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        emailTxt = new javax.swing.JTextField();
        jEmailLabel = new javax.swing.JLabel();
        validDate = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPayment.setText("MAKE YOUR PAYMENT");

        jCardNumber.setText("Please, insert your card number:");

        cardNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberTxtActionPerformed(evt);
            }
        });
        cardNumberTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNumberTxtKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Your Bill:");

        totalRent.setText("€ ");

        lblCVV.setText("CVV:");

        lblDate.setText("EXPIRED DATE:");

        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jEmailLabel.setText("Your receipt by email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDate)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalRent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCardNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1)
                                .addComponent(cardNumberTxt)
                                .addComponent(lblCVV)
                                .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(validDate))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backButton)
                            .addGap(18, 18, 18)
                            .addComponent(submitButton))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblPayment)
                .addGap(18, 18, 18)
                .addComponent(jEmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(totalRent))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCVV)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(submitButton))
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    private void cardNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberTxtActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Cart().setVisible(true); //show the Cart when the button is clicked
        dispose(); //close the current screen
    }//GEN-LAST:event_backButtonActionPerformed
    
    //method to valid the email
 
    public static boolean isValidEmail(String email){
       boolean isEmailValid = false;
       if (email!= null && email.length() > 0){
           String checker = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
           Pattern pattern = Pattern.compile(checker, Pattern.CASE_INSENSITIVE);
           Matcher matcher = pattern.matcher(email);
           if (matcher.matches()){
               isEmailValid = true;
           }
        }
        return isEmailValid;
    }
    
    private double total;
    public void Selected() {
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            String sql = "SELECT * FROM Priscilla_2019217.cart;";
            Statement command = con.createStatement(); // to excute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
            //Show the search resuts
            showTotal();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void showTotal() {
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            String sql = "SELECT price FROM Priscilla_2019217.cart;";

            Statement command = con.createStatement(); // to excute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
            //Storing thw result of price into the variable total, and count when adding a new price into the table.
            while (result.next()) {
                total += result.getDouble("price");
            }
            //show the calculation of the price
            totalRent.setText(Double.toString(total));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        try { // Connect to the DB and insert data into my database
            Connection con = Connect.getConnection();
            String sql = "INSERT into User (email, cardNumber, validCard)"
                    + "values(?,?,?)";
            // to excute the Database command without any parameters
            PreparedStatement ps = con.prepareStatement(sql); 
            // inserting data to my DB
            ps.setString(1, emailTxt.getText());
            ps.setLong(2, Long.parseLong(cardNumberTxt.getText()));
            ps.setString(3, validDate.getText());
            //Executing the action
            ps.execute();

        } catch (Exception e) {
            System.out.println(e);
        }
        // show a joptionpane to confim the rent
        ImageIcon icon = new ImageIcon("src\\View\\images\\icons\\card.png");
        int input = JOptionPane.showConfirmDialog(null, 
                "Thanks for your purchase! See you soon!", "PAYMENT PROCESSED", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,icon);
        dispose();
        
    }//GEN-LAST:event_submitButtonActionPerformed

   
    private void cardNumberTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNumberTxtKeyTyped
        //Accept only numbers
                String caracteres="0987654321";
                //if the character in this event is not on the list 
                if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
                } //add this property to delete this event 
                
    }//GEN-LAST:event_cardNumberTxtKeyTyped
        public void setValue(double value) {
        this.total = value;
    }
         
    //main method
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cardNumberTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jCardNumber;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCVV;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel totalRent;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JFormattedTextField validDate;
    // End of variables declaration//GEN-END:variables

}
