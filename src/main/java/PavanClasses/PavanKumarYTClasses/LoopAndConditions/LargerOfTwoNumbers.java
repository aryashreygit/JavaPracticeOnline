package PavanClasses.PavanKumarYTClasses.LoopAndConditions;

import java.util.Scanner;

public class LargerOfTwoNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a>b){
            System.out.println("Larger no. = " +a);
        }
        System.out.println("Larger no. = " +b);
    }
}
