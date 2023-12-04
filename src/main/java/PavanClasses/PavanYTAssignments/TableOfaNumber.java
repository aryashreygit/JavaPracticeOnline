package PavanClasses.PavanYTAssignments;

import java.util.Scanner;

public class TableOfaNumber {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j=0;
        for (j=0;j<=10;j++){
            System.out.println(i+ " X " +j+ " = " +(i*j));
        }
    }
}
