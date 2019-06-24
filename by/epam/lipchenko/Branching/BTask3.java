package by.epam.lipchenko.Branching;

/*
* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
*
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class BTask3 {
    public static void main(String[] args) {

        int x1, x2, x3, y1, y2, y3;

        System.out.println("Enter the coordinates of point A(x,y)");
        x1 = InputInt();
        y1 = InputInt();

        System.out.println("Enter the coordinates of point B(x,y)");
        x2 = InputInt();
        y2 = InputInt();

        System.out.println("Enter the coordinates of point C(x,y)");
        x3 = InputInt();
        y3 = InputInt();

        if(pointsOnLine(x1,y1,x2,y2,x3,y3)) System.out.println("Points lie on a straight line.");
        else System.out.println("Points does not lie on a straight line.");
    }
    private static boolean pointsOnLine(int x1,int y1,int x2,int y2,int x3,int y3){
        return (x1 - x3)*(y2 - y3) == (x2 - x3)*(y1 - y3);
    }

    private static int InputInt(){
        int intNum;
        while(true) {
            try{
                Scanner input = new Scanner(System.in);
                intNum = input.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Incorrect value! Enter integer number!: ");
            }
        }
        return intNum;
    }
}
