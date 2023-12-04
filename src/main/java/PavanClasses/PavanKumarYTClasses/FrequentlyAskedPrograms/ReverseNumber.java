package PavanClasses.PavanKumarYTClasses.FrequentlyAskedPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();         //1234

        //1st Logic - Using Algorithm
//        int rev=0;
//        while(num!=0)
//        {
//            rev=rev*10 + num%10;
//            num = num/10;
//        }
//        System.out.println("1st Logic - Reverse Num: " +rev);

        //2nd Logic - String buffer class method - Reverse String logic
//        StringBuffer rev;
//        StringBuffer sb=new StringBuffer(String.valueOf(num));
//        rev=sb.reverse();
//        System.out.println("Reverse of Number using StringBuffer & string.valueof(num): " +rev);

        //3rd Logic - String Builder Class - we have reverse method//
        StringBuilder sb1=new StringBuilder();
        sb1.append(num);
        StringBuilder rev = sb1.reverse();
        System.out.println("Reverse of Number using StringbUilder & append: " +rev);


    }
}
