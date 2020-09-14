import java.util.Iterator;
import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        PriorityQueue<String> strpQueue = new PriorityQueue<String>();

        pQueue.add(15);
        pQueue.add(10);
        pQueue.add(12);
        pQueue.add(1);
        pQueue.add(0);
        System.out.println(pQueue); // 0, 1, 12, 15, 10 - elements in ascending order.
        // Top element
        System.out.println(pQueue.peek()); // 0
        // Remove top element from queue
        System.out.println(pQueue.poll()); // 0
        // Check top element
        System.out.println(pQueue.peek()); // 1 after removing 0
        System.out.println(pQueue.poll()); // 1
        System.out.println(pQueue.peek()); // 10 after removing 1
        pQueue.add(8);

        // Iterate a PQ
        Iterator<Integer> pqItr = pQueue.iterator();
        System.out.println("Iteration: ");
        while (pqItr.hasNext()){
            System.out.print(pqItr.next()+ " ");
        }
        System.out.println(" ");
        
        strpQueue.add("Engr");
        strpQueue.add("Phillip");
        strpQueue.add("Babs");
        System.out.println(strpQueue); // [Babs, Phillip, Engr]
        strpQueue.remove("Engr");
        System.out.println(strpQueue); // [Babs, Phillip]
        System.out.println("Poll Result: " + strpQueue.poll()); // Babs
        System.out.println(strpQueue); // Phillip
    }
}
