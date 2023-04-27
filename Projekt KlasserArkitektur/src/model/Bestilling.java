package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private LocalDate dato;
    private final ArrayList<Plads> pladser = new ArrayList<>();
    private Kunde kunde;
    private final Forestilling forestilling;

    public Bestilling(LocalDate dato, Kunde kunde, Forestilling forestilling) {
        this.dato = dato;
        this.kunde = kunde;
        this.forestilling = forestilling;
        kunde.addBestilling(this);
        forestilling.addBestilling(this);
    }

    public LocalDate getDato() {
        return dato;
    }

    public ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public void addPladser(ArrayList<Plads> pladser) {
        for (Plads plads : pladser) {
            this.pladser.add(plads);
        }

    }
    public int samletPris() {
        int sum = 0;
        for (Plads p : pladser) {
            sum += p.getPris();
        }
        return sum;
    }

}
