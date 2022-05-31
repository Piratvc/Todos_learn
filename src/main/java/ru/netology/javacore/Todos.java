package ru.netology.javacore;

import java.util.*;

public class Todos {

    private List<String> listTodos = new ArrayList<>();

    public void addTask(String task) {
        listTodos.add(task);
    }

    public void removeTask(String task) {
        listTodos.remove(task);
    }

    public List<String> getListTodos() {
        return listTodos;
    }

    public String getAllTasks() {
        Collections.sort(listTodos);
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
