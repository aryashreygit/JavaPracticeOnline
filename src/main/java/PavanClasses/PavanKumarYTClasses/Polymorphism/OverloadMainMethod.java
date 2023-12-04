package PavanClasses.PavanKumarYTClasses.Polymorphism;

public class OverloadMainMethod {
    //Order of writing/creation of Methods doesn't matter, Methods sud be independent and sudn't be inside another method
    public void main(int x){
        System.out.println(x);
    }
    public void main(int x, int y){
        System.out.println(x+y);
    }
    public static void main(String[] args){     //Execution will start from Main MAIN Method
         OverloadMainMethod om1 = new OverloadMainMethod();//Calling the main method
         om1.main(100);
         om1.main(10, 20);
    }
}
