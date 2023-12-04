package PavanClasses.PavanKumarYTClasses.InheriatanceConcept;

public class FinalVariableDemo {

    final int speed=40;         //Final Variable and we cannot change the value

    public static void main(String[] args)
    {
        FinalVariableDemo fmspeed = new FinalVariableDemo();
        //fmspeed.speed=100;                  //compile time error
        System.out.println(fmspeed.speed);
    }
}
