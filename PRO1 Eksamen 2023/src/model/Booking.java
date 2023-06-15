package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private LocalDate dato;
    private LocalTime tid;
    private boolean single;

    // Forbindelse -> 1 Bane
    private Bane bane;

    // Forbindelse komposition -> 1 Spiller
    private final Spiller spiller;

    public Booking(LocalDate dato, LocalTime tid, boolean single, Bane bane, Spiller spiller) {
        this.dato = dato;
        this.tid = tid;
        this.single = single;
        this.bane = bane;
        this.spiller = spiller;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getTid() {
        return tid;
    }

    public boolean isSingle() {
        return single;
    }

    public Bane getBane() {
        return bane;
    }

    public Spiller getSpiller() {
        return spiller;
    }

    public void setBane(Bane bane) {
        this.bane = bane;
    }

    @Override
    public String toString() {
        return "Bane nr: " + bane + ", " + "dag: " + dato + " kl. " + tid + ", " + "spil: " + single + ", " + "spiller: " + spiller;
    }
}
