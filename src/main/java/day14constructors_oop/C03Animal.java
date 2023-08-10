package day14constructors_oop;

             /*
               1)We create a parent class and put the common methods into the parent class to
                   i) prevent repetition
                   ii) make maintenance easy
                   iii) make updates easy
                   iv) save time in code typing
                   v) make the classes as possible as small to make them work faster
                2) To make a class use methods from another class, we should create "parent-child relationship" between them
                   To create "parent-child relationship" we use "extends" keyword from "child class" to "parent class"
                3) "public" and "protected" methods can be used by "child classes" without any restriction.
                   "default" methods can be used if the object and the parent class are in the same package.
                   "private" methods cannot be inherited by child classes.
                4) If a child class uses class members from parent class it is called "inheritance"
                5) Object-Oriented Programming Concept has 4 Principals
                       a)Inheritance   b) Encapsulation  c) Polymorphism  d)Abstraction
                6) There are different types of Inheritance
                       i)Multiple Inheritance: Java does not support multiple inheritance
                                               Java supports "Single Inheritance
                       ii) Multilevel Inheritance: Java supports "Multilevel Inheritance"
                       iii)Hierarchical Inheritance: It is the combination of "Multilevel Inheritance and "Single Inheritance"



             */


public class C03Animal {

    public int age;
    public String name;


    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

}
