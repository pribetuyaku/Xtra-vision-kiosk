
package DAO;

import Model.Category;
import Model.Serie;
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
public class SerieDAO {
    public static boolean insertSerie(Serie serie){
        try {
            //open the connection
            Connection connecta = Connect.getConnection();
            //SQL query
            String sql = "INSERT INTO Series(title, description, price, nRentDays "
                    + "category, year) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = connecta.prepareStatement(sql);
            ps.setString(1, serie.getTitle());
            ps.setString(2, serie.getDescription());
            ps.setDouble(3, serie.getPrice());
            ps.setInt(4, serie.getnRentDays());
            ps.setString(5, serie.getCategory().getName());
            ps.setInt(6, serie.getYear());
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
    
    public static boolean updateSerie(Serie serie){
        try {
            //open the connection
            Connection connecta = Connect.getConnection();
            //SQL query
            String sql = "UPDATE Series SET "
                    + "(title=?, description=?, price=?, nRentDays=? "
                    + "category=?, year=?"
                    + "WHERE id=?)";
            PreparedStatement ps = connecta.prepareStatement(sql);
            ps.setString(1, serie.getTitle());
            ps.setString(2, serie.getDescription());
            ps.setDouble(3, serie.getPrice());
            ps.setInt(4, serie.getnRentDays());
            ps.setString(5, serie.getCategory().getName());
            ps.setInt(6, serie.getYear());
            ps.setInt(7, serie.getId());
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
    
    public static boolean deleteSerie(int id){
        try {
            //open the connection
            Connection connecta = Connect.getConnection();
            //SQL query
            String sql = "DELETE FROM Series WHERE id=?)";
            PreparedStatement ps = connecta.prepareStatement(sql);
            ps.setInt(1, id);
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
    
    public static List<Serie> listSerie(){ //list of Series
        //Create a ArrayList of Series
        List<Serie> liSerie = new ArrayList<Serie>();
        try {
            //open the connection with DB
            Connection conn = Connect.getConnection();
            //SQL query
            String sql = "SELECT * FROM Serie";
            //create the search statement inside the DB and show the result
            Statement st = conn.createStatement();
            //Result
            ResultSet res = st.executeQuery(sql);
            while(res.next()){ //while there is any register
                Category cat = new Category(); //built a category
                cat.setName(res.getString("category"));
                
                Serie se = new Serie(cat); //Associates the Category to the Serie
                se.setTitle(res.getString("title"));
                se.setDescription(res.getString("description"));
                se.setPrice(res.getDouble("price"));
                se.setnRentDays(res.getInt("nRentDays"));
                se.setYear(res.getInt("year"));
                
                //add this Serie inside my listSerie
                liSerie.add(se);
             } res.close();
             st.close();
        } catch (Exception e) {
            System.out.println(e);
        } return liSerie;
    }
}
