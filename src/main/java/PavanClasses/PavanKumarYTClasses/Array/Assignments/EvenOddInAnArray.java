package PavanClasses.PavanKumarYTClasses.Array.Assignments;

import java.util.Scanner;

public class EvenOddInAnArray {
    public static void main(String[] args) {

        //Single Dimensional Array//
        int[] a = {2, 3, 4, 7, 7, 7};
        int x=0;
        int y=0;

        //Checking in Single Dimensional Array//

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                x++;
                System.out.println("Even Nos in Array : " + a[i] + " exists at " + (i + 1) + "th place");
            }
            else
            {
                y++;
                System.out.println("Odd Nos in Array : " + a[i] + " and exists at " + (i + 1) + "th place");
            }

        }
        System.out.println("No. of Even Nos. in Array: " +x);
        System.out.println("No. of Even Nos. in Array: " +y);
    }
}
