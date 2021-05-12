
package Model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Betuyaku
 */

    public class MoviesTableModel extends AbstractTableModel {
    //https://docs.oracle.com/javase/tutorial/uiswing/components/table.html#data
    
    //method to get Title, Category and Year 
    
    private String[] columnNames = {"ID","Title","Category","Year"};
    private MovieModel[ ] movies;
    

    public MoviesTableModel( MovieModel[] movies) {
        this.movies = movies;
    }
    
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
    @Override
    public int getRowCount() {
          return movies.length;
    }
    
    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
    
    @Override //populate the table
    public Object getValueAt(int rowIndex, int columnIndex) {
        MovieModel movie = movies[rowIndex];
        
        switch (columnIndex){
            
            case 0:{
                return movie;
            }
            case 1:{
                return movie.getTitle();
            }
            case 2:{
                return movie.getCAtegory();
            }
            case 3:{
                return movie.getYear();
            }
            
        }
        return null;
    }
}
    

