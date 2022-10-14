import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] arg) {
        boolean GameEnd = false;
        boolean Win = false;
        boolean GotInput = false;
        boolean stun = false;
        boolean Collsision = true;
        int score = 0;
        boolean STUPIDO = false;
        Coordinates coordinates = new Coordinates();
        gamefield gamefield = new gamefield();
        gamefield.gamefield(coordinates.massive(coordinates.objects()));
//-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
        while (!GameEnd) {
//-*-*-coordinate integration-*-*-coordinate integration-*-*-coordinate integration-*-*-coordinate integration-*-*-*-*-*
            int plcorX = coordinates.getCoorObjects()[0][0];
            int plcorY = coordinates.getCoorObjects()[0][1];

            int plcorBPX = coordinates.getCoorObjects()[1][0];
            int plcorBPY = coordinates.getCoorObjects()[1][1];

            int Block1X = coordinates.getCoorObjects()[2][0];
            int Block1y = coordinates.getCoorObjects()[2][1];

            int Block2X = coordinates.getCoorObjects()[3][0];
            int Block2y = coordinates.getCoorObjects()[3][1];

            int Block3X = coordinates.getCoorObjects()[4][0];
            int Block3y = coordinates.getCoorObjects()[4][1];

            int MNcorX = coordinates.getCoorObjects()[5][0];
            int MNcorY = coordinates.getCoorObjects()[5][1];

            int MONScorX = coordinates.getCoorObjects()[6][0];
            int MONScorY = coordinates.getCoorObjects()[6][1];

            int MONBPScorX = coordinates.getCoorObjects()[7][0];
            int MONBPScory = coordinates.getCoorObjects()[7][1];

            int Block4X = coordinates.getCoorObjects()[8][0];
            int Block4Y = coordinates.getCoorObjects()[8][1];

            int Block5X = coordinates.getCoorObjects()[9][0];
            int Block5Y = coordinates.getCoorObjects()[9][1];

            int Block6X = coordinates.getCoorObjects()[10][0];
            int Block6Y = coordinates.getCoorObjects()[10][1];

//Check money-*-*-*-*-*Check money-*-*-*-*-*Check money-*-*-*-*-*Check money-*-*-*-*-*Check money-*-*-*-*-*Check money-*
            if ((coordinates.getCoorObjects()[0][1] == coordinates.getCoorObjects()[5][1]) &&
                    (coordinates.getCoorObjects()[0][0] == coordinates.getCoorObjects()[5][0])) {
                stun = true;
                System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
                System.out.println();
                System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
                System.out.println();
                System.out.println("your score - "+score );

                score = score + 1;
            while ((coordinates.getCoorObjects()[5][0] == coordinates.getCoorObjects()[0][0])&&(coordinates.getCoorObjects()[5][1] == coordinates.getCoorObjects()[0][1])|| // money AntiCollision
                    (coordinates.getCoorObjects()[5][0] == coordinates.getCoorObjects()[2][0])&&(coordinates.getCoorObjects()[5][1] == coordinates.getCoorObjects()[2][1])||
                    (coordinates.getCoorObjects()[5][0] == coordinates.getCoorObjects()[3][0])&&(coordinates.getCoorObjects()[5][1] == coordinates.getCoorObjects()[3][1])||
                    (coordinates.getCoorObjects()[5][0] == coordinates.getCoorObjects()[4][0])&&(coordinates.getCoorObjects()[5][1] == coordinates.getCoorObjects()[4][1])||
                    (coordinates.getCoorObjects()[5][0] == coordinates.getCoorObjects()[6][0])&&(coordinates.getCoorObjects()[5][1] == coordinates.getCoorObjects()[6][1])||
                    (coordinates.getCoorObjects()[5][0] == coordinates.getCoorObjects()[8][0])&&(coordinates.getCoorObjects()[5][1] == coordinates.getCoorObjects()[8][1])||
                    (coordinates.getCoorObjects()[5][0] == coordinates.getCoorObjects()[9][0])&&(coordinates.getCoorObjects()[5][1] == coordinates.getCoorObjects()[9][1])||
                    (coordinates.getCoorObjects()[5][0] == coordinates.getCoorObjects()[10][0])&&(coordinates.getCoorObjects()[5][1] == coordinates.getCoorObjects()[10][1])){
                Random number = new Random();
                coordinates.getCoorObjects()[5][0] = number.nextInt(7) + 1;;
                coordinates.getCoorObjects()[5][1] = number.nextInt(7) + 1;;}}

//Check Win-*-*-Check Win-*-*-Check Win-*-*-Check Win-*-*-Check Win-*-*-Check Win-*-*-Check Win-*-*-Check Win-*-*-*-*-*-
               if (score == 10){
                   coordinates.getCoorObjects()[5][0] = 9;
                   coordinates.getCoorObjects()[5][0] = 9;
               GameEnd = true;
                Win = true;
                break;}
//Check Monster-*-*-*-Check Monster-*-*-*-Check Monster-*-*-*-Check Monster-*-*-*-Check Monster-*-*-*-Check Monster-*-*-
            if ((((coordinates.getCoorObjects()[0][1] == coordinates.getCoorObjects()[6][1]) && (coordinates.getCoorObjects()[0][0] == coordinates.getCoorObjects()[6][0])||
                    (coordinates.getCoorObjects()[0][1] == coordinates.getCoorObjects()[7][1]) && (coordinates.getCoorObjects()[0][0] == coordinates.getCoorObjects()[7][0]))
                    &&
                    !(((coordinates.getCoorObjects()[6][0] == Block1X)&&(coordinates.getCoorObjects()[6][1] == Block1y))||
                    ((coordinates.getCoorObjects()[6][0] == Block2X)&&(coordinates.getCoorObjects()[6][1] == Block2y))||
                    ((coordinates.getCoorObjects()[6][0] == Block3X)&&(coordinates.getCoorObjects()[6][1] == Block3y))||
                    ((coordinates.getCoorObjects()[6][0] == Block4X)&&(coordinates.getCoorObjects()[6][1] == Block4Y))||
                    ((coordinates.getCoorObjects()[6][0] == Block5X)&&(coordinates.getCoorObjects()[6][1] == Block5Y))||
                    ((coordinates.getCoorObjects()[6][0] == Block6X)&&(coordinates.getCoorObjects()[6][1] == Block6Y))))
                    ||
                    (((coordinates.getCoorObjects()[1][1] == coordinates.getCoorObjects()[6][1]) && (coordinates.getCoorObjects()[1][0] == coordinates.getCoorObjects()[6][0]))
                            &&
                      (((coordinates.getCoorObjects()[0][0] == Block1X)&&(coordinates.getCoorObjects()[0][1] == Block1y))||
                      ((coordinates.getCoorObjects()[0][0] == Block2X)&&(coordinates.getCoorObjects()[0][1] == Block2y))||
                      ((coordinates.getCoorObjects()[0][0] == Block3X)&&(coordinates.getCoorObjects()[0][1] == Block3y))||
                      ((coordinates.getCoorObjects()[0][0] == Block4X)&&(coordinates.getCoorObjects()[0][1] == Block4Y))||
                      ((coordinates.getCoorObjects()[0][0] == Block5X)&&(coordinates.getCoorObjects()[0][1] == Block5Y))||
                      ((coordinates.getCoorObjects()[0][0] == Block6X)&&(coordinates.getCoorObjects()[0][1] == Block6Y)))))
                     {
                coordinates.getCoorObjects()[0][0] = 9;
                coordinates.getCoorObjects()[0][1] = 9;
                gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));
                GameEnd = true;
                break;}
