
package View;

import DAO.CategoryDAO;
import DAO.Connect;
import Model.Serie;
import Model.Category;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Betuyaku
 */
public class SeriePage extends javax.swing.JFrame {
   
    /**
     * Creates new form SeriePage
     */
    public SeriePage() {
        initComponents();
        //to list the Categories inside the combobox (only for Series)
        for (Category c: CategoryDAO.ListCategoryType('S')){
            cmbCategory.addItem(c.getName());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSerie = new javax.swing.JLabel();
        lblSerieImage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jHomeButton = new javax.swing.JButton();
        jSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSerie = new javax.swing.JTable();
        btnShowAll = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnCart = new javax.swing.JButton();
        btnRent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSerie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSerie.setText("PICK YOUR SERIE");

        jHomeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jHomeButton.setText("HOME");
        jHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeButtonActionPerformed(evt);
            }
        });

        jSearch.setText("Search:");

        txtSearch.setToolTipText("");
        txtSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCaretUpdate(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setText("Category:");

        cmbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoryItemStateChanged(evt);
            }
        });
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });
        cmbCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbCategoryKeyReleased(evt);
            }
        });

        tblSerie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblSerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSerieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSerie);
        tblSerie.getAccessibleContext().setAccessibleParent(cmbCategory);

        btnShowAll.setText("SHOW ALL");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        txtDescription.setEditable(false);
        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDescriptionCaretUpdate(evt);
            }
        });
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescription);
        txtDescription.getAccessibleContext().setAccessibleParent(txtSearch);

        jLabel2.setText("Description:");

        btnCart.setText("SEE your CART");
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });

        btnRent.setText("ADD to CART");
        btnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnShowAll)
                        .addGap(18, 18, 18)
                        .addComponent(jSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jHomeButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSerieImage, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSerie)
                    .addComponent(jHomeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSerieImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRent))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeButtonActionPerformed
        new WelcomePage().setVisible(true); //show the WelcomePage when the button is clicked
        dispose(); //close the current screen
    }//GEN-LAST:event_jHomeButtonActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        // Search Button
        searchSerie();
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Show the Series while the user is typing
        try { //Connect to the DB
            Connection con = Connect.getConnection();
            //
            String sql = "SELECT Series.title, Series.year, Category.name as category, "
                    + "Category.type FROM Series \n" +
            "inner join Category on Series.idCategory = Category.id "
                    + "WHERE title like '%"+txtSearch.getText()+"%'";
            Statement command = con.createStatement(); //to excute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
        //Show the search resuts
            DefaultTableModel model;
            model = (DefaultTableModel) tblSerie.getModel();
            model.setNumRows(0);
                while(result.next()){
                    model.addRow(new Object[]{
                    result.getString("Title"),
                    result.getString("Category"),
                    result.getString("Year"),
                    });
                }
        } catch (Exception e) {
            System.out.println(e);
        }
        
             
        
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblSerieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSerieMouseClicked
        
        int line = tblSerie.getSelectedRow();
        txtDescription.setText(tblSerie.getValueAt(line, 0).toString());
    }//GEN-LAST:event_tblSerieMouseClicked

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCaretUpdate
         
     
    }//GEN-LAST:event_txtSearchCaretUpdate

    private void txtDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyReleased
     
        
    }//GEN-LAST:event_txtDescriptionKeyReleased

    private void txtDescriptionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDescriptionCaretUpdate
        // update the search and show the images according the one selected
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("src\\View\\images\\series\\" + txtDescription.getText()+".jpg").getImage().getScaledInstance(110, 163, Image.SCALE_DEFAULT));
        lblSerieImage.setIcon(imageIcon);
    }//GEN-LAST:event_txtDescriptionCaretUpdate

    private void cmbCategoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCategoryKeyReleased
         // Show the Series, using the filter Category
        try { //Connect to the DB
            Connection con = Connect.getConnection();
            //
            String sql = "SELECT * FROM Category WHERE name like '%" + cmbCategory.getSelectedItem() + "%' ";
            Statement command = con.createStatement(); //to excute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
        //Show the search resuts
            DefaultTableModel model;
            model = (DefaultTableModel) tblSerie.getModel();
            model.setNumRows(0);
                while(result.next()){
                    model.addRow(new Object[]{
                    result.getString("Title"),
                    result.getString("Category"),
                    result.getString("Year"),
                    });
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cmbCategoryKeyReleased

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        // When the button Cart is clicked open the Cart Screen
        new Cart().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCartActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed

    private void cmbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoryItemStateChanged
//        String query = cmbCategory.getSelectedItem().toString();
//        filter(query);
    }//GEN-LAST:event_cmbCategoryItemStateChanged

    private void btnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentActionPerformed
        new Payment().setVisible(true); //show the Payment when the button is clicked
        dispose(); //close the current screen
    }//GEN-LAST:event_btnRentActionPerformed
   
    public void searchSerie(){
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            String sql = "SELECT Series.title, Series.year, Category.name as category, "
                    + "Category.type FROM Series " +
            "inner join Category on Series.idCategory = Category.id";
            Statement command = con.createStatement(); // to excute the Database command without any parameters 
            //Result 
            ResultSet result = command.executeQuery(sql);
            //Show the search resuts
            DefaultTableModel tbmodel;
            //get the table model
            tbmodel = (DefaultTableModel) tblSerie.getModel();
            tbmodel.setNumRows(0);
                while(result.next()){
                    tbmodel.addRow(new Object[]{
                    result.getString("Title"),
                    result.getString("Category"),
                    result.getString("Year"),
                    });
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
  
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
            java.util.logging.Logger.getLogger(SeriePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeriePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeriePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeriePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeriePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnRent;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JButton jHomeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jSerie;
    private javax.swing.JLabel lblSerieImage;
    private javax.swing.JTable tblSerie;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
