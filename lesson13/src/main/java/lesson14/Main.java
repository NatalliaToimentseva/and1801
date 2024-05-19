package lesson14;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        //Необходимо взять n-количество подряд идущий чисел и определить сколько в них четных а сколько не-четных.
        Stream<Integer> stream1 = Stream.iterate(1, v -> v + 1);
        Map<Boolean, Long> result1 = stream1
                .limit(n)
                .collect(Collectors.partitioningBy(i -> i % 2 == 0, Collectors.counting()));
        System.out.println(result1);

        //Так же посчитать сумму четных и нечетных чисел.
        Stream<Integer> stream2 = Stream.iterate(1, v -> v + 1);
        Map<Boolean, Integer> result2 = stream2
                .limit(n)
                .collect(Collectors.partitioningBy(i -> i % 2 == 0, Collectors.summingInt( i -> i)));
        System.out.println(result2);
    }
}
