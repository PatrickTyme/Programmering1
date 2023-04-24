package gui;

import controller.Controller;
import model.Forestilling;
import model.Kunde;
import model.Plads;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        initStorage();
        System.out.println(Storage.getPladser());
        System.out.println(Storage.getKunder());
        System.out.println(Storage.getForestillinger());
        testPrint();
    }

    public static void initStorage() {
        Forestilling evita = Controller.createForestilling("Evita", LocalDate.parse("2023-08-10"), LocalDate.parse("2023-08-20"));
        Forestilling lykkePer = Controller.createForestilling("Lykke Per", LocalDate.parse("2023-09-01"), LocalDate.parse("2023-09-10"));
        Forestilling chess = Controller.createForestilling("Chess", LocalDate.parse("2023-08-21"), LocalDate.parse("2023-08-30"));

        Kunde anders = Controller.createKunde("Anders Hansen", "11223344");
        Kunde peter = Controller.createKunde("Peter Jensen", "12345678");
        Kunde niels = Controller.createKunde("Niels Madsen", "12341234");


        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i >= 1 && i <= 5 && j >= 3 && j <= 18) {
                    Controller.createPlads(i, j, 500, Plads.PladsType.STANDARD);
                    System.out.println("1");
                } else if ((i >= 6 && i <= 10 && j >= 1 && j <= 2) || (i >= 6 && i <= 10 && j >= 19 && j <= 20)) {
                    Controller.createPlads(i, j, 400, Plads.PladsType.STANDARD);
                    System.out.println("2");
                } else if (i >= 11 && i <= 15 && j >= 1 && j <= 20) {
                    if (i == 11 && j >= 8 && j <= 12) {
                        Controller.createPlads(i, j, 400, Plads.PladsType.LANGEBEN);
                        System.out.println("3");
                    } else {
                        Controller.createPlads(i, j, 400, Plads.PladsType.STANDARD);
                        System.out.println("4");
                    }
                } else {
                    if (i == 10 && j >= 8 && j <= 12) {
                        Controller.createPlads(i, j, 450, Plads.PladsType.KØRESTOL);
                        System.out.println("5");
                    } else {
                        Controller.createPlads(i, j, 450, Plads.PladsType.STANDARD);
                        System.out.println("6");
                    }
                }
            }
        }
        System.out.println("her "+Controller.getPladser());

        //  ArrayList<Plads> tempPladser = Controller.getPladser();
        //  for (int k = 187; k < 192; k++) {
        //        tempPladser.get(k).setPladsType(Plads.PladsType.KØRESTOL);
        //  } for (int l = 207; l < 212; l++) {
        //    tempPladser.get(l).setPladsType(Plads.PladsType.LANGEBEN);
        //}
    }

    public static void testPrint() {
  /*      for (Forestilling forestilling : Controller.getForestillinger()) {
            System.out.println(forestilling);
        }
        for (Kunde kunde : Controller.getKunder()) {
            System.out.println(kunde);
        }
        for (Plads plads : Controller.getPladser()) {
            System.out.print(plads);
            if(plads.getNr() == 20) {
                System.out.println();
            }
        }*/
    }
}
