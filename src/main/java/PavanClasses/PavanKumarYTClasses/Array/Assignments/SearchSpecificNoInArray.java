package PavanClasses.PavanKumarYTClasses.Array.Assignments;

import java.util.Scanner;

public class SearchSpecificNoInArray {
    public static void main(String[] args)
    {

        //Single Dimensional Array//
        int []a = {2, 3, 4, 7, 7, 7};

//    int [][]b = { {3,4} , {8,9} };

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int z =0;

        //Checking in Single Dimensional Array//

            for (int i=0; i<a.length; i++)
            {
              if(k==a[i])
              {
              System.out.println("Matching no. exists in array at " +(i+1)+"th place");
              z++;
              }

            }

            if(z>=1)
            {
              System.out.println("Enter No. exists in the array");
              System.out.println("No. of times entered no. exists in array: " +z);
            }
            else
            {
                System.out.println("Enter No. doesn't exist in the array");
            }

    }

}
