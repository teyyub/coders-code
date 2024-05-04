package com.example.coderscodes;

import java.util.Scanner;

public class Ext8 {
    public static void main(String[] args) {



        for(int num = 0; num <5 ;num++ ){
            for(int j=0; j<3; j++){
                System.out.print(j);
            }
        }

        Scanner input = new Scanner(System.in);
//        System.out.println("enter character: ");
//        char ch = input.nextLine().charAt(0);
//        System.out.println(ch);
        boolean flag = true;

          while(flag){
//              System.out.println("quit: q");
//
//              System.out.println("Login(1):");
//              String name = input.nextLine();
//              System.out.println("enter surname:");
//              String surname = input.nextLine();
//              System.out.println("enter age:");
//              int age = input.nextInt();
//              input.nextLine();

//              String str1 = "quit" ;
//              String str2 = new String("quit");
              System.out.println("Login(1):");
              System.out.println("quit(q:Q)");
              char ch = input.nextLine().charAt(0);
              if(ch=='1'){
                  System.out.print("enter username : ");
                  String username = input.nextLine();
                  System.out.print("enter password: ");
                  String password = input.nextLine();
                  if(username.equals("admin") && password.equals("admin")){
                      System.out.println("welcome, " + username);
                  } else {
                      System.out.println("you are not allowed ");
                  }
              }else  if(ch == 'q' || ch =='Q' ){
                    flag = false;
              }
          }
    }
}
