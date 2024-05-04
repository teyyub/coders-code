package com.example.coderscodes.abstracts;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    abstract void makeSound();


    public static void main(String[] args) {
         Animal z = new Zebra();
         Animal d = new Dog();
         List<Animal> animals = new ArrayList<>();

         animals.add(new Zebra());
         animals.add(new Dog());
//         animals.add("test");
//         animals.add(5);

         for(Animal a : animals){
              a.makeSound();
         }

    }
}
 class Zebra extends Animal {
   void makeSound(){
        System.out.println("zibra zibra 1");
    }
 }

 class Dog extends Animal {
     void makeSound(String st){

     }
     void makeSound(){
         System.out.println("dog dog 1");
     }
 }
