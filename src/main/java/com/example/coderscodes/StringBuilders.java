package com.example.coderscodes;

public class StringBuilders {
    public static void main(String[] args) {

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        one.equals(two);
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        System.out.println(one);
        System.out.println(three);

        three.append("b");




        String s =    "a";
       s = s.concat("v");
        System.out.println(s);

        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append("d").append("e");
        System.out.println(sb);

        sb.insert(1,"1");
        System.out.println(sb);
    }

}
