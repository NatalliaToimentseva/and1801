package task4;

public class MainT4 {
    public static void main(String[] args) {
        Marker marker = new Marker();

        Thread th1 = new Thread(
                () -> {
                    synchronized (marker) {
                        try {
                            System.out.println("1");
                            Thread.sleep(1000);
                            System.out.println("1");
                            Thread.sleep(1000);
                            System.out.println("1");
                            Thread.sleep(1000);
                            }catch (InterruptedException e) {
                            e.getStackTrace();
                        }
                    }
                }
        );

        Thread th2 = new Thread(
                () -> {
                    synchronized (marker) {
                        try {
                            System.out.println("2");
                            Thread.sleep(1000);
                            System.out.println("2");
                            Thread.sleep(1000);
                            System.out.println("2");
                            Thread.sleep(1000);
                        }catch (InterruptedException e) {
                            e.getStackTrace();
                        }
                    }
                }
        );
        th1.start();
        th2.start();
    }
}
