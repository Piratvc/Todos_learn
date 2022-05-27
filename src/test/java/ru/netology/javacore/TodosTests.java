package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodosTests {
    Todos todos = new Todos();

    @BeforeEach
    public void beforeEach() {
        todos.clear();
    }

    @Test

    public void addTask() {
        todos.addTask("Поспать");
        Assertions.assertTrue(todos.getListTodos().contains("Поспать"));
    }

    @Test
    public void deleteTask() {
        todos.addTask("Поспать");
        todos.addTask("Поработать");
        todos.removeTask("Поработать");
        Assertions.assertFalse(todos.getListTodos().contains("Поработать"));
    }

    @Test
    public void getAllTask() {
        todos.addTask("7");
        todos.addTask("2");
        todos.addTask("1");


        Assertions.assertTrue(todos.getAllTasks().equals("1 2 7 "));
    }
}



