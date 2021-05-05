
package Controller;

import DAO.Connect;
import Model.Serie;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Betuyaku
 */
public class SeriesControl {
//method to store the list of movies into an Array of movies
    public Serie[] getAllSeriesFromDb(){
        ArrayList<Serie> series = new ArrayList<>();
        //Connect to DB
        try {
            Connection conec = Connect.getConnection();
            //SQL query
            String sql = "SELECT Series.idSeries, Series.title, Series.year, Category.name as category, "
                    + "Category.type FROM Series " +
                    "inner join Category on Series.idCategory = Category.id";
            // to excute the Database command without any parameters 
            Statement comm = conec.createStatement();
            //Result
            ResultSet result = comm.executeQuery(sql);
            //Show the results
            while (result.next()){
                //create the object to populate the table
                Serie serie = new Serie(result.getInt(1),result.getString(2), result.getString(4), result.getInt(3));
                //add the array into the object
                series.add(serie);
            }
            comm.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        for(int i = 0; i<series.size(); i++){
            System.out.println(series.get(i).getTitle());
        }
        return series.toArray(new Serie[series.size()]);
    }
}
