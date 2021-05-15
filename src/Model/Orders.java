
package Model;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Betuyaku
 */
public class Orders {
    //class to create the orders
    private ArrayList<OrderItem> orders;
    private String cardNumber;
    private Date date;

    public Orders(String cardNum, Date date) {
        this.cardNumber = cardNum;
        this.date = date;
        this.orders = new ArrayList<>();
    }

    public ArrayList<OrderItem> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<OrderItem> orders) {
        this.orders = orders;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getDate() {
        return date;
    }


    public void addMovies(MovieModel[] movies) {
        for(MovieModel model : movies){
            OrderItem orderItem = new OrderItem(model.getIdMovie());
            this.orders.add(orderItem);
        }
    }
}
