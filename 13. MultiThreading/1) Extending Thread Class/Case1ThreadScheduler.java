/** 
 *      Thread Scheduler (TS)
 *      -> if multiple threads are waiting for execution, 
 *          -> then which of these threads are to be executed is decided by Thread Schedular.
 *              -> And the type of algo, behavior & mechanism used by TS depends upon the JVM vendor.
 *                  -> So we can't expect any execution order or exact output in MultiThreading.
 * 
 */
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

class Case1ThreadScheduler {
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