import java.util.TreeMap;

public class Demo6 {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(101, "Aditya");
        map.put(102, "Rohit");
        map.put(103, "Raju");

        // System.out.println(map.firstKey());
        // System.out.println(map.firstEntry());
        // System.out.println(map.lastKey());
        // System.out.println(map.lastEntry());

        // System.out.println(map.headMap(103));
        // System.out.println(map.tailMap(102));
        // System.out.println(map.subMap(101, 103));

        // Sorted map
     
        // System.out.println(map.lowerKey(102));
        // System.out.println(map.lowerEntry(102));

        System.out.println(map.descendingMap());
        
    }
}
