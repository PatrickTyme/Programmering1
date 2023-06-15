package storage;

import model.Bane;
import model.Kategori;
import model.Spiller;

import java.util.ArrayList;

public abstract class Storage {

    private static ArrayList<Bane> baner = new ArrayList<>();
    private static ArrayList<Kategori> kategorier = new ArrayList<>();
    private static ArrayList<Spiller> spillere = new ArrayList<>();

    public static void addBane(Bane bane) {
        baner.add(bane);
    }
    public static void addKategori(Kategori kategori) {
        kategorier.add(kategori);
    }
    public static void addSpiller(Spiller spiller) {
        spillere.add(spiller);
    }
    public static ArrayList<Bane> getBaner() {
        return new ArrayList<>(baner);
    }
    public static ArrayList<Kategori> getKategorier() {
        return new ArrayList<>(kategorier);
    }
    public static ArrayList<Spiller> getSpillere() {
        return new ArrayList<>(spillere);
    }
}
