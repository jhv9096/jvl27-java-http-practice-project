package com.john.httppractice;

import com.john.httppractice.todo.Todo;
import com.john.httppractice.todo.TodoService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TodoService todoService = new TodoService();

        try {
            List<Todo> todos = todoService.getAllTodos();
            System.out.println("Fetched " + todos.size() + " todos.");
            System.out.println("First todo: " + todos.get(0).getTitle());

            Todo singleTodo = todoService.getTodoById(1);
            System.out.println("Todo #1: " + singleTodo.getTitle() + " (Completed: " + singleTodo.isCompleted() + ")");
        } catch (Exception e) {
            System.err.println("Error fetching todos: " + e.getMessage());
        }
    }
}