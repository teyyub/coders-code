package com.example.coderscodes;

import java.util.ArrayList;
import java.util.List;

public class Student  {
  private    String name;
  private    int age;
  private List<String> names = new ArrayList<>();


//    public Student(){}

    public Student(String name) {

       this(name, "aaaaaa", 12);
       names.add("a");
       names.add("b");
    }

    public Student(String name , String a, int age ) {
        super();
        this.name = name;
        this.age = age;
    }

    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
        return ;
    }

    public boolean max(int a, int b){
        return a==b;
    }

    @Override
    public boolean equals(Object obj){
        return  this == obj;
    }
}
