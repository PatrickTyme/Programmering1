package model;

import java.util.ArrayList;

public class Spiller {
    private String navn;
    private String uddannelse;

    // Forbindelse -> 0..* Booking
    private final ArrayList<Booking> bookinger = new ArrayList<>();

    public Spiller(String navn, String uddannelse) {
        this.navn = navn;
        this.uddannelse = uddannelse;
    }

    public String getNavn() {
        return navn;
    }

    public String getUddannelse() {
        return uddannelse;
    }

    public ArrayList<Booking> getBookinger() {
        return bookinger;
    }

    public void addBooking(Booking booking) {
        if (!bookinger.contains(booking)) {
            bookinger.add(booking);
        }
    }

    // Opgave S3
    public int samletPris(Kategori kategori) {
        int pris = 0;
        for (Booking booking : bookinger) {
            if (booking.isSingle() == true) {
                pris += kategori.getPrisKrSingle();
            } else {
                pris += kategori.getPrisKrDouble();
            }
        }
        return pris;
    }
    @Override
    public String toString() {
        return navn + " (" + uddannelse + ")";
    }
}
