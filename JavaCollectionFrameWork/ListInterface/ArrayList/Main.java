import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // ArrayList-specific method
        list.ensureCapacity(20);

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original: " + list);

        // Create a shallow copy
        ArrayList<Integer> copy =
                (ArrayList<Integer>) list.clone();

        System.out.println("Copy: " + copy);

        // Reduce internal capacity
        list.trimToSize();
    }
}