package com.example.coderscodes.chp5.inherit_methods.item5;

public class Mouse extends Rodent {


      int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
    }
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }

}
