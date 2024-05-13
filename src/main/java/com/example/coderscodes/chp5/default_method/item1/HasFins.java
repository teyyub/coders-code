package com.example.coderscodes.chp5.default_method.item1;

public interface HasFins {
     default int getNumberOfFins() {
        return 4;
    }
    public default double getLongestFinLength() {
         return 20.0;
     }
    public default   boolean doFinsHaveScales() {
        return true;
    }
}