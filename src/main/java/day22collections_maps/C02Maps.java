package day22collections_maps;

import java.util.*;

public class C02Maps {
    public static void main(String[] args) {


        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Tom",76);
        stdAges.put("Angelina",55);
        stdAges.put("Brad",61);
        stdAges.put("Leo",43);
        stdAges.put("Linda",23);
        stdAges.put("Brad",34);//If you use same key, the value will be "overwritten"
        System.out.println(stdAges); //{Tom=76, Angelina=55, Leo=43, Brad=34, Linda=23}


        //How to work with just keys
        //Example 1: Get the total number of characters in student names
        Set<String>keys = stdAges.keySet();
        System.out.println(keys); //[Tom, Angelina, Leo, Brad, Linda]

        int numOfChars = 0;

        for(String w:keys){
            numOfChars = numOfChars + w.length();
        }
        System.out.println(numOfChars);

        //How to work with values
        //Example 2: Find average age of the students

        Collection<Integer> ages = stdAges.values();
        System.out.println(ages); //[76, 55, 43, 34, 23]

        double sumOfAges = 0;
        double avgAge = 0;

        for(Integer w:ages){

            sumOfAges = sumOfAges +w;
        }
        System.out.println("Average age is " + sumOfAges/ages.size()); //Average age is 46.2

        //How to loop with entries
        //Find the sum of the number of characters and the age for every entry.

        Set<Map.Entry<String,Integer>> entries = stdAges.entrySet();

        for(Map.Entry<String,Integer> w: entries){

            int sum = w.getKey().length() + w.getValue();
            System.out.println("For " + w.getKey() + ": " + sum);
        }
        int age1 = stdAges.get("Angelina");
        System.out.println(age1);

        stdAges.putIfAbsent("Angelina", 67);//{Tom=76, Angelina=55, Leo=43, Brad=34, Linda=23}
        System.out.println(stdAges);

        stdAges.putIfAbsent("Carl", 16);//{Tom=76, Angelina=55, Leo=43, Carl=16, Brad=34, Linda=23}
        System.out.println(stdAges);

        stdAges.replace("Angelina", 67);// to update values by using keys use replace method, not put method
        System.out.println(stdAges);//{Tom=76, Angelina=67, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.replace("Angelina", 44,100);
        System.out.println(stdAges);//{Tom=76, Angelina=67, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.replace("Angelina", 67,100);
        System.out.println(stdAges);//{Tom=76, Angelina=100, Leo=43, Carl=16, Brad=34, Linda=23}

        boolean r1 = stdAges.containsKey("Brad");
        System.out.println(r1);//true

        boolean r2 = stdAges.containsKey("XXXX");
        System.out.println(r2);//false

        boolean r3 = stdAges.containsValue(51);
        System.out.println(r3);//false

        boolean r4 = stdAges.containsValue(76);
        System.out.println(r4);//true

        System.out.println(stdAges.getOrDefault("Tom", 0));//76
        System.out.println(stdAges.getOrDefault("Xyz", 0));//0

        stdAges.remove("Tom");
        System.out.println(stdAges);//{Angelina=100, Leo=43, Carl=16, Brad=34, Linda=23}

        stdAges.remove("Leo",45);
        System.out.println(stdAges);//{Angelina=100, Leo=43, Carl=16, Brad=34, Linda=23}







    }
}
