package PavanClasses.PavanKumarYTClasses.ExceptionHandling;

public class TryCatchFinally {

    public static void main(String[] args){


        String s = null;
        try {
            System.out.println(s.length());     //Throws NUllPointerException
        }
        catch(Exception e){
            System.out.println("Entered in to catch Block for NullPointerException");
        }
        finally
        {
            System.out.println("Entered Final Block");
        }
    }



}
