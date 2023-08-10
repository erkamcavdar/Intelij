package JavaQuestionBank;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Q9Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter date of birth to calculate age");
        int dob = input.nextInt();

        int age = calculateAge(dob);
        System.out.println(age);
    }
    public static int calculateAge(int dateOfBirth){
        return LocalDate.now().getYear()-dateOfBirth;

    }
}
