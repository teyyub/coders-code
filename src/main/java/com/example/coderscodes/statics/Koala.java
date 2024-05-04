package com.example.coderscodes.statics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.addExact;
import static java.lang.Math.subtractExact;
import static java.util.Arrays.asList;

public class Koala {
    public static int count = 0;
    public int age = 12;
    public static void main(String ...args) {

        List<String> names1 =new ArrayList<>();
        names1.add("tes1");

        List<String> names =asList("test");

        System.out.println(args.length);

        int m = addExact(2,4);
        double m1 = subtractExact(4l,6l);
        int num1 = 4, num2 =5;
        add(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }

    void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public  static int add(int num1, int num2){
        System.out.println(num1);
        System.out.println(num2);
        num1 = 2*num1;
        num2 = 2*num2;

        return num1+num2;
    }

}
