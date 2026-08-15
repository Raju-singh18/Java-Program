// ! Local Class

public class LocalClass {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.greet();

    }
}

// ! Effective final variable

class Outer {

    // static private int x=4;

    void greet() {
        // System.out.println("Hello");

        class Local {

            int y = 5;
            // y++;

            void sayHello() {
                System.out.println("Hello");
                // System.out.println(x);
                System.out.println(y);
            }

            void sayHi() {
                System.out.println("Hi");
            }
        }

        Local local = new Local();
        local.sayHello();
        local.sayHi();
    }
}

// Constructor
// Method
// If
// Loop
// Static block
