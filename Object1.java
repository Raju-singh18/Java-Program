
class Mahesh{
    int x;
    int y;
    void fun1(){
    System.out.println("fun1");
    }
    void fun2(){
    System.out.println("fun2");
    }
}

public class Object1 {
    public static void main(String[] args) {
        Mahesh m1 = new Mahesh();
        Mahesh m2 = new Mahesh();
        m1.fun1();
        m1.fun2();
        m1.x=5;
        m2.y=4;
        System.out.println(m1.x);
        System.out.println(m2.x);
    }
}
