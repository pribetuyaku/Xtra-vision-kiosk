
package DAO;

import java.sql.Connection;
import Model.Category;
import java.sql.PreparedStatement;

/**
 *
 * @author Betuyaku
 */
public class CategoryDAO { 
    //inser a data into the database but return the result true or false(boolean)
    //just to make sure if works
    public static boolean insert(Category Category){
        try {
            //open connection
            Connection connect = Connect.getConnection();
            //set the instructions into the SQL
            String sql = "INSERT INTO Category(name, type) " + "VALUES(?,?)";
            PreparedStatement command = connect.prepareStatement(sql);
            //Insert the values into the Database
            command.setString(1, Category.getName());
            command.setString(2, String.valueOf(Category.getType()));
            //execute
            command.execute();
            //close the connection
            command.close();
            return true;
        } catch (Exception e) {
            return false;
        }
                         
    }
    
    public static boolean update (Category Category){
        try {
            //open connection
            Connection con = Connect.getConnection();
            //set the instructions into the SQL
            //only one register per time
            String sql = "UPDATE Category SET " + "name = ?, " + "tipo = ? " + "WHERE idCategory = ?";
            PreparedStatement command = con.prepareStatement(sql);
            command.setString(1, Category.getName()); //take the name to change
            //take the type to change but Change to String
            command.setString(2, String.valueOf(Category.getType())); 
            command.setInt(3, Category.getId()); //take the id 
            //execute and update
            int numLines = command.executeUpdate();
            //close the connection
            return numLines > 0; // if the numLines will be greater than 0, the register was modiefied
        } catch (Exception e) {
            return false;
        }
    }
}
