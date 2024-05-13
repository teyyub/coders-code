package com.example.coderscodes.chp5.static_method;

public class Bunny implements Hop {
    public void printDetails() {
         //System.out.println(getJumpHeight());
     }

    public static void main(String[] args) {
//        var value = new Bunny().getJumpHeight(4);
//         Bunny b = new Bunny();
        double d = new Bunny().getJumpHeight(4);
        System.out.println(d);

        System.out.println(Hop.getJumpHeight());
    }
}

