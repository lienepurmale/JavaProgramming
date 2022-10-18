package chapter11;

public class Rectangle extends Shape {

    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        setLenght(lenght);
        setWidth(width);
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    double calculateArea() {
        return lenght * width;
    }
}
