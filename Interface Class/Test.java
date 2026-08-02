interface A {
    int x = 10;
}

interface B {
    int x = 20;
}

class Test implements A, B {

    public static void main(String[] args) {

        // System.out.println(x);   // Compile-time Error

        System.out.println(A.x);
        System.out.println(B.x);
    }
}
