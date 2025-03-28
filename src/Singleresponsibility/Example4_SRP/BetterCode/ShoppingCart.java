package Singleresponsibility.Example4_SRP.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items;
    private double totalprice;
    public ShoppingCart(){
        this.items=new ArrayList<>();
        this.totalprice=0.0;
    }
    public void addItem(String item,double price){
        items.add(item);
        totalprice+=price;
    }
    public void removeItem(String item,double price){
        if(items.contains(item)){
            items.remove(item);
            totalprice-=price;
        }
    }
    public double getTotalprice(){
        return totalprice;
    }
    public List<String> getItems(){
        return items;
    }
}
