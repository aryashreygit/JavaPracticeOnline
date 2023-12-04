package PavanClasses.PavanKumarYTClasses.Polymorphism;

public class ThisKeyword {
    int a,b;            //instance variable or class variables
    void getValues(int a, int b)            //x, y are Method Variables/external variables
    {
        this.a=a;                           //this.a means the keyword denotes that the variable belongs to the class
        this.b=b;                           //this keyword is used when you want to use Class variable name as Method Variable name
    }
    void printValues()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args){
            ThisKeyword th = new ThisKeyword();
            th.getValues(2, 3);
            th.printValues();
    }
}
