package chapter6;

/*
 * a phone bill should have an ID, a base class, a number of allotted minutes and a number of minutes used
 * it should also be able to calculate the overage, calculate the tax, and calculate the total.
 * And then, it should also be able to print an itemized bill.
 * You should also include three constructors: a default one; one that accepts the ID only; one that accepts all fields
 *
 */

import java.util.Scanner;

public class PhoneBill {

    Scanner scanner = new Scanner(System.in);
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }


    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }


    public PhoneBill() {
        id = 2;
        baseCost = 70;
        allottedMinutes = 500;
        minutesUsed = 534;

    }

    public void PhoneBill(int id) {
        this.id = id;
        baseCost = 70;
        allottedMinutes = 500;
        minutesUsed = 534;
    }

    public void PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage() {
        if (minutesUsed <= allottedMinutes) {
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax() {
        double taxRate = 0.15;
        double tax = taxRate * (baseCost+ calculateOverage());
        return tax;
    }

    public double calculateTotal() {
        return baseCost + calculateTax() + calculateOverage();
    }

    public void printBill() {
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }

}

