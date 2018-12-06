/**
 *      YIELD
 *      ------
 *      -> It will pause execution of current thread & it will change to other threads having a higher priority.
 *      -> If there are no waiting threads or low priority threads then the same thread will continue its execution. 
 *      -> If all threads are having the same priority then which thread should be executed will be decided by Thread Scheduler.
 *          So we can't expect any execution order.
 *      -> A thread which is yielded now gets a chance for execution only upon the decree & mercy of the Thread Scheduler.
 * 
 *          public static native void yield();
 *                                                          Thread.yield()
 *                                           -------------<--------------
 *                                          /                            \
 *                                         /                              \ 
 *      _________   t.start()   __________|_____  if TS allocates cpu   ___|_____   running   ______
 *     |new/born |------>------| Ready/Runnable |----------->--------- | Running |----->-----| Dead | 
 *      ‾‾‾‾‾‾‾‾‾               ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                        ‾‾‾‾‾‾‾‾‾             ‾‾‾‾‾‾
 *  
 * 
 */

 class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Child Thread");
        }
    }
}
class Yield{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 20; i++) {
            Thread.currentThread().yield();
            System.out.println("Main Thread");
           
        }
    }
}