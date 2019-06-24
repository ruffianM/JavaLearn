package by.epam.lipchenko.LinearProg;
/*
 *Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 *данное значение длительности в часах, минутах и секундах в следующей форме:
 *ННч ММмин SSc.
 */

import java.util.Scanner;

public class LPTask5 {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд: ");
        Scanner input = new Scanner(System.in);

        int seconds = input.nextInt();

        secFormat(seconds);
    }

    private static void secFormat(int sec) {

        int hh = sec / 3600;
        int mm = sec % 3600 / 60;
        int ss = sec % 60;

        System.out.println(sec + "с это " + hh + "ч " + mm + "мин " + ss + "с.");
    }
}
