package day10multidimensional_arrays_arraylists;

import java.sql.SQLOutput;
import java.util.Arrays;

public class C02MultidimensionalArrays {

    public static void main(String[] args) {

        //how to create multi dimesnsional array

        int[][] a = new int[3][2];


        //how to print multidimensional array

        System.out.println(Arrays.deepToString(a));

        //hot to add elements

        a[0][1] = 3;
        a[0][0] = 2;
        a[1][0] = 5;
        a[1][1] = 6;
        a[2][0] = 7;
        a[2][1] = 9;
        System.out.println(Arrays.deepToString(a));

        //Example1: Type code to find the total number of elements in a multidimensional array

        String[][] b = { {"X", "U"}, {"a", "d", "m"}, {"T", "Y"} };

        int sum = 0;

        for(String[] w : b) {
            sum = sum + w.length;

        }
        System.out.println(sum);
        //Example 2 Print the elements which has "a" in it from multidimensional array

        String[][] c = { {"Java","is"}, {"easy"}, {"to", "learn"}};

        for (String[] w : c){

            for (String u : w) {

                if(u.contains("a")){
                    System.out.println(u);
                }
            }
        }

        // Example 3 Type code to find the maximum and minimum elements in a 2 dimensional integer aray
        //(Interview question)


        int[][] n = { {5,2}, {14,9}, {-7},};

        int max = n[0][0];
        int min = n[0][0];


        for(int[] w : n){

            for(int u : w){
                max = Math.max(u, max);
                min = Math.min(u, min);
            }
        }
        System.out.println(max);
        System.out.println(min);

        //Example 4 Type code to convert a multidimensional array to a one dimensional array

        int[][] p = { {5,2}, {14,9}, {-7},};

        int ln = 0;

        for(int[] w : p){
            ln = ln + w.length;


        }
        int[] r = new int[ln];

        int idx = 0;

        for(int[] w : p){

            for(int u : w){

                r[idx] = u;

                idx++;
            }
        }
        System.out.println(Arrays.toString(r));
    }
}
