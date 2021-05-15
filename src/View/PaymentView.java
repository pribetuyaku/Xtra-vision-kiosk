package View;

import DAO.Connect;
import Model.DB;
import Model.MovieModel;
import Model.OrderItem;
import Model.Orders;
import Model.RentCartMovieModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPayment = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCardNumber = new javax.swing.JLabel();
        cardNumberTxt = new javax.swing.JTextField();
        lblBill = new javax.swing.JLabel();
        lblRent = new javax.swing.JLabel();
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

        lblRent.setText("€ ");

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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lblBill)
                    .addComponent(lblRent))
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
            double total = RentCartMovieModel.getCurrentCart().getSize() * 2.99;
            lblRent.setText("€ "+total);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    int getCardId(String cardnumber, String email,String valid){
        int cardId=0;
        boolean isThere = false;
        try {
            Connection con = Connect.getConnection();
            //SQL query
            String query = "select count(*) from User where cardNumber = "+cardnumber ;
            Statement comm = con.createStatement(); // to excute the Database command without any parameters
            //Result
            ResultSet rs = comm.executeQuery(query);
            if(rs.next()){
                isThere = rs.getInt(1)>0;
            }
            if(isThere==true){
                query = "SELECT idUser from User WHERE cardNumber = "+ cardnumber;
                rs = comm.executeQuery(query);
                if(rs.next()){
                    cardId = rs.getInt(1);
                }
                comm.close();
                con.close();
            }
            
            else{
                Connection conn = Connect.getConnection();
                Statement stmt = conn.createStatement();
                String queryInsert = "insert into User (email,cardNumber,validCard) values('"+email+"','"+cardnumber+"','"+valid+"');";
                cardId = stmt.executeUpdate(queryInsert,Statement.RETURN_GENERATED_KEYS);
                ResultSet rs1 = stmt.getGeneratedKeys();
                if(rs1.next()){
                    cardId = rs1.getInt(1);
                }
                
            }
            
            comm.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return cardId;
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        int cardId = getCardId(cardNumberTxt.getText(),emailTxt.getText(),validDate.getText());
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        df.format(date);
        Orders order = new Orders(cardNumberTxt.getText(),date);
        MovieModel[] movies = RentCartMovieModel.getCurrentCart().getMoviesFromCart();
        order.addMovies(movies);
        int idOrder=0;
        try {
            Connection con = Connect.getConnection();
            //SQL query
            String query = "INSERT into Priscilla_2019217.Order (paymentId)\n" +
                    "values (" +cardId+ "); ";
            Statement comm = con.createStatement(); // to excute the Database command without any parameters
            //Result
            comm.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = comm.getGeneratedKeys();
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
               String queryStatus ="update Movie set statusMovie = 'u' where idMovie = "+item.getIdMovie();
               comm.executeUpdate(query);
               comm.execute(queryStatus);
            }
            
            comm.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(this, "your order number is: "+idOrder);
        
        
        
        
        
        
        
        //return orderId;
        //criar uma order na database -- order controller linha 21
//        String query = "INSERT into xtra_order (id_card, date)\n" +
//                "values (" +order.getCreditCardID()+ ", '"+ convertDateTimeToString(order.getDate()) +"'); ";
//
//        int orderId = executeInsert(query);
//
//        for(OrderLine line : order.getOrderLines()){
//            String deductMovie = "UPDATE xtra_movie set amount = amount-1 where id = " +line.getMovieId() +";";
//            String queryOrderLine = "INSERT into xtra_order_line (order_id,movie_id)\n" +
//                    "values (" +orderId+ ", "+ line.getMovieId()+"); ";
//
//            executeInsert(queryOrderLine);
//            executeUpdate(deductMovie);
//        }
//
//      return orderId;
//    }
//query = insert into order payment iID
//Database linha 63 - 68 - pegar a order criada
//        int result = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//        ResultSet rs= stmt.getGeneratedKeys();
//            if (rs.next())
//            {
//              result = rs.getInt(1);  //salvar este int
//            }
//adicionar os filmes na orderitem com a order id = a criada;
//for (int i = 0 ;i <cartmovies.length ;i++){
//query = insert into orderitem idmovie orderid  movies[i].getid
//excute(query);
//}
//try { // Connect to the DB and insert data into my database
//    Connection con = Connect.getConnection();
//    String sql = "INSERT into User (email, cardNumber, validCard)"
//            + "values(?,?,?)";
//    // to excute the Database command without any parameters
//    PreparedStatement ps = con.prepareStatement(sql);
//    // inserting data to my DB
//    ps.setString(1, emailTxt.getText());
//    ps.setLong(2, Long.parseLong(cardNumberTxt.getText()));
//    ps.setString(3, validDate.getText());
//    //Executing the action
//    ps.execute();
//    
//} catch (Exception e) {
//    System.out.println(e);
//}
// show a joptionpane to confim the rent
ImageIcon icon = new ImageIcon("src\\View\\images\\icons\\card.png");
int input = JOptionPane.showConfirmDialog(null,
        "Thanks for your purchase! See you soon!", "PAYMENT PROCESSED",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,icon);

//        try { // Connect to the DB and insert data into my database
//            Connection con = Connect.getConnection();
//
//            MovieModel [] movies = RentCartMovieModel.getCurrentCart().getMoviesFromCart();
//            for (int i =0 ;i<movies.length;i++){
//                String sql = "update Movie set statusMovie = 'u' where idMovie = "+movies[i].getIdMovie();
//                Statement comm = con.createStatement(); // to excute the Database command without any parameters
//            //Result
//                comm.execute(sql);
//            }
//
//           con.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }

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
        //check if the email isValid
//
//        if(!email.trim().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")){
//            throw new Exception ("Not a valid email");
//        }
    }//GEN-LAST:event_emailTxtActionPerformed
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
    private javax.swing.JLabel lblRent;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JFormattedTextField validDate;
    // End of variables declaration//GEN-END:variables
    
}
