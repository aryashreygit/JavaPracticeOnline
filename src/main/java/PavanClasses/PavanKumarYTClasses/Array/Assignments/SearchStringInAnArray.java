package PavanClasses.PavanKumarYTClasses.Array.Assignments;

import java.util.Scanner;

public class SearchStringInAnArray {

    public static void main(String[] args)
    {

        //Single Dimensional Array//
        String[] test = { "apple" , "banana", "orange" };
        int z=0;

//    int [][]b = { {3,4} , {8,9} };

        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        //Checking in Single Dimensional Array//

//        for (String str : array) {
//            if (str.equals(searchString)) {
//        for(int i:a)

        // }

        for (int i=0; i<test.length; i++)
        {
            if((test[i].equals(search)))

            // for(int i:test){
            // if (i.equals(search)
            {
                System.out.println("Matching string exists in array at " +(i+1)+"th place");
                z++;
            }

        }

        if(z>=1)
        {
            System.out.println("Entered String exists in the array");
            System.out.println("No. of times entered string exists in array: " +z);
        }
        else
        {
            System.out.println("Entered String doesn't exist in the array");
        }

    }
}
