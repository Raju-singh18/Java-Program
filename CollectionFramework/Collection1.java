import java.util.ArrayList;
import java.util.Iterator;

class Collection1 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList(5);
        l1.add("A");
        l1.add("B");
        l1.add("C");
        System.out.println(l1);
        l1.add(2,"G");
        System.out.println(l1);

        Iterator g1 = l1.iterator();
        // while(g1.hasNext()){
        //     System.out.println(g1.next());
        // }

        while(g1.hasNext()){
            String s1 = (String)g1.next();
            if(s1 != "G"){
                System.out.println(s1);
            }
        }
    }
}
 