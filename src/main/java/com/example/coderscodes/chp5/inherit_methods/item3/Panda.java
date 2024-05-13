package com.example.coderscodes.chp5.inherit_methods.item3;

import java.util.ArrayList;

//static olmayan yaz ve yoxla
public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    @Override
    public void walk() {
        System.out.println("Panda is walking");
    }

    public static void main(String[] args) {
//        Panda.eat();
//        Bear.eat();

        Bear bear = new Bear();
        Bear panda = new Panda();
//        List<Bear> bears = new ArrayList<>();
//        bear.walk();
//        panda.walk();

        Bear.eat();
        Panda.eat();
    }
}
