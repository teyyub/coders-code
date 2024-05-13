package com.example.coderscodes.chp5.static_method;

public interface Hop {
    static int getJumpHeight() {
        return 8;
    }

     default double getJumpHeight(int a) {

        return getJumpHeight();
    }

//     int getJumpHeight() {
//        return 8;
//    }
}
