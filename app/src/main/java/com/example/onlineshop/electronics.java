package com.example.onlineshop;

public class electronics extends product{
    public String chargeType;
    public electronics(String n, int p, String d, String chargeType) {
        super(n, p, d);
        this.chargeType=chargeType;
    }
}