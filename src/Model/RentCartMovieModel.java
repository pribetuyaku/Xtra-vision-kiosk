
package Model;

import java.util.ArrayList;

/**
 *
 * @author Betuyaku
 */
public class RentCartMovieModel {
    private static RentCartMovieModel currentCart;
    
    private ArrayList<MovieModel>movies;
    private ArrayList<SerieModel>series;

    public RentCartMovieModel(ArrayList<MovieModel> movies,ArrayList<SerieModel> series) {
        this.movies = movies;
        this.series = series;
    }

    public static RentCartMovieModel getCurrentCart() {
        return currentCart;
    }

    public static void setCurrentCart(RentCartMovieModel currentCart) {
        RentCartMovieModel.currentCart = currentCart;
    }
    
    public SerieModel[] getSeriesFromCart(){
        return series.toArray(new SerieModel[series.size()]);
    }
    
    public MovieModel[] getMoviesFromCart(){
        return movies.toArray(new MovieModel[movies.size()]);
    }
    public void addMovie(MovieModel movie){
        movies.add(movie);
    }
    
    public void addSerie(SerieModel serie){
        series.add(serie);
    }
    public void test(){
        for (int i =0 ;i<movies.size();i++){
            System.out.println(movies.get(i).getTitle());
        }
    }

    public void removeAllSeries(){
        series.clear();
    }
    public void removeAllMovies() {
       movies.clear();
    }
    
    public void removeSerie(SerieModel serie){
        series.remove(serie);
    }
    
    public void removeMovie(MovieModel movie) {
        movies.remove(movie);
    }

    public int getSize() {
        return movies.size();
    }
    
}
