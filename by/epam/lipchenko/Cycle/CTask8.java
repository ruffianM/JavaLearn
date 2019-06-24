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
        findMatchingDigits(num1, num2);
    }

    private static void findMatchingDigits(int num1, int num2) {

        for (int i = 0; i <= 9; i++) {          //Цикл перебирает цифры от 0 до 9 и находит совпадения в числах.
            int remainder1 = num1;              //Если совпадение в обоих - то выводит число на экран
            int remainder2 = num2;
            boolean flag2 = false;
            boolean flag1 = false;

            while (remainder1 != 0) {

                if (remainder1 % 10 == i) {
                    flag1 = true;
                    break;
                }
                remainder1 /= 10;
            }

            while (remainder2 != 0) {

                if (remainder2 % 10 == i) {
                    flag2 = true;
                    break;
                }
                remainder2 /= 10;
            }

            if (flag1 && flag2) {
                System.out.print(i + " ");
            }
        }
    }

    private static int InputNatural() {

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
