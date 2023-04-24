package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private static LocalDate dato;
    private static ArrayList<Plads> pladser = new ArrayList<>();
    private static Kunde kunde;
    private static Forestilling forestilling;

    public Bestilling(LocalDate dato, Kunde kunde, Forestilling forestilling) {
        this.dato = dato;
        this.kunde = kunde;
        this.forestilling = forestilling;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public void setPladser(ArrayList<Plads> pladser) {
        this.pladser = pladser;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public void setForestilling(Forestilling forestilling) {
        this.forestilling = forestilling;
    }
}
