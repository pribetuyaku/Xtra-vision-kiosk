package Model;

/**
 *
 * @author Betuyaku
 */
public class Serie extends Item{ // inheritance from Item
    private int idSeries;
    private String title;
    private String category;
    private int year;
    private String description;
    
     public Serie(Category category) {
    //take one parameter declared in the child class and send it to the parent class
    //this means the parameter Category declared into the Item is now accessible to the class Serie    
        super(category);
    }
    
    public Serie(int idSeries, String title, String category, int year){
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
