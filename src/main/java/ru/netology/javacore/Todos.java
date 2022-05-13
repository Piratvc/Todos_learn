package ru.netology.javacore;

import java.util.*;

public class Todos {
    private String typeTask;
    private String task;
    private static TreeSet<String> listTodos = new TreeSet<>();

    public void addTask() {
        listTodos.add(task);
    }

    public void addTask(String task) {
        listTodos.add(task);
    }

    public void removeTask() {
        listTodos.remove(task);
    }

    public void removeTask(String task) {
        listTodos.remove(task);
    }

    public String getType() {
        return typeTask;
    }

    public String getTask() {
        return task;
    }

    public static TreeSet<String> getListTodos() {
        return listTodos;
    }

    public String getAllTasks() {
        StringBuilder output = new StringBuilder();
        for (String toDos: listTodos) {
            output.append(toDos).append(' ');
        }
        return output.toString();
    }

    public void clear() {
        typeTask = null;
        task = null;
        listTodos.clear();
    }
}
