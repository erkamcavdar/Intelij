package Examples;

import java.util.Scanner;

public class Ex3IfStatement {
    public static void main(String[] args) {

        //type a code if a number is Positive Negative or Odd
        //Get data from User
        //To get data from user we use Scanner classes

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number...");

        double x = input.nextDouble();

        if(x>0){
            System.out.println("Positive");
        }else if(x<0){
            System.out.println("Negative");
        }else if(x==0){
            System.out.println("Neutral");
        }else{
            System.out.println("Invalid");
        }
    }
}
