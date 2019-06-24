package by.epam.lipchenko.Cycle;

import java.math.BigInteger;

/*
 * Найти сумму квадратов первых ста чисел.
 */

public class CTask3 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(0);

        for (int i = 1; i <= 100; i++) {
            int count = i * i;

            a = a.add(BigInteger.valueOf(count));
        }
        System.out.println("The sum of squares of the first 100 numbers is " + a);
    }
}
