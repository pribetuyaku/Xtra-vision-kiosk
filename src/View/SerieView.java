package View;

import Controller.SeriesControl;
import DAO.CategoryDAO;
import DAO.Connect;
import Model.CategoryModel;
import Model.RentCartMovieModel;
import Model.SerieModel;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import Model.SerieTableModel;
import java.util.*;
/**
 *
 * @author Betuyaku
 */
public class SerieView extends javax.swing.JFrame {
   
    /**
     * Creates new form SerieView
     */
    public SerieView() {
       initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSerie = new javax.swing.JLabel();
        lblSerieImage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome = new javax.swing.JButton();
        jSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSerie = new javax.swing.JTable();
        btnShowAll = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnSeeCart = new javax.swing.JButton();
        btnAddCart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSerie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSerie.setText("PICK YOUR SERIE");

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jSearch.setText("Search:");

        txtSearch.setToolTipText("");
        txtSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCaretUpdate(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tblSerie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Category", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSerie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblSerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSerieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSerie);

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

        btnSeeCart.setText("SEE your CART");
        btnSeeCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeCartActionPerformed(evt);
            }
        });

        btnAddCart.setText("ADD to CART");
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
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
                            .addComponent(btnSeeCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome))
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
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(btnSeeCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCart))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new WelcomeView().setVisible(true); //show the WelcomeView when the button is clicked
        dispose(); //close the current screen
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        // Show All Button
         addToTable();
    }//GEN-LAST:event_btnShowAllActionPerformed

    void addToTable(){
    //add Series into tblSeries
    SeriesControl sc = new SeriesControl();
    SerieModel[] series = sc.getAllSeriesFromDb();
    SerieTableModel tbmodel = new SerieTableModel(series);
    tblSerie.setModel(tbmodel);
    tblSerie.getColumnModel().getColumn(0).setWidth(0);
    tblSerie.getColumnModel().getColumn(0).setMinWidth(0);
    tblSerie.getColumnModel().getColumn(0).setMaxWidth(0);
    
    tblSerie.repaint();
    }
    
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Show the Series while the user is typing
         try { //Connect to the DB
            Connection con = Connect.getConnection();
            String sql = "SELECT Series.idSeries, Series.title, Series.year, Category.name as category, "
                    + "Category.type FROM Series \n" +
            "inner join Category on Series.idCategory = Category.id "
                    + "WHERE title like '%"+txtSearch.getText()+"%'";
            Statement command = con.createStatement(); //to execute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
            //Show the search resuts
            List<SerieModel> serieList = new ArrayList<>();
                while(result.next()){
                    serieList.add(new SerieModel(result.getInt("idSerie"),
                    result.getString("title"),
                    result.getString("category"),
                    result.getInt("year")));
                }
                SerieModel[] serie = serieList.toArray(new SerieModel[serieList.size()]);
                SerieTableModel serieModel = new SerieTableModel(serie);
                tblSerie.setModel(serieModel);
                tblSerie.getColumnModel().getColumn(0).setWidth(0);
                tblSerie.getColumnModel().getColumn(0).setMinWidth(0);
                tblSerie.getColumnModel().getColumn(0).setMaxWidth(0);
        
                tblSerie.repaint();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblSerieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSerieMouseClicked
        //when the serie is selected the image should be visible in teh lblSerieImage
        //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        int line = tblSerie.getSelectedRow();
        //txtDescription.setText(tblSerie.getValueAt(line, 0).toString());
        // update the search and show the images according the one selected
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("src\\View\\images\\series\\"
                + tblSerie.getValueAt(tblSerie.getSelectedRow(), 0)+".jpg").getImage().getScaledInstance(110, 163, Image.SCALE_DEFAULT));
        //testing
        System.out.println("src\\View\\images\\series\\" + tblSerie.getValueAt(tblSerie.getSelectedRow(), 1)+".jpg");
        lblSerieImage.setIcon(imageIcon);
    }//GEN-LAST:event_tblSerieMouseClicked

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCaretUpdate
    
    }//GEN-LAST:event_txtSearchCaretUpdate

    private void txtDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyReleased
     
    }//GEN-LAST:event_txtDescriptionKeyReleased

    private void txtDescriptionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDescriptionCaretUpdate
        
    }//GEN-LAST:event_txtDescriptionCaretUpdate

    private void btnSeeCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeCartActionPerformed
        // When the button CartView is clicked open the CartView Screen
        new CartView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSeeCartActionPerformed

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
        //casting
        SerieModel serieModel = (SerieModel) tblSerie.getValueAt(tblSerie.getSelectedRow(), 0);
        RentCartMovieModel.getCurrentCart().addSerie(serieModel);
        RentCartMovieModel.getCurrentCart().test();
        
    }//GEN-LAST:event_btnAddCartActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

  
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
            java.util.logging.Logger.getLogger(SerieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerieView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSeeCart;
    private javax.swing.JButton btnShowAll;
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

private void getSelected(int idSerieSelectedRow) {
        //select a Series in the table
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            //SQL query
            String sql = "SELECT Serie.title, Category.name as category, price FROM Priscilla_2019217.Series "
                    + "inner join Category on Series.idCategory = Category.id "
                    + "where idSeries =" + (idSerieSelectedRow) + ";";
            // to excute the Database command without any parameters
            PreparedStatement ps = con.prepareStatement(sql); 
            //Result 
            ResultSet result = ps.executeQuery(sql);
            //Show the search resuts
            while (result.next()) {
                title = result.getString("title");
                category = result.getString("category");
                price = result.getDouble("price");
            }
            System.out.println(title + " " + category + " " + price);
            //inserting data into the table
            insertSelected(title, category, price);
        } catch (Exception e) {

        }
    }
    //declaring the variables
    private int id;
    private String title;
    private String category;
    private double price;
    private String description;

    private void insertSelected(String title, String category, double price) {
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            //SQL query
            String sql = "INSERT into cart (title, category, price)"
                    + "values (?,?,?);";
            // to excute the Database command without any parameters
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(1, title);
            ps.setString(2, category);
            ps.setDouble(3, price);
            ps.execute();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}