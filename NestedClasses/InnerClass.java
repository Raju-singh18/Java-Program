public class InnerClass {
    public static void main(String[] args) {
        // Outer outer = new Outer();
        // // System.out.println(outer.x);
        // Outer.Inner inner = outer.new Inner();
        // inner.fun();

        Outer.Inner inner = new Outer().new Inner();
        inner.fun();

        inner.fun2();
        Outer.Inner.fun2();

    }
}

class Outer {
    int x = 10;

     

    class Inner{

        // Outer outer;
        
        // int x=20;
        void fun() {
            System.out.println(x);
            // System.out.println(Outer.this.x);
        }

        // Java 16 above
       static void fun2(){
            System.out.println("Hello");
        }
    }
}
