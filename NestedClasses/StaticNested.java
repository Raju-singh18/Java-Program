
public class StaticNested {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // Outer.Inner inner = new Outer.Inner();
        // inner.fun(outer);

        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun();
    }
}

class Outer {

    // static int x = 4;
    private static int x = 4;
    int y;

    static class Inner {

        private String name;
        static int number;

        // void fun(Outer outer) {
        // System.out.println(x);
        // System.out.println(outer.y);
        // }

        Outer outer;

        public Inner(Outer outer) {
            this.outer = outer;
        }

        void fun() {
            System.out.println(x);
            System.out.println(outer.y);
        }

        static void fun2(){

        }

    }
}


class BankAccount{
    private static class InterestCalculator{
        static double claculateYearly(double principal, double rate){
            return principal*rate;
        }
    }

    public double computeInterest(double principal){
         return InterestCalculator.claculateYearly(principal,0.09);
    }

}

// Usecases of static nested classes
//  1. As helper class for any outer classes
//  2. Builder Design pattern
//  3. If you want to have static methods inside a nested class.
//  4. Request/Response DTO
