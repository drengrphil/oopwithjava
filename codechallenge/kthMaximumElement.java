import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Comparator;

class kthMaximumElement {
    PriorityQueue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>(){
        @Override
        public int compare(Integer val1, Integer val2){
            return val2.compareTo(val1);
        }
    });

    // Operation to perform
    // This flag works for situation where we need to
    // return the top k maximum elements.
    boolean returnTopKElement = false;

    public ArrayList<Integer> findKTopElements(int[] inputArray, int k){
        ArrayList<Integer> topKElements = new ArrayList<Integer>();
        if (k > inputArray.length){
            return topKElements;
        }
        
        for (int i = 0; i < inputArray.length; i++){
            this.pQueue.add(inputArray[i]);
        }

        // Get the top k elements
        for (int i = 0; i < k; i++){
            topKElements.add(pQueue.poll());
        }

        return topKElements;
    }

    public int largestElement(int[] inputArray, int k){
        if (k > inputArray.length){
            return -1;
        }
        
        for (int i = 0; i < inputArray.length; i++){
            this.pQueue.add(inputArray[i]);
        }

        // Since pQueue is implemented as max priority qeueue
        // we can poll the head k - 1 times.
        for (int i = 0; i < k-1; i++){
            pQueue.poll();
        }

        // Head should be largest element
        return pQueue.peek();
    }
}