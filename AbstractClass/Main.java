abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

abstract class Dog extends Animal {
    abstract void color();
}

class Labrador extends Dog {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    void color() {
        System.out.println("Color is Golden");
    }
}

public class Main {
    public static void main(String[] args) {
        Labrador obj = new Labrador();
        obj.eat();
        obj.sound();
        obj.color();
    }
}
