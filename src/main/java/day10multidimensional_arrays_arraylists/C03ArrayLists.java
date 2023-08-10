package day10multidimensional_arrays_arraylists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class C03ArrayLists {
    public static void main(String[] args) {

        /*
        It is impossible to create an Array without declaring the number of elements in it.

         */

        //How to create and ArrayList
        ArrayList<Integer> n = new ArrayList<>();

        //How to print ArrayList
        System.out.println(n);

        //How to add elements int a ArrayList (List)

        n.add(12);
        n.add(5);
        n.add(9);//add(element)

        n.add(1,3);//add() method adds the elements to the given index
        n.add(3,8);
        System.out.println(n);


        ArrayList<Integer> m = new ArrayList<>();
        m.add(99);
        m.add(88);
        m.add(77);
        System.out.println(m);
        n.addAll(m);
        n.addAll(2,m);
        System.out.println(n);

        //Example Create and Integer and change the odd ones to 11

        ArrayList<Integer> p = new ArrayList<>();

        p.add(23);
        p.add(24);
        p.add(12);
        p.add(9);
        p.add(3);

        for(Integer w : p){

            if(w%2!=0){

                p.set(p.indexOf(w),11); //indexOf Returns the index of the first occurrence of the specified element in this list
            }
        }
        System.out.println(p);

        //Example 2 Create a String Arraylist and remove the elements contain a
        ArrayList<String> r = new ArrayList<>();
        r.add("Miami");
        r.add("New york");
        r.add("Tampa");
        r.add("Virginia");
        System.out.println(r);

        for(int i=0; 1<r.size(); i++){//size() Returns the number of elements in this list.

            String city = r.get(i);//get() Returns the element at the specified position in this list.

            if(city.contains("a")){

                r.remove(city);// remove() Removes the first occurrence of the specified element from this list, if it is present.
//                r.remove(i); (we can use this as well) Removes the element at the specified position in this list
                i--;
            }
        }
        System.out.println(r);
    }
}
