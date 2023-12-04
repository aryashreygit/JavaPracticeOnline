package PavanClasses.PavanKumarYTClasses.FrequentlyAskedPrograms;

public class Swapping2Numbers {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        System.out.println("Before Swapping values are --> "  +a+ " & "  +b);

//        //1st Logic - Using Third Variable//
//        int t=a;
//        a=b;
//        b=t;
//        System.out.println("1st logic - third variable - Swapped values are --> "  +a+ " & "  +b);

        //2nd Logic - use +(Add) -(subtract) operation//
        a=a+b;      //a=30; b=20
        b=a-b;      //b=10;
        a=a-b;      //a=20
        System.out.println("2nd logic - + & - operators - Swapped values are --> "  +a+ " & "  +b);

//        //3rd Logic - Multiplication & division logic (only when a & b sud not be zero)
//        a=a*b;      //a=200, b=20
//        b=a/b;      //a=200, b=10
//        a=a/b;      //a=200, a=20
//        System.out.println("3rd logic * & / operators - Swapped values are --> "  +a+ " & "  +b);

    }


}
