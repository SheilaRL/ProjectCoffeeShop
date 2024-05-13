package Clases;

/**
 * Class to store information about drinks.
 * @author sheilaRodríguez.
 */
public class Drink extends Product
{
    private int drinkCode;
    private String drinkName;
    private double drinkPrice;
    private int stock;
    private String drinkType;

    public Drink(int drinkCode, String drinkName, double drinkPrice, int stock, String drinkType)
    {
        this.drinkCode = drinkCode;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.stock = stock;
        this.drinkType = drinkType;
    }


    public int getDrinkCode() {
        return drinkCode;
    }

    public void setDrinkCode(int drinkCode) {
        this.drinkCode = drinkCode;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }


}
