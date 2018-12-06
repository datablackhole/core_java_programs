/**     Mutually exclusive threads
 *          -> It keeps threads away from one another while sharing the data. It can be done in three ways: - 
 *                 1 -> synchronized keyword 
 *                 2 -> synchronized block 
 *                 3 -> static synchronization
 * 
 *      synchronized method :
 *      -> this keyword applicable for methods and blocks but not for classes & variables.
 *      -> if a method is declared as synchronized then that method is called synchronized method.
 *      -> whenever threads reads synchronized it automatically gets the lock of the object and it will release the lock when it
 *         completes its task of executing that method.
 *  
 */

 class Table{
     synchronized void printTable(int n){
        for (int i = 0; i < 10; i++) {
            System.out.println(n+" x "+(i+1)+" = "+n*(i+1));
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
     }
 }

 class MyThread1 extends Thread{
     Table t;
     int n;
     MyThread1(Table t,int n){
         this.t = t;
         this.n = n;
     }
     public void run(){
            t.printTable(this.n);
     }
 }

  class MyThread2 extends Thread{
     Table t;
     int n;
     MyThread2(Table t,int n){
         this.t = t;
         this.n = n;
     }
     public void run(){
            t.printTable(this.n);
     }
 }

public class SynchronizedKeyword{
public static void main(String[] args) throws InterruptedException {

    Table obj = new Table();
    MyThread1 t1 = new MyThread1(obj,5);
    MyThread2 t2 = new MyThread2(obj,10);
    t1.start();
    t2.start();

}
}