package com.example.coderscodes.intf.item4;

public class Test implements IsWarmBlooded{
    @Override
    public boolean hasScales() {
        return false;
    }

    @Override
    public double getTemperature() {
        return 20.9;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.hasScales());
        System.out.println(t.getTemperature());
    }
}
