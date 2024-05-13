package Clases;
import java.util.List;

/**
 * Class to store web orders.
 * @author sheilaRodríguez.
 */
public class WebOrders
{
    private Client client;
    private int webOrderCode;
    private List<WebOrders> webOrders;
    private double totalPrice;
    private String orderDate;
    private String orderState;
    private String deliveryAddress;

    public WebOrders(Client client, int webOrderCode, List<WebOrders> webOrders, double totalPrice
            , String orderDate, String orderState, String deliveryAddress)
    {
        this.client = client;
        this.webOrderCode = webOrderCode;
        this.webOrders = webOrders;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.orderState = orderState;
        this.deliveryAddress = deliveryAddress;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getWebOrderCode() {
        return webOrderCode;
    }

    public void setWebOrderCode(int webOrderCode) {
        this.webOrderCode = webOrderCode;
    }

    public List<WebOrders> getWebOrders() {
        return webOrders;
    }

    public void setWebOrders(List<WebOrders> webOrders) {
        this.webOrders = webOrders;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString()
    {
        return "Client: " + client + "\n" +
                "Code order: " + webOrderCode + "\n" +
                "Web order date: " + orderDate + "\n" +
                "Delivery address: " + deliveryAddress + "\n" +
                "Total price: " + totalPrice;
    }

}
