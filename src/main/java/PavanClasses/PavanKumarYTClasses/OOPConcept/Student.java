package PavanClasses.PavanKumarYTClasses.OOPConcept;

public class Student {

    int studid;
    String studname;
    char grade;

    Student(int id1, String name1, char g1)     //CONSTRUCTOR
    {
        studid=id1; studname=name1; grade=g1;
    }
    void getValues(int id, String name, char g)     //METHOD
    {
        studid=id; studname=name; grade=g;
    }

    void display(){
        System.out.println(studid+" "+studname+" "+grade);
    }
}