//Check player collision-*-*-*-*-*Check player collision-*-*-*-*-*Check player collision-*-*-*-*-*Check player collision
            else if ((plcorX == Block1X) && (plcorY == Block1y)||
                    (plcorX == Block2X) && (plcorY == Block2y) ||
                    (plcorX == Block3X) && (plcorY == Block3y)||
                    (plcorX == Block4X) && (plcorY == Block4Y)||
                    (plcorX == Block5X) && (plcorY == Block5Y)||
                    (plcorX == Block6X) && (plcorY == Block6Y)||
                    (plcorX > 7) || (plcorY > 7)||
                    (plcorX < 0) || (plcorY < 0)) {
                for (int i = 0; i < 15 ; i++) {
                    System.out.println();}
                System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
                System.out.println();
                System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
                System.out.println();
                System.out.println("your score - "+score );
                Collsision = true;
                plcorX = coordinates.getCoorObjects()[1][0];
                plcorY = coordinates.getCoorObjects()[1][1];
                coordinates.getCoorObjects()[0][0] = coordinates.getCoorObjects()[1][0];
                coordinates.getCoorObjects()[0][1] = coordinates.getCoorObjects()[1][1];
                gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));


            }
//Check monster collision-*-*-*-Check monster collision-*-*-*-Check monster collision-*-*-*-Check monster collision-*-*-
         if ((MONScorX == Block1X) && (MONScorY == Block1y)||
                    (MONScorX == Block2X) && (MONScorY == Block2y) ||
                    (MONScorX == Block3X) && (MONScorY == Block3y)||
                    (MONScorX == Block4X) && (MONScorY == Block4Y)||
                    (MONScorX == Block5X) && (MONScorY == Block5Y)||
                    (MONScorX == Block6X) && (MONScorY == Block6Y)||
                    (MONScorX > 7) || (MONScorY > 7)||
                    (MONScorX < 0) || (MONScorY < 0)) {
             stun = false;
             for (int i = 0; i < 15 ; i++) {
                 System.out.println();}
             System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
             System.out.println();
             System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
             System.out.println();
             System.out.println("your score - "+score );
                Collsision = true;
             MONScorX = coordinates.getCoorObjects()[7][0];
             MONScorY = coordinates.getCoorObjects()[7][1];
                coordinates.getCoorObjects()[6][0] = coordinates.getCoorObjects()[7][0];
                coordinates.getCoorObjects()[6][1] = coordinates.getCoorObjects()[7][1];
                gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));


            }

            if(!Collsision)  {
                gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));
            }
            Collsision = false;
