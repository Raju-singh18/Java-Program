
class Nokia1 {
    private int x,y;
    public Nokia1(int p, int q) {
        x=p;
        y=q;
        System.out.println("Nokia1 constructor called");
    }

}

class Nokia2 extends Nokia1 {
    public Nokia2() {
        super(5,6);
        System.out.println("Nokia2 constructor called");
    }
}

class Nokia3 extends Nokia1 {

    public Nokia3() {
        super(8,6);
        System.out.println("Nokia3 constructor called");
    }

}

public class HierarichalDemo {
    public static void main(String[] args) {
        Nokia2 n2 = new Nokia2();
        Nokia3 n3 = new Nokia3();
    }
}
