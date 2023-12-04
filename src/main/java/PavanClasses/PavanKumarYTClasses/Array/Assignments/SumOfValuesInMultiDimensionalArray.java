package PavanClasses.PavanKumarYTClasses.Array.Assignments;

public class SumOfValuesInMultiDimensionalArray {
    public static void main (String[] args){

        //1st way to initialize an array and add vales//
        int a[][] = new int[2][2];
        //int [][]b = new int[4][3];
        int z=0;

        //Declaring an 2 dimensional array//
        a[0][0]=10;
        a[0][1]=20;

        a[1][0]=30;
        a[1][1]=40;

    //2nd way of declaring an array and add value//
    // int a[][]={ {100,200} , {300,400}, {500,600} };

    // System.out.println("No. of Rows " + a.length);
    // System.out.println("No. of Columns " + a[0].length);

        //Classic FOR LOOP/
        // NESTED LOOP Below//
//       for (int i=0; i<a.length; i++)      //OUTER LOOP//
//      {
//         for (int j=0; j<a[i].length; j++)   //Inner Loop//ONCE INNER LOOP IS DONE, IT WONT GO TO OUTER LOOP
//        {
//            z=(a[i][j])+z;
//        }
//      }
//
//        System.out.println(z);


        //=======//
        //ENHANCED FOR LOOP//
        for(int r[]:a)          //Move the data into a Single Dimensional Array
        {
            for (int i:r)
            {
                z=(i)+z;
            }
        }
        System.out.println(z);

    }
}
