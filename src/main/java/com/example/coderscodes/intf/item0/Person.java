package com.example.coderscodes.intf.item0;

public class Person implements Walker{
    @Override
    public void walk() {
        System.out.println("person is walking");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.walk();

        Walker w = new Person();
        w.walk();
    }
}
