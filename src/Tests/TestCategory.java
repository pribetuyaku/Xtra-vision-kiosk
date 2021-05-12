/*
This class is only for test
 */
package Tests;

import Model.CategoryModel;
import DAO.CategoryDAO;
import Model.SerieModel;
/**
 *
 * @author Betuyaku
 */
public class TestCategory {
    
     private SerieModel serie;
    
    public static void main(String[] args) {
        CategoryModel category = new CategoryModel();
        category.setName("Comedy");
        category.setType('M'); //M-> Movie & S-> Series
       
        
        //insert
     CategoryDAO.insert(category);
                       
        //delete
//        System.out.println(CategoryDAO.delete(12));
        
        //update
//        category.setId(2);
//        System.out.println(CategoryDAO.update(category));
       
        //list
//        System.out.println(CategoryDAO.ListCategory());
    }
}
