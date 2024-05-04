package com.example.coderscodes.pond.shore;

public class Gosling extends Bird {
    // protected access // protected access
// in a different package
// extends means create subclass
    public void swim() {
        //System.out.println(text);
        floatInWater(); // calling protected member System.out.println(text); // calling protected member
    }
}