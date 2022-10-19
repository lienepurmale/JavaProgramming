package chapter12;

import java.util.HashMap;
import java.util.Map;

public class Grades {

    public static void main(String args[]){

        Map<String, Integer> grades = TestResults.getOriginalGrades();
        Map<String, Integer> grades2 = TestResults.getMakeUpGrades();

        for(var name: grades2.entrySet()){
            Integer firstGrade = grades.get(name.getKey());
            Integer secondGrade = grades2.get(name.getKey());

            if(secondGrade>firstGrade){
                grades.put(name.getKey(), secondGrade);
            }
        }



        //To print out the final grades
        System.out.println("The final grades: ");
        grades.forEach((k,v) ->
                System.out.println("Name: " + k + "; Grade: " + v));



    }


}
