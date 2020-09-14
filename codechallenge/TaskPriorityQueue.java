class TaskPriorityQueue implements Comparable<TaskPriorityQueue>{
    Double priority;
    String taskName;

    TaskPriorityQueue(double priority, String taskName){
        this.priority = priority;
        this.taskName = taskName;
    }

    @Override
    public int compareTo(TaskPriorityQueue tq){
        return priority.compareTo(tq.priority);
    }

    @Override
    public String toString(){
        return "Task <priority =" + priority + " taskName =" + taskName + ">";
    }
}
