package com.example.coderscodes.intf;

public class Add2 implements Operations{
    @Override
    public int operate(int num1, int num2) {
        return 2 * num1 + num2;
    }
}
