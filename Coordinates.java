import java.util.Random;
public class Coordinates {
    private int[][]coorObjects;

    // || 1.Player || 2.PlayerBP || 3.Block1 || 4.Block2 || 5.Block3 || 6.Money ||
    public int[][] objects() {
        Random number = new Random();
        int[][] coorObjects = new int[6][2];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                coorObjects[i][j] = number.nextInt(7) + 1;
            }
        }
        while ((coorObjects[2][0] == coorObjects[0][0])&&(coorObjects[2][1] == coorObjects[0][1])) { // Block1 AntiCollision
            coorObjects[2][0] = number.nextInt(7) + 1;;
            coorObjects[2][1] = number.nextInt(7) + 1;;}
        while ((coorObjects[3][0] == coorObjects[0][0])&&(coorObjects[3][1] == coorObjects[0][1])|| // Block2 AntiCollision
              (coorObjects[3][0] == coorObjects[2][0])&&(coorObjects[3][1] == coorObjects[2][1])) {
            coorObjects[3][0] = number.nextInt(7) + 1;;
            coorObjects[3][1] = number.nextInt(7) + 1;;}
        while ((coorObjects[4][0] == coorObjects[0][0])&&(coorObjects[4][1] == coorObjects[0][1])|| // Block3 AntiCollision
                (coorObjects[4][0] == coorObjects[2][0])&&(coorObjects[4][1] == coorObjects[2][1])||
                (coorObjects[4][0] == coorObjects[3][0])&&(coorObjects[4][1] == coorObjects[3][1])){
            coorObjects[4][0] = number.nextInt(7) + 1;;
            coorObjects[4][1] = number.nextInt(7) + 1;;}
        while ((coorObjects[5][0] == coorObjects[0][0])&&(coorObjects[5][1] == coorObjects[0][1])|| // Money AntiCollision
                (coorObjects[5][0] == coorObjects[2][0])&&(coorObjects[5][1] == coorObjects[2][1])||
                (coorObjects[5][0] == coorObjects[3][0])&&(coorObjects[5][1] == coorObjects[3][1])||
                (coorObjects[5][0] == coorObjects[4][0])&&(coorObjects[5][1] == coorObjects[4][1])){
            coorObjects[5][0] = number.nextInt(7) + 1;;
            coorObjects[5][1] = number.nextInt(7) + 1;;}


        coorObjects[1][0] = coorObjects[0][0];
        coorObjects[1][1] = coorObjects[0][1];
        massive(coorObjects);
        CoorObjects(coorObjects);
        this.coorObjects = coorObjects;
        return coorObjects;
    }
    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public int[][] getCoorObjects(){
        return this.coorObjects;
    }
    public void setCoorObjects(int index, int y, int x){
        this.coorObjects[index][0] = y;
        this.coorObjects[index][1] = x;
    }
    //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     public void CoorObjects(int[][]coorObjects){

         int plcorX = coorObjects[0][0];
         int plcorY = coorObjects[0][1];

         int BL1corX = coorObjects[2][0];
         int BL1corY = coorObjects[2][1];

         int BL2corX = coorObjects[3][0];
         int BL2corY = coorObjects[3][1];

         int BL3corX = coorObjects[4][0];
         int BL3corY = coorObjects[4][1];

         int MNcorX = coorObjects[5][0];
         int MNcorY = coorObjects[5][1];

         /*    System.out.println("Player Start coordinates: x("+(plcorX + 1) +") Y("+(plcorY + 1)+")");
             System.out.println("Block1 Start coordinates: x("+(BL1corX + 1) +") Y("+(BL1corY + 1)+")");
             System.out.println("Block2 Start coordinates: x("+(BL2corX + 1) +") Y("+(BL2corY + 1)+")");
             System.out.println("block3 Start coordinates: x("+(BL3corX + 1) +") Y("+(BL3corY + 1)+")");
             System.out.println("Money Start coordinates: x("+(MNcorX + 1) +") Y("+(MNcorY + 1)+")");
*/

     }
    public String[][] massive(int[][]coorObjects){
        int plcorX = coorObjects[0][0];
       int plcorY = coorObjects[0][1];

       int BL1corX = coorObjects[2][0];
       int BL1corY = coorObjects[2][1];

        int BL2corX = coorObjects[3][0];
        int BL2corY = coorObjects[3][1];

        int BL3corX = coorObjects[4][0];
        int BL3corY = coorObjects[4][1];

        int MNcorX = coorObjects[5][0];
        int MNcorY = coorObjects[5][1];


        String[][] coordintes = new String[10][10];
        for (int i = 0; i < coordintes.length; i++) {
            for (int j = 0; j < coordintes.length; j++) {
               coordintes[i][j] = ("     ");
                coordintes[MNcorX][MNcorY] = ("  ●  ");
                coordintes[BL1corX][BL1corY] = ("██1██");
                coordintes[BL2corX][BL2corY] = ("██2██");
                coordintes[BL3corX][BL3corY] = ("██3██");
                coordintes[plcorX][plcorY] = (" ☺ᅠ");
               // coordintes[i][j] = String.valueOf(i+1)+String.valueOf(j+1);//☺ ██  ᅠ ₽✖
            }
        }
        return coordintes;
    }
    }




