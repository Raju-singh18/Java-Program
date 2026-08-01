class Example{
    private int x,y;
    void f1(int x, int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("x= "+x+" y= "+y);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
       Example e1 = new Example();
       e1.f1(7,25 );
       e1.display(); 
    }
}
