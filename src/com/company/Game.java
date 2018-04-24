package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList<String> blocks = new ArrayList<>();

    public Game() {
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");


    }
    public static int getinput (int user) {
        return user;
    }





    public String play(int block, int turn) {
        String board = "";
        int i = 0;
        while (turn < blocks.size() - 1) {
            String charinput = "";
            if (turn % 2 == 0) {
                charinput = "[ X ]";
            } else {
                charinput = "[ O ]";
            }
            /*
            while (true) {

                System.out.print("Please choose block: ");

                if (!blocks.get(intinput).equalsIgnoreCase("[   ]")) {
                    continue;
                }
                */
                int intinput = block;
                blocks.set(intinput, charinput);
                //break;

           // }

           String firstRow = blocks.get(7) + " " + blocks.get(8) + " " + blocks.get(9);
           String secondRow = blocks.get(4) + " " + blocks.get(5) + " " + blocks.get(6);
           String thirdRow = blocks.get(1) + " " + blocks.get(2) + " " + blocks.get(3);
          board = firstRow + "\n" + secondRow + "\n" + thirdRow;
            i++;

        }
    return board;
    }



    public boolean whoWins(String winner) {
        String winning = "[ " + winner + " ]";
        if (blocks.get(7).equalsIgnoreCase(winning) && blocks.get(8).equalsIgnoreCase(winning) && blocks.get(9).equalsIgnoreCase(winning)) {
            return true;
        }

        if (blocks.get(4).equalsIgnoreCase(winning) && blocks.get(5).equalsIgnoreCase(winning) && blocks.get(6).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(1).equalsIgnoreCase(winning) && blocks.get(2).equalsIgnoreCase(winning) && blocks.get(3).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(9).equalsIgnoreCase(winning) && blocks.get(5).equalsIgnoreCase(winning) && blocks.get(1).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(3).equalsIgnoreCase(winning) && blocks.get(5).equalsIgnoreCase(winning) && blocks.get(7).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(7).equalsIgnoreCase(winning) && blocks.get(4).equalsIgnoreCase(winning) && blocks.get(1).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(8).equalsIgnoreCase(winning) && blocks.get(5).equalsIgnoreCase(winning) && blocks.get(2).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(9).equalsIgnoreCase(winning) && blocks.get(6).equalsIgnoreCase(winning) && blocks.get(3).equalsIgnoreCase(winning)) {
            return true;
        } else {
            return false;
        }
    }


}