package PavanClasses.PavanKumarYTClasses.Polymorphism;

public class StaticVariableMethodExample {
    static int a=10;        //static variable
    int b=20;               //Non-static variable

    static void m1()        //static method
    {
        System.out.println("this is m1 a static method");
        StaticVariableMethodExample sc1 = new StaticVariableMethodExample();
        System.out.println(sc1.b);
        System.out.println("this is m1 a static method");
    }
    void m2()        //non-static method
    {
        System.out.println("this is m2 a non-static method");
    }
    void m3()
    {
        System.out.println("This is m3 - non-static method");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args){
        System.out.println(a);
        m1();
        //If calling from some other class
        System.out.println(StaticVariableMethodExample.a);
        StaticVariableMethodExample.m1();

//        System.out.println(b);  //incorrect, bcos b is non-static variable
//        m2();       //incorrect, cos m2() is non-static method

        //static methods can also access non-static stuff but through object

        StaticVariableMethodExample sc = new StaticVariableMethodExample();
        System.out.println(sc.b);       //non-static variables can be accessed with objects
        sc.m2();                        //non-static methods can be accessed with objects
        sc.m3();
    }
}
