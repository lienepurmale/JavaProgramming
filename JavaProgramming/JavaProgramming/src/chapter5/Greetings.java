package chapter5;

/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */

import java.util.Scanner;

public class Greetings {

    public static void main(String args[]) {

        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetingUser(name);

    }
    public static void greetingUser(String userName){
        System.out.println("Hello " + userName);

    }
}
