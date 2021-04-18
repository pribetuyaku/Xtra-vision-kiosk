
package DAO;

import java.sql.Connection;
import Model.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Betuyaku
 */
public class CategoryDAO { 
    //insert a data into the database but return the result true or false(boolean)
    //just to make sure if works
    public static boolean insert(Category category){
        try {
            //open connection
            Connection connect = Connect.getConnection();
            //set the instructions into the SQL
            String sql = "INSERT INTO Category(name, type) " + "VALUES(?,?)";
            PreparedStatement command = connect.prepareStatement(sql);
            //Insert the values into the Database
            command.setString(1, category.getName());
            command.setString(2, String.valueOf(category.getType()));
            //execute
            command.execute();
            //close the connection
            command.close();
            return true;
        } catch (Exception e) {
            return false;
        }
                         
    }
    
    public static boolean delete (int id){
        try {
            //open connection
            Connection con = Connect.getConnection();
            //set the instructions into the SQL
            //only one register per time
            String sql = "DELETE FROM Category WHERE id = ?";
            PreparedStatement command = con.prepareStatement(sql);
            command.setInt(1, id); //take the name to delete
            //take the type to change but Change to String
            //execute and update
            int numLines = command.executeUpdate();
            //close the connection
            command.close();
            return numLines > 0; // if the numLines will be greater than 0, the register was modiefied
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
   
    public static boolean update(Category category){
        try {
            //open connection
            Connection conn = Connect.getConnection();
            //set the instructions into the SQL and change one register per time
            String sql = "UPDATE Category SET "
                    + "name = ?, "
                    + "tipo = ? "
                    + "WHERE id = ? ";
            PreparedStatement command = conn.prepareStatement(sql);
            //change the values into the Database
            command.setString(1, category.getName()); //take the name to change
            command.setString(2, String.valueOf(category.getType())); //take the type to change but Change to String
            command.setInt(3, category.getId());
            
            int nLine = command.executeUpdate();
            return nLine > 0;
        } catch (Exception e) {
           
        } return false;
    }
    
    public static ArrayList<Category> ListCategory(){ //list all the categories from the Database
        ArrayList<Category> categories = new ArrayList<Category>();
        try {
            Connection con = Connect.getConnection();
            String sql = "SELECT * FROM Category";
            Statement command = con.createStatement(); // to excute the Database command without any parameters
            //Result 
            ResultSet result = command.executeQuery(sql);
            while(result.next()){
                Category c = new Category();
                c.setId(result.getInt("id"));
                c.setName(result.getString("name"));
                c.setType(result.getString("type").charAt(0));
                categories.add(c);
            }
            result.close();
            command.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }
    
    public static ArrayList<Category> ListCategoryType(char type){ //list all the categories from the Database
        ArrayList<Category> categories = new ArrayList<Category>();
        try {
            Connection con = Connect.getConnection();
            String sql = "SELECT * FROM Category WHERE type = ?";
            PreparedStatement command = con.prepareStatement(sql); // to excute the Database command with parameters
            command.setString(1, String.valueOf(type));
            //Result 
            ResultSet result = command.executeQuery();
            while(result.next()){
                Category c = new Category();
                c.setId(result.getInt("id"));
                c.setName(result.getString("name"));
                c.setType(type);
                categories.add(c);
            }
            result.close();
            command.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }
}
