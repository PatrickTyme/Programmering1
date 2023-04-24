package storage;

import model.Forestilling;
import model.Kunde;
import model.Plads;

import java.util.ArrayList;

public abstract class Storage {
    private static final ArrayList<Forestilling> forestillinger = new ArrayList<>();
    private static final ArrayList<Kunde> kunder = new ArrayList<>();
    private static final ArrayList<Plads> pladser = new ArrayList<>();

    public  static ArrayList<Forestilling> getForestillinger() {
        return new ArrayList<>(forestillinger);
    }

    public  static ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public static ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public static void storeForestilling(Forestilling forestilling) {
        forestillinger.add(forestilling);
    }

    public static void removeForestilling(Forestilling forestilling) {
        forestillinger.remove(forestilling);
    }
    public static void storeKunde(Kunde kunde) {
        kunder.add(kunde);
    }
    public static void removeKunde(Kunde kunde) {
        kunder.remove(kunde);
    }
    public static void storePlads(Plads plads) {
        pladser.add(plads);
    }
    public static void removePlads(Plads plads) {
        pladser.remove(plads);
    }
}