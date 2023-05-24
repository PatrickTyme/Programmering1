package controller;

import model.*;
import storage.Storage;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Controller {

    public static void initStorage() {
        salgTilFil("PRO1 Testeksamen/src/salgsFil.txt");
        //--------
        Sælger viktor = createSælger("Viktor", 23, "45344247");
        Sælger gustav = createSælger("Gustav", 35, "56124522");

        //--------

        Vare samsungMobil = createVare(Varekategori.MOBILTELEFON, "Samsung Mobil", 1200);
        Vare iPhone = createVare(Varekategori.MOBILTELEFON, "iPhone", 2000);
        Vare java = createVare(Varekategori.STUDIEBOG, "Java", 400);
        Vare android = createVare(Varekategori.STUDIEBOG, "Android", 300);
        Vare python = createVare(Varekategori.STUDIEBOG, "Python", 200);
        Vare regnjakke = createVare(Varekategori.TØJ, "Regnjakke", 100);
        Vare regnbukser = createVare(Varekategori.TØJ, "Regnbukser", 80);

        //--------
        opretSalgsannonce(viktor, samsungMobil);
        opretSalgsannonce(viktor, java, android, python);

        opretSalgsannonce(gustav, iPhone);
        opretSalgsannonce(gustav, regnjakke, regnbukser);

        //--------

        // TODO Salgsannoncer:
        //Viktor har oprettet to salgsannoncer. I den ene udbyder han en Samsung mobil og i
        //den anden udbyder han de tre bøger: Java, Android og Python.
        //Gustav har oprettet to salgsannoncer. I den ene udbyder han en IPhone og i den
        //anden udbyder han regnjakke og regnbukser.
        //Salg: Køber Stine har købt bøgerne Android og Python til en samlet pris på 450 kr.
        //Køber Laura har købt regnbukser og regnjakke til en samlet pris på 120 kr.
    }

    public static Salg createSalg(String navn, int pris, ArrayList<Vare> varer) {
        Salg salg = new Salg(navn, pris, varer);
        Storage.addSalg(salg);
        return salg;
    }

    public static Sælger createSælger(String navn, int studieNummer, String mobil) {
        Sælger sælger = new Sælger(navn, studieNummer, mobil);
        Storage.addSælger(sælger);
        return sælger;
    }

    public static Vare createVare(Varekategori kategori, String navn, int pris) {
        Vare vare = new Vare(kategori, navn, pris);
        Storage.addVare(vare);
        return vare;
    }

    public static Salgsannonce createSalgsAnnonce(Sælger sælger) {
        Salgsannonce salgsannonce = new Salgsannonce(sælger);
        return salgsannonce;
    }

    public static ArrayList<Sælger> sælgereSomErKøbere(ArrayList<Sælger> l1, ArrayList<Salg> l2) {
        int i1 = 0;
        int i2 = 0;
        int j = 0;

        ArrayList<Sælger> result = new ArrayList<>();

        while (i1 < l1.size() && i2 < l2.size()) {
            String sælgerNavn = l1.get(i1).getNavn();
            String køberNavn = l2.get(i2).getKøbersNavn();

            System.out.println(sælgerNavn + " " + køberNavn);

            if (sælgerNavn.compareTo(køberNavn) < 0) {
                i1++;
            } else if (sælgerNavn.compareTo(køberNavn) > 0) {
                i2++;
            } else {
                result.add(l1.get(i1));
                i1++;
                i2++;
                j++;
            }
        }
        System.out.println(result.size());
        return result;
    }

    public static void sorteretSalgsListe(ArrayList<Salg> salg) {
        for (int i = 1; i < salg.size(); i++) {
            Salg næste = salg.get(i);
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                String forrige = salg.get(j - 1).getKøbersNavn();
                if (næste.getKøbersNavn().compareTo(forrige) > 0) {
                    found = true;
                } else {
                    salg.set(j, salg.get(j - 1));
                    j--;
                }
            }

            salg.set(j, næste);
        }
    }

    public static Salgsannonce opretSalgsannonce(Sælger sælger, Vare... varer) {
        Salgsannonce salgsannonce = sælger.createSalgsAnnounce();
        for (Vare vare : varer) {
            salgsannonce.addVare(vare);
        }
        return salgsannonce;


    }

    public static Salg opretSalg(String navn, int aftaltPris, ArrayList<Vare> varer) {
        ArrayList<Vare> købt = new ArrayList<>();
        for (Vare vare : varer) {
            vare.setSolgt(true);
            Salgsannonce salgsannonce = vare.getSalgsannonce();
            salgsannonce.annonceStatus();
            købt.add(vare);
        }

        Salg salg = new Salg(navn, aftaltPris, købt);
        Storage.addSalg(salg);
        return salg;
    }

    public static void salgTilFil(String filNavn) {
        try (FileWriter out = new FileWriter(filNavn)) {
            ArrayList<Salg> salgList = getSalg();
            sorteretSalgsListe(salgList);

            for (Salg salg : salgList) {
                System.out.println(salg.getKøbersNavn() + ":");

                int totalPris = 0;
                ArrayList<Vare> købteVarer = salg.getVarer();
                for (Vare vare : købteVarer) {
                    System.out.printf("    %-10s %d%n", vare.getNavn(), vare.getUdbudspris());
                    totalPris += vare.getUdbudspris();
                }
                int rabat = totalPris - salg.getAftaltSamletPris();
                System.out.println("Aftalt pris: " + salg.getAftaltSamletPris() + "   Rabat: " + rabat);
            }

            System.out.println("Fil oprettet");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Salg> getSalg() {
        return Storage.getSalg();
    }

    public static ArrayList<Sælger> getSælgere() {
        return Storage.getSælgere();
    }
}
