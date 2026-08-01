class Nokia1 {
    int x, y;

    void fun1() {
        System.out.println("Parent Function 1 executed");
    }

    void fun2() {
        System.out.println("Parent Function 2 executed");
    }
}

class Nokia2 extends Nokia1 {
    int z;

    void fun3() {
        System.out.println("Child Function 1 executed");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Nokia2 n2 = new Nokia2();
        n2.fun1();
        n2.fun2();
        n2.fun3();

        Nokia1 n1 = new Nokia1();
        n1.fun1();
        n1.fun2();
    }
}
