package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Lektion {
    private LocalDate dato;
    private LocalTime startTid;
    private String lokale;

    // Forbindelse 0..* Deltagelse
    private final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Lektion(LocalDate dato, LocalTime startTid, String lokale) {
        this.dato = dato;
        this.startTid = startTid;
        this.lokale = lokale;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return new ArrayList<>(deltagelser);
    }
    public void addDeltagelse(Deltagelse deltagelse) {
        deltagelser.add(deltagelse);
    }
    public void removeDeltagelse(Deltagelse deltagelse) {
        deltagelser.remove(deltagelse);
    }

    public LocalDate getDato() {
        return dato;
    }
}
