package DuringTheInterview.CaterpilarInterview.InterviewJAVACodingQs;

import java.util.Scanner;

public class FnameLname002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();

        String output = "";

        int i1 = firstname.length();
        int i2 = lastname.length();

        if (i1==0 && i2==0){
            output = "No String Entered";
        }
        else if (i1!=0 && i2==0){
            output = firstname;
        }
        else if (i1==0 && i2!=0){
            output = lastname;
        }
        else
        {
            output = firstname + lastname;
        }
        System.out.println(output);
    }
}
