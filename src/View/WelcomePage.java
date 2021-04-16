
package View;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author Betuyaku
 */
public class WelcomePage extends javax.swing.JFrame {

    /**
     * Creates new form WelcomePage
     */
    public WelcomePage() {
        initComponents();
        setSize(529, 352);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jWelcome = new javax.swing.JLabel();
        jRequirements = new javax.swing.JLabel();
        jCards = new javax.swing.JLabel();
        jOptions = new javax.swing.JLabel();
        jRentButton = new javax.swing.JButton();
        jReturnButton = new javax.swing.JButton();
        jRedBackground = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jCart = new javax.swing.JMenuItem();
        jExit = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jWelcome.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jWelcome.setText("WELCOME TO XTRA-VISION RENTAL KIOSK");
        getContentPane().add(jWelcome);
        jWelcome.setBounds(40, 40, 440, 30);

        jRequirements.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRequirements.setForeground(new java.awt.Color(255, 255, 255));
        jRequirements.setText("NO membership or sing-up required.");
        getContentPane().add(jRequirements);
        jRequirements.setBounds(150, 90, 222, 17);

        jCards.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCards.setForeground(new java.awt.Color(255, 255, 255));
        jCards.setText("CREDIT and DEBIT Card Accepted!");
        getContentPane().add(jCards);
        jCards.setBounds(150, 120, 215, 17);

        jOptions.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jOptions.setForeground(new java.awt.Color(255, 255, 255));
        jOptions.setText("Please select your option:");
        getContentPane().add(jOptions);
        jOptions.setBounds(170, 170, 176, 17);

        jRentButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRentButton.setText("RENT");
        jRentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jRentButton);
        jRentButton.setBounds(160, 200, 90, 40);

        jReturnButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jReturnButton.setText("RETURN");
        getContentPane().add(jReturnButton);
        jReturnButton.setBounds(260, 200, 90, 40);

        jRedBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/redBackground.jpg"))); // NOI18N
        jRedBackground.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jRedBackground);
        jRedBackground.setBounds(0, 0, 530, 300);

        jMenuFile.setText("File");

        jCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/baseline_shopping_cart_black_24dp.png"))); // NOI18N
        jCart.setText("Cart");
        jMenuFile.add(jCart);

        jExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/baseline_exit_to_app_black_24dp.png"))); // NOI18N
        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jExit);

        jMenuBar.add(jMenuFile);

        setJMenuBar(jMenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRentButtonActionPerformed
        //Select the option to rent
        String[] options = {"", "Movies", "Series"};
        ImageIcon icon = new ImageIcon("src\\View\\images\\icons\\movie.png");
        String ask = (String)JOptionPane.showInputDialog(null, "What do you want to rent?",
                "RENT OPTIONS", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
        if(ask == "Movies"){ //if the option selected was Movies, open the MoviePage
            new MoviePage().setVisible(true);
            dispose();
        } else if (ask == "Series"){ //otherwise, open SeriePage
            new SeriePage().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jRentButtonActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
      
    }//GEN-LAST:event_jExitActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCards;
    private javax.swing.JMenuItem jCart;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JLabel jOptions;
    private javax.swing.JLabel jRedBackground;
    private javax.swing.JButton jRentButton;
    private javax.swing.JLabel jRequirements;
    private javax.swing.JButton jReturnButton;
    private javax.swing.JLabel jWelcome;
    // End of variables declaration//GEN-END:variables
}