class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // pause for half a second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // first thread
        MyThread t2 = new MyThread(); // second thread

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start(); // start first thread
        t2.start(); // start second thread
    }
}

