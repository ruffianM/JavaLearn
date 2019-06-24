package by.epam.lipchenko.LinearProg;

import java.util.Scanner;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 *
 * Задача решена методом поразрядной замены
 */


public class LPTask4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = 345.823;
        double numRes = replaceDigits(num);

        System.out.println("Initial number is: " + num);
        System.out.println("Result is: " + String.format("%.3f", numRes));
    }

    public static double replaceDigits(double r) {
        int n1, n10, n100, d10, d100, d1000;

        n100 = (int) r / 100;
        n10 = (int) r / 10 % 10;
        n1 = (int) r % 10;
        d10 = (int) (r * 10 % 10);
        d100 = (int) (r * 100 % 10);
        d1000 = (int) (r * 1000 % 10);

        return (d10 * 100) + (d100 * 10) + d1000 + ((double) n100 / 10) + ((double) n10 / 100) + ((double) n1 / 1000);
    }
}
