package chapter9;

public class Square extends Rectangle{

    @Override
    public double calculatePerimeter() {
        return sides * lenght;

    }

    @Override
    public void print(String what) {
        System.out.println("I am " + what);
    }
}
