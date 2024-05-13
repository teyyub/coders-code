package com.example.coderscodes.chp5.default_method;

public class Test implements IsWarmBlooded{
    @Override
    public boolean hasScales() {
        return false;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.getTemperature();
        t.hasScales();
    }
}
