
package Model;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Betuyaku
 */
public class Payment {
    private int id;
    private double price;
    private Date date;
    private ArrayList<rentItem> rentItems; //to add many rent itens into the payment
    User user;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<rentItem> getRentItems() {
        return rentItems;
    }

    public void setRentItems(ArrayList<rentItem> rentItems) {
        this.rentItems = rentItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
    
    
}
