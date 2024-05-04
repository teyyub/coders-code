package com.example.coderscodes;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
//          Product[]products = new Product[];
         List<String>  names = new ArrayList<>();

          for(int i=0;i<100_000;i++){
              names.add("aa" +"-"+i);
          }
          names.remove(0);
          names.clear();
//          names.add

        System.out.println(names);
    }
}
