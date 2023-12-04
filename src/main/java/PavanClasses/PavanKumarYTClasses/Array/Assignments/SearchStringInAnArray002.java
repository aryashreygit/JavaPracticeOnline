package PavanClasses.PavanKumarYTClasses.Array.Assignments;

public class SearchStringInAnArray002 {



        public static void main(String[] args) {
            // Sample array of strings
            String[] stringArray = {"apple", "banana", "orange", "grape", "kiwi"};

            // String to search for
            String searchString = "orange";

            // Call the method to search for the string
            boolean found = searchStringInArray(stringArray, searchString);

            // Display the result
            if (found) {
                System.out.println("The string '" + searchString + "' is found in the array.");
            } else {
                System.out.println("The string '" + searchString + "' is not found in the array.");
            }
        }

        // Method to search for a string in an array
        private static boolean searchStringInArray(String[] array, String searchString) {
            for (String str : array) {
                if (str.equals(searchString)) {
                    return true; // String found
                }
            }
            return false; // String not found
        }
    }


