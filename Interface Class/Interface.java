interface i1 {
    int x = 6;

    void fun1();

    static void fun2() {
        System.out.println(x);
    }
}

interface i2 extends i1 {
    int y = 2;

    void fun3();
}

class C1 implements i2 {

    @Override
    public void fun1() {
        System.out.println("fun1()");
    }

    @Override
    public void fun3() {
        System.out.println("fun3()");
    }
}

public class Interface {
    public static void main(String[] args) {
        C1 c = new C1();

        c.fun1();
        c.fun3();

        i1.fun2();    // Correct way
    }
}
