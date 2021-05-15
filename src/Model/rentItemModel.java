
package Model;

/**
 *
 * @author Betuyaku
 */
public class rentItemModel {
    private int id;
    private double price;
    private MovieModel movie;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MovieModel getMovie() {
        return movie;
    }

    public void setMovie(MovieModel movie) {
        this.movie = movie;
    }
    
    
}
