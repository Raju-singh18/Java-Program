
public class Demo2 {
    public static void main(String[] args) {
        Animal a = new Dog("Bruno");
        a.makeSound();
    }
}

abstract class Animal {

    String name;
    static String type;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
    // void makeSount(){
    //     System.out.println("Making Sound...");
    // }

    final void sleep() {
        System.out.println("Sleeping");
    }

    private void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Making barking sound");
    }
}

// Abstract classes
// 1. Can not beinstatiated directly
// 2. can contain abstract method (method without implemenation)
// 3. can also contain normal methods.
// 4. Is meatn to be extended

// Questions
// 1. Can abstract classes have constructor ==> yes
// 2. Can abstract classes be final ==> No
// 3. Can abstract class have static methods/variable? ==> Yes
// 4. Can abstract classes private methods? ==? yes but non abstract
// 5. Can abstract classes have final methods? => Yes but non abstract
// 6. Can abstract classes have no abstract methods? ==> Yes
