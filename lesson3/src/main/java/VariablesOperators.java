import java.util.Scanner;

public class VariablesOperators {
    public static void main(String[] args) {
        //1. Написать программу для вывода названия поры года по номеру
        //месяца.При решении используйте оператор switch-case:
        Scanner in = new Scanner(System.in);
        int monthSw = in.nextInt();

        switch (monthSw) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
//        2. Написать программу для вывода названия поры года по номеру
//        месяца. При решении используйте оператор if-else-if.
        int monthIf = in.nextInt();

        if (monthIf == 1) {
            System.out.println("January");
        } else if (monthIf == 2) {
            System.out.println("February");
        } else if (monthIf == 3) {
            System.out.println("March");
        } else if (monthIf == 4) {
            System.out.println("April");
        } else if (monthIf == 5) {
            System.out.println("May");
        } else if (monthIf == 6) {
            System.out.println("June");
        } else if (monthIf == 7) {
            System.out.println("July");
        } else if (monthIf == 8) {
            System.out.println("August");
        } else if (monthIf == 9) {
            System.out.println("September");
        } else if (monthIf == 10) {
            System.out.println("October");
        } else if (monthIf == 11) {
            System.out.println("November");
        } else if (monthIf == 12) {
            System.out.println("December");
        }

//        3. Напишите программу, которая будет принимать на вход число и на
//        выход будет выводить сообщение четное число или нет.
//        Для определения четности числа используйте операцию получения
//        остатка от деления - операция выглядит так: '% 2').
        int number = in.nextInt();

        if (number % 2 == 0) {
            System.out.printf("Number %d is even", number);
        } else {
            System.out.printf("Number %d is odd", number);
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
