package Opgave3;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" + name + "}";
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }
    public void printPlayers() {
        for (Player printPlayer : players) {
            System.out.println(printPlayer);
        }
    }
    public double calcAverageAge() {
        double averageAge = 0;
        for (Player p : players) {
            averageAge += p.getAge();
        }
        return averageAge / players.size();
    }
    public int calcTotalScore() {
        int totalScore = 0;
        for (Player p : players) {
            totalScore += p.getScore();
        }
        return totalScore;
    }
    public int calcOldPlayersScore(int ageLimit) {
        int totalScoreAboveAgeLimit = 0;
        for (Player p : players) {
            if (p.getAge() >= ageLimit) {
                totalScoreAboveAgeLimit += p.getScore();
            }
        }
        return totalScoreAboveAgeLimit;
    }
    public int maxScore() {
        int max = 0;
        for (Player p : players) {
            if (p.getScore() >= max) {
                 max = p.getScore();
            }
        }
        return max;
    }
    // Vi bruger en ny variabel til metoden for ikke at kalde metoden 100 gange, variablen gemmer den efter én gang.
    public ArrayList<String> bestPlayerNames() {
        int highestScore = maxScore();
        ArrayList<String> names = new ArrayList<>();
        for (Player p : players) {
            if (p.getScore() == highestScore) {
                names.add(p.getName());
            }
        }
        return names;
    }
}
