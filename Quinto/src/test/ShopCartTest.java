package test;


import main.Product;

import java.util.*;
import org.junit.*;

public class ShopCartTest {
    ArrayList<Product>list = new ArrayList<>();
    @Test
    public void addProductTest(){
        Product product = new Product();
        if (list.contains(product)){
          product.setAmount(product.getAmount()+1);
        }
        else{
            list.add(product);
        }
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(1, list.size());
    }
    @Test
    public void removeProductTest(){
        Product product = new Product();
        product.setAmount(1);
        list.add(product);
        if (list.contains(product)){
            product.setAmount(product.getAmount()-1);
            if (product.getAmount()<=0){
                list.remove(product);
            }
        }
        Assert.assertEquals(0, list.size());
        Assert.assertNotNull(list);
    }
    @Test
    public void amountShopCartTest(){

        Product product = new Product();
        product.setPrice(150);
        product.setAmount(20);


        list.add(product);

        double totalAmount = 0.0;

        for(int i=0; i< list.size(); i++){
            totalAmount+= product.getPrice()* product.getAmount();
        }

        Assert.assertEquals(3000, totalAmount, 0);

    }
    @Test
    public void clearShopCartTest(){
        Product product = new Product();
        list.add(product);
        list.clear();
        Assert.assertTrue(list.isEmpty());
    }

}
