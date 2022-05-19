package ru.netology.javacore;

import java.util.*;

public class Todos {

    private String task;
    private static TreeSet<String> listTodos = new TreeSet<>();

    public void addTask(String task) {
        listTodos.add(task);
    }

    public void removeTask(String task) {
        listTodos.remove(task);
    }

    public static TreeSet<String> getListTodos() {
        return listTodos;
    }

    public String getAllTasks() {
        StringBuilder output = new StringBuilder();
        for (String toDos : listTodos) {
            output.append(toDos).append(' ');
        }
        return output.toString();
    }

    public void clear() {
        task = null;
        listTodos.clear();
    }
}
