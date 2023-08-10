package day20exceptions;

import java.util.ArrayList;
import java.util.List;

public class NameRunner {
    public static void main(String[] args) {
        System.out.println(addNames("Mary"));
        System.out.println(addNames("mary"));

    }

    //Create a method to add names into a list

    public static List<String> addNames(String name) throws IllegalArgumentsException{
        List<String> nameList = new ArrayList<>(); // empty list to store names

        if(name.charAt(0) > 64 && name.charAt(0) < 91){ // returns A-Z
            nameList.add(name);
        }else {
            throw new IllegalArgumentsException("Name should start with uppercase letter..");
        }


        return nameList;
    }







}
