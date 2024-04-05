import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
//        1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
//        При решении используйте операцию инкремента (++).

        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

//        2. Необходимо вывести на экран числа от 5 до 1.
//        При решении используйте операцию декремента (--).

        for (int i = 5; i != 0; i--) {
            System.out.println(i);
        }

//        3. Напишите программу, где пользователь вводит любое целое
//        положительное число. А программа суммирует все числа от 1 до
//        введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner.

        System.out.println("Введите любое целое положительное число.");

            Scanner in = new Scanner(System.in);
            int number = 0;
            if (in.hasNextInt()) {
                number = in.nextInt();
            }
            int sum = 0;

            if (number <= 0) {
                System.out.println("Число указано не верно!");
            } else {
                for (int i = 0; i < number; i++) {
                    sum +=i;
                }
                System.out.println(sum);
            }

//        4. Необходимо, чтоб программа выводила на экран вот такую
//        последовательность:
//        7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//        В решении используйте цикл while
        int number2 = 0;

        while (number2 <= 91) {
            number2 +=7;
            System.out.println(number2);
        }
    }
}
