
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
     
        set.add("Aditya");
        set.add("Raohit");
        set.add("Raju");

        System.out.println(set.contains("Aditya"));

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Aditya");
        map.put(102, "Rohit");
        map.put(103, "Raju");

        System.out.println(map.containsKey(101));
        System.out.println(map.get(102));
    }
}
