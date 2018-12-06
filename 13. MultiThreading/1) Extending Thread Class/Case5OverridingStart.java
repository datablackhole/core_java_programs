/**
 * 
 *  If we override start() method then no new thread will be created but start() method will be executed just like a normal method.
 * 
 */

 
 class MyThread extends Thread{
    public void run(){
            System.out.println("run method");
    }
    public void start(){   
            System.out.println("start method");
    }
}

class Case5OverridingStart {
    public static void main(String[] args) {
        // Instantiate a Thread

        MyThread t = new MyThread();         

        // Start a thread
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Parent Thread");
        }

    }
}