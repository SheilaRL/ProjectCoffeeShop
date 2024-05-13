package Clases;

/**
 * Class to store information about salty food.
 * @author sheilaRodríguez.
 */
public class Salty extends Product
{
    private int saltyCode;
    private String saltyName;
    private double saltyPrice;
    private int stock;
    private String typeSalty;





    public int getSaltyCode() {
        return saltyCode;
    }

    public void setSaltyCode(int saltyCode) {
        this.saltyCode = saltyCode;
    }

    public String getSaltyName() {
        return saltyName;
    }

    public void setSaltyName(String saltyName) {
        this.saltyName = saltyName;
    }

    public double getSaltyPrice() {
        return saltyPrice;
    }

    public void setSaltyPrice(double saltyPrice) {
        this.saltyPrice = saltyPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTypeSalty() {
        return typeSalty;
    }

    public void setTypeSalty(String typeSalty) {
        this.typeSalty = typeSalty;
    }


}
