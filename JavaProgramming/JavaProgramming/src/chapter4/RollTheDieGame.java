package chapter4;

/*
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

 * Roll the die for the user (generate a Random number between 1 – 6) and advance
 * the user that number of spaces on the game board.
 * After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
 * Repeat this 4 additional times, for 5 rolls in total.
 * However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
 * If they are greater than or less than 20 spaces exactly, they lose.
 * Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

import java.util.Random;

public class RollTheDieGame {

    public static void main(String args[]) {

        //1. Define what we know

        Random random = new Random();

        int rolls = 5;
        int maxSpace = 20;
        int currentSpace = 0;



        System.out.println("Hello and welcome to the Roll The Die Game");

        for (int i = 1; i <= rolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentSpace == maxSpace) {
                System.out.println("You're on space " + currentSpace + ". Congrats, you win!");
                break;

            } else if (currentSpace > maxSpace) {
                int pastSpace = currentSpace - maxSpace;
                System.out.println("Sorry, you lost! That takes you to " + currentSpace + " and you are past the winning space by "
                        + pastSpace);
                break;

            } else if (i == rolls && currentSpace < maxSpace) {
                System.out.println("You are on space " + currentSpace + " sorry, you lost");
                System.out.println("Sorry, you lost! You did not make it to all " + maxSpace + "" );
            }
            else {
                int beforeSpace = maxSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + beforeSpace + " more to go.");
            }
            System.out.println(); //To make it look visually nicer


        }
    }
}




