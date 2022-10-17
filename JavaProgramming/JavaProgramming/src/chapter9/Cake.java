package chapter9;

/*
The first one is going to be a superclass called Cake and it will have two fields, flavor and price.
Next create a BirthdayCake class which will inherit from the Cake class and it has a field of its own called candles.
And then create a third class called WeddingCake which also inherits from Cake and has a field called tiers.
And then finally, a class called TasteTester which will test out your inheritance.

 */

public class Cake {

    public String flavor;
    public double price;

    public Cake(String flavor, double price){
        setFlavor(flavor);
        setPrice(price);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
