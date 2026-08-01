
class Student {
    private int age = 22;

    public void display() {
        System.out.println("Age = " + age);
    }
}

public class TestPrivate {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();

        // s.age = 25; // Error
    }
}
