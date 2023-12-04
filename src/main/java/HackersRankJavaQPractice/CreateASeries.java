package HackersRankJavaQPractice;

import java.io.*;
import java.util.*;

public class CreateASeries {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            bufferedReader.close();

        double a1 = Double.parseDouble(bufferedReader.readLine().trim());
        double b1 = Double.parseDouble(bufferedReader.readLine().trim());
        double n1 = Double.parseDouble(bufferedReader.readLine().trim());
//        double a2 = Double.parseDouble(bufferedReader.readLine().trim());
//        double b2 = Double.parseDouble(bufferedReader.readLine().trim());
//        double n2 = Double.parseDouble(bufferedReader.readLine().trim());

                for (n1 = 1; n1 <= 10; n1++) {
                    double output = (a1 + b1 * (Math.pow(2, n1 - 1)));
                    System.out.println(output);
                    a1 = output;
                }





//                for (n2 = 1; n2 <= 5; n2++) {
//                    double output = (a2 + b2 * (Math.pow(2, n2 - 1)));
//                    System.out.println(output);
//                    a2 = output;
//                }





    }
}

