package Clases;

/**
 * Class to store information about sweet food.
 * @author sheilaRodríguez.
 */
public class Sweet extends Product
{
    private int sweetCode;
    private String sweetName;
    private double sweetPrice;
    private int sweetStock;
    private String sweetType;

    public Sweet(int sweetCode, String sweetName, double sweetPrice, int sweetStock, String sweetType)
    {
        this.sweetCode = sweetCode;
        this.sweetName = sweetName;
        this.sweetPrice = sweetPrice;
        this.sweetStock = sweetStock;
        this.sweetType = sweetType;
    }


    public int getSweetCode() {
        return sweetCode;
    }

    public void setSweetCode(int sweetCode) {
        this.sweetCode = sweetCode;
    }

    public String getSweetName() {
        return sweetName;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public double getSweetPrice() {
        return sweetPrice;
    }

    public void setSweetPrice(double sweetPrice) {
        this.sweetPrice = sweetPrice;
    }

    public int getSweetStock() {
        return sweetStock;
    }

    public void setSweetStock(int sweetStock) {
        this.sweetStock = sweetStock;
    }

    public String getSweetType() {
        return sweetType;
    }

    public void setSweetType(String sweetType) {
        this.sweetType = sweetType;
    }


}
