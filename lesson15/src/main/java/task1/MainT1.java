package task1;

public class MainT1 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThread1 th1 = new MyThread1();
        Thread th2 = new Thread(new MyThread2());

        th1.start();
        th2.start();

        try {
            th1.join();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        try {
            th2.join();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.println("Main thread finished");
    }
}
