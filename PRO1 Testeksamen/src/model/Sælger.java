package model;

import java.util.ArrayList;
import java.util.zip.Deflater;

public class Sælger {
    private String navn;
    private int studiekortNummer;
    private String mobil;

    private final ArrayList<Salgsannonce> salgsannoncer = new ArrayList<>();

    public Sælger(String navn, int studiekortNummer, String mobil) {
        this.navn = navn;
        this.studiekortNummer = studiekortNummer;
        this.mobil = mobil;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getStudiekortNummer() {
        return studiekortNummer;
    }

    public void setStudiekortNummer(int studiekortNummer) {
        this.studiekortNummer = studiekortNummer;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public Salgsannonce createSalgsAnnounce() {
        Salgsannonce salgsannonce = new Salgsannonce(this);
        salgsannoncer.add(salgsannonce);
        return salgsannonce;
    }

    // TODO Tilføj til klassen Sælger metoden alleIkkesolgteVarerIKategori(Varekategori
    //kategori): ArrayList<Vare>, der returnerer en liste med alle de ikke solgte varer
    //sælgeren har til salg i den angivne kategori. Dvs. kun ikke solgte varer, hørende til aktive
    //salgsannoncer skal med i listen
    public ArrayList<Vare> alleIkkeSolgteVarerIKategori(Varekategori kategori) {
        ArrayList<Vare> ikkeSolgteVarer = new ArrayList<>();

        return null;
    }

}
