package View;

import DAO.Connect;
import Model.CartTableModel;
import Model.MovieModel;
import Model.OrderItem;
import Model.Orders;
import Model.RentCartMovieModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Betuyaku
 */
public class PaymentView extends javax.swing.JFrame {
    
    /**
     * Creates new form Rent
     */
    public PaymentView() {
        initComponents();
        showTotal();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPayment = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCardNumber = new javax.swing.JLabel();
        cardNumberTxt = new javax.swing.JTextField();
        lblBill = new javax.swing.JLabel();
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

        lblBill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBill.setText("Your Bill:");

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

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        emailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTxtKeyTyped(evt);
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
                                .addComponent(lblBill)
                                .addGap(82, 82, 82))
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
                .addComponent(lblBill)
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
        new CartView().setVisible(true); //show the CartView when the button is clicked
        dispose(); //close the current screen
    }//GEN-LAST:event_backButtonActionPerformed
    
    //method to valid the email    
    public void isValidEmail(String email){
        
        if(!email.trim().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")){
        JOptionPane.showMessageDialog(this, "The email is not valid", "Warning",
        JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private double total;
    private void showTotal() {
        //show the total billing to pay
        lblBill.setText("€ "+RentCartMovieModel.getCurrentCart().getSize() * 2.99);
    }
    
    int getCardId(String cardnumber, String email,String valid){
        int cardId=0;
        boolean isThere = false;
        try {
            //Open the connection with the DB
            Connection con = Connect.getConnection();
            //SQL query to verify if the cardNumber exists into the User table
            String query = "select count(*) from User where cardNumber = "+cardnumber ;
            Statement comm = con.createStatement(); // to excute the Database command without any parameters
            //Result
            ResultSet rs = comm.executeQuery(query);
            if(rs.next()){
                isThere = rs.getInt(1)>0;
            }
            if(isThere==true){ //if is true take the cardNumber
                query = "SELECT idUser from User WHERE cardNumber = "+ cardnumber;
                rs = comm.executeQuery(query);
                if(rs.next()){
                    cardId = rs.getInt(1);
                }
                comm.close();
                con.close();
            }
            
            else{ //if the boolean is false create a new payment into the User table
                //open the connection DB again
                Connection conn = Connect.getConnection();
                // to excute the Database command without any parameters
                Statement stmt = conn.createStatement();
                String queryInsert = "insert into User (email,cardNumber,validCard) values('"+email+"','"+cardnumber+"','"+valid+"');";
                //This piece of code was inspired by: https://stackoverflow.com/questions/4224228/preparedstatement-with-statement-return-generated-keys
                cardId = stmt.executeUpdate(queryInsert,Statement.RETURN_GENERATED_KEYS);
                ResultSet rs1 = stmt.getGeneratedKeys();
                if(rs1.next()){
                    cardId = rs1.getInt(1);
                }
                
            }
            //close the DB connection
            comm.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return cardId;
    }
  
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        // check the rent date
        int cardId = getCardId(cardNumberTxt.getText(),emailTxt.getText(),validDate.getText());
        //This piece of code was developed following: https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        df.format(date);
        Orders order = new Orders(cardNumberTxt.getText(),date);
        MovieModel[] movies = RentCartMovieModel.getCurrentCart().getMoviesFromCart();
        order.addMovies(movies);
        int idOrder=0;
        try {
            //open the DB connection
            Connection con = Connect.getConnection();
                     
            //SQL query to Insert the payment (cardId) into the Order
            String query = "INSERT into Priscilla_2019217.Order (paymentId)\n" +
                    "values (" +cardId+ "); ";
            Statement comm = con.createStatement(); // to excute the Database command without any parameters
            //Result
            //This piece of code was inspired by: https://stackoverflow.com/questions/4224228/preparedstatement-with-statement-return-generated-keys
            comm.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = comm.getGeneratedKeys();
            //valid Email
//            String email = emailTxt.getText().trim();
//            if(!email.isEmpty()){
//                    isValidEmail(email);
//                }
            if(rs.next()){
                idOrder = rs.getInt(1);
            }
            comm.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Connection con = Connect.getConnection();
            Statement comm = con.createStatement();
            for(OrderItem item :order.getOrders()){
               String query = "INSERT into OrderItem (OrderId,OrderMovieId) " +
                    "values (" +idOrder+ ", "+ item.getIdMovie()+"); ";
               //when the user submit the payment, update the statusMovie to unavailable
               String queryStatus ="update Movie set statusMovie = 'u' where idMovie = "+item.getIdMovie();
               comm.executeUpdate(query);
               comm.execute(queryStatus);
            }
            
            comm.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        JOptionPane.showMessageDialog(this, "Your order number is: "+idOrder+"\n"+"Please save the number to return your movie!");
        
        // show a joptionpane to confim the rent
        ImageIcon icon = new ImageIcon("src\\View\\images\\icons\\card.png");
        int input = JOptionPane.showConfirmDialog(null,
                "Thanks for your purchase! See you soon!", "PAYMENT PROCESSED",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,icon);
        new WelcomeView().setVisible(true); //show the WelcomeView when the button is clicked
        dispose();
    }//GEN-LAST:event_submitButtonActionPerformed
    
    private void cardNumberTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNumberTxtKeyTyped
        //Accept only numbers
        String caracteres="0123456789";
        //if the character in this event is not on the list
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        } 
    }//GEN-LAST:event_cardNumberTxtKeyTyped
    
    
    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
   
    }//GEN-LAST:event_emailTxtActionPerformed

    private void emailTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyReleased
       
    }//GEN-LAST:event_emailTxtKeyReleased

    private void emailTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyTyped
//         String email = emailTxt.getText().trim();
//            if(!email.isEmpty()){
//                    isValidEmail(email);
//                }
    }//GEN-LAST:event_emailTxtKeyTyped
    public void setValue(double value) {
        //to set the total of rent
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
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentView().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cardNumberTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jCardNumber;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBill;
    private javax.swing.JLabel lblCVV;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JFormattedTextField validDate;
    // End of variables declaration//GEN-END:variables
    
}