//-*-*player moving-*-*player moving-*-*player moving-*-*player moving-*-*player moving-*-*player moving-*-*-*-*-*-*-*-*
            while (!GotInput){
            System.out.println("Please enter the command (W, A, S, D, and F for stun):");
            Scanner Scanner = new Scanner(System.in);
            String sIS = Scanner.nextLine();


            if (sIS.equalsIgnoreCase("w")) {
                GotInput = true;
                for (int i = 0; i < 15 ; i++) {
                    System.out.println();}
                System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
                System.out.println();
                System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
                System.out.println("Moving: up");
                System.out.println("your score - "+score );

                coordinates.setCoorObjects(0, plcorX, plcorY - 1);
                GotInput = true;
            } else if (sIS.equalsIgnoreCase("s")) {
                for (int i = 0; i < 15 ; i++) {
                    System.out.println();}
                System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
                System.out.println();
                System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
                System.out.println("Moving: down");
                System.out.println("your score - "+score );

                coordinates.setCoorObjects(0, plcorX, plcorY + 1);
                GotInput = true;
            } else if (sIS.equalsIgnoreCase("a")) {
                for (int i = 0; i < 15 ; i++) {
                    System.out.println();}
                System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
                System.out.println();
                System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
                System.out.println("Moving: left");
                System.out.println("your score - "+score );;
                coordinates.setCoorObjects(0, plcorX - 1, plcorY);
                GotInput = true;
            } else if (sIS.equalsIgnoreCase("d")) {
                for (int i = 0; i < 15 ; i++) {
                    System.out.println();}
                System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
                System.out.println();
                System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
                System.out.println("Moving: right");
                System.out.println("your score - "+score );
                coordinates.setCoorObjects(0, plcorX + 1, plcorY);
                GotInput = true;
            } else if (sIS.equalsIgnoreCase("f")&&score > 0) {
                for (int i = 0; i < 15 ; i++) {
                    System.out.println();}
                System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
                System.out.println();
                System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
                System.out.println("Stun activate, Score -1");
                score = score  -1;
                System.out.println("your score - "+score );
                gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));
                stun = true;
            }  else if (sIS.equalsIgnoreCase("f")&&score == 0) {
                for (int i = 0; i < 15 ; i++) {
                    System.out.println();}
                System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
                System.out.println();
                System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
                System.out.println("cant activate Stun , (Score = 0)");
                System.out.println("your score - "+score );
                gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));
            } else {
                for (int i = 0; i < 15 ; i++) {
                    System.out.println();}
                System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
                System.out.println();
                System.out.printf("Now Monster coordinates: x(%s) y(%s) ", MONScorX, MONScorY);
                System.out.println();
                System.out.println("Invalid command");
                System.out.println("your score - "+score );
                gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));
            }}
            GotInput = false;
            coordinates.getCoorObjects()[1][0] = plcorX;
            coordinates.getCoorObjects()[1][1] = plcorY;
//-*-*monster moving-*-*monster moving-*-*monster moving-*-*monster moving-*-*monster moving-*-*monster moving-*-*-*-*-*
           if (!stun){

            if (MONScorX > plcorX ) {
                coordinates.setCoorObjects(6, MONScorX - 1, MONScorY );
            }  if (MONScorX < plcorX) {
                coordinates.setCoorObjects(6, MONScorX + 1, MONScorY );
            }
               if (MONScorY > plcorY ) {
                coordinates.setCoorObjects(6, MONScorX , MONScorY - 1 );
            } if (MONScorY < plcorY) {
                coordinates.setCoorObjects(6, MONScorX , MONScorY + 1 );
            }

            coordinates.getCoorObjects()[7][0] = MONScorX;
            coordinates.getCoorObjects()[7][1] = MONScorY;
           }
            stun = false;
//-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

        }
        for (int i = 0; i < 35 ; i++) {
            System.out.println();}
        gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));
        System.out.println();
        System.out.println();
        if (Win) {
        System.out.println("congratulations - You win!, GameOver; Your Score - "+score+"/10");}
        else {
            System.out.println("OH NOOOOOOOO! - You were devoured!, GameOver; Your Score - "+score+"/10" );}
    }
}