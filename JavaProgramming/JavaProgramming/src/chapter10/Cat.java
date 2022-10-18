package chapter10;

public class Cat extends  Animal{

    @Override
    public void makeSound() {
        System.out.println("Meeeeow");
    }

    public void scratch(){
        System.out.println("I like scratching things");
    }
}
