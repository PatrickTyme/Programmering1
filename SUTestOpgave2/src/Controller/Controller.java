package Controller;

import Storage.Storage;
import model.Konto;
import model.Kontotype;
import model.Transaktion;

import java.util.ArrayList;

public abstract class Controller {

    public static Konto createKonto(int nr, Kontotype kontotype) {
        Konto konto = new Konto(nr, kontotype);
        Storage.storeKonto(konto);
        return konto;

    }
    public void createTransaktion(ArrayList<Transaktion> transaktioner) {
        this.transaktioner = transaktioner;
    }
}
