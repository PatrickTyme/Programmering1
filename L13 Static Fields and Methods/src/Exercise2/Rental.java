package Exercise2;

import java.time.LocalDate;
import java.time.Period;

public class Rental {
   private int number; // number of rented units
    private Period days; // number of rental days
    private double price; // price for one day of rental
    private LocalDate startdate; // startdate for rental

    public void Rental(int number, Period days, double price, LocalDate startDate) {
        Period period1 = Period.of(0, 5, 0);
        LocalDate date1 = LocalDate.of(2023, 3, 12);
        number = 1;
    days = period1;
    price = 500;
    startdate = date1;
    }
    public double getPricePerDay() {
        return price;
    }

    public void setDays(Period days) {
        this.days = days;
    }
    public Period getDays() {
        return days;
    }
    public void setStartDate(LocalDate startdate) {
        this.startdate = startdate;
    }
    public LocalDate getStartdate() {
        return startdate;
    }

}
