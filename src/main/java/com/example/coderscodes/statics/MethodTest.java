package com.example.coderscodes.statics;

import com.example.coderscodes.Student;

import java.util.*;

public class MethodTest {


    void print(Student s) {
        System.out.println(s.getName());
        s.setName("yeni java");
    }

    void add(int n, String a){
        System.out.println("pirimitive");

    }
    void add(Integer n){

        System.out.println("boyuk");
    }

    class User{
        String username;
        String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    List<Student> users = new ArrayList<>();

    List<Integer> numbers = new ArrayList<>();


//    numbers.add(1); new Integer(1);
//    numbers.add(2);
//    numbers.add(1);
    void users() {
        Map<String, User> mp = new HashMap();
//        mp.put("AZE", new User("AZER", "!@#$%"));
        List<Student> aze = new ArrayList<>();
        List<Student> rus = new ArrayList<>();
        List<Student> turk = new ArrayList<>();

//        Map<Student , Map<Key, Value>> students = new HashMap();

//        List<String> = Arrays.asList("aze","rus","turk");
//
//        students.("aze",aze);
//        students.put("tur",turk);
//        students.put("rus",rus);
//        String lang="aze";
//        students.get(lang).add(new Student());
//
//        mp.put("AZE", new User("BYCAN", "345345"));
//        mp.put("RUS", new User("bear", "345345345"));
//        mp.put("TUR", new User("turkiye", "1234"));

        String username="AZE";
        String password="1234";
        User registeredUser = mp.get(username);
        if(registeredUser.password.equals(password)){

        }

        List<User> users = new ArrayList<>();
        User user = new User("AZE","1234");
        for(User u:users){
             if(u.username.equals(user.username) && u.password.equals(user.password)){

             }
        }
    }


    public static void main(String[] args) {
        Student student = new Student("java");
        student.getNames().add("c");
        System.out.println(student.getNames());
        System.out.println(student.getName());
        student.setName("kohne java");
        new MethodTest().print(student);
        System.out.println(student.getName());
        class MoneyTypes{
            String key;
            String value;
        }

        List<String> names = Arrays.asList("a","b","c");


        Map<String, String> map = Map.of("aze","manat","tr","lira");
//        map.put("aze","manat");
//        map.put("tr","lira");
//        map.put("ru","rubl");

        String value = map.get("tr");
        System.out.println(value);
    }
}
