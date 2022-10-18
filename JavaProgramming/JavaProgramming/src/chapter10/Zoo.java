package chapter10;

public class Zoo {

    public static void main(String args[]) {

        Dog husky = new Dog();
        husky.fetch();
        husky.makeSound();
        feedAnimal(husky);

        Animal molly = new Dog();
        molly.makeSound();
        feedAnimal(molly);

        molly = new Cat();
        molly.makeSound();
        feedAnimal(molly);
    }

    public static void feedAnimal(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("I need cat food");
        }
        if (animal instanceof Dog) {
            System.out.println("I need dog food");
        }
    }
}
