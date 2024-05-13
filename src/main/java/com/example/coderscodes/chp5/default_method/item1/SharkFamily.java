package com.example.coderscodes.chp5.default_method.item1;

public interface SharkFamily extends HasFins {
    public default int getNumberOfFins() {
        return 8;
    }
    public double getLongestFinLength();
     public default boolean doFinsHaveScales() { // DOES NOT COMPILE
        return false;
    }
}
