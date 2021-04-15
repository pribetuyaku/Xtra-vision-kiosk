
package DAO;

import Model.Movie;
import Model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Betuyaku
 */
public class MovieDAO {
    //method insert movie into the DB
    public static boolean insertMovie (Movie movie){
        try {
            //open the connection
            Connection connect =  Connect.getConnection();
            //SQL insert instructions
            String sql = "INSERT INTO Movie(title, category, year, description) " + "VALUES(?,?)";
            PreparedStatement command = connect.prepareStatement(sql);
            //insert the movies into the DB according each column
            command.setString(1, String.valueOf(movie.getTitle()));
            command.setString(2, String.valueOf(movie.getCategory()));
            command.setString(3, String.valueOf(movie.getYear()));
            command.setString(4, String.valueOf(movie.getDescription()));
            //execute the query
            command.execute();
            //close the connection
            command.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean deleteMovie (int id){
        try {
            //open the connection
            Connection connecta = Connect.getConnection();
            //sql query, one regiter per time
            String sql = "DELETE FROM Movie WHERE id = ?";
            PreparedStatement command = connecta.prepareStatement(sql);
            command.setInt(1, id); //identify the id selected to delete from the DB
            int nLines = command.executeUpdate();
            command.close();
            return nLines > 0; //if the lines will be greater than 0 the register was modified 
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } 
    }
    public static List<Movie> listMovie(){
        List<Movie> liMovie = new ArrayList<Movie>();
        //list all the movies from the Database
            try {
            Connection con = Connect.getConnection();
            String sql = "SELECT * FROM Movie";
            Statement st = con.createStatement(); // to excute the Database command without any parameters
            //Result 
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                Category category = new Category();
                category.setId(result.getInt(""));
            }
            result.close();
            command.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return movie;
    }
}
