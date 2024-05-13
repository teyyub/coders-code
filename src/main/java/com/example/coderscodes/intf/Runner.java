package com.example.coderscodes.intf;

import java.util.*;

public interface Runner {
    int add(int a, int b);
    void print(String message);
}
interface Connection {
    boolean connected();
}
class A {

    Connection con;

    public A(Connection con) {
        this.con = con;
    }
    boolean connect(){
      return  con.connected();
    }

    public static void main(String[] args) {


    }

    void print(List<Integer> numbers ){

        for(Integer i:numbers){

        }
    }

//    void print(ArrayList<Integer> a) {
//        for(Integer i:a){
//
//        }
//    }
//
//    void print(Queue<Integer> a) {
//        for(Integer i:a){
//
//        }
//    }
//
//    void print(Stack<Integer> a) {
//        for(Integer i:a){
//
//        }
//    }
//    void print(Vector<Integer> a) {
//        for(Integer i:a){
//
//        }
//    }
//
//    void print(int[]  a) {
//        for(Integer i:a){
//
//        }
//    }
}
