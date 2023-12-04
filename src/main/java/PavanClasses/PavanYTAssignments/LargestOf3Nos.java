package PavanClasses.PavanYTAssignments;

import java.util.Scanner;

public class LargestOf3Nos {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        if (i>j && i>k){
            System.out.println("Largest No: " +i);
        }
        else if (j>i && j>k){
            System.out.println("Largest No: " +j);
        }
        else{
            System.out.println("Largest No: " +k);
        }
    }
}
