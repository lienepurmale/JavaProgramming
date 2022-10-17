package chapter9;

public class TasteTester {

    public static void main(String args[]) {

        Cake cake = new Cake("berry", 13.65);
        System.out.println("Cake flavor is " + cake.getFlavor() + " and the price for this cake is " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(5);
        System.out.println("Birthday cake flavor is " + birthdayCake.getFlavor() + " and this cake has " + birthdayCake.getCandles() + " candles");

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(6);
        System.out.println("Wedding cake has " + weddingCake.getTiers() + " tiers");

    }
}
