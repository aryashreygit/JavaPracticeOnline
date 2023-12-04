package DuringTheInterview.CaterpilarInterview.InterviewJAVACodingQs;

import java.util.Scanner;

public class FirstNameLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();

        String output ="";

        if (firstname.isBlank() && lastname.isBlank()) {
            output = "No String Entered";
        }
        else if (!firstname.isBlank() && lastname.isBlank()){
            output = firstname;
        }
        else if (firstname.isBlank() && !lastname.isBlank()){
            output = lastname;
        }
        else {
            output = firstname + lastname;
        }
        System.out.println("Output: " + output);
    }
}





