package model;

public class Deltagelse {
    private boolean registreret;
    private DeltagerStatus status;

    // Komposition --> 1 Lektion
    private final Lektion lektion;

    // Forbindelse --> 1 Studerende
    private Studerende studerende;

    public Deltagelse(Lektion lektion, Studerende studerende) {
        this.registreret = false;
        this.status = DeltagerStatus.TILSTEDE;
        this.lektion = lektion;
        this.studerende = studerende;
    }

    public Lektion getLektion() {
        return lektion;
    }

    public Studerende getStuderende() {
        return studerende;
    }

    public void setStuderende(Studerende studerende) {
        this.studerende = studerende;
    }
    public boolean erRegistreretFraværende() {
        return status != DeltagerStatus.TILSTEDE && registreret;
        }
    }

