package com.example.coderscodes;

/*
*      0  1   2  3   4     5  6 7 8 9
*     [1][3][-5][3][-1000][1][][][] []
*
* */


import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        byte b = 30;
        byte[] numbers = new byte[10];
        numbers[0] = 100;
        numbers[1] = 10;
        numbers[2] = -90;
        numbers[4] = b;
        numbers[9]=100;
        System.out.println(numbers[4]);

        char[] ch = new char[10];
        ch[0]='a';

        boolean [] bl = {true,false,true,false,false,false};
        System.out.println(bl.length);
        bl[0] = false;
        System.out.println(bl);
        System.out.println(Arrays.toString(bl));

        for(int i=0; i< bl.length;i++)
            System.out.print(bl[i]+" ");

    }
}
