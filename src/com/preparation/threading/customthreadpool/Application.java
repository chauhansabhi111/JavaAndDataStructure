package com.preparation.threading.customthreadpool;


 public class Application 
 {
    public static void main(String[] args) throws InterruptedException {
    	//create queue size - 3
    	//Number of threads - 4
        ThreadPool threadPool = new ThreadPool(3,4);
        //Created 15 Tasks and submit to pool
        for(int taskNumber = 1 ; taskNumber <= 700; taskNumber++) {
            TestTask task = new TestTask(taskNumber);
            threadPool.submitTask(task);
        }
       // threadPool.
    }
}
