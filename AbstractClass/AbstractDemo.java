abstract class Demo {
    public int x, y;

    public Demo() {
        System.out.println("Parent Constructor called");
    }

    void fun1() {
        x = 5;
        y = 7;
    }

    abstract void fun2();
}

class Demo1 extends Demo {
    int z;

    public Demo1() {
        System.out.println("Child Constructot called");
    }

    void fun2() {
        System.out.println("function override due to abstract method");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.fun2();
    }
}
