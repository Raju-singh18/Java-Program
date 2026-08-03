import java.io.IOException;

public class ExceptionH4 {
    static void checkAge(int age) throws IOException {

        if (age < 18) {
            throw new IOException("Age must be 18 or above.");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
