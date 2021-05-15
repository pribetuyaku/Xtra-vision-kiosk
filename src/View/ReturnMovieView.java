
package View;

import DAO.Connect;
import Model.MovieModel;
import Model.MoviesTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Betuyaku
 */
public class ReturnMovieView extends javax.swing.JFrame {
    private int orderId;
    /**
     * Creates new form ReturnMovieView
     */
    public ReturnMovieView(int id) {
        this.orderId = id;
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReturn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturn = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblReturn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblReturn.setText("MOVIES TO RETURN:");

        tblReturn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReturnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReturn);

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblReturn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHome))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReturn)
                    .addComponent(btnHome))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //call to addMoviesToView
        addMoviesToView();
    }//GEN-LAST:event_formWindowOpened

    private void tblReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReturnMouseClicked
      //when the row is clicked the softwawe will aske to user if they want to return the movie
      int row = tblReturn.getSelectedRow();
      MovieModel movieId = (MovieModel)tblReturn.getValueAt(row, 0);
      int i = JOptionPane.showConfirmDialog(this,"Do you want to return thi movie?","", JOptionPane.YES_NO_OPTION);
      if (i == 0){
          returnMovie(movieId.getIdMovie());
      }
    }//GEN-LAST:event_tblReturnMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // When the button Back is clicked open the ReturnOrderView
        new ReturnOrderView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        //Show the WelcomeView
        new WelcomeView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnHome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReturn;
    private javax.swing.JTable tblReturn;
    // End of variables declaration//GEN-END:variables
    
    void addMoviesToView(){
        
        //add movies into tblReturn following the OOC
        MovieModel[] movies = getMoviesFromOrder();
        MoviesTableModel model = new MoviesTableModel(movies);

        tblReturn.setModel(model);
        tblReturn.getColumnModel().getColumn(0).setWidth(0);
        tblReturn.getColumnModel().getColumn(0).setMinWidth(0);
        tblReturn.getColumnModel().getColumn(0).setMaxWidth(0);

        tblReturn.repaint();  
    }

    private MovieModel[] getMoviesFromOrder() {
       //create a ArrayList of Movies
       ArrayList<MovieModel> movies = new ArrayList<>();
                
       try{
           //open the connection with thhe DB
            Connection con = Connect.getConnection();
            //SQL query to show the content into the OrdemItem + MoviesRented
            String query = "SELECT Movie.idMovie, Movie.title, Movie.year, Category.name as category, \n" +
                    "Category.type ,Movie.statusMovie FROM Movie \n" +
                    "inner join Category  on Movie.idCategory = Category.id \n" +
                    "inner join OrderItem oi on Movie.idMovie = oi.OrderMovieId\n" +
                    "WHERE oi.OrderId = "+orderId;
            Statement comm = con.createStatement(); // to excute the Database command without any parameters
            //Show the resultSet
            ResultSet result = comm.executeQuery(query);
            while(result.next()){
                // u = unavailable and a= available ---> StatusMovie
                if(result.getString(6).equalsIgnoreCase("u")){
                   //create the object to populate the table
                    MovieModel movie = new MovieModel(result.getInt(1),result.getString(2),
                            result.getString(4), result.getInt(3));
                    //add the array into the object
                    movies.add(movie);
                }    
            }
            
       }catch(Exception e){
       
       }
        return movies.toArray(new MovieModel[movies.size()]);
    }  
    
    private void returnMovie(int id) {
        try{
            //Open the Connection with the DB
            Connection con = Connect.getConnection();
            //SQL query to change the statusMovie when the idOrder is typed
            String query = "update Movie set statusMovie = 'a' where idMovie = "+id;
                    
            Statement comm = con.createStatement(); // to excute the Database command without any parameters
            comm.execute(query);
            
            
       }catch(Exception e){
       
       }
       addMoviesToView();
    }
    
}

