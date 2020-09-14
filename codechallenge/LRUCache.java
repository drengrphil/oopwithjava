import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

// Least Recently Used (LRU) - replace oldest data to make room for new data
// when out of memory.
// There is a limit to the number of page frames that cache can hold at a time.
// LRU cache (memory) removes the least recently used frame when cache is full
// to reference a new page, which doesn't exist yet in cache.

// Implementation:- two data structures are used
// 1. Queue: implemented using a doubly linked list
// 2. A Hash: page number as key and address of the corresponding queue node as value
public class LRUCache {
    // When a page is referenced, if it is in memory, 
    // we detach the node of the list and bring it to the front of the queue
    // if page is not in memory, we add a new node to the front of the queue
    // and update node address in hash.
    // --> If queue is full, we remove a node from the rear of the queue and add a node to the front of the queue.

    // Keys of cache
    private Deque<Integer> doublyQueue;
    // Store reference of keys in cache
    private HashSet<Integer> keyReferences;

    // Cache capacity
    private final int CACHE_SIZE;

    LRUCache(int requiredCapacity){
        doublyQueue = new LinkedList<>();
        keyReferences = new HashSet<>();
        CACHE_SIZE = requiredCapacity;
    }

    // Reference a page within the LRU cache
    public void referPage(int page){
        // Is page not found in cache?
        if (!keyReferences.contains(page)){
            // Is page full?
            if (doublyQueue.size() == CACHE_SIZE){
                // Remove last
                int lastPage = doublyQueue.removeLast();
                keyReferences.remove(lastPage);
            }
        } else {
            // Page found but it may not always be the 
            // last.
            doublyQueue.remove(page);
        }
        doublyQueue.push(page);
        keyReferences.add(page);
    }

    // Show storage content
    public void printCacheContents(){
        Iterator<Integer> itr = doublyQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next() + " ");
        }
    }
}
