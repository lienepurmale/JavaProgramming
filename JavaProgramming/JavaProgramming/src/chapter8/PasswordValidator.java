package chapter8;

import java.util.Scanner;

/**
 * validate the complexity of a proposed password by assuring it meets these rules:
 * 1. at least 8 characters long
 * 2. contains an upper case letter
 * 3. contains a special character
 * 4. not contain the username
 * 5. not the same as the old password
 */


public class PasswordValidator {


    public static void main(String args[]) {

        //1. user enters username
        System.out.println("Please enter your username");
        Scanner input = new Scanner(System.in);
        String username = input.next();

        //2. user enters current password
        System.out.println("Please enter your current password");
        String currentPassword = input.next();



    }



}

