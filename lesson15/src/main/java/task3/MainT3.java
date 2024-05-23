package task3;

public class MainT3 {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        Thread th = new Thread(
                () -> {
                    for (int i = 0; i < 1000000; i++) {
                        System.out.println(i);
                    }
                }
        );
        th.setDaemon(true);
        th.start();

        System.out.println("Main thread finished");
    }
}
