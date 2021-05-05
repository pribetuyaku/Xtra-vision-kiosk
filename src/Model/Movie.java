package Model;

/**
 *
 * @author Betuyaku
 */
public class Movie extends Item{
    private int idMovie;
    private String title;
    private String category;
    private int year;
    private String description;
    
    public Movie(Category category){ 
    //take one parameter declared in the child class and send it to the parent class
    //this means the parameter Category declared into the Item is now accessible to the class Movie    
        super(category);            
    }

    public Movie(int idMovie, String title, String category, int year ) {
        
        this.idMovie = idMovie;
        this.title = title;
        this.category = category;
        this.year = year;
    }

    public int getIdMovie() {
        return idMovie;
    }

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
        return "Movie{" + 
                "idMovie=" + idMovie + 
                ", title=" + getTitle() + 
                "year=" + year + 
                ", description=" + getDescription() + '}';
    }
    
}