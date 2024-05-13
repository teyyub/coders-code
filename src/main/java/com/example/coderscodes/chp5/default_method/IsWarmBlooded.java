package com.example.coderscodes.chp5.default_method;

public interface IsWarmBlooded {
    boolean hasScales();
    default double getTemperature() {
        return 10.0;
    }
}
