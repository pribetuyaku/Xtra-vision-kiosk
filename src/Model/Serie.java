
package Model;

/**
 *
 * @author Betuyaku
 */
public class Serie extends Item{ // inheritance from Item
    
    private String title;
    private int year;
    private String description;
    
    public Serie(Category Category) {
        super(Category);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    
    
    
}
