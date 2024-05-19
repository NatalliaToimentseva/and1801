package task2;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1) Найти среднее значение первых 10 чисел.
        Stream<Integer> stream = Stream.iterate(1, v -> v + 1);
        OptionalDouble result = stream
                .limit(10)
                .mapToInt(v -> v)
                .average();
        System.out.println(result.orElse(0));

        //2) Пропустить 5 чисел и вывести следующие 10 чисел, которые делятся на 3 без остатка
        List<Integer> stream2 = Stream.iterate(1, v -> v + 1)
                .skip(5)
                .filter(v -> v % 3 == 0)
                .limit(10)
                .toList();
        System.out.println(stream2);

        //3) Посчитать сумму 20 подряд идущих чисел
        int stream3 = Stream.iterate(1, v -> v + 1)
                .limit(20)
                .mapToInt(v -> v)
                .sum();
        System.out.println(stream3);
    }
}
