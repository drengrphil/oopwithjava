import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Iterator;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        // Custom comparator for supporting max priority queue
        PriorityQueue<Integer> maxPQueue = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer val1, Integer val2){
                return val2.compareTo(val1);
            }
        });

        // Add to Priority Queue
        for (int k = 0; k < 10; k++){
            maxPQueue.add(k);
        }

        Iterator<Integer> qItr  = maxPQueue.iterator();
        System.out.println("Max Priority Queue Content:");
        while (qItr.hasNext()){
            System.out.print(qItr.next() + " ");
        }
        System.out.println("");
        System.out.println("Poll operation:");
        while (!maxPQueue.isEmpty()){
            System.out.println(maxPQueue.poll());
        }

        // Max Priority Queue with class object (or typedefine)
        System.out.println("Max Priority Queue with object:");
        PriorityQueue<TaskPriorityQueue> taskPriorityQueue = new PriorityQueue<>(new Comparator<TaskPriorityQueue>(){
            @Override
            public int compare(TaskPriorityQueue tq1, TaskPriorityQueue tq2){
                return tq2.priority.compareTo(tq1.priority);
            }
        });

        // Add Tasks to queue
        for (int k = 0; k < 10; k++){
            taskPriorityQueue.add(new TaskPriorityQueue(k, "Task-"+k));
        }
        
        System.out.println("Poll Operation 2:");
        while (!taskPriorityQueue.isEmpty()){
            System.out.println(taskPriorityQueue.poll());
        }
    }
}
