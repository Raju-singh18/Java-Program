
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        // constructors of hashset/linkedhashset

        Set<Integer> set = new HashSet<>();

        // inital capacity
        Set<Integer> set2 = new HashSet<>(100);

        // capacity, load factor
        Set<Integer> set3 = new HashSet<>(100, 0.8f);

        // Using another collection
        Set<Integer> set4 = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

    }
}
