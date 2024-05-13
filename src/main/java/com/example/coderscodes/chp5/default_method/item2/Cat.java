package com.example.coderscodes.chp5.default_method.item2;

public class Cat implements Walk, Run { // DOES NOT COMPILE
     public static void main(String[] args) {

         System.out.println(new Cat().getSpeed());
     }

    @Override
    public int getSpeed() {
        return Walk.super.getSpeed();
    }
}
