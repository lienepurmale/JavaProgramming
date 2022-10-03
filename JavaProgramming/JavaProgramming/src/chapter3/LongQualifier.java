package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LongQualifier {

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
        if (salary >= requiredSalary) {
            if (years >= requiredYears) {
                System.out.println("You are qualified for the loan");
            } else {
                System.out.println("You do not qualify for the loan since you have not been employed at your current job for at least " +
                        requiredYears + " years");
            }
        } else {
            System.out.println("Sorry, you salary does not meet requirements, it must be at least"
                    + requiredSalary + " dollars to get the loan");
        }
    }


}

