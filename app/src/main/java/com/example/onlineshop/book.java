package com.example.onlineshop;

public class book extends product{
    public int pages;

    public book(String n, int p, String d, int page) {
        super(n, p, d);
        this.pages=page;
    }

}
