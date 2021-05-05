
package Controller;

import DAO.Connect;
import Model.Movie;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Betuyaku
 */
//method to store the list of movies into an Array of movies
public class MovieControl {
    
        public Movie[] getAllMoviesFromDb(){
        ArrayList<Movie> movies = new ArrayList<>();
        //Connect to the DB
        try {
            Connection con = Connect.getConnection();
            //SQL query
            String sql = "SELECT Movie.idMovie, Movie.title, Movie.year, Category.name as category, "
                    + "Category.type FROM Movie " +
                    "inner join Category on Movie.idCategory = Category.id";
            Statement comm = con.createStatement(); // to excute the Database command without any parameters 
            //Result 
            ResultSet result = comm.executeQuery(sql);
            //Show the search resuts 
                while(result.next()){
                    //create the object to populate the table
                    Movie movie = new Movie(result.getInt(1),result.getString(2),result.getString(4),
                            result.getInt(3));
                    //add the array into the object
                    movies.add(movie);
                }
                comm.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        for(int i = 0; i<movies.size();i++){
            System.out.println(movies.get(i).getTitle());
        }
        return movies.toArray(new Movie[movies.size()]);
    }
        
   
    
    
}
