package HackersRankJavaQPractice;

import java.util.Scanner;

public class StaticInitializerBlock {

    public static void main(String[] args) {
//        Scanner B = new Scanner(System.in);
//        Scanner H = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println(B * H);
        }
    }

}
