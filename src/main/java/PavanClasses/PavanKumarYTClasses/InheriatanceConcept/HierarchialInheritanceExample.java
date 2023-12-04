package PavanClasses.PavanKumarYTClasses.InheriatanceConcept;

class Parent
{
    int a;
    void display()
    {
        System.out.println("parent -> " +a);
    }
}
class Child1 extends Parent
{
    int x;
    void show()
    {
        System.out.println("Child1 extends Parent -> " +x);
    }
}
class Child2 extends Parent
{
    int y;
    void print()
    {
        System.out.println("Child2 extends Parent -> " +y);
    }
}
public class HierarchialInheritanceExample {
    public static void main(String[] args){
        Child1 c1=new Child1();
        c1.a=100;
        c1.x=200;
        c1.show();
        c1.display();

        System.out.println("===========");

        Child2 c2 = new Child2();
        c2.y=300;
        c2.a=500;
        c2.print();
        c2.display();

    }
}
