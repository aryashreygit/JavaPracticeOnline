package PavanClasses.PavanKumarYTClasses.Array;

public class SingleDimensionalArray {
    //Array is a collection of elements of same data type
    //2 types of Array 1)Single Dimensional Array 2)Two/Multi dimensional array

    //Single Dimension Array//
    // 1) Declare an array
    // 2) Insert values into array
    // 3)Find size of an array
    // 4) read values from an array
    public static void main (String[] args) {
//        int a[] = new int[5];   //Fixed size array - here size =5//
//
//        //int[] b = new int[5];
//        a[0]=100;
//        a[1]=200;
//        a[3]=300;
//        a[2]=400;
//        a[4]=500;

        int a[] = {100,200,300,400,500,600,700};    //Declare any array without specifying the size//

        //How Many values in an array or size of the array//
        //System.out.println("Length of an array : " +(a.length));
//        for(int i=0; i<a.length; i++) {
//            System.out.println(a[i]); //reading the specific value by identifying the index

            //for(initialization, condition, inc/dec
            // {
            //Statements
            // }

            //--Advanced FOR Loop/Enhanced FOR Loop//

//        //ADVANCED FOR LOOP//
        for(int i:a)
        {
            System.out.println(i);
        }

    }

}
