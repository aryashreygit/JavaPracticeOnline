package PavanClasses.PavanKumarYTClasses.OOPConcept;

public class MethodCalculationWithParameterAndReturnValue {
        int x=30;
        int y=50;
//        void sum()  //Case1 - Not Taking Any Parameter and NOT Returning Any Value
//    {
//        System.out.println(x+y);
//    }
//    int sum1()  //Case2 - Not Taking Any Parameter and BUT Returning Value == INT Sum1 will return an INTEGER
//    {
//        return(x+y);
//    }
//     void sum2(int a, int b)      //Case3 - Taking Parameters but not returning any value
//     {
//        System.out.println(a+b);
//     }
    int sum3(int a1, int b1)
    {
        return(a1+b1);              //Case4 - method is taking parameters and also returning a value
    }
    public static void main(String[] args)
    {
        MethodCalculationWithParameterAndReturnValue cal = new MethodCalculationWithParameterAndReturnValue();
        //Object must be created within the MAIN METHOD ONLY
        // -- DURING THE EXECUTION OF MAIN METHOD OBJECT WILL BE CREATED

        //cal.sum();  //Case1 - Not Taking Parameter and NOT Returning Any Parameter

//        int res = cal.sum1();             //Case2 - Not having parameters but returning a value
//        System.out.println(res);
        //System.out.println(cal.sum1());

        //cal.sum2(25,35);            //Case3 - Taking Parameters but not returning any value

        //System.out.println(cal.sum3(55, 65));




    }
}
