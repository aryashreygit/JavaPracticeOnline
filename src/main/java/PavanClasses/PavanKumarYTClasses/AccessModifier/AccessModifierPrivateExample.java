package PavanClasses.PavanKumarYTClasses.AccessModifier;
class ABC
{
    private int data=10;                                    //Only within the Class
    private void m1()
    {
        System.out.println("Private Access Modifier");
    }
}

public class AccessModifierPrivateExample {

    public static void main(String[] args)
    {
        ABC aobj = new ABC();
//        aobj.data=20;
//        aobj.m1();

    }
}
