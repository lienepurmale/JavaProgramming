package FinalJavaProject;

import java.util.Random;

public class Coin {

    public String side;
    public static String tails = "Tails";
    public static String heads = "Heads";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip() {
        if (new Random().nextBoolean()) {
            setSide(tails);
        } else {
            setSide(heads);
        }
        return getSide();


    }
}
