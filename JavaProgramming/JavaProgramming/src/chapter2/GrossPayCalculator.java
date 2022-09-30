package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String arg[]){

        // 1. get the number of worked hours
        System.out.println("Please enter the worked hours for the employee");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. get the hourly pay rate
        System.out.println("Please enter the hourly pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        // 3. multiply hours and pay rate
        double gross = rate * hours;
        System.out.println("The employees gross pay is: "+ gross + " Euros");

    }
}
// Variable should always have the same data type as the date we receive