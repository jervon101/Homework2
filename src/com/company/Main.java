package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {



        Motion moving = new Motion();
        Player play1 = new Player();
        MapSymbols test = new MapSymbols();
        test.createMap(3, 10, 2);
        int zero = 0;



        while (zero == 0) {
            String hello = test.getDumMap();
            moving.move(hello, play1);
//                   if( test.firstplayer.getHealth() < 0){
//                         System.out.println("You Lost");
//             break;

//        }

        }
    }
 }











