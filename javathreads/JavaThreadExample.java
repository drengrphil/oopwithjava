
// Two ways to create a thread:
// 1. Extending the Thread class and overriding its run() method
// 2. Implementing the Runnable interface
public class JavaThreadExample {
    public static void main(String[] args) {
        // Running thread type 1
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        threadOne.loanAmount++;
        System.out.println("Loan Amount from main : " + threadOne.loanAmount);

        // Running thread type 2
        ThreadTwo threadTwo = new ThreadTwo();
        Thread forkThread = new Thread(threadTwo);
        forkThread.start();
    }
}
