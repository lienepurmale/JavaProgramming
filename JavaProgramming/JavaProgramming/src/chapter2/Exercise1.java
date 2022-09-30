package chapter2;

//Create a program that asks a user for a season of the year, then a whole number, then an adjective.
// And use the input to complete the sentence below. Output the result.

import java.util.Scanner;

public class Exercise1 {

    public static void main(String arg[]) {
        System.out.println("Please enter the season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Please enter the whole number");
        int number= scanner.nextInt();

        System.out.println("Please enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }

}
