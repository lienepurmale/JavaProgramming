package chapter10;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Wau, wau!");
    }

    public void fetch(){
        System.out.println("I can do fetching");
    }
}
