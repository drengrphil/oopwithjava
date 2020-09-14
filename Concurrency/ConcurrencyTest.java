public class ConcurrencyTest {
    public static void main(String[] args) {
        int numThread = 1;
        while (numThread < 5){
            SimpleLock simLock = new SimpleLock();
            numThread++;
            simLock.start();
            simLock.inc(numThread + 1, numThread);
        }
    }
}
