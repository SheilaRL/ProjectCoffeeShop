package Clases;

/**
 * Class to store information about stock.
 * @author sheilaRodríguez.
 */
public class Stock
{
    private int productCode;
    private String productName;
    private int quantityAvailable;
    private double productPrice;


    public Stock(int productCode, String productName, int quantityAvailable, double productPrice)
    {
        this.productCode = productCode;
        this.productName = productName;
        this.quantityAvailable = quantityAvailable;
        this.productPrice = productPrice;
    }

    public Stock()
    {
        productCode = 0;
        productName = " ";
        quantityAvailable = 0;
        productPrice = 0;
    }


    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString()
    {
        return "Product code: " + productCode + "\n" +
                "Product name: " + productName + "\n" +
                "Quantity available: " + quantityAvailable + "\n" +
                "Product price: " + productPrice;
    }
}
