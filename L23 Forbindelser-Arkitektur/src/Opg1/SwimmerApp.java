package Opg1;

import java.util.ArrayList;
import java.util.List;

public class SwimmerApp {

    public static void main(String[] args) {
        ArrayList<Double> lapTimesJan = new ArrayList<>();
        lapTimesJan.addAll(List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99));

        Swimmer jan = new Swimmer("Jan", lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>();
        lapTimesBo.addAll(List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02));

        Swimmer bo = new Swimmer("Bo", lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>();
        lapTimesMikkel.addAll(List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03));

        Swimmer mikkel = new Swimmer("Mikkel", lapTimesMikkel);

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(jan);
        swimmers.add(bo);
        swimmers.add(mikkel);

        TrainingPlan levelA = new TrainingPlan('A', 16, 10);
        TrainingPlan levelB = new TrainingPlan('B', 10, 6);


        jan.setTrainingPlan(levelA);
        bo.setTrainingPlan(levelA);
        mikkel.setTrainingPlan(levelB);

        for (Swimmer s : swimmers) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }

        System.out.println("------------");
            /**
             * Tilføj til klassen SwimmerApp kode, der udskriver svømmerens navn og samlede
             * træningstimer for hver svømmer. Tilføj yderligere kode, der udskriver, hvor mange timer om
             * ugen svømmerne i listen træner i alt.
             */
            int totalHours = 0;
            for (Swimmer sw : swimmers) {
                System.out.println("Name: " + sw.getName() +
                        "\nWeekly training hours: " + sw.allTrainingHours() +
                        "\n------");
                totalHours += sw.allTrainingHours();
            }
        System.out.println("Total training hours: " + totalHours);
        }
    }

