class Student {

    private int id = 101;
    String city = "Delhi"; // Default
    protected String course = "MCA";
    public String name = "Raju";

    public void display() {
        System.out.println(id);
        System.out.println(city);
        System.out.println(course);
        System.out.println(name);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {

        Student s = new Student();

        // System.out.println(s.id); // Error

        System.out.println(s.city);
        System.out.println(s.course);
        System.out.println(s.name);

        s.display();
    }
}
