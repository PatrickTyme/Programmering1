package Opgave9_8;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;


    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }


    @Override
    public String toString() {
        String speedStr = "SLOW";
        if (speed == SLOW) speedStr = "SLOW";
        else if (speed == MEDIUM) speedStr = "MEDIUM";
        else if (speed == FAST) speedStr = "FAST";
        if (on == true) {
            return String.format("(%s, %s, %.1f)", speedStr, color, radius);
        } else {
           return String.format("Fan is off (%s, %.1f)", color, radius);
        }
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
