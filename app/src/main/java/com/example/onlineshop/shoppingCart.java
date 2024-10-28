package com.example.onlineshop;

public class shoppingCart {
    public product[] productList;

    public int calculateTotal(){
        int sum=0;
        for (product p : productList) {
            sum+=p.price;
        }
        return sum;
    }
}
