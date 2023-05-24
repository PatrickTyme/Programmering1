package model;

import java.util.ArrayList;

public class Studerende {
    private String navn;
    private String email;

    // Forbindelse 0..* Deltagelse
    private final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Studerende(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return new ArrayList<>(deltagelser);
    }
    public void addDeltagelse(Deltagelse deltagelse) {
        deltagelser.add(deltagelse);
    }
    public void removeDeltagelse(Deltagelse deltagelse) {
        deltagelser.remove(deltagelse);
    }
    // Opgave S3
    public int antalFraværsLektioner() {
        int antalFravær = 0;
        for (Deltagelse deltagelse : deltagelser) {
            if (deltagelse.erRegistreretFraværende()) {
                antalFravær++;
            }
        }
        return antalFravær;
    }
}
