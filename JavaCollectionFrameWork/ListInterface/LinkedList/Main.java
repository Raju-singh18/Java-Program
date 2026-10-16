
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. Adding elements
        list.add(20);
        list.add(30);
        list.add(40);
        list.addFirst(10);
        list.addLast(50);
        list.add(2, 25);
        System.out.println("add methods: " + list);

        // 2. Accessing elements
        System.out.println("get(1): " + list.get(1));
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());
        System.out.println("element(): " + list.element());

        // 3. Searching
        System.out.println("contains(30): " + list.contains(30));
        System.out.println("indexOf(30): " + list.indexOf(30));
        System.out.println("lastIndexOf(30): " + list.lastIndexOf(30));

        // 4. Updating
        list.set(1, 15);
        System.out.println("set(): " + list);

        // 5. Queue methods
        list.offer(60);
        list.offerFirst(5);
        list.offerLast(70);
        System.out.println("offer methods: " + list);

        System.out.println("peek(): " + list.peek());
        System.out.println("peekFirst(): " + list.peekFirst());
        System.out.println("peekLast(): " + list.peekLast());

        // 6. Removing elements
        System.out.println("remove(): " + list.remove());
        System.out.println("removeFirst(): " + list.removeFirst());
        System.out.println("removeLast(): " + list.removeLast());

        list.remove(Integer.valueOf(30));
        list.removeFirstOccurrence(40);
        list.add(40);
        list.add(40);
        list.removeLastOccurrence(40);
        System.out.println("After removals: " + list);

        System.out.println("poll(): " + list.poll());
        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println("pollLast(): " + list.pollLast());

        // 7. Stack methods
        list.push(100);
        list.push(200);
        System.out.println("push(): " + list);
        System.out.println("pop(): " + list.pop());

        // 8. Iteration
        System.out.print("Forward: ");
        for (int value : list) {
            System.out.print(value + " ");
        }

        System.out.print("\nBackward: ");
        Iterator<Integer> it = list.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 9. Other List / Collection methods
        System.out.println("size(): " + list.size());
        System.out.println("isEmpty(): " + list.isEmpty());

        list.addAll(java.util.Arrays.asList(7, 8));
        System.out.println("addAll(): " + list);

        LinkedList<Integer> copy = (LinkedList<Integer>) list.clone();
        System.out.println("clone(): " + copy);

        System.out.println("toArray(): " +
                java.util.Arrays.toString(list.toArray()));

        // 10. Retain and remove collections
        list.removeAll(java.util.Arrays.asList(7, 8));
        System.out.println("removeAll(): " + list);

        list.retainAll(java.util.Arrays.asList(5, 100));
        System.out.println("retainAll(): " + list);

        list.clear();
        System.out.println("clear(): " + list);
        System.out.println("isEmpty(): " + list.isEmpty());

        // 11. Null handling
        LinkedList<Integer> nullList = new LinkedList<>();
        nullList.add(null);
        nullList.add(10);
        System.out.println("LinkedList allows null: " + nullList);
    }
}
