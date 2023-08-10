package day06string_manipulations_loops;

public class C01Review {
    public static void main(String[] args) {

        //Example 1: Make the all digits except last 4 digits of a credit card invisible by using '*'
        //           1234 1234 1234 1234 ==> **** **** **** 1234

       String ccNumber = "1234 1234 1234 1234";






        //Example 2: Count the number of characters different from space were used in a String
        //          "Tom Hanks was born in 1975."

        String sentence = "Tom Hanks was born in 1975.";
        int numOfCharDiffFromSpaces = sentence.replace(" ", "").length();
        System.out.println(numOfCharDiffFromSpaces);







    }
}