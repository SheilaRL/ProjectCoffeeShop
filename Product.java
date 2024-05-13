package Clases;

import java.util.List;

/**
 * Class to store information about products.
 * @author sheilaRodríguez.
 */

public class Product
{
    protected int productID;
    protected String productName;
    protected double productPrice;
    protected int productStock;
    protected List<Product> productList;

    public Product(int productID, String productName, double productPrice,
                   int productStock, List<Product> productList)
    {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productList = productList;
    }

    public Product()
    {
        productID = 0;
        productName = " ";
        productPrice = 0;
        productStock = 0;
    }


    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString()
    {
        return "Product ID: " + productID + "\n" +
                "Product name: " + productName + "\n" +
                "Product price: " + productPrice + "\n" +
                "Available stock: " + productStock;
    }
}
