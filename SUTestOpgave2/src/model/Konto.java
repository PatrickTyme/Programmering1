package model;

import java.util.ArrayList;

public class Konto {
    private int nr;
    // Link --> 1 kontotype
    private Kontotype kontotype;
    // Link --> 0..* transaktioner
    private static final ArrayList<Transaktion> transaktioner = new ArrayList<>();

    public int getNr() {
        return nr;
    }

    public Konto(int nr, Kontotype kontotype) {
        this.nr = nr;
        this.kontotype = kontotype;
    }
    public static ArrayList<Transaktion> getTransaktioner() {
        return transaktioner;
    }

    public double beregnSaldo() {
        double saldo = 0;
        for (Transaktion t : transaktioner) {
                saldo += t.getBeløb();
        }
        return saldo;
    }
    @Override
    public String toString() {
        return "Konto(" +
                nr +
                ", " + kontotype.getName() +
                ", " + transaktioner +
                ')';
    }
}
