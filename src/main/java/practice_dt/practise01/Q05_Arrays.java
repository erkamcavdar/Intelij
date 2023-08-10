package practice_dt.practise01;

import java.util.ArrayList;

public class Q05_Arrays {
    public static void main(String[] args) {

        // Create a String array, add 5 elements in it,
        // find the sum of the number of the characters in all Strings.

        String[] countries = {"Turkey", "United States", "Russia", "Sweden", "Japan", "France"};

        int sum = 0;

        for(String w: countries){
            sum += w.length();
        }
        System.out.println(sum);
    }
}
