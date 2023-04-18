package Controller;

import Storage.Storage;
import model.Konto;
import model.Kontotype;
import model.Transaktion;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Controller {

    public static Konto createKonto(int nr, Kontotype kontotype) {
        Konto konto = new Konto(nr, kontotype);
        Storage.storeKonto(konto);
        return konto;

    }

    public static Transaktion createTransaktion(int beløb, Konto konto) {
        Transaktion transaktion = new Transaktion(beløb, konto);
        transaktion.setBeløb(beløb);
        return transaktion;

    }

    public static Kontotype createKontotype(String name, String beskrivelse) {
        Kontotype kontotype = new Kontotype(name, beskrivelse);
        kontotype.setName(name);
        kontotype.setBeskrivelse(beskrivelse);
        Storage.storeKontotype(kontotype);
        return kontotype;
    }
}
