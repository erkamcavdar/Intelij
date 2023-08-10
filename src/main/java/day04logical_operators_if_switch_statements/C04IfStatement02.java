package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C04IfStatement02 {
    public static void main(String[] args) {

        //Example 3: Ask user to enter initials of the day names on the console.
        // S ==> Sunday,Saturday      T ==> Tuesday, Thursday
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial of the day name...");
        char dayNameInitials = input.next().charAt(0); // To get char from user use input.next().charAt(0);

        if(dayNameInitials=='S' || dayNameInitials=='s'){
            System.out.println("Sunday, Saturday");
        }else if(dayNameInitials=='T' || dayNameInitials=='t'){
            System.out.println("Tuesday, Thursday");
        }else if(dayNameInitials=='M' || dayNameInitials=='m'){
            System.out.println("Monday");
        }else if(dayNameInitials=='W' || dayNameInitials=='w'){
            System.out.println("Wednesday");
        }else if(dayNameInitials=='F' || dayNameInitials=='f'){
            System.out.println("Friday");
        }else{
            System.out.println("Invalid day name initial");
        }
    }
}
