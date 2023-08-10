package day16oop;

   /*
      1) The method in child class is called Overriding Method; the method in Parent class
      is called Overridden Method
      Overriding Methods (Child class) cannot use narrower access modifiers than those
      of Overridden Methods (Parent class)
                   Overridden Methods => default
                   Overriding Methods => default, protected, public
                   Overridden Methods => protected
                   Overriding Methods => protected, public
                   Overridden Methods => private
                   Overriding Methods => "private method" cannot be overridden
      Polymorphism = Method Overloading + Method Overriding
      2) What's the difference between Method Overloading and Method Overriding?
         i) "Method Overloading" occurs in the same class while "Method Overriding" needs
            multiple classes
         ii) "Method Overriding" needs inheritance whereas "Method Overloading" doesn't need this
         iii) "private" methods can be overloaded, but cannot be overridden
         iv) In "Method Overloading", we change the method signature, but we don't change method
             signatures in "Method Overriding"
         v) In "Method Overloading", access modifiers and return types have no role tp play, but
            in "Method Overriding", there are some rules that should be followed regarding them
         vi) In Method Overloading", we change the parameters and make them work with
             different scenarios but in "Method Overriding", we make the methods more specific for
             the child class
         vii) "static methods" can be overloaded, but they can't be overridden
       */

public class C01Animal {
    public void eat(){
        System.out.println("Animals eat...");
    }
}
