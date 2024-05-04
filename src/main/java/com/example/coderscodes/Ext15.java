package com.example.coderscodes;


import java.util.Random;
import java.util.Scanner;

/**
 *  0-100
 *  5
 *  75
 *  99
 *  10
 * */
public class Ext15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quess =0;
        int counter = 5;
        int rn = new Random().nextInt(101);
        System.out.println("(0-100 ) araliginda ededi daxil edin:");
        while(counter > 0){
            quess = input.nextInt();
            if(quess > rn) {
                System.out.println("ededi kicildin");
            } else if(quess<rn) {
                System.out.println("ededi boyudun");
            } else {
                System.out.println("siz qazandiniz");
                break;
            }
            counter--;
        }
        System.out.println("Komputerin reqemi :"+rn);
    }
}
