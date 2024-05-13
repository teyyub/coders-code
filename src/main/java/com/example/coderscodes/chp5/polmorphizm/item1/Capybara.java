package com.example.coderscodes.chp5.polmorphizm.item1;

public class Capybara extends Rodent {
    public static void main(String[] args) {
    Capybara rodent = new Capybara();
        Rodent capybara = rodent; // Throws ClassCastException at runtime
    Capybara capybara1 = (Capybara) capybara;
    }
}
