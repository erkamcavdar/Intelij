package day10multidimensional_arrays_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C04ArrayLists {
    public static void main(String[] args) {


        //Example create a character list which has repeated elements then remove duplicates
        //          [J,a,v,a,c] ==> [J,a,v,c]
        List<Character> a = new ArrayList<>();

        a.add('j');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('c');

        List<Character> b = new ArrayList<>();

        for(Character w: a){

            if(!b.contains(w)){

                b.add(w);
            }
        }
        System.out.println(b);


        //Example 4 Find the closest 2 integers in the given list
        //           [20,15,14,11,19] ==>  14-15, 14-20

        List<Integer> p = new ArrayList<>();
        p.add(20);
        p.add(15);
        p.add(14);
        p.add(11);
        p.add(19);
        System.out.println(p);
        //Sort the list element in ascending order
        Collections.sort(p);
        System.out.println(p);

        //Find th minimum difference

        int min = p.get(1) - p.get(0);

        for(int i =1; i<p.size(); i++){

            min = Math.min(min,p.get(i) - p.get(i-1));

        }
        System.out.println(min);

        //Find the element give minimum difference

        for(int i=1; i<p.size(); i++){

            if(p.get(i) - p.get(i-1) == min){
                System.out.println(p.get(i-1) + " and " + p.get(i));
            }
        }
    }
}
