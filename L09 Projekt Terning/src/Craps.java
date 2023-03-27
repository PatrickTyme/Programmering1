import java.util.Arrays;
import java.util.Scanner;

public class Craps {

    private static int point = 0;

    private static boolean keepRolling = true;


    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("Welcome to the game of Craps\n");
        playCrapsGame();
        System.out.println();
    }

    private static void playCrapsGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll?");
        String answer = scanner.nextLine();
        int[] face = rollDice();
        System.out.println("Roll: " + Arrays.toString(face));
        System.out.println();
        int sum = face[0] + face[1];
        {
            if (sum == 7 || sum == 11) {
                System.out.println("You win!");
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose!");
            } else {
                point = sum;
                System.out.println("Point is " + point);
                rollForPoint(scanner, point);
            }
        }
        printStatistics();
        scanner.close();
    }

    public static boolean rollForPoint(Scanner scanner, int point) {
        while (keepRolling)  {
            System.out.println("Roll again");
            String answer = scanner.nextLine();
            int[] face = rollDice();
            System.out.println("Roll: " + Arrays.toString(face));
            int sum = face[0] + face[1];
            if (sum == point) {
                System.out.println("You hit the point, you win!");
                keepRolling = false;
            } else if (sum == 7) {
                System.out.println("You hit 7, you lose!");
                keepRolling = false;
            }
        }
        return false;
    }

    public static int[] rollDice() {
        int firstDie = (int) (Math.random() * 6 + 1);
        int secondDie = (int) (Math.random() * 6 + 1);

        int[] bothDice = new int[2];
        bothDice[0] = firstDie;
        bothDice[1] = secondDie;

        return bothDice;
    }

    private static void printStatistics() {
        System.out.println("\nThanks for playing Craps!");
        System.out.println("-------------------------");
    }
}

