package by.epam.lipchenko.Branching;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BTask5 {
    public static void main(String[] args) {
        System.out.println("Enter x: ");
        double x = InputDouble();

        System.out.println(calcFunction(x));
    }

    private static double calcFunction(double x) {
        if (x <= 3) {

            System.out.print("x <= 3 then F = ");

            return (x * x) - 3 * x + 9;
        } else {
            System.out.print("x > 3 then F = ");

            return 1 / ((x * x * x) + 6);
        }
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
