package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);
        calculator.scanner.close();
    }

    public Rectangle getRoom() {

        System.out.println("Please enter the width of the room");
        double width = scanner.nextDouble();

        System.out.println("Please enter the length of the room");
        double lenght = scanner.nextDouble();

        return new Rectangle(lenght, width);

    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle2.calculateArea() + rectangle1.calculateArea();
    }
}
