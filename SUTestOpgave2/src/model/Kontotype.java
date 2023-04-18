package model;

public class Kontotype {
    private String name;
    private String beskrivelse;

    public Kontotype(String name, String beskrivelse) {
        this.name = name;
        this.beskrivelse = beskrivelse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    @Override
    public String toString() {
        return "Kontotype(" +
                "'" + name + '\'' +
                ", " + beskrivelse +
                ')';
    }
}
