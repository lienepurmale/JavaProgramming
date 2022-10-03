package chapter3;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

//Break is important, if not used after every case it will continue to print out value until next Break

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]) {

        System.out.println("Please enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade) {
            case "A":
                message = "Exellent job!";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work harder";
                break;
            case "F":
                message = "Ohh no!";
                break;
            default:
                message = "Error, invalid input";
                break;
        }
        System.out.println(message);


    }
}
