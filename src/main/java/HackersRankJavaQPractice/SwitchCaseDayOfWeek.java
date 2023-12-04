package HackersRankJavaQPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SwitchCaseDayOfWeek {

    public static void main (String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
      int day = scanner.nextInt();

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int day = Integer.parseInt(bufferedReader.readLine().trim());

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Choice");
        }
    }
}
