package controller;

import model.Forestilling;
import model.Kunde;
import model.Plads;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Controller {


    public static Forestilling createForestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        Forestilling forestilling = new Forestilling(navn, startDato, slutDato);
        Storage.storeForestilling(forestilling);
        return forestilling;
    }

    public static void deleteForestilling(Forestilling forestilling) {
        Storage.removeForestilling(forestilling);
    }

    public static void updateForestilling(Forestilling forestilling, String navn, LocalDate startDato, LocalDate slutDato) {
        forestilling.setNavn(navn);
        forestilling.setStartDato(startDato);
        forestilling.setSlutDato(slutDato);
    }

    public static ArrayList<Forestilling> getForestillinger() {
        return new ArrayList<>(Storage.getForestillinger());
    }
    public static Kunde createKunde(String navn, String mobil) {
        Kunde kunde = new Kunde(navn, mobil);
        Storage.storeKunde(kunde);
        return kunde;
    }

    public static void deleteKunde(Kunde kunde) {
        Storage.removeKunde(kunde);
    }

    public static void updateKunde(Kunde kunde, String navn, String mobil) {
        kunde.setNavn(navn);
        kunde.setMobil(mobil);
    }

    public static ArrayList<Kunde> getKunder() {
        return new ArrayList<>(Storage.getKunder());
    }
    public static Plads createPlads(int række, int nr, int pris, Plads.PladsType pladsType) {
        Plads plads = new Plads(række, nr, pris, pladsType);
        Storage.storePlads(plads);
        System.out.println(plads);
        return plads;
    }
    public static void deletePlads(Plads plads) {
        Storage.removePlads(plads);
    }
    public static void updatePlads(Plads plads, int række, int nr, int pris, Plads.PladsType pladsType) {
        plads.setRække(række);
        plads.setNr(nr);
        plads.setPris(pris);
        plads.setPladsType(pladsType);
    }
    public static ArrayList<Plads> getPladser() {
        return Storage.getPladser();
    }
}