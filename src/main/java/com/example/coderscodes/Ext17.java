package com.example.coderscodes;

import java.util.Scanner;

// 1-7
public class Ext17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfTheWeek = scanner.nextInt();
        switch (dayOfTheWeek) {
            default: {
                System.out.println("heftenin gununu duzgun daxil edin");
                //break;
            }
            case 1:
                System.out.println("bazar ertesi");
                break;
            case 2:
                System.out.println("cersenbe axsami");
                break;
            case 3:
                System.out.println("cersenbe");
                break;
            case 4:
                System.out.println("cume axsami");
                break;
            case 5: {
                System.out.println("cume");
                break;
            }
            case 6: {
                System.out.println("senbe");
                System.out.println();
                break;
            }
            case 7: {
                System.out.println("bazar");
                break;
            }

        }
    }
}