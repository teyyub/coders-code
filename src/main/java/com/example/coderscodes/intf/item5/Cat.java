package com.example.coderscodes.intf.item5;

public class Cat implements Walk, Run {
    // DOES NOT COMPILE
     public static void main(String[] args) {
             System.out.println(new Cat().getSpeed());
    }

    @Override
    public int getSpeed() {
        return 5;
    }
}
