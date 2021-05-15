
package Model;

/**
 *
 * @author Betuyaku
 */
public class OrderItem {
    /*class to create items into the Order
    where status is following: 
    return -0 / returned -1 / not returned -2 (charged €15 more)
    */
    private int OrderMovieId;
    private int OrderId;
    private int OrderStatus;
    
    public OrderItem (int idMovie, int idOrder, int StatusRent){
        this.OrderMovieId = idMovie;
        this.OrderId = idOrder;
        this.OrderStatus = OrderStatus;
    }
    
    public OrderItem (int idMovie){
        this.OrderMovieId = idMovie;
    }

    public int getIdMovie() {
        return OrderMovieId;
    }

    public int getIdOrder() {
        return OrderId;
    }

    public int getStatusRent() {
        return OrderStatus;
    }
    
    
}
