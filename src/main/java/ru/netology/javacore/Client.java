package ru.netology.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

public class Client {
    public static char pickRandomChar() {
        String chars = "ABCDEFG1234567890";
        return chars.charAt(new Random().nextInt(chars.length()));
    }

    public static String pickRandomType() {
        boolean seed = new Random().nextBoolean();
        return seed ? "ADD" : "REMOVE";
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        try (
                Socket socket = new Socket("localhost", 8080);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        ) {
            while (true) {
                out.println("{ \"typeTask\": \"" + pickRandomType() + "\", \"task\": \"task #" + pickRandomChar() + "\" }");
                System.out.println(in.readLine());

                Thread.sleep(500);
            }
        }
    }
}
