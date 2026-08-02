public class MainOverloading {

    public static void main(String[] args) {
        System.out.println("Original main method");
        main(10);
        main("Java");
    }

    public static void main(int x) {
        System.out.println("Integer main: " + x);
    }

    public static void main(String str) {
        System.out.println("String main: " + str);
    }
}
