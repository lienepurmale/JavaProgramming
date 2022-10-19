package chapter13;

public class DividingByZero {

    public static void main(String args[]) {


        try {
            int c = 30 / 0;

        } catch (ArithmeticException e) {
            System.out.println("It is not possible to divide with 0");

        } finally {
            System.out.println("Dividing is fun!");
        }


    }


}
