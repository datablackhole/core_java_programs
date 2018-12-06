/**
 * 
 *      -> If we won't override run() method then Thread class run() method will get executed.
 *          -> This method is an empty implementation, so we won't get any output from child Thread.
 * 
 * importance of Thread class start() method.
 * --------------------------------------------
 *  • For every Thread the required mandatory activities like registering the Thread with
 *  Thread Scheduler will be taken care by Thread class start() method and programmer is
 *  responsible just to define the job of the Thread inside run() method. That is start()
 *  method acts as best assistant to the programmer.
 * 
 *          start()
 *          {
 *              1. Register Thread with Thread Scheduler
 *              2. All other mandatory low level activities.
 *              3. Invoke or calling run() method.
 *          }
 * 
 * • We can conclude that without executing Thread class start() method there is no chance of starting a new Thread in java.
 * 
 */

 class MyThread extends Thread{

}

class Case3NotOverridingRun {
    public static void main(String[] args) {
        // Instantiate a Thread

        MyThread t = new MyThread();             // This vendor opts to prioritize the Parent Thread's execution over the child thread's execution.

        // Start a thread
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Parent Thread");
        }

    }
}