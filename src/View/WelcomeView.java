
package View;

import Model.MovieModel;
import Model.RentCartMovieModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author Betuyaku
 */
public class WelcomeView extends javax.swing.JFrame {

    /**
     * Creates new form WelcomePage
     */
    public WelcomeView() {
        initComponents();
        setSize(529, 352);
        setDefaultCloseOperation(WelcomeView.EXIT_ON_CLOSE);
        RentCartMovieModel cart = new RentCartMovieModel(new ArrayList<MovieModel>());
        RentCartMovieModel.setCurrentCart(cart);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lblLogo = new javax.swing.JLabel();
        jWelcome = new javax.swing.JLabel();
        jRequirements = new javax.swing.JLabel();
        jCards = new javax.swing.JLabel();
        jOptions = new javax.swing.JLabel();
        jRentButton = new javax.swing.JButton();
        jReturnButton = new javax.swing.JButton();
        jRedBackground = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/Xtra-Vision-logo.png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(130, 20, 256, 30);

        jWelcome.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jWelcome.setText("WELCOME TO XTRA-VISION RENTAL KIOSK");
        getContentPane().add(jWelcome);
        jWelcome.setBounds(40, 70, 440, 30);

        jRequirements.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRequirements.setForeground(new java.awt.Color(255, 255, 255));
        jRequirements.setText("NO membership or sing-up required.");
        getContentPane().add(jRequirements);
        jRequirements.setBounds(150, 120, 222, 17);

        jCards.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCards.setForeground(new java.awt.Color(255, 255, 255));
        jCards.setText("CREDIT and DEBIT Card Accepted!");
        getContentPane().add(jCards);
        jCards.setBounds(150, 150, 215, 17);

        jOptions.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jOptions.setForeground(new java.awt.Color(255, 255, 255));
        jOptions.setText("Please select your option:");
        getContentPane().add(jOptions);
        jOptions.setBounds(170, 200, 176, 17);

        jRentButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRentButton.setText("RENT");
        jRentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jRentButton);
        jRentButton.setBounds(160, 230, 90, 40);

        jReturnButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jReturnButton.setText("RETURN");
        jReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jReturnButton);
        jReturnButton.setBounds(260, 230, 90, 40);

        jRedBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/redBackground.jpg"))); // NOI18N
        jRedBackground.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jRedBackground);
        jRedBackground.setBounds(0, 0, 530, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRentButtonActionPerformed
        //Select the movie to rent
           new MovieView().setVisible(true);
            dispose();
        
    }//GEN-LAST:event_jRentButtonActionPerformed

    private void jReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturnButtonActionPerformed
        // show a joptionpane dialog using showConfirmDialog
        
        ImageIcon icon = new ImageIcon("src\\View\\images\\icons\\checked.png");
        int input = JOptionPane.showConfirmDialog(null, 
                " Verify that case is snapped closed properly." + "\n"
                + " Insert the case below green arrow on machine.", "RETURN", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,icon);
        // 0=ok 2=cancel
        if(input == 0){ //if the option selected was ok
            new ReturnOrderView().setVisible(true);
            dispose();
        } 

    }//GEN-LAST:event_jReturnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCards;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jOptions;
    private javax.swing.JLabel jRedBackground;
    private javax.swing.JButton jRentButton;
    private javax.swing.JLabel jRequirements;
    private javax.swing.JButton jReturnButton;
    private javax.swing.JLabel jWelcome;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
