package controller;

import model.Bestilling;
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
        return Storage.getForestillinger();
    }

    public static Kunde createKunde(String navn, String mobil) {
        Kunde kunde = new Kunde(navn, mobil);
        Storage.storeKunde(kunde);
        return kunde;
    }

    public static void updateKunde(Kunde kunde, String navn, String mobil) {
        kunde.setNavn(navn);
        kunde.setMobil(mobil);
    }

    public static ArrayList<Kunde> getKunder() {
        return Storage.getKunder();
    }

    public static Plads createPlads(int række, int nr, int pris, Plads.PladsType pladsType) {
        Plads plads = new Plads(række, nr, pris, pladsType);
        Storage.storePlads(plads);
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

    public static Bestilling opretBestillingMedPladser(Forestilling forestilling, Kunde kunde, LocalDate dato, ArrayList<Plads> pladser) {
        Bestilling bestilling = null;
        boolean taken = false;
        boolean between = dato.compareTo(forestilling.getStartDato()) >= 0 && dato.compareTo(forestilling.getSlutDato()) <= 0;
        if (between) {
            for (Plads plads : pladser) {
                taken = forestilling.erPladsLedig(plads.getRække(), plads.getNr(), dato);
            }
            if (taken) {
                bestilling = new Bestilling(dato, kunde, forestilling);
                bestilling.addPladser(pladser);
            }
        }
        return bestilling;
    }
}