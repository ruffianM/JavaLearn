package by.epam.lipchenko.Cycle;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class CTask6 {

    public static void main(String[] args) {

        for (int i = 1; i < 511; i++) {

            if (!(i == 10 || i == 13)) {
                System.out.printf("%4s   -  %4d    ", (char) i, i);
            }

            if (i % 10 == 0) {                 //10 - количество столбцов в строке вывода
                System.out.println();
            }
        }
    }
}
