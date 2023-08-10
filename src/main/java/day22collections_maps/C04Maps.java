package day22collections_maps;

import java.util.Hashtable;
import java.util.TreeMap;

public class C04Maps {
    public static void main(String[] args) {

        Hashtable<Integer, String> define = new Hashtable<>();

        define.put(1,"Baby");
        define.put(15,"Teenage");
        define.put(67,"Senior");
        //define.put(67, null);//NullPointerException
        //define.put(null , "Adult");//NullPointerException
        System.out.println(define); //{15=Teenage, 67=Senior, 1=Baby}

        TreeMap<String, Integer> countries = new TreeMap<>();

        countries.put("Albania",3);
        countries.put("Germany", 83);
        countries.put("USA",400);
        countries.put("Belgium",12);
        System.out.println(countries); //{Albania=3, Belgium=12, Germany=83, USA=400}


        //countries.put(null, 12);
        //System.out.println(countries); //NullPointerException

        countries.put("Turkey", null);
        System.out.println(countries);//{Albania=3, Belgium=12, Germany=83, Turkey=null, USA=400}






        //Homework: Create a method to display the number of occurrences of letters in a sentence
        //          Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1
    }
}
