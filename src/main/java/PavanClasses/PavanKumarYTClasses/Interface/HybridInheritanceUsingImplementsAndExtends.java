package PavanClasses.PavanKumarYTClasses.Interface;
class ABC1
    {
    void m1()
        {
            System.out.println("This is m1 method from ABC1 Class");
        }
    }
    interface BD1
        {
            void m2();
        }
    interface BD2
        {
            void m3();
        }
public class HybridInheritanceUsingImplementsAndExtends extends ABC1 implements BD1,BD2 {
    @Override
    public void m2()
    {
        System.out.println("This is m2 method from BD1 Interface");
    }
    @Override
    public void m3()
    {
        System.out.println("This is m3 method from BD2 Interface");
    }
    public static void main (String[] args)
    {
        HybridInheritanceUsingImplementsAndExtends test = new HybridInheritanceUsingImplementsAndExtends();
        test.m1();
        test.m2();
        test.m3();
    }
}
