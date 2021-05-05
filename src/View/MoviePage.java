package View;

import Controller.MovieControl;
import DAO.Connect;
import DAO.CategoryDAO;
import Model.Category;
import Model.Movie;
import Model.MoviesTableModel;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Betuyaku
 */
public class MoviePage extends javax.swing.JFrame {

    /**
     * Creates new form MoviePage
     */
    public MoviePage() {
        initComponents();
          //to list the Categories inside the combobox (only for Movies)
        for (Category c: CategoryDAO.ListCategoryType('M')){
            cmbCategory.addItem(c.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblCategory = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovie = new javax.swing.JTable();
        lblMovieImg = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnCartMovie = new javax.swing.JButton();
        btnRentMovie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MOVIES AVAILABLE");

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnShow.setText("SHOW ALL");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        lblSearch.setText("Search:");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblCategory.setText("Category:");

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

        tblMovie.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMovieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMovie);

        lblDescription.setText("Description:");

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtDescription.setRows(5);
        txtDescription.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDescriptionCaretUpdate(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescription);

        btnCartMovie.setText("SEE your CART");
        btnCartMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartMovieActionPerformed(evt);
            }
        });

        btnRentMovie.setText("ADD to CART");
        btnRentMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescription)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnShow)
                        .addGap(18, 18, 18)
                        .addComponent(lblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMovieImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCartMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRentMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShow)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategory)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblMovieImg, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCartMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRentMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new WelcomePage().setVisible(true); //show the WelcomePage when the button is clicked
        dispose(); //close the current screen
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCartMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartMovieActionPerformed
        // When the button Cart is clicked open the Cart Screen
        new Cart().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCartMovieActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // Show All Button
        addToTable();
    }//GEN-LAST:event_btnShowActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Show the Movies while the user is typing
        try { //Connect to the DB
            Connection con = Connect.getConnection();
            //
            String sql = "SELECT Movie.title, Movie.year, Category.name as category, "
                    + "Category.type FROM Movie \n" +
            "inner join Category on Movie.idCategory = Category.id "
                    + "WHERE title like '%"+txtSearch.getText()+"%'";
            Statement command = con.createStatement(); //to excute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
            //Show the search resuts
            DefaultTableModel model;
            model = (DefaultTableModel) tblMovie.getModel();
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

    private void cmbCategoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCategoryKeyReleased
        // Show the Movies, using the filter Category
        int categoryId = 0;
        switch ( cmbCategory.getSelectedIndex() ){
            case 1:
                categoryId = 9;
                break;
        }
        try { //Connect to the DB
             Connection con = Connect.getConnection();
             //SQL query
             String sql = "SELECT Movie.title, Movie.year, Category.name as category, " 
                    + "Category.type FROM Movie "
                    + " inner join Category on Movie.idCategory = Category.id "
                    + "where Movie.idCategory = " + categoryId +";";
            Statement comm = con.createStatement(); // to excute the Database command without any parameters 
            //Result 
            ResultSet result = comm.executeQuery(sql);
            //Show the search resuts
            DefaultTableModel model;
            model = (DefaultTableModel) tblMovie.getModel();
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
//        try { //Connect to the DB
//            Connection con = Connect.getConnection();
//            //
//            String sql = "SELECT * FROM Category WHERE name like '%" + cmbCategory.getSelectedItem() + "%' ";
//            Statement command = con.createStatement(); //to excute the Database command without any parameters
//            //Result 
//            ResultSet result = command.executeQuery(sql);
//        //Show the search resuts
//            DefaultTableModel model;
//            model = (DefaultTableModel) tblMovie.getModel();
//            model.setNumRows(0);
//                while(result.next()){
//                    model.addRow(new Object[]{
//                    result.getString("Title"),
//                    result.getString("Category"),
//                    result.getString("Year"),
//                    });
//                }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }//GEN-LAST:event_cmbCategoryKeyReleased

    private void tblMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMovieMouseClicked
        //when the movie is selected the image should be visible in teh lblMovieImg
        //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        int line = tblMovie.getSelectedRow();
        //txtDescription.setText(tblMovie.getValueAt(line,0).toString());
        // update the search and show the images according the one selected
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("src\\View\\images\\movies\\" + tblMovie.getValueAt(tblMovie.getSelectedRow(), 0)+".jpg").getImage().getScaledInstance(110, 163, Image.SCALE_DEFAULT));
        //testing
        System.out.println("src\\View\\images\\movies\\" + tblMovie.getValueAt(tblMovie.getSelectedRow(), 1)+".jpg");
        lblMovieImg.setIcon(imageIcon);        
    }//GEN-LAST:event_tblMovieMouseClicked

    private void txtDescriptionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDescriptionCaretUpdate
     
    }//GEN-LAST:event_txtDescriptionCaretUpdate

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed

    private void btnRentMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentMovieActionPerformed
        getSelected(tblMovie.getSelectedRow());
        //instanciate the variable cart
        Cart cart = new Cart();

        // show the cart page
        new Cart().setVisible(true);
        //close the SeriePage
        dispose();
    }//GEN-LAST:event_btnRentMovieActionPerformed

    private void cmbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoryItemStateChanged
        // Show the Movies, using the filter Category
        int categoryId = 0;
        switch ( cmbCategory.getSelectedIndex() ){
            case 0:
                categoryId = 7;
                break;
            case 1:
                categoryId = 9;
                break;
            case 2:
                categoryId = 17;
                break;
            case 3:
                categoryId = 18;
                break;
            case 4:
                categoryId = 19;
                break;
            case 5:
                categoryId = 20;
                break;
            case 6:
                categoryId = 21;
                break;
        }
        try {
             Connection con = Connect.getConnection();
        String sql = "SELECT Movie.title, Movie.year, Category.name as category, " 
                    + "Category.type FROM Movie "
                    + " inner join Category on Movie.idCategory = Category.id "
                    + "where Movie.idCategory = " + categoryId +";";
        Statement comm = con.createStatement(); // to excute the Database command without any parameters 
            //Result 
            ResultSet result = comm.executeQuery(sql);
            //Show the search resuts
            DefaultTableModel model;
            model = (DefaultTableModel) tblMovie.getModel();
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
    }//GEN-LAST:event_cmbCategoryItemStateChanged
 
