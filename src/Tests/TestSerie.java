/*
This class is only for test
 */
package Tests;

import DAO.CategoryDAO;
import Model.SerieModel;
import DAO.SerieDAO;
import Model.CategoryModel;
/**
 *
 * @author Betuyaku
 */
public class TestSerie {
    public static void main(String[] args) {
        CategoryModel category = new CategoryModel();
        category.getName();
        category.getNameType();
        
        //insert
        CategoryDAO.insert(category);
//        SerieDAO.insertSerie(SerieModel);
    }
}
