package HackersRankJavaQPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class OutputFormatting02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        System.out.println("============================");
        for (int i=0; i<3; i++){
            String S1 = scanner.next();
            int I1 = scanner.nextInt();
            String formatted = String.format("%-15s%03d", S1, I1);
            array.add(formatted);
        }
        for (int i=0; i<3; i++){
            String si = array.get(i);
            System.out.println(si);
        }
        System.out.println("============================");
    }
}
