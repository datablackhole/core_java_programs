/**
 *      YIELD
 *      ------
 *      -> If a thread does not want to perform any operation for a particular amount of time then we need to use sleep() method. 
 *      -> sleep() throws one checked exception called InterruptedException, so its a must to handle the exception by using throws 
 *          or by using try-catch block.
 *            -> Methods: 
 *                  public static native void sleep() throws InterruptedException
 *                  public final void sleep(long ms) throws InterruptedException
 *                  public final void sleep(long ms, int ns) throws InterruptedException
 * 
 *                                                 _______________      
 *                                           --<--|sleeping state |---<--
 *                                          /      ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾       \ Thread.sleep(5000); 
 *                                         /                              \ 
 *      _________   t.start()   __________|_____  if TS allocates cpu   ___|_____   running   ______
 *     |new/born |------>------| Ready/Runnable |----------->--------- | Running |----->-----| Dead | 
 *      ‾‾‾‾‾‾‾‾‾               ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                        ‾‾‾‾‾‾‾‾‾             ‾‾‾‾‾‾
 *  
 * 
 */

class MyThread extends Thread{

    private static int count = 0;

    public void run(){         //  <----- This thread's run() method takes less than five seconds to complete on this particular system
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
    public void printCount(){
        System.out.println(count);
    }
}
class Sleep{
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(5000);  // Making main thread wait for 5 seconds so that child thread t can complete its execution.
        t.printCount();        

    }
}
 





