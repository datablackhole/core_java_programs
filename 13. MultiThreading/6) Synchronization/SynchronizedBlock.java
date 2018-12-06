/**     
 *      synchronized block :
 *      -> if you want to perform synchronization on a specific resource of a program. then we need to use synchronized block.
 *      -> if we keep all the logic in synchronized block then this block acts like a method declared with synchronized keyword.
 *  
 */

 class Table{
      void printTable(int n){
        synchronized(this){
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

public class SynchronizedBlock{
public static void main(String[] args) throws InterruptedException {

    Table obj = new Table();
    MyThread1 t1 = new MyThread1(obj,5);
    MyThread2 t2 = new MyThread2(obj,10);
    t1.start();
    t2.start();

}
}