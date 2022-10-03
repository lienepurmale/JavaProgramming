package chapter3;

/*
 * Logical operators:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LongQualifier2 {

    public static void main(String args[]) {
        //1. Initialize what we know
        double requiredSalary = 30000;
        int requiredYears = 2;


        //2. Ge the values that we do not know
        System.out.println("Please enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Please enter for how many years you have been working at your current job");
        double years = scanner.nextDouble();
        scanner.close();

        //3. Make a decision
        if (salary >= requiredSalary && years >= requiredYears) {
            System.out.println("You are qualified for the loan");

        } else {
            System.out.println("Sorry, you salary does not meet requirements, it must be at least"
                    + requiredSalary + " dollars to get the loan");
        }
    }


}

