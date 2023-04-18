package Storage;

import model.Konto;
import model.Kontotype;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Konto> kontos = new ArrayList<>();
    private static final ArrayList<Kontotype> kontotyper = new ArrayList<>();


    public static ArrayList<Konto> getKontos() {
        return kontos;
    }

    public static void storeKonto(Konto konto) {
        kontos.add(konto);
    }

    public static ArrayList<Kontotype> getKontotyper() {
        return kontotyper;
    }

    public static void storeKontotype(Kontotype kontotype) {
        kontotyper.add(kontotype);
    }
}
