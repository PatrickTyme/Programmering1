package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fag {
    private String navn;
    private String klasse;

    // Forbindelse 0..* Lektion
    private final ArrayList<Lektion> lektioner = new ArrayList<>();

    public Fag(String navn, String klasse) {
        this.navn = navn;
        this.klasse = klasse;
    }

    public ArrayList<Lektion> getLektioner() {
        return new ArrayList<>(lektioner);
    }
    public void addLektion(Lektion lektion) {
        lektioner.add(lektion);
    }
    public void removeLektion(Lektion lektion) {
        lektioner.remove(lektion);
    }
    public ArrayList<Studerende> sygdomPåDato(LocalDate dato) {
        ArrayList<Studerende> sygeStuderende = new ArrayList<>();
        for (Lektion lektion : lektioner) {
            if (lektion.getDato().equals(dato)) {
                for (Deltagelse deltagelse : lektion.getDeltagelser()) {
                    if (!sygeStuderende.contains(deltagelse.getStuderende()) && deltagelse.erRegistreretFraværende()) {
                        sygeStuderende.add(deltagelse.getStuderende());
                    }
                }
            }
        }
        return sygeStuderende;
    }
}
