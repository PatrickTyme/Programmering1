package gui;

import controller.Controller;
import javafx.application.Application;
import model.Bane;
import model.Booking;
import model.Kategori;
import model.Spiller;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        initStorage();
        Application.launch(Gui.class);
    }

    public static void initStorage() {
        Kategori Luksus = Controller.createKategori("Luksus", 100, 200);
        Kategori Mellem = Controller.createKategori("Mellem", 50, 100);
        Kategori Begynder = Controller.createKategori("Begynder", 25, 50);

        Bane b1 = Controller.createBane(1, true, LocalTime.parse("09:00"), LocalTime.parse("17:00"), Luksus);
        Bane b2 = Controller.createBane(2, true, LocalTime.parse("09:00"), LocalTime.parse("17:00"), Luksus);
        Bane b3 = Controller.createBane(3, true, LocalTime.parse("09:00"), LocalTime.parse("17:00"), Mellem);
        Bane b4 = Controller.createBane(4, false, LocalTime.parse("09:00"), LocalTime.parse("17:00"), Mellem);
        Bane b5 = Controller.createBane(5, false, LocalTime.parse("09:00"), LocalTime.parse("17:00"), Begynder);
        Bane b6 = Controller.createBane(6, false, LocalTime.parse("09:00"), LocalTime.parse("17:00"), Begynder);

        Spiller Andreas = Controller.createSpiller("Andreas", "DMU");
        Spiller Petra = Controller.createSpiller("Petra", "DMU");
        Spiller Henrik = Controller.createSpiller("Henrik", "ITA");
        Spiller Ulla = Controller.createSpiller("Ulla", "ITA");

        //Andreas booking - 2 bookings
        Booking book1 = Controller.createBooking(LocalDate.parse("2023-06-20"), LocalTime.parse("10:00"), true, b3, Andreas);
        Booking book2 = Controller.createBooking(LocalDate.parse("2023-06-22"), LocalTime.parse("10:00"), false, b2, Andreas);

        //Henrik booking - 1 booking
        Booking book3 = Controller.createBooking(LocalDate.parse("2023-06-20"), LocalTime.parse("11:00"), false, b3, Henrik);

        //Ulla booking - 2 bookings
        Booking book4 = Controller.createBooking(LocalDate.parse("2023-06-20"), LocalTime.parse("16:00"), false, b3, Ulla);
        Booking book5 = Controller.createBooking(LocalDate.parse("2023-06-23"), LocalTime.parse("17:00"), true, b5, Ulla);

        Controller.writeBookings(b3, "PRO1 Eksamen 2023/src/Bookingfil.txt");
    }
}
