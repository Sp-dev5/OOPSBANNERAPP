/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each
 * line of the banner. This further enhances code readability and maintainability.
 *
 * @author Developer
 * @version 5.0
 */

// Extend the user story 4 to further develop the OOPS Banner Application by
// not only using string arrays to hold banner lines and printing them in a
// loop. But also by defining and populating the array in a more concise way
// at the time of declaration using String.join() method to create each line
// of the banner.

public class OOPSBannerApp {
    /**
     * Main method to run the banner display
     */
    public static void main(String[] args) {
        // Define String array variable to hold the OOPS banner lines
        // Using inline array initialization with String.join() method calls
        // to construct each banner line in a single statement
        String[] lines = {
                String.join("", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "O", " ", "*", " ", "*"),
                String.join("", "*", " ", "O", " ", "*", " ", "*"),
                String.join("", "*", " ", "P", " ", "*", " ", "*"),
                String.join("", "*", " ", "P", " ", "*", " ", "*"),
                String.join("", "*", " ", "S", " ", "*", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        // Use a for-each loop to iterate through the array
        // and print each line of the visual effect for the message "OOPS"
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
