package com.example.coderscodes.chp5.polmorphizm;

public class Lemur extends Primate implements HasTail {
    @Override
    public boolean isTailStriped() {
        return false;
    }
    private int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        System.out.println(lemur.hasHair());
        System.out.println(lemur.isTailStriped());
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
//        System.out.println(hasTail.getHasTaile());
        Primate primate = lemur;
        System.out.println(primate.hasHair());
//        System.out.println(primate.isTailStriped());
//        System.out.println(primate.age);

//        Lemur lemur2 =(Lemur) new String("");
//             System.out.println(lemur2.age);
        }
}
