import java.io.FileOutputStream;
import java.io.IOException;

public class FileH2 {
    public static void main(String[] args) throws IOException {

        // ! Method -1
        // File f1 = new File("a.txt");
        // FileOutputStream h1 = new FileOutputStream(f1);
        // h1.write('c');
        // h1.close();
        // System.out.println("Data written successfully.");

        // !Method-2
        // String s1 = "Coding Seekho";
        // FileOutputStream f1 = new FileOutputStream("a.txt");
        // int i;
        // char c1[]=s1.toCharArray();
        // for(i=0; i<c1.length; i++){
        // f1.write(c1[i]);
        // }
        // f1.close();
        // System.out.println("Data written successfully.");

        // ! Append data
        String s1 = "Institute";
        FileOutputStream f1 = new FileOutputStream("a.txt", true);
        int i;
        char c1[] = s1.toCharArray();
        for (i = 0; i < c1.length; i++) {
            f1.write(c1[i]);
        }
        f1.close();
        System.out.println("Data Append successfully.");
    }
}
