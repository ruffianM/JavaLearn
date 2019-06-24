package by.epam.lipchenko.Branching;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Ветвление. Задача 4.
* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
*/

public class BTask4 {
    public static void main(String[] args) {

        double x, y, z, a, b;

        System.out.println(" To find out if the BRICK with (x,y,z) sizes is able to pass through the rectangle HOLE\n " +
                "with (a,b) sizes, enter this values\n Enter x: ");

        x = InputDouble();
        System.out.println("y: ");
        y = InputDouble();
        System.out.println("z: ");
        z = InputDouble();
        System.out.println("a: ");
        a = InputDouble();
        System.out.println("b: ");
        b = InputDouble();

        if(checkPassability(x,y,z,a,b)) {
            System.out.println("Brick passes through the hole.");
        }
        else System.out.println("BRICK SHALL NOT PASS!!!");
    }
    private static double InputDouble(){
        double realNum;
        while(true) {
            try{
                Scanner input = new Scanner(System.in);
                realNum = input.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Incorrect value! Enter real number!: ");
            }
        }
        return realNum;
    }

    private static boolean checkPassability(double x,double y,double z,double a,double b){
        return  (((  a > x && b > y) || (a > y && b > x))
                || ((a > x && b > z) || (a > z && b > x))
                || ((a > z && b > y) || (a > y && b > z)));

    }
}
