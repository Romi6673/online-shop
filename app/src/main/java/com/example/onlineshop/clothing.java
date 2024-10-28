package com.example.onlineshop;

public class clothing extends product{
    public String size;
    public clothing(String n, int p, String d, String size) {
        super(n, p, d);
        this.size=size;
    }
}
