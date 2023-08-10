package practice_dt.practise01;

import java.util.Scanner;

public class Q03_Scanner {
    public static void main(String[] args) {

        //type a code that calculates th hypotenuse.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of first leg of the right triangle");
        double a = scan.nextDouble();

        System.out.println("Enter the length of second leg of the right triangle");
        double b = scan.nextDouble();

        double c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hypotenus : " + c);
    }
}
