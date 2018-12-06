
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

class aTestProgram {
    public static void main(String[] args) {
        // Instantiate a Thread

        MyThread t = new MyThread();

        // Start a thread
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Parent Thread");
        }

    }
}