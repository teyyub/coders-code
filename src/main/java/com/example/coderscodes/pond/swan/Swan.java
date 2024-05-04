package com.example.coderscodes.pond.swan;
import com.example.coderscodes.pond.shore.Bird;
public class Swan extends Bird {
    public void swim() {
    floatInWater();
    System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass System.out.println(other.text);// package access to superclass
    }

    public void test(){
        Bird b  =new Bird();
//        b.floatInWater();
    }

    public void test1(){
        Bird b  = new Swan();
//        b.floatInWater();
    }
}

