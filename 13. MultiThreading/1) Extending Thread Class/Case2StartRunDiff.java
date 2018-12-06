/** 
 *      Diff between t.start() and t.run()
 *      ----------------------------------
 *      -> If we call t.start() method then a new thread will be created,
 *          -> which is responsible to execute run() method automatically.
 *
 *      -> If we call t.run() method then no new thread will be created 
 *          -> But run() method will execute just like a normal method. 
 * 
 */

 class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

class Case2StartRunDiff {
    public static void main(String[] args) {
        // Instantiate a Thread

        MyThread t = new MyThread();             // This vendor opts to prioritize the Parent Thread's execution over the child thread's execution.

        // run a method
        t.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("Parent Thread");
        }

    }
}