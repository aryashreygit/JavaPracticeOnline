package PavanClasses.PavanKumarYTClasses.Interface;
interface A
        {
        int a=20;               //By default variables in Interface are Static and Final
        void m1();              //This is an Abstract Method - by default it's public
        }

public class InterfaceExampleTestClass implements A
    {
    public void m1()           //Same or higher MODIFIER --default is lesser than public... public > default > protected > private -- accessibility
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
//        InterfaceExampleTestClass t = new InterfaceExampleTestClass();   //INSTANTIATION - In Main Method we have to create an object of class and then access the Method
//        t.m1();

        //Using an Interface to Instantiate
        A a = new InterfaceExampleTestClass();      //Variable of an Interface and Instantiate a Class, this will create a memory
        a.m1();
    }
}
