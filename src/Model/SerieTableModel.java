
package Model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Betuyaku
 */
public class SerieTableModel extends AbstractTableModel{
    //https://docs.oracle.com/javase/tutorial/uiswing/components/table.html#data
    
    //method to get Title, Category and Year
    private String[] columnNames = {"Title", "Category", "Year"};
    private Serie[] series;
    
    public SerieTableModel(Serie[] series){
        this.series = series;
    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
    @Override
    public int getRowCount() {
          return series.length;
    }
    
    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Serie serie = series[rowIndex];
        switch (columnIndex){
            
            case 0:{
                return serie.getTitle();
            }
            case 1:{
                return serie.getCAtegory();
            }
            case 2:{
                return serie.getYear();
            }
            
        }
        return null;
    }
    
}
