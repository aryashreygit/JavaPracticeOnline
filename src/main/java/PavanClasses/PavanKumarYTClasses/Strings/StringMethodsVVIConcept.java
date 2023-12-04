package PavanClasses.PavanKumarYTClasses.Strings;

public class StringMethodsVVIConcept {
    public static void main(String[] args){

        String s = "welcome";
        String s1=" to java";
        //Length Method s.length()//
        System.out.println(s.length());     //Length of a string//

        //Concat Method concat()//
        System.out.println(s.concat(s1));       //Joining of stings//

        s="                           arya                  ";
        //TRIM Method - trim() - will left or right spaces
        System.out.println("Before Trimming: " +s);
        System.out.println("After Trimming: " +s.trim());

        //charAt() -- Character present at that Index No. --> s.charAT(3)
        s="arya";
        System.out.println(s.charAt(2));

        //contains() -- search the sequence of characters in string and returns true if sequence of char values are found
        //contains() method will give True or False
        //s.contains("Wel")
        s="Welcome";
        System.out.println(s.contains("Wel"));
        System.out.println(s.contains("wel"));
        System.out.println(s.contains("come"));


        //equals() -- compares two given strings based on content of the string. if any character is not matched it returns false//
        //s.equals()
        s="welcome";
        s1="welcome";
        System.out.println(s.equals(s1));       //true
        System.out.println(s.equals("Welcome"));//false
        System.out.println(s.equals("Wel come"));//false

        //equalsIgnoreCase()  -- compares strings but is not case-sensitive//
        System.out.println(s.equalsIgnoreCase("Welcome"));//true


        //replace() - replace old char or char sequence with new characters//
        //Method s.replace() - replacing of characters or sequence of characters
        //replace a character
        s="Welcome to Java";
        System.out.println(s.replace('o','Z'));

        //replace a string//
        System.out.println(s.replace("Java","Selenium"));   //Welcome to Selenium


        //SubString Method substring() - returns substring of a string based on starting index and ending index
        //substring()  -counting -  Starting Index will start from 0 whereas Ending Index will start from 1
        System.out.println(s.substring(11,15));      //to

        //toLowerCase() - converting to lower case
        s="ZOO";
        System.out.println(s.toLowerCase());        //zoo

        //toUpperCase() - converting to upper case
        s="zoo";
        System.out.println(s.toUpperCase());        //ZOO


    }
}
