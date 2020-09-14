class ThreadOne extends Thread {
    // Extending the Thread class and overriding its run() method
    public int loanAmount = 0;
    public void run(){
        // Override run method
        System.out.println("This is a thread created using extends");
        loanAmount++;
        System.out.println("Loan Amount: " + loanAmount);
    }
}
