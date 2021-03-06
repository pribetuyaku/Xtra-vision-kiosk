/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author BETUYAKU
 */
public class DB {
    
    private Connection conn;
    
    public static Connection connect(){
    
        try {
            return DriverManager.getConnection("jdbc:mysql://apontejaj.com:3306/Priscilla_2019217?useSSL=false", "Priscilla_2019217", "2019217");
        } catch (SQLException se){
            throw new RuntimeException("ERROR! Fail connection." + se);
        }
    }
    
    public static void closeConnection(Connection conn){
        
        try {
            if(conn!= null){
                conn.close();
            }
        } catch (SQLException se) {
            throw new RuntimeException("ERROR! Fail close connection" + se);
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement stmt){
        closeConnection(conn);
        try {
            if(conn!= null){
                conn.close();
            }
        } catch (SQLException se) {
            throw new RuntimeException("ERROR! Fail close PreparedStatement" + se);
        }
    }
    
      public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs){
        closeConnection(conn,stmt);
        try {
            if(rs!= null){
                rs.close();
            }
        } catch (SQLException se) {
            throw new RuntimeException("ERROR! Fail close ResultSet" + se);
        }
    }
}
