class Calculator{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Display {

    void show(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    void show(String b, int a) {
        System.out.println("String: " + b + ", Integer: " + a);
    }
}

public class FunctionOverloading {
    public static void main(String[] args) {
       Calculator obj = new Calculator();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30)); 
        System.out.println(obj.add(5.5, 10.2));

        Display ob = new Display();

        ob.show(100, "Java");
        ob.show("Programming", 200);
    }
}
