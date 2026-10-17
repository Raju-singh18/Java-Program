 

public class Demo2 {
    public static void main(String[] args) {
        // Calculator c = new Addition();
        // int sum = c.calculate(5, 5);
        // System.out.println(sum);

        // print(5,4,c);

        // print(5,4,(a,b)->a+b);

        Calculator c = (a,b)-> a+b;
        print(5,4,c);
    }

    public static void print(int a, int b, Calculator c){
        System.out.println(c.calculate(a,b));
    }
}

@FunctionalInterface 
interface Calculator{
    int calculate(int a, int b);
}

// class Addition implements Calculator{
//     @Override 
//     public int calculate(int a, int b){
//         return a+b;
//     }
// }


