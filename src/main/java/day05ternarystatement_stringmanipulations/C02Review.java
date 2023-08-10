package day05ternarystatement_stringmanipulations;

public class C02Review {
    public static void main(String[] args) {


        // type code to check if an integer is odd and if it is even it should be divisible by 3.

        int i = 36;
        String result1 = i%2!=0 ? "Odd" : ( i%3==0 ? "Even and divisible by 3" : "Even but not divisible by 3" );

        System.out.println(result1);



        //type java code by using nested ternary
        //write a program to check if a year is leap year or not
        //if the year is divisible by 100 then it must be divisible by 400
        //if a year is not divisible by 100 then it must be divisible by 4

        int y= 1996;

        String result2= (y%100==0) ? (y%400==0 ? "leap" : "Not leap") : (y%4==0 ? "Leap" : "Not Leap");
        System.out.println(result2);
    }
}
