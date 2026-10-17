import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        // terminal operation

        List<Integer> list = new ArrayList<>(List.of(1, 13, 11, 9));

        // list.stream()
        // .map(x -> x + 1)
        // .forEachOrdered(System.out::println);

        // List<Integer> list2 = list.stream().map(x -> x + 1).toList();
        // System.out.println(list2);

        // List<Integer> list2 = list.stream().map(x -> x +
        // 1).collect(Collectors.toList());
        // list2.add(4);
        // System.out.println(list2);

        // Set<Integer> set = list.stream()
        // .map(x -> x + 1)
        // .collect(Collectors.toSet());
        // System.out.println(set);

        // Optional<Integer> sum = list.stream()
        // .reduce((a,b) -> a+b);

        // System.out.println(sum.get());

        // int sum = list.stream()
        // .reduce(0, (a, b) -> a + b);

        // System.out.println(sum);

        // long num = list.stream()
        // .filter(x -> x > 10)
        // .count();
        // System.out.println(num);

        // Optional<Integer> num = list.stream()
        // .filter(x -> x > 10)
        // .findFirst();
        // System.out.println(num.get());

        // Optional<Integer> num = list.stream()
        // .filter(x -> x > 10)
        // .findAny();
        // System.out.println(num.get());

        // boolean num = list.stream()
        // .filter(x -> x > 10)
        // .anyMatch(x -> x % 2 == 0);

        // System.out.println(num);

        // boolean num = list.stream()
        // .filter(x -> x > 10)
        // .allMatch(x -> x % 2 == 0);
        // System.out.println(num);

        // boolean num = list.stream()
        // .filter(x -> x > 10)
        // .noneMatch(x -> x % 2 == 0);
        // System.out.println(num);

        // OptionalInt max = list.stream()
        // .filter(x -> x > 10)
        // .mapToInt(x -> x )
        // .max();
        // System.out.println(max.getAsInt());

        OptionalDouble avg = list.stream()
                .filter(x -> x > 10)
                .mapToInt(x -> x)
                .average();
        System.out.println(avg.getAsDouble());

        
    }
}

// forEach(), forEachOrdered()