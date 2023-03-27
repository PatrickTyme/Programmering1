package model;

import java.util.Arrays;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;

    private char[] multipleChoiceResults = new char[10];
    public Student() {
    }

    public Student(String name, boolean active) {
        this.name = name;
        this.active = active;
        this.grades = new int[]{0};
    }

    public double getGradeAverage() {
        double averageGrade = 0;
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            averageGrade += grades[i];
            count++;
        }
        return averageGrade / count;
    }

    public char[] getMultipleChoiceResults() {
        return multipleChoiceResults;
    }

    public void generatedStudentAnswers() {

        for (int i = 0; i < multipleChoiceResults.length; i++) {
            int random = (int) (Math.random() * (4)) + 1;

            switch (random) {
                case 1 -> multipleChoiceResults[i] = 'A';
                case 2 -> multipleChoiceResults[i] = 'B';
                case 3 -> multipleChoiceResults[i] = 'C';
                case 4 -> multipleChoiceResults[i] = 'D';
                default -> multipleChoiceResults[i] = 'X';
            }
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getHighestGrade() {
        int highestGrade = 0;
        for (int i : grades) {
            if (grades[i] >= highestGrade) {
                highestGrade = grades[i];
            }
        } return highestGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", active=" + active +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public int[] getGrades() {
        return grades;
    }
}
