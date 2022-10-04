package chapter6;

/*
 * Write a class that describes the fields and methods of a rectangle
 * Write another class that creates instances of the rectangle class to find the total area of 2 rooms in a house.
 */

public class Rectangle {
    private double length; //Private means: No other code outside of this class can access things that are marked as private.

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //constructors name should be the same as class name
    public Rectangle() {
        length = 0;
        width = 0;
    }

    //another way how to build constructors
    public Rectangle(double length, double width){
        setLength(length); //or using setter
        this.setWidth(width);
    }

     public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }
}
