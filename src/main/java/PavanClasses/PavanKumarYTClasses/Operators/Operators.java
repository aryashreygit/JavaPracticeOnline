package PavanClasses.PavanKumarYTClasses.Operators;

public class Operators {
    public static void main (String[] args){

        int a=10;
        int b=20;

        //Arithmetic operators --> + - * / %
        System.out.println("-----------------ArithmeticOperators-----------");
        System.out.println("Sum of a and b is:" +(a+b));
        System.out.println("Diff of a and b is:" +(a-b));
        System.out.println("Mul of a and b is:" +(a*b));
        System.out.println("Div of a and b is:" +(b/a));
        System.out.println("Mod div of a and b is:" +(a%b));

        //Relational Operators (Comparison Operators
        //Always return boolean value
        System.out.println("-----------------RelationalOperators-----------");
        System.out.println(a==b);   //False
        System.out.println(a>b);    //False
        System.out.println(a<b);    //True
        System.out.println(a>=b);   //False
        System.out.println(a<=b);   //True
        System.out.println(a!=b);   //True


        //Logical Operators  &&(AND) || (OR)  !(NOT) - works between two boolean

        boolean x=true;
        boolean y=false;
        System.out.println("-----------------LogicalOperators-----------");
        System.out.println(x && y);     //False
        System.out.println(x || y);     //True
        System.out.println(!x);         //False

        //Increment/decrement value
        a=a+1;
        System.out.println(a);      //11
        a++;
        System.out.println(a);      //12
        b--;
        System.out.println(b);      //19


    }
}
