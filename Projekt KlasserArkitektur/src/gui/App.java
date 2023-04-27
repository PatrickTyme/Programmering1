package gui;

import controller.Controller;
import model.Forestilling;
import model.Kunde;
import model.Plads;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        initStorage();
       // testPrint();
        gui.launch(gui.class);
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
                } else if ((i >= 6 && i <= 10 && j >= 1 && j <= 2) || (i >= 6 && i <= 10 && j >= 19 && j <= 20)) {
                    Controller.createPlads(i, j, 400, Plads.PladsType.STANDARD);
                } else if (i >= 11 && i <= 15 && j >= 1 && j <= 20) {
                    if (i == 11 && j >= 8 && j <= 12) {
                        Controller.createPlads(i, j, 400, Plads.PladsType.LANGEBEN);
                    } else {
                        Controller.createPlads(i, j, 400, Plads.PladsType.STANDARD);
                    }
                } else {
                    if (i == 10 && j >= 8 && j <= 12) {
                        Controller.createPlads(i, j, 450, Plads.PladsType.KØRESTOL);
                    } else {
                        Controller.createPlads(i, j, 450, Plads.PladsType.STANDARD);
                    }
                }
            }
        }

    }

    public static void testPrint() {
        System.out.println("Forestillinger: ");
        for (Forestilling forestilling : Controller.getForestillinger()) {
            System.out.print(forestilling + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Kunder: ");
        for (Kunde kunde : Controller.getKunder()) {
            System.out.print(kunde + ", ");
        }
        System.out.println();
        System.out.println();
        int count = 0;
        for (Plads plads : Controller.getPladser()) {
            count++;
            System.out.printf(plads + "    ");
            if (count == 20) {
                System.out.println(" ");
                count = 0;
            }
        }
    }
}
