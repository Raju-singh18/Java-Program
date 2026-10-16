import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        // Treeset
        TreeSet<Integer> set = new TreeSet<>();

        // Set<Integer> set2 = new TreeSet<>(List.of(2,5,7,8,9));

        set.add(80);
        set.add(23);
        set.add(10);
        set.add(90);
        set.add(50);

        // ! SortestSet Interface --> O(log N)
        // System.out.println(set.first());
        // System.out.println(set.last());

        // toElement is exlusive
        // System.out.println(set.headSet(80));
       
        // fromElement is inclusive
        // System.out.println(set.tailSet(80));
       
        // fromElement is inclusive and toElement is Excusive
        // System.out.println(set.subSet(23, 80));

        // ! Navigable Set
        // number smaller than 80
        // System.out.println(set.lower(80));

        // number element less than or equal to 80
        // System.out.println(set.floor(80));

        // smallest no greater than 80
        // System.out.println(set.higher(80));
        
        // smallest no greater than or eqaul to 80
        //  System.out.println(set.ceiling(80));

        // System.out.println(set.pollFirst());
        // System.out.println(set.pollLast());

        // System.out.println(set.descendingSet());

        // Iterator<Integer> it = set.descendingIterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        System.out.println(set.headSet(80, true));
        System.out.println(set.tailSet(80,false));
        System.out.println(set.subSet(10,false,80,true));
        
    }

}

// BST --> leftest most node --> smallest
// rightest most node. --> largest
