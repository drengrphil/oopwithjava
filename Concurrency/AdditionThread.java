class AdditionThread extends Thread {
    SimpleLock simLock;
    int myThreadID = -1;
    int valueAdd = 2;
    AdditionThread(SimpleLock simLock, int myThreadID){
        this.simLock = simLock;
        this.myThreadID = myThreadID;
    }

    public void run(){
        simLock.inc(valueAdd, myThreadID);
    }
}
