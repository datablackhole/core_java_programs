/**    
 *      synchronized static :
 *      ->  We have two shared resources 'object 1' & 'object 2'. In case of synchronized method & synchronized block there cannot
 *          be interference betweem t1 & t2 or t3 & t4 because t1 & t2 both refer to a common object that has a single lock.
 * 
 *      -> But there can be interference between t1 & t3 or t2 & t4 because t1 acquires another lock & t3 acquires another lock.
 * 
 *      -> static synchronization solves this problem of no interference between t1 & t3 or t2 & t4.
 * 
 * 
 * 
 *              t1 --------(object1)
 *               |             |                     
 *           t2--|-------------˧                 
 *           |   | 
 *           |  t3 --------(object2) 
 *           |                |                    
 *           t4---------------˧  
 */
/*
        Note:   Class level lock:
                • Every class in java has a unique lock. If a Thread wants to execute a static synchronized
                method then it requires a class level lock.
                • Once a Thread gets a class level lock then it is allowed to execute any static synchronized
                method of that class.
                • While a Thread executing any static synchronized method, the remaining Threads are
                not allowed to execute any static synchronized method of that class simultaneously.
                • But remaining Threads are allowed to execute normal synchronized methods, normal
                static methods, and normal instance methods simultaneously.
                • Class level lock and object lock both are different and there is no relationship between
                these two.

*/

 class Table{
     // synchronized  void printTable(int n){    //<--- this will mix up inputs of t1 , t2 , t3 , t4
         synchronized static void printTable(int n){
     
            for (int i = 0; i < 10; i++) {
                System.out.println(n+" x "+(i+1)+" = "+n*(i+1));
                try {
                    Thread.sleep(1);
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

   class MyThread3 extends Thread{
     Table t;
     int n;
     MyThread3(Table t,int n){
         this.t = t;
         this.n = n;
     }
     public void run(){
            t.printTable(this.n);
     }
 }
  class MyThread4 extends Thread{
     Table t;
     int n;
     MyThread4(Table t,int n){
         this.t = t;
         this.n = n;
     }
     public void run(){
            t.printTable(this.n);
     }
 }

public class SynchronizedStatic{
public static void main(String[] args) throws InterruptedException {

    Table obj1 = new Table();
    Table obj2 = new Table();

    MyThread1 t1 = new MyThread1(obj1,1);
    MyThread2 t2 = new MyThread2(obj2,2);
    MyThread3 t3 = new MyThread3(obj1,3);
    MyThread4 t4 = new MyThread4(obj2,4);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
}
}