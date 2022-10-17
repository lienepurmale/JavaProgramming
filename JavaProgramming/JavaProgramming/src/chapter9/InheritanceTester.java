package chapter9;

public class InheritanceTester {

    public static void main(String args[]) {

        Mother mother = new Mother();
        mother.setName("Gina");


        System.out.println(mother.getName() + " is a " + mother.getGender());


    }
}
