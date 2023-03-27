package model;

import java.util.Arrays;

public class Team {
    private Student[] students = new Student[32];
    private String name;
    private String room;
    private int numberOfStudents;

    private final static char[] testAnswers = new char[]{'A', 'B', 'A', 'C', 'B', 'D', 'D', 'A', 'C', 'A'};

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public Student[] getStudents() {
        Student[] studentArray = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            studentArray[i] = students[i];
        }
        return studentArray;
    }

    public void addStudent(Student student) {
        this.students[numberOfStudents] = student;

        numberOfStudents++;
    }

    public void removeStudent(String name) {
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && name.equals(students[i].getName())) {
                counter = i;
            }
        }
        for (int i = counter; i < students.length; i++) {
            if (i == students.length - 1) {
                students[i] = null;
            } else {
                students[i] = students[i + 1];
            }
        }
        numberOfStudents--;
    }

    public double getTeamAverageGrade() {
        double teamAverage = 0;
        int numberOfGrades = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            int[] average = students[i].getGrades();
            for (int j = 0; j < average.length; j++) {
                teamAverage += average[j];
                numberOfGrades++;
            }
        }
        return teamAverage / numberOfStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void printTestAnswers() {
        System.out.print("Test Answers:");
        for (char testAnswer : testAnswers) {
            System.out.print(" " + testAnswer);
        }
        System.out.println();
    }

    public String[] studentOfTeamToString() {
        String[] studentArray = new String[numberOfStudents];
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = String.format("Navn: %s %s %.1f %s %d", students[i].getName(), " Gennemsnit: ", students[i].getGradeAverage(), " Antal rigtige: ", correctAnswersCount()[i]);

        }
        return studentArray;
    }

    public int[] correctAnswersCount() {
        int[] numberOfCorrect = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
                char[] testResults = students[i].getMultipleChoiceResults();
                for (int j = 0; j < 10; j++) {
                    if (testResults[j] == testAnswers[j]) {
                    numberOfCorrect[i]++;
                }
            }
        }
        return numberOfCorrect;
    }

    public int[] teamAnswerStatistics() {
        int[] correctAnswers = new int[testAnswers.length];
        for (int i = 0; i < numberOfStudents; i++) {
            char[] testResults = students[i].getMultipleChoiceResults();
            for (int j = 0; j < 10; j++) {
                if (testResults[j] == testAnswers[j]) {
                    correctAnswers[j]++;
                }
            }
        }
        return correctAnswers;
    }

    public Student[] highScoreStudents(double minAverage) {
       int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].isActive() && students[i].getGradeAverage() >= minAverage) {
                counter++;
            }
        }
        Student[] studentAboveMinAverageGrade = new Student[counter];
        int counter2 = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].isActive() && students[i].getGradeAverage() >= minAverage) {
                counter2++;
            }
        } return studentAboveMinAverageGrade;
    }

    public String getName() {
        return name;
    }

    /* public void printStudentName() {
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    System.out.println(students[i].getName());
                } else {
                    return;
                }
            }
        }
    */
    @Override
    public String toString() {
        return "Team{" +
                ", name='" + name + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
