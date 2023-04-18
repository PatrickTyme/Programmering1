package model;

import java.time.LocalDate;

public class Transaktion {
    private int beløb;
    private LocalDate dato;

    public Transaktion(int beløb) {
        this.beløb = beløb;
    }

    public int getBeløb() {
        return beløb;
    }

    public void setBeløb(int beløb) {
        this.beløb = beløb;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }
    public void setTransaktion(int beløb) {
        this.beløb = beløb;
    }

}
