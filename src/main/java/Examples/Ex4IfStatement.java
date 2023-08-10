package Examples;

import java.util.Scanner;

public class Ex4IfStatement {
    public static void main(String[] args) {


        //Type java code by using if-else if() statement
        //A school has rules for grading system:
        // 1. below 50 - D  2. 50 to 59 - C   3. 60 - 80 - B   4. 80 - 100 - A
        //Ask user to enter marks and print the corresponding grade

        Scanner input = new Scanner(System.in);

        System.out.println("Enter mark...");

        int mark = input.nextInt();

        if(mark<0){
            System.out.println("Negative marks are not valid...");
        }else if(mark<=50){
            System.out.println("D");
        }else if(mark<60){
            System.out.println("C");
        }else if(mark<80){
            System.out.println("B");
        }else if(mark<101){
            System.out.println("A");
        }
    }
}
