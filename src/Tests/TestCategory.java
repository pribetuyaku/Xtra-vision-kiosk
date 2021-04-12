/*
This class is only for test
 */
package Tests;
import Model.Category;
import DAO.CategoryDAO;
/**
 *
 * @author Betuyaku
 */
public class TestCategory {
    public static void main(String[] args) {
        Category category = new Category();
        category.setName("Horror");
        category.setType('M'); //M-> Movie & S-> Series
        
        //insert
        //CategoryDAO.insert(category);
                       
        //delete
        //System.out.println(CategoryDAO.delete(1));
        
        //update
        category.setId(2);
        System.out.println(CategoryDAO.update(category));
       
                
    }
}
