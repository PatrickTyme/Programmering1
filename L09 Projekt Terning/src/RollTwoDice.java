import java.util.Arrays;
import java.util.Scanner;
// Udvid programmet, så udskriften også viser antal gange 1’ere, 2’ere, ... 6’ere er forekommet i
//alle kastene tilsammen (krav: et array skal bruges her).
public class RollTwoDice {
    private static int rollCount = 0;
    private static int totalSum = 0;
    private static int count = 0;
    private static int maxEyesInOneRoll = 0;
    private static int[] eyeFrequence = new int[6];


    public static void main(String[] args) {
        System.out.println("Welcome to the game of RollTwoDice");
        printRules();
        System.out.println();

        playTwoDice();

        System.out.println();
        System.out.println("Thank you for playing RollTwoDice");
    }

    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of RollTwoDice:");
        System.out.println("The players throw two dice as long as they want.");
        System.out.println("=====================================================");
    }

    private static void playTwoDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll? ('no' stops) ");
        String answer = scanner.nextLine();
        while (!answer.equals("no")) {
            int[] face = rollDice();
            System.out.println("Eyes: " + Arrays.toString(face));
            System.out.println();

            updateStatistics(face);

            System.out.print("Roll? ('no' stops) ");
            answer = scanner.nextLine();
        }
        printStatistics();
        scanner.close();
    }

    public static int[] rollDice() {
        int firstDie = (int) (Math.random() * 6 + 1);
        int secondDie = (int) (Math.random() * 6 + 1);

        int[] bothDice = new int[2];
        bothDice[0] = firstDie;
        bothDice[1] = secondDie;

        return bothDice;
    }


    private static void updateStatistics(int[] face) {
        totalSum += face[0] + face[1];
        int sum = face[0] + face[1];
        if (sum > maxEyesInOneRoll) {
            maxEyesInOneRoll = sum;
        }
        if (face[0] == face[1]) {
            count++;
        }
        eyeFrequence[face[0]-1]++;
        eyeFrequence[face[1]-1]++;
        rollCount++;
    }

        private static void printStatistics() {
            System.out.println("\nResults:");
            System.out.println("-------");
            System.out.printf("%17s %4d\n", "Roll count:", rollCount);
            System.out.printf("%17s %4d\n", "Total sum is:", totalSum);
            System.out.printf("%17s %4d\n", "Same eyes:", count);
            System.out.printf("%17s %4d\n", "Highest eyes:", maxEyesInOneRoll);
            System.out.printf("Frequency of eyes: ");
            for (int i = 0; i < eyeFrequence.length; i++) {
                System.out.printf("%d:%d ", i + 1, eyeFrequence[i]);
            }
        }
    }
