package PavanClasses.PavanKumarYTClasses.OOPConcept;

public class MoreAboutConstructor {
    int x;
    int y;
    MoreAboutConstructor()          //Constructor will have the name as Class Name and must not return a value
    {
       x=15; y=25;                  //Default Constructor as it's not taking any parameters
    }

    MoreAboutConstructor(int a, int b)  //Parameterized constructor
    {
        x=a; y=b;
    }
    void display(){
        System.out.println(x+y);
    }
    public static void main(String[] args){
        MoreAboutConstructor demo = new MoreAboutConstructor();    //Invokes default constructor
        demo.display();

        MoreAboutConstructor demo1 = new MoreAboutConstructor(45, 55);  //Invokes Parameterized Constructor
        demo1.display();

    }
}
