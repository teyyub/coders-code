package com.example.coderscodes.intf.item4;

public interface IsWarmBlooded {
    boolean hasScales();
    public default double getTemperature() {
        return 10.0;
    }
}
