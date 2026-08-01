class Person {

    protected String name = "Raju";

    protected void display() {
        System.out.println("Name: " + name);
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
       Person p = new Person();

        System.out.println(p.name);
        p.display(); 
    }
}
