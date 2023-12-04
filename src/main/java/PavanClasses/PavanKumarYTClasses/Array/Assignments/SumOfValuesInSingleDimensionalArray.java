package PavanClasses.PavanKumarYTClasses.Array.Assignments;

public class SumOfValuesInSingleDimensionalArray {
    public static void main(String[] args){

        int a[] = {1,2,3,4,5,6};
        int k=0;

        for(int i =0; i<a.length; i++){
            k=a[i]+k;
        }
        System.out.println(k);

        int b[] = {2,3,4,5};
        int z=0;
        for (int j:b)
        {
            z=j+z;
        }
        System.out.println(z);
    }

}
