package Model;

/**
 *
 * @author Betuyaku
 */
public class CategoryModel {
   private int id;
   private String name;
   private char type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
    
    //method to show the full name into the table. Same as if statement showed below
    public String getNameType(){
        return type == 'M' ? "Movie" : "Serie"; //ternary conditional
        /*
        if(type == 'M'){
            return "Movie";
        }else{
            return "Serie";
        }
        */
    }

    @Override //show the result as String
    public String toString() {
        return name;
    }  
  
}