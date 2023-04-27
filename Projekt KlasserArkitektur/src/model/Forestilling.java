package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

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
                Plads pladsGet = bestillinger.get(i).getPladser().get(j);
                if (pladsGet.getRække() == række &&
                        pladsGet.getNr() == nr &&
                        bestillinger.get(i).getDato().equals(dato))
                    seatTaken = false;
            }
        }
        return seatTaken;
    }

    public int antalBestiltePladserPåDag(LocalDate dato) {
        int antal = 0;
        for (Bestilling b : bestillinger) {
            if (b.getDato().equals(dato)) {
                antal += b.getPladser().size();
            }
        }
        return antal;
    }

    public LocalDate succesDato() {
        LocalDate bedsteDato = null;
        int maxAntal = 0;
        Period days = Period.between(startDato, slutDato);
        for (int i = 0; i < days.getDays(); i++) {
            LocalDate dato = startDato.plusDays(i);
            int antal = antalBestiltePladserPåDag(dato);
            if (antal > maxAntal) {
                bedsteDato = dato;
                maxAntal = antal;
            }
        }
        return bedsteDato;
    }


    @Override
    public String toString() {
        return navn + " (fra " + startDato + " til " + slutDato + ")";
    }
}
