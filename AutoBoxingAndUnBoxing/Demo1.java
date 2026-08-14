
public class Demo1 {
    public static void main(String[] args) {
        // int x = 100;
        // int y=100;
        // System.out.println(x==y); //true

        Integer c = 100;
        Integer d = 100;
        System.out.println(c == d); // true becuse in range of -127 to 127 is already store in heap in java

        Integer a = 200;
        Integer b = 200;
        // a==b // If a and b points to same references
        System.out.println(a == b); // false

        System.out.println(a.intValue() == b.intValue());
        System.out.println(a.equals(b));
    }
}
