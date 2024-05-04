package com.example.coderscodes;

public class Ext13 {
    public static void main(String[] args) {
//         pow(2,3) = 8   2 * 2 * 2
//         pow(2,5) = 32; 2 * 2* 2*2*2;

        int base = 2;
        int result = 1;
        int exp = 0;

        for (int i = 0; i < exp; i++) {
            result = base * result;

        }
        System.out.println(result);


    }
}
