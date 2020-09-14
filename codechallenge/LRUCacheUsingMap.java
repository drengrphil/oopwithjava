import java.util.*;

public class LRUCacheUsingMap {
    // This implementation maintains insertion order of elements
    Set<Integer> lruCache;
    int requiredCapacity;

    public LRUCacheUsingMap(int requiredCapacity){
        this.lruCache = new LinkedHashSet<>();
        this.requiredCapacity = requiredCapacity;
    }

    // If key is present in cache, move it to the front.
    public boolean getKey(int key){
        if (!lruCache.contains(key)){
            return false;
        }
        // is found but may not be at the front
        // remove and add to the front
        lruCache.remove(key);
        lruCache.add(key);
        return true;
    }

    // Reference a key
    public void referenceAKey(int key){
        if (getKey(key) == false){
            addKey(key);
        }
    }

    // Add new key
    public void addKey(int key){
        if (lruCache.contains(key)){
            // If key already in cache, remove
            // then add it as the first
            lruCache.remove(key);
        } else if (lruCache.size() == requiredCapacity){
            // Is cache size full, remove the least recently used.
            int firstKey = lruCache.iterator().next();
            lruCache.remove(firstKey);
        }

        lruCache.add(key);
    }

    // Display cache contents
    public void printCacheContents(){
        Iterator<Integer> cacheItr = lruCache.iterator();
        while (cacheItr.hasNext()){
            System.out.println(cacheItr.next());
        }
    }
}
