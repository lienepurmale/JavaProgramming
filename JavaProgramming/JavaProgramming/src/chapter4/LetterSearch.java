package chapter4;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter ‘A’.
 */


import java.util.Scanner;

public class LetterSearch {

    public static void main(String args[]){

        //1. Get text
        System.out.println("Please enter the text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //2. Search for letter A
        for( int i= 0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;

            }
        }
        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        } else {
            System.out.println("Sorry, this text does not contain letter 'A'");
        }

    }
}
