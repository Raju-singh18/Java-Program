
import java.util.*;
import java.util.function.*;

public class PredicateInterface {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;

        // System.out.println(isEven.test(8));  // true
        // System.out.println(isEven.test(7));  // false

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));
        // for(Integer i: list){
        //     System.out.println(i);
        // }

        // list.forEach(x->System.out.println(x));

        list.forEach(System.out::println);
         

    }
}
