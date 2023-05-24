package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Salgsannonce {
    private static int antalAnnoncer = 0;
    private int annonceNummer;
    private boolean aktiv;
    private LocalDate udløbsdato;

    private final ArrayList<Vare> varer = new ArrayList<>();
    private Sælger sælger;


    public Salgsannonce(Sælger sælger) {
        antalAnnoncer++;
        this.annonceNummer = antalAnnoncer;
        this.aktiv = true;
        this.udløbsdato = LocalDate.now().plusMonths(1);

    }

    public int getAnnonceNummer() {
        return annonceNummer;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public LocalDate getUdløbsdato() {
        return udløbsdato;
    }

    public int samletAnnonceUdbud() {
        int samletBeløb = 0;
        for(Vare vare : varer) {
            samletBeløb += vare.getUdbudspris();
        }
        return samletBeløb;
    }
    public void addVare(Vare vare) {
        if (!varer.contains(vare)) {
            varer.add(vare);
            vare.setSalgsannonce(this);
        }
    }

    // TODO opgave s7
    public void annonceStatus() {
        if (udløbsdato.isAfter(getUdløbsdato())) {
            setAktiv(false);
        }
    }

}
