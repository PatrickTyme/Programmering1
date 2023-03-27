package Opgave3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Player Hans = new Player("Hans", 28);
        Player John = new Player("John", 15);
        Player Bent = new Player("Bent", 20);
        Player Lars = new Player("Lars", 25);
        Player Karl = new Player("Karl", 32);

        Hans.setScore(450);
        John.setScore(900);
        Bent.setScore(900);
        Lars.setScore(100);
        Karl.setScore(5);

        Team HoldOp = new Team("HoldOp");
        HoldOp.addPlayer(Hans);
        HoldOp.addPlayer(John);
        HoldOp.addPlayer(Bent);
        HoldOp.addPlayer(Lars);
        HoldOp.addPlayer(Karl);

        System.out.println("Get players from Team: ");
        HoldOp.printPlayers();
        System.out.println();

        System.out.println("Calc average age: ");
        System.out.println(HoldOp.calcAverageAge());
        System.out.println();

        System.out.println("Calc total score: ");
        System.out.println(HoldOp.calcTotalScore());
        System.out.println();

        System.out.println("Calc old players score: ");
        System.out.println(HoldOp.calcOldPlayersScore(23));
        System.out.println();

        System.out.println("Max score: ");
        System.out.println(HoldOp.maxScore());
        System.out.println();

        System.out.println("Best player names: ");
        System.out.println(HoldOp.bestPlayerNames());
        System.out.println();

    }
}
