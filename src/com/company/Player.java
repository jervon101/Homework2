package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    private int pos = playstart();
     int health = 20;

    public int playstart() {
        ArrayList<Integer> hw = new ArrayList<>();

        for (int i = 0; i < 313; i++) {
            if ((0 < i && i < 62) || (125 < i && i < 188) || (254 < i && i < 314)) {
                if (i % 6 == 0) {
                    hw.add(i);
                }
            }
        }
        hw.size();
        Random rand = new Random();
        int randomNum = 0 + rand.nextInt((hw.size() - 1) + 1);

        return hw.get(randomNum)+1;

    }


    public int getPos() {
        return pos;
    }



    public void changePos(char operator, int num) {






                switch (operator) {
                case '+':

                    pos += num;
                    if (pos == 253) {
                        health -= 20;
                        System.out.println("You have entered a Trap, you have been struck by an arrow you lose 5hp");
                    }
                    if (pos == 295) {
                        health -= 20;
                        System.out.println("You have entered a Trap,you have been hit my hard rock you lose 5hp");
                    }
                    if (pos == 37) {
                        health -= 20;
                        System.out.println("You have entered a Trap, you have been bitten by a snake  you lose 5hp");
                    }
                    if (pos == 151) {
                        health -= 20;
                        System.out.println("You have entered a Trap, the floor opened up, but you held on for dear life, you lose 5hp");
                    }
                    if (pos == 157) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You ran into a mirror  Thinking it was the way out ,you lose 5hp");
                    }
                    if (pos == 31) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 13) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 169) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 307) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 295) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 55) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }if (pos == 283) {
                    health -= 20;
                    System.out.println("You have entered a Trap, You have stepped on a poison nail , you lose 5hp");
                }


                    break;
                case '-':
                    pos -= num;
                    if (pos == 253) {
                        health -= 20;
                        System.out.println("You have entered a Trap, you have been struck by an arrow you lose 5hp");
                    }
                    if (pos == 295) {
                        health -= 20;
                        System.out.println("You have entered a Trap,you have been hit my hard rock you lose 5hp");
                    }
                    if (pos == 37) {
                        health -= 20;
                        System.out.println("You have entered a Trap, you have been bitten by a snake  you lose 5hp");
                    }
                    if (pos == 151) {
                        health -= 20;
                        System.out.println("You have entered a Trap, the floor opened up, but you held on for dear life, you lose 5hp");
                    }
                    if (pos == 157) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You ran into a mirror  Thinking it was the way out ,you lose 5hp");
                    }
                    if (pos == 31) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 13) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 169) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 307) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 295) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }
                    if (pos == 55) {
                        health -= 20;
                        System.out.println("You have entered a Trap, You have stepped on a poison nail, you lose 5hp");
                    }if (pos == 283) {
                    health -= 20;
                    System.out.println("You have entered a Trap, You have stepped on a poison nail , you lose 5hp");
                }
                    break;
                default:
                    System.out.println("Turn around");
            }



    }







    public int getHealth() {
        return health;
    }

}
