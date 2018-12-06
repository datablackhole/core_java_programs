
class MyRunnable implements Runnable{                                   //defining a thread (start)    

    public void run(){                                                      //Job of a thread (start)
            System.out.println("Child Thread");
    }                                                                       //Job of a thread (end)
    
}                                                                       //defining a thread (end)

class CaseStudy {
    public static void main(String[] args) {
        // Instantiate a Thread


        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread();   
        Thread t2 = new Thread(r);   // here r is target interface

        // Start a thread

        t1.start();// #1 A new thread will be created & it will execute Thread class's run() method automatically.(method is empty implementation)
        t1.run();  // #2 No new thread will be created but Thread class's run() method will be executed just like a normal method.

        System.out.println("Parent Thread");

        t2.start();// #3 A new thread will be created & it will execute MyRunnable class's run() method automatically.(method is defined)
        t2.run();  // #4 A new thread will be created but MyRunnable class's run() method will be executed just like a normal method.
        // #5 r.start(); will throw compile time error: cannot find symbol...
        // #6 r.run(); No new thread will be created but MyRunnable class's run() method will be executed just like a normal method.
        
    }
}