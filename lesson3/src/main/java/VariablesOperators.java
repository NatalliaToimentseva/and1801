import java.util.Scanner;

public class VariablesOperators {
    public static void main(String[] args) {
        //1. Написать программу для вывода названия поры года по номеру
        //месяца.При решении используйте оператор switch-case:
        Scanner in = new Scanner(System.in);
        int monthSw = in.nextInt();

        switch (monthSw) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
        }
//        2. Написать программу для вывода названия поры года по номеру
//        месяца. При решении используйте оператор if-else-if.
        int monthIf = in.nextInt();

        if (monthIf == 1 || monthIf == 2 || monthIf == 12) {
            System.out.println("Зима");
        } else if (monthIf == 3 || monthIf == 4 || monthIf == 5) {
            System.out.println("Весна");
        } else if (monthIf == 6 || monthIf == 7 || monthIf == 8) {
            System.out.println("Лето");
        } else if (monthIf == 9 || monthIf == 10 || monthIf == 11) {
            System.out.println("Осень");
        }

//        3. Напишите программу, которая будет принимать на вход число и на
//        выход будет выводить сообщение четное число или нет.
//        Для определения четности числа используйте операцию получения
//        остатка от деления - операция выглядит так: '% 2').
        int number = in.nextInt();

        if (number % 2 == 1) {
            System.out.printf("Number %d is odd", number);
        } else {
            System.out.printf("Number %d is even", number);
        }

//        4. Для введенного числа t (температура на улице) вывести
//        Если t>–5, то вывести «Тепло».
//        Если –5>= t > –20, то вывести «Нормально».
//        Если –20>= t, то вывести «Холодно».
        int temperature = in.nextInt();

        if (temperature > -5) {
            System.out.println("Тепло");
        } else if (temperature <= -5 && temperature > -20) {
            System.out.println("Нормально");
        } else if (temperature <= -20) {
            System.out.println("Холодно");
        }
    }
}
