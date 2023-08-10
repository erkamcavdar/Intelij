package day24Lambda;

import java.util.stream.IntStream;

public class C03Lambda {
    public static void main(String[] args) {

        System.out.println(getSum(4,6));
        System.out.println(multiply(4,5));
        System.out.println(getFactorial(5));


    }

    //Example 1: Create a method to find the sum of integers from 7 to 100

    public static int getSum(int starting, int ending){
        if(starting>ending){
            int temp = starting;
            starting = ending;
            ending = temp;
        }

        return IntStream.rangeClosed(starting, ending).sum();
    }

    //Example 2: Create a method to find the multiplication of integers from 2(inc) to 11(inc)

    public static int multiply(int starting, int ending){
        if(starting>ending){
            int temp = starting;
            starting = ending;
            ending = temp;
        }

        return IntStream.rangeClosed(starting, ending).reduce(1, (t,u) -> t*u);
    }

    //Example 3: Create a method to find the factorial of a given number(5! = 1*2*3*4*5)

    public static int getFactorial(int num){
        if(num<0){
            System.out.println("Negative numbers can't be used fo factorials");
        }
        return IntStream.rangeClosed(1, num).reduce(Math::multiplyExact).getAsInt();
    }

    /*
    Lambda expressions: "Variable(s) -> Operation(s) structure is called as Lambda expression
    Method Reference: "Class name :: methodName" structure is known as Method References.
     */











}
