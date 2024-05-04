package com.example.coderscodes;

import java.awt.datatransfer.FlavorListener;
import java.util.ArrayList;
import java.util.List;

public class Ext7 {
    public static void main(String[] args) {
//        for(int i = 0; i <3; i++)
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(String st:list){
            System.out.println(st);
        }
    }
}
