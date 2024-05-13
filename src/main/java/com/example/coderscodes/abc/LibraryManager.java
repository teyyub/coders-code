package com.example.coderscodes.abc;

import java.util.ArrayList;
import java.util.List;

enum PersonType{
    STUDENT,TEACHER,PERSON;
}
class Abuneci{
    private String name;
    private String surname;
    private String info;
    PersonType personType;
}
class Student{
    private String name;
    private String surname;
    private String info;
} ;
class Teacher{
    private String name;
    private String surname;
    private String info;
} ;
class Person {
    private String name;
    private String surname;
    private String info;
} ;

public class LibraryManager {
    List<Student> students = new ArrayList<>();
    void add(Student s){
        students.add(s);
    };
    void add(Teacher s){};
    void add(Person s) {};

    public static void main(String[] args) {
        new LibraryManager().add(new Person());
        new LibraryManager().add(new Teacher());
        new LibraryManager().add(new Student());
    }
}
