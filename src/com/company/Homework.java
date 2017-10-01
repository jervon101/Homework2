package com.company;
import java.util.*;
public class Homework {

    public static void main(String [] args){

        System.out.println("What is your favorite Clothing item? shoes , jacket , bag , hang bag");
        Scanner scanner = new Scanner(System.in);
        String   favoriteIteam = scanner.nextLine( ).toLowerCase();


        System.out.println("Its Friday, and guess wha?, your direct deposit just came!!!, you are now part of the money team.");
        System.out.println ("    ");


        int keepingcount = 0;
        char ifStatement = 'a';


        while (keepingcount != 1){
            System.out.println(" Do you save your check? or Spend that money because you work hard and you deserve it? (Y - to spend or N--to save)");
            String  theFirstChoice = scanner.nextLine( ).toLowerCase();


            if ( theFirstChoice.charAt(0) == 'y') {
                System.out.println("Yassssss spend that check. You know that  "+  favoriteIteam + " nyou have been eyeing. Your friend has sent you a link where that exact iteam is on sale. But it cost a good chuck of your check! Should we buy it?");
                System.out.println ("    ");
                ifStatement = 'b';
                keepingcount++;
            } else {
                System.out.println("Wow you really take adult hood to seriously, loosen up.!!-_- Lets try this again.");
                System.out.println ("    ");
            }
        }

        System.out.println("Nice choice, you are now a fashionable person.But who buys a clothing iteam without a matching iteam? ...Losers...are you gonna buy a bag , shoe , or both.");
        String  theSecondtChoice = scanner.nextLine( ).toLowerCase();

        int fortheswtich;

        if (theSecondtChoice.equalsIgnoreCase ("bag")) {
            fortheswtich = 1 ;


        } else if (theSecondtChoice.equalsIgnoreCase ("shoe")){
            fortheswtich = 2;

        } else {
            fortheswtich = 3;
        }


        switch(fortheswtich) {
            case 1 :
                System.out.println("Feels good right, Speadinng all that hard earned money instead of paying your bills");
                break;
            case 2 :
                System.out.println("I like the way you think, Responsibilities is alwasy in the back seat");
                break;
            default:
                System.out.println("I didnt know you was such a big spender, but you are broke now");
                break;
        }

        int printsTwice = 2;

        for ( int i = 0; i < printsTwice; i++) {
            System.out.println("Game Over");
          }

    }
}
