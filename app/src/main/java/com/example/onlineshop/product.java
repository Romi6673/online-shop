package com.example.onlineshop;

public class product {
    public String name;
    public int price;
    public String description;

    public product(String n, int p , String d){
        name=n;
        price=p;
        description=d;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    
}