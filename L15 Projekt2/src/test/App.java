package test;

import model.Student;
import model.Team;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Team team1 = new Team("Hold1", "AB69");
        Team team2 = new Team("Hold2", "BA70");
        System.out.println(team1);
        System.out.println(Arrays.toString(team1.getStudents()));
        System.out.println("-----------");
        Student lis = new Student("Lis", true);
        Student lasse = new Student("Lasse", true);
        Student birgitte = new Student("Birgitte", true);
        Student susanne = new Student("Susanne", true);
        lis.setGrades(new int[]{4, 10, 12, 7});
        lasse.setGrades(new int []{1, 3, 7});
        birgitte.setGrades(new int []{3, 7, 4});
        susanne.setGrades(new int []{7, 10, 2});
        team1.addStudent(lis);
        team1.addStudent(lasse);
        team1.addStudent(birgitte);
        team1.addStudent(susanne);
        System.out.println(lasse);
        System.out.println(lis);
        System.out.println("Lasse average grade: " + lasse.getGradeAverage());
        System.out.println("Lis average grade: " + lis.getGradeAverage());
        System.out.println("team1 average grade: " + team1.getTeamAverageGrade());

        System.out.println();
        lis.generatedStudentAnswers();
        lasse.generatedStudentAnswers();
        birgitte.generatedStudentAnswers();
        susanne.generatedStudentAnswers();


        //print af antal rigtige testsvar
        for (int i = 0; i < team1.correctAnswersCount().length; i++) {
            System.out.print(team1.correctAnswersCount()[i] + " \n");
        }
        System.out.println();
        for (int i = 0; i < team1.studentOfTeamToString().length; i++) {
            System.out.print(team1.studentOfTeamToString()[i] + " \n");
        }
        for (int i = 0; i < team1.teamAnswerStatistics().length; i++) {
            System.out.print(team1.teamAnswerStatistics()[i] + " ");
        }
    }
}
