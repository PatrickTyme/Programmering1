package storage;

import model.Salg;
import model.Salgsannonce;
import model.Sælger;
import model.Vare;

import java.util.ArrayList;

public abstract class Storage {
    private static ArrayList<Sælger> sælgere = new ArrayList<>();
    private static ArrayList<Vare> varer = new ArrayList<>();
    private static ArrayList<Salg> salgs = new ArrayList<>();
    private static ArrayList<Salgsannonce> salgsannoncer = new ArrayList<>();

    public static void addSælger(Sælger sælger) {
        if (!sælgere.contains(sælger)) {
            sælgere.add(sælger);
        }
    }
    public static void addVare(Vare vare) {
        if (!varer.contains(vare)) {
            varer.add(vare);
        }
    }
    public static void addSalg(Salg salg) {
        if (!salgs.contains(salg)) {
            salgs.add(salg);
        }
    }
    public static ArrayList<Sælger> getSælgere(){
        return new ArrayList<Sælger>(sælgere);
    }
    public static ArrayList<Vare> getVarer() {
        return new ArrayList<Vare>(varer);
    }
    public static ArrayList<Salg> getSalg(){
        return new ArrayList<Salg>(salgs);
    }

    public static ArrayList<Salgsannonce> getSalgsannoncer() {
        return salgsannoncer;
    }
}
