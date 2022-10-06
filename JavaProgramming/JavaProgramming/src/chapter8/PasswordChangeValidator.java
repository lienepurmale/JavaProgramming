package chapter8;

/**
 * validate the complexity of a proposed password by assuring it meets these rules:
 * 1. at least 8 characters long
 * 2. contains an upper case letter
 * 3. contains a special character
 * 4. not contain the username
 * 5. not the same as the old password
 */

import java.util.Scanner;


public class PasswordChangeValidator {

    public static void main(String args[]) {
        System.out.println("Please enter your username:");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        System.out.println("Please enter your current password");
        String currentPassword = input.nextLine();

    }

    public void showPasswordRules() {
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();

        System.out.println("Please enter your new password:");
        String newPassword = input.nextLine();

    }


    private Scanner input = new Scanner(System.in);
}
