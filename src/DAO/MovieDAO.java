
package DAO;

import Model.MovieModel;
import Model.CategoryModel;
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
    private List<MovieModel> listMovie;
    //method insert movie into the DB
    public static boolean insertMovie (MovieModel movie){
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
    
        public static boolean updateMovie(MovieModel movie){
        try {
            //open the connection
            Connection connecta = Connect.getConnection();
            //SQL query
            String sql = "UPDATE Movie SET "
                    + "(title=?, description=?, price=?, nRentDays=? "
                    + "category=?, year=?"
                    + "WHERE id=?)";
            PreparedStatement ps = connecta.prepareStatement(sql);
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getDescription());
            ps.setDouble(3, movie.getPrice());
            ps.setInt(4, movie.getnRentDays());
            ps.setString(5, movie.getCategory().getName());
            ps.setInt(6, movie.getYear());
            ps.setInt(7, movie.getId());
            //execute and update
            int result = ps.executeUpdate();
            //close the connection
            ps.close();
            return result > 0; //if the result is greater than 0(true) so the update was done
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } 
    }
    
    public static List<MovieModel> listMovie(){
        //Create a ArrayList of Movies
        List<MovieModel> liMovie = new ArrayList<MovieModel>();
        try {
            //open the connection with DB
            Connection con = Connect.getConnection();
            //SQL Query
            String sql = "SELECT Movie.title, Movie.year, Category.name as category, " 
                    + "Category.type FROM Movie " +
                    "inner join Category on Movie.idCategory = Category.id";
            // to excute the Database command without any parameters
            Statement st = con.createStatement(); 
            //Result 
            ResultSet result = st.executeQuery(sql);
            while(result.next()){//while there is any register
                CategoryModel categ = new CategoryModel();//built a category
                categ.setId(result.getInt("id"));
                categ.setName(result.getString("idCategory"));
                categ.setType(result.getString("type").charAt(0));
                
                MovieModel mv = new MovieModel(categ);//Associates the CategoryModel to the MovieModel
                mv.setTitle(result.getString("title"));
                mv.setDescription(result.getString("description"));
                mv.setPrice(result.getDouble("price"));
                mv.setYear(result.getInt("year"));
                mv.setnRentDays(result.getInt("nRentDays"));
                
                //add this MovieModel inside my llistMovie
                liMovie.add(mv);
                
            }
            result.close();
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return liMovie;
    }
}
