package day15oop;

import day06string_manipulations_loops.C07ForLoops;

public class C09Dog extends C08Mammal{


    @Override // @Override Annotation checks "Override" rules in our code
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public int getWeight() {
        return 6;
    }

    @Override
    public C09Dog create() {
        return new C09Dog();
    }
}
