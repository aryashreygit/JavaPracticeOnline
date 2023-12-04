package PavanClasses.PavanKumarYTClasses.InheriatanceConcept;

class Bank
{
    double rateOfInterest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    double rateOfInterest()
    {
        return 10.5;
    }
}
class HDFC extends Bank
{
    double rateOfInterest()
    {
        return 11.5;
    }
}

public class MethodOverridingExample {
    public static void main (String[] args)
    {
        SBI sbiROI = new SBI();
        System.out.println("SBI Interest Rate--> " +sbiROI.rateOfInterest());

        HDFC hdfcROI = new HDFC();
        System.out.println("HDFC Interest Rate--> " +hdfcROI.rateOfInterest());
    }


}
