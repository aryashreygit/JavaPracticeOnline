package HackersRankJavaQPractice;

import java.util.Scanner;

public class IfElse {

    public static void main (String[] arg){
        //Scanner scanner = new Scanner(System.in);
        //scanner.nextInt();
        int marks = 48;
        char grade;
        if (marks >= 85 && marks <=100) {
            grade = 'A';
        }
            else if (marks >=70 && marks <85)
                grade = 'B';
            else if(marks>=50 && marks <70)
                grade ='C';
            else if (marks >=35 && marks <50)
                grade = 'D';
            else grade = 'F';

        System.out.println("Your Grade is " + grade);
    }

}
