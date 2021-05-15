
package Model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Betuyaku
 */
public class RentCartMovieModel {
    private static RentCartMovieModel currentCart;
    //An arraylist of movie for the cart needed, help to add and remove if needed
    private ArrayList<MovieModel>movies;
  

    public RentCartMovieModel(ArrayList<MovieModel> movies) {
        this.movies = movies;
    }

    public static RentCartMovieModel getCurrentCart() {
        return currentCart;
    }

    public static void setCurrentCart(RentCartMovieModel currentCart) {
        RentCartMovieModel.currentCart = currentCart;
    }
       
    public MovieModel[] getMoviesFromCart(){
        return movies.toArray(new MovieModel[movies.size()]);
    }
    public void addMovie(MovieModel movie){
        movies.add(movie);
    }
    
    //check if there is a movie in the cart
    public boolean movieInCart(MovieModel movieModel){
        boolean movieInCart = false;
        if(movies.size()>0){
            for (int i = 0; i<movies.size(); i++){
                if(movies.get(i).getId()==movieModel.getId()){
                    movieInCart = true;
                }
            }
        }
        return movieInCart;
    }
    //add a movie (max 4) inside the cart
    public boolean addMovieCart(MovieModel movie){
        if(!movieInCart(movie)&& movies.size()<4 ){ 
            this.movies.add(movie);
            return true;
        }
        else{
            return false;
        }
    }
       
       public void test(){
        for (int i =0 ;i<movies.size();i++){
            System.out.println(movies.get(i).getTitle());
        }
    }

    public int getSize() {
        return movies.size();
    }
    
}
