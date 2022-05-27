package ru.netology.javacore;

import java.util.*;

public class Todos {

    private TreeSet<String> listTodos = new TreeSet<>();

    public void addTask(String task) {
        listTodos.add(task);
    }

    public void removeTask(String task) {
        listTodos.remove(task);
    }

    public TreeSet<String> getListTodos() {
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
        listTodos.clear();
    }
}