//    public void searchMovie(){
//        //Connect to the DB
//        try {
//             Connection con = Connect.getConnection();
//        String sql = "SELECT Movie.title, Movie.year, Category.name as category, "
//                    + "Category.type FROM Movie " +
//                    "inner join Category on Movie.idCategory = Category.id";
//        Statement comm = con.createStatement(); // to excute the Database command without any parameters 
//            //Result 
//            ResultSet result = comm.executeQuery(sql);
//            //Show the search resuts View --->controller ---->database____controller ---->view
//            DefaultTableModel model;
//            model = (DefaultTableModel) tblMovie.getModel();
//            model.setNumRows(0);
//                while(result.next()){
//                    model.addRow(new Object[]{
//                    result.getString("Title"),
//                    result.getString("Category"),
//                    result.getString("Year"),
//                    });
//                }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    void addToTable(){
        //add movies into tblMovies
        MovieControl mc = new MovieControl();
        Movie[] movies = mc.getAllMoviesFromDb();
        MoviesTableModel model = new MoviesTableModel(movies);
        tblMovie.setModel(model);
        tblMovie.repaint();       
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
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartMovie;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRentMovie;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblMovieImg;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblMovie;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    //declaring the variables
    private String title;
    private String category;
    private double price;
    private String description;
    
private void getSelected(int selectedRow) {
        //select a Movie in the table
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            String sql = "SELECT Movie.title, Category.name as category, price FROM Priscilla_2019217.Movie\n"
                    + "inner join Category on Movie.idCategory = Category.id\n"
                    + "where idMovie =" + (selectedRow + 1) + ";";
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
