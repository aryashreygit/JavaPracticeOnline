package HackersRankJavaQPractice;

import java.util.Scanner;

public class OutputFormattingSolution01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("================================");
        for (int i=0; i<3; i++){
            System.out.println("================================");
            String s1 = scanner.next();
            int x = scanner.nextInt();
            //Output//
            System.out.printf("%-15s%03d", s1, x);
            System.out.println();
        }
        System.out.println("================================");

    }
}
