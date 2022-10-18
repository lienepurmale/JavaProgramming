package chapter10;

public class Market {

    public static void main(String args[]) {

        Banana banana = new Banana();
        banana.peel();
        banana.makeJuice();


        Watermelon watermelon = new Watermelon();
        watermelon.setCalories(58);
        watermelon.cut();
        watermelon.makeJuice();

        Fruit apple = new Fruit();
        eat(banana);
        eat(watermelon);

    }

    public static void eat(Fruit fruit){
        if(fruit instanceof Banana){
            System.out.println("Peel me first to eat");
        }
        if(fruit instanceof Watermelon){
            System.out.println("Wash me first");
        }
    }
}
