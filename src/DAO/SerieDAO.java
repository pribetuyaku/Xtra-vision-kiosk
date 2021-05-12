
package DAO;

import Model.CategoryModel;
import Model.SerieModel;
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
    private List<SerieModel> liSerie;
    public static boolean insertSerie(SerieModel serie){
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
    
    public static boolean updateSerie(SerieModel serie){
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
    
        public static List<SerieModel> listSerie(){ //list of Series
        //Create a ArrayList of Series
        List<SerieModel> liSerie = new ArrayList<SerieModel>();
        try {
            //open the connection with DB
            Connection conn = Connect.getConnection();
            //SQL query
            String sql = "SELECT Series.title, Series.year, Category.name as category, "
                    + "Category.type FROM Series " +
                    "inner join Category on Series.idCategory = Category.id";
            //create the search statement inside the DB and show the result
            Statement st = conn.createStatement();
            //Result
            ResultSet res = st.executeQuery(sql);
            while(res.next()){ //while there is any register
                CategoryModel cat = new CategoryModel(); //built a category
                cat.setId(res.getInt("id"));
                cat.setName(res.getString("idCategory"));
                cat.setType(res.getString("type").charAt(0));
                
                SerieModel se = new SerieModel(cat); //Associates the CategoryModel to the SerieModel
                se.setTitle(res.getString("title"));
                se.setDescription(res.getString("description"));
                se.setPrice(res.getDouble("price"));
                se.setnRentDays(res.getInt("nRentDays"));
                se.setYear(res.getInt("year"));
                
                //add this SerieModel inside my listSerie
                liSerie.add(se);
             } 
                res.close();
                st.close();
        } catch (Exception e) {
            System.out.println(e);
        } return liSerie;
    }
}
