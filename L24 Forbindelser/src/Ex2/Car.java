package Ex2;

import java.util.ArrayList;

public class Car {
    private String no;
    private String year;
    private int pricePerDay;
    private ArrayList<Rental> rentals = new ArrayList<Rental>();

    public Car(String no, String year) {
        this.no = no;
        this.year = year;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getNo() {
        return no;
    }

    public String getYear() {
        return year;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }
    public int highestNumberOfRentalDays() {
        int rentalDays = 0;
        for (Rental rental : rentals) {
            if (rentalDays < rental.getDays()) {
                rentalDays = rental.getDays();
            }
        }
        return rentalDays;
    }

}
