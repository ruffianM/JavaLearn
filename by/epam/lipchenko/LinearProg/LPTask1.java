package by.epam.lipchenko.LinearProg;
/*
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 *
 */

import java.io.*;

public class LPTask1 {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        double z, a, b, c;
        System.out.println("Введите a: ");
        a = inputDouble();
        System.out.println("Введите b: ");
        b = inputDouble();
        System.out.println("Введите c: ");
        c = inputDouble();
        z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }

    private static double inputDouble() {
        double v;

        while (true) {
            try {
                v = Double.parseDouble(bufferedReader.readLine());
                break;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Некорректный ввод. Введите числовое значение.");
            }
        }
        return v;
    }
}
