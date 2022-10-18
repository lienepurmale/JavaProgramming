package chapter10;

public class Banana extends  Fruit{

    public void peel(){
        System.out.println("You need to peel me before eating");
    }

    public Banana(){
        setCalories(64);
    }

    @Override
    public void makeJuice() {
        System.out.println("This is banana juice");
    }
}
