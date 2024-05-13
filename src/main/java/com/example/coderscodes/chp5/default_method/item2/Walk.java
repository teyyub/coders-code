package com.example.coderscodes.chp5.default_method.item2;

public interface Walk {
    default int getSpeed() {
        return 5;
    }
}
