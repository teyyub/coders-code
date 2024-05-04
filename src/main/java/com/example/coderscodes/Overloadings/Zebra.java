package com.example.coderscodes.Overloadings;

public class Zebra extends Animal {
    public Zebra(int age) {
//        age = 10;
        super(age);
    }
    public Zebra() {
        this(4);
    }
}

