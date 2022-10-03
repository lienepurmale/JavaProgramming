package chapter3;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]) {

        //1. Initialize value we know
        int quata = 10;


        //2. Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //3. Make a decision on the path to take - output
        if (sales >= quata) {
            System.out.println("Congrazt!");
        } else {
            int salesShort = quata - sales;
            System.out.println("This week you were " + salesShort + " sales short to the target");
        }
    }
}
