package chapter3;

/*IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String arg[]){
        //Initialize the know values
        int salary = 1000;
        int bonus = 250;



        //Get what I do not know
        System.out.println("Please enter how many sales the employee made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > 10){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employees pay is " + salary);
    }

}
