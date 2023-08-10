package Examples;

import java.util.Scanner;

public class Ex1IfStatement {
    public static void main(String[] args) {

        //Type code to decide a day name is week day or weekend day

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day name...");

        String dayName = input.next();

        if(dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("Saturday")){
            System.out.println("Weekend Day");
        }else if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday")){
            System.out.println("Week Day");
        }else{
            System.out.println("Invalid");
        }






    }
}
