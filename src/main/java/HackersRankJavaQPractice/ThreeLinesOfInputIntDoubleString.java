package HackersRankJavaQPractice;
import java.io.*;
import java.util.*;

public class ThreeLinesOfInputIntDoubleString {
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int I = Integer.parseInt(bufferedReader.readLine());//.trim());     //It works with and without trim
        double D = Double.parseDouble(bufferedReader.readLine().trim());
        String S = bufferedReader.readLine(); //.trim();

        bufferedReader.close();

        System.out.println("String: " + S);
        System.out.println("Double: " + D);
        System.out.println("Int: " + I);
    }

}
