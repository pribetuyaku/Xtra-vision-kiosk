
package Model;

/**
 *
 * @author Betuyaku
 */
public class User {
    private int idUser;
    private String email;
    private String cardNumber;
    private String validCard;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getValidCard() {
        return validCard;
    }

    public void setValidCard(String validCard) {
        this.validCard = validCard;
    }
    
}
