package model;

public class Vare {
    private Varekategori kategori;
    private String navn;
    private int udbudspris;
    private boolean solgt;
    private Salgsannonce salgsannonce;

    public Vare(Varekategori kategori, String navn, int udbudspris) {
        this.kategori = kategori;
        this.navn = navn;
        this.udbudspris = udbudspris;
        this.solgt = solgt;
    }

    public Varekategori getKategori() {
        return kategori;
    }

    public void setKategori(Varekategori kategori) {
        this.kategori = kategori;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getUdbudspris() {
        return udbudspris;
    }

    public void setUdbudspris(int udbudspris) {
        this.udbudspris = udbudspris;
    }

    public boolean isSolgt() {
        return solgt;
    }

    public void setSolgt(boolean solgt) {
        this.solgt = solgt;
    }
    public void setSalgsannonce(Salgsannonce salgsannonce) {
            this.salgsannonce = salgsannonce;
            if (salgsannonce != null) {
                salgsannonce.addVare(this);
            }
        }

    public Salgsannonce getSalgsannonce() {
        return salgsannonce;
    }

    @Override
    public String toString() {
        return "Vare{" +
                ", navn='" + navn + '\'' +
                ", udbudspris=" + udbudspris +
                ", solgt=" + solgt;
    }
}
