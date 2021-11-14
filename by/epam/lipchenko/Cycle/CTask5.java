package by.epam.lipchenko.Cycle;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 * an = (1 / 2^n) + (1 / 3^n)
 */

public class CTask5 {
    public static void main(String[] args) {

        double e = 0.00012345;
        double sum = 0;

        for (int i = 1;; i++) {

            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

                if (a >= e) {
                    sum += a;
                } else break;
        }
        System.out.println("The sum is " + sum);
    }
}
