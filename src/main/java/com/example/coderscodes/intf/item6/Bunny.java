package com.example.coderscodes.intf.item6;

public class Bunny extends HopHop implements Hop{
    public void printDetails() {
        System.out.println(getJumpHeight());
        System.out.println(Hop.getJumpHeight());
    }
}
