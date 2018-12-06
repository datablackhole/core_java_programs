/**    
 *      DEADLOCK:
 *      
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