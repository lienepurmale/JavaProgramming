package chapter9;

public class WeddingCake extends Cake {

    public int tiers;

    public WeddingCake(){
        super("Coffee" , 14.67);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }


}
