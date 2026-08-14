
public class Demo {
    public static void main(String[] args) {
        // AutoBoxing
        // int x = 10;
        // Integer y = x; // autoboxing
        // // Integer y = new Integer(x); // Deprecated
        // // Integer y = Integer.valueOf(x);

        // System.out.println(x);
        // System.out.println(y); // unboxing

        // // UnBoxing
        // // Integer a = new Integer(20); 
        // // Integer a = Integer.valueOf(20);
        // Integer a = 20; //Autoboxing
        // int b = a;  // unboxing
        // // int b = a.intValue();

        // System.out.println(a);
        // System.out.println(b);

        // int x=50;
        // printInteger(x);

        // Integer a=10;
        // Integer b = 20;
        // int sum = a+b;
        // System.out.println(sum);

        Integer x=null;
        int y = x;
        System.out.println(y); // null pointer exception

    }

    static void printInteger(Integer x){
        System.out.println(x);
    }
}


// ! 1. Assignment
// ! 2. Methods call
// ! 3. Arithmetic operations
