package chapter4;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean again = false;

        do {
            System.out.println("Please enter the first number");
            double num1 = scanner.nextDouble();
            System.out.println("Please enter the second number");
            double num2 = scanner.nextDouble();
            double sum= num1+ num2;
            System.out.println("The sum is " + sum);

            System.out.println("Do you like to start over? Yes: true  No:false");
            again = scanner.nextBoolean();

        } while (again);

        scanner.close();
    }
}
