import java.util.PriorityQueue;

public class Demo {
    public static void main(String[] args) {

        // mean heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);

        System.out.println(pq.poll());
        System.out.println(pq.poll());

        // Max heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)-> b-a);
        pq2.add(10);
        pq2.offer(20);
        pq2.offer(30);
        pq2.offer(40);
        pq2.offer(50);

        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
    }
}