package com.example.coderscodes;

public class ProductManager {
    public static void main(String ...args) {

        System.out.println(args);

        Product p = new Product("Lays",2.59,false);

        Product p1 = new Product("Doritos",3.59,true);
        System.out.println(p.getPrice());
        p.setPrice(-6);
        p.setPrice(1.12);
        System.out.println(p.getPrice());
        System.out.println(p1.getPrice());

        System.out.println("=====================");
//        System.out.println(p.print());
//        System.out.println(p1.print());

        System.out.println("=====================");
        System.out.println(p.toString());
        System.out.println(p1.toString());

//        System.out.println(p.isNew);
//
//
//        Product p1 = new Product();
//        p1.productName = "Doritos";
//        p1.price = (3*unit_price-12);
//        System.out.println(p1.productName);
//        System.out.println(p1.price);
//        System.out.println(p1.isNew);
    }
}
