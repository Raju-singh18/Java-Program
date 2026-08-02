interface A {
    int x = 10;   // public static final
}

class InterfaceStaticVariableDemo implements A {

    public static void main(String[] args) {

        System.out.println(x);     // Through inheritance
        System.out.println(A.x);   // Recommended
    }
}
