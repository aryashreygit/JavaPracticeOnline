package PavanClasses.PavanKumarYTClasses.OOPConcept;

public class OOPConceptInDetail {

    //Class
    //Object
    //Method

    //What is Class - Class is collection of variables and methods
    //example - Animal is a logical entity where dog, elephant, cat are physical entity
    //Logical entity is called as Class -- Physical Entity is called Objects - same attributes and behavior
    //Attributes can be called as Variables where behavior is methods

    //Employee - id+name+designation+salary(variables) +++ bonus() --> method.. Object --> id=101, name=David, salary=10K
    //Object 1 (Emp) is different from Obj 2(Emp) as they have separate memory space


    //By calling this method and assigning values to variable we will be able to execute and get the result
    //OBJECT IS AN INSTANCE OF A CLASS, METHOD IS A BLOCK OF CODE WHICH CONTAINS LOGIC, VARIABLE ARE ASSIGNED VALUES

    //Main() method can be present in the same class --> we cant share this class
    //Main() method can be present in a separate class --> we can share this class

    //Class Variables
    //We can assign values to variables by using  1) Reference variable 2) Method 3) Constructor
    //Methods can take parameters or will not take parameters
    //Constructor is Special Type of Method, used for initializing the class variables (not even logic), constructor should have same name as Class Name
    //Constructor will not return any value, not even VOID
    //Constructor doesn't need to call a constructor -- Constructor will be invoked at the time of object creation

    //Method is a BLOCK OF CODE
    //How many ways we can create a Method
    //Case1 - No Parameter and No Return Value
    //Case2 No Parameter - Return a Value
    //Case3 - Use a Parameter - Don't Return a Value
    //Case4 - Can take a Parameter - And will also Return a Value

    //2 types of Constructor
    //Default Constructor - if constructor takes default value
    //Parameterized Constructor - if constructor takes a parameter

    //Class & Object
    //Polymorphism - Instead of creating different multiple methods (M1, M2, M3), lets have one method which will take multiple parameters (2 parameters, 3 parameters)
    // Same method name but with different set of inputs or parameters
    // Multiple methods will take multiple memory, so single method with different parameter will take less memory
    //Create one method and will assist with multiple purposes - Overloading
    //Polymorphism is a OOP concept, Overloading is an approach. Overload Methods and Overload Constructors (same name as Class)
    //What is Overloading - creating methods and constructors with the same name with different parameters
    //Advantage of Overloading - saves memory, saves time & 2 Certain Rules - 1) Number of parameters && 2) DataType of Parameter
    //Certain Rules - Create a class (it contains multiple methods)
    //In Constructor Overloading, Class XYZ -- Constructor Name will XYZ, parameter and datatype
    //Can we create multiple Main Methods - we can overload Main Method
    //Problem with Overloading --> this keyword differentiate b/w class variables and method variables

    //Static keyword is applicable for Methods and Variables
    //We define Static variable at the Class level -- static is a shared variable
    //Static Variables and Static Methods - within class, we can have static variable or static method or non-static variable or non-static method
    //1.Static methods can access only static stuff directly, direct access ( directly - without creating an object)
    //2. static methods can also access non-static stuff but through object
    //3. Non-static methods can access both static and non-static stuff directly

    //Inheritance -- extends keyword "B extends A" A is called as Parent/Superclass/BaseClass, B is called Child, Subclass/Derived -Reusability
    //Inheritance - Acquiring all the properties & behavior from one class to another class is called as Inheritance
    //parent/base class/super class --> child class/sub class/ derived class
    //5 types of Inheritance - 1) Single (Extends) 2) Multilevel (Extends) 3) Hierarchical (Extends) 4) Multiple (Interface/Implements) 5) Hybrid (Interface/Implements)
    //MethodOverriding --> definition should not change -- if a parent method is returning void and has Int datatype, child sud also have void return and int datatype
    //OVERRIDING --> Method sud remain the same, but body can change in CHILD CLASS, OVERRIDING CAN ONLY BE ACHIEVED BY INHERITANCE
    //What is the diff b/w METHODOVERLOADING AND METHODOVERIDING
    //OVERLOADING#01 - we sud change the definition of the method, uniquely identify those methods
    //OVERRIDING#01 - we must not change the definition of the method, only the body
    //OVERLOADING#02 - can be achieved without Inheritance also, single class multiple methods
    //OVERRIDING - can only be achieved if you have PARENT CLASS AND CHILD CLASS - thru Inheritance.EXAMPLE

