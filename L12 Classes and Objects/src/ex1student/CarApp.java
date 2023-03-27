package ex1student;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("VW UP", "White", "AB 12.345", 50000);
        System.out.println("Test: " + myCar.toString());
        System.out.println();

        String brand = myCar.brand;
        System.out.println("Brand: " + brand);
        System.out.println("My car: " + myCar.brand + ", " + myCar.color);

        myCar.km = 65000;
        System.out.println("Km nu: " + myCar.km);
        System.out.println();

        Car momsCar = new Car("Bugatti", "Red", "BJ696969", 0);
        System.out.println("Moms car: " + momsCar.toString());
        System.out.println();

        String momsBrand = momsCar.brand;
        System.out.println("Brand: " + momsBrand);
        System.out.println("My car: " + momsCar.brand + ", " + momsCar.color);

        momsCar.km = 69000;
        System.out.println("Km nu: " + momsCar.km);

        myCar.printCar();
        System.out.println();
        momsCar.printCar();
    }
}
