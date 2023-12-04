package HackersRankJavaQPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

//        Scanner n = new Scanner(System.in);
//        String input;
//        int counter=0;
//        input = n.nextLine();
//        while (input!= null){
//            char[] charInput = input.toCharArray();
//            for (int i=0; i<input.length(); i++) {
//                if (charInput[i] == '"') {
//                    if (counter % 2 == 0) {
//                        System.out.print("''");
//                    } else {
//                        System.out.print("''");
//                    }
//                    counter++;
//                } else {
//                    System.out.print(charInput[i]);
//                }
//            }
//             System.out.print("\n");
//            input=n.nextLine();
//            }
//        }
//==================New Approach=====================
        Scanner n = new Scanner(System.in);
        int counter=1;
        while (n.hasNext()){
            System.out.println(counter++ +" "+ n.nextLine());
        }

    }

}

