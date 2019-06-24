package by.epam.lipchenko.LinearProg;

import java.util.Scanner;

import static java.lang.Math.*;

/*
 *Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (sinx + cosy)/(cosx-siny)*tgxy
 */

public class LPTask3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x, y, result;

        System.out.println("Enter x:");
        x = Math.toDegrees(input.nextDouble());

        System.out.println("Enter y:");
        y = Math.toDegrees(input.nextDouble());

        result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        System.out.println("Result is: " + result);
    }
}
