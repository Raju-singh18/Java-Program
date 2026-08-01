package Package_1;

public class Amit {
    private int x;
    private int y;

    public Amit() {
        System.out.println("Amit Constructor");
    }

    public void setData(int p, int q){
      x=p;
      y=q;
    }

    public void display(){
     System.out.println(x);
     System.out.println(y);
    }
}
