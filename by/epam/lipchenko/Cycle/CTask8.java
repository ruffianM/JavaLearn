package by.epam.lipchenko.Cycle;


import java.util.Scanner;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class CTask8 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = InputNatural();
        System.out.println("Good! And another one...");

        int num2 = InputNatural();
        System.out.println("The matching digits of these numbers are: ");

        findMatchingDigits(num1,num2);
    }

    private static void findMatchingDigits(int num1, int num2) {

        for (int i = 0; i <= 9; i++) {              //Поочерёдно выбираем цифры от 0 до 9

            int remainder1 = num1;
            int remainder2 = num2;
            boolean flag1 = false;
            boolean flag2 = false;

            for (; remainder1 != 0; remainder1 /= 10) {   //...и сравниваем с каждым разрядом обоих чисел
                if (remainder1 % 10 == i) {
                    flag1 = true;
                    break;
                }
            }
            for (; remainder2 != 0; remainder2 /= 10) {
                if (remainder1 % 10 == i) {
                    flag2 = true;
                    break;
                }
            }
            if (flag1 && flag2) {
                System.out.print(i + " ");        //Если совпадение происходит в обеих случаях - выводим на экран
            }
        }
    }

    private static int InputNatural () {

            int num;

            do {
                System.out.println("Please enter integer number: ");

                while (!input.hasNextInt()) {
                    System.out.println("Invalid input! Please enter only integer number!");
                    input.next();
                }
                num = input.nextInt();
                num = java.lang.Math.abs(num);

            } while (num < 0);

            return num;
        }
}
