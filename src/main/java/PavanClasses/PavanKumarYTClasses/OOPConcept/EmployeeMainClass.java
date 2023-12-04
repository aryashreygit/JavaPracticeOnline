package PavanClasses.PavanKumarYTClasses.OOPConcept;

public class EmployeeMainClass {

    public static void main(String[] args){
        EmployeeClass emp1 = new EmployeeClass();       //Syntax ---> ClassName Object = new CLassName --> Creation of an object
        emp1.eid = 101;
        emp1.ename = "David";
        emp1.sal = 25000;
        emp1.deptno = "Testing";
        emp1.rank = "Manager";

        emp1.displayEmpDetails();
        emp1.bonus();
        //By calling this method and assigning values to variable we will be able to execute and get the result
        //OBJECT IS AN INSTANCE OF A CLASS, METHOD IS A BLOCK OF CODE WHICH CONTAINS LOGIC, VARIABLE ARE ASSIGNED VALUES

        EmployeeClass emp2 = new EmployeeClass();
        emp2.eid = 102;
        emp2.ename = "Davidd";
        emp2.sal = 250000;
        emp2.deptno = "Testing";
        emp2.rank = "Manager";

        emp2.displayEmpDetails();
        emp2.bonus();



    }
}
