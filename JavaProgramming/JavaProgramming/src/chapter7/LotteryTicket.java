package chapter7;

import java.util.Random;

public class LotteryTicket {


    private static final int LENGHT = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]) {

        int[] ticket = generateNumbers();
        printingTicket(ticket);

    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGHT];

        Random random = new Random();   //generates random numbers

        for (int i = 0; i < LENGHT; i++) {
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }
        return ticket;
    }

    public static void printingTicket(int ticket[]) {
        for (int i = 0; i < LENGHT; i++) {
            System.out.print(ticket[i] + "  |  ");
        }

    }
}

