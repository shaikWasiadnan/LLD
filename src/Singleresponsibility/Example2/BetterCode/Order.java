package Singleresponsibility.Example2.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<String> items;
    private double totalAmount;
    public Order(int orderId){
        this.orderId=orderId;
        this.items=new ArrayList<>();
        this.totalAmount=0;
    }
    public void addItem(String item,double price){
        items.add(item);
        totalAmount+=price;
    }
    public double getTotalAmount(){
        return totalAmount;
    }
    public int getOrderId(){
        return orderId;
    }
    public List<String> getItems(){
        return items;
    }


}
