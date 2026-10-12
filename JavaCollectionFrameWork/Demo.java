import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        // Iterator<Integer> it=list.iterator();

        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

        // List<Integer> list = new LinkedList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        // Iterator<Integer> it=list.iterator();

        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

        // Collection<Integer> c = new ArrayList<>();
        // c.add(10);
        // c.add(20);
        // c.add(30);
        // c.add(40);
        // c.add(50);

        // Iterator<Integer> it = c.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }


        // Collection<Integer> c = new HashSet<>();
        // c.add(10);
        // c.add(20);
        // c.add(30);
        // c.add(40);
        // c.add(50);

        // Iterator<Integer> it = c.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        
        // Collection<Integer> c = new ArrayDeque<>();
        // c.add(10);
        // c.add(20);
        // c.add(30);
        // c.add(40);
        // c.add(50);

        // Iterator<Integer> it = c.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }


        Collection<Integer> c = new TreeSet<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        Iterator<Integer> it = c.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
