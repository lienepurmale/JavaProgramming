package chapter7;

//ensure there is no duplicate numbers generated

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {


    private static final int LENGHT = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printingTicket(ticket);

    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGHT];

        Random random = new Random();   //generates random numbers

        for (int i = 0; i < LENGHT; i++) {
            int randomNumber;

            //Generate random number then search to make sure it does not already exist in the array.
            //If it does, regenerate and search again
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }
            while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }


        return ticket;
    }

    public static boolean search(int[] array, int randomNumber) {
        //Enhanced loop
         /* It iterates through 'array' and
          each time assigns the current element to 'value'
         */
        for (int value : array) {
            if (value == randomNumber) {
                return true;
            }
        }       /*If we've reached this point, then the entire array was searched
          and the value was not found
         */
        return false;
    }


    public static void printingTicket(int ticket[]) {
        for (int i = 0; i < LENGHT; i++) {
            System.out.print(ticket[i] + "  |  ");
        }

    }
}
