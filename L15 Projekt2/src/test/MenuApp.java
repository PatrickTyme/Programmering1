package test;
import model.Student;
import model.Team;

import java.util.Arrays;
import java.util.Scanner;

public class MenuApp {

    private static Team[] teamArray = new Team[10];

    private static int counter = 0;

    public static void main(String[] args) {
        printMenu();
        Scanner input = new Scanner(System.in);
        int userAction = input.nextInt();
        while (userAction != 6) {
            switch (userAction) {
                case 1 -> {
                    createTeam();
                }
                case 2 -> {
                    createStudent();
                }
                case 3 -> {
                    showOneStudentInfo();
                }
                case 4 -> {
                    printTeamInfo();
                }
                case 5 -> {
                    printAllTeamInfo();
                }
                case 6 -> {
                }
                default -> System.out.println("That is not a valid command");
            }
            printMenu();
            userAction = input.nextInt();
        }

    }

    public static void printMenu() {
        System.out.println("1: Create a team");
        System.out.println("2: Create a student ");
        System.out.println("3: Show one student's info and results");
        System.out.println("4: Show one team's info and results ");
        System.out.println("5: Show info and results for all teams ");
        System.out.println("6: Exit program");
    }

    public static void createTeam() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name for the team: ");
        String teamName = input.nextLine();
        System.out.println("Enter a name for the room: ");
        String roomName = input.nextLine();
        teamArray[counter] = new Team(teamName, roomName);
        counter++;
    }

    public static void printTeamInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter team name: ");
        String teamName = input.nextLine();
         if (getTeamFromString(teamName) != null) {
             for (int i = 0; i < getTeamFromString(teamName).getStudents().length; i++) {
                 System.out.println(getTeamFromString(teamName).studentOfTeamToString()[i]);
             }
            } else {
                System.out.println("Team name invalid");
            }
        }

        public static void printAllTeamInfo() {
            System.out.println("Team info for all teams: \n");
            for (int i = 0; i < teamArray.length && teamArray[i] != null; i++) {
                System.out.println("Team: " + teamArray[i]);
                System.out.println(Arrays.toString(teamArray[i].studentOfTeamToString()));
            }
        }


    public static Team getTeamFromString(String teamName) {
        for (int i = 0; i < teamArray.length && teamArray[i] != null; i++) {
            if (teamName.equals(teamArray[i].getName())) {
                return teamArray[i];
            }
        }
        return null;
    }
    public static void showOneStudentInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the team name of the student: ");
        String teamName = input.nextLine();
        System.out.println("Enter the name of the student: ");
        String studentName = input.nextLine();
            for (int i = 0; i < getTeamFromString(teamName).getStudents().length; i++) {
                if (getTeamFromString(teamName).getStudents()[i].getName().equals(studentName)) {
                    System.out.println(getTeamFromString(teamName).studentOfTeamToString()[i]);
                }
            }

        }


    public static int getTeamFromPosition(String teamName) {
        for (int i = 0; i < teamArray.length && teamArray[i] != null; i++) {
            if (teamName.equals(teamArray[i].getName())) {
                return i;
            }
        }
        return 0;
    }
    public static void createStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter students team name: ");
        String teamName = input.nextLine();

        if (getTeamFromString(teamName) != null) {
            System.out.println("Students name and activity status: ");
            String studentsName = input.nextLine();
            boolean activityStatus = input.nextBoolean();

            getTeamFromString(teamName).addStudent(new Student(studentsName, activityStatus));
            System.out.println("Students number of grades: ");
            int numberOfGrades = input.nextInt();
            System.out.println("Students " + numberOfGrades + " grades ");

            int[] tempGrades = new int[numberOfGrades];


            for (int i = 0; i < tempGrades.length; i++) {
                tempGrades[i] = input.nextInt();
            }
            // Setter karakter til den enkelte studerende.
            int position = getTeamFromString(teamName).getNumberOfStudents()-1;
            getTeamFromString(teamName).getStudents()[position].setGrades(tempGrades);

            System.out.println("--> Student " + studentsName + "(" + activityStatus + ")" + " with grades " + Arrays.toString(tempGrades) + " created in the team " + teamName);
        } else {
            System.out.println("Team findes ikke");
        }

    }
}
