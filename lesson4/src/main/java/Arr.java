import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
//        0. Создайте массив целых чисел. Напишете программу, которая выводит
//        сообщение о том, входит ли заданное число в массив или нет.
//        Пусть число для поиска задается с консоли (класс Scanner).
//        Не использовать методы класса Arrays.

        int [] arr1 = {10,20,25,15,30};
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean isInArray = false;

        for (int j : arr1) {
            if (j == number) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("Number " + number + " is included in the array.");
        } else {
            System.out.println("Number " + number + " is not included in the array.");
        }

//        1. Создайте массив целых чисел. Удалите все вхождения заданного
//        числа из массива.
//        Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//        выведите сообщения об этом.
//        В результате должен быть новый массив без указанного числа.

        int [] arr2 = {2,5,7,10,9,5,15,20};
        int number2 = in.nextInt();

        int numberOfMatch = 0;
        int position = 0;

        for (int j : arr2) {
            if (j == number2) {
                numberOfMatch ++;
            }
        }
        if(numberOfMatch == 0) {
            System.out.println("No matches found.");
        } else {
            int [] newArr = new int[arr2.length - numberOfMatch];
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] != number2) {
                    newArr[position] = arr2[i];
                    position++;
                }
            }
            System.out.println(Arrays.toString(newArr));
        }

//        2. Создайте и заполните массив случайным числами и выведете
//        максимальное, минимальное и среднее значение.

        int [] arr3 = new int[7];
        int max = arr3[0];
        int min = arr3[0];
        int sum = 0;

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(arr3));
        for (int j : arr3) {
            sum += j;
            max = Math.max(max, j);
            min = Math.min(min, j);
        }
        System.out.printf("In array arr3 \n maximum value: %d \n minimum value: %d \n average value: %d\n", max, min, (sum/arr3.length));

//        3.Создайте массив из произвольных чисел. Создайте новый массив, который будет хранить
//        эти же элементы, но в обратном порядке.

        int [] arr4 = {3,6,10,2,8,4,7,1};
        int [] reversed = new int[8];

        for (int i = 0; i < arr4.length; i++) {
            reversed[reversed.length - 1 - i] = arr4[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
