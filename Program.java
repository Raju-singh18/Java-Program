
class Demo{
    private static int x;

    void f1(){
        x=5;
        System.out.println(x);
    }

    static void f2(){
        x=10;
        System.out.println(x);
    }
}

public class Program {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.f1();
        Demo.f2();
        d1.f1();
    }
}