    //SUPER KEYWORD  can be used within Inheritance
    //--used to refer immediate parent class instance variable
    //--used to invoke immediate parent class method
    //--used to invoke immediate parent class constructor

    //FINAL Keyword
    //-- can be used to define a variable and cannot change at all, basically it is a constant
    //Final can be used for variable, method & class
    //FINAL Variable --> value of that variable cannot be changed
    //FINAL METHOD --> method cannot be overridden in the child class
    //FINAL CLASS --> class cannot be extended to other class

    //Java Interfaces
    //An Interface in JAVA is a blueprint of a class
    //Interface contains final and static variables
    //Interface contains abstract methods
    //An abstract method is a method which contains definition but not body
    //Methods in interface are PUBLIC by default  -> you cannot use any other access modifier in Interface
    //CLASS EXTENDS CLASS, INTERFACE EXTENDS INTERFACE, INTERFACE IMPLEMENTS CLASS
    //Interface supports the functionality of multiple inheritance
    //We can define interface with interface keyword
    //A class extends another class, an interface extends another interface but a class implements an interface
    //We can create Object reference for Interface but we cannot instantiate interface

    //WHY INTERFACE?? --> Selenium Webdriver is an Interface.. Created Interface as Webdriver, in this Webdriver they have created abstract methods
    // for each browser they have created different class, chromedriver class.. firefox driver --> browser classes, for each browser they have created different class
    //Hybrid will have both implements and extends

    //Four Access Modifier - public, private, protected, default

    //Package is a collection of Classes, Interfaces, other files, stored in home directory
    //How Package1 (Class A) talks to Package2 (Class B) --> import Package1 in Package2 && Class B extends Class A
    //Two types of Packages - 1) User Defined Packages  2) Pre-Defined/Built-In Packages --using Import Keyword

    //Access Modifier - Scope of variables and methods
    // Public, Protected, Default, Private
    //Private - can be accessed only within the class, cannot access outside of class
    //Default - can be accessed within the Package and by classes which are part of Package
    //Protected - is accessible within package and outside of package but through Inheritance only
    //Public - no restriction and can be accessed from anywhere.. within class, within package outside the package - no need to use Extends

    //Exception Handling
    //Exception - an event which will terminate the program
    //Error - Syntax issues called as Error
    //Compiler --> will execute your program line by line
    //Exception is an abnormal condition. in Java, exception is an event that will disrupt the normal flow of the program
    //Exception Handling - Program will throw an exception, we will handle the exception, and rest of the code can be handled/executed
    //Different Types of Exception
    //Checked Exceptions and Unchecked Exceptions
    //Checked Exception - Exceptions checked/identified by the compiler. These are shown at the design time
    //InterruptedException, IOException, FileNotFoundException
    //Unchecked Exception - Exceptions which are not checked/identified by compiler, these happen during runtime
    //Example of Unchecked Exception - a)ArithmeticException b) NullPointerException c) NumberFormatException d) ArrayIndexOutOfBoundException

    //Handing Exception - try catch block
    //try
    // {
    //statements;
    //catch(Exception Type)
    //{
    //statements (Remedy)
    //}

    //Finally block is always executed - a) Exception doesn't occur b) Exception occurs and not handled c) Exception occurs and handled

    //Checked Exception can be handled using try catch block && throws keyword

    //ArrayList
    //HashMap
    //JDBC
    //Derived Data Types(Collections)
    //ArrayList --
    //Array is fixed and stores only same type of datatype

    //ArrayList - we can store different type of datatypes and no limit
    //Operations on ArrayList
    //How to declare Array List
    //How to add elements/values to array list
    //Find size of Array List
    //Read values from ArrayList
    //Remove Elements or values from array list

    //If not ArrayList you can also use
    //Object a[]=new Object[5]

    //Another Collection in Java is HashMap - data structure in Java, how data will be stored in HashMap
    //KeyValue Pair -- Key must be unique whereas Value can be duplicate
    //Declare HashMap
    //Remove Elements from HashMap
    //remove elements from HashMap
    //read pairs from HashMap

    //JDBC = Java Database Connectivity
    //



}
