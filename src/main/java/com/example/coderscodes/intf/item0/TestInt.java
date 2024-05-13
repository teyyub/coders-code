package com.example.coderscodes.intf.item0;

public interface TestInt extends Herbivore, Omnivore{
    void print();

    public static void main(String[] args) {
        TestInt ti = new TestInt() {
            @Override
            public void print() {

            }

            @Override
            public void eatPlants() {

            }

            @Override
            public void eatMeat() {

            }
        };
    }
}
