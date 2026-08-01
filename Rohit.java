package Package1;

public class Rohit {
    private String name;
    private int age;

    public Rohit() {
        System.out.println("Rohit constructor called");
    }

    public void setData(String p, int q) {
        name = p;
        age = q;
    }

    public void display(){
        System.out.println("name is "+name+" age is "+age);
    }
}
