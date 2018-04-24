package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        int portNumber = 4040;
        while (true) {
            try {
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));

                Game game = new Game();
               for (int i = 0; i < 9; i++) {
                    String text = in.readLine();
                    int block = Integer.parseInt(text);
                    int in1 = Game.getinput(block);
                   out.println(game.play(in1,i));


               }
            } catch (Exception e) {

            }

            // boolean hasWon = game.whoWins("x");
            //System.out.println(hasWon);
        }
    }
}
