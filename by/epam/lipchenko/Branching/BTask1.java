package by.epam.lipchenko.Branching;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 *
 */

public class BTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first angle value (degrees): ");
        int angleA = InputInt();
        System.out.println("Enter the second angle value (degrees): ");
        int angleB = InputInt();

        if (checkCondOfExist(angleA, angleB)) {
            System.out.print("Triangle exists");
            if (checkCondOfRect(angleA, angleB)) System.out.print(" and it is rectangle");
        } else System.out.println("Triangle does not exist");

        System.out.println(".");

    }

    private static boolean checkCondOfExist(int a, int b) {
        return (a + b < 180);
    }

    private static boolean checkCondOfRect(int a, int b) {
        return (a + b == 90 || a == 90 || b == 90);
    }

    private static int InputInt() {
        int intNum;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                intNum = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value! Enter integer number!: ");
            }
        }
        return intNum;
    }
}
