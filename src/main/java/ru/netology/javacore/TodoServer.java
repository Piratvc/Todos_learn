package ru.netology.javacore;

import com.google.gson.Gson;

import javax.imageio.IIOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TodoServer {
    private int port;
    private Todos todos;

    public TodoServer(int port, Todos todos) {
        this.port = port;
        this.todos = todos;
    }

    public void start() throws IOException {

        Gson gson = new Gson();

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Starting server at " + port + "...");

            while (true) {
                try (
                        Socket clientSocket = serverSocket.accept();
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                ) {
                    String task = in.readLine();
                    todos = gson.fromJson(task, Todos.class);
                    if (todos.getType().equals("ADD")) {
                        todos.addTask();
                    } else {
                        todos.removeTask();
                    }

                    out.println(todos.getAllTasks());
                }
            }
        } catch (IIOException e) {
            e.printStackTrace();
        }
    }
}