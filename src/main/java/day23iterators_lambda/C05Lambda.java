package day23iterators_lambda;


import java.util.ArrayList;
import java.util.List;

public class C05Lambda {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvens1(nums);
        System.out.println();
        printEvens2(nums);
        System.out.println();
        printSquareOfOdd(nums);
        System.out.println();
        printCubeOfUniqueElements(nums);
        System.out.println();
    }

    //Example 1: Create a method to print all elements on the console in the same line with a space between them

    //1.Way

    public static void printElements1(List<Integer> list){

        for(Integer w:list){
            System.out.print(w + " ");
        }


    }

    //2.Way
    public static void printElements2(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t + " "));
    }

    //Example 2: Create a method to print even elements on the console in the same line with a space between them

    //1.Way

    public static void printEvens1(List<Integer> list){

        for(Integer w:list){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }
    }

    //2.Way

    public static void printEvens2(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t + " "));
    }

    //Example 3: Create a method to print the square of odd on the console in the same line with a space between them

    public static void printSquareOfOdd(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " "));

    }

    //Example 4: Create a method to print the qube of unique elements on the console in the same line with a space between them

    public static void printCubeOfUniqueElements(List<Integer> list){

        list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t+ " "));

    }



}
