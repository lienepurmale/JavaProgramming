package chapter5;

/*
 * calculate the final total of someone's cell phone bill.
 * allow the user to input the plan fee and the number of overage minutes.
 * charge the user 25 cents for every minute that they've gone over their plan, and then a 15% tax on the subtotal.
 * Create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.
 * Please print this as an itemized bill.
 */


import java.util.Scanner;

public class PhoneBillCalculator {

    static double charge = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {


        System.out.println("Please enter your plan base cost");
        double baseCost = scanner.nextDouble();

        System.out.println("Please enter your overage minutes");
        double overageMinutes = scanner.nextDouble();

        scanner.close();

        double overageCharge = calculatingOverageCharge(overageMinutes);
        double tax = calculatingTax(baseCost+overageCharge);

        finalBill(baseCost,tax,overageCharge);

    }

    public static double calculatingOverageCharge(double extraMinutes){
        double overage = charge * extraMinutes;
        return overage;
    }


    private static double calculatingTax(double taxCharge) {
        tax = tax * taxCharge;
        return tax;
    }


    //Final output
    public static void finalBill(double base, double overage, double tax) {
        double totalAmount= base+ overage + tax;

        System.out.println("Phone bill statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $ " + String.format("%.2f",overage));
        System.out.println("Tax: $ " + String.format("%.2f",tax));
        System.out.println("Total amount to pay: $ " + String.format("%.2f",totalAmount));
    }

}


