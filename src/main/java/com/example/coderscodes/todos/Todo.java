package com.example.coderscodes.todos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Todo {
    String title;
    String note;
    LocalDateTime createdAt;
    LocalDateTime dueDate;
    String status ;//"Progress";//Completed //Hold //N

    public Todo(String title, String note, LocalDateTime cteatedAt, LocalDateTime dueDate){
        this.title = title;
        this.note = note;
        this.createdAt = cteatedAt;
        this.dueDate = dueDate;
    }


    public Todo(String title, String note,  LocalDateTime dueDate){
        this.title = title;
        this.note = note;
        this.createdAt = LocalDateTime.now();
        this.dueDate = dueDate;
    }

    public Todo(String title, String note){
        this.title = title;
        this.note = note;
        this.createdAt = LocalDateTime.now();
        this.dueDate = LocalDateTime.now().plusDays(3);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", note='" + note + '\'' +
                ", createdAt=" + createdAt +
                ", dueDate=" + dueDate +
                '}';
    }
}
