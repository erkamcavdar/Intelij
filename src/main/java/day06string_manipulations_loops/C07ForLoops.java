package day06string_manipulations_loops;

import java.sql.SQLOutput;

public class C07ForLoops {
    public static void main(String[] args) {

        //Example 1: Type "Hi!" 5 times on the console...

        //1.Way: Not Recommended because difficult to type, update, fix errors and there is repetetion
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.Way: Java created "loops" to make repeated actions easy
        //There are 4 loops in Java: i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
          // starting value   Ending Value  Increment/Decrement


        for ( int i = 1     ;  i<6      ;    i++     ) {
            System.out.println("Hi");
        }

            //Example 2: type code to print integers from 10 to 3 in the same line and a space between them for

        for ( int i = 10; i > 7 ; i--){

            System.out.print(i + " ");
            }
    }
}
