/**     LOCK: Synchronization is built around an internal entity called 'lock'. Whenever thread wants to access any object then first it needs
 *              to acquire the lock of the object & when the thread completes its task then release the lock of that object.
 * 
 *      synchronized :
 *      -> this keyword applicable for methods and blocks but not for classes & variables.
 *      -> if a method or a block is declared as synchronized then at a time on the given object only one thread
 *           is allowed to execute that method or block.
 *      -> data inconsistency problems are resolved.
 *      -> It increases waiting time for other threads as they wait for the current thread to finish execution the method 
 *          or the block before it releases the lock of the object. This is one big disadvantage.
 *      -> If there is no specific requirement for synchronized then its recommended to avoid using that keyword.
 *      -> Internal concept of synchronized is acheived by using locks concept.
 *      -> But if there is no synchronization then our outputs will be inconsistent.
 *  
 */

 class Table{
     void printTable(int n){
        for (int i = 0; i < 10; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
            try {
                Thread.sleep(500);
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

public class Synchronized{
public static void main(String[] args) {

    Table obj = new Table();
    MyThread1 t1 = new MyThread1(obj,5);
    MyThread2 t2 = new MyThread2(obj,10);
    t1.start();
    t2.start();
    // Inconsistent output for this program

}
}