/**
 * 
 *      -> If we overload run() method then Thread class's start() method will invoke the no/zero arg run() method.
 *          -> The other overloaded method we have to call explicitly like a normal method call. 
 * 
 */

 class MyThread extends Thread{
    public void run(){
            System.out.println("0 arg Thread");
    }
    public void run(int i){   // This didnt execute because we didnt call it explicitly.
            System.out.println("int-arg Thread");
    }
}

class Case4OverloadingRun {
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