/**
 *      JOIN
 *      ------
 *      -> If a thread wants to wait untill the completion of some other thread then we need to use join() method by using reference of the other thread.
 *      -> join() throws one checked exception, so its a must to handle the exception by using throws or by using try-catch block.
 *            -> Methods: 
 *                  public final void join() throws InterruptedException
 *                  public final void join(long ms) throws InterruptedException
 *                  public final void join(long ms, int ns) throws InterruptedException
 *                                                 _______________      
 *                                           --<--| Waiting state |---<--
 *                                          /      ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾       \ Thread.join() 
 *                                         /                              \ 
 *      _________   t.start()   __________|_____  if TS allocates cpu   ___|_____   running   ______
 *     |new/born |------>------| Ready/Runnable |----------->--------- | Running |----->-----| Dead | 
 *      ‾‾‾‾‾‾‾‾‾               ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                        ‾‾‾‾‾‾‾‾‾             ‾‾‾‾‾‾
 *  
 * 
 */

class MyThread extends Thread{
    private static int count = 0;
    public void run(){
        System.out.println("child :"+Thread.currentThread().getName()+" is executing");
        for (int i = 0; i < 2000; i++) {
            try {
                Thread.sleep(1); //intoduce delay of 1 millisec while running
                count++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void printCount(){System.out.println(count);}
}
class Join{
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        MyThread t = new MyThread();
        t.start();
        //Thread.sleep(1000);
        t.join(); // Main thread will now wait until child thread t completes its execution.
        //Thread.sleep(5000);
        t.printCount();        

    }
}
 





