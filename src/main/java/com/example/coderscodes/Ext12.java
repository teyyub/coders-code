package com.example.coderscodes;

public class Ext12 {
    public static void main(String[] args) {
        //4521
        // 0*10 + 1 = 1
        // 1*10+2 = 12
        // 12 *10+ 5 = 125
        // 125 * 10 + 4 = 1254;

        //254
        //10*10 = 5*10
//         pow(2,5) = 32
//            a,b  a^b  2 ^ 3=  8
        //451
        int reversed = 0;
        int part = 0;
        int num = 104510;
        while(num!=0){
            part = num % 10;
            reversed = reversed * 10 +part;
            num = num /10;
        }
        System.out.println(reversed);

    }
}
