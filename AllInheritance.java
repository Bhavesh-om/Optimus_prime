class Animal{
    void eat(){
        System.out.println("Animals eats");
    }
}
//single inheritance
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

// multilevel
class Puppy  extends Dog{
    void play(){
        System.out.println("Puppy plays");
    }
}

// hierarchical
class Cat extends Animal{
    void meow(){
        System.out.println("Cat meows");
    }
}

//multiple inheritances
interface Flyable{
    void fly();
}
interface Swimable{
    void swim();
}

class Duck implements Flyable, Swimable{
    public void fly(){
        System.out.println("Duck flies");
    }
    public void swim() {
        System.out.println("Duck Swims");
    }
}
public class AllInheritance{
    public static void main(String[] args) {

        System.out.println("Single");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("Multilevel Inheritance");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        System.out.println("Hierarchical");
        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println("Multiple");
        Duck dk = new Duck();
        dk.fly();
        dk.swim();
    }
}
