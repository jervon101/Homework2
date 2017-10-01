package com.company;



import java.util.Scanner;
public class Motion {


    public static String addPlayer(Player player,String string){
        char[] stringChar = string.toCharArray();
        stringChar[player.getPos()] = 'X';
        string = String.valueOf(stringChar);
        System.out.println(string);
        return string;
    }
    public static void removePlayer(Player player, String string){
        char[] floorChar = string.toCharArray();
        floorChar[player.getPos()] = ' ';
        string = String.valueOf(floorChar);
    }
    public static void move(String string, Player player){
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()){
            case "right":
                if((string.charAt(player.getPos()+6)) == ' '){
                    removePlayer(player, string);
                    player.changePos('+',6);
                    addPlayer(player, string);
                } else {
                    System.out.println("invalid");
                }
                break;
            case "left":
                if(string.charAt(player.getPos()-6) == ' '){
                    removePlayer(player,string);
                    player.changePos('-',6);
                    addPlayer(player,string);
                } else { System.out.print("invalid");}
                break;
            case "down":
                if(string.charAt(player.getPos()+64)=='|'){
                    removePlayer(player,string);
                    player.changePos('+',126);
                    addPlayer(player,string);
                } else {System.out.println("invalid");}
                break;
            case "up":
                if(string.charAt(player.getPos()-62)== '|'){
                    removePlayer(player,string);
                    player.changePos('-',126);
                    addPlayer(player,string);
                } else {System.out.println(string.charAt(player.getPos()-62)+ "  :invalid");}
                break;
            default:
                System.out.println("There isnt a tunnel");
                break;

        }
    }
}


