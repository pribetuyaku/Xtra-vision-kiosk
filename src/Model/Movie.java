
package Model;

/**
 *
 * @author Betuyaku
 */
public class Movie extends Item{
    private int idMovie;
    private String title;
    private String genre;
    private String year;
    
    public Movie(Category Category){ //take one parameter declared in the child class and send it to the parent class
        super(Category); //this means the parameter Category declared into the Item is now accessible to the class Movie
                
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    
}
