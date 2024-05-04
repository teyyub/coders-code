package com.example.coderscodes.statics;

import java.util.ArrayList;

public class KoalaTest {
    static String color = "black";
    int age = 10;

    void test(){
        System.out.println(color);
    }
    //block
    {
        System.out.println(age);
        System.out.println(color);
    }

//     static
     {
        System.out.println(age);
        System.out.println(color);
    }
    private static final   ArrayList<String> values = new ArrayList<>();
    private static   ArrayList<String> values1 = new ArrayList<>();
    public static void main(String[] args) {
        values.add("changed");
//        values = values1;


        Koala k1 = new Koala();
        Koala k2 = new Koala();
        k1.age = 9;
        k2.age =100;
        System.out.println(k1.age);
        System.out.println(k2.age);
        k1.count = 100;
        k2.count = 200;
        System.out.println(k1.count);
        System.out.println(k2.count);

//        Koala koala = null;
////        koala = null;
//        Koala.add(4,5);
//        Koala.main("1");
//        System.out.println();
//        System.out.println(koala.count);
//        System.out.println(koala.age);
//        Koala kk = new Koala();
               // Koala.main("1","2","3");
               // int result =  Koala.add(4,5);
//        System.out.println();
         //Koala k = new Koala();
         //Koala k1 = new Koala();
//         System.out.println(Koala.count);
//         System.out.println(color);
//         System.out.println(age);
//         KoalaTest k2 = new KoalaTest();
//         k2.age
//        System.out.println(k.count);
//        System.out.println(k1.count);
    }
}
