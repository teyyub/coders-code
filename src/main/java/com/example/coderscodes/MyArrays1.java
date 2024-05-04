package com.example.coderscodes;

/*
*      0  1   2  3   4     5  6 7 8 9
*     [1][3][-5][3][-1000][1][][][] []
*
* */


import java.awt.color.ProfileDataException;
import java.util.Arrays;

public class MyArrays1 {
    public static void main(String[] args) {
         Product[] products = new Product[3];
         products[0] = new Product("test",.0,false);
         products[1] = new Product("Lays",2.0,true);
         products[2] = new Product("Doritos",2.5,false);

         //foreach(e:Collection)

//        System.out.println(Arrays.toString(products));
        for(Product p:products ){
//            Product p = products[i];
            System.out.println(p.toString());
        }
    }
}
