package PavanClasses.PavanKumarYTClasses.InheriatanceConcept;

class A
{
    double a;
    void display()
    {
        System.out.println(a);
    }
}
class B extends A       //B is Child class, A is parent class
{
    int b;
    void print()
    {
        System.out.println(b);
    }
}

class C extends B       //B is Child class, A is parent class
{
    int c;
    void show()
    {
        System.out.println(c);
    }
}

public class InheritanceExample {
    public static void main(String[] args){
        A aobj = new A();
        aobj.a=10.55;
        aobj.display();

        B bobj=new B();
        bobj.a=11.55;
        bobj.b=10;

        bobj.display();
        bobj.print();

        C cobj=new C();
        cobj.a=12.69;
        cobj.b=19;
        cobj.c=9;

        cobj.display();
        cobj.print();
        cobj.show();


    }

}
