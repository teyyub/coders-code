package com.example.coderscodes;

import java.util.ArrayList;
import java.util.List;

public class Strings {

    public static void main(String[] args) {

        List<Integer> aa = new ArrayList<>();
        aa.size();
         String st = new String("araz");

         for(int i =0 ; i< st.length(); i++){
             System.out.println(st.charAt(i));
         }

         String st1 = "java";
//         st1 = "java1";
        System.out.println(st1);
        System.out.println(st1.concat(" programming"));
        st1 = st1.concat(" programming");

        System.out.println(st1);
        st1 = "araz ";
        st1.trim();
        System.out.println(st1.trim().length());
        System.out.println(st1.length());
        st1 = st1.trim();
        System.out.println(st1.length());

//        int a = 4 , b =6;
//        int result = 10;
//        System.out.println((a+b+"1")*2);
//        System.out.println((4+6)*2);

//        String str0 = new String("java").concat(..aa ,aa ,bb );
//        String str = new String("java");
//        String str1 = "java"; //pool
//        String str2 = "java";
//
//        str = str0;
//        System.out.println(str == str0);



//        System.out.println(str0.equals(str));
//        System.out.println(str2.equals(str1));
//        System.out.println(str0.equals(str1));
//
//        System.out.println(str0 == str);
//        System.out.println(str == str1);
//        System.out.println(str1 == str2);
    }
}
