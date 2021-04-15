
package Model;

/**
 *
 * @author Betuyaku
 */
public class Movie extends Item{
    private int idMovie;
    private String title;
    private String category;
    private String year;
    private String description;
    
    public Movie(Category category){ //take one parameter declared in the child class and send it to the parent class
        super(category); //this means the parameter Category declared into the Item is now accessible to the class Movie
                
    }

   
    @Override
    public int getIdMovie() {
        return idMovie;
    }

    @Override
    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
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

    public void setGenre(String category) {
        this.category = category;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}