package FinalJavaProject;

import java.util.Scanner;

public class Player {

    public String name;
    public String guess;

    public Player(String name) {
        setName(name);
    }
    public String getName(){
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }


}
