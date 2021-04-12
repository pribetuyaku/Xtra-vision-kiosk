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
        Category Category = new Category();
        Category.setName("Horror");
        Category.setType('D'); //D-> DVD & B-> Blue-Ray
        
        //insert
        //CategoryDAO.insert(Category);
        
        //update lines
        //Category.setId(3);
        //System.out.println(CategoryDAO.update(Category));
        
        //delete
        //System.out.println(CategoryDAO.delete(3));
       
                
    }
}
