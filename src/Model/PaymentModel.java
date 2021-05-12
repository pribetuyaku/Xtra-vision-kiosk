
package Model;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Betuyaku
 */
public class PaymentModel {
    private int id;
    private double price;
    private Date date;
    private ArrayList<rentItemModel> rentItems; //to add many rent itens into the payment
    UserModel user;

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

    public ArrayList<rentItemModel> getRentItems() {
        return rentItems;
    }

    public void setRentItems(ArrayList<rentItemModel> rentItems) {
        this.rentItems = rentItems;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
    
    
    
    
    
}
