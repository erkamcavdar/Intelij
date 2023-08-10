package day14constructors_oop;

public class C07AnimalRunner {

    public static void main(String[] args) {

        C04Dog myDog = new C04Dog();

        myDog.eat();
        myDog.drink();
        myDog.bark();
        System.out.println(myDog.age);
        System.out.println(myDog.name);

        C05Cat myCat = new C05Cat();
        myCat.eat();
        myCat.drink();
        myCat.meow();
        System.out.println();

        C06Bird myBird = new C06Bird();
        myBird.eat();
        myBird.drink();
        myBird.tweet();

    }
}
