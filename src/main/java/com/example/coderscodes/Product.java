package com.example.coderscodes;


public class Product extends Object {
    private String productName="Lays";
    private Double price= 2.59D;
    private boolean isNew = true;


    public Product(String productName,Double price, boolean isNew){
         this.productName = productName;
         setPrice(price);
         this.isNew = isNew;

    }

    int max(int a, int b){
        return  a> b ? a : b;
    }

    public void setPrice(double price){
//        if(price>0)
//        this.price = price;
        this.price = price > 0 ? price : 0;
     }

    public double getPrice(){
        return this.price;
    }


    public String toString(){
        return "Product ["+"Name " + productName + " price "+price + " isNew " + isNew+"]";
    }


}
