import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {
    public static final String RESET = "\033[0m";
    public static final String WHITE = "\033[0;37m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static final String CYAN_UNDERLINED = "\033[4;36m";
    public static final String WHITE_BRIGHT = "\033[0;97m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED

        public static void main(String[] args) throws InterruptedException {
            boolean gotNumber = false;
            int car_speed = 0;
            double way = 0.1; // way
            Random speed = new Random();
            boolean finished = false;
            int min;
            int max;

            System.out.println(WHITE_BRIGHT+"Please, Enter"+BLUE_BOLD_BRIGHT+" MIN"+BLUE_BOLD+"imal"+WHITE_BRIGHT+" speed of your car");
            Scanner in = new Scanner(System.in);

            while(!gotNumber){
            if (in.hasNextInt()) {break;}
            else {System.out.println(YELLOW_UNDERLINED+"Sorry, but this is an incorrect value, try again!");}
                System.out.println(WHITE_BRIGHT+"Please, Enter"+BLUE_BOLD_BRIGHT+" MIN"+BLUE_BOLD+"imal"+WHITE_BRIGHT+" speed of your car");
            in = new Scanner(System.in);}
            min = Math.abs(in.nextInt());

            System.out.println(WHITE_BRIGHT+"Please, Enter"+RED_BOLD_BRIGHT+" MAX"+RED_BOLD+"imal"+WHITE_BRIGHT+" speed of your car ");
            in = new Scanner(System.in);

            while(!gotNumber){
            if (in.hasNextInt()) {break;}
            else {System.out.println(YELLOW_UNDERLINED+"Sorry, but this is an incorrect value, try again!");}
            System.out.println(WHITE_BRIGHT+"Please, Enter"+RED_BOLD_BRIGHT+" MAX"+RED_BOLD+"imal"+WHITE_BRIGHT+" speed of your car ");
            in = new Scanner(System.in);}
            max = Math.abs(in.nextInt());

            int raznica = min - max;
        if (max==min){max++;}
            do{
            if (max<min){
                System.out.printf("WTF Bro? your "+RED_BOLD_BRIGHT+"MAX"+WHITE_BRIGHT+" speed is %d, but it is less than the "+BLUE_BOLD_BRIGHT+"MIN"+WHITE_BRIGHT+" speed by %d !?",max,raznica);
                System.out.println();
                System.out.println(WHITE_BRIGHT+"Please, Enter"+RED_BOLD_BRIGHT+" MAX"+RED_BOLD+"imal"+WHITE_BRIGHT+" speed of your car ");
                in = new Scanner(System.in);
                max = in.nextInt();;
                raznica = min - max;
                if (max==min){max++;}
            }}while(max<min);


            CarSpeed thread1 = new CarSpeed(min,max);
            Thread thread1_1 = new Thread(thread1);

            thread1_1.start();
            thread1_1.join();
            System.out.println(PURPLE_BOLD_BRIGHT+"=============================================================================="+WHITE_BRIGHT);
            while (!finished){
                car_speed = thread1.getRandom();
                System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
                if((way/car_speed*60)<=0){
                    finished = true;
                }
                else{
                    System.out.print("NOW CAR SPEED: " +CYAN_UNDERLINED+(car_speed)+WHITE+" Km/h,       "+WHITE_BRIGHT);
                    System.out.print(String.format("TIME LEFT: "+CYAN_UNDERLINED+"%.2f",(way/car_speed*3600))+WHITE+" Sec       "+WHITE_BRIGHT);
                    System.out.print(String.format("DISTANCE LEFT: "+CYAN_UNDERLINED+"%.2f"+WHITE+ " M",(way)*1000)+WHITE_BRIGHT);
                    way = (way - (car_speed*600/3600.00/1000) );
                }
                Thread.sleep(600);
            }


            System.out.print("NOW CAR SPEED: " +CYAN_UNDERLINED+"0"+WHITE+" Km/h,          "+WHITE_BRIGHT);
            System.out.print("TIME LEFT: "+CYAN_UNDERLINED+"0"+WHITE+" Sec            "+WHITE_BRIGHT);
            System.out.println("DISTANCE LEFT: "+CYAN_UNDERLINED+"0"+WHITE+ " M"+WHITE_BRIGHT);
            System.out.println("");


            System.out.println(RESET+"             "+RED_BACKGROUND_BRIGHT+"     "+RESET);
            System.out.println(RESET+"            "+RED_BACKGROUND_BRIGHT+" "+RESET+"     "+RED_BACKGROUND_BRIGHT+" "+RESET);
            System.out.println(RESET+"            "+RED_BACKGROUND_BRIGHT+" "+RESET+"     "+RED_BACKGROUND_BRIGHT+" "+RESET);
            System.out.println(RESET+"           "+RED_BACKGROUND_BRIGHT+" "+RESET+"      "+RED_BACKGROUND_BRIGHT+" "+RESET);
            System.out.println(RESET+"          "+RED_BACKGROUND_BRIGHT+" "+RESET+"       "+RED_BACKGROUND_BRIGHT+" "+RESET);
            System.out.println(RED_BACKGROUND_BRIGHT+"           "+RESET+"       "+RED_BACKGROUND_BRIGHT+"             "+RESET);
            System.out.println(RESET+"       "+RED_BACKGROUND_BRIGHT+" "+RESET+"                       "+RED_BACKGROUND_BRIGHT+" "+RESET);
            System.out.println(RESET+"       "+RED_BACKGROUND_BRIGHT+" "+RESET+"                        "+RED_BACKGROUND_BRIGHT+" "+RESET);
            System.out.println(RESET+"       "+RED_BACKGROUND_BRIGHT+" "+RESET+RED_BOLD_BRIGHT+"         FINISH         "+RED_BACKGROUND_BRIGHT+" "+RESET);
            System.out.println(RESET+"       "+RED_BACKGROUND_BRIGHT+" "+RESET+"                      "+RED_BACKGROUND_BRIGHT+"  "+RESET);
            System.out.println(RESET+"       "+RED_BACKGROUND_BRIGHT+" "+RESET+"                     "+RED_BACKGROUND_BRIGHT+" "+RESET);
            System.out.println(RESET+"       "+RED_BACKGROUND_BRIGHT+"   "+RESET+"                  "+RED_BACKGROUND_BRIGHT+" "+RESET);
            System.out.println(RED_BACKGROUND_BRIGHT+"        "+RESET+"  "+RED_BACKGROUND_BRIGHT+"                  "+RESET);


        }

    }



