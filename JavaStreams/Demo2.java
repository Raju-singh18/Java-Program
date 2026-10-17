import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(11,34,1,13,4,13,24));

        // Intermediate Functions
        list.stream()
        .filter(x -> x>10)
        .map(x-> x * 2)
        .peek(System.out :: println)
        .sorted((a,b)->b-a)
        .distinct()
        .forEach(System.out::println);

        // List<List<Integer>> list2 = List.of(
        //     List.of(1,2),
        //     List.of(3,4)
        // );

        // list2.stream()
        //       .flatMap(x -> x.stream())
        //       .map(x -> x*2)
        //       .forEach(System.out :: println);


        // Stream.iterate( 1, x->x+1)
        //       .limit(100)
        //       .skip(5)
        //       .forEach(System.out::println);
    }
}
