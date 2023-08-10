package day18oop_static_keyword;

    /*
      1) Child    -   Parent
         Class        Interface ==> implements
         Class        Class ==> extends
       Interface      Interface ==> extends
       Interface      Class ==> This is impossible because a class can not be the "parent" of an interface

         Common Interview Question

      2) What is the difference between "abstract class" and "interface" (Common Interview QUESTION)
         i)Methods: Abstract class can have "abstract" and "concrete" methods
                    Interfaces can have just "abstract" methods.
                    Note: By using "static" or "default" keywords we can create "concrete" methods in an interface.
                    What is the difference between static methods and default methods?
                    "static methods" are static that is why we can access then by using interface name
                    "default methods" need object to be accessed.

                    All methods in an interface are public, but methods in an abstract class can use any access modifier.

         ii)Variables: All variables in an interface are public, static, final, but an abstract class can have any type of variable
         iii)Interface: Java does not support multiple inheritance through classes, but JAVA supports multiple inheritance through interfaces
         iv)Usage: When we need multiple parents contains the mandatory functionalities we use interfaces
                   If a single parent is enough with mandatory and optional functionalities we use abstract class

         For example, you need many browsers to use in your application. Every browser has common mandatory functionalities like get() method
         We put common functionality int a "Browser" interface than make "Chrome", "Safari", etc. classes of Browser interface so get() method
         will be mandatory for the "Chrome", "Safari". etc. classes
     */

public interface C01Animal extends C00Creature {

    public abstract int eat(String foodName);

    char NAME = 'A'; // pubic, static, final





}
