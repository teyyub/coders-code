package com.example.coderscodes.chp5.intf_var;

public interface CanSwim1 extends CanSwim {
    int MAXIMUM_DEPTH = 20;
    public static void print(){
        System.out.println(MAXIMUM_DEPTH+"-"+UNDERWATER+"-"+TYPE);
    }
}
