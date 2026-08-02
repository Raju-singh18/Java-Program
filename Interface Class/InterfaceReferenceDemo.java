interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class InterfaceReferenceDemo {
    public static void main(String[] args) {
        Shape s = new Circle();   // Interface reference
        s.draw();
    }
}
