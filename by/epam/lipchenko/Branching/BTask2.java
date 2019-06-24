package by.epam.lipchenko.Branching;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class BTask2 {
    public static void main(String[] args) {

        double a, b, c, d;

        System.out.println("Enter 4 numbers in a row (press Enter after each)");
        a = InputDouble();
        b = InputDouble();
        c = InputDouble();
        d = InputDouble();

        System.out.println("Max value of mins is " + searchForMax(a, b, c, d));
    }

    private static double searchForMax(double a, double b, double c, double d) {
        double min1 = a < b ? a : b;
        double min2 = c < d ? c : d;
        return min1 > min2 ? min1 : min2;

    }

    private static double InputDouble() {
        double realNum;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                realNum = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value! Enter real number!: ");
            }
        }
        return realNum;
    }

}
