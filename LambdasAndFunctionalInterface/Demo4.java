
import java.util.function.Predicate;



public class Demo4 {
    public static void main(String[] args) {
        Predicate<Integer> isGreater = x -> x > 100;
        Predicate<Integer> isEven = x -> x%2 == 0;
        
        // and() -> &&
        // System.out.println(isGreater.and(isEven).test(102));

        // or() -> ||
        System.out.println(isGreater.or(isEven).test(102));

        // negate() --> !
        Predicate<Integer> isOdd = isEven.negate();
        System.out.println(isOdd.test(55));
        

    }
}
