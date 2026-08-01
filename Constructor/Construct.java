
class Demo{
    int x,y,z;

    Demo(){
        System.out.println("Demo Constructor called");
    }

    Demo(int r){
      z=r;
    }

    Demo(int p, int q){
        x=p;
        y=q;
    }

    void print(){
        System.out.println("x= "+x+" y= "+y);
    }
}

public class Construct {
    int x, y;

    public Construct() {
        System.out.println("Constructor Called");
    }

    public Construct(int p, int q) {
        x = p;
        y = q;
    }

    public void display(){
        System.out.println(x + y);
    }

    public static void main(String[] args) {
     Construct c1 = new Construct();
     Construct c2 = new Construct(5,6);
     c2.display();
     Demo d1 = new Demo(5,77);
    d1.print();
    Demo d2 = new Demo(8);

    }
}
