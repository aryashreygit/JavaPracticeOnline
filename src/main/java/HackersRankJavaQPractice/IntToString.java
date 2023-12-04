package HackersRankJavaQPractice;

import java.util.Scanner;

public class IntToString {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String s = Integer.toString(N);
        if (N>=-100 && N<=100) {
            System.out.println("Good job");
        }
//        else
//        {
//            System.out.println("Wrong answer");
//
//        }

    }
}
