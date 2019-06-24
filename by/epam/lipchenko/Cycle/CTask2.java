package by.epam.lipchenko.Cycle;

import java.util.Scanner;

/*
 *  Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x, x>2;
 * y = -x, x<=2;
 * */
public class CTask2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double a;
        double b;
        double h;

        System.out.println("Enter a: ");
        a = inputDouble();
        System.out.println("Enter b: ");
        b = inputDouble();

        h = inputPosDouble();

        calculateFunc(a, b, h);
    }

    private static double inputDouble() {
        double x;
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a real number.");

            input.next();
        }
        x = input.nextDouble();


        return x;
    }

    private static double inputPosDouble() {
        double num;
        do {
            System.out.println("Enter h (positive real number only): ");

            while (!input.hasNextDouble()) {
                System.out.println("Invalid input! Please enter only a positive real number.");
                input.next();
            }
            num = input.nextDouble();
        } while (num <= 0);
        return num;
    }

    private static void calculateFunc(double a, double b, double h) {

        double y;

        for (double i = a; i <= b; i += h) {

            if (i <= 2) {
                y = -i;
            } else {
                y = i;
            }
            System.out.println("y = " + y + ", x = " + i);
        }
    }
}
