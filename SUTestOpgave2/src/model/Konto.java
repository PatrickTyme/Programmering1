package model;

import java.util.ArrayList;

public class Konto {
    private int nr;
    private Kontotype kontotype;
    private ArrayList<Transaktion> transaktioner = new ArrayList<>();

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public Kontotype getKontotype() {
        return kontotype;
    }

    public void setKontotype(Kontotype kontotype) {
        this.kontotype = kontotype;
    }

    public ArrayList<Transaktion> getTransaktioner() {
        return transaktioner;
    }


    public Konto(int nr, Kontotype kontotype) {
        this.nr = nr;
        this.kontotype = kontotype;

    }

}
