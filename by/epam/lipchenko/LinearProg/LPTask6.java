package by.epam.lipchenko.LinearProg;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 *
 * */
public class LPTask6 {
    public static void main(String[] args) {
        double x, y;

        System.out.println("Enter x: ");
        x = InputDouble();
        System.out.println("Enter y: ");
        y = InputDouble();
        boolean res = checkOutBelongs(x, y);
        System.out.println("Point(x,y) belongs to shaded segment: " + res);
    }

    private static boolean checkOutBelongs(double x, double y) {
        return (Math.abs(x) <= 4) && (y >= -3) && (y <= 0) || (Math.abs(x) <= 2) && (y <= 4) && (y >= 0);
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
