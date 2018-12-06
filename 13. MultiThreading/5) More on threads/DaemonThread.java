/**     (Invisible)
 *      Daemon Threads
 *      ----------------
 *      What is it ?                                              
 *      -> Its a service provider thread which runs in the background and provides service & support to user threads i.e. Non Daemon threads.
 *      -> Non Daemon threads are front end threads. They execute front end logic of the application (reading,printing, displaying, etc)
 *      -> JVM forcefully terminates the deamon threads once the non deamon threads finish its execution by dying.
 *      -> Internally running daemon threads are garbage collector, finalizer,etc
 *      -> To set daemon thread we need to call the method: setDaemon(true);
 *      -> To check if a thread is daemon or not we need call isDaemon() method.
 */

 class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
class DaemonThread{
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().isDaemon());
            System.out.println(t.isDaemon());
            System.out.println("Main Thread");
        }
    }
}