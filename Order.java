package Clases;
import java.util.List;

/**
 * Class to store information about orders.
 * @author sheilaRodríguez.
 */
public class Order
{
    private Client client;
    private int orderCode;
    private List<Order> orderList;
    private double totalPrice;
    private String orderState;


    public Order(Client client, int orderCode, List<Order> orderList, double totalPrice, String orderState)
    {
        this.client = client;
        this.orderCode = orderCode;
        this.orderList = orderList;
        this.totalPrice = totalPrice;
        this.orderState = orderState;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }


}
