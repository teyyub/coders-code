package com.example.coderscodes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

//        StringBuilder sb = new StringBuilder();
//        Integer a = Integer.valueOf(128);
//        Integer a1 = Integer.valueOf(128);
//        System.out.println(a==a1);

//        Date d = new Date(2024,1,12);
//        System.out.println(d);
//
//        Date d1 = new Date();
//        System.out.println(d1);
//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//
//        LocalDate ld1 = LocalDate.of(2024,4,14);
//        System.out.println(ld1);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        LocalDate ld2 = LocalDate.parse("03.12.2024",formatter);
//        System.out.println(ld2);

    }
}
