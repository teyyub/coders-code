package com.example.coderscodes.pond.duck;

import com.example.coderscodes.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
//        other.floatInWater(); // DOES NOT COMPILE
//         System.out.println(other.text); // DOES NOT COMPILE
    }
}
