package task4;

public class SynchronizedThread implements Runnable{
    final private Marker marker;
    final private int number;

    public SynchronizedThread(Marker marker, int number) {
        this.marker = marker;
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (marker) {
            try {
                System.out.println(number);
                Thread.sleep(1000);
                System.out.println(number);
                Thread.sleep(1000);
                System.out.println(number);
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
