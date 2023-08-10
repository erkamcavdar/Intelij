package day15oop;

       /*
          1)To have specific implementations for the child classes we use "Method Overriding"
          2)In "Method Overriding", we change the method body.
            In "Method Overriding", wedo not touch method name, method parameters.
            Method name and method parameters are called "Method Signature so In "Method Overriding
        */

public class C07Animal {

    public void eat(){
        System.out.println("Animals eat...");
    }
    public int getWeight(){
        return 12;
    }
    public C07Animal create(){
        return new C07Animal();
    }
}
