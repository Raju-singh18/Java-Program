import java.util.*;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>(List.of(1, 13, 11, 9, 14));

        List<String> list = new ArrayList<>(List.of("AA", "BBB", "CCCC", "DD",
                "EEE"));

        // Map<Integer, String> mp = list.stream()
        // .collect(Collectors.toMap(
        // x -> x.length(),
        // x -> x
        // ));

        // System.out.println(mp);

        // Map<Integer, List<String>> mp = list.stream()
        // .collect(Collectors.groupingBy(
        // x -> x.length()));
        // System.out.println(mp);

        // Map<Boolean, List<Integer>> mp = list.stream()
        // .collect(Collectors.partitioningBy(
        // x -> x%2==0));

        // System.out.println(mp);

        // Map<Integer, List<String>> mp = list.stream()
        // .collect(Collectors.groupingBy(
        // x -> x.length(),
        // Collectors.mapping(
        // x -> x.toLowerCase(), Collectors.toList())));

        // System.out.println(mp);

        String result = list.stream()
                .collect(Collectors.joining("-"));

        System.out.println(result);

    }
}

// toMap(), toSet(), toList()

// groupingBy() -> mapping()

// partitioningBy()
// joining()
