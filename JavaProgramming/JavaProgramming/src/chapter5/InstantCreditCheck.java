package chapter5;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */


import java.util.Scanner;

public class InstantCreditCheck {

    //1. Define what we know
    static double requiredSalary = 25000;
    static double requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {

        double salary = getSalary();
        double creditScore = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);


        //Notify the user
        notifyUser(qualified);
    }
    //2. Get the values we do not know

    public static double getSalary() {
        System.out.println("Please enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static double getCreditScore() {
        System.out.println("Please enter your credit score");
        double creditScore = scanner.nextDouble();
        return creditScore;

    }


    public static boolean isUserQualified(double creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        } else {
            return false;

        }

    }
    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrazt, you qualify for our credit program");
        } else {
            System.out.println("Sorry, you do not qualify for our credit program, your salary must be " +
                    "more than $" + requiredSalary + " and your credit score should be " +
                    requiredCreditScore);

        }
    }


}

