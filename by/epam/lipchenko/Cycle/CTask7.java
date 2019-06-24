package by.epam.lipchenko.Cycle;

import java.util.Scanner;

/*
* Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
*/

public class CTask7 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int m;
        int n;

        System.out.println("To find the dividers of range of numbers enter two numbers this range begins and ends with.");
        m = InputNatural();
        System.out.println("Good! And another one.");
        n = InputNatural();
        findDivOfRangeNat(m,n);
    }

    private static int InputNatural() {

        int num;

        do {
            System.out.println("Please enter a natural number (0 is not natural): ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter only natural number!");
                input.next();
            }
            num = input.nextInt();

        } while (num < 1);

        return num;
    }

    private static void findDivOfRangeNat(int m,int n){
        if(n<m){
            int q = n;
            n = m;
            m = q;
        }
        while(m<=n){

            System.out.print("Dividers of " + m + ": ");

            for(int i=2; i<=m/2; i++) {

                if (m%i==0){
                    System.out.print(i+" ");
                }
            }
            m++;
            System.out.println("");
        }
    }
}
