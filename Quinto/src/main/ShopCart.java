package main;

import java.util.ArrayList;


public class ShopCart {
    ArrayList<Product> list = new ArrayList<>();
    Product product = new Product();

    //Method to add products

    public void addProduct(Product product){
     if (list.contains(product)){
         product.setAmount(product.getAmount()+1);
     }
     else{
         list.add(product);
     }
    }

    //Method to remove Products

    public void removeProduct(Product product){
        if(list.contains(product)){
            product.setAmount(product.getAmount()-1);
            if (product.getAmount()<=0){ // if the amount is under or equal 0 remove that item from the list
                list.remove(product);
            }
        }
    }

    // Method to show the price of the shop cart

    public double amountShopCart(){
        double totalAmount = 0.0;

        for(int i=0; i< list.size(); i++){
            totalAmount+= product.getPrice()* product.getAmount();
        }
        return totalAmount;
    }

    //Method to clear the cart

    public void clearShopCart(){
        list.clear();
    }
}