
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Betuyaku
 */
public class Connect {
    
    private static final String URL = "jdbc:mysql://apontejaj.com:3306/Priscilla_2019217?useSSL=false";
    private static final String USER = "Priscilla_2019217";
    private static final String PASS = "2019217";
    
    public static Connection getConnection(){
    
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            return conn;
        } catch (Exception e){
            return null;
        }
    }
   
}
