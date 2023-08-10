package day20exceptions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class GradeaRunner {
    public static void main(String[] args) {

        System.out.println(addGrades(50));
        System.out.println(addGrades(-67));


    }



    //Create a method that adds grades into a list

    public static List<Integer> addGrades(int grade){
        List<Integer> gradeList = new ArrayList<>(); // empty grade list to store the grades

        if (grade>=0 && grade<=100){
            gradeList.add(grade);
        } else {
            throw new IllegalArgumentsException("Grade cannot be ess than 0 or more than 100");
        }



        gradeList.add(grade);
        return gradeList;

    }
}
