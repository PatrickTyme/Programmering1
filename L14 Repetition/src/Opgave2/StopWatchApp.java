package Opgave2;

import java.util.Scanner;

public class StopWatchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch s1 = new StopWatch();
        System.out.println("Press enter to start the stopwatch:");
        scanner.nextLine();
        s1.start();
        System.out.println("The stopwatch is running, press enter to stop");
        scanner.nextLine();
        s1.stop();
        System.out.println("Elapsed time is: " + s1.elapsedTime() + " seconds");
    }
}
