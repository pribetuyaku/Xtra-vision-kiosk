package Model;

/**
 *
 * @author Betuyaku
 */
public class SerieModel extends ItemModel{ // inheritance from ItemModel
    private int idSeries;
    private String title;
    private String category;
    private int year;
    private String description;
    
     public SerieModel(CategoryModel category) {
    //take one parameter declared in the child class and send it to the parent class
    //this means the parameter CategoryModel declared into the ItemModel is now accessible to the class SerieModel    
        super(category);
    }
    
    public SerieModel(int idSeries, String title, String category, int year){
        this.idSeries = idSeries;
        this.title = title;
        this.category = category;
        this.year = year;
    }

    public int getIdSeries() {
        return idSeries;
    }

    public void setIdSeries(int idSeries) {
        this.idSeries = idSeries;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
     public String getCAtegory() {
        return category;
    }
    

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Serie{" + 
                "idSeries=" + idSeries + 
                ", title=" + getTitle() + 
                "year=" + year + 
                ", description=" + getDescription() + '}';
    }
        
}
