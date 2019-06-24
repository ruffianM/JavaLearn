package by.epam.lipchenko.LinearProg;

import java.util.Scanner;

import static java.lang.Math.*;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑏+√𝑏^2+4𝑎𝑐)/2𝑎−𝑎^3*𝑐+𝑏^(−2)
 */

public class LPTask2 {
    public static void main(String[] args) {
        double a, b, c, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите a, не равное нулю:");

        a = input.nextDouble();

        if (a == 0) {
            do {
                System.out.println("a не должно быть равно 0! Введите другое значение:");
                a = input.nextDouble();
            } while (a == 0);
        }
        System.out.println("Введите b:");
        b = input.nextDouble();
        System.out.println("Введите c:");
        c = input.nextDouble();

        result = (b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a - pow(a, 3) * c + pow(b, -2);
        System.out.println("Результат вычислений: " + result);
    }
}
