package Examples;

import java.util.Scanner;

public class Ex2IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Type code to print Even for even integers and Odd for odd integers
        //Get the number from user.

        System.out.println("Enter a number to check if its Even or Odd...");

        int x = input.nextInt();

        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
