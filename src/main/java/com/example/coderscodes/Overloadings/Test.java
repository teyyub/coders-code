package com.example.coderscodes.Overloadings;

import java.io.FilterOutputStream;

public class Test {
    public static void main(String[] args) {
        add(3);

//        add(3,5);
//        add(3.0,0.5);

        int result = add(2, 1);
        System.out.println(result);

    }

    static void add(int a){

    }
//    static int add(int a){
//        return 0;
//    }

    static int add(double a, Double b){
        return 0;
    }
    static int add(int a, int b){
        return 0;
    }

    static int add(int a, byte b){
        return 10;
    }

    static int add(int a, Integer b){
        return 20;
    }

    static void args(String[] arg){}

    static void args(int a,String ...args){}
}
