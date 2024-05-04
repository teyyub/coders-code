package com.example.coderscodes;



public class Ext14 {
    public static void main(String[] args) {

            for(int i = 0; i< 4; i++) { //outer
                for (int j = 0; j <= 4-i; j++) { //inner
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
