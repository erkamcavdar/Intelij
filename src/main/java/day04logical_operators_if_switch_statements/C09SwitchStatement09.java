package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C09SwitchStatement09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter month name");
        String monthName = input.next().toLowerCase();

        switch(monthName){

            case "january":
                System.out.println("January");
            case "february":
                System.out.println("February");
            case "arch":
                System.out.println("March");
            case "april":
                System.out.println("April");
            case "may":
                System.out.println("May");
            case "june":
                System.out.println("June");
            case "july":
                System.out.println("July");
            case "august":
                System.out.println("August");
            case "september":
                System.out.println("September");
            case "october":
                System.out.println("October");
            case "november":
                System.out.println("November");
            case "december":
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month name");
        }

    }

}
