package com.example.coderscodes.chp5.extending;


public class Lion extends Animal {
    @Override
    public int getAge() {
        return 20;
    }
        private void roar() {
            System.out.println("The parent "+super.getAge()+" year old lion says: Roar!");
            System.out.println("The child "+this.getAge()+" year old lion says: Roar!");
//            System.out.println("The child "+super.age+" year old lion says: Roar!");
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        l.setAge(10);
        l.roar();
    }
}
