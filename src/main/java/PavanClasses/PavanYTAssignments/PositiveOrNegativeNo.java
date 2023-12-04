package PavanClasses.PavanYTAssignments;

import java.util.Scanner;

public class PositiveOrNegativeNo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i-0>0){
            System.out.println("Positive No");
        }
        else{
            System.out.println("Negative No");
        }

    }
}
