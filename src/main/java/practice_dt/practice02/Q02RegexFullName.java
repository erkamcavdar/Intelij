package practice_dt.practice02;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Q02RegexFullName {
    /*
    Divide the 2-word name and surname you will receive from the user into separate words.
    Print the name and surname on the screen separately.

    EXAMPLE:
    INPUT: John Doe

    OUTPUT:
    First name: John
    Surname: Doe
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name and last name with space between");
        String fullName = scan.nextLine().replaceAll("\\s+"," ").trim().replaceAll("[^A-Za-z ]", "");
        // \\s+ = means one space and more if there are
        System.out.println("Full Name = " + fullName);
        String firstName = fullName.split(" ")[0].substring(0,1).toUpperCase() + fullName.split(" ")[0].substring(1).toLowerCase();
        String surName = fullName.split(" ")[1].substring(0,1).toUpperCase() + fullName.split(" ")[1].substring(1).toLowerCase();
        System.out.println("First Name = " +firstName + "\nSurName = " + surName);









    }

}
