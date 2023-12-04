package HackersRankJavaQPractice;

import java.io.*;
import java.util.*;

public class OutputFormattingStringAndInt {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //String input1 = bufferedReader.readLine();
        String leftJustified1 = String.format("%-15s", bufferedReader.readLine());
        String formattedNo1 = String.format("%03d", Integer.parseInt(bufferedReader.readLine()));

        String leftJustified2 = String.format("%-15s", bufferedReader.readLine());
        String formattedNo2 = String.format("%03d", Integer.parseInt(bufferedReader.readLine()));

        //int I1 = Integer.parseInt(bufferedReader.readLine());
        String leftJustified3 = String.format("%-15s", bufferedReader.readLine());
        String formattedNo3 = String.format("%03d", Integer.parseInt(bufferedReader.readLine()));

        bufferedReader.close();

        System.out.println("================================");
        System.out.println(leftJustified1+formattedNo1);
        System.out.println(leftJustified2+formattedNo2);
        System.out.println(leftJustified3+formattedNo3);
        System.out.println("================================");

    }
}
