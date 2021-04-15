package Model;

/**
 *
 * @author Betuyaku
 */
public class Item {
    private int id;
    private String title;
    private String description;
    private double price;
    private int nRentDays;
    private Category category;
    
    public Item(Category category){ //
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getnRentDays() {
        return nRentDays;
    }

    public void setnRentDays(int nRentDays) {
        this.nRentDays = nRentDays;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }



    
    
}