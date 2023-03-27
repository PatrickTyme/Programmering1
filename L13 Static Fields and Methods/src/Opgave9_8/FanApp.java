package Opgave9_8;

public class FanApp {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        System.out.println("Test: " + f1);
        f1.setOn(true);
        f1.setSpeed(2);
        f1.setColor("yellow");
        f1.setRadius(10.0);
        System.out.println("Test 2: " + f1);
    }
}
