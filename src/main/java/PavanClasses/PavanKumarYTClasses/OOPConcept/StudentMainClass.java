package PavanClasses.PavanKumarYTClasses.OOPConcept;

public class StudentMainClass {
    public static void main(String[] args){
        Student stud1 = new Student(1030, "John WICK", 'G');        //3. Assign Values using Constructor

        //1. Assign Values by Using Reference variable
//        stud1.studid = 1010;
//        stud1.studname = "john";
//        stud1.grade = 'A';

        //2. Assign Values Using Methods
        //stud1.getValues(1020, "Wick", 'A');

        stud1.display();




    }

}
