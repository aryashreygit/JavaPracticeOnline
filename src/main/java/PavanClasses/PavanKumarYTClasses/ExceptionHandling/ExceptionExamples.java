package PavanClasses.PavanKumarYTClasses.ExceptionHandling;

public class ExceptionExamples {
    public static void main(String[] args)
    {
        System.out.println("Pgm Started");

//        int a = 100;
//        try{
//            System.out.println(a/0);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Entered in the catch block");
//        }



        String s = "ABC";
        try {
            System.out.println(s.length());     //Throws NUllPointerException
        }
        catch(Exception e){
            System.out.println("Entered in to catch Block for NullPointerException");
        }
//
//        String x="abc";
//        int i=Integer.parseInt(x);          //NumberFormatException
//
//        int arr[]=new int[5];               //ArrayIndexOutofBoundException
//        arr[10]=100;


        System.out.println("Pgm closed");
    }
}
