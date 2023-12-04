package PavanClasses.PavanKumarYTClasses.OOPConcept;

public class EmployeeClass {
    int eid;
    String ename;
    double sal;
    String deptno;
    String rank;

    //Method 1//
    void displayEmpDetails()      //Method is a piece of code in Java, sometimes it returns a value, then we specify THE RETURNTYPE in method like return type int etc.
    {                   // sometime Method doesn't return anything, so we say void

        System.out.println(eid);          //System.out.println is an inbuilt method for Java
        System.out.println(ename);
        System.out.println(sal);
        System.out.println(deptno);
        System.out.println(rank);
    }
    //METHOD 2//
    void bonus()
    {
        System.out.println((sal *10)/100);
    }

    //Now Main Method need , within the class, we have to create an object of Employee class.. we can assign values for the variables (Eid, ename etc.
    // and then call the method - displayEmpDetails, bonus


//    public static void main(String[] args){
//        EmployeeClass emp1 = new EmployeeClass();       //Syntax ---> ClassName Object = new CLassName --> Creation of an object
//        emp1.eid = 101;
//        emp1.ename = "David";
//        emp1.sal = 25000;
//        emp1.deptno = "Testing";
//        emp1.rank = "Manager";
//
//        emp1.displayEmpDetails();
//        emp1.bonus();
//    //By calling this method and assigning values to variable we will be able to execute and get the result
//    //OBJECT IS AN INSTANCE OF A CLASS, METHOD IS A BLOCK OF CODE WHICH CONTAINS LOGIC, VARIABLE ARE ASSIGNED VALUES
//
//        EmployeeClass emp2 = new EmployeeClass();
//        emp2.eid = 102;
//        emp2.ename = "Davidd";
//        emp2.sal = 250000;
//        emp2.deptno = "Testing";
//        emp2.rank = "Manager";
//
//        emp2.displayEmpDetails();
//        emp2.bonus();
//
//
//
//    }
}
