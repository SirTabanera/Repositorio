package main;

import java.util.ArrayList;
import java.util.List;

public class ShopCart {
    List<Product> list = new ArrayList<Product>();
    Product product = new Product();

    //Method to add products

    public void addProduct(Product product){
     if (list.contains(product)){
         int a = product.getAmount(); // use the variable "a" for get an amount of wich product and add one more
         product.setAmount(a+1);
     }
     else{
         list.add(product);
     }
    }

    //Method to remove Products

    public void removeProduct(Product product){
        if(list.contains(product)){
            int a = product.getAmount();
            product.setAmount(a-1); // use the variable "a" for get an amount of wich product and remove one
            if (product.getAmount()<=0){ // if the amount is under or equal 0 remove that item from the list
                list.remove(product);
            }
        }
    }

    // Method to Show the shop cart

    public void showShopCart(List list){
        System.out.println(list);
        // or can be showed like this
        // for(i=0;i<list.size()-1; i++){
        //      System.out.println(list.get(i);
        //      }
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