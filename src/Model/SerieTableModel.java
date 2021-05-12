
package Model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Betuyaku
 */
public class SerieTableModel extends AbstractTableModel{
    //https://docs.oracle.com/javase/tutorial/uiswing/components/table.html#data
    
    //method to get Title, Category and Year
    private String[] columnSerieNames = {"ID","Title", "Category", "Year"};
    private SerieModel[] series;
    
    public SerieTableModel(SerieModel[] series){
        this.series = series;
    }
    
    @Override
    public String getColumnName(int col) {
        return columnSerieNames[col];
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
       return columnSerieNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SerieModel serie = series[rowIndex];
        switch (columnIndex){
            case 0:{
                return serie;
            }
            case 1:{
                return serie.getTitle();
            }
            case 2:{
                return serie.getCAtegory();
            }
            case 3:{
                return serie.getYear();
            }
            
        }
        return null;
    }
    
}
