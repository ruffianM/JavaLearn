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
        double a;
        boolean cycleTrigger = true;

        for (int i = 1; cycleTrigger; i++) {      //Запускаем цикл

            a = 1 / Math.pow(i + 1, i);         //Вычисляем первый член ряда
            if (a >= e) {                      //И если он больше е,
                sum += a;                    //то добавляем к сумме
            } else cycleTrigger = false;   //Если становится а<е, то триггер завершает цикл

        }
        System.out.println("The sum is " + sum);
    }
}
