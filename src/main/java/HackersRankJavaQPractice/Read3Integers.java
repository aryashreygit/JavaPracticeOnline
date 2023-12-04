package HackersRankJavaQPractice;

import java.io.*;
import java.util.*;

public class Read3Integers {
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N1 = Integer.parseInt(bufferedReader.readLine().trim());
        int N2 = Integer.parseInt(bufferedReader.readLine().trim());
        int N3 = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        System.out.println("First no. entered = " + N1);
        System.out.println("Second no. entered = " +N2);
        System.out.println("Third no. entered = " +N3);
    }
}
