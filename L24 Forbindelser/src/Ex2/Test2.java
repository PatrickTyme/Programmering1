package Ex2;

public class Test2 {
    public static void main(String[] args) {
        Car c1 = new Car("1", "1985");
        Car c2 = new Car("2", "2005");
        c1.setPricePerDay(500);
        c2.setPricePerDay(200);
        Rental r1 = new Rental(1, "2nov", 7);
        Rental r2 = new Rental(2, "15dec", 4);
        Rental r3 = new Rental(3, "12jan", 15);
        r1.addCar(c1);
        r2.addCar(c1);
        r3.addCar(c1);
        System.out.println(r1.getPrice());

        System.out.println(c1.highestNumberOfRentalDays());

    }
}
