package PavanClasses.PavanKumarYTClasses.InheriatanceConcept;

public class SuperExampleAnimal {
    String color="White";
    void eating()
    {
        System.out.println("Eating.....");
    }
    SuperExampleAnimal()
    {
        System.out.println("ExampleAnimal is created");
    }
}

class Dog extends SuperExampleAnimal
{
    String color="Black";
//    void displaycolor()
//    {
//        System.out.println(color);
//        System.out.println(super.color);
//    }

//    void eating()
//    {
//        System.out.println("Eating Bread.....");
//        super.eating();
//
//
//    }
    Dog()
    {
        super();
        System.out.println("Dog is created");

    }
}
