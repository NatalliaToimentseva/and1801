package task4;

public class MainT4 {
    public static void main(String[] args) {
        Marker marker = new Marker();

        Thread th1 = new Thread(
                new SynchronizedThread(marker, 1)
        );

        Thread th2 = new Thread(
                new SynchronizedThread(marker, 2)
        );
        th1.start();
        th2.start();
    }
}
