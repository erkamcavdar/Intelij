package practice_dt.practise01;

import java.util.Scanner;

public class Q02_Scanner {
    public static void main(String[] args) {


        /*
        Task: Ask user to enter his/her first name, age, height, and weight then print them on the console in this way:
              First Name: …..
              Last Name: …..
              Age: …….
              Height: …….
              Weight: ……..
              Note: Use only on “System.out.println();”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name please");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name please");
        String lastName = scan.nextLine();

        System.out.println("Enter your age please");
        int age = scan.nextByte();

        System.out.println("Enter your height please");
        double height = scan.nextDouble();

        System.out.println("Enter weight name please");
        double weight = scan.nextDouble();

        System.out.println("First name : " + firstName +  "\nLast name : " + lastName + "\nAge : " + age + "\nHeight : " + height + "\nWeight : " + weight);



    }
}
