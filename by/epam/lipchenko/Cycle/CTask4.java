package by.epam.lipchenko.Cycle;

import java.math.BigInteger;

/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 *
 */

public class CTask4 {
    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            a = a.multiply(BigInteger.valueOf(i * i));

        }
        System.out.println("The sum of squares of the first 100 numbers is " + a);
    }
}
