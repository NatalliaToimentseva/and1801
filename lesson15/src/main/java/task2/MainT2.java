package task2;

import java.util.Arrays;

public class MainT2 {
    public static void main(String[] args) {
        int [] arr = {2,5,7,1,0,4,9,1,3,5,8};

        Thread maxThread = new Thread(new ThreadGetMax(arr));
        maxThread.start();

        Thread minThread = new Thread(
                () -> System.out.println("Min value: " + Arrays.stream(arr).min()));
        minThread.start();
    }
}