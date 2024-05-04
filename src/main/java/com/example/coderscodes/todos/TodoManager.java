package com.example.coderscodes.todos;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoManager {
     static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.mm.yyyy");
     static List<Todo> todos = new ArrayList<>();
    static List<Todo> overDueTodos ;
     private int counter;
    static void showOverDueTodos(){
        overDueTodos = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        for(Todo t:todos){

//            System.out.println(t.dueDate);
//            System.out.println(t.dueDate.isAfter(now));

//            cretetAt > 20:00
//            dueDate -> 20:02
//            now -> 20:01
//            now -> 20:02
//            now -> 20:03
            if ( t.dueDate.isBefore(now)){
                overDueTodos.add(t);
               // todos.remove(t);
            }
        }
        System.out.println("showing overtodo task");
        for(Todo t1:overDueTodos){
            System.out.println(t1);
        }
    }

     static void showTodos(){
         System.out.println("Showing All todos....");
         if(todos.isEmpty()){
             System.out.println("There is no todos");
         } else {
            for(Todo t:todos){
                System.out.println(t);
            }
         }
     }

     static void addTodo(Scanner input){
         System.out.println("Adding todo to the list.....");
         System.out.println("Enter todo title");
         String title = input.nextLine();
         System.out.println("Enter todo note");
         String note = input.nextLine();
//                    System.out.println("Enter todo dueDate:(yyyy-mm-dd) format");
//                    String dueDate = input.nextLine();
         LocalDateTime due = LocalDateTime.now().plusMinutes(2);
         Todo todo = new Todo(title,note,due);
         todos.add(todo);
     }

     static void deleteTodo(Scanner input){
         System.out.println("Enter title for deleting ");
         String titleDelete = input.nextLine();
         boolean found = false;
         for(Todo t : todos){
             if(t.title.equals(titleDelete)){
                 found = true;
                 todos.remove(t);
                 break;
             }
         }
         if(!found){
             System.out.println("this " + titleDelete + " does not exist");
         }
     }

     static void editTodo(Scanner scanner){
         System.out.println("Enter title for editing ");
         String titleEdit = scanner.nextLine();
         for(Todo t:todos){
             if(t.title.equals(titleEdit)){
                 System.out.println("Enter title for edit ");
                 String titleEdit1 = scanner.nextLine();
                 t.title = titleEdit1;
                 break;
             }
         }
     }

     static void showMenu(){
         System.out.println("======MENU======");
         System.out.println("1. ADD");
         System.out.println("2. DELETE");
         System.out.println("3. EDIT");
         System.out.println("4. SHOW");
         System.out.println("5. SHOW OVER TODOS");
         System.out.println("6. Change Status Todo");
         System.out.println("q. QUIT");
         System.out.println("Select option");
     }

    public static void main(String[] args) {

//        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime pl = now.plusMinutes(1);
//        System.out.println(pl.isAfter(now));
//        System.exit(1);

        Scanner input = new Scanner(System.in);
        boolean flag =true;
        while(flag){
            showMenu();
            char option = input.nextLine().charAt(0);
            //input.nextLine();
            switch (option) {
                case '1':
                      addTodo(input);
                    break;
                case '2':
                     deleteTodo(input);
                    break;
                case '3':
                    showTodos();
                    editTodo(input);
                    break;
                case '4':
                     showTodos();
                    break;
                case '5':
                    showOverDueTodos();
                    break;
                case 'q':
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }

    }
}
