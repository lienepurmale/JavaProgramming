package chapter4;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]) {

        //1. values we know
        double rate = 15;
        int maxHours = 40;

        //2. Get input for unknown values
        System.out.println("Please enter how many hours you worked this week");
        Scanner scanner = new Scanner(System.in);
        double workedHours = scanner.nextDouble();


        //3. validate input
        while (workedHours > maxHours || workedHours < 1) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Please try again");
            workedHours = scanner.nextDouble();     //to give another try to enter value
        }
        scanner.close();
        double gross = rate * workedHours;
        System.out.println("Gross pay: $ " + gross);

    }
}
