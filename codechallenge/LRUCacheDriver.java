public class LRUCacheDriver {
    public static void main(String[] args) {
        // LRU Cache implemented with Deque
        LRUCache lruCache = new LRUCache(6);
        lruCache.referPage(1);
        lruCache.referPage(2);
        System.out.println("Cache Content:");
        lruCache.printCacheContents();
        lruCache.referPage(1);
        lruCache.referPage(2);
        lruCache.referPage(3);
        lruCache.referPage(4);
        lruCache.referPage(5);
        System.out.println("Cache Content:");
        lruCache.printCacheContents();
        lruCache.referPage(3);
        lruCache.referPage(5);
        lruCache.referPage(6);
        lruCache.referPage(7);
        System.out.println("Cache Content:");
        lruCache.printCacheContents();

        // LRU Cache implementation with HashMap
        LRUCacheUsingMap lruCacheMap = new LRUCacheUsingMap(6);
        System.out.println("-------------LRU Cache 2-------------");
        lruCacheMap.referenceAKey(1);
        lruCacheMap.referenceAKey(4);
        lruCacheMap.referenceAKey(8);
        System.out.println("Cache 2 Content:");
        lruCacheMap.printCacheContents();
        lruCacheMap.referenceAKey(1);
        lruCacheMap.referenceAKey(4);
        lruCacheMap.referenceAKey(8);
        lruCacheMap.referenceAKey(5);
        lruCacheMap.referenceAKey(7);
        lruCacheMap.referenceAKey(6);
        System.out.println("Cache 2 Content:");
        lruCacheMap.printCacheContents();
        // Remove first content and replace with new page.
        lruCacheMap.referenceAKey(10);
        System.out.println("Cache 2 Content:");
        lruCacheMap.printCacheContents();
    }
}
