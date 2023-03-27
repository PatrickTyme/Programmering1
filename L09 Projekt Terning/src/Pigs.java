import java.util.Scanner;

public class Pigs {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Welcome to the game of Pigs\n");
        playPigs();
        System.out.println();
    }

    private static void playPigs() {
        Scanner scanner = new Scanner(System.in);
        int player1Score = 0;
        int player2Score = 0;
        int currentPlayer = 1;
        boolean gameWon = false;
        while (!gameWon) {
            System.out.println("Player " + currentPlayer + "'s turn");
            int roundScore = 0;
            boolean turnOver = false;
            while (!turnOver) {
                System.out.print("Press Enter to roll the dice");
                scanner.nextLine();
                int face = rollDie();
                System.out.println("Eyes: " + face);
                if (face == 1) {
                    System.out.println("Round score: 0");
                    roundScore = 0;
                    turnOver = true;
                } else {
                    roundScore += face;
                    System.out.println("Round score: " + roundScore);
                    System.out.print("Roll again? (yes or no) ");
                    String answer = scanner.nextLine();
                    if (answer.equals("no")) {
                        turnOver = true;
                    }
                }
            }
            if (currentPlayer == 1) {
                player1Score += roundScore;
            } else {
                player2Score += roundScore;
            }
            System.out.println("Player 1 score: " + player1Score);
            System.out.println("Player 2 score: " + player2Score);
            if (player1Score >= 100 || player2Score >= 100) {
                gameWon = true;
                System.out.println("Player " + currentPlayer + " wins!");
            } else {
                currentPlayer = 3 - currentPlayer;
            }
        }
        scanner.close();
    }


    private static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }
}


