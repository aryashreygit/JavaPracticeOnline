package PavanClasses.PavanKumarYTClasses.Strings.Assignment;

public class StringsAssignment {
    public static void main(String[] args){
        String s="Welcome";
        String s1="welcome";

        //Compare two Strings; ignoring case differences
        System.out.println(s.equalsIgnoreCase(s1));     //true

        //Concatenate
        System.out.println(s.concat(s1));               //Welcomewelcome

        //Length of string
        System.out.println(s.length());                 //7
        System.out.println(s1.length());                //7

        //Substring of a given String between 2 specified positions
        System.out.println(s.substring(3,7));           //Come

        //Uppercase Lowercase
        System.out.println(s1.toUpperCase());           //WELCOME
        System.out.println(s.toLowerCase());            //welcome

    }
}
