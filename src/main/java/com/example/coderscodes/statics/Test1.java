package com.example.coderscodes.statics;

import com.example.coderscodes.Student;

public class Test1 {

    public static void main(String[] args) {
         /*String s = "c++";
         print(s);
         System.out.println(s);*/
//        Student s1 = new Student();
        Student s = new Student("c++");
        System.out.println(s.getName());
        System.out.println(s.getAge());

//        print(s);
//        System.out.println(s.getName());
    }
    static void print(Student s){
        s.setName("java");
        System.out.println(s.getName());
    }

    static void print(String s){
        s = "java";
        System.out.println(s);
    }

    static int setNum(int num1){
        return num1*2;
    }

    static int add(int num1, int num2){
        num1 = 2*num1;
        num2 = 5*num2;
        return num1 + num2;
    }
}
