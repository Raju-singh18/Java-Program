class Example{
    int x,y;
    void f1(int x, int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("x= "+x+" y= "+y);
    }
}

class Example1 extends Example{
    int x,y;
    void f2(int x, int y,int p, int q){
        this.x=p;
        this.y=q;
        super.x=x;
        super.y=y;
    }
    
    void display1(){
        System.out.println(x);
        System.out.println(y);
    }
}

public class SuperDemo {
     public static void main(String[] args) {
         Example1 e1 = new Example1();
         e1.display();
         e1.f2(10, 8,5,5);
         e1.display();
         e1.display1();
     }
}
