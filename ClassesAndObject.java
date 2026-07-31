class Nokia {
    private int mic;
    private int cam;

    void setValue() {
        mic = 2;
        cam = 40;
    }

    void display() {
        System.out.println(mic);
        System.out.println(cam);
    }
}

public class ClassesAndObject {
    public static void main(String[] args) {
     Nokia n = new Nokia();
     n.display();
     n.setValue();
     n.display();
    }
}
