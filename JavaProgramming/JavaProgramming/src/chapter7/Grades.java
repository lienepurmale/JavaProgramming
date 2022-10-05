package chapter7;

/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */

import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.println("Average: " + String.format("%.2f", averageGrade()));
        System.out.println("The lowest grade:" + getLowestGrade());
        System.out.println("The highest grade: " + getHighestGrade());

    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1));
            grades[i] =scanner.nextInt();
        }
    }

    private static int sumGrades() {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    private static double averageGrade() {
        return sumGrades() / grades.length;
    }

    public static int getHighestGrade() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowestGrade() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
