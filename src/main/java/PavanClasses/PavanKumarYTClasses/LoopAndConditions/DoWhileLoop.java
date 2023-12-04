package PavanClasses.PavanKumarYTClasses.LoopAndConditions;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 20;             //Do While is very rare
                                // While - 1st round condition will be verified
                                //Do-while - 1st round condition won't be verified, only in the 2nd round
        do {
            System.out.println(i);
        }
        while(i<=10);
    }
}

