class College {

    public String collegeName = "MMMUT";

    public void display() {
        System.out.println("College: " + collegeName);
    }
}

public class PublicDemo {
    public static void main(String[] args) {
        College c = new College();

        System.out.println(c.collegeName);
        c.display();
    }
}
