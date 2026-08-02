interface A {
    int x = 10;      // public static final

    static void f1(){
        System.out.println(x);
    }
}

interface B {
    int x = 20;      // Another constant
}

public class InterfaceVariableDemo implements A, B {

    public static void main(String[] args) {
        System.out.println("A.x = " + A.x);
        System.out.println("B.x = " + B.x);
        A.f1();
    }
}
