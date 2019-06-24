package by.epam.lipchenko.LinearProg;

import java.util.Scanner;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 *
 * Задача решена методом поразрядной замены
 */

public class LPTask4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in 'nnn.ddd' format: ");
        double num = input.nextDouble();

        int nnn = (int) num;
        int ddd = (int) (num * 1000 % 1000);

        System.out.println("Entered number: " + num);
        System.out.println("After swapping: " + ddd + "." + nnn);
    }
}
