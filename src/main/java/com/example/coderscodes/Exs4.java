package com.example.coderscodes;

import java.time.LocalDateTime;

public class Exs4 {
    public static void main(String[] args) {


        int num = 29;
        int first_part = num / 10 ;
        int second_part = num % 10;
        String name = "JAVA";

        new StringBuilder(name).reverse().toString();
        System.out.println(first_part+second_part);
        double num1 = 100_000_0.00;
    }
}
