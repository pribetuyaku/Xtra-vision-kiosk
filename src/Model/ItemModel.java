package Model;

/**
 *
 * @author Betuyaku
 */
public class ItemModel {
    private int id;
    private String title;
    private String description;
    private double price;
    private int nRentDays;
    private CategoryModel category;

    public ItemModel() {
    }
    
    public ItemModel(CategoryModel category){ //
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

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }

}