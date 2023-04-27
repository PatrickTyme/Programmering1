package model;

import java.sql.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;

public class Forestilling {
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;
    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public void setStartDato(LocalDate startDato) {
        this.startDato = startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public void setSlutDato(LocalDate slutDato) {
        this.slutDato = slutDato;
    }

    public void addBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
    }

    public boolean erPladsLedig(int række, int nr, LocalDate dato) {
        boolean seatTaken = true;
        for (int i = 0; !seatTaken && i < bestillinger.size(); i++) {
            for (int j = 0; !seatTaken && j < bestillinger.get(i).getPladser().size(); j++) {
                if (bestillinger.get(i).getPladser().get(j).getRække() == række &&
                        bestillinger.get(i).getPladser().get(j).getNr() == nr &&
                        bestillinger.get(i).getDato().equals(dato))
                    seatTaken = false;
            }
        }
        return seatTaken;
    }

    public int antalBestemtePladserPåDag(LocalDate dato) {
        int antal = 0;
        for (Bestilling b : bestillinger) {
            if (b.getDato().equals(dato)) {
                antal += b.getPladser().size();
            }
        }
        return antal;
    }

    public LocalDate succesDato() {
        Period days = Period.between(startDato, slutDato);
        ArrayList<Integer> flestPladser = new ArrayList<>();
        for (int i = 0; i < days.getDays(); i++) {
            flestPladser.add(antalBestemtePladserPåDag(startDato.plusDays(i)));
        }
        return startDato.plusDays(Collections.max(flestPladser));
    }

    @Override
    public String toString() {
        return navn + " (fra " + startDato + " til " + slutDato + ")";
    }
}
