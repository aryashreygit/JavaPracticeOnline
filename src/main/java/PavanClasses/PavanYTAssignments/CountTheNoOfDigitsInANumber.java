package PavanClasses.PavanYTAssignments;

import java.util.Scanner;

public class CountTheNoOfDigitsInANumber {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextInt();
        double j=0;
        double k = i/(Math.pow(10, j));

        while (i>(Math.pow(10, j)))
        {
            j++;        //Increment
        }
        System.out.println("No. of digits: " +(j));
        }
}
