/*
This class is only for test
 */
package Tests;

import DAO.CategoryDAO;
import Model.Serie;
import DAO.SerieDAO;
import Model.Category;
/**
 *
 * @author Betuyaku
 */
public class TestSerie {
    public static void main(String[] args) {
        Category category = new Category();
        category.getName();
        category.getNameType();
        
        //insert
        CategoryDAO.insert(category);
//        SerieDAO.insertSerie(Serie);
    }
}
