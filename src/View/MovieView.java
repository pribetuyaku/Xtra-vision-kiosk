package View;

import Controller.MovieControl;
import DAO.Connect;
import Model.MovieModel;
import Model.MoviesTableModel;
import Model.RentCartMovieModel;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import java.util.*;

/**
 *
 * @author Betuyaku
 */
public class MovieView extends javax.swing.JFrame {

    /**
     * Creates new form MovieView
     */
    public MovieView() {
        initComponents();
          //to list the Categories inside the combobox (only for Movies)
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovie = new javax.swing.JTable();
        lblMovieImg = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnSeeCart = new javax.swing.JButton();
        btnAddCart = new javax.swing.JButton();

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

        btnShowAll.setText("SHOW ALL");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        lblSearch.setText("Search:");

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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescription)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnShowAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnSeeCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(btnShowAll)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(btnSeeCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new WelcomeView().setVisible(true); //show the WelcomeView when the button is clicked
        dispose(); //close the current screen
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSeeCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeCartActionPerformed
        // When the button CartView is clicked open the CartView Screen
        new CartView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSeeCartActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        // Show All Button
        addToTable();
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Show the Movies while the user is typing
        try { //Connect to the DB
        
            Connection con = Connect.getConnection();
            String sql = "SELECT Movie.idMovie, Movie.title, Movie.year, Category.name as category, "
                    + "Category.type FROM Movie \n" +
            "inner join Category on Movie.idCategory = Category.id "
                    + "WHERE title like '%"+txtSearch.getText()+"%'";
            Statement command = con.createStatement(); //to execute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
            //Show the search resuts
            List<MovieModel> moviesList = new ArrayList<>();
                while(result.next()){
                    moviesList.add(new MovieModel(result.getInt("idMovie"), 
                            result.getString("title"), 
                            result.getString("category"), 
                            result.getInt("year")));
                }
                //instantiate the MovieModel to Array
                MovieModel[] movies = moviesList.toArray(new MovieModel[moviesList.size()]);
                MoviesTableModel model = new MoviesTableModel(movies);
                //populate the tblMovie
                tblMovie.setModel(model);
                tblMovie.getColumnModel().getColumn(0).setWidth(0);
                tblMovie.getColumnModel().getColumn(0).setMinWidth(0);
                tblMovie.getColumnModel().getColumn(0).setMaxWidth(0);
        
                tblMovie.repaint(); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMovieMouseClicked
        //when the movie is selected the image should be visible in teh lblMovieImg
        //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        int line = tblMovie.getSelectedRow();
        //txtDescription.setText(tblMovie.getValueAt(line,0).toString());
        // update the search and show the images according the one selected
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("src\\View\\images\\movies\\"
                + tblMovie.getValueAt(tblMovie.getSelectedRow(), 0)+".jpg").getImage().getScaledInstance(110, 163, Image.SCALE_DEFAULT));
        //testing
        System.out.println("src\\View\\images\\movies\\" + tblMovie.getValueAt(tblMovie.getSelectedRow(), 1)+".jpg");
        lblMovieImg.setIcon(imageIcon);        
    }//GEN-LAST:event_tblMovieMouseClicked

    private void txtDescriptionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDescriptionCaretUpdate
     
    }//GEN-LAST:event_txtDescriptionCaretUpdate

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
            // show the cart page using casting
            MovieModel movie = (MovieModel)tblMovie.getValueAt(tblMovie.getSelectedRow(), 0);
            RentCartMovieModel.getCurrentCart().addMovie(movie);
    }//GEN-LAST:event_btnAddCartActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed
 

    void addToTable(){
        //add movies into tblMovies
        MovieControl mc = new MovieControl();
        MovieModel[] movies = mc.getAllMoviesFromDb();
        MoviesTableModel model = new MoviesTableModel(movies);
    //testing to show the Cart content
    //MoviesTableModel model2 = new MoviesTableModel(RentCartMovieModel.getCurrentCart().getMoviesFromCart());
        tblMovie.setModel(model);
        tblMovie.getColumnModel().getColumn(0).setWidth(0);
        tblMovie.getColumnModel().getColumn(0).setMinWidth(0);
        tblMovie.getColumnModel().getColumn(0).setMaxWidth(0);
        
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
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSeeCart;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblMovieImg;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblMovie;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    
//declaring the variables
    private int id;
    private String title;
    private String category;
    private double price;
    private String description;
    
private void getSelected(int idMovieSelectedRow) {
        //select a MovieModel in the table
        try { // Connect to the DB
            Connection con = Connect.getConnection();
            String sql = "SELECT Movie.title, Category.name as category, price FROM Priscilla_2019217.Movie\n"
                    + "inner join Category on Movie.idCategory = Category.id\n"
                    + "where idMovie =" + (idMovieSelectedRow) + ";";
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
