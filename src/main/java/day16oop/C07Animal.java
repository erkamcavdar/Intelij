package day16oop;

      /*
      1) If a method has a body, it is called "concrete method"
         If a method does not have a body, it is called "abstract method"
      2)To make a method abstract:
         i) remove the method body
         ii) use "abstract" keyword between access modifier and data type
         iii) make the class abstract as well
              because abstract methods can be put into an abstract class only
              Note: Abstract class can have concrete methods
       3) When you create an abstract method, all the concrete child classes must override the method from abstract parent class
          But id parent class has "concrete method" it is not mandatory to override, it is optional
       */


public abstract class C07Animal {

    public abstract void eat();
}
