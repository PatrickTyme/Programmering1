package controller;

import model.Bane;
import model.Booking;
import model.Kategori;
import model.Spiller;
import storage.Storage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Controller {




    public static Kategori createKategori(String navn, int prisKrSingle, int prisKrDouble) {
        Kategori kategori = new Kategori(navn, prisKrSingle, prisKrDouble);
        Storage.addKategori(kategori);
        return kategori;
    }

    public static Bane createBane(int nummer, boolean inde, LocalTime førsteTid, LocalTime sidsteTid, Kategori kategori) {
        Bane bane = new Bane(nummer, inde, førsteTid, sidsteTid, kategori);
        Storage.addBane(bane);
        return bane;
    }

    public static Spiller createSpiller(String navn, String uddannelse) {
        Spiller spiller = new Spiller(navn, uddannelse);
        Storage.addSpiller(spiller);
        return spiller;
    }

    public static Booking createBooking(LocalDate dato, LocalTime tid, boolean single, Bane bane, Spiller spiller) {
        Booking booking = new Booking(dato, tid, single, bane, spiller);
        return booking;
    }

    //Opgave S7
    // TODO
     public int samletBooketDoubleTid(String uddannelse, Kategori kategori) {
        int samletTid = 0;

            return 0;
    }


    //Opgave S9
    public static Booking findLedigBane(LocalDate dato, LocalTime tid, Kategori kategori, Bane bane) {
        Booking ledigBane = null;
        int i = 0;

        ArrayList<Booking> bookinger = bane.getBookinger();

        while (ledigBane == null && i < bookinger.size()) {
            Booking k = bookinger.get(i);
            if (k.getBane() == null) ledigBane = k;
            else i++;
        }
        if (ledigBane != null) {

        }
        return ledigBane;
    }
    //Opgave S10 - Der er taget højde for fejlen i linje to med bane nummer.
    public static void writeBookings(Bane bane, String filnavn) {
        try (PrintWriter out = new PrintWriter(filnavn)) {
            ArrayList<Booking> booket = bane.getBookinger();
            for (Booking booking : booket) {
                System.out.println(booking);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static ArrayList<Bane> getBaner() {
        return Storage.getBaner();
    }
    public static ArrayList<Spiller> getSpillere() {
        return Storage.getSpillere();
    }
}