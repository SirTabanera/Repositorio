package main;

import java.util.*;

public class Product extends Item {

    private double price;
    private Integer amount;

    public Product(){}

    public Product(Item item, double price, Integer amount){
        this.price= price;
        this.amount=amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
