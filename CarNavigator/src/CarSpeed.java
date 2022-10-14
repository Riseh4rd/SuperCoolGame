import java.util.Random;
import java.util.Scanner;
public class CarSpeed implements Runnable {
    private Random RND = new Random();
    private int min;
    private int max;
    private int temp;
    public CarSpeed(int min, int max) {

        this.min =min;
        this.max =max;

    }
    @Override
    public void run() {
        this.temp = 50;
    }
    public int getRandom() {
        this.temp = RND.nextInt(max-min)+min;
        return temp;
    }
}
