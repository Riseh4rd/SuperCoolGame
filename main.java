import javax.swing.*;
import java.util.Scanner;
public class main {
    public static void main(String[] arg) {
        boolean GameEnd = false;
        boolean GotInput = false;
        boolean Collsision = true;
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
//Check money-*-*-*-*-*Check money-*-*-*-*-*Check money-*-*-*-*-*Check money-*-*-*-*-*Check money-*-*-*-*-*Check money-*
            if ((coordinates.getCoorObjects()[0][1] == coordinates.getCoorObjects()[5][1]) &&
                    (coordinates.getCoorObjects()[0][0] == coordinates.getCoorObjects()[5][0])) {
                GameEnd = true;
                break;}
//Check collision-*-*-*-*-*Check collision-*-*-*-*-*Check collision-*-*-*-*-*Check collision-*-*-*-*-*Check collision-*-
            else if ((plcorX == Block1X) && (plcorY == Block1y)||
                    (plcorX == Block2X) && (plcorY == Block2y) ||
                    (plcorX == Block3X) && (plcorY == Block3y)||
                    (plcorX > 7) || (plcorY > 7)||
                    (plcorX < 0) || (plcorY < 0)) {
                System.out.println("Block collision!");
                Collsision = true;
                plcorX = coordinates.getCoorObjects()[1][0];
                plcorY = coordinates.getCoorObjects()[1][1];
                coordinates.getCoorObjects()[0][0] = coordinates.getCoorObjects()[1][0];
                coordinates.getCoorObjects()[0][1] = coordinates.getCoorObjects()[1][1];
                gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));

            }

            if(!Collsision)  {
                gamefield.gamefield(coordinates.massive(coordinates.getCoorObjects()));

            }
            Collsision = false;

            System.out.println("Please enter the command (W, A, S, D):");
            Scanner Scanner = new Scanner(System.in);
            String sIS = Scanner.nextLine();

            System.out.printf("Now Player coordinates: x(%s) y(%s) ", plcorX, plcorY);
            System.out.println();

            if (sIS.equalsIgnoreCase("w")) {
                System.out.println("Moving: up");
                coordinates.setCoorObjects(0, plcorX, plcorY - 1);
            } else if (sIS.equalsIgnoreCase("s")) {
                System.out.println("Moving: down");
                coordinates.setCoorObjects(0, plcorX, plcorY + 1);
            } else if (sIS.equalsIgnoreCase("a")) {
                System.out.println("Moving: left");
                coordinates.setCoorObjects(0, plcorX - 1, plcorY);
            } else if (sIS.equalsIgnoreCase("d")) {
                System.out.println("Moving: right");
                coordinates.setCoorObjects(0, plcorX + 1, plcorY);
            } else {
                System.out.println("Invalid command");
            }
            coordinates.getCoorObjects()[1][0] = plcorX;
            coordinates.getCoorObjects()[1][1] = plcorY;


//-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

        }
        System.out.println("congratulations - GameOver, You win!");
    }
}