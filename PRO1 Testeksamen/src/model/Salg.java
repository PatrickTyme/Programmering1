package model;

import java.util.ArrayList;

public class Salg {
    private String købersNavn;
    private int aftaltSamletPris;
    private static ArrayList<Vare> varer = new ArrayList<>();

    public Salg(String købersNavn, int aftaltSamletPris, ArrayList<Vare> varer) {
        this.købersNavn = købersNavn;
        this.aftaltSamletPris = aftaltSamletPris;
        this.varer = varer;
    }

    public String getKøbersNavn() {
        return købersNavn;
    }

    public void setKøbersNavn(String købersNavn) {
        this.købersNavn = købersNavn;
    }

    public int getAftaltSamletPris() {
        return aftaltSamletPris;
    }

    public void setAftaltSamletPris(int aftaltSamletPris) {
        this.aftaltSamletPris = aftaltSamletPris;
    }

    public static ArrayList<Vare> getVarer() {
        return varer;
    }

    public static void setVarer(ArrayList<Vare> varer) {
        Salg.varer = varer;
    }

}
