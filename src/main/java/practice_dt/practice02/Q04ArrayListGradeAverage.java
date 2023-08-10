package practice_dt.practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04ArrayListGradeAverage {

    /*
    Get as many grades as a teacher wants to enter and find the number of students pass the average.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> examGradeList = new ArrayList<>();

        do{
            System.out.println("Enter the grade");
            int grades = scan.nextInt();
            examGradeList.add(grades);

            System.out.println("Continue: Y/N");
            String condition = scan.next();

            if (condition.equalsIgnoreCase("n")){
                break;
            }

        }while(true);

        System.out.println("Exam Grade List = " + examGradeList);

        //Calculate the average

        double sum = 0;
        for (int w : examGradeList){
            sum += w;
        }

        double average = sum/examGradeList.size(); // 179/3
        System.out.println("Average = "+ average);

        //calculate number of students above average.

        int numOfStdAboveAvg = 0;

        for(int w : examGradeList){
            if(w<=average){
                numOfStdAboveAvg++;
            }
        }
        System.out.println("numOfStdAboveAvg = "+ numOfStdAboveAvg);





    }
}
