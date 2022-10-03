package chapter3;

/* The objective of the game is to enter enough change to equal exactly one dollar.
So, you're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?

What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
 */

import java.util.Scanner;

public class DollarGame {

    public static void main(String args[]) {

        //1. Give values
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");


        //2. Ask for the values

        System.out.println("Please enter how many pennies would you like");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();

        System.out.println("Please enter how many nickels would you like");
        double nickels = scanner.nextDouble();

        System.out.println("Please enter you many dimes would you like");
        double dimes = scanner.nextDouble();

        System.out.println("Please enter how many quarters would you like");
        double quarters = scanner.nextDouble();
        scanner.close();

        double givenSum = pennies * penny + nickels * nickel + dimes * dime + quarters * quarter;

        //3. Make a decision
        if (givenSum < dollar) {
            double missingAmount = dollar - givenSum;
            System.out.println("Please try again, the collected sum is less then " + dollar + " dollar," +
                    " you were short by " + String.format("%.2f", missingAmount));
            // //Way to make the decimal print with only 2 decimal places

        } else if (givenSum > dollar) {
            double overAmount = givenSum - dollar;
            System.out.println("Please try again, the collected sum is more than " + dollar +
                    " you went over by " + String.format("%.2f", overAmount));
        } else {
            System.out.println("Congrazt, you won!");

        }
    }
}
