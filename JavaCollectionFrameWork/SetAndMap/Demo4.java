import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Aditya");
        map.put(102, "Rohit");
        map.put(103, "Raju");

        // System.out.println(map.size());
        // System.out.println(map.isEmpty());

        // System.out.println(map.containsKey(102));
        // System.out.println(map.containsValue("Aditya"));

        // System.out.println(map.get(102));

        // System.out.println(map.put(104, "Rohan"));
        // System.out.println(map.put(103, "Mohit"));
        // System.out.println(map.get(103));

        // map.remove(102)

        // Map<Integer, String> map2 = new HashMap<>();
        // map.putAll(map2);

        // map.clear();

        // Set<Integer> set = map.keySet();
        // System.out.println(set);

        // Collection<String> c = map.values();
        // System.out.println(c);

        // Set<Map.Entry<Integer, String>> entries = map.entrySet();
        // System.out.println(entries);

        // System.out.println(map.getOrDefault(105,"Unknown"));

        // System.out.println(map.putIfAbsent(103, "Abhay"));

        // map.remove(101, "Abhay");

        // map.replace(101, "Sonu");
        // map.replace(101, "Aditya", "Sonu");

        // Set<Map.Entry<Integer, String>> entries = map.entrySet();

        // for (Map.Entry<Integer, String> entry : entries) {
        //     Integer key = entry.getKey();
        //     String value = entry.getValue();
        //     System.out.println(key + " , " + value);
        // }


        // immutable collection
        Map<Integer, String> map2 = Map.of(101,"Aditya",102,"Rohit",103,"Raju");
        // map2.put(104, "Rohan"); // error
        
    }
}

// put() --> always replaces
// putIfAbsent() --> does not replace existing value
