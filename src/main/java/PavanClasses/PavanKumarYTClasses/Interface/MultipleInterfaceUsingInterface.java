package PavanClasses.PavanKumarYTClasses.Interface;
//Create Parents as Interface and Class as Child
//A Class can implements multiple Interface

interface ABC
{
    int x=800;
    void m1();
}
interface XYZ
{
    int y= 900;
    void m2();
}

public class MultipleInterfaceUsingInterface implements ABC, XYZ{           //MultipleInterfaceUsingInterface is a child class
    public void m1()
    {
        System.out.println(x);
    }
    public void m2()
    {
        System.out.println(y);
    }

    public static void main(String[] args)
    {
    ABC a = new MultipleInterfaceUsingInterface();
    XYZ b = new MultipleInterfaceUsingInterface();
    a.m1();
    b.m2();
    }
}
