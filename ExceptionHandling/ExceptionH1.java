
public class ExceptionH1 {
    public static void main(String[] args) {
        String s1 = null;
        try {
            System.out.println(s1.length());
            System.out.println(5 / 0);
        } catch (NullPointerException n1) {

            System.out.println(n1.getMessage());
        }
        catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println("A");
        System.out.println("B");
    }
}
