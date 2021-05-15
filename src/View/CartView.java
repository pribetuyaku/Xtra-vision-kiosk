
package View;

import Controller.CartControl;
import DAO.Connect;
import Model.CartTableModel;
import Model.MovieModel;
import Model.RentCartMovieModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class CartView extends javax.swing.JFrame {
    private double total;
    /**
     * Creates new form Cart
     */
    public CartView() {
        initComponents();
        showSelecteds();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCartLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        emptyCartButton = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCartView = new javax.swing.JTable();
        BackToMovie = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jCartLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCartLabel.setText("CART");

        homeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        btnPay.setText("PAY");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        emptyCartButton.setText("EMPTY Cart");
        emptyCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyCartButtonActionPerformed(evt);
            }
        });

        lblTotal.setText("Total:");

        tblCartView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Catergory", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCartView);

        BackToMovie.setText("BACK To Movie");
        BackToMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCartLabel)
                        .addGap(315, 315, 315)
                        .addComponent(homeButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackToMovie)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emptyCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCartLabel)
                    .addComponent(homeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emptyCartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPay)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal)
                    .addComponent(BackToMovie))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        new WelcomeView().setVisible(true); //show the WelcomeView when the button is clicked
        dispose(); //close the current screen
    }//GEN-LAST:event_homeButtonActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        PaymentView pay = new PaymentView();

        System.out.println(total);
        //Opening PaymentView Screen
        new PaymentView().setVisible(true);
        //Bringing the taking the total
        pay.setValue(total);
        //Closing the current window
        dispose();
    }//GEN-LAST:event_btnPayActionPerformed

    private void emptyCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyCartButtonActionPerformed
        // show a joptionpane dialog using showConfirmDialog
        ImageIcon icon = new ImageIcon("src\\View\\images\\icons\\doubt.png");
        int input = JOptionPane.showConfirmDialog(null, 
                "Are you sure do want to clear your cart?", "CLEAR MY CART", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,icon);
        // 0=ok 2=cancel
        if(input == 0){ //if the option selected was ok
            emptyCart();
        } 
        
//        RentCartMovieModel.getCurrentCart().removeAllMovies();
        MovieModel movie = null;
        RentCartMovieModel.getCurrentCart().removeMovie(movie);
    }//GEN-LAST:event_emptyCartButtonActionPerformed

    private void BackToMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMovieActionPerformed
      new MovieView().setVisible(true);//show the MovieView when the button is clicked
       dispose();//close the current screen
    }//GEN-LAST:event_BackToMovieActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showCartMovies();
    }//GEN-LAST:event_formWindowOpened

   
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
            java.util.logging.Logger.getLogger(CartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartView().setVisible(true);
            }
        });
    }
    public void showSelecteds() {
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            String sql = "SELECT * FROM Priscilla_2019217.cart;";
            Statement command = con.createStatement(); // to excute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
            //Show the search resuts
            DefaultTableModel model;
            model = (DefaultTableModel) tblCartView.getModel();
            model.setNumRows(0);
            while (result.next()) {
                model.addRow(new Object[]{
                    result.getString("title"),
                    result.getString("category"),
                    result.getDouble("price"),});
            }
            showTotalCart();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMovie;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton emptyCartButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jCartLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCartView;
    // End of variables declaration//GEN-END:variables

private void showTotalCart() {
     double total = RentCartMovieModel.getCurrentCart().getSize() * 2.99;
     lblTotal.setText("€ "+total);

    }
  private void emptyCart() {
    // show the cart page using casting
       MovieModel movie = (MovieModel)tblCartView.getValueAt(tblCartView.getSelectedRow(), 0);
       RentCartMovieModel.getCurrentCart().removeAllMovies(movie);
    }

    private void showCartMovies() {
        CartTableModel model = new CartTableModel(RentCartMovieModel.getCurrentCart().getMoviesFromCart());
        tblCartView.setModel(model);
        tblCartView.setModel(model);
        tblCartView.getColumnModel().getColumn(0).setWidth(0);
        tblCartView.getColumnModel().getColumn(0).setMinWidth(0);
        tblCartView.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tblCartView.repaint();
    }

}
