package task2;

import java.util.Arrays;

public class ThreadGetMax implements Runnable{
    private final int [] arr;

    public ThreadGetMax(int[] arr) {
        this.arr = arr;
    }
    @Override
    public void run() {
        System.out.println("Max value: " + Arrays.stream(arr).max());
    }
}