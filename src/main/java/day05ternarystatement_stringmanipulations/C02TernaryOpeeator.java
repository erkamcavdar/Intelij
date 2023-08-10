package day05ternarystatement_stringmanipulations;

public class C02TernaryOpeeator {
    public static void main(String[] args) {

        // type code to check if an integer is odd and if it is even it should be divisible by 3.

        int a = 113;

        String result1 =  a%2!=0 ? "Odd" : (a%3==0 ? "Even and divisble by 3" : "Even but no divisible by 3");
        System.out.println(result1);

        //type java code by using nested ternary
        //write a program to check if a year is leap year or not
        //if the year is divisible by 100 then it must be divisible by 400
        //if a year is not divisible by 100 then it must be divisible by 4

        int year = 2000;

        String result2 = (year%100==0)   ?   (year%400==0 ? "Leap" : "Not Leap")   :    (year%4==0 ? "Leap" : "Not Leap" );
        System.out.println(result2);



    }
}
