package com.example.coderscodes;

public class MutableString {

    String str;

    public MutableString(String s){
        this.str = s;
    }

    MutableString setStr(String s){
        this.str = s;
        return new MutableString(this.str);
    }

    public static void main(String[] args) {
          MutableString str1 = new MutableString("java");
          System.out.println(str1.str);
          str1.setStr(" programming");
          System.out.println(str1.str.trim());
//         String st = new String("araz");
//         String st1 = "java";
////         st1 = "java1";
//        System.out.println(st1);
//        System.out.println(st1.concat(" programming"));
//        st1 = st1.concat(" programming");
//
//        System.out.println(st1);
//        st1 = "araz ";
//        st1.trim();
//        System.out.println(st1.trim().length());
//        System.out.println(st1.length());
//        st1 = st1.trim();
//        System.out.println(st1.length());

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
