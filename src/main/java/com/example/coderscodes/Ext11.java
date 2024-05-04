package com.example.coderscodes;

// 3 ==0 fiz
// 5 ==0 fuzz
// 3  5 fizfuz


public class Ext11 {
    public static void main(String[] args) {
        int num = 91;
        for(int i=1;i<16;i++){
            if(i % 3 ==0 && i % 5 ==0 ) {
                System.out.println("fizzfuzz");
            }
            else if(i % 3 ==0 ){
                System.out.println("fizz");
            } else if(i % 5 ==0 ){
                System.out.println("fuzz");
            }  else {
                System.out.println(i);
            }

        }

    }
}
