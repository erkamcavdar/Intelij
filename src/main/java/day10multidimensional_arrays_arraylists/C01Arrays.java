package day10multidimensional_arrays_arraylists;

import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {


        String s ="Learn Java earn Money.";

        String[] t =s.split("a");
        System.out.println(Arrays.toString(t)); //[Le, rn j,v, e, rn MOney.]

        //note 2 eaquals() method is used to check if two arrays are same (element and the order are the same or not
        int[] a = new int[3];
        a[0]=2;
        a[1]=5;
        a[2]=1;
        int[] b = new int[3];
        b[0]=2;
        b[1]=5;
        b[2]=1;


        boolean u = Arrays.equals(a, b);
        System.out.println(u);

    }
}
