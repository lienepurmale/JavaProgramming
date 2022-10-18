package chapter10;

public class Watermelon extends Fruit {

    public void wash(){
        System.out.println("Please wash me before eating");
    }

    public void cut(){
        System.out.println("Please cut me to be able to eat");
    }

   public void Watermelon(){
        setCalories(85);
   }

    @Override
    public void makeJuice() {
        System.out.println("This is watermelon juice");
    }
}
