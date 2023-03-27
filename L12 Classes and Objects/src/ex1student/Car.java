package ex1student;

public class Car {
    String brand;
    String color;
    String regNo; // registration number
    int km;

    public Car(String brand, String color, String regNo, int km) {
        this.brand = brand;
        this.color = color;
        this.regNo = regNo;
        this.km = km;
    }

    public void printCar() {
        System.out.println("*******************");
        System.out.println("* " + this.brand);
        System.out.println("* " + this.regNo);
        System.out.println("* " + this.km +  " km");
        System.out.println("*******************");
    }

    @Override
    public String toString() {
        return String.format("Car(%s, %s, %s, %d km)", brand, color, regNo, km);
    }
}
