package by.epam.lipchenko.Cycle;

import java.util.Scanner;

/*
* Напишите программу, где пользователь вводит любое целое положительное число.
* А программа суммирует все числа от 1 до введенного пользователем числа.
*/

public class CTask1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        long sum = 0;

        do {
            System.out.println("Please enter a positive number!");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter only positive integer.");
                input.next();
            }
            num = input.nextInt();
        } while (num <= 0);

        for(int i=1;i<=num;i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + num + " is " + sum);

    }

}