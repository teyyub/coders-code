package com.example.coderscodes.enums;

public enum PizzaStatus {
    ORDERED(1),
    READY(2),
    DELIVERED(3);
    int value;
    PizzaStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
