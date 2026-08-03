
import java.io.IOException;

public class ExampleH5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("A");
        try {
            throw new IOException("Printer Not Found");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
