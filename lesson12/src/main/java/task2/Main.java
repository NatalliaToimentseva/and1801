package task2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String [] arr1 = {"a", "b", "a", "c", "b"};
        String [] arr2 = {"c", "b", "a"};
        String [] arr3 = {"c", "c", "c", "c"};

        StringCounter counter = new StringCounter();

        Map<String,Boolean> counter1 = counter.countStringInArray(arr1);
        System.out.println(counter1); //{a=true, b=true, c=false}

        Map<String,Boolean> counter2 = counter.countStringInArray(arr2);
        System.out.println(counter2); //{a=false, b=false, c=false}

        Map<String,Boolean> counter3 = counter.countStringInArray(arr3);
        System.out.println(counter3); //{c=true}
    }
}
