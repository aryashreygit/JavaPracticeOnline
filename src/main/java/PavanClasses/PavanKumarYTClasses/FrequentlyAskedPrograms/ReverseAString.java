package PavanClasses.PavanKumarYTClasses.FrequentlyAskedPrograms;

public class ReverseAString {
    public static void main(String[] args){

        //1 - Using String Concatenation - length of String, extract last character, concatenate the next char
        //2 String Method - String Length and Concatenate

        String str ="ABCDE";
        String rev = "";            //Empty String
//
//
//        int j=str.length();
//
//        for (int i=0; i<=(j-1); i++)
//        {
//            rev = rev + str.charAt(j-1-i);
//        }

//        int len=str.length();       //4
//        for (int i=len-1; i>=0;i--)
//        {
//            rev=rev+str.charAt(i);
//        }

        //2nd Logic - using CHARACTER ARRAY
//        char a[] = str.toCharArray();
//        int leng = a.length;           //4
//        for(int i=(leng-1); i>=0; i--)
//        {
//            rev=rev+a[i];
//        }

        //3rd Logic - Using String Buffer Class
        StringBuffer sb = new StringBuffer(str);
        rev = rev+sb.reverse();

        System.out.println("Reversed String: " + rev);
    }
}
