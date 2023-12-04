package PavanClasses.PavanKumarYTClasses.Polymorphism;

public class MethodOverloading {
    //Create multiple methods
    void add(int a, int b)          //1st method
    {
     System.out.println(a+b);
    }
    void add(int a, double b)       //2nd Method
    {
        System.out.println(a+b);
    }
    void add(double a, double b)    //3rd Method
    {
        System.out.println(a+b);
    }
    void add(int a, int b, int c)   //4th Method
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        //Create object for this class
        MethodOverloading mo = new MethodOverloading();         //Creation of Object mo from the class//
        mo.add(10, 20);     //1st method
        mo.add(10, 20.2);   // 2nd method
        mo.add(20.5, 30.9);    //3rd method
        mo.add(2, 3, 4);    //4th Method
    }
}
