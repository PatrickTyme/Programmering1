package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Bane {
    private int nummer;
    private boolean inde;
    private LocalTime førsteTid;
    private LocalTime sidsteTid;

    // Forbindelse -> 1 Kategori
    private Kategori kategori;

    // Forbindelse -> 0..* Booking
    private final ArrayList<Booking> bookinger = new ArrayList<>();

    public Bane(int nummer, boolean inde, LocalTime førsteTid, LocalTime sidsteTid, Kategori kategori) {
        this.nummer = nummer;
        this.inde = inde;
        this.førsteTid = førsteTid;
        this.sidsteTid = sidsteTid;
        this.kategori = kategori;
    }

    public int getNummer() {
        return nummer;
    }

    public boolean isInde() {
        return inde;
    }

    public LocalTime getFørsteTid() {
        return førsteTid;
    }

    public LocalTime getSidsteTid() {
        return sidsteTid;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public ArrayList<Booking> getBookinger() {
        return new ArrayList<>(bookinger);
    }
    public void addBooking(Booking booking) {
        if (!bookinger.contains(booking)) {
            bookinger.add(booking);
        }
    }
    // Opgave S2
    public int bookedeTimerPåDato(LocalDate dato) {
        long antalTimer = førsteTid.until(sidsteTid, ChronoUnit.HOURS);
        return (int) antalTimer;
    }

    // Opgave S4
    public Booking[] antalBookningerPrTime() {
        ArrayList<Booking> list = new ArrayList<>();

        for (Booking booking : bookinger) {
            if (booking.getTid().isAfter(førsteTid) && booking.getTid().isBefore(sidsteTid)) {
                list.add(booking);
            }
        }
        Booking[] bookings = new Booking[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bookings[i] = list.get(i);
        }
        return bookings;
    }
    // Opgave S8
    public boolean tidLedig(LocalDate dato, LocalTime tid) {
        boolean ledig = true;
        int i = 0;
        ArrayList<Booking> bookings = getBookinger();
        while (!ledig && i < bookings.size()) {
            Booking j = bookings.get(i);
            if (j.getTid() == tid) ledig = true;
            else i++;
        }
        return ledig;
    }

    @Override
    public String toString() {
        return "Nr." + nummer + " " + inde + " (" + førsteTid + " -> " + sidsteTid + "), " + kategori;
    }
}
