package Model;

/**
 *
 * @author Betuyaku
 */
public class Item {
    private int idItem;
    private double price;
    private int idMovie;
    private int paymentid;
    private Category Category;
    
    public Item(Category Category){ //
        this.Category = Category;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public Category getCategory() {
        return Category;
    }

    public void setCategory(Category Category) {
        this.Category = Category;
    }


    
    
}