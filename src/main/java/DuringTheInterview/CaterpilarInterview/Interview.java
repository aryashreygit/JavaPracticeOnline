package DuringTheInterview.CaterpilarInterview;
//Write a program to determine anagrams
//Example - Listen and Silent are anagrams but dad and bad are not
public class Interview {

    public static void main(String[] args) {

        String s1 = "lisen";
        String s2 = "silent";

        int s1length = s1.length();
        int s2length = s2.length();

        int k = 0;


        for (int i = 0; i <= (s1length - 1); i++) {
            for (int j = 0; j <= (s2length - 1); j++) {
                if (s2.charAt(j) == s1.charAt(i)) {
                    k++;
                }

            }
        }

        if (k == s1length && s1length==s2length)
        {
            System.out.println("an anagrams");
        }
        else
        {
            System.out.println("Not an anagrams");
        }
    }
}
